package se.budohoor.economics.pos2books.model;

import java.util.ArrayList;

import java.util.List;

import se.budohoor.economics.pos2books.settings.TxAuditLog;

public class BookEntries {
    private ArrayList<BookEntry> bookEntries;
    private ArrayList<TxAuditLog> auditLogs;
    
    public BookEntries() {
        super();
        bookEntries = new ArrayList<BookEntry>();
        auditLogs = new ArrayList<TxAuditLog>();
    }
    
    public void addBookEntry(BookEntry entry) {
        bookEntries.add(entry);
    }
    
    public void addAuditLog(TxAuditLog txAuditLog) {
        auditLogs.add(txAuditLog);
    }
    
    public List<BookEntry> getBookEntries() {
        return bookEntries;
    }
}
