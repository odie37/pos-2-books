package se.budohoor.economics.pos2books.model;

import java.util.Date;

import se.budohoor.economics.pos2books.plugins.pos.ringitup.ExpenseItem;

public interface TxExpense extends TxGeneric {

    public String getExpenseName();
    
    public String getExpenseCategory();

}
