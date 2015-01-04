package se.budohoor.economics.pos2books.plugins.pos.ringitup;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

import se.budohoor.economics.pos2books.model.BookEntry;
import se.budohoor.economics.pos2books.model.CashBookEntry;
import se.budohoor.economics.pos2books.model.TxExpense;
import se.budohoor.economics.pos2books.model.TxLogStatus;
import se.budohoor.economics.pos2books.model.TxType;
import se.budohoor.economics.pos2books.settings.AccountMapTool;
import se.budohoor.economics.pos2books.settings.Settings;
import se.budohoor.economics.pos2books.tool.UI;


public class TxExpenseImpl implements TxExpense {
    private static final Logger log = Logger.getLogger(TxExpenseImpl.class.getName());
    private ExpenseItem exp;
    private ArrayList<BookEntry> entries;

    public TxExpenseImpl() {
        super();
        entries = new ArrayList<BookEntry>();
    }
    
    public TxExpenseImpl(ExpenseItem expenseItem) {
        this();
        exp = expenseItem;
    }
    
    public String getTxId() {
        return "" + exp.getExpenseItemId();
    }
    
    public String getPosReference() {
        return exp.getExpenseName().trim();
    }
    
    public String getExpenseName() {
        return exp.getExpenseName();
    }
    
    public String getExpenseCategory() {
        return exp.getCategory().getCategoryName();
    }

    @Override
    public Date getTxDate() {
        return exp.getDateOfExpense();
    }

    @Override
    public Double getTxAmount() {
        return exp.getExpenseCost();
    }

    @Override
    public String getTxDescription() {
        return exp.getExpenseDescription();
    }

    @Override
    public TxType getTxType() {
        return TxType.EXPENSE;
    }

    @Override
    public BookEntry[] translate(boolean forceCompleteEntries) {
        CashBookEntry mainEntry = new CashBookEntry();
        mainEntry.addTx(this);
        mainEntry.setBookDate(exp.getDateOfExpense());
        mainEntry.setAmount(-exp.getExpenseCost());
        mainEntry.setPrimaryAccount(Settings.getInstance().getPettyCashAccount());
        mainEntry.setText(getCategoryName() + " [" + exp.getExpenseName() + "]: " + exp.getExpenseDescription());
        Integer accountNo = AccountMapTool.getInstance().getAccountByItemCategory(getCategoryName());
        if (accountNo != null && (accountNo == 0 || accountNo == 9999) && forceCompleteEntries) {
            //accountNo = UI.queryAccountForExpense(exp);
            accountNo = 9999;
        }
        mainEntry.setSecondaryAccount(accountNo);
        Settings.getInstance().auditLog(mainEntry, TxLogStatus.TRANSLATED, null);
        CashBookEntry[] result = { mainEntry };
        return result;
    }

    @Override
    public void log() {
        log.info("TxType: " + getTxType() + " expId: "+ exp.getExpenseItemId() + " name: " + exp.getExpenseName() + 
                 " date: " + exp.getDateOfExpense() + " cost: " + exp.getExpenseCost() + " category:" + getCategoryName() + ", description: " + exp.getExpenseDescription());
    }

    @Override
    public BookEntry[] getBookEntries() {
        return entries.toArray(new CashBookEntry[entries.size()]);
    }

    @Override
    public boolean hasIncompleteEntries() {
        if (entries.size() > 0) {
            for (BookEntry entry : entries) {
                if(!entry.isComplete()) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }
    
    private String getCategoryName() {
        Category cat = exp.getCategory();
        if (cat != null) {
            return cat.getCategoryName();
        } else {
            return "";
        }
    }
}
