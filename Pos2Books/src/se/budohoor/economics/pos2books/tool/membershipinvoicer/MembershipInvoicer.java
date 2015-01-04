package se.budohoor.economics.pos2books.tool.membershipinvoicer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.logging.Logger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.ws.BindingProvider;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import se.budohoor.economics.pos2books.plugins.books.economic.EconomicWebService;
import se.budohoor.economics.pos2books.plugins.books.economic.EconomicWebServiceSoap;


public class MembershipInvoicer {
    private static final int SKIP_ROWS = 6; //
    
    private static final int ECONOMIC_AGREEMENT_NR = Integer.parseInt(
            System.getProperty("invoicer.economic.agreementnr", "367621"));
    private static final String ECONOMIC_USER = System.getProperty("invoicer.economic.user", "mafr");
    private static final String ECONOMIC_PWD = System.getProperty("invoicer.economic.pwd", "M0ff3B0ff3");
    
    private static final Logger log = Logger.getLogger(MembershipInvoicer.class.getName());
    
    private String sourceFileName;
    private EconomicWebServiceSoap ews;
    
    public MembershipInvoicer(String sourceFileName) {
        super();
        this.sourceFileName = sourceFileName;
    }

    public static void main(String[] args) {
        try {
            MembershipInvoicer membershipInvoicer = new MembershipInvoicer(args[0]);
            membershipInvoicer.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void run() throws FileNotFoundException, IOException, InvalidFormatException,
                             DatatypeConfigurationException {
        ArrayList<Invoice> invoices = parseInvoices();
        ewsConnect();
        for (Invoice inv : invoices) {
            inv.sendToEconomic(ews);
        }
        ewsDisconnect();
    }
    
    private ArrayList<Invoice> parseInvoices() throws FileNotFoundException, InvalidFormatException, IOException {
        InputStream inp = new FileInputStream(sourceFileName);
        OPCPackage pkg = OPCPackage.open(inp);
        XSSFWorkbook wb = new XSSFWorkbook(pkg);
        XSSFSheet sheet = wb.getSheetAt(0);
        ArrayList<Invoice> invoices = new ArrayList<Invoice>();
        Invoice currentInvoice = null;
        int currentInvoiceNo = 0;
        for(int i = 0 + SKIP_ROWS; i <= sheet.getLastRowNum(); i++) {
            XSSFRow row = sheet.getRow(i);
            MemberData mData = new MemberData(row);
            //mData.log();
            if(mData.getInvoiceNumber() != currentInvoiceNo) {
                if (currentInvoice != null) {
                    invoices.add(currentInvoice);
                }
                currentInvoice = new Invoice(mData.getInvoiceNumber());
                currentInvoiceNo = mData.getInvoiceNumber();
                currentInvoice.setCustomer(new Customer(mData));
            }
            currentInvoice.addItem(mData);
        }
        if (currentInvoice != null) {
            invoices.add(currentInvoice);
        }

        return invoices;
    }
    
    private void ewsConnect() {
        EconomicWebService economicWebService = new EconomicWebService();
        ews = economicWebService.getEconomicWebServiceSoap12();
        ((BindingProvider)ews).getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY, true);
        ews.connect(ECONOMIC_AGREEMENT_NR, ECONOMIC_USER, ECONOMIC_PWD);
        log.info("Connected to e-conomic.se!");
    }

    private void ewsDisconnect() {
        ews.disconnect();
        log.info("Disconnected from e-conomic.se!");
    }
}
