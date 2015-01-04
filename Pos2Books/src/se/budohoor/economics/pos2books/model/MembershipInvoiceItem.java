package se.budohoor.economics.pos2books.model;

import java.math.BigDecimal;

import java.util.ArrayList;

import se.budohoor.economics.pos2books.plugins.books.economic.EconomicWebServiceSoap;
import se.budohoor.economics.pos2books.plugins.books.economic.types.CurrentInvoiceHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.CurrentInvoiceLineData;
import se.budohoor.economics.pos2books.plugins.books.economic.types.CurrentInvoiceLineHandle;
import se.budohoor.economics.pos2books.plugins.books.economic.types.ProductData;
import se.budohoor.economics.pos2books.plugins.books.economic.types.ProductHandle;

public class MembershipInvoiceItem extends InvoiceItem {
    private static final int YOUTH_AMOUNT = 350;
    private static final int ADULT_AMOUNT = 500;
    private static final int FAMILY_AMOUNT = 800;
    private static final int SENIOR_AMOUNT = 350;
    
    private int amount;
    private InvoiceItemType itemType;
    private ArrayList<MemberData> members = new ArrayList<MemberData>();
    
    public MembershipInvoiceItem() {
        super();
    }
    
    public MembershipInvoiceItem(MemberData mData) {
        super();
        this.amount = mData.getAmount();
        members.add(mData);
        if ((this.amount == YOUTH_AMOUNT) && (mData.getParent() != null)) {
            this.itemType = InvoiceItemType.YOUTH;
        } else if (this.amount == ADULT_AMOUNT) {
            this.itemType = InvoiceItemType.ADULT;
        } else if (this.amount == FAMILY_AMOUNT) {
            this.itemType = InvoiceItemType.FAMILY;
        } else if (this.amount == SENIOR_AMOUNT) {
            this.itemType = InvoiceItemType.SENIOR;
        }
    }
    
    public void sendToEconomics(EconomicWebServiceSoap ews, CurrentInvoiceHandle inv) {
        CurrentInvoiceLineHandle invLine = ews.currentInvoiceLineCreate(inv);
        CurrentInvoiceLineData lineData = ews.currentInvoiceLineGetData(invLine);
        ProductHandle product = ews.productFindByNumber(getMembershipProductNumber());
        ProductData productData = ews.productGetData(product);
        lineData.setProductHandle(product);
        lineData.setQuantity(new BigDecimal(1));
        StringBuffer description = new StringBuffer();
        description.append(productData.getName());
        for (MemberData member : members) {
            description.append("\r\n - " + member.getName() + " (Medlemsnr: " + member.getMembershipNumber() + ")");
        }
        lineData.setDescription(description.toString());
        lineData.setUnitHandle(productData.getUnitHandle());
        lineData.setUnitNetPrice(productData.getSalesPrice());
        ews.currentInvoiceLineUpdateFromData(lineData);
    }
    
    public ArrayList<MemberData> getMembers() {
        return members;
    }
    
    public void addMember(MemberData member) {
        members.add(member);
    }

    public void setItemType(MembershipInvoiceItem.InvoiceItemType itemType) {
        this.itemType = itemType;
    }

    public MembershipInvoiceItem.InvoiceItemType getItemType() {
        return itemType;
    }

    enum InvoiceItemType {
        YOUTH, ADULT, FAMILY, SENIOR
    }
    
    private String getMembershipProductNumber() {
        String nr = null;
        switch (itemType) {
        case YOUTH:
            nr = "10-0001";
            break;
        case ADULT:
            nr = "10-0002";
            break;
        case FAMILY:
            nr = "10-0003";
            break;
        case SENIOR:
            nr = "10-0004";
            break;
        }
        return nr;
    }
}