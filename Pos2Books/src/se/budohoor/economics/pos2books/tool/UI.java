package se.budohoor.economics.pos2books.tool;

import se.budohoor.economics.pos2books.plugins.pos.ringitup.CartItem;
import se.budohoor.economics.pos2books.plugins.pos.ringitup.ExpenseItem;

public class UI {
    private static final String ACCOUNT_QUERY_FORMAT = "Please enter account for the item: [%1$s]-%2$s: %3$s";
    
    public UI() {
        super();
    }
    
    public static Integer queryAccountForItem(CartItem item) {
        Integer accountNo = null;
        while (accountNo == null) {
            try {
                accountNo = new Integer(System.console().readLine(ACCOUNT_QUERY_FORMAT, 
                                                                  item.getCatalogItem().getCategory().getCategoryName(),
                                                                  item.getItemName(),
                                                                  item.getItemDescription()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return accountNo;
    }

    public static Integer queryAccountForExpense(ExpenseItem exp) {
        Integer accountNo = null;
        while (accountNo == null) {
            try {
                accountNo = new Integer(System.console().readLine(ACCOUNT_QUERY_FORMAT, 
                                                                  exp.getCategory().getCategoryName(),
                                                                  exp.getExpenseName(),
                                                                  exp.getExpenseDescription()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return accountNo;
    }
}
