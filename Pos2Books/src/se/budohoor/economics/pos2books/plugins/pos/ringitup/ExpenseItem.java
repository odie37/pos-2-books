package se.budohoor.economics.pos2books.plugins.pos.ringitup;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries( { @NamedQuery(name = "ExpenseItem.findAll", query = "select o from ExpenseItem o"),
                 @NamedQuery(name = "ExpenseItem.findAllExpensesAfterId", query = "select o from ExpenseItem o where o.expenseItemId > :expId")                 
                 })
@Table(name = "\"expense_items\"")
public class ExpenseItem implements Serializable {
    @Column(name = "date_of_expense")
    private float dateOfExpense;
    @Column(name = "expense_cost")
    private double expenseCost;
    @Column(name = "expense_description")
    private String expenseDescription;
    @Id
    @Column(name = "pk", nullable = false)
    private int expenseItemId;
    @Column(name = "expense_name")
    private String expenseName;
    @Column(name = "image_exists")
    private int imageExists;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "pk")
    private Category category;

    public ExpenseItem() {
    }

    public ExpenseItem(float dateOfExpense, double expenseCost, String expenseDescription,
                       int expenseItemId, String expenseName, int imageExists) {
        this.dateOfExpense = dateOfExpense;
        this.expenseCost = expenseCost;
        this.expenseDescription = expenseDescription;
        this.expenseItemId = expenseItemId;
        this.expenseName = expenseName;
        this.imageExists = imageExists;
    }


    public Date getDateOfExpense() {
        return new Date(new Double(dateOfExpense * 1000).longValue());
    }

    public void setDateOfExpense(Date dateOfExpense) {
        this.dateOfExpense = dateOfExpense.getTime()/1000;
    }

    public double getExpenseCost() {
        return expenseCost;
    }

    public void setExpenseCost(double expenseCost) {
        this.expenseCost = expenseCost;
    }

    public String getExpenseDescription() {
        return expenseDescription;
    }

    public void setExpenseDescription(String expenseDescription) {
        this.expenseDescription = expenseDescription;
    }

    public int getExpenseItemId() {
        return expenseItemId;
    }

    public void setExpenseItemId(int expenseItemId) {
        this.expenseItemId = expenseItemId;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public int getImageExists() {
        return imageExists;
    }

    public void setImageExists(int imageExists) {
        this.imageExists = imageExists;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("dateOfExpense=");
        buffer.append(getDateOfExpense());
        buffer.append(',');
        buffer.append("expenseCost=");
        buffer.append(getExpenseCost());
        buffer.append(',');
        buffer.append("expenseDescription=");
        buffer.append(getExpenseDescription());
        buffer.append(',');
        buffer.append("expenseItemId=");
        buffer.append(getExpenseItemId());
        buffer.append(',');
        buffer.append("expenseName=");
        buffer.append(getExpenseName());
        buffer.append(',');
        buffer.append("imageExists=");
        buffer.append(getImageExists());
        buffer.append(']');
        return buffer.toString();
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
