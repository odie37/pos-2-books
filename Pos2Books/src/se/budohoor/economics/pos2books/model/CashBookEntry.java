package se.budohoor.economics.pos2books.model;

import java.util.Date;
import java.util.logging.Logger;

import se.budohoor.economics.pos2books.settings.AccountMapTool;

public class CashBookEntry extends BookEntry {
    private static final Logger log = Logger.getLogger(AccountMapTool.class.getName());

    private Date bookDate;
    private String text;
    private Double amount;
    private Integer primaryAccount;
    private Integer secondaryAccount;
    
    public CashBookEntry(){
        super();
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    public Date getBookDate() {
        return bookDate;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setPrimaryAccount(Integer primaryAccount) {
        this.primaryAccount = primaryAccount;
    }

    public Integer getPrimaryAccount() {
        return primaryAccount;
    }

    public void setSecondaryAccount(Integer secondaryAccount) {
        this.secondaryAccount = secondaryAccount;
    }

    public Integer getSecondaryAccount() {
        return secondaryAccount;
    }
    
    public void log() {
        StringBuffer logEntry = new StringBuffer();
        logEntry.append("Date: " + bookDate);
        logEntry.append(", Amount: " + amount);
        if(primaryAccount != null) {
            logEntry.append(", PriAcct: " + primaryAccount);
        }
        if(secondaryAccount != null) {
            logEntry.append(", SecAcct: " + secondaryAccount);
        }
        logEntry.append(", Text: " + text);
        log.info(logEntry.toString());
    }

    @Override
    public boolean isComplete() {
        if (bookDate == null) return false;
        if (text == null) return false;
        if (amount == null) return false;
        if (primaryAccount == null||primaryAccount == 0||primaryAccount == 9999) return false;
        if (secondaryAccount != null&&(secondaryAccount == 0||secondaryAccount == 9999)) return false;
        return true;
    }
}
