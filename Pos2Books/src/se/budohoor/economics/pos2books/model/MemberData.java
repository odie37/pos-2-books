package se.budohoor.economics.pos2books.model;

import java.util.logging.Logger;

import org.apache.poi.xssf.usermodel.XSSFRow;

public class MemberData {
    private static final int MEMBER_NR_COL = 3;
    private static final int MEMBER_NAME_COL = 4;
    private static final int EMAIL_COL = 5;
    private static final int ADDRESS_COL = 6;
    private static final int ZIP_COL = 7;
    private static final int CITY_COL = 8;
    private static final int PARENT_COL = 9;
    private static final int AMOUNT_COL = 10;
    private static final int INVOICE_NR_COL = 11;
    
    private static Logger log = Logger.getLogger(MemberData.class.getName());
    
    private int membershipNumber;
    private String name;
    private String email;
    private String address;
    private String zipCode;
    private String city;
    private String parent;
    private Integer amount;
    private int invoiceNumber;
    
    public MemberData(XSSFRow dataRow) {
        super();
        log.info("Parsing member data...");
        membershipNumber = Integer.parseInt(dataRow.getCell(MEMBER_NR_COL).getRawValue());
        name = dataRow.getCell(MEMBER_NAME_COL).getStringCellValue().replace("*", "").trim();
        email = dataRow.getCell(EMAIL_COL).getStringCellValue().trim();
        address = dataRow.getCell(ADDRESS_COL).getStringCellValue().trim();
        zipCode = dataRow.getCell(ZIP_COL).getStringCellValue().trim().replace(" ", "").replace("S-", "");
        city = dataRow.getCell(CITY_COL).getStringCellValue().trim();
        parent = dataRow.getCell(PARENT_COL).getStringCellValue().trim();
        if (parent.equals("-")) {
            parent = null;
        }
        try {
            amount = Integer.parseInt(dataRow.getCell(AMOUNT_COL).getStringCellValue().replaceAll("kr", "").trim());
        } catch (NumberFormatException nfe) {
            amount = null;
        }
        invoiceNumber = Integer.parseInt(dataRow.getCell(INVOICE_NR_COL).getRawValue());
        log.info("Member data parsed: No[" + membershipNumber + "], Name[" + name + "]");                                                                                        
    }
    
    public void log() {
        StringBuffer sbuf = new StringBuffer();
        sbuf.append("MemberData[\r\n");
        sbuf.append("\tMemberNo = " + membershipNumber + "\r\n");
        sbuf.append("\tName = " + name + "\r\n");
        sbuf.append("\tEmail = " + email + "\r\n");
        sbuf.append("\tAddress = " + address + "\r\n");
        sbuf.append("\tZip = " + zipCode + "\r\n");
        sbuf.append("\tCity = " + city + "\r\n");
        sbuf.append("\tParent = " + parent + "\r\n");
        sbuf.append("\tAmount = " + amount + "\r\n");
        sbuf.append("\tInvoiceNo = " + invoiceNumber + "\r\n");
        sbuf.append("]");
        log.info(sbuf.toString());
    }

    public int getMembershipNumber() {
        return membershipNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getParent() {
        return parent;
    }

    public Integer getAmount() {
        return amount;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getCity() {
        return city;
    }
}
