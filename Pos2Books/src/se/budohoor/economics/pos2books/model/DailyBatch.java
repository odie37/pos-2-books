package se.budohoor.economics.pos2books.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

import java.util.List;

import se.budohoor.economics.pos2books.settings.AccountMapTool;
import se.budohoor.economics.pos2books.settings.Settings;
import se.budohoor.economics.pos2books.settings.TxAuditLog;

public class DailyBatch {
    private int year;
    private int month;
    private int day;
    private ArrayList<TxCashSale> batch;
    private HashMap<String,BatchCategory> categories;
    
    public DailyBatch() {
        super();
        batch = new ArrayList<TxCashSale>();
        categories = new HashMap<String,BatchCategory>();
    }
    
    public boolean addTx(TxGeneric tx) {
        if(tx.getTxType() == TxType.CASH_SALE) {
            if(year == 0) {
                Calendar cal = new GregorianCalendar();
                cal.setTime(tx.getTxDate());
                year = cal.get(Calendar.YEAR);
                month = cal.get(Calendar.MONTH);
                day = cal.get(Calendar.DAY_OF_MONTH);
                addToBatch(tx);
                return true;
            } else {
                if(isSameDay(tx)) {
                    addToBatch(tx);
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }
    
    public BookEntry[] translate() {
        double dailyTotal = 0;
        ArrayList<BookEntry> entries = new ArrayList<BookEntry>();
        for(BatchCategory category : categories.values()) {
            CashBookEntry entry = new CashBookEntry();
            entry.setAmount(-category.getTotalAmount());
            entry.setBookDate(getBatchDate());
            entry.setPrimaryAccount(AccountMapTool.getInstance().getAccountByItemCategory(category.getName()));
            entry.setText(category.getName() + " - " + category.getItems() + "st");
            entries.add(entry);
            dailyTotal += category.getTotalAmount();
        }
        CashBookEntry daySummary = new CashBookEntry();
        daySummary.setAmount(dailyTotal);
        daySummary.setBookDate(getBatchDate());
        daySummary.setPrimaryAccount(Settings.getInstance().getPettyCashAccount());
        daySummary.setText("Dagsresultat - Kvitton: " + getReceipts());
        List<TxGeneric> genericBatch = getGenericBatch();
        daySummary.addTxList(genericBatch);
        entries.add(daySummary);
        Settings.getInstance().auditLog(genericBatch, TxLogStatus.TRANSLATED, null);
        return entries.toArray(new BookEntry[entries.size()]);
    }
    
    public String getBatchDay() {
        return "" + year + "-" + month + "-" + day;
    }
    
    private boolean isSameDay(TxGeneric tx) {
        Calendar cal = new GregorianCalendar();
        cal.setTime(tx.getTxDate());
        if(year == cal.get(Calendar.YEAR)) {
            if(month == cal.get(Calendar.MONTH)) {
                if(day == cal.get(Calendar.DAY_OF_MONTH)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private void addToBatch(TxGeneric tx) {
        TxCashSale sale = (TxCashSale) tx;
        batch.add(sale);
        sale.categorizeSale(categories);
    }


    private Date getBatchDate() {
        Calendar cal = new GregorianCalendar(year, month, day);
        return cal.getTime();
    }

    private String getReceipts() {
        StringBuffer result = new StringBuffer();
        for(TxCashSale sale : batch) {
            result.append(sale.getReceiptId() + ",");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
    
    private List<TxGeneric> getGenericBatch() {
        ArrayList<TxGeneric> genericBatch = new ArrayList<TxGeneric>();
        for (TxCashSale sale : batch) {
            genericBatch.add(sale);
        }
        return genericBatch;
    }
}
