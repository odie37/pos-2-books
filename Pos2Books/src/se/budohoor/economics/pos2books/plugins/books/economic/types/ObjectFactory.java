
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.budohoor.economics.pos2books.plugins.books.economic.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmployeeDataCutoffDate_QNAME = new QName("http://e-conomic.com", "CutoffDate");
    private final static QName _EmployeeDataCostPriceBefore_QNAME = new QName("http://e-conomic.com", "CostPriceBefore");
    private final static QName _EmployeeDataSalesPrice_QNAME = new QName("http://e-conomic.com", "SalesPrice");
    private final static QName _EmployeeDataCostPriceAfter_QNAME = new QName("http://e-conomic.com", "CostPriceAfter");
    private final static QName _EmployeeDataCostPrice_QNAME = new QName("http://e-conomic.com", "CostPrice");
    private final static QName _EmployeeDataSalesPriceAfter_QNAME = new QName("http://e-conomic.com", "SalesPriceAfter");
    private final static QName _EmployeeDataSalesPriceBefore_QNAME = new QName("http://e-conomic.com", "SalesPriceBefore");
    private final static QName _DebtorDataCreditMaximum_QNAME = new QName("http://e-conomic.com", "CreditMaximum");
    private final static QName _ProductDataOnOrder_QNAME = new QName("http://e-conomic.com", "OnOrder");
    private final static QName _ProductDataInStock_QNAME = new QName("http://e-conomic.com", "InStock");
    private final static QName _ProductDataAvailable_QNAME = new QName("http://e-conomic.com", "Available");
    private final static QName _ProductDataOrdered_QNAME = new QName("http://e-conomic.com", "Ordered");
    private final static QName _CashBookEntryDataDueDate_QNAME = new QName("http://e-conomic.com", "DueDate");
    private final static QName _CashBookEntryDataStartDate_QNAME = new QName("http://e-conomic.com", "StartDate");
    private final static QName _CashBookEntryDataEndDate_QNAME = new QName("http://e-conomic.com", "EndDate");
    private final static QName _CashBookEntryDataDebtorInvoiceNumber_QNAME = new QName("http://e-conomic.com", "DebtorInvoiceNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.budohoor.economics.pos2books.plugins.books.economic.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DebtorGetTermOfPayment }
     * 
     */
    public DebtorGetTermOfPayment createDebtorGetTermOfPayment() {
        return new DebtorGetTermOfPayment();
    }

    /**
     * Create an instance of {@link DebtorHandle }
     * 
     */
    public DebtorHandle createDebtorHandle() {
        return new DebtorHandle();
    }

    /**
     * Create an instance of {@link QuotationSetDeliveryCity }
     * 
     */
    public QuotationSetDeliveryCity createQuotationSetDeliveryCity() {
        return new QuotationSetDeliveryCity();
    }

    /**
     * Create an instance of {@link QuotationHandle }
     * 
     */
    public QuotationHandle createQuotationHandle() {
        return new QuotationHandle();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDeliveryPostalCodeResponse }
     * 
     */
    public CurrentInvoiceGetDeliveryPostalCodeResponse createCurrentInvoiceGetDeliveryPostalCodeResponse() {
        return new CurrentInvoiceGetDeliveryPostalCodeResponse();
    }

    /**
     * Create an instance of {@link OrderFindByDateIntervalResponse }
     * 
     */
    public OrderFindByDateIntervalResponse createOrderFindByDateIntervalResponse() {
        return new OrderFindByDateIntervalResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOrderHandle }
     * 
     */
    public ArrayOfOrderHandle createArrayOfOrderHandle() {
        return new ArrayOfOrderHandle();
    }

    /**
     * Create an instance of {@link AccountingYearGetToDate }
     * 
     */
    public AccountingYearGetToDate createAccountingYearGetToDate() {
        return new AccountingYearGetToDate();
    }

    /**
     * Create an instance of {@link AccountingYearHandle }
     * 
     */
    public AccountingYearHandle createAccountingYearHandle() {
        return new AccountingYearHandle();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetDistributionInPercent2Response }
     * 
     */
    public TermOfPaymentGetDistributionInPercent2Response createTermOfPaymentGetDistributionInPercent2Response() {
        return new TermOfPaymentGetDistributionInPercent2Response();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetData }
     * 
     */
    public DeliveryLocationGetData createDeliveryLocationGetData() {
        return new DeliveryLocationGetData();
    }

    /**
     * Create an instance of {@link DeliveryLocationHandle }
     * 
     */
    public DeliveryLocationHandle createDeliveryLocationHandle() {
        return new DeliveryLocationHandle();
    }

    /**
     * Create an instance of {@link EmployeeGroupGetData }
     * 
     */
    public EmployeeGroupGetData createEmployeeGroupGetData() {
        return new EmployeeGroupGetData();
    }

    /**
     * Create an instance of {@link EmployeeGroupHandle }
     * 
     */
    public EmployeeGroupHandle createEmployeeGroupHandle() {
        return new EmployeeGroupHandle();
    }

    /**
     * Create an instance of {@link ProductGetDepartment }
     * 
     */
    public ProductGetDepartment createProductGetDepartment() {
        return new ProductGetDepartment();
    }

    /**
     * Create an instance of {@link ProductHandle }
     * 
     */
    public ProductHandle createProductHandle() {
        return new ProductHandle();
    }

    /**
     * Create an instance of {@link ActivityGetDataArrayResponse }
     * 
     */
    public ActivityGetDataArrayResponse createActivityGetDataArrayResponse() {
        return new ActivityGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfActivityData }
     * 
     */
    public ArrayOfActivityData createArrayOfActivityData() {
        return new ArrayOfActivityData();
    }

    /**
     * Create an instance of {@link ProductSetVolume }
     * 
     */
    public ProductSetVolume createProductSetVolume() {
        return new ProductSetVolume();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategorySetNameResponse }
     * 
     */
    public DocumentArchiveCategorySetNameResponse createDocumentArchiveCategorySetNameResponse() {
        return new DocumentArchiveCategorySetNameResponse();
    }

    /**
     * Create an instance of {@link SubscriberSetComments }
     * 
     */
    public SubscriberSetComments createSubscriberSetComments() {
        return new SubscriberSetComments();
    }

    /**
     * Create an instance of {@link SubscriberHandle }
     * 
     */
    public SubscriberHandle createSubscriberHandle() {
        return new SubscriberHandle();
    }

    /**
     * Create an instance of {@link CreditorFindByName }
     * 
     */
    public CreditorFindByName createCreditorFindByName() {
        return new CreditorFindByName();
    }

    /**
     * Create an instance of {@link SubscriberSetExtraTextForInvoiceResponse }
     * 
     */
    public SubscriberSetExtraTextForInvoiceResponse createSubscriberSetExtraTextForInvoiceResponse() {
        return new SubscriberSetExtraTextForInvoiceResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetMarginAsPercent }
     * 
     */
    public CurrentInvoiceGetMarginAsPercent createCurrentInvoiceGetMarginAsPercent() {
        return new CurrentInvoiceGetMarginAsPercent();
    }

    /**
     * Create an instance of {@link CurrentInvoiceHandle }
     * 
     */
    public CurrentInvoiceHandle createCurrentInvoiceHandle() {
        return new CurrentInvoiceHandle();
    }

    /**
     * Create an instance of {@link AccountGetEntriesByDateResponse }
     * 
     */
    public AccountGetEntriesByDateResponse createAccountGetEntriesByDateResponse() {
        return new AccountGetEntriesByDateResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEntryHandle }
     * 
     */
    public ArrayOfEntryHandle createArrayOfEntryHandle() {
        return new ArrayOfEntryHandle();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetDataResponse }
     * 
     */
    public ScannedDocumentGetDataResponse createScannedDocumentGetDataResponse() {
        return new ScannedDocumentGetDataResponse();
    }

    /**
     * Create an instance of {@link ScannedDocumentData }
     * 
     */
    public ScannedDocumentData createScannedDocumentData() {
        return new ScannedDocumentData();
    }

    /**
     * Create an instance of {@link DebtorEntryMatchEntries }
     * 
     */
    public DebtorEntryMatchEntries createDebtorEntryMatchEntries() {
        return new DebtorEntryMatchEntries();
    }

    /**
     * Create an instance of {@link ArrayOfDebtorEntryHandle }
     * 
     */
    public ArrayOfDebtorEntryHandle createArrayOfDebtorEntryHandle() {
        return new ArrayOfDebtorEntryHandle();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetLinesResponse }
     * 
     */
    public CurrentInvoiceGetLinesResponse createCurrentInvoiceGetLinesResponse() {
        return new CurrentInvoiceGetLinesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCurrentInvoiceLineHandle }
     * 
     */
    public ArrayOfCurrentInvoiceLineHandle createArrayOfCurrentInvoiceLineHandle() {
        return new ArrayOfCurrentInvoiceLineHandle();
    }

    /**
     * Create an instance of {@link EntryGetDepartment }
     * 
     */
    public EntryGetDepartment createEntryGetDepartment() {
        return new EntryGetDepartment();
    }

    /**
     * Create an instance of {@link EntryHandle }
     * 
     */
    public EntryHandle createEntryHandle() {
        return new EntryHandle();
    }

    /**
     * Create an instance of {@link EmployeeSetSalesPriceBefore }
     * 
     */
    public EmployeeSetSalesPriceBefore createEmployeeSetSalesPriceBefore() {
        return new EmployeeSetSalesPriceBefore();
    }

    /**
     * Create an instance of {@link EmployeeHandle }
     * 
     */
    public EmployeeHandle createEmployeeHandle() {
        return new EmployeeHandle();
    }

    /**
     * Create an instance of {@link UnitGetNumberResponse }
     * 
     */
    public UnitGetNumberResponse createUnitGetNumberResponse() {
        return new UnitGetNumberResponse();
    }

    /**
     * Create an instance of {@link CompanySetCountryResponse }
     * 
     */
    public CompanySetCountryResponse createCompanySetCountryResponse() {
        return new CompanySetCountryResponse();
    }

    /**
     * Create an instance of {@link DebtorContactCreateResponse }
     * 
     */
    public DebtorContactCreateResponse createDebtorContactCreateResponse() {
        return new DebtorContactCreateResponse();
    }

    /**
     * Create an instance of {@link DebtorContactHandle }
     * 
     */
    public DebtorContactHandle createDebtorContactHandle() {
        return new DebtorContactHandle();
    }

    /**
     * Create an instance of {@link SubscriberGetAllResponse }
     * 
     */
    public SubscriberGetAllResponse createSubscriberGetAllResponse() {
        return new SubscriberGetAllResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSubscriberHandle }
     * 
     */
    public ArrayOfSubscriberHandle createArrayOfSubscriberHandle() {
        return new ArrayOfSubscriberHandle();
    }

    /**
     * Create an instance of {@link OrderGetTermOfPayment }
     * 
     */
    public OrderGetTermOfPayment createOrderGetTermOfPayment() {
        return new OrderGetTermOfPayment();
    }

    /**
     * Create an instance of {@link OrderHandle }
     * 
     */
    public OrderHandle createOrderHandle() {
        return new OrderHandle();
    }

    /**
     * Create an instance of {@link CreditorGetEntriesByInvoiceNo }
     * 
     */
    public CreditorGetEntriesByInvoiceNo createCreditorGetEntriesByInvoiceNo() {
        return new CreditorGetEntriesByInvoiceNo();
    }

    /**
     * Create an instance of {@link CreditorHandle }
     * 
     */
    public CreditorHandle createCreditorHandle() {
        return new CreditorHandle();
    }

    /**
     * Create an instance of {@link InvoiceGetDateResponse }
     * 
     */
    public InvoiceGetDateResponse createInvoiceGetDateResponse() {
        return new InvoiceGetDateResponse();
    }

    /**
     * Create an instance of {@link CreditorContactGetTelephoneNumber }
     * 
     */
    public CreditorContactGetTelephoneNumber createCreditorContactGetTelephoneNumber() {
        return new CreditorContactGetTelephoneNumber();
    }

    /**
     * Create an instance of {@link CreditorContactHandle }
     * 
     */
    public CreditorContactHandle createCreditorContactHandle() {
        return new CreditorContactHandle();
    }

    /**
     * Create an instance of {@link OrderGetDeliveryCity }
     * 
     */
    public OrderGetDeliveryCity createOrderGetDeliveryCity() {
        return new OrderGetDeliveryCity();
    }

    /**
     * Create an instance of {@link QuotationSetDeliveryAddressResponse }
     * 
     */
    public QuotationSetDeliveryAddressResponse createQuotationSetDeliveryAddressResponse() {
        return new QuotationSetDeliveryAddressResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureSetAccount }
     * 
     */
    public BudgetFigureSetAccount createBudgetFigureSetAccount() {
        return new BudgetFigureSetAccount();
    }

    /**
     * Create an instance of {@link BudgetFigureHandle }
     * 
     */
    public BudgetFigureHandle createBudgetFigureHandle() {
        return new BudgetFigureHandle();
    }

    /**
     * Create an instance of {@link AccountHandle }
     * 
     */
    public AccountHandle createAccountHandle() {
        return new AccountHandle();
    }

    /**
     * Create an instance of {@link CreditorSetPostalCodeResponse }
     * 
     */
    public CreditorSetPostalCodeResponse createCreditorSetPostalCodeResponse() {
        return new CreditorSetPostalCodeResponse();
    }

    /**
     * Create an instance of {@link ReportCodeSetGetAllResponse }
     * 
     */
    public ReportCodeSetGetAllResponse createReportCodeSetGetAllResponse() {
        return new ReportCodeSetGetAllResponse();
    }

    /**
     * Create an instance of {@link ArrayOfReportCodeSetHandle }
     * 
     */
    public ArrayOfReportCodeSetHandle createArrayOfReportCodeSetHandle() {
        return new ArrayOfReportCodeSetHandle();
    }

    /**
     * Create an instance of {@link CashBookEntryGetEmployee }
     * 
     */
    public CashBookEntryGetEmployee createCashBookEntryGetEmployee() {
        return new CashBookEntryGetEmployee();
    }

    /**
     * Create an instance of {@link CashBookEntryHandle }
     * 
     */
    public CashBookEntryHandle createCashBookEntryHandle() {
        return new CashBookEntryHandle();
    }

    /**
     * Create an instance of {@link DebtorContactSetIsToReceiveEmailCopyOfOrder }
     * 
     */
    public DebtorContactSetIsToReceiveEmailCopyOfOrder createDebtorContactSetIsToReceiveEmailCopyOfOrder() {
        return new DebtorContactSetIsToReceiveEmailCopyOfOrder();
    }

    /**
     * Create an instance of {@link QuotationGetDebtorEanResponse }
     * 
     */
    public QuotationGetDebtorEanResponse createQuotationGetDebtorEanResponse() {
        return new QuotationGetDebtorEanResponse();
    }

    /**
     * Create an instance of {@link DebtorContactSetIsToReceiveEmailCopyOfInvoiceResponse }
     * 
     */
    public DebtorContactSetIsToReceiveEmailCopyOfInvoiceResponse createDebtorContactSetIsToReceiveEmailCopyOfInvoiceResponse() {
        return new DebtorContactSetIsToReceiveEmailCopyOfInvoiceResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationSetCity }
     * 
     */
    public DeliveryLocationSetCity createDeliveryLocationSetCity() {
        return new DeliveryLocationSetCity();
    }

    /**
     * Create an instance of {@link OrderLineGetUnitResponse }
     * 
     */
    public OrderLineGetUnitResponse createOrderLineGetUnitResponse() {
        return new OrderLineGetUnitResponse();
    }

    /**
     * Create an instance of {@link UnitHandle }
     * 
     */
    public UnitHandle createUnitHandle() {
        return new UnitHandle();
    }

    /**
     * Create an instance of {@link SumIntervalDeleteResponse }
     * 
     */
    public SumIntervalDeleteResponse createSumIntervalDeleteResponse() {
        return new SumIntervalDeleteResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureSetDistributionKeyResponse }
     * 
     */
    public BudgetFigureSetDistributionKeyResponse createBudgetFigureSetDistributionKeyResponse() {
        return new BudgetFigureSetDistributionKeyResponse();
    }

    /**
     * Create an instance of {@link MileageEntrySetEmployeeResponse }
     * 
     */
    public MileageEntrySetEmployeeResponse createMileageEntrySetEmployeeResponse() {
        return new MileageEntrySetEmployeeResponse();
    }

    /**
     * Create an instance of {@link QuotationGetTextLine1Response }
     * 
     */
    public QuotationGetTextLine1Response createQuotationGetTextLine1Response() {
        return new QuotationGetTextLine1Response();
    }

    /**
     * Create an instance of {@link OrderGetDeliveryDate }
     * 
     */
    public OrderGetDeliveryDate createOrderGetDeliveryDate() {
        return new OrderGetDeliveryDate();
    }

    /**
     * Create an instance of {@link DebtorContactGetNumberResponse }
     * 
     */
    public DebtorContactGetNumberResponse createDebtorContactGetNumberResponse() {
        return new DebtorContactGetNumberResponse();
    }

    /**
     * Create an instance of {@link CreditorContactSetExternalIdResponse }
     * 
     */
    public CreditorContactSetExternalIdResponse createCreditorContactSetExternalIdResponse() {
        return new CreditorContactSetExternalIdResponse();
    }

    /**
     * Create an instance of {@link ProductGroupFindByName }
     * 
     */
    public ProductGroupFindByName createProductGroupFindByName() {
        return new ProductGroupFindByName();
    }

    /**
     * Create an instance of {@link CreditorGroupGetName }
     * 
     */
    public CreditorGroupGetName createCreditorGroupGetName() {
        return new CreditorGroupGetName();
    }

    /**
     * Create an instance of {@link CreditorGroupHandle }
     * 
     */
    public CreditorGroupHandle createCreditorGroupHandle() {
        return new CreditorGroupHandle();
    }

    /**
     * Create an instance of {@link CashBookEntryGetCurrency }
     * 
     */
    public CashBookEntryGetCurrency createCashBookEntryGetCurrency() {
        return new CashBookEntryGetCurrency();
    }

    /**
     * Create an instance of {@link AccountSetBlockDirectEntriesResponse }
     * 
     */
    public AccountSetBlockDirectEntriesResponse createAccountSetBlockDirectEntriesResponse() {
        return new AccountSetBlockDirectEntriesResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetVatAmountResponse }
     * 
     */
    public CurrentInvoiceGetVatAmountResponse createCurrentInvoiceGetVatAmountResponse() {
        return new CurrentInvoiceGetVatAmountResponse();
    }

    /**
     * Create an instance of {@link MileageEntryGetIdResponse }
     * 
     */
    public MileageEntryGetIdResponse createMileageEntryGetIdResponse() {
        return new MileageEntryGetIdResponse();
    }

    /**
     * Create an instance of {@link KeyFigureCodeGetDataArrayResponse }
     * 
     */
    public KeyFigureCodeGetDataArrayResponse createKeyFigureCodeGetDataArrayResponse() {
        return new KeyFigureCodeGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeyFigureCodeData }
     * 
     */
    public ArrayOfKeyFigureCodeData createArrayOfKeyFigureCodeData() {
        return new ArrayOfKeyFigureCodeData();
    }

    /**
     * Create an instance of {@link CreditorGetVatZoneResponse }
     * 
     */
    public CreditorGetVatZoneResponse createCreditorGetVatZoneResponse() {
        return new CreditorGetVatZoneResponse();
    }

    /**
     * Create an instance of {@link QuotationGetDebtorCounty }
     * 
     */
    public QuotationGetDebtorCounty createQuotationGetDebtorCounty() {
        return new QuotationGetDebtorCounty();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetQuantityResponse }
     * 
     */
    public CurrentInvoiceLineSetQuantityResponse createCurrentInvoiceLineSetQuantityResponse() {
        return new CurrentInvoiceLineSetQuantityResponse();
    }

    /**
     * Create an instance of {@link CreditorGroupUpdateFromDataResponse }
     * 
     */
    public CreditorGroupUpdateFromDataResponse createCreditorGroupUpdateFromDataResponse() {
        return new CreditorGroupUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link TemplateCollectionFindByName }
     * 
     */
    public TemplateCollectionFindByName createTemplateCollectionFindByName() {
        return new TemplateCollectionFindByName();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineGetUnitPrice }
     * 
     */
    public CurrentSupplierInvoiceLineGetUnitPrice createCurrentSupplierInvoiceLineGetUnitPrice() {
        return new CurrentSupplierInvoiceLineGetUnitPrice();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineHandle }
     * 
     */
    public CurrentSupplierInvoiceLineHandle createCurrentSupplierInvoiceLineHandle() {
        return new CurrentSupplierInvoiceLineHandle();
    }

    /**
     * Create an instance of {@link CreditorGroupFindByNumber }
     * 
     */
    public CreditorGroupFindByNumber createCreditorGroupFindByNumber() {
        return new CreditorGroupFindByNumber();
    }

    /**
     * Create an instance of {@link QuotationGetDebtor }
     * 
     */
    public QuotationGetDebtor createQuotationGetDebtor() {
        return new QuotationGetDebtor();
    }

    /**
     * Create an instance of {@link AccountDeleteResponse }
     * 
     */
    public AccountDeleteResponse createAccountDeleteResponse() {
        return new AccountDeleteResponse();
    }

    /**
     * Create an instance of {@link CompanyGetSignUpDate }
     * 
     */
    public CompanyGetSignUpDate createCompanyGetSignUpDate() {
        return new CompanyGetSignUpDate();
    }

    /**
     * Create an instance of {@link CompanyHandle }
     * 
     */
    public CompanyHandle createCompanyHandle() {
        return new CompanyHandle();
    }

    /**
     * Create an instance of {@link OrderLineDelete }
     * 
     */
    public OrderLineDelete createOrderLineDelete() {
        return new OrderLineDelete();
    }

    /**
     * Create an instance of {@link OrderLineHandle }
     * 
     */
    public OrderLineHandle createOrderLineHandle() {
        return new OrderLineHandle();
    }

    /**
     * Create an instance of {@link CreditorGetAttention }
     * 
     */
    public CreditorGetAttention createCreditorGetAttention() {
        return new CreditorGetAttention();
    }

    /**
     * Create an instance of {@link CurrentInvoiceBookResponse }
     * 
     */
    public CurrentInvoiceBookResponse createCurrentInvoiceBookResponse() {
        return new CurrentInvoiceBookResponse();
    }

    /**
     * Create an instance of {@link InvoiceHandle }
     * 
     */
    public InvoiceHandle createInvoiceHandle() {
        return new InvoiceHandle();
    }

    /**
     * Create an instance of {@link AccountingYearGetFromDate }
     * 
     */
    public AccountingYearGetFromDate createAccountingYearGetFromDate() {
        return new AccountingYearGetFromDate();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryGetDataArray }
     * 
     */
    public DocumentArchiveCategoryGetDataArray createDocumentArchiveCategoryGetDataArray() {
        return new DocumentArchiveCategoryGetDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentArchiveCategoryHandle }
     * 
     */
    public ArrayOfDocumentArchiveCategoryHandle createArrayOfDocumentArchiveCategoryHandle() {
        return new ArrayOfDocumentArchiveCategoryHandle();
    }

    /**
     * Create an instance of {@link QuotationLineCreate }
     * 
     */
    public QuotationLineCreate createQuotationLineCreate() {
        return new QuotationLineCreate();
    }

    /**
     * Create an instance of {@link AccountCreateFromDataArrayResponse }
     * 
     */
    public AccountCreateFromDataArrayResponse createAccountCreateFromDataArrayResponse() {
        return new AccountCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAccountHandle }
     * 
     */
    public ArrayOfAccountHandle createArrayOfAccountHandle() {
        return new ArrayOfAccountHandle();
    }

    /**
     * Create an instance of {@link DebtorGetDebtorGroupResponse }
     * 
     */
    public DebtorGetDebtorGroupResponse createDebtorGetDebtorGroupResponse() {
        return new DebtorGetDebtorGroupResponse();
    }

    /**
     * Create an instance of {@link DebtorGroupHandle }
     * 
     */
    public DebtorGroupHandle createDebtorGroupHandle() {
        return new DebtorGroupHandle();
    }

    /**
     * Create an instance of {@link ActivityGetNumber }
     * 
     */
    public ActivityGetNumber createActivityGetNumber() {
        return new ActivityGetNumber();
    }

    /**
     * Create an instance of {@link ActivityHandle }
     * 
     */
    public ActivityHandle createActivityHandle() {
        return new ActivityHandle();
    }

    /**
     * Create an instance of {@link ProductGroupSetNameResponse }
     * 
     */
    public ProductGroupSetNameResponse createProductGroupSetNameResponse() {
        return new ProductGroupSetNameResponse();
    }

    /**
     * Create an instance of {@link ProductGetInStockResponse }
     * 
     */
    public ProductGetInStockResponse createProductGetInStockResponse() {
        return new ProductGetInStockResponse();
    }

    /**
     * Create an instance of {@link KeyFigureCodeGetName }
     * 
     */
    public KeyFigureCodeGetName createKeyFigureCodeGetName() {
        return new KeyFigureCodeGetName();
    }

    /**
     * Create an instance of {@link KeyFigureCodeHandle }
     * 
     */
    public KeyFigureCodeHandle createKeyFigureCodeHandle() {
        return new KeyFigureCodeHandle();
    }

    /**
     * Create an instance of {@link QuotationGetDebtorCityResponse }
     * 
     */
    public QuotationGetDebtorCityResponse createQuotationGetDebtorCityResponse() {
        return new QuotationGetDebtorCityResponse();
    }

    /**
     * Create an instance of {@link TimeEntryGetSalesPrice }
     * 
     */
    public TimeEntryGetSalesPrice createTimeEntryGetSalesPrice() {
        return new TimeEntryGetSalesPrice();
    }

    /**
     * Create an instance of {@link TimeEntryHandle }
     * 
     */
    public TimeEntryHandle createTimeEntryHandle() {
        return new TimeEntryHandle();
    }

    /**
     * Create an instance of {@link TermOfPaymentFindByNameResponse }
     * 
     */
    public TermOfPaymentFindByNameResponse createTermOfPaymentFindByNameResponse() {
        return new TermOfPaymentFindByNameResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTermOfPaymentHandle }
     * 
     */
    public ArrayOfTermOfPaymentHandle createArrayOfTermOfPaymentHandle() {
        return new ArrayOfTermOfPaymentHandle();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDebtor }
     * 
     */
    public CurrentInvoiceSetDebtor createCurrentInvoiceSetDebtor() {
        return new CurrentInvoiceSetDebtor();
    }

    /**
     * Create an instance of {@link DebtorGroupFindByNameResponse }
     * 
     */
    public DebtorGroupFindByNameResponse createDebtorGroupFindByNameResponse() {
        return new DebtorGroupFindByNameResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDebtorGroupHandle }
     * 
     */
    public ArrayOfDebtorGroupHandle createArrayOfDebtorGroupHandle() {
        return new ArrayOfDebtorGroupHandle();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceGetDataResponse }
     * 
     */
    public CurrentSupplierInvoiceGetDataResponse createCurrentSupplierInvoiceGetDataResponse() {
        return new CurrentSupplierInvoiceGetDataResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceData }
     * 
     */
    public CurrentSupplierInvoiceData createCurrentSupplierInvoiceData() {
        return new CurrentSupplierInvoiceData();
    }

    /**
     * Create an instance of {@link DebtorGetDebtorContactsResponse }
     * 
     */
    public DebtorGetDebtorContactsResponse createDebtorGetDebtorContactsResponse() {
        return new DebtorGetDebtorContactsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDebtorContactHandle }
     * 
     */
    public ArrayOfDebtorContactHandle createArrayOfDebtorContactHandle() {
        return new ArrayOfDebtorContactHandle();
    }

    /**
     * Create an instance of {@link DebtorGetEan }
     * 
     */
    public DebtorGetEan createDebtorGetEan() {
        return new DebtorGetEan();
    }

    /**
     * Create an instance of {@link DebtorGetBalance }
     * 
     */
    public DebtorGetBalance createDebtorGetBalance() {
        return new DebtorGetBalance();
    }

    /**
     * Create an instance of {@link CurrentInvoiceFindByOtherReferenceResponse }
     * 
     */
    public CurrentInvoiceFindByOtherReferenceResponse createCurrentInvoiceFindByOtherReferenceResponse() {
        return new CurrentInvoiceFindByOtherReferenceResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCurrentInvoiceHandle }
     * 
     */
    public ArrayOfCurrentInvoiceHandle createArrayOfCurrentInvoiceHandle() {
        return new ArrayOfCurrentInvoiceHandle();
    }

    /**
     * Create an instance of {@link VatAccountFindByVatCode }
     * 
     */
    public VatAccountFindByVatCode createVatAccountFindByVatCode() {
        return new VatAccountFindByVatCode();
    }

    /**
     * Create an instance of {@link AccountingYearGetData }
     * 
     */
    public AccountingYearGetData createAccountingYearGetData() {
        return new AccountingYearGetData();
    }

    /**
     * Create an instance of {@link InvoiceLineGetDistributionKeyResponse }
     * 
     */
    public InvoiceLineGetDistributionKeyResponse createInvoiceLineGetDistributionKeyResponse() {
        return new InvoiceLineGetDistributionKeyResponse();
    }

    /**
     * Create an instance of {@link DistributionKeyHandle }
     * 
     */
    public DistributionKeyHandle createDistributionKeyHandle() {
        return new DistributionKeyHandle();
    }

    /**
     * Create an instance of {@link DebtorGroupCreateResponse }
     * 
     */
    public DebtorGroupCreateResponse createDebtorGroupCreateResponse() {
        return new DebtorGroupCreateResponse();
    }

    /**
     * Create an instance of {@link ProjectGetActivitiesResponse }
     * 
     */
    public ProjectGetActivitiesResponse createProjectGetActivitiesResponse() {
        return new ProjectGetActivitiesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfActivityHandle }
     * 
     */
    public ArrayOfActivityHandle createArrayOfActivityHandle() {
        return new ArrayOfActivityHandle();
    }

    /**
     * Create an instance of {@link QuotationSetDebtorCity }
     * 
     */
    public QuotationSetDebtorCity createQuotationSetDebtorCity() {
        return new QuotationSetDebtorCity();
    }

    /**
     * Create an instance of {@link OrderCreateFromDataArrayResponse }
     * 
     */
    public OrderCreateFromDataArrayResponse createOrderCreateFromDataArrayResponse() {
        return new OrderCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDueDateResponse }
     * 
     */
    public CurrentInvoiceSetDueDateResponse createCurrentInvoiceSetDueDateResponse() {
        return new CurrentInvoiceSetDueDateResponse();
    }

    /**
     * Create an instance of {@link DebtorGroupGetAccountResponse }
     * 
     */
    public DebtorGroupGetAccountResponse createDebtorGroupGetAccountResponse() {
        return new DebtorGroupGetAccountResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceBookWithNumberResponse }
     * 
     */
    public CurrentInvoiceBookWithNumberResponse createCurrentInvoiceBookWithNumberResponse() {
        return new CurrentInvoiceBookWithNumberResponse();
    }

    /**
     * Create an instance of {@link ProductSetVolumeResponse }
     * 
     */
    public ProductSetVolumeResponse createProductSetVolumeResponse() {
        return new ProductSetVolumeResponse();
    }

    /**
     * Create an instance of {@link SubscriptionFindByNumberResponse }
     * 
     */
    public SubscriptionFindByNumberResponse createSubscriptionFindByNumberResponse() {
        return new SubscriptionFindByNumberResponse();
    }

    /**
     * Create an instance of {@link SubscriptionHandle }
     * 
     */
    public SubscriptionHandle createSubscriptionHandle() {
        return new SubscriptionHandle();
    }

    /**
     * Create an instance of {@link CurrentInvoiceFindByDateInterval }
     * 
     */
    public CurrentInvoiceFindByDateInterval createCurrentInvoiceFindByDateInterval() {
        return new CurrentInvoiceFindByDateInterval();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetTotalNetAmount }
     * 
     */
    public CurrentInvoiceLineGetTotalNetAmount createCurrentInvoiceLineGetTotalNetAmount() {
        return new CurrentInvoiceLineGetTotalNetAmount();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineHandle }
     * 
     */
    public CurrentInvoiceLineHandle createCurrentInvoiceLineHandle() {
        return new CurrentInvoiceLineHandle();
    }

    /**
     * Create an instance of {@link QuotationGetDebtorCity }
     * 
     */
    public QuotationGetDebtorCity createQuotationGetDebtorCity() {
        return new QuotationGetDebtorCity();
    }

    /**
     * Create an instance of {@link DebtorGetAddress }
     * 
     */
    public DebtorGetAddress createDebtorGetAddress() {
        return new DebtorGetAddress();
    }

    /**
     * Create an instance of {@link EntryFindBySerialNumberIntervalResponse }
     * 
     */
    public EntryFindBySerialNumberIntervalResponse createEntryFindBySerialNumberIntervalResponse() {
        return new EntryFindBySerialNumberIntervalResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetProductResponse }
     * 
     */
    public OrderLineGetProductResponse createOrderLineGetProductResponse() {
        return new OrderLineGetProductResponse();
    }

    /**
     * Create an instance of {@link QuotationGetRoundingAmount }
     * 
     */
    public QuotationGetRoundingAmount createQuotationGetRoundingAmount() {
        return new QuotationGetRoundingAmount();
    }

    /**
     * Create an instance of {@link CompanyGetVatNumberResponse }
     * 
     */
    public CompanyGetVatNumberResponse createCompanyGetVatNumberResponse() {
        return new CompanyGetVatNumberResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetCounty }
     * 
     */
    public DeliveryLocationGetCounty createDeliveryLocationGetCounty() {
        return new DeliveryLocationGetCounty();
    }

    /**
     * Create an instance of {@link InvoiceGetPublicEntryNumber }
     * 
     */
    public InvoiceGetPublicEntryNumber createInvoiceGetPublicEntryNumber() {
        return new InvoiceGetPublicEntryNumber();
    }

    /**
     * Create an instance of {@link TimeEntryCreateFromData }
     * 
     */
    public TimeEntryCreateFromData createTimeEntryCreateFromData() {
        return new TimeEntryCreateFromData();
    }

    /**
     * Create an instance of {@link TimeEntryData }
     * 
     */
    public TimeEntryData createTimeEntryData() {
        return new TimeEntryData();
    }

    /**
     * Create an instance of {@link BudgetFigureGetDataArrayResponse }
     * 
     */
    public BudgetFigureGetDataArrayResponse createBudgetFigureGetDataArrayResponse() {
        return new BudgetFigureGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBudgetFigureData }
     * 
     */
    public ArrayOfBudgetFigureData createArrayOfBudgetFigureData() {
        return new ArrayOfBudgetFigureData();
    }

    /**
     * Create an instance of {@link QuotationGetVatAmountResponse }
     * 
     */
    public QuotationGetVatAmountResponse createQuotationGetVatAmountResponse() {
        return new QuotationGetVatAmountResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureGetAccountResponse }
     * 
     */
    public BudgetFigureGetAccountResponse createBudgetFigureGetAccountResponse() {
        return new BudgetFigureGetAccountResponse();
    }

    /**
     * Create an instance of {@link QuotationGetHeading }
     * 
     */
    public QuotationGetHeading createQuotationGetHeading() {
        return new QuotationGetHeading();
    }

    /**
     * Create an instance of {@link OrderGetGrossAmountResponse }
     * 
     */
    public OrderGetGrossAmountResponse createOrderGetGrossAmountResponse() {
        return new OrderGetGrossAmountResponse();
    }

    /**
     * Create an instance of {@link ExtendedVatZoneGetDataArray }
     * 
     */
    public ExtendedVatZoneGetDataArray createExtendedVatZoneGetDataArray() {
        return new ExtendedVatZoneGetDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfExtendedVatZoneHandle }
     * 
     */
    public ArrayOfExtendedVatZoneHandle createArrayOfExtendedVatZoneHandle() {
        return new ArrayOfExtendedVatZoneHandle();
    }

    /**
     * Create an instance of {@link DepartmentGetDataResponse }
     * 
     */
    public DepartmentGetDataResponse createDepartmentGetDataResponse() {
        return new DepartmentGetDataResponse();
    }

    /**
     * Create an instance of {@link DepartmentData }
     * 
     */
    public DepartmentData createDepartmentData() {
        return new DepartmentData();
    }

    /**
     * Create an instance of {@link BankPaymentTypeGetDataResponse }
     * 
     */
    public BankPaymentTypeGetDataResponse createBankPaymentTypeGetDataResponse() {
        return new BankPaymentTypeGetDataResponse();
    }

    /**
     * Create an instance of {@link BankPaymentTypeData }
     * 
     */
    public BankPaymentTypeData createBankPaymentTypeData() {
        return new BankPaymentTypeData();
    }

    /**
     * Create an instance of {@link DebtorSetAttentionResponse }
     * 
     */
    public DebtorSetAttentionResponse createDebtorSetAttentionResponse() {
        return new DebtorSetAttentionResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineFindByProductList }
     * 
     */
    public InvoiceLineFindByProductList createInvoiceLineFindByProductList() {
        return new InvoiceLineFindByProductList();
    }

    /**
     * Create an instance of {@link ArrayOfProductHandle }
     * 
     */
    public ArrayOfProductHandle createArrayOfProductHandle() {
        return new ArrayOfProductHandle();
    }

    /**
     * Create an instance of {@link DebtorContactUpdateFromDataArray }
     * 
     */
    public DebtorContactUpdateFromDataArray createDebtorContactUpdateFromDataArray() {
        return new DebtorContactUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfDebtorContactData }
     * 
     */
    public ArrayOfDebtorContactData createArrayOfDebtorContactData() {
        return new ArrayOfDebtorContactData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetTextLine2 }
     * 
     */
    public CurrentInvoiceGetTextLine2 createCurrentInvoiceGetTextLine2() {
        return new CurrentInvoiceGetTextLine2();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetTextLine1 }
     * 
     */
    public CurrentInvoiceGetTextLine1 createCurrentInvoiceGetTextLine1() {
        return new CurrentInvoiceGetTextLine1();
    }

    /**
     * Create an instance of {@link ProductGroupSetAccountForVatExemptDebtorInvoicesCurrent }
     * 
     */
    public ProductGroupSetAccountForVatExemptDebtorInvoicesCurrent createProductGroupSetAccountForVatExemptDebtorInvoicesCurrent() {
        return new ProductGroupSetAccountForVatExemptDebtorInvoicesCurrent();
    }

    /**
     * Create an instance of {@link ProductGroupHandle }
     * 
     */
    public ProductGroupHandle createProductGroupHandle() {
        return new ProductGroupHandle();
    }

    /**
     * Create an instance of {@link ReportCodeSetGetName }
     * 
     */
    public ReportCodeSetGetName createReportCodeSetGetName() {
        return new ReportCodeSetGetName();
    }

    /**
     * Create an instance of {@link ReportCodeSetHandle }
     * 
     */
    public ReportCodeSetHandle createReportCodeSetHandle() {
        return new ReportCodeSetHandle();
    }

    /**
     * Create an instance of {@link CreditorGetCreditorContacts }
     * 
     */
    public CreditorGetCreditorContacts createCreditorGetCreditorContacts() {
        return new CreditorGetCreditorContacts();
    }

    /**
     * Create an instance of {@link CompanyGetAddress2 }
     * 
     */
    public CompanyGetAddress2 createCompanyGetAddress2() {
        return new CompanyGetAddress2();
    }

    /**
     * Create an instance of {@link CompanyGetAddress1 }
     * 
     */
    public CompanyGetAddress1 createCompanyGetAddress1() {
        return new CompanyGetAddress1();
    }

    /**
     * Create an instance of {@link InvoiceGetGrossAmount }
     * 
     */
    public InvoiceGetGrossAmount createInvoiceGetGrossAmount() {
        return new InvoiceGetGrossAmount();
    }

    /**
     * Create an instance of {@link CashBookEntrySetRemittanceInformation }
     * 
     */
    public CashBookEntrySetRemittanceInformation createCashBookEntrySetRemittanceInformation() {
        return new CashBookEntrySetRemittanceInformation();
    }

    /**
     * Create an instance of {@link BankPaymentTypeHandle }
     * 
     */
    public BankPaymentTypeHandle createBankPaymentTypeHandle() {
        return new BankPaymentTypeHandle();
    }

    /**
     * Create an instance of {@link CreditorGroupUpdateFromDataArray }
     * 
     */
    public CreditorGroupUpdateFromDataArray createCreditorGroupUpdateFromDataArray() {
        return new CreditorGroupUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfCreditorGroupData }
     * 
     */
    public ArrayOfCreditorGroupData createArrayOfCreditorGroupData() {
        return new ArrayOfCreditorGroupData();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetNumber }
     * 
     */
    public SubscriptionLineGetNumber createSubscriptionLineGetNumber() {
        return new SubscriptionLineGetNumber();
    }

    /**
     * Create an instance of {@link SubscriptionLineHandle }
     * 
     */
    public SubscriptionLineHandle createSubscriptionLineHandle() {
        return new SubscriptionLineHandle();
    }

    /**
     * Create an instance of {@link SubscriberUpdateFromDataArrayResponse }
     * 
     */
    public SubscriberUpdateFromDataArrayResponse createSubscriberUpdateFromDataArrayResponse() {
        return new SubscriberUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CashBookGetAllResponse }
     * 
     */
    public CashBookGetAllResponse createCashBookGetAllResponse() {
        return new CashBookGetAllResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCashBookHandle }
     * 
     */
    public ArrayOfCashBookHandle createArrayOfCashBookHandle() {
        return new ArrayOfCashBookHandle();
    }

    /**
     * Create an instance of {@link QuotationSetDeliveryLocation }
     * 
     */
    public QuotationSetDeliveryLocation createQuotationSetDeliveryLocation() {
        return new QuotationSetDeliveryLocation();
    }

    /**
     * Create an instance of {@link SubscriptionGetSubscribers }
     * 
     */
    public SubscriptionGetSubscribers createSubscriptionGetSubscribers() {
        return new SubscriptionGetSubscribers();
    }

    /**
     * Create an instance of {@link SumIntervalCreateFromDataResponse }
     * 
     */
    public SumIntervalCreateFromDataResponse createSumIntervalCreateFromDataResponse() {
        return new SumIntervalCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link SumIntervalHandle }
     * 
     */
    public SumIntervalHandle createSumIntervalHandle() {
        return new SumIntervalHandle();
    }

    /**
     * Create an instance of {@link ActivityFindByNumberListResponse }
     * 
     */
    public ActivityFindByNumberListResponse createActivityFindByNumberListResponse() {
        return new ActivityFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link SubscriberSetSubscriptionResponse }
     * 
     */
    public SubscriberSetSubscriptionResponse createSubscriberSetSubscriptionResponse() {
        return new SubscriberSetSubscriptionResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineCreateFromDataArrayResponse }
     * 
     */
    public CurrentInvoiceLineCreateFromDataArrayResponse createCurrentInvoiceLineCreateFromDataArrayResponse() {
        return new CurrentInvoiceLineCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDebtorCountry }
     * 
     */
    public CurrentInvoiceSetDebtorCountry createCurrentInvoiceSetDebtorCountry() {
        return new CurrentInvoiceSetDebtorCountry();
    }

    /**
     * Create an instance of {@link QuotationLineCreateFromDataArrayResponse }
     * 
     */
    public QuotationLineCreateFromDataArrayResponse createQuotationLineCreateFromDataArrayResponse() {
        return new QuotationLineCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfQuotationLineHandle }
     * 
     */
    public ArrayOfQuotationLineHandle createArrayOfQuotationLineHandle() {
        return new ArrayOfQuotationLineHandle();
    }

    /**
     * Create an instance of {@link DebtorContactUpdateFromDataResponse }
     * 
     */
    public DebtorContactUpdateFromDataResponse createDebtorContactUpdateFromDataResponse() {
        return new DebtorContactUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link SubscriptionGetDataResponse }
     * 
     */
    public SubscriptionGetDataResponse createSubscriptionGetDataResponse() {
        return new SubscriptionGetDataResponse();
    }

    /**
     * Create an instance of {@link SubscriptionData }
     * 
     */
    public SubscriptionData createSubscriptionData() {
        return new SubscriptionData();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetAllResponse }
     * 
     */
    public ScannedDocumentGetAllResponse createScannedDocumentGetAllResponse() {
        return new ScannedDocumentGetAllResponse();
    }

    /**
     * Create an instance of {@link ArrayOfScannedDocumentHandle }
     * 
     */
    public ArrayOfScannedDocumentHandle createArrayOfScannedDocumentHandle() {
        return new ArrayOfScannedDocumentHandle();
    }

    /**
     * Create an instance of {@link AccountingYearCreateResponse }
     * 
     */
    public AccountingYearCreateResponse createAccountingYearCreateResponse() {
        return new AccountingYearCreateResponse();
    }

    /**
     * Create an instance of {@link UnitGetName }
     * 
     */
    public UnitGetName createUnitGetName() {
        return new UnitGetName();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetTypeResponse }
     * 
     */
    public TermOfPaymentGetTypeResponse createTermOfPaymentGetTypeResponse() {
        return new TermOfPaymentGetTypeResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineGetProductResponse }
     * 
     */
    public CurrentSupplierInvoiceLineGetProductResponse createCurrentSupplierInvoiceLineGetProductResponse() {
        return new CurrentSupplierInvoiceLineGetProductResponse();
    }

    /**
     * Create an instance of {@link CompanySetWebSiteResponse }
     * 
     */
    public CompanySetWebSiteResponse createCompanySetWebSiteResponse() {
        return new CompanySetWebSiteResponse();
    }

    /**
     * Create an instance of {@link BankPaymentTypeFindByName }
     * 
     */
    public BankPaymentTypeFindByName createBankPaymentTypeFindByName() {
        return new BankPaymentTypeFindByName();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceGetIdResponse }
     * 
     */
    public CurrentSupplierInvoiceGetIdResponse createCurrentSupplierInvoiceGetIdResponse() {
        return new CurrentSupplierInvoiceGetIdResponse();
    }

    /**
     * Create an instance of {@link EmployeeFindByNumberResponse }
     * 
     */
    public EmployeeFindByNumberResponse createEmployeeFindByNumberResponse() {
        return new EmployeeFindByNumberResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineCreateResponse }
     * 
     */
    public CurrentInvoiceLineCreateResponse createCurrentInvoiceLineCreateResponse() {
        return new CurrentInvoiceLineCreateResponse();
    }

    /**
     * Create an instance of {@link SubscriptionLineFindBySubscription }
     * 
     */
    public SubscriptionLineFindBySubscription createSubscriptionLineFindBySubscription() {
        return new SubscriptionLineFindBySubscription();
    }

    /**
     * Create an instance of {@link CompanyGetNumberResponse }
     * 
     */
    public CompanyGetNumberResponse createCompanyGetNumberResponse() {
        return new CompanyGetNumberResponse();
    }

    /**
     * Create an instance of {@link DebtorEntryGetRemainderDefaultCurrency }
     * 
     */
    public DebtorEntryGetRemainderDefaultCurrency createDebtorEntryGetRemainderDefaultCurrency() {
        return new DebtorEntryGetRemainderDefaultCurrency();
    }

    /**
     * Create an instance of {@link DebtorEntryHandle }
     * 
     */
    public DebtorEntryHandle createDebtorEntryHandle() {
        return new DebtorEntryHandle();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceSetCreditor }
     * 
     */
    public CurrentSupplierInvoiceSetCreditor createCurrentSupplierInvoiceSetCreditor() {
        return new CurrentSupplierInvoiceSetCreditor();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceHandle }
     * 
     */
    public CurrentSupplierInvoiceHandle createCurrentSupplierInvoiceHandle() {
        return new CurrentSupplierInvoiceHandle();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetQuantity }
     * 
     */
    public CurrentInvoiceLineGetQuantity createCurrentInvoiceLineGetQuantity() {
        return new CurrentInvoiceLineGetQuantity();
    }

    /**
     * Create an instance of {@link CreditorGetCINumberResponse }
     * 
     */
    public CreditorGetCINumberResponse createCreditorGetCINumberResponse() {
        return new CreditorGetCINumberResponse();
    }

    /**
     * Create an instance of {@link OrderSetLayoutResponse }
     * 
     */
    public OrderSetLayoutResponse createOrderSetLayoutResponse() {
        return new OrderSetLayoutResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetUnit }
     * 
     */
    public CurrentInvoiceLineSetUnit createCurrentInvoiceLineSetUnit() {
        return new CurrentInvoiceLineSetUnit();
    }

    /**
     * Create an instance of {@link DebtorSetLayout }
     * 
     */
    public DebtorSetLayout createDebtorSetLayout() {
        return new DebtorSetLayout();
    }

    /**
     * Create an instance of {@link TemplateCollectionHandle }
     * 
     */
    public TemplateCollectionHandle createTemplateCollectionHandle() {
        return new TemplateCollectionHandle();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetLayoutResponse }
     * 
     */
    public CurrentInvoiceGetLayoutResponse createCurrentInvoiceGetLayoutResponse() {
        return new CurrentInvoiceGetLayoutResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetGrossAmountResponse }
     * 
     */
    public InvoiceGetGrossAmountResponse createInvoiceGetGrossAmountResponse() {
        return new InvoiceGetGrossAmountResponse();
    }

    /**
     * Create an instance of {@link DebtorEntryGetAccount }
     * 
     */
    public DebtorEntryGetAccount createDebtorEntryGetAccount() {
        return new DebtorEntryGetAccount();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetUnitNetPriceResponse }
     * 
     */
    public CurrentInvoiceLineSetUnitNetPriceResponse createCurrentInvoiceLineSetUnitNetPriceResponse() {
        return new CurrentInvoiceLineSetUnitNetPriceResponse();
    }

    /**
     * Create an instance of {@link OrderSetPublicEntryNumber }
     * 
     */
    public OrderSetPublicEntryNumber createOrderSetPublicEntryNumber() {
        return new OrderSetPublicEntryNumber();
    }

    /**
     * Create an instance of {@link OrderFindByDateInterval }
     * 
     */
    public OrderFindByDateInterval createOrderFindByDateInterval() {
        return new OrderFindByDateInterval();
    }

    /**
     * Create an instance of {@link CreditorGetBankAccount }
     * 
     */
    public CreditorGetBankAccount createCreditorGetBankAccount() {
        return new CreditorGetBankAccount();
    }

    /**
     * Create an instance of {@link PriceGroupUpdateFromDataArrayResponse }
     * 
     */
    public PriceGroupUpdateFromDataArrayResponse createPriceGroupUpdateFromDataArrayResponse() {
        return new PriceGroupUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPriceGroupHandle }
     * 
     */
    public ArrayOfPriceGroupHandle createArrayOfPriceGroupHandle() {
        return new ArrayOfPriceGroupHandle();
    }

    /**
     * Create an instance of {@link EntryGetCurrency }
     * 
     */
    public EntryGetCurrency createEntryGetCurrency() {
        return new EntryGetCurrency();
    }

    /**
     * Create an instance of {@link ProductGetUnitResponse }
     * 
     */
    public ProductGetUnitResponse createProductGetUnitResponse() {
        return new ProductGetUnitResponse();
    }

    /**
     * Create an instance of {@link SubscriptionGetNextAvailableNumberResponse }
     * 
     */
    public SubscriptionGetNextAvailableNumberResponse createSubscriptionGetNextAvailableNumberResponse() {
        return new SubscriptionGetNextAvailableNumberResponse();
    }

    /**
     * Create an instance of {@link EntryCopyVoucher }
     * 
     */
    public EntryCopyVoucher createEntryCopyVoucher() {
        return new EntryCopyVoucher();
    }

    /**
     * Create an instance of {@link CashBookHandle }
     * 
     */
    public CashBookHandle createCashBookHandle() {
        return new CashBookHandle();
    }

    /**
     * Create an instance of {@link EmployeeGroupUpdateFromDataResponse }
     * 
     */
    public EmployeeGroupUpdateFromDataResponse createEmployeeGroupUpdateFromDataResponse() {
        return new EmployeeGroupUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryDelete }
     * 
     */
    public DocumentArchiveCategoryDelete createDocumentArchiveCategoryDelete() {
        return new DocumentArchiveCategoryDelete();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryHandle }
     * 
     */
    public DocumentArchiveCategoryHandle createDocumentArchiveCategoryHandle() {
        return new DocumentArchiveCategoryHandle();
    }

    /**
     * Create an instance of {@link DebtorContactGetDataArrayResponse }
     * 
     */
    public DebtorContactGetDataArrayResponse createDebtorContactGetDataArrayResponse() {
        return new DebtorContactGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link SubscriberGetDebtor }
     * 
     */
    public SubscriberGetDebtor createSubscriberGetDebtor() {
        return new SubscriberGetDebtor();
    }

    /**
     * Create an instance of {@link SubscriptionSetDescriptionResponse }
     * 
     */
    public SubscriptionSetDescriptionResponse createSubscriptionSetDescriptionResponse() {
        return new SubscriptionSetDescriptionResponse();
    }

    /**
     * Create an instance of {@link ReportCodeGetParentCode }
     * 
     */
    public ReportCodeGetParentCode createReportCodeGetParentCode() {
        return new ReportCodeGetParentCode();
    }

    /**
     * Create an instance of {@link ReportCodeHandle }
     * 
     */
    public ReportCodeHandle createReportCodeHandle() {
        return new ReportCodeHandle();
    }

    /**
     * Create an instance of {@link DebtorGroupFindByNumberResponse }
     * 
     */
    public DebtorGroupFindByNumberResponse createDebtorGroupFindByNumberResponse() {
        return new DebtorGroupFindByNumberResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryCreateCreditorPaymentResponse }
     * 
     */
    public CashBookEntryCreateCreditorPaymentResponse createCashBookEntryCreateCreditorPaymentResponse() {
        return new CashBookEntryCreateCreditorPaymentResponse();
    }

    /**
     * Create an instance of {@link DepartmentFindByNumber }
     * 
     */
    public DepartmentFindByNumber createDepartmentFindByNumber() {
        return new DepartmentFindByNumber();
    }

    /**
     * Create an instance of {@link ProjectGetIsMainProject }
     * 
     */
    public ProjectGetIsMainProject createProjectGetIsMainProject() {
        return new ProjectGetIsMainProject();
    }

    /**
     * Create an instance of {@link ProjectHandle }
     * 
     */
    public ProjectHandle createProjectHandle() {
        return new ProjectHandle();
    }

    /**
     * Create an instance of {@link CreditorGetDefaultPaymentCreditorId }
     * 
     */
    public CreditorGetDefaultPaymentCreditorId createCreditorGetDefaultPaymentCreditorId() {
        return new CreditorGetDefaultPaymentCreditorId();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetContraAccount }
     * 
     */
    public TermOfPaymentGetContraAccount createTermOfPaymentGetContraAccount() {
        return new TermOfPaymentGetContraAccount();
    }

    /**
     * Create an instance of {@link TermOfPaymentHandle }
     * 
     */
    public TermOfPaymentHandle createTermOfPaymentHandle() {
        return new TermOfPaymentHandle();
    }

    /**
     * Create an instance of {@link CompanyGetCounty }
     * 
     */
    public CompanyGetCounty createCompanyGetCounty() {
        return new CompanyGetCounty();
    }

    /**
     * Create an instance of {@link TermOfPaymentDelete }
     * 
     */
    public TermOfPaymentDelete createTermOfPaymentDelete() {
        return new TermOfPaymentDelete();
    }

    /**
     * Create an instance of {@link CashBookEntryGetData }
     * 
     */
    public CashBookEntryGetData createCashBookEntryGetData() {
        return new CashBookEntryGetData();
    }

    /**
     * Create an instance of {@link QuotationGetNumberResponse }
     * 
     */
    public QuotationGetNumberResponse createQuotationGetNumberResponse() {
        return new QuotationGetNumberResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetStartDate }
     * 
     */
    public CashBookEntryGetStartDate createCashBookEntryGetStartDate() {
        return new CashBookEntryGetStartDate();
    }

    /**
     * Create an instance of {@link CostTypeFindByNumberResponse }
     * 
     */
    public CostTypeFindByNumberResponse createCostTypeFindByNumberResponse() {
        return new CostTypeFindByNumberResponse();
    }

    /**
     * Create an instance of {@link CostTypeHandle }
     * 
     */
    public CostTypeHandle createCostTypeHandle() {
        return new CostTypeHandle();
    }

    /**
     * Create an instance of {@link DebtorSetDebtorGroup }
     * 
     */
    public DebtorSetDebtorGroup createDebtorSetDebtorGroup() {
        return new DebtorSetDebtorGroup();
    }

    /**
     * Create an instance of {@link CashBookEntryGetDate }
     * 
     */
    public CashBookEntryGetDate createCashBookEntryGetDate() {
        return new CashBookEntryGetDate();
    }

    /**
     * Create an instance of {@link OrderGetTextLine2Response }
     * 
     */
    public OrderGetTextLine2Response createOrderGetTextLine2Response() {
        return new OrderGetTextLine2Response();
    }

    /**
     * Create an instance of {@link ProjectSetMileage }
     * 
     */
    public ProjectSetMileage createProjectSetMileage() {
        return new ProjectSetMileage();
    }

    /**
     * Create an instance of {@link ProjectGetMainProject }
     * 
     */
    public ProjectGetMainProject createProjectGetMainProject() {
        return new ProjectGetMainProject();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetType }
     * 
     */
    public TermOfPaymentGetType createTermOfPaymentGetType() {
        return new TermOfPaymentGetType();
    }

    /**
     * Create an instance of {@link CashBookSetNameResponse }
     * 
     */
    public CashBookSetNameResponse createCashBookSetNameResponse() {
        return new CashBookSetNameResponse();
    }

    /**
     * Create an instance of {@link CompanyGetName }
     * 
     */
    public CompanyGetName createCompanyGetName() {
        return new CompanyGetName();
    }

    /**
     * Create an instance of {@link QuotationGetTermOfPaymentResponse }
     * 
     */
    public QuotationGetTermOfPaymentResponse createQuotationGetTermOfPaymentResponse() {
        return new QuotationGetTermOfPaymentResponse();
    }

    /**
     * Create an instance of {@link QuotationSetDebtorCountry }
     * 
     */
    public QuotationSetDebtorCountry createQuotationSetDebtorCountry() {
        return new QuotationSetDebtorCountry();
    }

    /**
     * Create an instance of {@link DepartmentGetData }
     * 
     */
    public DepartmentGetData createDepartmentGetData() {
        return new DepartmentGetData();
    }

    /**
     * Create an instance of {@link DepartmentHandle }
     * 
     */
    public DepartmentHandle createDepartmentHandle() {
        return new DepartmentHandle();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryFindByNameResponse }
     * 
     */
    public DocumentArchiveCategoryFindByNameResponse createDocumentArchiveCategoryFindByNameResponse() {
        return new DocumentArchiveCategoryFindByNameResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetOioXml }
     * 
     */
    public InvoiceGetOioXml createInvoiceGetOioXml() {
        return new InvoiceGetOioXml();
    }

    /**
     * Create an instance of {@link OrderLineGetMarginAsPercentResponse }
     * 
     */
    public OrderLineGetMarginAsPercentResponse createOrderLineGetMarginAsPercentResponse() {
        return new OrderLineGetMarginAsPercentResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetUnitNetPriceResponse }
     * 
     */
    public OrderLineGetUnitNetPriceResponse createOrderLineGetUnitNetPriceResponse() {
        return new OrderLineGetUnitNetPriceResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetLayoutResponse }
     * 
     */
    public InvoiceGetLayoutResponse createInvoiceGetLayoutResponse() {
        return new InvoiceGetLayoutResponse();
    }

    /**
     * Create an instance of {@link CostTypeGroupFindByNumber }
     * 
     */
    public CostTypeGroupFindByNumber createCostTypeGroupFindByNumber() {
        return new CostTypeGroupFindByNumber();
    }

    /**
     * Create an instance of {@link EmployeeGetTimeEntriesByDateResponse }
     * 
     */
    public EmployeeGetTimeEntriesByDateResponse createEmployeeGetTimeEntriesByDateResponse() {
        return new EmployeeGetTimeEntriesByDateResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTimeEntryHandle }
     * 
     */
    public ArrayOfTimeEntryHandle createArrayOfTimeEntryHandle() {
        return new ArrayOfTimeEntryHandle();
    }

    /**
     * Create an instance of {@link DebtorSetExtendedVatZoneResponse }
     * 
     */
    public DebtorSetExtendedVatZoneResponse createDebtorSetExtendedVatZoneResponse() {
        return new DebtorSetExtendedVatZoneResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetTermOfPayment }
     * 
     */
    public CurrentInvoiceSetTermOfPayment createCurrentInvoiceSetTermOfPayment() {
        return new CurrentInvoiceSetTermOfPayment();
    }

    /**
     * Create an instance of {@link DebtorEntryGetText }
     * 
     */
    public DebtorEntryGetText createDebtorEntryGetText() {
        return new DebtorEntryGetText();
    }

    /**
     * Create an instance of {@link InventoryLocationGetDataArrayResponse }
     * 
     */
    public InventoryLocationGetDataArrayResponse createInventoryLocationGetDataArrayResponse() {
        return new InventoryLocationGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInventoryLocationData }
     * 
     */
    public ArrayOfInventoryLocationData createArrayOfInventoryLocationData() {
        return new ArrayOfInventoryLocationData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDebtor }
     * 
     */
    public CurrentInvoiceGetDebtor createCurrentInvoiceGetDebtor() {
        return new CurrentInvoiceGetDebtor();
    }

    /**
     * Create an instance of {@link KeyFigureCodeGetNameResponse }
     * 
     */
    public KeyFigureCodeGetNameResponse createKeyFigureCodeGetNameResponse() {
        return new KeyFigureCodeGetNameResponse();
    }

    /**
     * Create an instance of {@link QuotationSetDeliveryCounty }
     * 
     */
    public QuotationSetDeliveryCounty createQuotationSetDeliveryCounty() {
        return new QuotationSetDeliveryCounty();
    }

    /**
     * Create an instance of {@link EmployeeUpdateFromDataArrayResponse }
     * 
     */
    public EmployeeUpdateFromDataArrayResponse createEmployeeUpdateFromDataArrayResponse() {
        return new EmployeeUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEmployeeHandle }
     * 
     */
    public ArrayOfEmployeeHandle createArrayOfEmployeeHandle() {
        return new ArrayOfEmployeeHandle();
    }

    /**
     * Create an instance of {@link OrderSetIsVatIncluded }
     * 
     */
    public OrderSetIsVatIncluded createOrderSetIsVatIncluded() {
        return new OrderSetIsVatIncluded();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetDebtorResponse }
     * 
     */
    public DeliveryLocationGetDebtorResponse createDeliveryLocationGetDebtorResponse() {
        return new DeliveryLocationGetDebtorResponse();
    }

    /**
     * Create an instance of {@link SubscriberFindBySubscriptonListResponse }
     * 
     */
    public SubscriberFindBySubscriptonListResponse createSubscriberFindBySubscriptonListResponse() {
        return new SubscriberFindBySubscriptonListResponse();
    }

    /**
     * Create an instance of {@link DebtorGroupGetNameResponse }
     * 
     */
    public DebtorGroupGetNameResponse createDebtorGroupGetNameResponse() {
        return new DebtorGroupGetNameResponse();
    }

    /**
     * Create an instance of {@link QuotationGetPdf }
     * 
     */
    public QuotationGetPdf createQuotationGetPdf() {
        return new QuotationGetPdf();
    }

    /**
     * Create an instance of {@link ProductSetUnitResponse }
     * 
     */
    public ProductSetUnitResponse createProductSetUnitResponse() {
        return new ProductSetUnitResponse();
    }

    /**
     * Create an instance of {@link DebtorSetTelephoneAndFaxNumber }
     * 
     */
    public DebtorSetTelephoneAndFaxNumber createDebtorSetTelephoneAndFaxNumber() {
        return new DebtorSetTelephoneAndFaxNumber();
    }

    /**
     * Create an instance of {@link ProjectGetName }
     * 
     */
    public ProjectGetName createProjectGetName() {
        return new ProjectGetName();
    }

    /**
     * Create an instance of {@link ScannedDocumentFindByVoucherNumber }
     * 
     */
    public ScannedDocumentFindByVoucherNumber createScannedDocumentFindByVoucherNumber() {
        return new ScannedDocumentFindByVoucherNumber();
    }

    /**
     * Create an instance of {@link CashBookEntryGetCreditorInvoiceNumberResponse }
     * 
     */
    public CashBookEntryGetCreditorInvoiceNumberResponse createCashBookEntryGetCreditorInvoiceNumberResponse() {
        return new CashBookEntryGetCreditorInvoiceNumberResponse();
    }

    /**
     * Create an instance of {@link CreditorGroupFindByNumberListResponse }
     * 
     */
    public CreditorGroupFindByNumberListResponse createCreditorGroupFindByNumberListResponse() {
        return new CreditorGroupFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCreditorGroupHandle }
     * 
     */
    public ArrayOfCreditorGroupHandle createArrayOfCreditorGroupHandle() {
        return new ArrayOfCreditorGroupHandle();
    }

    /**
     * Create an instance of {@link CreditorEntryGetInvoiceNumber }
     * 
     */
    public CreditorEntryGetInvoiceNumber createCreditorEntryGetInvoiceNumber() {
        return new CreditorEntryGetInvoiceNumber();
    }

    /**
     * Create an instance of {@link CreditorEntryHandle }
     * 
     */
    public CreditorEntryHandle createCreditorEntryHandle() {
        return new CreditorEntryHandle();
    }

    /**
     * Create an instance of {@link SubscriberGetEndDate }
     * 
     */
    public SubscriberGetEndDate createSubscriberGetEndDate() {
        return new SubscriberGetEndDate();
    }

    /**
     * Create an instance of {@link AccountSetContraAccount }
     * 
     */
    public AccountSetContraAccount createAccountSetContraAccount() {
        return new AccountSetContraAccount();
    }

    /**
     * Create an instance of {@link BankPaymentTypeGetData }
     * 
     */
    public BankPaymentTypeGetData createBankPaymentTypeGetData() {
        return new BankPaymentTypeGetData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetMarginResponse }
     * 
     */
    public CurrentInvoiceGetMarginResponse createCurrentInvoiceGetMarginResponse() {
        return new CurrentInvoiceGetMarginResponse();
    }

    /**
     * Create an instance of {@link QuotationSetDeliveryLocationResponse }
     * 
     */
    public QuotationSetDeliveryLocationResponse createQuotationSetDeliveryLocationResponse() {
        return new QuotationSetDeliveryLocationResponse();
    }

    /**
     * Create an instance of {@link ProductSetCostPrice }
     * 
     */
    public ProductSetCostPrice createProductSetCostPrice() {
        return new ProductSetCostPrice();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryGetData }
     * 
     */
    public DocumentArchiveCategoryGetData createDocumentArchiveCategoryGetData() {
        return new DocumentArchiveCategoryGetData();
    }

    /**
     * Create an instance of {@link QuotationSetDueDate }
     * 
     */
    public QuotationSetDueDate createQuotationSetDueDate() {
        return new QuotationSetDueDate();
    }

    /**
     * Create an instance of {@link ProductGroupSetAccrualResponse }
     * 
     */
    public ProductGroupSetAccrualResponse createProductGroupSetAccrualResponse() {
        return new ProductGroupSetAccrualResponse();
    }

    /**
     * Create an instance of {@link DepartmentGetDataArray }
     * 
     */
    public DepartmentGetDataArray createDepartmentGetDataArray() {
        return new DepartmentGetDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfDepartmentHandle }
     * 
     */
    public ArrayOfDepartmentHandle createArrayOfDepartmentHandle() {
        return new ArrayOfDepartmentHandle();
    }

    /**
     * Create an instance of {@link InventoryLocationFindByName }
     * 
     */
    public InventoryLocationFindByName createInventoryLocationFindByName() {
        return new InventoryLocationFindByName();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetDataArray }
     * 
     */
    public CurrentInvoiceLineGetDataArray createCurrentInvoiceLineGetDataArray() {
        return new CurrentInvoiceLineGetDataArray();
    }

    /**
     * Create an instance of {@link ProductGetProductGroupResponse }
     * 
     */
    public ProductGetProductGroupResponse createProductGetProductGroupResponse() {
        return new ProductGetProductGroupResponse();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryGetDataArrayResponse }
     * 
     */
    public DocumentArchiveCategoryGetDataArrayResponse createDocumentArchiveCategoryGetDataArrayResponse() {
        return new DocumentArchiveCategoryGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentArchiveCategoryData }
     * 
     */
    public ArrayOfDocumentArchiveCategoryData createArrayOfDocumentArchiveCategoryData() {
        return new ArrayOfDocumentArchiveCategoryData();
    }

    /**
     * Create an instance of {@link ProductGetSalesPrice }
     * 
     */
    public ProductGetSalesPrice createProductGetSalesPrice() {
        return new ProductGetSalesPrice();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDeliveryLocation }
     * 
     */
    public CurrentInvoiceGetDeliveryLocation createCurrentInvoiceGetDeliveryLocation() {
        return new CurrentInvoiceGetDeliveryLocation();
    }

    /**
     * Create an instance of {@link BudgetFigureSetFromDate }
     * 
     */
    public BudgetFigureSetFromDate createBudgetFigureSetFromDate() {
        return new BudgetFigureSetFromDate();
    }

    /**
     * Create an instance of {@link OrderGetDeliveryDateResponse }
     * 
     */
    public OrderGetDeliveryDateResponse createOrderGetDeliveryDateResponse() {
        return new OrderGetDeliveryDateResponse();
    }

    /**
     * Create an instance of {@link ProjectGroupGetProjects }
     * 
     */
    public ProjectGroupGetProjects createProjectGroupGetProjects() {
        return new ProjectGroupGetProjects();
    }

    /**
     * Create an instance of {@link ProjectGroupHandle }
     * 
     */
    public ProjectGroupHandle createProjectGroupHandle() {
        return new ProjectGroupHandle();
    }

    /**
     * Create an instance of {@link QuotationGetDebtorCountry }
     * 
     */
    public QuotationGetDebtorCountry createQuotationGetDebtorCountry() {
        return new QuotationGetDebtorCountry();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetNumber }
     * 
     */
    public DeliveryLocationGetNumber createDeliveryLocationGetNumber() {
        return new DeliveryLocationGetNumber();
    }

    /**
     * Create an instance of {@link OrderLineGetDiscountAsPercent }
     * 
     */
    public OrderLineGetDiscountAsPercent createOrderLineGetDiscountAsPercent() {
        return new OrderLineGetDiscountAsPercent();
    }

    /**
     * Create an instance of {@link CompanyGetBaseCurrency }
     * 
     */
    public CompanyGetBaseCurrency createCompanyGetBaseCurrency() {
        return new CompanyGetBaseCurrency();
    }

    /**
     * Create an instance of {@link DebtorEntryGetDebtor }
     * 
     */
    public DebtorEntryGetDebtor createDebtorEntryGetDebtor() {
        return new DebtorEntryGetDebtor();
    }

    /**
     * Create an instance of {@link AccountGetDataArrayResponse }
     * 
     */
    public AccountGetDataArrayResponse createAccountGetDataArrayResponse() {
        return new AccountGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAccountData }
     * 
     */
    public ArrayOfAccountData createArrayOfAccountData() {
        return new ArrayOfAccountData();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryGetDataResponse }
     * 
     */
    public DocumentArchiveCategoryGetDataResponse createDocumentArchiveCategoryGetDataResponse() {
        return new DocumentArchiveCategoryGetDataResponse();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryData }
     * 
     */
    public DocumentArchiveCategoryData createDocumentArchiveCategoryData() {
        return new DocumentArchiveCategoryData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDeliveryCountry }
     * 
     */
    public CurrentInvoiceGetDeliveryCountry createCurrentInvoiceGetDeliveryCountry() {
        return new CurrentInvoiceGetDeliveryCountry();
    }

    /**
     * Create an instance of {@link PriceGroupGetAll }
     * 
     */
    public PriceGroupGetAll createPriceGroupGetAll() {
        return new PriceGroupGetAll();
    }

    /**
     * Create an instance of {@link PriceGroupFindByNumberListResponse }
     * 
     */
    public PriceGroupFindByNumberListResponse createPriceGroupFindByNumberListResponse() {
        return new PriceGroupFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link PriceGroupGetDataArray }
     * 
     */
    public PriceGroupGetDataArray createPriceGroupGetDataArray() {
        return new PriceGroupGetDataArray();
    }

    /**
     * Create an instance of {@link CashBookEntryUpdateFromData }
     * 
     */
    public CashBookEntryUpdateFromData createCashBookEntryUpdateFromData() {
        return new CashBookEntryUpdateFromData();
    }

    /**
     * Create an instance of {@link CashBookEntryData }
     * 
     */
    public CashBookEntryData createCashBookEntryData() {
        return new CashBookEntryData();
    }

    /**
     * Create an instance of {@link EmployeeGroupFindByNumber }
     * 
     */
    public EmployeeGroupFindByNumber createEmployeeGroupFindByNumber() {
        return new EmployeeGroupFindByNumber();
    }

    /**
     * Create an instance of {@link ProjectGetDataResponse }
     * 
     */
    public ProjectGetDataResponse createProjectGetDataResponse() {
        return new ProjectGetDataResponse();
    }

    /**
     * Create an instance of {@link ProjectData }
     * 
     */
    public ProjectData createProjectData() {
        return new ProjectData();
    }

    /**
     * Create an instance of {@link EmployeeGetDataArrayResponse }
     * 
     */
    public EmployeeGetDataArrayResponse createEmployeeGetDataArrayResponse() {
        return new EmployeeGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEmployeeData }
     * 
     */
    public ArrayOfEmployeeData createArrayOfEmployeeData() {
        return new ArrayOfEmployeeData();
    }

    /**
     * Create an instance of {@link QuotationUpdateFromDataResponse }
     * 
     */
    public QuotationUpdateFromDataResponse createQuotationUpdateFromDataResponse() {
        return new QuotationUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link CompanyGetWebSiteResponse }
     * 
     */
    public CompanyGetWebSiteResponse createCompanyGetWebSiteResponse() {
        return new CompanyGetWebSiteResponse();
    }

    /**
     * Create an instance of {@link EmployeeGroupGetAll }
     * 
     */
    public EmployeeGroupGetAll createEmployeeGroupGetAll() {
        return new EmployeeGroupGetAll();
    }

    /**
     * Create an instance of {@link ProjectGroupFindByName }
     * 
     */
    public ProjectGroupFindByName createProjectGroupFindByName() {
        return new ProjectGroupFindByName();
    }

    /**
     * Create an instance of {@link OrderSetCurrencyResponse }
     * 
     */
    public OrderSetCurrencyResponse createOrderSetCurrencyResponse() {
        return new OrderSetCurrencyResponse();
    }

    /**
     * Create an instance of {@link AccountGetType }
     * 
     */
    public AccountGetType createAccountGetType() {
        return new AccountGetType();
    }

    /**
     * Create an instance of {@link InvoiceGetOioXmlResponse }
     * 
     */
    public InvoiceGetOioXmlResponse createInvoiceGetOioXmlResponse() {
        return new InvoiceGetOioXmlResponse();
    }

    /**
     * Create an instance of {@link EmployeeGroupGetNumber }
     * 
     */
    public EmployeeGroupGetNumber createEmployeeGroupGetNumber() {
        return new EmployeeGroupGetNumber();
    }

    /**
     * Create an instance of {@link OrderDeleteResponse }
     * 
     */
    public OrderDeleteResponse createOrderDeleteResponse() {
        return new OrderDeleteResponse();
    }

    /**
     * Create an instance of {@link SubscriptionFindByName }
     * 
     */
    public SubscriptionFindByName createSubscriptionFindByName() {
        return new SubscriptionFindByName();
    }

    /**
     * Create an instance of {@link CostTypeGroupGetNumber }
     * 
     */
    public CostTypeGroupGetNumber createCostTypeGroupGetNumber() {
        return new CostTypeGroupGetNumber();
    }

    /**
     * Create an instance of {@link CostTypeGroupHandle }
     * 
     */
    public CostTypeGroupHandle createCostTypeGroupHandle() {
        return new CostTypeGroupHandle();
    }

    /**
     * Create an instance of {@link OrderSetExchangeRate }
     * 
     */
    public OrderSetExchangeRate createOrderSetExchangeRate() {
        return new OrderSetExchangeRate();
    }

    /**
     * Create an instance of {@link OrderLineSetDescriptionResponse }
     * 
     */
    public OrderLineSetDescriptionResponse createOrderLineSetDescriptionResponse() {
        return new OrderLineSetDescriptionResponse();
    }

    /**
     * Create an instance of {@link ProductGroupGetProducts }
     * 
     */
    public ProductGroupGetProducts createProductGroupGetProducts() {
        return new ProductGroupGetProducts();
    }

    /**
     * Create an instance of {@link BudgetFigureCreateFromData }
     * 
     */
    public BudgetFigureCreateFromData createBudgetFigureCreateFromData() {
        return new BudgetFigureCreateFromData();
    }

    /**
     * Create an instance of {@link BudgetFigureData }
     * 
     */
    public BudgetFigureData createBudgetFigureData() {
        return new BudgetFigureData();
    }

    /**
     * Create an instance of {@link SubscriptionLineUpdateFromDataArray }
     * 
     */
    public SubscriptionLineUpdateFromDataArray createSubscriptionLineUpdateFromDataArray() {
        return new SubscriptionLineUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfSubscriptionLineData }
     * 
     */
    public ArrayOfSubscriptionLineData createArrayOfSubscriptionLineData() {
        return new ArrayOfSubscriptionLineData();
    }

    /**
     * Create an instance of {@link DeliveryLocationCreate }
     * 
     */
    public DeliveryLocationCreate createDeliveryLocationCreate() {
        return new DeliveryLocationCreate();
    }

    /**
     * Create an instance of {@link ProductCreateFromData }
     * 
     */
    public ProductCreateFromData createProductCreateFromData() {
        return new ProductCreateFromData();
    }

    /**
     * Create an instance of {@link ProductData }
     * 
     */
    public ProductData createProductData() {
        return new ProductData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDeliveryCountryResponse }
     * 
     */
    public CurrentInvoiceGetDeliveryCountryResponse createCurrentInvoiceGetDeliveryCountryResponse() {
        return new CurrentInvoiceGetDeliveryCountryResponse();
    }

    /**
     * Create an instance of {@link QuotationGetIsSent }
     * 
     */
    public QuotationGetIsSent createQuotationGetIsSent() {
        return new QuotationGetIsSent();
    }

    /**
     * Create an instance of {@link CashBookEntryGetDueDate }
     * 
     */
    public CashBookEntryGetDueDate createCashBookEntryGetDueDate() {
        return new CashBookEntryGetDueDate();
    }

    /**
     * Create an instance of {@link QuotationFindByNumberResponse }
     * 
     */
    public QuotationFindByNumberResponse createQuotationFindByNumberResponse() {
        return new QuotationFindByNumberResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetHeadingResponse }
     * 
     */
    public CurrentInvoiceGetHeadingResponse createCurrentInvoiceGetHeadingResponse() {
        return new CurrentInvoiceGetHeadingResponse();
    }

    /**
     * Create an instance of {@link ProductSetName }
     * 
     */
    public ProductSetName createProductSetName() {
        return new ProductSetName();
    }

    /**
     * Create an instance of {@link InvoiceGetDebtor }
     * 
     */
    public InvoiceGetDebtor createInvoiceGetDebtor() {
        return new InvoiceGetDebtor();
    }

    /**
     * Create an instance of {@link ProductSetRecommendedPriceResponse }
     * 
     */
    public ProductSetRecommendedPriceResponse createProductSetRecommendedPriceResponse() {
        return new ProductSetRecommendedPriceResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetUnitCostPrice }
     * 
     */
    public OrderLineGetUnitCostPrice createOrderLineGetUnitCostPrice() {
        return new OrderLineGetUnitCostPrice();
    }

    /**
     * Create an instance of {@link CashBookEntrySetDebtorInvoiceNumber }
     * 
     */
    public CashBookEntrySetDebtorInvoiceNumber createCashBookEntrySetDebtorInvoiceNumber() {
        return new CashBookEntrySetDebtorInvoiceNumber();
    }

    /**
     * Create an instance of {@link QuotationGetLines }
     * 
     */
    public QuotationGetLines createQuotationGetLines() {
        return new QuotationGetLines();
    }

    /**
     * Create an instance of {@link OrderSetDebtorEanResponse }
     * 
     */
    public OrderSetDebtorEanResponse createOrderSetDebtorEanResponse() {
        return new OrderSetDebtorEanResponse();
    }

    /**
     * Create an instance of {@link AccountGetVatAccountResponse }
     * 
     */
    public AccountGetVatAccountResponse createAccountGetVatAccountResponse() {
        return new AccountGetVatAccountResponse();
    }

    /**
     * Create an instance of {@link VatAccountHandle }
     * 
     */
    public VatAccountHandle createVatAccountHandle() {
        return new VatAccountHandle();
    }

    /**
     * Create an instance of {@link QuotationLineGetAll }
     * 
     */
    public QuotationLineGetAll createQuotationLineGetAll() {
        return new QuotationLineGetAll();
    }

    /**
     * Create an instance of {@link DebtorFindByCINumberResponse }
     * 
     */
    public DebtorFindByCINumberResponse createDebtorFindByCINumberResponse() {
        return new DebtorFindByCINumberResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDebtorHandle }
     * 
     */
    public ArrayOfDebtorHandle createArrayOfDebtorHandle() {
        return new ArrayOfDebtorHandle();
    }

    /**
     * Create an instance of {@link CreditorContactGetDataArrayResponse }
     * 
     */
    public CreditorContactGetDataArrayResponse createCreditorContactGetDataArrayResponse() {
        return new CreditorContactGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCreditorContactData }
     * 
     */
    public ArrayOfCreditorContactData createArrayOfCreditorContactData() {
        return new ArrayOfCreditorContactData();
    }

    /**
     * Create an instance of {@link TimeEntryGetDateResponse }
     * 
     */
    public TimeEntryGetDateResponse createTimeEntryGetDateResponse() {
        return new TimeEntryGetDateResponse();
    }

    /**
     * Create an instance of {@link ProductSetSalesPrice }
     * 
     */
    public ProductSetSalesPrice createProductSetSalesPrice() {
        return new ProductSetSalesPrice();
    }

    /**
     * Create an instance of {@link DeliveryLocationSetExternalIdResponse }
     * 
     */
    public DeliveryLocationSetExternalIdResponse createDeliveryLocationSetExternalIdResponse() {
        return new DeliveryLocationSetExternalIdResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetDescriptionResponse }
     * 
     */
    public OrderLineGetDescriptionResponse createOrderLineGetDescriptionResponse() {
        return new OrderLineGetDescriptionResponse();
    }

    /**
     * Create an instance of {@link AccountFindByNumberResponse }
     * 
     */
    public AccountFindByNumberResponse createAccountFindByNumberResponse() {
        return new AccountFindByNumberResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetData }
     * 
     */
    public OrderLineGetData createOrderLineGetData() {
        return new OrderLineGetData();
    }

    /**
     * Create an instance of {@link CreditorEntryFindBySerialNumber }
     * 
     */
    public CreditorEntryFindBySerialNumber createCreditorEntryFindBySerialNumber() {
        return new CreditorEntryFindBySerialNumber();
    }

    /**
     * Create an instance of {@link MileageEntryGetApprovedResponse }
     * 
     */
    public MileageEntryGetApprovedResponse createMileageEntryGetApprovedResponse() {
        return new MileageEntryGetApprovedResponse();
    }

    /**
     * Create an instance of {@link DebtorGetAllUpdated }
     * 
     */
    public DebtorGetAllUpdated createDebtorGetAllUpdated() {
        return new DebtorGetAllUpdated();
    }

    /**
     * Create an instance of {@link AccountGetEntryTotalsByDate }
     * 
     */
    public AccountGetEntryTotalsByDate createAccountGetEntryTotalsByDate() {
        return new AccountGetEntryTotalsByDate();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceCreateFromDataArrayResponse }
     * 
     */
    public CurrentSupplierInvoiceCreateFromDataArrayResponse createCurrentSupplierInvoiceCreateFromDataArrayResponse() {
        return new CurrentSupplierInvoiceCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCurrentSupplierInvoiceHandle }
     * 
     */
    public ArrayOfCurrentSupplierInvoiceHandle createArrayOfCurrentSupplierInvoiceHandle() {
        return new ArrayOfCurrentSupplierInvoiceHandle();
    }

    /**
     * Create an instance of {@link CreditorSetEmailResponse }
     * 
     */
    public CreditorSetEmailResponse createCreditorSetEmailResponse() {
        return new CreditorSetEmailResponse();
    }

    /**
     * Create an instance of {@link PriceGroupGetDataResponse }
     * 
     */
    public PriceGroupGetDataResponse createPriceGroupGetDataResponse() {
        return new PriceGroupGetDataResponse();
    }

    /**
     * Create an instance of {@link PriceGroupData }
     * 
     */
    public PriceGroupData createPriceGroupData() {
        return new PriceGroupData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetLayout }
     * 
     */
    public CurrentInvoiceGetLayout createCurrentInvoiceGetLayout() {
        return new CurrentInvoiceGetLayout();
    }

    /**
     * Create an instance of {@link OrderGetNumber }
     * 
     */
    public OrderGetNumber createOrderGetNumber() {
        return new OrderGetNumber();
    }

    /**
     * Create an instance of {@link QuotationSetTermsOfDeliveryResponse }
     * 
     */
    public QuotationSetTermsOfDeliveryResponse createQuotationSetTermsOfDeliveryResponse() {
        return new QuotationSetTermsOfDeliveryResponse();
    }

    /**
     * Create an instance of {@link DebtorContactGetDataArray }
     * 
     */
    public DebtorContactGetDataArray createDebtorContactGetDataArray() {
        return new DebtorContactGetDataArray();
    }

    /**
     * Create an instance of {@link CompanySetAddress1Response }
     * 
     */
    public CompanySetAddress1Response createCompanySetAddress1Response() {
        return new CompanySetAddress1Response();
    }

    /**
     * Create an instance of {@link OrderSetDebtorCity }
     * 
     */
    public OrderSetDebtorCity createOrderSetDebtorCity() {
        return new OrderSetDebtorCity();
    }

    /**
     * Create an instance of {@link QuotationGetYourReferenceResponse }
     * 
     */
    public QuotationGetYourReferenceResponse createQuotationGetYourReferenceResponse() {
        return new QuotationGetYourReferenceResponse();
    }

    /**
     * Create an instance of {@link QuotationFindByNumber }
     * 
     */
    public QuotationFindByNumber createQuotationFindByNumber() {
        return new QuotationFindByNumber();
    }

    /**
     * Create an instance of {@link OrderGetPublicEntryNumberResponse }
     * 
     */
    public OrderGetPublicEntryNumberResponse createOrderGetPublicEntryNumberResponse() {
        return new OrderGetPublicEntryNumberResponse();
    }

    /**
     * Create an instance of {@link EntryReverseVoucherResponse }
     * 
     */
    public EntryReverseVoucherResponse createEntryReverseVoucherResponse() {
        return new EntryReverseVoucherResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCashBookEntryHandle }
     * 
     */
    public ArrayOfCashBookEntryHandle createArrayOfCashBookEntryHandle() {
        return new ArrayOfCashBookEntryHandle();
    }

    /**
     * Create an instance of {@link QuotationRegisterAsSentResponse }
     * 
     */
    public QuotationRegisterAsSentResponse createQuotationRegisterAsSentResponse() {
        return new QuotationRegisterAsSentResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetOtherReference }
     * 
     */
    public CurrentInvoiceSetOtherReference createCurrentInvoiceSetOtherReference() {
        return new CurrentInvoiceSetOtherReference();
    }

    /**
     * Create an instance of {@link SubscriberSetProject }
     * 
     */
    public SubscriberSetProject createSubscriberSetProject() {
        return new SubscriberSetProject();
    }

    /**
     * Create an instance of {@link MileageEntryCreateFromDataResponse }
     * 
     */
    public MileageEntryCreateFromDataResponse createMileageEntryCreateFromDataResponse() {
        return new MileageEntryCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link MileageEntryHandle }
     * 
     */
    public MileageEntryHandle createMileageEntryHandle() {
        return new MileageEntryHandle();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetQuantity }
     * 
     */
    public CurrentInvoiceLineSetQuantity createCurrentInvoiceLineSetQuantity() {
        return new CurrentInvoiceLineSetQuantity();
    }

    /**
     * Create an instance of {@link QuotationGetAttentionResponse }
     * 
     */
    public QuotationGetAttentionResponse createQuotationGetAttentionResponse() {
        return new QuotationGetAttentionResponse();
    }

    /**
     * Create an instance of {@link CreditorSetPostalCode }
     * 
     */
    public CreditorSetPostalCode createCreditorSetPostalCode() {
        return new CreditorSetPostalCode();
    }

    /**
     * Create an instance of {@link DebtorGetCountryResponse }
     * 
     */
    public DebtorGetCountryResponse createDebtorGetCountryResponse() {
        return new DebtorGetCountryResponse();
    }

    /**
     * Create an instance of {@link DebtorContactDelete }
     * 
     */
    public DebtorContactDelete createDebtorContactDelete() {
        return new DebtorContactDelete();
    }

    /**
     * Create an instance of {@link OrderLineGetQuantity }
     * 
     */
    public OrderLineGetQuantity createOrderLineGetQuantity() {
        return new OrderLineGetQuantity();
    }

    /**
     * Create an instance of {@link KeyFigureCodeFindByNameResponse }
     * 
     */
    public KeyFigureCodeFindByNameResponse createKeyFigureCodeFindByNameResponse() {
        return new KeyFigureCodeFindByNameResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetPublicEntryNumberResponse }
     * 
     */
    public InvoiceGetPublicEntryNumberResponse createInvoiceGetPublicEntryNumberResponse() {
        return new InvoiceGetPublicEntryNumberResponse();
    }

    /**
     * Create an instance of {@link CurrencyGetDataResponse }
     * 
     */
    public CurrencyGetDataResponse createCurrencyGetDataResponse() {
        return new CurrencyGetDataResponse();
    }

    /**
     * Create an instance of {@link CurrencyData }
     * 
     */
    public CurrencyData createCurrencyData() {
        return new CurrencyData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDeliveryDate }
     * 
     */
    public CurrentInvoiceSetDeliveryDate createCurrentInvoiceSetDeliveryDate() {
        return new CurrentInvoiceSetDeliveryDate();
    }

    /**
     * Create an instance of {@link AccountGetNumber }
     * 
     */
    public AccountGetNumber createAccountGetNumber() {
        return new AccountGetNumber();
    }

    /**
     * Create an instance of {@link CashBookEntrySetTextResponse }
     * 
     */
    public CashBookEntrySetTextResponse createCashBookEntrySetTextResponse() {
        return new CashBookEntrySetTextResponse();
    }

    /**
     * Create an instance of {@link AccountSetTypeResponse }
     * 
     */
    public AccountSetTypeResponse createAccountSetTypeResponse() {
        return new AccountSetTypeResponse();
    }

    /**
     * Create an instance of {@link DistributionKeyGetDepartments }
     * 
     */
    public DistributionKeyGetDepartments createDistributionKeyGetDepartments() {
        return new DistributionKeyGetDepartments();
    }

    /**
     * Create an instance of {@link MileageEntryGetDistanceResponse }
     * 
     */
    public MileageEntryGetDistanceResponse createMileageEntryGetDistanceResponse() {
        return new MileageEntryGetDistanceResponse();
    }

    /**
     * Create an instance of {@link AccountSetIsAccessible }
     * 
     */
    public AccountSetIsAccessible createAccountSetIsAccessible() {
        return new AccountSetIsAccessible();
    }

    /**
     * Create an instance of {@link SubscriptionLineFindByProductListResponse }
     * 
     */
    public SubscriptionLineFindByProductListResponse createSubscriptionLineFindByProductListResponse() {
        return new SubscriptionLineFindByProductListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSubscriptionLineHandle }
     * 
     */
    public ArrayOfSubscriptionLineHandle createArrayOfSubscriptionLineHandle() {
        return new ArrayOfSubscriptionLineHandle();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetOtherReference }
     * 
     */
    public CurrentInvoiceGetOtherReference createCurrentInvoiceGetOtherReference() {
        return new CurrentInvoiceGetOtherReference();
    }

    /**
     * Create an instance of {@link AccountingYearGetIsClosed }
     * 
     */
    public AccountingYearGetIsClosed createAccountingYearGetIsClosed() {
        return new AccountingYearGetIsClosed();
    }

    /**
     * Create an instance of {@link EmployeeGetGroupResponse }
     * 
     */
    public EmployeeGetGroupResponse createEmployeeGetGroupResponse() {
        return new EmployeeGetGroupResponse();
    }

    /**
     * Create an instance of {@link CashBookEntrySetDueDateResponse }
     * 
     */
    public CashBookEntrySetDueDateResponse createCashBookEntrySetDueDateResponse() {
        return new CashBookEntrySetDueDateResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineGetDataArrayResponse }
     * 
     */
    public InvoiceLineGetDataArrayResponse createInvoiceLineGetDataArrayResponse() {
        return new InvoiceLineGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInvoiceLineData }
     * 
     */
    public ArrayOfInvoiceLineData createArrayOfInvoiceLineData() {
        return new ArrayOfInvoiceLineData();
    }

    /**
     * Create an instance of {@link SubscriberGetDataArrayResponse }
     * 
     */
    public SubscriberGetDataArrayResponse createSubscriberGetDataArrayResponse() {
        return new SubscriberGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSubscriberData }
     * 
     */
    public ArrayOfSubscriberData createArrayOfSubscriberData() {
        return new ArrayOfSubscriberData();
    }

    /**
     * Create an instance of {@link AccountUpdateFromDataArrayResponse }
     * 
     */
    public AccountUpdateFromDataArrayResponse createAccountUpdateFromDataArrayResponse() {
        return new AccountUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link EntryReverseVoucher }
     * 
     */
    public EntryReverseVoucher createEntryReverseVoucher() {
        return new EntryReverseVoucher();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineUpdateFromDataArray }
     * 
     */
    public CurrentSupplierInvoiceLineUpdateFromDataArray createCurrentSupplierInvoiceLineUpdateFromDataArray() {
        return new CurrentSupplierInvoiceLineUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfCurrentSupplierInvoiceLineData }
     * 
     */
    public ArrayOfCurrentSupplierInvoiceLineData createArrayOfCurrentSupplierInvoiceLineData() {
        return new ArrayOfCurrentSupplierInvoiceLineData();
    }

    /**
     * Create an instance of {@link CompanySetAddress2 }
     * 
     */
    public CompanySetAddress2 createCompanySetAddress2() {
        return new CompanySetAddress2();
    }

    /**
     * Create an instance of {@link ProductGroupUpdateFromDataResponse }
     * 
     */
    public ProductGroupUpdateFromDataResponse createProductGroupUpdateFromDataResponse() {
        return new ProductGroupUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link CompanySetAddress1 }
     * 
     */
    public CompanySetAddress1 createCompanySetAddress1() {
        return new CompanySetAddress1();
    }

    /**
     * Create an instance of {@link SubscriberGetDiscountExpiryDateResponse }
     * 
     */
    public SubscriberGetDiscountExpiryDateResponse createSubscriberGetDiscountExpiryDateResponse() {
        return new SubscriberGetDiscountExpiryDateResponse();
    }

    /**
     * Create an instance of {@link DebtorFindByName }
     * 
     */
    public DebtorFindByName createDebtorFindByName() {
        return new DebtorFindByName();
    }

    /**
     * Create an instance of {@link CostTypeGroupGetAccountOngoing }
     * 
     */
    public CostTypeGroupGetAccountOngoing createCostTypeGroupGetAccountOngoing() {
        return new CostTypeGroupGetAccountOngoing();
    }

    /**
     * Create an instance of {@link QuotationSetYourReference }
     * 
     */
    public QuotationSetYourReference createQuotationSetYourReference() {
        return new QuotationSetYourReference();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetNoteResponse }
     * 
     */
    public ScannedDocumentGetNoteResponse createScannedDocumentGetNoteResponse() {
        return new ScannedDocumentGetNoteResponse();
    }

    /**
     * Create an instance of {@link DistributionKeyGetPercentagesResponse }
     * 
     */
    public DistributionKeyGetPercentagesResponse createDistributionKeyGetPercentagesResponse() {
        return new DistributionKeyGetPercentagesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDecimal }
     * 
     */
    public ArrayOfDecimal createArrayOfDecimal() {
        return new ArrayOfDecimal();
    }

    /**
     * Create an instance of {@link DebtorSetVatNumber }
     * 
     */
    public DebtorSetVatNumber createDebtorSetVatNumber() {
        return new DebtorSetVatNumber();
    }

    /**
     * Create an instance of {@link PriceGroupGetNameResponse }
     * 
     */
    public PriceGroupGetNameResponse createPriceGroupGetNameResponse() {
        return new PriceGroupGetNameResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineUpdateFromData }
     * 
     */
    public CurrentInvoiceLineUpdateFromData createCurrentInvoiceLineUpdateFromData() {
        return new CurrentInvoiceLineUpdateFromData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineData }
     * 
     */
    public CurrentInvoiceLineData createCurrentInvoiceLineData() {
        return new CurrentInvoiceLineData();
    }

    /**
     * Create an instance of {@link AccountGetIsAccessible }
     * 
     */
    public AccountGetIsAccessible createAccountGetIsAccessible() {
        return new AccountGetIsAccessible();
    }

    /**
     * Create an instance of {@link EmployeeGroupGetDataArray }
     * 
     */
    public EmployeeGroupGetDataArray createEmployeeGroupGetDataArray() {
        return new EmployeeGroupGetDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfEmployeeGroupHandle }
     * 
     */
    public ArrayOfEmployeeGroupHandle createArrayOfEmployeeGroupHandle() {
        return new ArrayOfEmployeeGroupHandle();
    }

    /**
     * Create an instance of {@link TimeEntryUpdateFromDataResponse }
     * 
     */
    public TimeEntryUpdateFromDataResponse createTimeEntryUpdateFromDataResponse() {
        return new TimeEntryUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetVoucherNumberResponse }
     * 
     */
    public ScannedDocumentGetVoucherNumberResponse createScannedDocumentGetVoucherNumberResponse() {
        return new ScannedDocumentGetVoucherNumberResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineGetData }
     * 
     */
    public InvoiceLineGetData createInvoiceLineGetData() {
        return new InvoiceLineGetData();
    }

    /**
     * Create an instance of {@link InvoiceLineHandle }
     * 
     */
    public InvoiceLineHandle createInvoiceLineHandle() {
        return new InvoiceLineHandle();
    }

    /**
     * Create an instance of {@link EmployeeGroupFindByNumberResponse }
     * 
     */
    public EmployeeGroupFindByNumberResponse createEmployeeGroupFindByNumberResponse() {
        return new EmployeeGroupFindByNumberResponse();
    }

    /**
     * Create an instance of {@link QuotationGetDueDateResponse }
     * 
     */
    public QuotationGetDueDateResponse createQuotationGetDueDateResponse() {
        return new QuotationGetDueDateResponse();
    }

    /**
     * Create an instance of {@link DepartmentUpdateFromDataArray }
     * 
     */
    public DepartmentUpdateFromDataArray createDepartmentUpdateFromDataArray() {
        return new DepartmentUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfDepartmentData }
     * 
     */
    public ArrayOfDepartmentData createArrayOfDepartmentData() {
        return new ArrayOfDepartmentData();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetDataResponse }
     * 
     */
    public DeliveryLocationGetDataResponse createDeliveryLocationGetDataResponse() {
        return new DeliveryLocationGetDataResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationData }
     * 
     */
    public DeliveryLocationData createDeliveryLocationData() {
        return new DeliveryLocationData();
    }

    /**
     * Create an instance of {@link DebtorEntryGetInvoiceNumberResponse }
     * 
     */
    public DebtorEntryGetInvoiceNumberResponse createDebtorEntryGetInvoiceNumberResponse() {
        return new DebtorEntryGetInvoiceNumberResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureSetAccountResponse }
     * 
     */
    public BudgetFigureSetAccountResponse createBudgetFigureSetAccountResponse() {
        return new BudgetFigureSetAccountResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDebtorAddress }
     * 
     */
    public CurrentInvoiceGetDebtorAddress createCurrentInvoiceGetDebtorAddress() {
        return new CurrentInvoiceGetDebtorAddress();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetInventoryLocation }
     * 
     */
    public CurrentInvoiceLineGetInventoryLocation createCurrentInvoiceLineGetInventoryLocation() {
        return new CurrentInvoiceLineGetInventoryLocation();
    }

    /**
     * Create an instance of {@link SubscriberGetDiscountExpiryDate }
     * 
     */
    public SubscriberGetDiscountExpiryDate createSubscriberGetDiscountExpiryDate() {
        return new SubscriberGetDiscountExpiryDate();
    }

    /**
     * Create an instance of {@link UnitGetDataResponse }
     * 
     */
    public UnitGetDataResponse createUnitGetDataResponse() {
        return new UnitGetDataResponse();
    }

    /**
     * Create an instance of {@link UnitData }
     * 
     */
    public UnitData createUnitData() {
        return new UnitData();
    }

    /**
     * Create an instance of {@link AccountSetDistributionKey }
     * 
     */
    public AccountSetDistributionKey createAccountSetDistributionKey() {
        return new AccountSetDistributionKey();
    }

    /**
     * Create an instance of {@link QuotationSetDueDateResponse }
     * 
     */
    public QuotationSetDueDateResponse createQuotationSetDueDateResponse() {
        return new QuotationSetDueDateResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetUnitNetPrice }
     * 
     */
    public OrderLineGetUnitNetPrice createOrderLineGetUnitNetPrice() {
        return new OrderLineGetUnitNetPrice();
    }

    /**
     * Create an instance of {@link SubscriberCreateFromDataArrayResponse }
     * 
     */
    public SubscriberCreateFromDataArrayResponse createSubscriberCreateFromDataArrayResponse() {
        return new SubscriberCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link EmployeeGetCostPrice }
     * 
     */
    public EmployeeGetCostPrice createEmployeeGetCostPrice() {
        return new EmployeeGetCostPrice();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetTermsOfDeliveryResponse }
     * 
     */
    public DeliveryLocationGetTermsOfDeliveryResponse createDeliveryLocationGetTermsOfDeliveryResponse() {
        return new DeliveryLocationGetTermsOfDeliveryResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationSetCountyResponse }
     * 
     */
    public DeliveryLocationSetCountyResponse createDeliveryLocationSetCountyResponse() {
        return new DeliveryLocationSetCountyResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetCurrency }
     * 
     */
    public CurrentInvoiceSetCurrency createCurrentInvoiceSetCurrency() {
        return new CurrentInvoiceSetCurrency();
    }

    /**
     * Create an instance of {@link CurrencyHandle }
     * 
     */
    public CurrencyHandle createCurrencyHandle() {
        return new CurrencyHandle();
    }

    /**
     * Create an instance of {@link InvoiceGetDataArray }
     * 
     */
    public InvoiceGetDataArray createInvoiceGetDataArray() {
        return new InvoiceGetDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfInvoiceHandle }
     * 
     */
    public ArrayOfInvoiceHandle createArrayOfInvoiceHandle() {
        return new ArrayOfInvoiceHandle();
    }

    /**
     * Create an instance of {@link DebtorGetDataArray }
     * 
     */
    public DebtorGetDataArray createDebtorGetDataArray() {
        return new DebtorGetDataArray();
    }

    /**
     * Create an instance of {@link CompanyUpdateFromDataArrayResponse }
     * 
     */
    public CompanyUpdateFromDataArrayResponse createCompanyUpdateFromDataArrayResponse() {
        return new CompanyUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCompanyHandle }
     * 
     */
    public ArrayOfCompanyHandle createArrayOfCompanyHandle() {
        return new ArrayOfCompanyHandle();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetToDate }
     * 
     */
    public ScannedDocumentGetToDate createScannedDocumentGetToDate() {
        return new ScannedDocumentGetToDate();
    }

    /**
     * Create an instance of {@link ScannedDocumentHandle }
     * 
     */
    public ScannedDocumentHandle createScannedDocumentHandle() {
        return new ScannedDocumentHandle();
    }

    /**
     * Create an instance of {@link OrderSetYourReference }
     * 
     */
    public OrderSetYourReference createOrderSetYourReference() {
        return new OrderSetYourReference();
    }

    /**
     * Create an instance of {@link OrderSetHeadingResponse }
     * 
     */
    public OrderSetHeadingResponse createOrderSetHeadingResponse() {
        return new OrderSetHeadingResponse();
    }

    /**
     * Create an instance of {@link CreditorContactGetDataArray }
     * 
     */
    public CreditorContactGetDataArray createCreditorContactGetDataArray() {
        return new CreditorContactGetDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfCreditorContactHandle }
     * 
     */
    public ArrayOfCreditorContactHandle createArrayOfCreditorContactHandle() {
        return new ArrayOfCreditorContactHandle();
    }

    /**
     * Create an instance of {@link ReportCodeSetGetCodeSet }
     * 
     */
    public ReportCodeSetGetCodeSet createReportCodeSetGetCodeSet() {
        return new ReportCodeSetGetCodeSet();
    }

    /**
     * Create an instance of {@link OrderCancelSentStatusResponse }
     * 
     */
    public OrderCancelSentStatusResponse createOrderCancelSentStatusResponse() {
        return new OrderCancelSentStatusResponse();
    }

    /**
     * Create an instance of {@link DebtorEntryGetDataArray }
     * 
     */
    public DebtorEntryGetDataArray createDebtorEntryGetDataArray() {
        return new DebtorEntryGetDataArray();
    }

    /**
     * Create an instance of {@link CurrentInvoiceFindByOurReference }
     * 
     */
    public CurrentInvoiceFindByOurReference createCurrentInvoiceFindByOurReference() {
        return new CurrentInvoiceFindByOurReference();
    }

    /**
     * Create an instance of {@link ProductGetDataArrayResponse }
     * 
     */
    public ProductGetDataArrayResponse createProductGetDataArrayResponse() {
        return new ProductGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProductData }
     * 
     */
    public ArrayOfProductData createArrayOfProductData() {
        return new ArrayOfProductData();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryGetAllResponse }
     * 
     */
    public DocumentArchiveCategoryGetAllResponse createDocumentArchiveCategoryGetAllResponse() {
        return new DocumentArchiveCategoryGetAllResponse();
    }

    /**
     * Create an instance of {@link ProjectGetEntriesByDateResponse }
     * 
     */
    public ProjectGetEntriesByDateResponse createProjectGetEntriesByDateResponse() {
        return new ProjectGetEntriesByDateResponse();
    }

    /**
     * Create an instance of {@link MileageEntryGetSalesPrice }
     * 
     */
    public MileageEntryGetSalesPrice createMileageEntryGetSalesPrice() {
        return new MileageEntryGetSalesPrice();
    }

    /**
     * Create an instance of {@link QuotationLineGetQuantity }
     * 
     */
    public QuotationLineGetQuantity createQuotationLineGetQuantity() {
        return new QuotationLineGetQuantity();
    }

    /**
     * Create an instance of {@link QuotationLineHandle }
     * 
     */
    public QuotationLineHandle createQuotationLineHandle() {
        return new QuotationLineHandle();
    }

    /**
     * Create an instance of {@link AccountFindByNumber }
     * 
     */
    public AccountFindByNumber createAccountFindByNumber() {
        return new AccountFindByNumber();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetProductResponse }
     * 
     */
    public SubscriptionLineGetProductResponse createSubscriptionLineGetProductResponse() {
        return new SubscriptionLineGetProductResponse();
    }

    /**
     * Create an instance of {@link ProductPriceGetCurrency }
     * 
     */
    public ProductPriceGetCurrency createProductPriceGetCurrency() {
        return new ProductPriceGetCurrency();
    }

    /**
     * Create an instance of {@link ProductPriceHandle }
     * 
     */
    public ProductPriceHandle createProductPriceHandle() {
        return new ProductPriceHandle();
    }

    /**
     * Create an instance of {@link CashBookEntrySetDateResponse }
     * 
     */
    public CashBookEntrySetDateResponse createCashBookEntrySetDateResponse() {
        return new CashBookEntrySetDateResponse();
    }

    /**
     * Create an instance of {@link OrderGetIsArchived }
     * 
     */
    public OrderGetIsArchived createOrderGetIsArchived() {
        return new OrderGetIsArchived();
    }

    /**
     * Create an instance of {@link SubscriptionLineSetSpecialPriceResponse }
     * 
     */
    public SubscriptionLineSetSpecialPriceResponse createSubscriptionLineSetSpecialPriceResponse() {
        return new SubscriptionLineSetSpecialPriceResponse();
    }

    /**
     * Create an instance of {@link VatAccountGetRateAsPercentResponse }
     * 
     */
    public VatAccountGetRateAsPercentResponse createVatAccountGetRateAsPercentResponse() {
        return new VatAccountGetRateAsPercentResponse();
    }

    /**
     * Create an instance of {@link QuotationLineSetInventoryLocationResponse }
     * 
     */
    public QuotationLineSetInventoryLocationResponse createQuotationLineSetInventoryLocationResponse() {
        return new QuotationLineSetInventoryLocationResponse();
    }

    /**
     * Create an instance of {@link DebtorGroupCreateFromDataArrayResponse }
     * 
     */
    public DebtorGroupCreateFromDataArrayResponse createDebtorGroupCreateFromDataArrayResponse() {
        return new DebtorGroupCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDeliveryPostalCodeResponse }
     * 
     */
    public CurrentInvoiceSetDeliveryPostalCodeResponse createCurrentInvoiceSetDeliveryPostalCodeResponse() {
        return new CurrentInvoiceSetDeliveryPostalCodeResponse();
    }

    /**
     * Create an instance of {@link DebtorEntryGetAmountDefaultCurrencyResponse }
     * 
     */
    public DebtorEntryGetAmountDefaultCurrencyResponse createDebtorEntryGetAmountDefaultCurrencyResponse() {
        return new DebtorEntryGetAmountDefaultCurrencyResponse();
    }

    /**
     * Create an instance of {@link CreditorContactGetExternalId }
     * 
     */
    public CreditorContactGetExternalId createCreditorContactGetExternalId() {
        return new CreditorContactGetExternalId();
    }

    /**
     * Create an instance of {@link TermOfPaymentCreate }
     * 
     */
    public TermOfPaymentCreate createTermOfPaymentCreate() {
        return new TermOfPaymentCreate();
    }

    /**
     * Create an instance of {@link DebtorContactGetComments }
     * 
     */
    public DebtorContactGetComments createDebtorContactGetComments() {
        return new DebtorContactGetComments();
    }

    /**
     * Create an instance of {@link InvoiceLineGetUnit }
     * 
     */
    public InvoiceLineGetUnit createInvoiceLineGetUnit() {
        return new InvoiceLineGetUnit();
    }

    /**
     * Create an instance of {@link CompanyGetCINumberResponse }
     * 
     */
    public CompanyGetCINumberResponse createCompanyGetCINumberResponse() {
        return new CompanyGetCINumberResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineGetDiscountAsPercentResponse }
     * 
     */
    public InvoiceLineGetDiscountAsPercentResponse createInvoiceLineGetDiscountAsPercentResponse() {
        return new InvoiceLineGetDiscountAsPercentResponse();
    }

    /**
     * Create an instance of {@link CompanyGetTelephoneNumber }
     * 
     */
    public CompanyGetTelephoneNumber createCompanyGetTelephoneNumber() {
        return new CompanyGetTelephoneNumber();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineUpdateFromDataResponse }
     * 
     */
    public CurrentInvoiceLineUpdateFromDataResponse createCurrentInvoiceLineUpdateFromDataResponse() {
        return new CurrentInvoiceLineUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineGetDescriptionResponse }
     * 
     */
    public InvoiceLineGetDescriptionResponse createInvoiceLineGetDescriptionResponse() {
        return new InvoiceLineGetDescriptionResponse();
    }

    /**
     * Create an instance of {@link DebtorGetCountyResponse }
     * 
     */
    public DebtorGetCountyResponse createDebtorGetCountyResponse() {
        return new DebtorGetCountyResponse();
    }

    /**
     * Create an instance of {@link QuotationLineDeleteResponse }
     * 
     */
    public QuotationLineDeleteResponse createQuotationLineDeleteResponse() {
        return new QuotationLineDeleteResponse();
    }

    /**
     * Create an instance of {@link CreditorContactCreateFromDataResponse }
     * 
     */
    public CreditorContactCreateFromDataResponse createCreditorContactCreateFromDataResponse() {
        return new CreditorContactCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link AccountUpdateFromDataArray }
     * 
     */
    public AccountUpdateFromDataArray createAccountUpdateFromDataArray() {
        return new AccountUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetTotalNetAmountResponse }
     * 
     */
    public CurrentInvoiceLineGetTotalNetAmountResponse createCurrentInvoiceLineGetTotalNetAmountResponse() {
        return new CurrentInvoiceLineGetTotalNetAmountResponse();
    }

    /**
     * Create an instance of {@link CreditorGetCurrency }
     * 
     */
    public CreditorGetCurrency createCreditorGetCurrency() {
        return new CreditorGetCurrency();
    }

    /**
     * Create an instance of {@link CashBookEntrySetDistributionKey }
     * 
     */
    public CashBookEntrySetDistributionKey createCashBookEntrySetDistributionKey() {
        return new CashBookEntrySetDistributionKey();
    }

    /**
     * Create an instance of {@link SubscriberGetData }
     * 
     */
    public SubscriberGetData createSubscriberGetData() {
        return new SubscriberGetData();
    }

    /**
     * Create an instance of {@link ProjectGetMileageEntriesByDateResponse }
     * 
     */
    public ProjectGetMileageEntriesByDateResponse createProjectGetMileageEntriesByDateResponse() {
        return new ProjectGetMileageEntriesByDateResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMileageEntryHandle }
     * 
     */
    public ArrayOfMileageEntryHandle createArrayOfMileageEntryHandle() {
        return new ArrayOfMileageEntryHandle();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetAll }
     * 
     */
    public ScannedDocumentGetAll createScannedDocumentGetAll() {
        return new ScannedDocumentGetAll();
    }

    /**
     * Create an instance of {@link DeliveryLocationSetIsAccessible }
     * 
     */
    public DeliveryLocationSetIsAccessible createDeliveryLocationSetIsAccessible() {
        return new DeliveryLocationSetIsAccessible();
    }

    /**
     * Create an instance of {@link DebtorGetDataArrayResponse }
     * 
     */
    public DebtorGetDataArrayResponse createDebtorGetDataArrayResponse() {
        return new DebtorGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDebtorData }
     * 
     */
    public ArrayOfDebtorData createArrayOfDebtorData() {
        return new ArrayOfDebtorData();
    }

    /**
     * Create an instance of {@link EntryGetDepartmentResponse }
     * 
     */
    public EntryGetDepartmentResponse createEntryGetDepartmentResponse() {
        return new EntryGetDepartmentResponse();
    }

    /**
     * Create an instance of {@link DebtorGroupGetDebtors }
     * 
     */
    public DebtorGroupGetDebtors createDebtorGroupGetDebtors() {
        return new DebtorGroupGetDebtors();
    }

    /**
     * Create an instance of {@link QuotationLineGetMarginAsPercentResponse }
     * 
     */
    public QuotationLineGetMarginAsPercentResponse createQuotationLineGetMarginAsPercentResponse() {
        return new QuotationLineGetMarginAsPercentResponse();
    }

    /**
     * Create an instance of {@link QuotationSetAttention }
     * 
     */
    public QuotationSetAttention createQuotationSetAttention() {
        return new QuotationSetAttention();
    }

    /**
     * Create an instance of {@link DistributionKeyFindByName }
     * 
     */
    public DistributionKeyFindByName createDistributionKeyFindByName() {
        return new DistributionKeyFindByName();
    }

    /**
     * Create an instance of {@link CreditorGroupGetAccountResponse }
     * 
     */
    public CreditorGroupGetAccountResponse createCreditorGroupGetAccountResponse() {
        return new CreditorGroupGetAccountResponse();
    }

    /**
     * Create an instance of {@link CreditorSetCurrency }
     * 
     */
    public CreditorSetCurrency createCreditorSetCurrency() {
        return new CreditorSetCurrency();
    }

    /**
     * Create an instance of {@link DebtorGetCINumber }
     * 
     */
    public DebtorGetCINumber createDebtorGetCINumber() {
        return new DebtorGetCINumber();
    }

    /**
     * Create an instance of {@link CashBookEntryGetBankPaymentCreditorInvoiceId }
     * 
     */
    public CashBookEntryGetBankPaymentCreditorInvoiceId createCashBookEntryGetBankPaymentCreditorInvoiceId() {
        return new CashBookEntryGetBankPaymentCreditorInvoiceId();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetOurReferenceResponse }
     * 
     */
    public CurrentInvoiceGetOurReferenceResponse createCurrentInvoiceGetOurReferenceResponse() {
        return new CurrentInvoiceGetOurReferenceResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetTermsOfDelivery }
     * 
     */
    public CurrentInvoiceSetTermsOfDelivery createCurrentInvoiceSetTermsOfDelivery() {
        return new CurrentInvoiceSetTermsOfDelivery();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetHeading }
     * 
     */
    public CurrentInvoiceSetHeading createCurrentInvoiceSetHeading() {
        return new CurrentInvoiceSetHeading();
    }

    /**
     * Create an instance of {@link CashBookEntrySetDepartmentResponse }
     * 
     */
    public CashBookEntrySetDepartmentResponse createCashBookEntrySetDepartmentResponse() {
        return new CashBookEntrySetDepartmentResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDebtorEanResponse }
     * 
     */
    public CurrentInvoiceSetDebtorEanResponse createCurrentInvoiceSetDebtorEanResponse() {
        return new CurrentInvoiceSetDebtorEanResponse();
    }

    /**
     * Create an instance of {@link ProjectGetOpenSubProjects }
     * 
     */
    public ProjectGetOpenSubProjects createProjectGetOpenSubProjects() {
        return new ProjectGetOpenSubProjects();
    }

    /**
     * Create an instance of {@link SubscriptionGetCalendarYearBasis }
     * 
     */
    public SubscriptionGetCalendarYearBasis createSubscriptionGetCalendarYearBasis() {
        return new SubscriptionGetCalendarYearBasis();
    }

    /**
     * Create an instance of {@link DepartmentCreateFromData }
     * 
     */
    public DepartmentCreateFromData createDepartmentCreateFromData() {
        return new DepartmentCreateFromData();
    }

    /**
     * Create an instance of {@link OrderUpgradeToInvoice }
     * 
     */
    public OrderUpgradeToInvoice createOrderUpgradeToInvoice() {
        return new OrderUpgradeToInvoice();
    }

    /**
     * Create an instance of {@link DebtorContactGetDebtor }
     * 
     */
    public DebtorContactGetDebtor createDebtorContactGetDebtor() {
        return new DebtorContactGetDebtor();
    }

    /**
     * Create an instance of {@link Connect }
     * 
     */
    public Connect createConnect() {
        return new Connect();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetUnitCostPrice }
     * 
     */
    public CurrentInvoiceLineGetUnitCostPrice createCurrentInvoiceLineGetUnitCostPrice() {
        return new CurrentInvoiceLineGetUnitCostPrice();
    }

    /**
     * Create an instance of {@link ProjectGetDataArrayResponse }
     * 
     */
    public ProjectGetDataArrayResponse createProjectGetDataArrayResponse() {
        return new ProjectGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProjectData }
     * 
     */
    public ArrayOfProjectData createArrayOfProjectData() {
        return new ArrayOfProjectData();
    }

    /**
     * Create an instance of {@link EntryCopyVoucherResponse }
     * 
     */
    public EntryCopyVoucherResponse createEntryCopyVoucherResponse() {
        return new EntryCopyVoucherResponse();
    }

    /**
     * Create an instance of {@link DepartmentFindByNumberResponse }
     * 
     */
    public DepartmentFindByNumberResponse createDepartmentFindByNumberResponse() {
        return new DepartmentFindByNumberResponse();
    }

    /**
     * Create an instance of {@link ProductGetUnit }
     * 
     */
    public ProductGetUnit createProductGetUnit() {
        return new ProductGetUnit();
    }

    /**
     * Create an instance of {@link UnitGetAllResponse }
     * 
     */
    public UnitGetAllResponse createUnitGetAllResponse() {
        return new UnitGetAllResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUnitHandle }
     * 
     */
    public ArrayOfUnitHandle createArrayOfUnitHandle() {
        return new ArrayOfUnitHandle();
    }

    /**
     * Create an instance of {@link OrderGetRoundingAmountResponse }
     * 
     */
    public OrderGetRoundingAmountResponse createOrderGetRoundingAmountResponse() {
        return new OrderGetRoundingAmountResponse();
    }

    /**
     * Create an instance of {@link CompanyGetDataArray }
     * 
     */
    public CompanyGetDataArray createCompanyGetDataArray() {
        return new CompanyGetDataArray();
    }

    /**
     * Create an instance of {@link MileageEntryGetDistance }
     * 
     */
    public MileageEntryGetDistance createMileageEntryGetDistance() {
        return new MileageEntryGetDistance();
    }

    /**
     * Create an instance of {@link TermOfPaymentCreateFromDataArray }
     * 
     */
    public TermOfPaymentCreateFromDataArray createTermOfPaymentCreateFromDataArray() {
        return new TermOfPaymentCreateFromDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfTermOfPaymentData }
     * 
     */
    public ArrayOfTermOfPaymentData createArrayOfTermOfPaymentData() {
        return new ArrayOfTermOfPaymentData();
    }

    /**
     * Create an instance of {@link AccountSetContraAccountResponse }
     * 
     */
    public AccountSetContraAccountResponse createAccountSetContraAccountResponse() {
        return new AccountSetContraAccountResponse();
    }

    /**
     * Create an instance of {@link QuotationGetDeliveryAddress }
     * 
     */
    public QuotationGetDeliveryAddress createQuotationGetDeliveryAddress() {
        return new QuotationGetDeliveryAddress();
    }

    /**
     * Create an instance of {@link UnitCreateFromData }
     * 
     */
    public UnitCreateFromData createUnitCreateFromData() {
        return new UnitCreateFromData();
    }

    /**
     * Create an instance of {@link ProjectGroupGetDataArrayResponse }
     * 
     */
    public ProjectGroupGetDataArrayResponse createProjectGroupGetDataArrayResponse() {
        return new ProjectGroupGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProjectGroupData }
     * 
     */
    public ArrayOfProjectGroupData createArrayOfProjectGroupData() {
        return new ArrayOfProjectGroupData();
    }

    /**
     * Create an instance of {@link ProductGroupCreate }
     * 
     */
    public ProductGroupCreate createProductGroupCreate() {
        return new ProductGroupCreate();
    }

    /**
     * Create an instance of {@link QuotationLineGetProductResponse }
     * 
     */
    public QuotationLineGetProductResponse createQuotationLineGetProductResponse() {
        return new QuotationLineGetProductResponse();
    }

    /**
     * Create an instance of {@link CostTypeGroupGetNameResponse }
     * 
     */
    public CostTypeGroupGetNameResponse createCostTypeGroupGetNameResponse() {
        return new CostTypeGroupGetNameResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryCreateFromDataResponse }
     * 
     */
    public CashBookEntryCreateFromDataResponse createCashBookEntryCreateFromDataResponse() {
        return new CashBookEntryCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link AccountGetDataResponse }
     * 
     */
    public AccountGetDataResponse createAccountGetDataResponse() {
        return new AccountGetDataResponse();
    }

    /**
     * Create an instance of {@link AccountData }
     * 
     */
    public AccountData createAccountData() {
        return new AccountData();
    }

    /**
     * Create an instance of {@link QuotationLineSetUnit }
     * 
     */
    public QuotationLineSetUnit createQuotationLineSetUnit() {
        return new QuotationLineSetUnit();
    }

    /**
     * Create an instance of {@link DebtorGetInvoicesResponse }
     * 
     */
    public DebtorGetInvoicesResponse createDebtorGetInvoicesResponse() {
        return new DebtorGetInvoicesResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetPdf }
     * 
     */
    public CurrentInvoiceGetPdf createCurrentInvoiceGetPdf() {
        return new CurrentInvoiceGetPdf();
    }

    /**
     * Create an instance of {@link DebtorGroupCreateFromDataArray }
     * 
     */
    public DebtorGroupCreateFromDataArray createDebtorGroupCreateFromDataArray() {
        return new DebtorGroupCreateFromDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfDebtorGroupData }
     * 
     */
    public ArrayOfDebtorGroupData createArrayOfDebtorGroupData() {
        return new ArrayOfDebtorGroupData();
    }

    /**
     * Create an instance of {@link OrderUpgradeToInvoiceResponse }
     * 
     */
    public OrderUpgradeToInvoiceResponse createOrderUpgradeToInvoiceResponse() {
        return new OrderUpgradeToInvoiceResponse();
    }

    /**
     * Create an instance of {@link DebtorGetAttentionResponse }
     * 
     */
    public DebtorGetAttentionResponse createDebtorGetAttentionResponse() {
        return new DebtorGetAttentionResponse();
    }

    /**
     * Create an instance of {@link ProductGetAll }
     * 
     */
    public ProductGetAll createProductGetAll() {
        return new ProductGetAll();
    }

    /**
     * Create an instance of {@link QuotationGetDebtorName }
     * 
     */
    public QuotationGetDebtorName createQuotationGetDebtorName() {
        return new QuotationGetDebtorName();
    }

    /**
     * Create an instance of {@link QuotationGetOurReferenceResponse }
     * 
     */
    public QuotationGetOurReferenceResponse createQuotationGetOurReferenceResponse() {
        return new QuotationGetOurReferenceResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetEmployeeResponse }
     * 
     */
    public CashBookEntryGetEmployeeResponse createCashBookEntryGetEmployeeResponse() {
        return new CashBookEntryGetEmployeeResponse();
    }

    /**
     * Create an instance of {@link EmployeeGetCostPriceAfterResponse }
     * 
     */
    public EmployeeGetCostPriceAfterResponse createEmployeeGetCostPriceAfterResponse() {
        return new EmployeeGetCostPriceAfterResponse();
    }

    /**
     * Create an instance of {@link QuotationSetLayout }
     * 
     */
    public QuotationSetLayout createQuotationSetLayout() {
        return new QuotationSetLayout();
    }

    /**
     * Create an instance of {@link DebtorContactGetIsToReceiveEmailCopyOfOrderResponse }
     * 
     */
    public DebtorContactGetIsToReceiveEmailCopyOfOrderResponse createDebtorContactGetIsToReceiveEmailCopyOfOrderResponse() {
        return new DebtorContactGetIsToReceiveEmailCopyOfOrderResponse();
    }

    /**
     * Create an instance of {@link DebtorEntryGetDueDateResponse }
     * 
     */
    public DebtorEntryGetDueDateResponse createDebtorEntryGetDueDateResponse() {
        return new DebtorEntryGetDueDateResponse();
    }

    /**
     * Create an instance of {@link OrderGetAllUpdatedResponse }
     * 
     */
    public OrderGetAllUpdatedResponse createOrderGetAllUpdatedResponse() {
        return new OrderGetAllUpdatedResponse();
    }

    /**
     * Create an instance of {@link CreditorFindByNumber }
     * 
     */
    public CreditorFindByNumber createCreditorFindByNumber() {
        return new CreditorFindByNumber();
    }

    /**
     * Create an instance of {@link PriceGroupCreate }
     * 
     */
    public PriceGroupCreate createPriceGroupCreate() {
        return new PriceGroupCreate();
    }

    /**
     * Create an instance of {@link ProductGroupGetNameResponse }
     * 
     */
    public ProductGroupGetNameResponse createProductGroupGetNameResponse() {
        return new ProductGroupGetNameResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureGetFromDateResponse }
     * 
     */
    public BudgetFigureGetFromDateResponse createBudgetFigureGetFromDateResponse() {
        return new BudgetFigureGetFromDateResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureSetDistributionKey }
     * 
     */
    public BudgetFigureSetDistributionKey createBudgetFigureSetDistributionKey() {
        return new BudgetFigureSetDistributionKey();
    }

    /**
     * Create an instance of {@link SumIntervalGetDataArrayResponse }
     * 
     */
    public SumIntervalGetDataArrayResponse createSumIntervalGetDataArrayResponse() {
        return new SumIntervalGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSumIntervalData }
     * 
     */
    public ArrayOfSumIntervalData createArrayOfSumIntervalData() {
        return new ArrayOfSumIntervalData();
    }

    /**
     * Create an instance of {@link QuotationLineSetDiscountAsPercent }
     * 
     */
    public QuotationLineSetDiscountAsPercent createQuotationLineSetDiscountAsPercent() {
        return new QuotationLineSetDiscountAsPercent();
    }

    /**
     * Create an instance of {@link InvoiceFindByOurReferenceResponse }
     * 
     */
    public InvoiceFindByOurReferenceResponse createInvoiceFindByOurReferenceResponse() {
        return new InvoiceFindByOurReferenceResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDebtorAddressResponse }
     * 
     */
    public CurrentInvoiceGetDebtorAddressResponse createCurrentInvoiceGetDebtorAddressResponse() {
        return new CurrentInvoiceGetDebtorAddressResponse();
    }

    /**
     * Create an instance of {@link QuotationSetDeliveryCityResponse }
     * 
     */
    public QuotationSetDeliveryCityResponse createQuotationSetDeliveryCityResponse() {
        return new QuotationSetDeliveryCityResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineGetVatAmountResponse }
     * 
     */
    public InvoiceLineGetVatAmountResponse createInvoiceLineGetVatAmountResponse() {
        return new InvoiceLineGetVatAmountResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDebtorCountyResponse }
     * 
     */
    public CurrentInvoiceGetDebtorCountyResponse createCurrentInvoiceGetDebtorCountyResponse() {
        return new CurrentInvoiceGetDebtorCountyResponse();
    }

    /**
     * Create an instance of {@link ProjectGetDescriptionResponse }
     * 
     */
    public ProjectGetDescriptionResponse createProjectGetDescriptionResponse() {
        return new ProjectGetDescriptionResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationCreateResponse }
     * 
     */
    public DeliveryLocationCreateResponse createDeliveryLocationCreateResponse() {
        return new DeliveryLocationCreateResponse();
    }

    /**
     * Create an instance of {@link DebtorGroupSetLayoutResponse }
     * 
     */
    public DebtorGroupSetLayoutResponse createDebtorGroupSetLayoutResponse() {
        return new DebtorGroupSetLayoutResponse();
    }

    /**
     * Create an instance of {@link OrderSetLayout }
     * 
     */
    public OrderSetLayout createOrderSetLayout() {
        return new OrderSetLayout();
    }

    /**
     * Create an instance of {@link OrderLineGetAll }
     * 
     */
    public OrderLineGetAll createOrderLineGetAll() {
        return new OrderLineGetAll();
    }

    /**
     * Create an instance of {@link CreditorEntryGetAmount }
     * 
     */
    public CreditorEntryGetAmount createCreditorEntryGetAmount() {
        return new CreditorEntryGetAmount();
    }

    /**
     * Create an instance of {@link ProjectGetIsMainProjectResponse }
     * 
     */
    public ProjectGetIsMainProjectResponse createProjectGetIsMainProjectResponse() {
        return new ProjectGetIsMainProjectResponse();
    }

    /**
     * Create an instance of {@link SumIntervalSetFromAccount }
     * 
     */
    public SumIntervalSetFromAccount createSumIntervalSetFromAccount() {
        return new SumIntervalSetFromAccount();
    }

    /**
     * Create an instance of {@link DistributionKeySetIsAccessible }
     * 
     */
    public DistributionKeySetIsAccessible createDistributionKeySetIsAccessible() {
        return new DistributionKeySetIsAccessible();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryFindByNumberResponse }
     * 
     */
    public DocumentArchiveCategoryFindByNumberResponse createDocumentArchiveCategoryFindByNumberResponse() {
        return new DocumentArchiveCategoryFindByNumberResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetUnitCostPriceResponse }
     * 
     */
    public OrderLineGetUnitCostPriceResponse createOrderLineGetUnitCostPriceResponse() {
        return new OrderLineGetUnitCostPriceResponse();
    }

    /**
     * Create an instance of {@link ProductGetNumberResponse }
     * 
     */
    public ProductGetNumberResponse createProductGetNumberResponse() {
        return new ProductGetNumberResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetDebtor }
     * 
     */
    public DeliveryLocationGetDebtor createDeliveryLocationGetDebtor() {
        return new DeliveryLocationGetDebtor();
    }

    /**
     * Create an instance of {@link SubscriptionSetAddPeriodResponse }
     * 
     */
    public SubscriptionSetAddPeriodResponse createSubscriptionSetAddPeriodResponse() {
        return new SubscriptionSetAddPeriodResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationSetCityResponse }
     * 
     */
    public DeliveryLocationSetCityResponse createDeliveryLocationSetCityResponse() {
        return new DeliveryLocationSetCityResponse();
    }

    /**
     * Create an instance of {@link DebtorGroupSetAccount }
     * 
     */
    public DebtorGroupSetAccount createDebtorGroupSetAccount() {
        return new DebtorGroupSetAccount();
    }

    /**
     * Create an instance of {@link SubscriptionGetNextAvailableNumber }
     * 
     */
    public SubscriptionGetNextAvailableNumber createSubscriptionGetNextAvailableNumber() {
        return new SubscriptionGetNextAvailableNumber();
    }

    /**
     * Create an instance of {@link AccountingPeriodGetPeriodResponse }
     * 
     */
    public AccountingPeriodGetPeriodResponse createAccountingPeriodGetPeriodResponse() {
        return new AccountingPeriodGetPeriodResponse();
    }

    /**
     * Create an instance of {@link OrderGetDebtorCity }
     * 
     */
    public OrderGetDebtorCity createOrderGetDebtorCity() {
        return new OrderGetDebtorCity();
    }

    /**
     * Create an instance of {@link CreditorGroupUpdateFromDataArrayResponse }
     * 
     */
    public CreditorGroupUpdateFromDataArrayResponse createCreditorGroupUpdateFromDataArrayResponse() {
        return new CreditorGroupUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link QuotationSetOurReferenceResponse }
     * 
     */
    public QuotationSetOurReferenceResponse createQuotationSetOurReferenceResponse() {
        return new QuotationSetOurReferenceResponse();
    }

    /**
     * Create an instance of {@link CreditorGetDataArrayResponse }
     * 
     */
    public CreditorGetDataArrayResponse createCreditorGetDataArrayResponse() {
        return new CreditorGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCreditorData }
     * 
     */
    public ArrayOfCreditorData createArrayOfCreditorData() {
        return new ArrayOfCreditorData();
    }

    /**
     * Create an instance of {@link DebtorContactGetIsToReceiveEmailCopyOfInvoiceResponse }
     * 
     */
    public DebtorContactGetIsToReceiveEmailCopyOfInvoiceResponse createDebtorContactGetIsToReceiveEmailCopyOfInvoiceResponse() {
        return new DebtorContactGetIsToReceiveEmailCopyOfInvoiceResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineSetProductResponse }
     * 
     */
    public CurrentSupplierInvoiceLineSetProductResponse createCurrentSupplierInvoiceLineSetProductResponse() {
        return new CurrentSupplierInvoiceLineSetProductResponse();
    }

    /**
     * Create an instance of {@link QuotationSetTermsOfDelivery }
     * 
     */
    public QuotationSetTermsOfDelivery createQuotationSetTermsOfDelivery() {
        return new QuotationSetTermsOfDelivery();
    }

    /**
     * Create an instance of {@link CreditorUpdateFromDataArray }
     * 
     */
    public CreditorUpdateFromDataArray createCreditorUpdateFromDataArray() {
        return new CreditorUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link OrderSetProject }
     * 
     */
    public OrderSetProject createOrderSetProject() {
        return new OrderSetProject();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDebtorNameResponse }
     * 
     */
    public CurrentInvoiceGetDebtorNameResponse createCurrentInvoiceGetDebtorNameResponse() {
        return new CurrentInvoiceGetDebtorNameResponse();
    }

    /**
     * Create an instance of {@link SubscriptionLineFindBySubscriptonListResponse }
     * 
     */
    public SubscriptionLineFindBySubscriptonListResponse createSubscriptionLineFindBySubscriptonListResponse() {
        return new SubscriptionLineFindBySubscriptonListResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceUpdateFromData }
     * 
     */
    public CurrentSupplierInvoiceUpdateFromData createCurrentSupplierInvoiceUpdateFromData() {
        return new CurrentSupplierInvoiceUpdateFromData();
    }

    /**
     * Create an instance of {@link SubscriptionSetIncludeNameResponse }
     * 
     */
    public SubscriptionSetIncludeNameResponse createSubscriptionSetIncludeNameResponse() {
        return new SubscriptionSetIncludeNameResponse();
    }

    /**
     * Create an instance of {@link DistributionKeySetName }
     * 
     */
    public DistributionKeySetName createDistributionKeySetName() {
        return new DistributionKeySetName();
    }

    /**
     * Create an instance of {@link BudgetFigureSetTextResponse }
     * 
     */
    public BudgetFigureSetTextResponse createBudgetFigureSetTextResponse() {
        return new BudgetFigureSetTextResponse();
    }

    /**
     * Create an instance of {@link DepartmentUpdateFromDataResponse }
     * 
     */
    public DepartmentUpdateFromDataResponse createDepartmentUpdateFromDataResponse() {
        return new DepartmentUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link CompanySetPostalCode }
     * 
     */
    public CompanySetPostalCode createCompanySetPostalCode() {
        return new CompanySetPostalCode();
    }

    /**
     * Create an instance of {@link InvoiceGetRemainderDefaultCurrencyResponse }
     * 
     */
    public InvoiceGetRemainderDefaultCurrencyResponse createInvoiceGetRemainderDefaultCurrencyResponse() {
        return new InvoiceGetRemainderDefaultCurrencyResponse();
    }

    /**
     * Create an instance of {@link DebtorSetExtendedVatZone }
     * 
     */
    public DebtorSetExtendedVatZone createDebtorSetExtendedVatZone() {
        return new DebtorSetExtendedVatZone();
    }

    /**
     * Create an instance of {@link ExtendedVatZoneHandle }
     * 
     */
    public ExtendedVatZoneHandle createExtendedVatZoneHandle() {
        return new ExtendedVatZoneHandle();
    }

    /**
     * Create an instance of {@link AccountGetNumberResponse }
     * 
     */
    public AccountGetNumberResponse createAccountGetNumberResponse() {
        return new AccountGetNumberResponse();
    }

    /**
     * Create an instance of {@link MileageEntrySetEndLocationResponse }
     * 
     */
    public MileageEntrySetEndLocationResponse createMileageEntrySetEndLocationResponse() {
        return new MileageEntrySetEndLocationResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryCreateFinanceVoucherResponse }
     * 
     */
    public CashBookEntryCreateFinanceVoucherResponse createCashBookEntryCreateFinanceVoucherResponse() {
        return new CashBookEntryCreateFinanceVoucherResponse();
    }

    /**
     * Create an instance of {@link DebtorFindByNameResponse }
     * 
     */
    public DebtorFindByNameResponse createDebtorFindByNameResponse() {
        return new DebtorFindByNameResponse();
    }

    /**
     * Create an instance of {@link CreditorGetCity }
     * 
     */
    public CreditorGetCity createCreditorGetCity() {
        return new CreditorGetCity();
    }

    /**
     * Create an instance of {@link OrderGetExchangeRateResponse }
     * 
     */
    public OrderGetExchangeRateResponse createOrderGetExchangeRateResponse() {
        return new OrderGetExchangeRateResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureSetAmountDefaultCurrencyResponse }
     * 
     */
    public BudgetFigureSetAmountDefaultCurrencyResponse createBudgetFigureSetAmountDefaultCurrencyResponse() {
        return new BudgetFigureSetAmountDefaultCurrencyResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetProduct }
     * 
     */
    public CurrentInvoiceLineGetProduct createCurrentInvoiceLineGetProduct() {
        return new CurrentInvoiceLineGetProduct();
    }

    /**
     * Create an instance of {@link SubscriptionGetIncludeName }
     * 
     */
    public SubscriptionGetIncludeName createSubscriptionGetIncludeName() {
        return new SubscriptionGetIncludeName();
    }

    /**
     * Create an instance of {@link CreditorEntryGetDataArrayResponse }
     * 
     */
    public CreditorEntryGetDataArrayResponse createCreditorEntryGetDataArrayResponse() {
        return new CreditorEntryGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCreditorEntryData }
     * 
     */
    public ArrayOfCreditorEntryData createArrayOfCreditorEntryData() {
        return new ArrayOfCreditorEntryData();
    }

    /**
     * Create an instance of {@link TimeEntryCreate }
     * 
     */
    public TimeEntryCreate createTimeEntryCreate() {
        return new TimeEntryCreate();
    }

    /**
     * Create an instance of {@link OrderLineGetInventoryLocationResponse }
     * 
     */
    public OrderLineGetInventoryLocationResponse createOrderLineGetInventoryLocationResponse() {
        return new OrderLineGetInventoryLocationResponse();
    }

    /**
     * Create an instance of {@link InventoryLocationHandle }
     * 
     */
    public InventoryLocationHandle createInventoryLocationHandle() {
        return new InventoryLocationHandle();
    }

    /**
     * Create an instance of {@link CreditorFindByNumberResponse }
     * 
     */
    public CreditorFindByNumberResponse createCreditorFindByNumberResponse() {
        return new CreditorFindByNumberResponse();
    }

    /**
     * Create an instance of {@link OrderFindByNumberResponse }
     * 
     */
    public OrderFindByNumberResponse createOrderFindByNumberResponse() {
        return new OrderFindByNumberResponse();
    }

    /**
     * Create an instance of {@link SubscriptionSetCalendarYearBasis }
     * 
     */
    public SubscriptionSetCalendarYearBasis createSubscriptionSetCalendarYearBasis() {
        return new SubscriptionSetCalendarYearBasis();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDebtorPostalCodeResponse }
     * 
     */
    public CurrentInvoiceGetDebtorPostalCodeResponse createCurrentInvoiceGetDebtorPostalCodeResponse() {
        return new CurrentInvoiceGetDebtorPostalCodeResponse();
    }

    /**
     * Create an instance of {@link OrderSetDebtorEan }
     * 
     */
    public OrderSetDebtorEan createOrderSetDebtorEan() {
        return new OrderSetDebtorEan();
    }

    /**
     * Create an instance of {@link CurrentInvoiceDelete }
     * 
     */
    public CurrentInvoiceDelete createCurrentInvoiceDelete() {
        return new CurrentInvoiceDelete();
    }

    /**
     * Create an instance of {@link TimeEntryGetProject }
     * 
     */
    public TimeEntryGetProject createTimeEntryGetProject() {
        return new TimeEntryGetProject();
    }

    /**
     * Create an instance of {@link EmployeeGroupDeleteResponse }
     * 
     */
    public EmployeeGroupDeleteResponse createEmployeeGroupDeleteResponse() {
        return new EmployeeGroupDeleteResponse();
    }

    /**
     * Create an instance of {@link OrderGetDebtorPostalCode }
     * 
     */
    public OrderGetDebtorPostalCode createOrderGetDebtorPostalCode() {
        return new OrderGetDebtorPostalCode();
    }

    /**
     * Create an instance of {@link DebtorGetSubscribersResponse }
     * 
     */
    public DebtorGetSubscribersResponse createDebtorGetSubscribersResponse() {
        return new DebtorGetSubscribersResponse();
    }

    /**
     * Create an instance of {@link CashBookEntrySetDate }
     * 
     */
    public CashBookEntrySetDate createCashBookEntrySetDate() {
        return new CashBookEntrySetDate();
    }

    /**
     * Create an instance of {@link DebtorGetCityResponse }
     * 
     */
    public DebtorGetCityResponse createDebtorGetCityResponse() {
        return new DebtorGetCityResponse();
    }

    /**
     * Create an instance of {@link DebtorContactSetEmail }
     * 
     */
    public DebtorContactSetEmail createDebtorContactSetEmail() {
        return new DebtorContactSetEmail();
    }

    /**
     * Create an instance of {@link MileageEntryCreateFromDataArrayResponse }
     * 
     */
    public MileageEntryCreateFromDataArrayResponse createMileageEntryCreateFromDataArrayResponse() {
        return new MileageEntryCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link QuotationSetAttentionResponse }
     * 
     */
    public QuotationSetAttentionResponse createQuotationSetAttentionResponse() {
        return new QuotationSetAttentionResponse();
    }

    /**
     * Create an instance of {@link SubscriptionGetAddPeriodResponse }
     * 
     */
    public SubscriptionGetAddPeriodResponse createSubscriptionGetAddPeriodResponse() {
        return new SubscriptionGetAddPeriodResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetCashBookResponse }
     * 
     */
    public CashBookEntryGetCashBookResponse createCashBookEntryGetCashBookResponse() {
        return new CashBookEntryGetCashBookResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetDepartment }
     * 
     */
    public OrderLineGetDepartment createOrderLineGetDepartment() {
        return new OrderLineGetDepartment();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDebtorPostalCode }
     * 
     */
    public CurrentInvoiceSetDebtorPostalCode createCurrentInvoiceSetDebtorPostalCode() {
        return new CurrentInvoiceSetDebtorPostalCode();
    }

    /**
     * Create an instance of {@link CashBookBookWithDateClosedPeriod }
     * 
     */
    public CashBookBookWithDateClosedPeriod createCashBookBookWithDateClosedPeriod() {
        return new CashBookBookWithDateClosedPeriod();
    }

    /**
     * Create an instance of {@link InvoiceGetDeliveryPostalCodeResponse }
     * 
     */
    public InvoiceGetDeliveryPostalCodeResponse createInvoiceGetDeliveryPostalCodeResponse() {
        return new InvoiceGetDeliveryPostalCodeResponse();
    }

    /**
     * Create an instance of {@link QuotationSetTextLine2Response }
     * 
     */
    public QuotationSetTextLine2Response createQuotationSetTextLine2Response() {
        return new QuotationSetTextLine2Response();
    }

    /**
     * Create an instance of {@link DeliveryLocationFindByExternalIdResponse }
     * 
     */
    public DeliveryLocationFindByExternalIdResponse createDeliveryLocationFindByExternalIdResponse() {
        return new DeliveryLocationFindByExternalIdResponse();
    }

    /**
     * Create an instance of {@link DebtorGetDeliveryLocations }
     * 
     */
    public DebtorGetDeliveryLocations createDebtorGetDeliveryLocations() {
        return new DebtorGetDeliveryLocations();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDeliveryAddressResponse }
     * 
     */
    public CurrentInvoiceSetDeliveryAddressResponse createCurrentInvoiceSetDeliveryAddressResponse() {
        return new CurrentInvoiceSetDeliveryAddressResponse();
    }

    /**
     * Create an instance of {@link QuotationGetDeliveryPostalCode }
     * 
     */
    public QuotationGetDeliveryPostalCode createQuotationGetDeliveryPostalCode() {
        return new QuotationGetDeliveryPostalCode();
    }

    /**
     * Create an instance of {@link EmployeeUpdateFromData }
     * 
     */
    public EmployeeUpdateFromData createEmployeeUpdateFromData() {
        return new EmployeeUpdateFromData();
    }

    /**
     * Create an instance of {@link EmployeeData }
     * 
     */
    public EmployeeData createEmployeeData() {
        return new EmployeeData();
    }

    /**
     * Create an instance of {@link QuotationLineGetInventoryLocationResponse }
     * 
     */
    public QuotationLineGetInventoryLocationResponse createQuotationLineGetInventoryLocationResponse() {
        return new QuotationLineGetInventoryLocationResponse();
    }

    /**
     * Create an instance of {@link TimeEntryGetDataResponse }
     * 
     */
    public TimeEntryGetDataResponse createTimeEntryGetDataResponse() {
        return new TimeEntryGetDataResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineCreateFromDataArray }
     * 
     */
    public CurrentInvoiceLineCreateFromDataArray createCurrentInvoiceLineCreateFromDataArray() {
        return new CurrentInvoiceLineCreateFromDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfCurrentInvoiceLineData }
     * 
     */
    public ArrayOfCurrentInvoiceLineData createArrayOfCurrentInvoiceLineData() {
        return new ArrayOfCurrentInvoiceLineData();
    }

    /**
     * Create an instance of {@link CashBookEntryGetProjectResponse }
     * 
     */
    public CashBookEntryGetProjectResponse createCashBookEntryGetProjectResponse() {
        return new CashBookEntryGetProjectResponse();
    }

    /**
     * Create an instance of {@link DebtorEntryGetAmount }
     * 
     */
    public DebtorEntryGetAmount createDebtorEntryGetAmount() {
        return new DebtorEntryGetAmount();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetProduct }
     * 
     */
    public CurrentInvoiceLineSetProduct createCurrentInvoiceLineSetProduct() {
        return new CurrentInvoiceLineSetProduct();
    }

    /**
     * Create an instance of {@link OrderGetYourReference }
     * 
     */
    public OrderGetYourReference createOrderGetYourReference() {
        return new OrderGetYourReference();
    }

    /**
     * Create an instance of {@link DebtorEntryGetInvoiceNumber }
     * 
     */
    public DebtorEntryGetInvoiceNumber createDebtorEntryGetInvoiceNumber() {
        return new DebtorEntryGetInvoiceNumber();
    }

    /**
     * Create an instance of {@link QuotationGetMarginResponse }
     * 
     */
    public QuotationGetMarginResponse createQuotationGetMarginResponse() {
        return new QuotationGetMarginResponse();
    }

    /**
     * Create an instance of {@link ProductGetRecommendedPrice }
     * 
     */
    public ProductGetRecommendedPrice createProductGetRecommendedPrice() {
        return new ProductGetRecommendedPrice();
    }

    /**
     * Create an instance of {@link CashBookEntryGetDateResponse }
     * 
     */
    public CashBookEntryGetDateResponse createCashBookEntryGetDateResponse() {
        return new CashBookEntryGetDateResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentSetNameResponse }
     * 
     */
    public TermOfPaymentSetNameResponse createTermOfPaymentSetNameResponse() {
        return new TermOfPaymentSetNameResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetDescription }
     * 
     */
    public OrderLineGetDescription createOrderLineGetDescription() {
        return new OrderLineGetDescription();
    }

    /**
     * Create an instance of {@link QuotationGetAllUpdated }
     * 
     */
    public QuotationGetAllUpdated createQuotationGetAllUpdated() {
        return new QuotationGetAllUpdated();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetAddressResponse }
     * 
     */
    public DeliveryLocationGetAddressResponse createDeliveryLocationGetAddressResponse() {
        return new DeliveryLocationGetAddressResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryCreateFromData }
     * 
     */
    public CashBookEntryCreateFromData createCashBookEntryCreateFromData() {
        return new CashBookEntryCreateFromData();
    }

    /**
     * Create an instance of {@link SubscriptionLineFindByProductResponse }
     * 
     */
    public SubscriptionLineFindByProductResponse createSubscriptionLineFindByProductResponse() {
        return new SubscriptionLineFindByProductResponse();
    }

    /**
     * Create an instance of {@link AccountGetEntriesByNumber }
     * 
     */
    public AccountGetEntriesByNumber createAccountGetEntriesByNumber() {
        return new AccountGetEntriesByNumber();
    }

    /**
     * Create an instance of {@link DepartmentDeleteResponse }
     * 
     */
    public DepartmentDeleteResponse createDepartmentDeleteResponse() {
        return new DepartmentDeleteResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetDiscountAsPercentResponse }
     * 
     */
    public CurrentInvoiceLineGetDiscountAsPercentResponse createCurrentInvoiceLineGetDiscountAsPercentResponse() {
        return new CurrentInvoiceLineGetDiscountAsPercentResponse();
    }

    /**
     * Create an instance of {@link OrderSetDeliveryLocationResponse }
     * 
     */
    public OrderSetDeliveryLocationResponse createOrderSetDeliveryLocationResponse() {
        return new OrderSetDeliveryLocationResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetLines }
     * 
     */
    public InvoiceGetLines createInvoiceGetLines() {
        return new InvoiceGetLines();
    }

    /**
     * Create an instance of {@link CashBookEntryGetAmountDefaultCurrencyResponse }
     * 
     */
    public CashBookEntryGetAmountDefaultCurrencyResponse createCashBookEntryGetAmountDefaultCurrencyResponse() {
        return new CashBookEntryGetAmountDefaultCurrencyResponse();
    }

    /**
     * Create an instance of {@link CompanyGetCityResponse }
     * 
     */
    public CompanyGetCityResponse createCompanyGetCityResponse() {
        return new CompanyGetCityResponse();
    }

    /**
     * Create an instance of {@link OrderSetExchangeRateResponse }
     * 
     */
    public OrderSetExchangeRateResponse createOrderSetExchangeRateResponse() {
        return new OrderSetExchangeRateResponse();
    }

    /**
     * Create an instance of {@link DistributionKeyFindByNumberResponse }
     * 
     */
    public DistributionKeyFindByNumberResponse createDistributionKeyFindByNumberResponse() {
        return new DistributionKeyFindByNumberResponse();
    }

    /**
     * Create an instance of {@link CashBookGetName }
     * 
     */
    public CashBookGetName createCashBookGetName() {
        return new CashBookGetName();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDeliveryCountryResponse }
     * 
     */
    public CurrentInvoiceSetDeliveryCountryResponse createCurrentInvoiceSetDeliveryCountryResponse() {
        return new CurrentInvoiceSetDeliveryCountryResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentSetName }
     * 
     */
    public TermOfPaymentSetName createTermOfPaymentSetName() {
        return new TermOfPaymentSetName();
    }

    /**
     * Create an instance of {@link ProductFindByNumberListResponse }
     * 
     */
    public ProductFindByNumberListResponse createProductFindByNumberListResponse() {
        return new ProductFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link CashBookEntrySetCreditorInvoiceNumber }
     * 
     */
    public CashBookEntrySetCreditorInvoiceNumber createCashBookEntrySetCreditorInvoiceNumber() {
        return new CashBookEntrySetCreditorInvoiceNumber();
    }

    /**
     * Create an instance of {@link SubscriberGetProject }
     * 
     */
    public SubscriberGetProject createSubscriberGetProject() {
        return new SubscriberGetProject();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetDiscountAsPercent }
     * 
     */
    public CurrentInvoiceLineGetDiscountAsPercent createCurrentInvoiceLineGetDiscountAsPercent() {
        return new CurrentInvoiceLineGetDiscountAsPercent();
    }

    /**
     * Create an instance of {@link MileageEntrySetDistance }
     * 
     */
    public MileageEntrySetDistance createMileageEntrySetDistance() {
        return new MileageEntrySetDistance();
    }

    /**
     * Create an instance of {@link CreditorGroupGetNameResponse }
     * 
     */
    public CreditorGroupGetNameResponse createCreditorGroupGetNameResponse() {
        return new CreditorGroupGetNameResponse();
    }

    /**
     * Create an instance of {@link ProductGetAllResponse }
     * 
     */
    public ProductGetAllResponse createProductGetAllResponse() {
        return new ProductGetAllResponse();
    }

    /**
     * Create an instance of {@link OrderGetDebtorAddress }
     * 
     */
    public OrderGetDebtorAddress createOrderGetDebtorAddress() {
        return new OrderGetDebtorAddress();
    }

    /**
     * Create an instance of {@link CompanyGetDataResponse }
     * 
     */
    public CompanyGetDataResponse createCompanyGetDataResponse() {
        return new CompanyGetDataResponse();
    }

    /**
     * Create an instance of {@link CompanyData }
     * 
     */
    public CompanyData createCompanyData() {
        return new CompanyData();
    }

    /**
     * Create an instance of {@link QuotationLineGetDescription }
     * 
     */
    public QuotationLineGetDescription createQuotationLineGetDescription() {
        return new QuotationLineGetDescription();
    }

    /**
     * Create an instance of {@link ActivityFindByNumber }
     * 
     */
    public ActivityFindByNumber createActivityFindByNumber() {
        return new ActivityFindByNumber();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetDistributionKeyResponse }
     * 
     */
    public CurrentInvoiceLineGetDistributionKeyResponse createCurrentInvoiceLineGetDistributionKeyResponse() {
        return new CurrentInvoiceLineGetDistributionKeyResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetDistributionInPercentResponse }
     * 
     */
    public TermOfPaymentGetDistributionInPercentResponse createTermOfPaymentGetDistributionInPercentResponse() {
        return new TermOfPaymentGetDistributionInPercentResponse();
    }

    /**
     * Create an instance of {@link CompanyGetCountyResponse }
     * 
     */
    public CompanyGetCountyResponse createCompanyGetCountyResponse() {
        return new CompanyGetCountyResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetOtherReferenceResponse }
     * 
     */
    public CurrentInvoiceGetOtherReferenceResponse createCurrentInvoiceGetOtherReferenceResponse() {
        return new CurrentInvoiceGetOtherReferenceResponse();
    }

    /**
     * Create an instance of {@link VatAccountGetType }
     * 
     */
    public VatAccountGetType createVatAccountGetType() {
        return new VatAccountGetType();
    }

    /**
     * Create an instance of {@link ProductGetAllUpdated }
     * 
     */
    public ProductGetAllUpdated createProductGetAllUpdated() {
        return new ProductGetAllUpdated();
    }

    /**
     * Create an instance of {@link CostTypeGetAllResponse }
     * 
     */
    public CostTypeGetAllResponse createCostTypeGetAllResponse() {
        return new CostTypeGetAllResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCostTypeHandle }
     * 
     */
    public ArrayOfCostTypeHandle createArrayOfCostTypeHandle() {
        return new ArrayOfCostTypeHandle();
    }

    /**
     * Create an instance of {@link SubscriptionLineSetQuantityResponse }
     * 
     */
    public SubscriptionLineSetQuantityResponse createSubscriptionLineSetQuantityResponse() {
        return new SubscriptionLineSetQuantityResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetCurrencyResponse }
     * 
     */
    public InvoiceGetCurrencyResponse createInvoiceGetCurrencyResponse() {
        return new InvoiceGetCurrencyResponse();
    }

    /**
     * Create an instance of {@link UnitCreateFromDataResponse }
     * 
     */
    public UnitCreateFromDataResponse createUnitCreateFromDataResponse() {
        return new UnitCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineGetDataResponse }
     * 
     */
    public CurrentSupplierInvoiceLineGetDataResponse createCurrentSupplierInvoiceLineGetDataResponse() {
        return new CurrentSupplierInvoiceLineGetDataResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineData }
     * 
     */
    public CurrentSupplierInvoiceLineData createCurrentSupplierInvoiceLineData() {
        return new CurrentSupplierInvoiceLineData();
    }

    /**
     * Create an instance of {@link CreditorGetEntriesByVoucherNoAndInvoiceNo }
     * 
     */
    public CreditorGetEntriesByVoucherNoAndInvoiceNo createCreditorGetEntriesByVoucherNoAndInvoiceNo() {
        return new CreditorGetEntriesByVoucherNoAndInvoiceNo();
    }

    /**
     * Create an instance of {@link DebtorSetEan }
     * 
     */
    public DebtorSetEan createDebtorSetEan() {
        return new DebtorSetEan();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetStatusResponse }
     * 
     */
    public ScannedDocumentGetStatusResponse createScannedDocumentGetStatusResponse() {
        return new ScannedDocumentGetStatusResponse();
    }

    /**
     * Create an instance of {@link OrderGetHeadingResponse }
     * 
     */
    public OrderGetHeadingResponse createOrderGetHeadingResponse() {
        return new OrderGetHeadingResponse();
    }

    /**
     * Create an instance of {@link ProductFindByNumberList }
     * 
     */
    public ProductFindByNumberList createProductFindByNumberList() {
        return new ProductFindByNumberList();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ProductGetOnOrder }
     * 
     */
    public ProductGetOnOrder createProductGetOnOrder() {
        return new ProductGetOnOrder();
    }

    /**
     * Create an instance of {@link CreditorGetCountyResponse }
     * 
     */
    public CreditorGetCountyResponse createCreditorGetCountyResponse() {
        return new CreditorGetCountyResponse();
    }

    /**
     * Create an instance of {@link EntryGetVatAccountResponse }
     * 
     */
    public EntryGetVatAccountResponse createEntryGetVatAccountResponse() {
        return new EntryGetVatAccountResponse();
    }

    /**
     * Create an instance of {@link DebtorContactSetIsToReceiveEmailCopyOfInvoice }
     * 
     */
    public DebtorContactSetIsToReceiveEmailCopyOfInvoice createDebtorContactSetIsToReceiveEmailCopyOfInvoice() {
        return new DebtorContactSetIsToReceiveEmailCopyOfInvoice();
    }

    /**
     * Create an instance of {@link OrderSetTextLine1 }
     * 
     */
    public OrderSetTextLine1 createOrderSetTextLine1() {
        return new OrderSetTextLine1();
    }

    /**
     * Create an instance of {@link ProjectGetEntriesResponse }
     * 
     */
    public ProjectGetEntriesResponse createProjectGetEntriesResponse() {
        return new ProjectGetEntriesResponse();
    }

    /**
     * Create an instance of {@link QuotationLineGetInventoryLocation }
     * 
     */
    public QuotationLineGetInventoryLocation createQuotationLineGetInventoryLocation() {
        return new QuotationLineGetInventoryLocation();
    }

    /**
     * Create an instance of {@link UnitGetDataArrayResponse }
     * 
     */
    public UnitGetDataArrayResponse createUnitGetDataArrayResponse() {
        return new UnitGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUnitData }
     * 
     */
    public ArrayOfUnitData createArrayOfUnitData() {
        return new ArrayOfUnitData();
    }

    /**
     * Create an instance of {@link ProductGroupGetAccrualResponse }
     * 
     */
    public ProductGroupGetAccrualResponse createProductGroupGetAccrualResponse() {
        return new ProductGroupGetAccrualResponse();
    }

    /**
     * Create an instance of {@link OrderSetOtherReference }
     * 
     */
    public OrderSetOtherReference createOrderSetOtherReference() {
        return new OrderSetOtherReference();
    }

    /**
     * Create an instance of {@link CashBookEntryUpdateFromDataArray }
     * 
     */
    public CashBookEntryUpdateFromDataArray createCashBookEntryUpdateFromDataArray() {
        return new CashBookEntryUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfCashBookEntryData }
     * 
     */
    public ArrayOfCashBookEntryData createArrayOfCashBookEntryData() {
        return new ArrayOfCashBookEntryData();
    }

    /**
     * Create an instance of {@link AccountCreate }
     * 
     */
    public AccountCreate createAccountCreate() {
        return new AccountCreate();
    }

    /**
     * Create an instance of {@link ProductGroupGetName }
     * 
     */
    public ProductGroupGetName createProductGroupGetName() {
        return new ProductGroupGetName();
    }

    /**
     * Create an instance of {@link DebtorGetEanResponse }
     * 
     */
    public DebtorGetEanResponse createDebtorGetEanResponse() {
        return new DebtorGetEanResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetYourReferenceResponse }
     * 
     */
    public CurrentInvoiceSetYourReferenceResponse createCurrentInvoiceSetYourReferenceResponse() {
        return new CurrentInvoiceSetYourReferenceResponse();
    }

    /**
     * Create an instance of {@link MileageEntrySetDateResponse }
     * 
     */
    public MileageEntrySetDateResponse createMileageEntrySetDateResponse() {
        return new MileageEntrySetDateResponse();
    }

    /**
     * Create an instance of {@link OrderSetTextLine2 }
     * 
     */
    public OrderSetTextLine2 createOrderSetTextLine2() {
        return new OrderSetTextLine2();
    }

    /**
     * Create an instance of {@link DebtorContactGetIsToReceiveEmailCopyOfInvoice }
     * 
     */
    public DebtorContactGetIsToReceiveEmailCopyOfInvoice createDebtorContactGetIsToReceiveEmailCopyOfInvoice() {
        return new DebtorContactGetIsToReceiveEmailCopyOfInvoice();
    }

    /**
     * Create an instance of {@link ProjectGetResponsible }
     * 
     */
    public ProjectGetResponsible createProjectGetResponsible() {
        return new ProjectGetResponsible();
    }

    /**
     * Create an instance of {@link PriceGroupFindByNumber }
     * 
     */
    public PriceGroupFindByNumber createPriceGroupFindByNumber() {
        return new PriceGroupFindByNumber();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryGetDocumentsResponse }
     * 
     */
    public DocumentArchiveCategoryGetDocumentsResponse createDocumentArchiveCategoryGetDocumentsResponse() {
        return new DocumentArchiveCategoryGetDocumentsResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetDiscountAsPercent }
     * 
     */
    public CurrentInvoiceLineSetDiscountAsPercent createCurrentInvoiceLineSetDiscountAsPercent() {
        return new CurrentInvoiceLineSetDiscountAsPercent();
    }

    /**
     * Create an instance of {@link QuotationSetDebtor }
     * 
     */
    public QuotationSetDebtor createQuotationSetDebtor() {
        return new QuotationSetDebtor();
    }

    /**
     * Create an instance of {@link DepartmentGetAllUpdated }
     * 
     */
    public DepartmentGetAllUpdated createDepartmentGetAllUpdated() {
        return new DepartmentGetAllUpdated();
    }

    /**
     * Create an instance of {@link CostTypeFindByNumberListResponse }
     * 
     */
    public CostTypeFindByNumberListResponse createCostTypeFindByNumberListResponse() {
        return new CostTypeFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link CashBookGetNumber }
     * 
     */
    public CashBookGetNumber createCashBookGetNumber() {
        return new CashBookGetNumber();
    }

    /**
     * Create an instance of {@link DebtorSetEanResponse }
     * 
     */
    public DebtorSetEanResponse createDebtorSetEanResponse() {
        return new DebtorSetEanResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetCapitaliseResponse }
     * 
     */
    public CashBookEntryGetCapitaliseResponse createCashBookEntryGetCapitaliseResponse() {
        return new CashBookEntryGetCapitaliseResponse();
    }

    /**
     * Create an instance of {@link CreditorGetNameResponse }
     * 
     */
    public CreditorGetNameResponse createCreditorGetNameResponse() {
        return new CreditorGetNameResponse();
    }

    /**
     * Create an instance of {@link ProjectGroupGetDataResponse }
     * 
     */
    public ProjectGroupGetDataResponse createProjectGroupGetDataResponse() {
        return new ProjectGroupGetDataResponse();
    }

    /**
     * Create an instance of {@link ProjectGroupData }
     * 
     */
    public ProjectGroupData createProjectGroupData() {
        return new ProjectGroupData();
    }

    /**
     * Create an instance of {@link OrderSetTextLine2Response }
     * 
     */
    public OrderSetTextLine2Response createOrderSetTextLine2Response() {
        return new OrderSetTextLine2Response();
    }

    /**
     * Create an instance of {@link DebtorGroupGetData }
     * 
     */
    public DebtorGroupGetData createDebtorGroupGetData() {
        return new DebtorGroupGetData();
    }

    /**
     * Create an instance of {@link SubscriberSetCommentsResponse }
     * 
     */
    public SubscriberSetCommentsResponse createSubscriberSetCommentsResponse() {
        return new SubscriberSetCommentsResponse();
    }

    /**
     * Create an instance of {@link QuotationGetDeliveryCounty }
     * 
     */
    public QuotationGetDeliveryCounty createQuotationGetDeliveryCounty() {
        return new QuotationGetDeliveryCounty();
    }

    /**
     * Create an instance of {@link DebtorSetWebsiteResponse }
     * 
     */
    public DebtorSetWebsiteResponse createDebtorSetWebsiteResponse() {
        return new DebtorSetWebsiteResponse();
    }

    /**
     * Create an instance of {@link CompanySetCINumber }
     * 
     */
    public CompanySetCINumber createCompanySetCINumber() {
        return new CompanySetCINumber();
    }

    /**
     * Create an instance of {@link CreditorContactSetComments }
     * 
     */
    public CreditorContactSetComments createCreditorContactSetComments() {
        return new CreditorContactSetComments();
    }

    /**
     * Create an instance of {@link EmployeeCreateResponse }
     * 
     */
    public EmployeeCreateResponse createEmployeeCreateResponse() {
        return new EmployeeCreateResponse();
    }

    /**
     * Create an instance of {@link CurrencyFindByCodeResponse }
     * 
     */
    public CurrencyFindByCodeResponse createCurrencyFindByCodeResponse() {
        return new CurrencyFindByCodeResponse();
    }

    /**
     * Create an instance of {@link ProjectFindByNumberList }
     * 
     */
    public ProjectFindByNumberList createProjectFindByNumberList() {
        return new ProjectFindByNumberList();
    }

    /**
     * Create an instance of {@link ArrayOfInt }
     * 
     */
    public ArrayOfInt createArrayOfInt() {
        return new ArrayOfInt();
    }

    /**
     * Create an instance of {@link DebtorGetDeliveryLocationsResponse }
     * 
     */
    public DebtorGetDeliveryLocationsResponse createDebtorGetDeliveryLocationsResponse() {
        return new DebtorGetDeliveryLocationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDeliveryLocationHandle }
     * 
     */
    public ArrayOfDeliveryLocationHandle createArrayOfDeliveryLocationHandle() {
        return new ArrayOfDeliveryLocationHandle();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetDescription }
     * 
     */
    public CurrentInvoiceLineSetDescription createCurrentInvoiceLineSetDescription() {
        return new CurrentInvoiceLineSetDescription();
    }

    /**
     * Create an instance of {@link DepartmentFindByName }
     * 
     */
    public DepartmentFindByName createDepartmentFindByName() {
        return new DepartmentFindByName();
    }

    /**
     * Create an instance of {@link QuotationLineGetDistributionKeyResponse }
     * 
     */
    public QuotationLineGetDistributionKeyResponse createQuotationLineGetDistributionKeyResponse() {
        return new QuotationLineGetDistributionKeyResponse();
    }

    /**
     * Create an instance of {@link QuotationGetDataResponse }
     * 
     */
    public QuotationGetDataResponse createQuotationGetDataResponse() {
        return new QuotationGetDataResponse();
    }

    /**
     * Create an instance of {@link QuotationData }
     * 
     */
    public QuotationData createQuotationData() {
        return new QuotationData();
    }

    /**
     * Create an instance of {@link CreditorContactGetTelephoneNumberResponse }
     * 
     */
    public CreditorContactGetTelephoneNumberResponse createCreditorContactGetTelephoneNumberResponse() {
        return new CreditorContactGetTelephoneNumberResponse();
    }

    /**
     * Create an instance of {@link AccountGetDepartmentResponse }
     * 
     */
    public AccountGetDepartmentResponse createAccountGetDepartmentResponse() {
        return new AccountGetDepartmentResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureUpdateFromData }
     * 
     */
    public BudgetFigureUpdateFromData createBudgetFigureUpdateFromData() {
        return new BudgetFigureUpdateFromData();
    }

    /**
     * Create an instance of {@link InventoryLocationGetData }
     * 
     */
    public InventoryLocationGetData createInventoryLocationGetData() {
        return new InventoryLocationGetData();
    }

    /**
     * Create an instance of {@link ProjectUpdateFromDataArrayResponse }
     * 
     */
    public ProjectUpdateFromDataArrayResponse createProjectUpdateFromDataArrayResponse() {
        return new ProjectUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProjectHandle }
     * 
     */
    public ArrayOfProjectHandle createArrayOfProjectHandle() {
        return new ArrayOfProjectHandle();
    }

    /**
     * Create an instance of {@link TermOfPaymentSetContraAccountResponse }
     * 
     */
    public TermOfPaymentSetContraAccountResponse createTermOfPaymentSetContraAccountResponse() {
        return new TermOfPaymentSetContraAccountResponse();
    }

    /**
     * Create an instance of {@link ProductFindByNumberResponse }
     * 
     */
    public ProductFindByNumberResponse createProductFindByNumberResponse() {
        return new ProductFindByNumberResponse();
    }

    /**
     * Create an instance of {@link SubscriptionCreateResponse }
     * 
     */
    public SubscriptionCreateResponse createSubscriptionCreateResponse() {
        return new SubscriptionCreateResponse();
    }

    /**
     * Create an instance of {@link QuotationLineUpdateFromDataArrayResponse }
     * 
     */
    public QuotationLineUpdateFromDataArrayResponse createQuotationLineUpdateFromDataArrayResponse() {
        return new QuotationLineUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link ExtendedVatZoneGetNameResponse }
     * 
     */
    public ExtendedVatZoneGetNameResponse createExtendedVatZoneGetNameResponse() {
        return new ExtendedVatZoneGetNameResponse();
    }

    /**
     * Create an instance of {@link QuotationGetNetAmountResponse }
     * 
     */
    public QuotationGetNetAmountResponse createQuotationGetNetAmountResponse() {
        return new QuotationGetNetAmountResponse();
    }

    /**
     * Create an instance of {@link InventoryLocationGetName }
     * 
     */
    public InventoryLocationGetName createInventoryLocationGetName() {
        return new InventoryLocationGetName();
    }

    /**
     * Create an instance of {@link BankPaymentTypeFindByNumber }
     * 
     */
    public BankPaymentTypeFindByNumber createBankPaymentTypeFindByNumber() {
        return new BankPaymentTypeFindByNumber();
    }

    /**
     * Create an instance of {@link SubscriptionSetSubscriptionIntervalResponse }
     * 
     */
    public SubscriptionSetSubscriptionIntervalResponse createSubscriptionSetSubscriptionIntervalResponse() {
        return new SubscriptionSetSubscriptionIntervalResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDebtorCountryResponse }
     * 
     */
    public CurrentInvoiceSetDebtorCountryResponse createCurrentInvoiceSetDebtorCountryResponse() {
        return new CurrentInvoiceSetDebtorCountryResponse();
    }

    /**
     * Create an instance of {@link CreditorGroupGetNumberResponse }
     * 
     */
    public CreditorGroupGetNumberResponse createCreditorGroupGetNumberResponse() {
        return new CreditorGroupGetNumberResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDate }
     * 
     */
    public CurrentInvoiceGetDate createCurrentInvoiceGetDate() {
        return new CurrentInvoiceGetDate();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetData }
     * 
     */
    public CurrentInvoiceGetData createCurrentInvoiceGetData() {
        return new CurrentInvoiceGetData();
    }

    /**
     * Create an instance of {@link CompanyGetAddress1Response }
     * 
     */
    public CompanyGetAddress1Response createCompanyGetAddress1Response() {
        return new CompanyGetAddress1Response();
    }

    /**
     * Create an instance of {@link ReportCodeGetDataResponse }
     * 
     */
    public ReportCodeGetDataResponse createReportCodeGetDataResponse() {
        return new ReportCodeGetDataResponse();
    }

    /**
     * Create an instance of {@link ReportCodeData }
     * 
     */
    public ReportCodeData createReportCodeData() {
        return new ReportCodeData();
    }

    /**
     * Create an instance of {@link QuotationGetDeliveryDateResponse }
     * 
     */
    public QuotationGetDeliveryDateResponse createQuotationGetDeliveryDateResponse() {
        return new QuotationGetDeliveryDateResponse();
    }

    /**
     * Create an instance of {@link CashBookRegisterPdfVoucher }
     * 
     */
    public CashBookRegisterPdfVoucher createCashBookRegisterPdfVoucher() {
        return new CashBookRegisterPdfVoucher();
    }

    /**
     * Create an instance of {@link CreditorEntryGetTypeResponse }
     * 
     */
    public CreditorEntryGetTypeResponse createCreditorEntryGetTypeResponse() {
        return new CreditorEntryGetTypeResponse();
    }

    /**
     * Create an instance of {@link CompanyGetBaseCurrencyResponse }
     * 
     */
    public CompanyGetBaseCurrencyResponse createCompanyGetBaseCurrencyResponse() {
        return new CompanyGetBaseCurrencyResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetDebtor }
     * 
     */
    public TermOfPaymentGetDebtor createTermOfPaymentGetDebtor() {
        return new TermOfPaymentGetDebtor();
    }

    /**
     * Create an instance of {@link ReportCodeSetGetNameResponse }
     * 
     */
    public ReportCodeSetGetNameResponse createReportCodeSetGetNameResponse() {
        return new ReportCodeSetGetNameResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDebtorNameResponse }
     * 
     */
    public CurrentInvoiceSetDebtorNameResponse createCurrentInvoiceSetDebtorNameResponse() {
        return new CurrentInvoiceSetDebtorNameResponse();
    }

    /**
     * Create an instance of {@link ProductSetDistributionKey }
     * 
     */
    public ProductSetDistributionKey createProductSetDistributionKey() {
        return new ProductSetDistributionKey();
    }

    /**
     * Create an instance of {@link MileageEntryGetSalesRateResponse }
     * 
     */
    public MileageEntryGetSalesRateResponse createMileageEntryGetSalesRateResponse() {
        return new MileageEntryGetSalesRateResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineCreateFromData }
     * 
     */
    public CurrentInvoiceLineCreateFromData createCurrentInvoiceLineCreateFromData() {
        return new CurrentInvoiceLineCreateFromData();
    }

    /**
     * Create an instance of {@link CreditorEntryGetAccount }
     * 
     */
    public CreditorEntryGetAccount createCreditorEntryGetAccount() {
        return new CreditorEntryGetAccount();
    }

    /**
     * Create an instance of {@link PriceGroupDeleteResponse }
     * 
     */
    public PriceGroupDeleteResponse createPriceGroupDeleteResponse() {
        return new PriceGroupDeleteResponse();
    }

    /**
     * Create an instance of {@link SubscriptionLineDeleteResponse }
     * 
     */
    public SubscriptionLineDeleteResponse createSubscriptionLineDeleteResponse() {
        return new SubscriptionLineDeleteResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineCreateFromDataArrayResponse }
     * 
     */
    public CurrentSupplierInvoiceLineCreateFromDataArrayResponse createCurrentSupplierInvoiceLineCreateFromDataArrayResponse() {
        return new CurrentSupplierInvoiceLineCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCurrentSupplierInvoiceLineHandle }
     * 
     */
    public ArrayOfCurrentSupplierInvoiceLineHandle createArrayOfCurrentSupplierInvoiceLineHandle() {
        return new ArrayOfCurrentSupplierInvoiceLineHandle();
    }

    /**
     * Create an instance of {@link TimeEntryGetCostPrice }
     * 
     */
    public TimeEntryGetCostPrice createTimeEntryGetCostPrice() {
        return new TimeEntryGetCostPrice();
    }

    /**
     * Create an instance of {@link DeliveryLocationSetIsAccessibleResponse }
     * 
     */
    public DeliveryLocationSetIsAccessibleResponse createDeliveryLocationSetIsAccessibleResponse() {
        return new DeliveryLocationSetIsAccessibleResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineFindByProduct }
     * 
     */
    public CurrentInvoiceLineFindByProduct createCurrentInvoiceLineFindByProduct() {
        return new CurrentInvoiceLineFindByProduct();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryGetName }
     * 
     */
    public DocumentArchiveCategoryGetName createDocumentArchiveCategoryGetName() {
        return new DocumentArchiveCategoryGetName();
    }

    /**
     * Create an instance of {@link CompanyGetCountryResponse }
     * 
     */
    public CompanyGetCountryResponse createCompanyGetCountryResponse() {
        return new CompanyGetCountryResponse();
    }

    /**
     * Create an instance of {@link DebtorGetOpenEntries }
     * 
     */
    public DebtorGetOpenEntries createDebtorGetOpenEntries() {
        return new DebtorGetOpenEntries();
    }

    /**
     * Create an instance of {@link SubscriptionLineFindByProduct }
     * 
     */
    public SubscriptionLineFindByProduct createSubscriptionLineFindByProduct() {
        return new SubscriptionLineFindByProduct();
    }

    /**
     * Create an instance of {@link QuotationGetHeadingResponse }
     * 
     */
    public QuotationGetHeadingResponse createQuotationGetHeadingResponse() {
        return new QuotationGetHeadingResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureSetText }
     * 
     */
    public BudgetFigureSetText createBudgetFigureSetText() {
        return new BudgetFigureSetText();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetDescriptionResponse }
     * 
     */
    public TermOfPaymentGetDescriptionResponse createTermOfPaymentGetDescriptionResponse() {
        return new TermOfPaymentGetDescriptionResponse();
    }

    /**
     * Create an instance of {@link DebtorContactGetAll }
     * 
     */
    public DebtorContactGetAll createDebtorContactGetAll() {
        return new DebtorContactGetAll();
    }

    /**
     * Create an instance of {@link QuotationGetAttention }
     * 
     */
    public QuotationGetAttention createQuotationGetAttention() {
        return new QuotationGetAttention();
    }

    /**
     * Create an instance of {@link QuotationLineGetTotalMargin }
     * 
     */
    public QuotationLineGetTotalMargin createQuotationLineGetTotalMargin() {
        return new QuotationLineGetTotalMargin();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetDataResponse }
     * 
     */
    public CurrentInvoiceLineGetDataResponse createCurrentInvoiceLineGetDataResponse() {
        return new CurrentInvoiceLineGetDataResponse();
    }

    /**
     * Create an instance of {@link DistributionKeyGetNumber }
     * 
     */
    public DistributionKeyGetNumber createDistributionKeyGetNumber() {
        return new DistributionKeyGetNumber();
    }

    /**
     * Create an instance of {@link CreditorGroupSetAccount }
     * 
     */
    public CreditorGroupSetAccount createCreditorGroupSetAccount() {
        return new CreditorGroupSetAccount();
    }

    /**
     * Create an instance of {@link SubscriberSetDebtorResponse }
     * 
     */
    public SubscriberSetDebtorResponse createSubscriberSetDebtorResponse() {
        return new SubscriberSetDebtorResponse();
    }

    /**
     * Create an instance of {@link QuotationLineSetInventoryLocation }
     * 
     */
    public QuotationLineSetInventoryLocation createQuotationLineSetInventoryLocation() {
        return new QuotationLineSetInventoryLocation();
    }

    /**
     * Create an instance of {@link OrderGetPdf }
     * 
     */
    public OrderGetPdf createOrderGetPdf() {
        return new OrderGetPdf();
    }

    /**
     * Create an instance of {@link AccountingYearGetFromDateResponse }
     * 
     */
    public AccountingYearGetFromDateResponse createAccountingYearGetFromDateResponse() {
        return new AccountingYearGetFromDateResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetAllResponse }
     * 
     */
    public OrderLineGetAllResponse createOrderLineGetAllResponse() {
        return new OrderLineGetAllResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOrderLineHandle }
     * 
     */
    public ArrayOfOrderLineHandle createArrayOfOrderLineHandle() {
        return new ArrayOfOrderLineHandle();
    }

    /**
     * Create an instance of {@link InvoiceGetRoundingAmount }
     * 
     */
    public InvoiceGetRoundingAmount createInvoiceGetRoundingAmount() {
        return new InvoiceGetRoundingAmount();
    }

    /**
     * Create an instance of {@link QuotationGetIsSentResponse }
     * 
     */
    public QuotationGetIsSentResponse createQuotationGetIsSentResponse() {
        return new QuotationGetIsSentResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureGetText }
     * 
     */
    public BudgetFigureGetText createBudgetFigureGetText() {
        return new BudgetFigureGetText();
    }

    /**
     * Create an instance of {@link AccountFindByNumberListResponse }
     * 
     */
    public AccountFindByNumberListResponse createAccountFindByNumberListResponse() {
        return new AccountFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link ProductGroupSetAccrual }
     * 
     */
    public ProductGroupSetAccrual createProductGroupSetAccrual() {
        return new ProductGroupSetAccrual();
    }

    /**
     * Create an instance of {@link CreditorSetBankAccountResponse }
     * 
     */
    public CreditorSetBankAccountResponse createCreditorSetBankAccountResponse() {
        return new CreditorSetBankAccountResponse();
    }

    /**
     * Create an instance of {@link CreditorGroupCreate }
     * 
     */
    public CreditorGroupCreate createCreditorGroupCreate() {
        return new CreditorGroupCreate();
    }

    /**
     * Create an instance of {@link PriceGroupGetDataArrayResponse }
     * 
     */
    public PriceGroupGetDataArrayResponse createPriceGroupGetDataArrayResponse() {
        return new PriceGroupGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPriceGroupData }
     * 
     */
    public ArrayOfPriceGroupData createArrayOfPriceGroupData() {
        return new ArrayOfPriceGroupData();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryGetAll }
     * 
     */
    public DocumentArchiveCategoryGetAll createDocumentArchiveCategoryGetAll() {
        return new DocumentArchiveCategoryGetAll();
    }

    /**
     * Create an instance of {@link CompanyGetCity }
     * 
     */
    public CompanyGetCity createCompanyGetCity() {
        return new CompanyGetCity();
    }

    /**
     * Create an instance of {@link SubscriptionCreateFromDataArray }
     * 
     */
    public SubscriptionCreateFromDataArray createSubscriptionCreateFromDataArray() {
        return new SubscriptionCreateFromDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfSubscriptionData }
     * 
     */
    public ArrayOfSubscriptionData createArrayOfSubscriptionData() {
        return new ArrayOfSubscriptionData();
    }

    /**
     * Create an instance of {@link SubscriberCreate }
     * 
     */
    public SubscriberCreate createSubscriberCreate() {
        return new SubscriberCreate();
    }

    /**
     * Create an instance of {@link CompanySetVatNumberResponse }
     * 
     */
    public CompanySetVatNumberResponse createCompanySetVatNumberResponse() {
        return new CompanySetVatNumberResponse();
    }

    /**
     * Create an instance of {@link SubscriptionGetAddPeriod }
     * 
     */
    public SubscriptionGetAddPeriod createSubscriptionGetAddPeriod() {
        return new SubscriptionGetAddPeriod();
    }

    /**
     * Create an instance of {@link SubscriptionLineCreateFromDataArrayResponse }
     * 
     */
    public SubscriptionLineCreateFromDataArrayResponse createSubscriptionLineCreateFromDataArrayResponse() {
        return new SubscriptionLineCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link VatAccountGetDataArrayResponse }
     * 
     */
    public VatAccountGetDataArrayResponse createVatAccountGetDataArrayResponse() {
        return new VatAccountGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfVatAccountData }
     * 
     */
    public ArrayOfVatAccountData createArrayOfVatAccountData() {
        return new ArrayOfVatAccountData();
    }

    /**
     * Create an instance of {@link ReportCodeGetAccountsResponse }
     * 
     */
    public ReportCodeGetAccountsResponse createReportCodeGetAccountsResponse() {
        return new ReportCodeGetAccountsResponse();
    }

    /**
     * Create an instance of {@link OrderGetProjectResponse }
     * 
     */
    public OrderGetProjectResponse createOrderGetProjectResponse() {
        return new OrderGetProjectResponse();
    }

    /**
     * Create an instance of {@link QuotationLineFindByProductResponse }
     * 
     */
    public QuotationLineFindByProductResponse createQuotationLineFindByProductResponse() {
        return new QuotationLineFindByProductResponse();
    }

    /**
     * Create an instance of {@link CreditorGetIsAccessibleResponse }
     * 
     */
    public CreditorGetIsAccessibleResponse createCreditorGetIsAccessibleResponse() {
        return new CreditorGetIsAccessibleResponse();
    }

    /**
     * Create an instance of {@link CreditorContactGetExternalIdResponse }
     * 
     */
    public CreditorContactGetExternalIdResponse createCreditorContactGetExternalIdResponse() {
        return new CreditorContactGetExternalIdResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDebtorPostalCode }
     * 
     */
    public CurrentInvoiceGetDebtorPostalCode createCurrentInvoiceGetDebtorPostalCode() {
        return new CurrentInvoiceGetDebtorPostalCode();
    }

    /**
     * Create an instance of {@link SubscriberGetRegisteredDateResponse }
     * 
     */
    public SubscriberGetRegisteredDateResponse createSubscriberGetRegisteredDateResponse() {
        return new SubscriberGetRegisteredDateResponse();
    }

    /**
     * Create an instance of {@link OrderGetAllCurrentResponse }
     * 
     */
    public OrderGetAllCurrentResponse createOrderGetAllCurrentResponse() {
        return new OrderGetAllCurrentResponse();
    }

    /**
     * Create an instance of {@link ProductGetVolume }
     * 
     */
    public ProductGetVolume createProductGetVolume() {
        return new ProductGetVolume();
    }

    /**
     * Create an instance of {@link QuotationSetDeliveryCountry }
     * 
     */
    public QuotationSetDeliveryCountry createQuotationSetDeliveryCountry() {
        return new QuotationSetDeliveryCountry();
    }

    /**
     * Create an instance of {@link DebtorSetPublicEntryNumber }
     * 
     */
    public DebtorSetPublicEntryNumber createDebtorSetPublicEntryNumber() {
        return new DebtorSetPublicEntryNumber();
    }

    /**
     * Create an instance of {@link OrderGetDebtorPostalCodeResponse }
     * 
     */
    public OrderGetDebtorPostalCodeResponse createOrderGetDebtorPostalCodeResponse() {
        return new OrderGetDebtorPostalCodeResponse();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetPageCountResponse }
     * 
     */
    public ScannedDocumentGetPageCountResponse createScannedDocumentGetPageCountResponse() {
        return new ScannedDocumentGetPageCountResponse();
    }

    /**
     * Create an instance of {@link AccountingYearGetYearResponse }
     * 
     */
    public AccountingYearGetYearResponse createAccountingYearGetYearResponse() {
        return new AccountingYearGetYearResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentSetDebtorResponse }
     * 
     */
    public TermOfPaymentSetDebtorResponse createTermOfPaymentSetDebtorResponse() {
        return new TermOfPaymentSetDebtorResponse();
    }

    /**
     * Create an instance of {@link ProjectGroupGetDataArray }
     * 
     */
    public ProjectGroupGetDataArray createProjectGroupGetDataArray() {
        return new ProjectGroupGetDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfProjectGroupHandle }
     * 
     */
    public ArrayOfProjectGroupHandle createArrayOfProjectGroupHandle() {
        return new ArrayOfProjectGroupHandle();
    }

    /**
     * Create an instance of {@link ProductDeleteResponse }
     * 
     */
    public ProductDeleteResponse createProductDeleteResponse() {
        return new ProductDeleteResponse();
    }

    /**
     * Create an instance of {@link QuotationGetDebtorCountyResponse }
     * 
     */
    public QuotationGetDebtorCountyResponse createQuotationGetDebtorCountyResponse() {
        return new QuotationGetDebtorCountyResponse();
    }

    /**
     * Create an instance of {@link CompanyGetSignUpDateResponse }
     * 
     */
    public CompanyGetSignUpDateResponse createCompanyGetSignUpDateResponse() {
        return new CompanyGetSignUpDateResponse();
    }

    /**
     * Create an instance of {@link DebtorGetDebtorGroup }
     * 
     */
    public DebtorGetDebtorGroup createDebtorGetDebtorGroup() {
        return new DebtorGetDebtorGroup();
    }

    /**
     * Create an instance of {@link DebtorFindByEmailResponse }
     * 
     */
    public DebtorFindByEmailResponse createDebtorFindByEmailResponse() {
        return new DebtorFindByEmailResponse();
    }

    /**
     * Create an instance of {@link CreditorEntryGetDateResponse }
     * 
     */
    public CreditorEntryGetDateResponse createCreditorEntryGetDateResponse() {
        return new CreditorEntryGetDateResponse();
    }

    /**
     * Create an instance of {@link CompanyGetContact }
     * 
     */
    public CompanyGetContact createCompanyGetContact() {
        return new CompanyGetContact();
    }

    /**
     * Create an instance of {@link AccountGetEntryTotalsByDateResponse }
     * 
     */
    public AccountGetEntryTotalsByDateResponse createAccountGetEntryTotalsByDateResponse() {
        return new AccountGetEntryTotalsByDateResponse();
    }

    /**
     * Create an instance of {@link OrderUpdateFromDataResponse }
     * 
     */
    public OrderUpdateFromDataResponse createOrderUpdateFromDataResponse() {
        return new OrderUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link AccountGetDebitCredit }
     * 
     */
    public AccountGetDebitCredit createAccountGetDebitCredit() {
        return new AccountGetDebitCredit();
    }

    /**
     * Create an instance of {@link OrderLineGetDataArrayResponse }
     * 
     */
    public OrderLineGetDataArrayResponse createOrderLineGetDataArrayResponse() {
        return new OrderLineGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOrderLineData }
     * 
     */
    public ArrayOfOrderLineData createArrayOfOrderLineData() {
        return new ArrayOfOrderLineData();
    }

    /**
     * Create an instance of {@link SubscriptionUpdateFromData }
     * 
     */
    public SubscriptionUpdateFromData createSubscriptionUpdateFromData() {
        return new SubscriptionUpdateFromData();
    }

    /**
     * Create an instance of {@link DebtorEntryGetRemainderResponse }
     * 
     */
    public DebtorEntryGetRemainderResponse createDebtorEntryGetRemainderResponse() {
        return new DebtorEntryGetRemainderResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryCreateCreditorInvoiceResponse }
     * 
     */
    public CashBookEntryCreateCreditorInvoiceResponse createCashBookEntryCreateCreditorInvoiceResponse() {
        return new CashBookEntryCreateCreditorInvoiceResponse();
    }

    /**
     * Create an instance of {@link ProductGetData }
     * 
     */
    public ProductGetData createProductGetData() {
        return new ProductGetData();
    }

    /**
     * Create an instance of {@link SubscriberSetEndDateResponse }
     * 
     */
    public SubscriberSetEndDateResponse createSubscriberSetEndDateResponse() {
        return new SubscriberSetEndDateResponse();
    }

    /**
     * Create an instance of {@link ProjectGetProjectGroupResponse }
     * 
     */
    public ProjectGetProjectGroupResponse createProjectGetProjectGroupResponse() {
        return new ProjectGetProjectGroupResponse();
    }

    /**
     * Create an instance of {@link OrderLineSetDistributionKeyResponse }
     * 
     */
    public OrderLineSetDistributionKeyResponse createOrderLineSetDistributionKeyResponse() {
        return new OrderLineSetDistributionKeyResponse();
    }

    /**
     * Create an instance of {@link DepartmentFindByNameResponse }
     * 
     */
    public DepartmentFindByNameResponse createDepartmentFindByNameResponse() {
        return new DepartmentFindByNameResponse();
    }

    /**
     * Create an instance of {@link CashBookGetDataArray }
     * 
     */
    public CashBookGetDataArray createCashBookGetDataArray() {
        return new CashBookGetDataArray();
    }

    /**
     * Create an instance of {@link DebtorSetVatZoneResponse }
     * 
     */
    public DebtorSetVatZoneResponse createDebtorSetVatZoneResponse() {
        return new DebtorSetVatZoneResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetInventoryLocation }
     * 
     */
    public OrderLineGetInventoryLocation createOrderLineGetInventoryLocation() {
        return new OrderLineGetInventoryLocation();
    }

    /**
     * Create an instance of {@link DebtorContactGetEmailResponse }
     * 
     */
    public DebtorContactGetEmailResponse createDebtorContactGetEmailResponse() {
        return new DebtorContactGetEmailResponse();
    }

    /**
     * Create an instance of {@link ReportCodeGetDataArray }
     * 
     */
    public ReportCodeGetDataArray createReportCodeGetDataArray() {
        return new ReportCodeGetDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfReportCodeHandle }
     * 
     */
    public ArrayOfReportCodeHandle createArrayOfReportCodeHandle() {
        return new ArrayOfReportCodeHandle();
    }

    /**
     * Create an instance of {@link AccountingYearCreate }
     * 
     */
    public AccountingYearCreate createAccountingYearCreate() {
        return new AccountingYearCreate();
    }

    /**
     * Create an instance of {@link EntryGetDocument }
     * 
     */
    public EntryGetDocument createEntryGetDocument() {
        return new EntryGetDocument();
    }

    /**
     * Create an instance of {@link CreditorContactCreate }
     * 
     */
    public CreditorContactCreate createCreditorContactCreate() {
        return new CreditorContactCreate();
    }

    /**
     * Create an instance of {@link CreditorGetAllUpdated }
     * 
     */
    public CreditorGetAllUpdated createCreditorGetAllUpdated() {
        return new CreditorGetAllUpdated();
    }

    /**
     * Create an instance of {@link InvoiceGetLinesResponse }
     * 
     */
    public InvoiceGetLinesResponse createInvoiceGetLinesResponse() {
        return new InvoiceGetLinesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInvoiceLineHandle }
     * 
     */
    public ArrayOfInvoiceLineHandle createArrayOfInvoiceLineHandle() {
        return new ArrayOfInvoiceLineHandle();
    }

    /**
     * Create an instance of {@link DepartmentSetName }
     * 
     */
    public DepartmentSetName createDepartmentSetName() {
        return new DepartmentSetName();
    }

    /**
     * Create an instance of {@link CreditorGetAutoContraAccountResponse }
     * 
     */
    public CreditorGetAutoContraAccountResponse createCreditorGetAutoContraAccountResponse() {
        return new CreditorGetAutoContraAccountResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineGetDataArray }
     * 
     */
    public CurrentSupplierInvoiceLineGetDataArray createCurrentSupplierInvoiceLineGetDataArray() {
        return new CurrentSupplierInvoiceLineGetDataArray();
    }

    /**
     * Create an instance of {@link SubscriptionLineSetDepartmentResponse }
     * 
     */
    public SubscriptionLineSetDepartmentResponse createSubscriptionLineSetDepartmentResponse() {
        return new SubscriptionLineSetDepartmentResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetDeliveryDateResponse }
     * 
     */
    public InvoiceGetDeliveryDateResponse createInvoiceGetDeliveryDateResponse() {
        return new InvoiceGetDeliveryDateResponse();
    }

    /**
     * Create an instance of {@link EntryFindByDateInterval }
     * 
     */
    public EntryFindByDateInterval createEntryFindByDateInterval() {
        return new EntryFindByDateInterval();
    }

    /**
     * Create an instance of {@link TimeEntryCreateFromDataResponse }
     * 
     */
    public TimeEntryCreateFromDataResponse createTimeEntryCreateFromDataResponse() {
        return new TimeEntryCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link CreditorGroupGetAllResponse }
     * 
     */
    public CreditorGroupGetAllResponse createCreditorGroupGetAllResponse() {
        return new CreditorGroupGetAllResponse();
    }

    /**
     * Create an instance of {@link SubscriptionLineFindBySubscriptonList }
     * 
     */
    public SubscriptionLineFindBySubscriptonList createSubscriptionLineFindBySubscriptonList() {
        return new SubscriptionLineFindBySubscriptonList();
    }

    /**
     * Create an instance of {@link ArrayOfSubscriptionHandle }
     * 
     */
    public ArrayOfSubscriptionHandle createArrayOfSubscriptionHandle() {
        return new ArrayOfSubscriptionHandle();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetToDateResponse }
     * 
     */
    public ScannedDocumentGetToDateResponse createScannedDocumentGetToDateResponse() {
        return new ScannedDocumentGetToDateResponse();
    }

    /**
     * Create an instance of {@link ReportCodeSetGetCodes }
     * 
     */
    public ReportCodeSetGetCodes createReportCodeSetGetCodes() {
        return new ReportCodeSetGetCodes();
    }

    /**
     * Create an instance of {@link QuotationSetDebtorAddress }
     * 
     */
    public QuotationSetDebtorAddress createQuotationSetDebtorAddress() {
        return new QuotationSetDebtorAddress();
    }

    /**
     * Create an instance of {@link BudgetFigureSetDepartmentResponse }
     * 
     */
    public BudgetFigureSetDepartmentResponse createBudgetFigureSetDepartmentResponse() {
        return new BudgetFigureSetDepartmentResponse();
    }

    /**
     * Create an instance of {@link ConnectWithTokenResponse }
     * 
     */
    public ConnectWithTokenResponse createConnectWithTokenResponse() {
        return new ConnectWithTokenResponse();
    }

    /**
     * Create an instance of {@link EmployeeCreateFromData }
     * 
     */
    public EmployeeCreateFromData createEmployeeCreateFromData() {
        return new EmployeeCreateFromData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDeliveryPostalCode }
     * 
     */
    public CurrentInvoiceGetDeliveryPostalCode createCurrentInvoiceGetDeliveryPostalCode() {
        return new CurrentInvoiceGetDeliveryPostalCode();
    }

    /**
     * Create an instance of {@link CreditorGetDefaultPaymentTypeResponse }
     * 
     */
    public CreditorGetDefaultPaymentTypeResponse createCreditorGetDefaultPaymentTypeResponse() {
        return new CreditorGetDefaultPaymentTypeResponse();
    }

    /**
     * Create an instance of {@link EmployeeGetMileageEntriesByDateResponse }
     * 
     */
    public EmployeeGetMileageEntriesByDateResponse createEmployeeGetMileageEntriesByDateResponse() {
        return new EmployeeGetMileageEntriesByDateResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetStartDateResponse }
     * 
     */
    public CashBookEntryGetStartDateResponse createCashBookEntryGetStartDateResponse() {
        return new CashBookEntryGetStartDateResponse();
    }

    /**
     * Create an instance of {@link QuotationGetDebtorPostalCode }
     * 
     */
    public QuotationGetDebtorPostalCode createQuotationGetDebtorPostalCode() {
        return new QuotationGetDebtorPostalCode();
    }

    /**
     * Create an instance of {@link ExtendedVatZoneFindByNumber }
     * 
     */
    public ExtendedVatZoneFindByNumber createExtendedVatZoneFindByNumber() {
        return new ExtendedVatZoneFindByNumber();
    }

    /**
     * Create an instance of {@link SubscriberSetDiscountExpiryDateResponse }
     * 
     */
    public SubscriberSetDiscountExpiryDateResponse createSubscriberSetDiscountExpiryDateResponse() {
        return new SubscriberSetDiscountExpiryDateResponse();
    }

    /**
     * Create an instance of {@link DepartmentCreateResponse }
     * 
     */
    public DepartmentCreateResponse createDepartmentCreateResponse() {
        return new DepartmentCreateResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetDueDateResponse }
     * 
     */
    public CashBookEntryGetDueDateResponse createCashBookEntryGetDueDateResponse() {
        return new CashBookEntryGetDueDateResponse();
    }

    /**
     * Create an instance of {@link SubscriberGetSpecialPrice }
     * 
     */
    public SubscriberGetSpecialPrice createSubscriberGetSpecialPrice() {
        return new SubscriberGetSpecialPrice();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetInvoiceResponse }
     * 
     */
    public CurrentInvoiceLineGetInvoiceResponse createCurrentInvoiceLineGetInvoiceResponse() {
        return new CurrentInvoiceLineGetInvoiceResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetNetAmountDefaultCurrencyResponse }
     * 
     */
    public InvoiceGetNetAmountDefaultCurrencyResponse createInvoiceGetNetAmountDefaultCurrencyResponse() {
        return new InvoiceGetNetAmountDefaultCurrencyResponse();
    }

    /**
     * Create an instance of {@link CreditorSetCounty }
     * 
     */
    public CreditorSetCounty createCreditorSetCounty() {
        return new CreditorSetCounty();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDateResponse }
     * 
     */
    public CurrentInvoiceGetDateResponse createCurrentInvoiceGetDateResponse() {
        return new CurrentInvoiceGetDateResponse();
    }

    /**
     * Create an instance of {@link ExtendedVatZoneGetAll }
     * 
     */
    public ExtendedVatZoneGetAll createExtendedVatZoneGetAll() {
        return new ExtendedVatZoneGetAll();
    }

    /**
     * Create an instance of {@link TimeEntryGetNumberOfHours }
     * 
     */
    public TimeEntryGetNumberOfHours createTimeEntryGetNumberOfHours() {
        return new TimeEntryGetNumberOfHours();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryGetNameResponse }
     * 
     */
    public DocumentArchiveCategoryGetNameResponse createDocumentArchiveCategoryGetNameResponse() {
        return new DocumentArchiveCategoryGetNameResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineGetDepartment }
     * 
     */
    public InvoiceLineGetDepartment createInvoiceLineGetDepartment() {
        return new InvoiceLineGetDepartment();
    }

    /**
     * Create an instance of {@link CurrencyGetCodeResponse }
     * 
     */
    public CurrencyGetCodeResponse createCurrencyGetCodeResponse() {
        return new CurrencyGetCodeResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetMarginAsPercentResponse }
     * 
     */
    public CurrentInvoiceLineGetMarginAsPercentResponse createCurrentInvoiceLineGetMarginAsPercentResponse() {
        return new CurrentInvoiceLineGetMarginAsPercentResponse();
    }

    /**
     * Create an instance of {@link ProductGetOrderedResponse }
     * 
     */
    public ProductGetOrderedResponse createProductGetOrderedResponse() {
        return new ProductGetOrderedResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDataResponse }
     * 
     */
    public CurrentInvoiceGetDataResponse createCurrentInvoiceGetDataResponse() {
        return new CurrentInvoiceGetDataResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceData }
     * 
     */
    public CurrentInvoiceData createCurrentInvoiceData() {
        return new CurrentInvoiceData();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetDataResponse }
     * 
     */
    public TermOfPaymentGetDataResponse createTermOfPaymentGetDataResponse() {
        return new TermOfPaymentGetDataResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentData }
     * 
     */
    public TermOfPaymentData createTermOfPaymentData() {
        return new TermOfPaymentData();
    }

    /**
     * Create an instance of {@link InvoiceGetIsVatIncludedResponse }
     * 
     */
    public InvoiceGetIsVatIncludedResponse createInvoiceGetIsVatIncludedResponse() {
        return new InvoiceGetIsVatIncludedResponse();
    }

    /**
     * Create an instance of {@link EmployeeSetGroup }
     * 
     */
    public EmployeeSetGroup createEmployeeSetGroup() {
        return new EmployeeSetGroup();
    }

    /**
     * Create an instance of {@link CashBookEntryGetContraAccountResponse }
     * 
     */
    public CashBookEntryGetContraAccountResponse createCashBookEntryGetContraAccountResponse() {
        return new CashBookEntryGetContraAccountResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetAllResponse }
     * 
     */
    public InvoiceGetAllResponse createInvoiceGetAllResponse() {
        return new InvoiceGetAllResponse();
    }

    /**
     * Create an instance of {@link CreditorGetEntriesResponse }
     * 
     */
    public CreditorGetEntriesResponse createCreditorGetEntriesResponse() {
        return new CreditorGetEntriesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCreditorEntryHandle }
     * 
     */
    public ArrayOfCreditorEntryHandle createArrayOfCreditorEntryHandle() {
        return new ArrayOfCreditorEntryHandle();
    }

    /**
     * Create an instance of {@link CreditorContactGetAll }
     * 
     */
    public CreditorContactGetAll createCreditorContactGetAll() {
        return new CreditorContactGetAll();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetOurReference2Response }
     * 
     */
    public CurrentInvoiceGetOurReference2Response createCurrentInvoiceGetOurReference2Response() {
        return new CurrentInvoiceGetOurReference2Response();
    }

    /**
     * Create an instance of {@link DebtorFindByEan }
     * 
     */
    public DebtorFindByEan createDebtorFindByEan() {
        return new DebtorFindByEan();
    }

    /**
     * Create an instance of {@link DebtorContactGetExternalId }
     * 
     */
    public DebtorContactGetExternalId createDebtorContactGetExternalId() {
        return new DebtorContactGetExternalId();
    }

    /**
     * Create an instance of {@link DebtorContactCreateFromDataResponse }
     * 
     */
    public DebtorContactCreateFromDataResponse createDebtorContactCreateFromDataResponse() {
        return new DebtorContactCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link CompanyGetResponse }
     * 
     */
    public CompanyGetResponse createCompanyGetResponse() {
        return new CompanyGetResponse();
    }

    /**
     * Create an instance of {@link ProjectSetDebtor }
     * 
     */
    public ProjectSetDebtor createProjectSetDebtor() {
        return new ProjectSetDebtor();
    }

    /**
     * Create an instance of {@link ProductDelete }
     * 
     */
    public ProductDelete createProductDelete() {
        return new ProductDelete();
    }

    /**
     * Create an instance of {@link ProjectSetProjectGroup }
     * 
     */
    public ProjectSetProjectGroup createProjectSetProjectGroup() {
        return new ProjectSetProjectGroup();
    }

    /**
     * Create an instance of {@link QuotationCreateFromData }
     * 
     */
    public QuotationCreateFromData createQuotationCreateFromData() {
        return new QuotationCreateFromData();
    }

    /**
     * Create an instance of {@link DebtorContactUpdateFromData }
     * 
     */
    public DebtorContactUpdateFromData createDebtorContactUpdateFromData() {
        return new DebtorContactUpdateFromData();
    }

    /**
     * Create an instance of {@link DebtorContactData }
     * 
     */
    public DebtorContactData createDebtorContactData() {
        return new DebtorContactData();
    }

    /**
     * Create an instance of {@link EmployeeGroupSetNameResponse }
     * 
     */
    public EmployeeGroupSetNameResponse createEmployeeGroupSetNameResponse() {
        return new EmployeeGroupSetNameResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetDueDate }
     * 
     */
    public InvoiceGetDueDate createInvoiceGetDueDate() {
        return new InvoiceGetDueDate();
    }

    /**
     * Create an instance of {@link CompanyGetFaxNumber }
     * 
     */
    public CompanyGetFaxNumber createCompanyGetFaxNumber() {
        return new CompanyGetFaxNumber();
    }

    /**
     * Create an instance of {@link ProjectCreateFromDataArrayResponse }
     * 
     */
    public ProjectCreateFromDataArrayResponse createProjectCreateFromDataArrayResponse() {
        return new ProjectCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link OrderSetDeliveryLocation }
     * 
     */
    public OrderSetDeliveryLocation createOrderSetDeliveryLocation() {
        return new OrderSetDeliveryLocation();
    }

    /**
     * Create an instance of {@link EmployeeGroupGetNameResponse }
     * 
     */
    public EmployeeGroupGetNameResponse createEmployeeGroupGetNameResponse() {
        return new EmployeeGroupGetNameResponse();
    }

    /**
     * Create an instance of {@link DebtorSetEmailResponse }
     * 
     */
    public DebtorSetEmailResponse createDebtorSetEmailResponse() {
        return new DebtorSetEmailResponse();
    }

    /**
     * Create an instance of {@link InventoryLocationGetAllResponse }
     * 
     */
    public InventoryLocationGetAllResponse createInventoryLocationGetAllResponse() {
        return new InventoryLocationGetAllResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInventoryLocationHandle }
     * 
     */
    public ArrayOfInventoryLocationHandle createArrayOfInventoryLocationHandle() {
        return new ArrayOfInventoryLocationHandle();
    }

    /**
     * Create an instance of {@link QuotationLineGetDeliveryDateResponse }
     * 
     */
    public QuotationLineGetDeliveryDateResponse createQuotationLineGetDeliveryDateResponse() {
        return new QuotationLineGetDeliveryDateResponse();
    }

    /**
     * Create an instance of {@link QuotationLineGetDepartmentResponse }
     * 
     */
    public QuotationLineGetDepartmentResponse createQuotationLineGetDepartmentResponse() {
        return new QuotationLineGetDepartmentResponse();
    }

    /**
     * Create an instance of {@link SubscriptionGetDescriptionResponse }
     * 
     */
    public SubscriptionGetDescriptionResponse createSubscriptionGetDescriptionResponse() {
        return new SubscriptionGetDescriptionResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationDeleteResponse }
     * 
     */
    public DeliveryLocationDeleteResponse createDeliveryLocationDeleteResponse() {
        return new DeliveryLocationDeleteResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetUnitResponse }
     * 
     */
    public CurrentInvoiceLineSetUnitResponse createCurrentInvoiceLineSetUnitResponse() {
        return new CurrentInvoiceLineSetUnitResponse();
    }

    /**
     * Create an instance of {@link OrderGetData }
     * 
     */
    public OrderGetData createOrderGetData() {
        return new OrderGetData();
    }

    /**
     * Create an instance of {@link QuotationLineFindByProductList }
     * 
     */
    public QuotationLineFindByProductList createQuotationLineFindByProductList() {
        return new QuotationLineFindByProductList();
    }

    /**
     * Create an instance of {@link DebtorContactGetAllResponse }
     * 
     */
    public DebtorContactGetAllResponse createDebtorContactGetAllResponse() {
        return new DebtorContactGetAllResponse();
    }

    /**
     * Create an instance of {@link CreditorFindByNumberListResponse }
     * 
     */
    public CreditorFindByNumberListResponse createCreditorFindByNumberListResponse() {
        return new CreditorFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCreditorHandle }
     * 
     */
    public ArrayOfCreditorHandle createArrayOfCreditorHandle() {
        return new ArrayOfCreditorHandle();
    }

    /**
     * Create an instance of {@link OrderGetDate }
     * 
     */
    public OrderGetDate createOrderGetDate() {
        return new OrderGetDate();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineGetData }
     * 
     */
    public CurrentSupplierInvoiceLineGetData createCurrentSupplierInvoiceLineGetData() {
        return new CurrentSupplierInvoiceLineGetData();
    }

    /**
     * Create an instance of {@link AccountGetDistributionKey }
     * 
     */
    public AccountGetDistributionKey createAccountGetDistributionKey() {
        return new AccountGetDistributionKey();
    }

    /**
     * Create an instance of {@link ProjectGroupGetAll }
     * 
     */
    public ProjectGroupGetAll createProjectGroupGetAll() {
        return new ProjectGroupGetAll();
    }

    /**
     * Create an instance of {@link DeliveryLocationCreateFromDataArrayResponse }
     * 
     */
    public DeliveryLocationCreateFromDataArrayResponse createDeliveryLocationCreateFromDataArrayResponse() {
        return new DeliveryLocationCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CashBookBookResponse }
     * 
     */
    public CashBookBookResponse createCashBookBookResponse() {
        return new CashBookBookResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureGetDataArray }
     * 
     */
    public BudgetFigureGetDataArray createBudgetFigureGetDataArray() {
        return new BudgetFigureGetDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfBudgetFigureHandle }
     * 
     */
    public ArrayOfBudgetFigureHandle createArrayOfBudgetFigureHandle() {
        return new ArrayOfBudgetFigureHandle();
    }

    /**
     * Create an instance of {@link ProductSetUnit }
     * 
     */
    public ProductSetUnit createProductSetUnit() {
        return new ProductSetUnit();
    }

    /**
     * Create an instance of {@link ProductGroupGetAccountForVatLiableDebtorInvoicesCurrent }
     * 
     */
    public ProductGroupGetAccountForVatLiableDebtorInvoicesCurrent createProductGroupGetAccountForVatLiableDebtorInvoicesCurrent() {
        return new ProductGroupGetAccountForVatLiableDebtorInvoicesCurrent();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryFindByName }
     * 
     */
    public DocumentArchiveCategoryFindByName createDocumentArchiveCategoryFindByName() {
        return new DocumentArchiveCategoryFindByName();
    }

    /**
     * Create an instance of {@link SumIntervalGetAccountResponse }
     * 
     */
    public SumIntervalGetAccountResponse createSumIntervalGetAccountResponse() {
        return new SumIntervalGetAccountResponse();
    }

    /**
     * Create an instance of {@link OrderGetDebtorCounty }
     * 
     */
    public OrderGetDebtorCounty createOrderGetDebtorCounty() {
        return new OrderGetDebtorCounty();
    }

    /**
     * Create an instance of {@link BudgetFigureGetToDateResponse }
     * 
     */
    public BudgetFigureGetToDateResponse createBudgetFigureGetToDateResponse() {
        return new BudgetFigureGetToDateResponse();
    }

    /**
     * Create an instance of {@link SubscriptionDelete }
     * 
     */
    public SubscriptionDelete createSubscriptionDelete() {
        return new SubscriptionDelete();
    }

    /**
     * Create an instance of {@link MileageEntrySetStartLocationResponse }
     * 
     */
    public MileageEntrySetStartLocationResponse createMileageEntrySetStartLocationResponse() {
        return new MileageEntrySetStartLocationResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDeductionAmount }
     * 
     */
    public CurrentInvoiceGetDeductionAmount createCurrentInvoiceGetDeductionAmount() {
        return new CurrentInvoiceGetDeductionAmount();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetNumber }
     * 
     */
    public ScannedDocumentGetNumber createScannedDocumentGetNumber() {
        return new ScannedDocumentGetNumber();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceCreateFromDataArray }
     * 
     */
    public CurrentSupplierInvoiceCreateFromDataArray createCurrentSupplierInvoiceCreateFromDataArray() {
        return new CurrentSupplierInvoiceCreateFromDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfCurrentSupplierInvoiceData }
     * 
     */
    public ArrayOfCurrentSupplierInvoiceData createArrayOfCurrentSupplierInvoiceData() {
        return new ArrayOfCurrentSupplierInvoiceData();
    }

    /**
     * Create an instance of {@link TimeEntryGetTextResponse }
     * 
     */
    public TimeEntryGetTextResponse createTimeEntryGetTextResponse() {
        return new TimeEntryGetTextResponse();
    }

    /**
     * Create an instance of {@link CreditorGroupGetCreditorsResponse }
     * 
     */
    public CreditorGroupGetCreditorsResponse createCreditorGroupGetCreditorsResponse() {
        return new CreditorGroupGetCreditorsResponse();
    }

    /**
     * Create an instance of {@link ReportCodeSetGetAll }
     * 
     */
    public ReportCodeSetGetAll createReportCodeSetGetAll() {
        return new ReportCodeSetGetAll();
    }

    /**
     * Create an instance of {@link CreditorGetCounty }
     * 
     */
    public CreditorGetCounty createCreditorGetCounty() {
        return new CreditorGetCounty();
    }

    /**
     * Create an instance of {@link OrderGetDebtorAddressResponse }
     * 
     */
    public OrderGetDebtorAddressResponse createOrderGetDebtorAddressResponse() {
        return new OrderGetDebtorAddressResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetCountryResponse }
     * 
     */
    public DeliveryLocationGetCountryResponse createDeliveryLocationGetCountryResponse() {
        return new DeliveryLocationGetCountryResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetType }
     * 
     */
    public CashBookEntryGetType createCashBookEntryGetType() {
        return new CashBookEntryGetType();
    }

    /**
     * Create an instance of {@link DebtorGetAddressResponse }
     * 
     */
    public DebtorGetAddressResponse createDebtorGetAddressResponse() {
        return new DebtorGetAddressResponse();
    }

    /**
     * Create an instance of {@link DebtorGetPriceGroupResponse }
     * 
     */
    public DebtorGetPriceGroupResponse createDebtorGetPriceGroupResponse() {
        return new DebtorGetPriceGroupResponse();
    }

    /**
     * Create an instance of {@link PriceGroupHandle }
     * 
     */
    public PriceGroupHandle createPriceGroupHandle() {
        return new PriceGroupHandle();
    }

    /**
     * Create an instance of {@link TemplateCollectionFindByNameResponse }
     * 
     */
    public TemplateCollectionFindByNameResponse createTemplateCollectionFindByNameResponse() {
        return new TemplateCollectionFindByNameResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTemplateCollectionHandle }
     * 
     */
    public ArrayOfTemplateCollectionHandle createArrayOfTemplateCollectionHandle() {
        return new ArrayOfTemplateCollectionHandle();
    }

    /**
     * Create an instance of {@link DebtorGetPublicEntryNumberResponse }
     * 
     */
    public DebtorGetPublicEntryNumberResponse createDebtorGetPublicEntryNumberResponse() {
        return new DebtorGetPublicEntryNumberResponse();
    }

    /**
     * Create an instance of {@link InventoryLocationFindByNameResponse }
     * 
     */
    public InventoryLocationFindByNameResponse createInventoryLocationFindByNameResponse() {
        return new InventoryLocationFindByNameResponse();
    }

    /**
     * Create an instance of {@link OrderGetRoundingAmount }
     * 
     */
    public OrderGetRoundingAmount createOrderGetRoundingAmount() {
        return new OrderGetRoundingAmount();
    }

    /**
     * Create an instance of {@link ProductGroupGetAccountForVatExemptDebtorInvoicesCurrentResponse }
     * 
     */
    public ProductGroupGetAccountForVatExemptDebtorInvoicesCurrentResponse createProductGroupGetAccountForVatExemptDebtorInvoicesCurrentResponse() {
        return new ProductGroupGetAccountForVatExemptDebtorInvoicesCurrentResponse();
    }

    /**
     * Create an instance of {@link CompanyGetCINumber }
     * 
     */
    public CompanyGetCINumber createCompanyGetCINumber() {
        return new CompanyGetCINumber();
    }

    /**
     * Create an instance of {@link CreditorGetAllResponse }
     * 
     */
    public CreditorGetAllResponse createCreditorGetAllResponse() {
        return new CreditorGetAllResponse();
    }

    /**
     * Create an instance of {@link SubscriberSetExpiryDate }
     * 
     */
    public SubscriberSetExpiryDate createSubscriberSetExpiryDate() {
        return new SubscriberSetExpiryDate();
    }

    /**
     * Create an instance of {@link InvoiceGetDeliveryAddress }
     * 
     */
    public InvoiceGetDeliveryAddress createInvoiceGetDeliveryAddress() {
        return new InvoiceGetDeliveryAddress();
    }

    /**
     * Create an instance of {@link QuotationSetOtherReferenceResponse }
     * 
     */
    public QuotationSetOtherReferenceResponse createQuotationSetOtherReferenceResponse() {
        return new QuotationSetOtherReferenceResponse();
    }

    /**
     * Create an instance of {@link AccountingPeriodGetAccountingYear }
     * 
     */
    public AccountingPeriodGetAccountingYear createAccountingPeriodGetAccountingYear() {
        return new AccountingPeriodGetAccountingYear();
    }

    /**
     * Create an instance of {@link AccountingPeriodHandle }
     * 
     */
    public AccountingPeriodHandle createAccountingPeriodHandle() {
        return new AccountingPeriodHandle();
    }

    /**
     * Create an instance of {@link OrderSetAttention }
     * 
     */
    public OrderSetAttention createOrderSetAttention() {
        return new OrderSetAttention();
    }

    /**
     * Create an instance of {@link OrderSetDebtorName }
     * 
     */
    public OrderSetDebtorName createOrderSetDebtorName() {
        return new OrderSetDebtorName();
    }

    /**
     * Create an instance of {@link CreditorGetAddress }
     * 
     */
    public CreditorGetAddress createCreditorGetAddress() {
        return new CreditorGetAddress();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetDataArrayResponse }
     * 
     */
    public CurrentInvoiceLineGetDataArrayResponse createCurrentInvoiceLineGetDataArrayResponse() {
        return new CurrentInvoiceLineGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetDistributionInPercent }
     * 
     */
    public TermOfPaymentGetDistributionInPercent createTermOfPaymentGetDistributionInPercent() {
        return new TermOfPaymentGetDistributionInPercent();
    }

    /**
     * Create an instance of {@link OrderSetOurReference2Response }
     * 
     */
    public OrderSetOurReference2Response createOrderSetOurReference2Response() {
        return new OrderSetOurReference2Response();
    }

    /**
     * Create an instance of {@link ProductGroupDeleteResponse }
     * 
     */
    public ProductGroupDeleteResponse createProductGroupDeleteResponse() {
        return new ProductGroupDeleteResponse();
    }

    /**
     * Create an instance of {@link MileageEntrySetDate }
     * 
     */
    public MileageEntrySetDate createMileageEntrySetDate() {
        return new MileageEntrySetDate();
    }

    /**
     * Create an instance of {@link ProductGroupUpdateFromDataArray }
     * 
     */
    public ProductGroupUpdateFromDataArray createProductGroupUpdateFromDataArray() {
        return new ProductGroupUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfProductGroupData }
     * 
     */
    public ArrayOfProductGroupData createArrayOfProductGroupData() {
        return new ArrayOfProductGroupData();
    }

    /**
     * Create an instance of {@link OrderLineSetInventoryLocationResponse }
     * 
     */
    public OrderLineSetInventoryLocationResponse createOrderLineSetInventoryLocationResponse() {
        return new OrderLineSetInventoryLocationResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetNumberResponse }
     * 
     */
    public OrderLineGetNumberResponse createOrderLineGetNumberResponse() {
        return new OrderLineGetNumberResponse();
    }

    /**
     * Create an instance of {@link OrderSetTermOfPaymentResponse }
     * 
     */
    public OrderSetTermOfPaymentResponse createOrderSetTermOfPaymentResponse() {
        return new OrderSetTermOfPaymentResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineDeleteResponse }
     * 
     */
    public CurrentInvoiceLineDeleteResponse createCurrentInvoiceLineDeleteResponse() {
        return new CurrentInvoiceLineDeleteResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetDepartmentResponse }
     * 
     */
    public CurrentInvoiceLineGetDepartmentResponse createCurrentInvoiceLineGetDepartmentResponse() {
        return new CurrentInvoiceLineGetDepartmentResponse();
    }

    /**
     * Create an instance of {@link AccountGetEntriesByNumberResponse }
     * 
     */
    public AccountGetEntriesByNumberResponse createAccountGetEntriesByNumberResponse() {
        return new AccountGetEntriesByNumberResponse();
    }

    /**
     * Create an instance of {@link CreditorSetRemittanceInformationResponse }
     * 
     */
    public CreditorSetRemittanceInformationResponse createCreditorSetRemittanceInformationResponse() {
        return new CreditorSetRemittanceInformationResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetAmount }
     * 
     */
    public CashBookEntryGetAmount createCashBookEntryGetAmount() {
        return new CashBookEntryGetAmount();
    }

    /**
     * Create an instance of {@link InvoiceFindByDateIntervalResponse }
     * 
     */
    public InvoiceFindByDateIntervalResponse createInvoiceFindByDateIntervalResponse() {
        return new InvoiceFindByDateIntervalResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDeliveryCounty }
     * 
     */
    public CurrentInvoiceSetDeliveryCounty createCurrentInvoiceSetDeliveryCounty() {
        return new CurrentInvoiceSetDeliveryCounty();
    }

    /**
     * Create an instance of {@link OrderLineSetInventoryLocation }
     * 
     */
    public OrderLineSetInventoryLocation createOrderLineSetInventoryLocation() {
        return new OrderLineSetInventoryLocation();
    }

    /**
     * Create an instance of {@link QuotationCancelSentStatus }
     * 
     */
    public QuotationCancelSentStatus createQuotationCancelSentStatus() {
        return new QuotationCancelSentStatus();
    }

    /**
     * Create an instance of {@link OrderGetLayout }
     * 
     */
    public OrderGetLayout createOrderGetLayout() {
        return new OrderGetLayout();
    }

    /**
     * Create an instance of {@link SubscriptionSetIncludeName }
     * 
     */
    public SubscriptionSetIncludeName createSubscriptionSetIncludeName() {
        return new SubscriptionSetIncludeName();
    }

    /**
     * Create an instance of {@link CashBookEntryGetDebtorInvoiceNumberResponse }
     * 
     */
    public CashBookEntryGetDebtorInvoiceNumberResponse createCashBookEntryGetDebtorInvoiceNumberResponse() {
        return new CashBookEntryGetDebtorInvoiceNumberResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDebtorResponse }
     * 
     */
    public CurrentInvoiceSetDebtorResponse createCurrentInvoiceSetDebtorResponse() {
        return new CurrentInvoiceSetDebtorResponse();
    }

    /**
     * Create an instance of {@link EmployeeGroupFindByNameResponse }
     * 
     */
    public EmployeeGroupFindByNameResponse createEmployeeGroupFindByNameResponse() {
        return new EmployeeGroupFindByNameResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetCurrencyResponse }
     * 
     */
    public CurrentInvoiceSetCurrencyResponse createCurrentInvoiceSetCurrencyResponse() {
        return new CurrentInvoiceSetCurrencyResponse();
    }

    /**
     * Create an instance of {@link QuotationUpgradeToOrderResponse }
     * 
     */
    public QuotationUpgradeToOrderResponse createQuotationUpgradeToOrderResponse() {
        return new QuotationUpgradeToOrderResponse();
    }

    /**
     * Create an instance of {@link DebtorGetOpenEntriesResponse }
     * 
     */
    public DebtorGetOpenEntriesResponse createDebtorGetOpenEntriesResponse() {
        return new DebtorGetOpenEntriesResponse();
    }

    /**
     * Create an instance of {@link DebtorSetTermOfPayment }
     * 
     */
    public DebtorSetTermOfPayment createDebtorSetTermOfPayment() {
        return new DebtorSetTermOfPayment();
    }

    /**
     * Create an instance of {@link ReportCodeSetGetCodeSetResponse }
     * 
     */
    public ReportCodeSetGetCodeSetResponse createReportCodeSetGetCodeSetResponse() {
        return new ReportCodeSetGetCodeSetResponse();
    }

    /**
     * Create an instance of {@link TimeEntryGetEmployee }
     * 
     */
    public TimeEntryGetEmployee createTimeEntryGetEmployee() {
        return new TimeEntryGetEmployee();
    }

    /**
     * Create an instance of {@link AccountGetAllResponse }
     * 
     */
    public AccountGetAllResponse createAccountGetAllResponse() {
        return new AccountGetAllResponse();
    }

    /**
     * Create an instance of {@link DebtorGroupCreateFromDataResponse }
     * 
     */
    public DebtorGroupCreateFromDataResponse createDebtorGroupCreateFromDataResponse() {
        return new DebtorGroupCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link SubscriberSetEndDate }
     * 
     */
    public SubscriberSetEndDate createSubscriberSetEndDate() {
        return new SubscriberSetEndDate();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceGetCreditor }
     * 
     */
    public CurrentSupplierInvoiceGetCreditor createCurrentSupplierInvoiceGetCreditor() {
        return new CurrentSupplierInvoiceGetCreditor();
    }

    /**
     * Create an instance of {@link SubscriberGetDiscountAsPercent }
     * 
     */
    public SubscriberGetDiscountAsPercent createSubscriberGetDiscountAsPercent() {
        return new SubscriberGetDiscountAsPercent();
    }

    /**
     * Create an instance of {@link OrderSetDebtorCountryResponse }
     * 
     */
    public OrderSetDebtorCountryResponse createOrderSetDebtorCountryResponse() {
        return new OrderSetDebtorCountryResponse();
    }

    /**
     * Create an instance of {@link AccountingYearGetAll }
     * 
     */
    public AccountingYearGetAll createAccountingYearGetAll() {
        return new AccountingYearGetAll();
    }

    /**
     * Create an instance of {@link QuotationLineGetQuotationResponse }
     * 
     */
    public QuotationLineGetQuotationResponse createQuotationLineGetQuotationResponse() {
        return new QuotationLineGetQuotationResponse();
    }

    /**
     * Create an instance of {@link OrderSetDebtor }
     * 
     */
    public OrderSetDebtor createOrderSetDebtor() {
        return new OrderSetDebtor();
    }

    /**
     * Create an instance of {@link CompanySetName }
     * 
     */
    public CompanySetName createCompanySetName() {
        return new CompanySetName();
    }

    /**
     * Create an instance of {@link SubscriptionLineSetProduct }
     * 
     */
    public SubscriptionLineSetProduct createSubscriptionLineSetProduct() {
        return new SubscriptionLineSetProduct();
    }

    /**
     * Create an instance of {@link DebtorSetPublicEntryNumberResponse }
     * 
     */
    public DebtorSetPublicEntryNumberResponse createDebtorSetPublicEntryNumberResponse() {
        return new DebtorSetPublicEntryNumberResponse();
    }

    /**
     * Create an instance of {@link EntryGetProject }
     * 
     */
    public EntryGetProject createEntryGetProject() {
        return new EntryGetProject();
    }

    /**
     * Create an instance of {@link PriceGroupGetData }
     * 
     */
    public PriceGroupGetData createPriceGroupGetData() {
        return new PriceGroupGetData();
    }

    /**
     * Create an instance of {@link InvoiceGetNumber }
     * 
     */
    public InvoiceGetNumber createInvoiceGetNumber() {
        return new InvoiceGetNumber();
    }

    /**
     * Create an instance of {@link DebtorEntryGetTypeResponse }
     * 
     */
    public DebtorEntryGetTypeResponse createDebtorEntryGetTypeResponse() {
        return new DebtorEntryGetTypeResponse();
    }

    /**
     * Create an instance of {@link QuotationSetExchangeRate }
     * 
     */
    public QuotationSetExchangeRate createQuotationSetExchangeRate() {
        return new QuotationSetExchangeRate();
    }

    /**
     * Create an instance of {@link ProjectFindByNameResponse }
     * 
     */
    public ProjectFindByNameResponse createProjectFindByNameResponse() {
        return new ProjectFindByNameResponse();
    }

    /**
     * Create an instance of {@link ProductPriceCreateFromDataArray }
     * 
     */
    public ProductPriceCreateFromDataArray createProductPriceCreateFromDataArray() {
        return new ProductPriceCreateFromDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfProductPriceData }
     * 
     */
    public ArrayOfProductPriceData createArrayOfProductPriceData() {
        return new ArrayOfProductPriceData();
    }

    /**
     * Create an instance of {@link CreditorGetCurrencyResponse }
     * 
     */
    public CreditorGetCurrencyResponse createCreditorGetCurrencyResponse() {
        return new CreditorGetCurrencyResponse();
    }

    /**
     * Create an instance of {@link AccountingYearCreateFromDataArray }
     * 
     */
    public AccountingYearCreateFromDataArray createAccountingYearCreateFromDataArray() {
        return new AccountingYearCreateFromDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfAccountingYearData }
     * 
     */
    public ArrayOfAccountingYearData createArrayOfAccountingYearData() {
        return new ArrayOfAccountingYearData();
    }

    /**
     * Create an instance of {@link CashBookEntryGetDistributionKey }
     * 
     */
    public CashBookEntryGetDistributionKey createCashBookEntryGetDistributionKey() {
        return new CashBookEntryGetDistributionKey();
    }

    /**
     * Create an instance of {@link EmployeeGroupGetAllResponse }
     * 
     */
    public EmployeeGroupGetAllResponse createEmployeeGroupGetAllResponse() {
        return new EmployeeGroupGetAllResponse();
    }

    /**
     * Create an instance of {@link OrderLineSetUnitNetPrice }
     * 
     */
    public OrderLineSetUnitNetPrice createOrderLineSetUnitNetPrice() {
        return new OrderLineSetUnitNetPrice();
    }

    /**
     * Create an instance of {@link OrderGetDeliveryPostalCodeResponse }
     * 
     */
    public OrderGetDeliveryPostalCodeResponse createOrderGetDeliveryPostalCodeResponse() {
        return new OrderGetDeliveryPostalCodeResponse();
    }

    /**
     * Create an instance of {@link UnitCreate }
     * 
     */
    public UnitCreate createUnitCreate() {
        return new UnitCreate();
    }

    /**
     * Create an instance of {@link CreditorEntryGetDataArray }
     * 
     */
    public CreditorEntryGetDataArray createCreditorEntryGetDataArray() {
        return new CreditorEntryGetDataArray();
    }

    /**
     * Create an instance of {@link AccountGetBalanceResponse }
     * 
     */
    public AccountGetBalanceResponse createAccountGetBalanceResponse() {
        return new AccountGetBalanceResponse();
    }

    /**
     * Create an instance of {@link UnitCreateFromDataArrayResponse }
     * 
     */
    public UnitCreateFromDataArrayResponse createUnitCreateFromDataArrayResponse() {
        return new UnitCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link SubscriberUpdateFromData }
     * 
     */
    public SubscriberUpdateFromData createSubscriberUpdateFromData() {
        return new SubscriberUpdateFromData();
    }

    /**
     * Create an instance of {@link SubscriberData }
     * 
     */
    public SubscriberData createSubscriberData() {
        return new SubscriberData();
    }

    /**
     * Create an instance of {@link DebtorUpdateFromDataResponse }
     * 
     */
    public DebtorUpdateFromDataResponse createDebtorUpdateFromDataResponse() {
        return new DebtorUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetDepartment }
     * 
     */
    public CashBookEntryGetDepartment createCashBookEntryGetDepartment() {
        return new CashBookEntryGetDepartment();
    }

    /**
     * Create an instance of {@link OrderSetDate }
     * 
     */
    public OrderSetDate createOrderSetDate() {
        return new OrderSetDate();
    }

    /**
     * Create an instance of {@link SubscriptionSetCollectionResponse }
     * 
     */
    public SubscriptionSetCollectionResponse createSubscriptionSetCollectionResponse() {
        return new SubscriptionSetCollectionResponse();
    }

    /**
     * Create an instance of {@link SubscriberSetSpecialPrice }
     * 
     */
    public SubscriberSetSpecialPrice createSubscriberSetSpecialPrice() {
        return new SubscriberSetSpecialPrice();
    }

    /**
     * Create an instance of {@link CostTypeGetDataArrayResponse }
     * 
     */
    public CostTypeGetDataArrayResponse createCostTypeGetDataArrayResponse() {
        return new CostTypeGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCostTypeData }
     * 
     */
    public ArrayOfCostTypeData createArrayOfCostTypeData() {
        return new ArrayOfCostTypeData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetYourReference }
     * 
     */
    public CurrentInvoiceSetYourReference createCurrentInvoiceSetYourReference() {
        return new CurrentInvoiceSetYourReference();
    }

    /**
     * Create an instance of {@link OrderSetDeliveryPostalCodeResponse }
     * 
     */
    public OrderSetDeliveryPostalCodeResponse createOrderSetDeliveryPostalCodeResponse() {
        return new OrderSetDeliveryPostalCodeResponse();
    }

    /**
     * Create an instance of {@link QuotationCancelSentStatusResponse }
     * 
     */
    public QuotationCancelSentStatusResponse createQuotationCancelSentStatusResponse() {
        return new QuotationCancelSentStatusResponse();
    }

    /**
     * Create an instance of {@link ProjectGetMileage }
     * 
     */
    public ProjectGetMileage createProjectGetMileage() {
        return new ProjectGetMileage();
    }

    /**
     * Create an instance of {@link CashBookDeleteAllEntries }
     * 
     */
    public CashBookDeleteAllEntries createCashBookDeleteAllEntries() {
        return new CashBookDeleteAllEntries();
    }

    /**
     * Create an instance of {@link QuotationGetIsVatIncludedResponse }
     * 
     */
    public QuotationGetIsVatIncludedResponse createQuotationGetIsVatIncludedResponse() {
        return new QuotationGetIsVatIncludedResponse();
    }

    /**
     * Create an instance of {@link QuotationLineSetDistributionKey }
     * 
     */
    public QuotationLineSetDistributionKey createQuotationLineSetDistributionKey() {
        return new QuotationLineSetDistributionKey();
    }

    /**
     * Create an instance of {@link CompanySetTelephoneNumberResponse }
     * 
     */
    public CompanySetTelephoneNumberResponse createCompanySetTelephoneNumberResponse() {
        return new CompanySetTelephoneNumberResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetAttention }
     * 
     */
    public InvoiceGetAttention createInvoiceGetAttention() {
        return new InvoiceGetAttention();
    }

    /**
     * Create an instance of {@link OrderLineFindByProduct }
     * 
     */
    public OrderLineFindByProduct createOrderLineFindByProduct() {
        return new OrderLineFindByProduct();
    }

    /**
     * Create an instance of {@link OrderGetIsArchivedResponse }
     * 
     */
    public OrderGetIsArchivedResponse createOrderGetIsArchivedResponse() {
        return new OrderGetIsArchivedResponse();
    }

    /**
     * Create an instance of {@link BankPaymentTypeFindByNumberResponse }
     * 
     */
    public BankPaymentTypeFindByNumberResponse createBankPaymentTypeFindByNumberResponse() {
        return new BankPaymentTypeFindByNumberResponse();
    }

    /**
     * Create an instance of {@link BankPaymentTypeGetAllResponse }
     * 
     */
    public BankPaymentTypeGetAllResponse createBankPaymentTypeGetAllResponse() {
        return new BankPaymentTypeGetAllResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBankPaymentTypeHandle }
     * 
     */
    public ArrayOfBankPaymentTypeHandle createArrayOfBankPaymentTypeHandle() {
        return new ArrayOfBankPaymentTypeHandle();
    }

    /**
     * Create an instance of {@link DebtorSetPriceGroupResponse }
     * 
     */
    public DebtorSetPriceGroupResponse createDebtorSetPriceGroupResponse() {
        return new DebtorSetPriceGroupResponse();
    }

    /**
     * Create an instance of {@link CurrencyGetDataArray }
     * 
     */
    public CurrencyGetDataArray createCurrencyGetDataArray() {
        return new CurrencyGetDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfCurrencyHandle }
     * 
     */
    public ArrayOfCurrencyHandle createArrayOfCurrencyHandle() {
        return new ArrayOfCurrencyHandle();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineCreateFromData }
     * 
     */
    public CurrentSupplierInvoiceLineCreateFromData createCurrentSupplierInvoiceLineCreateFromData() {
        return new CurrentSupplierInvoiceLineCreateFromData();
    }

    /**
     * Create an instance of {@link SubscriptionCreateFromData }
     * 
     */
    public SubscriptionCreateFromData createSubscriptionCreateFromData() {
        return new SubscriptionCreateFromData();
    }

    /**
     * Create an instance of {@link InvoiceGetDebtorCountyResponse }
     * 
     */
    public InvoiceGetDebtorCountyResponse createInvoiceGetDebtorCountyResponse() {
        return new InvoiceGetDebtorCountyResponse();
    }

    /**
     * Create an instance of {@link SubscriberCreateFromData }
     * 
     */
    public SubscriberCreateFromData createSubscriberCreateFromData() {
        return new SubscriberCreateFromData();
    }

    /**
     * Create an instance of {@link SubscriberCreateResponse }
     * 
     */
    public SubscriberCreateResponse createSubscriberCreateResponse() {
        return new SubscriberCreateResponse();
    }

    /**
     * Create an instance of {@link CreditorGroupSetNameResponse }
     * 
     */
    public CreditorGroupSetNameResponse createCreditorGroupSetNameResponse() {
        return new CreditorGroupSetNameResponse();
    }

    /**
     * Create an instance of {@link QuotationFindByDateInterval }
     * 
     */
    public QuotationFindByDateInterval createQuotationFindByDateInterval() {
        return new QuotationFindByDateInterval();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetInventoryLocationResponse }
     * 
     */
    public CurrentInvoiceLineSetInventoryLocationResponse createCurrentInvoiceLineSetInventoryLocationResponse() {
        return new CurrentInvoiceLineSetInventoryLocationResponse();
    }

    /**
     * Create an instance of {@link ProjectGetDebtorResponse }
     * 
     */
    public ProjectGetDebtorResponse createProjectGetDebtorResponse() {
        return new ProjectGetDebtorResponse();
    }

    /**
     * Create an instance of {@link QuotationFindByNumberInterval }
     * 
     */
    public QuotationFindByNumberInterval createQuotationFindByNumberInterval() {
        return new QuotationFindByNumberInterval();
    }

    /**
     * Create an instance of {@link CreditorEntryGetCurrency }
     * 
     */
    public CreditorEntryGetCurrency createCreditorEntryGetCurrency() {
        return new CreditorEntryGetCurrency();
    }

    /**
     * Create an instance of {@link TimeEntryGetData }
     * 
     */
    public TimeEntryGetData createTimeEntryGetData() {
        return new TimeEntryGetData();
    }

    /**
     * Create an instance of {@link ActivityGetAllResponse }
     * 
     */
    public ActivityGetAllResponse createActivityGetAllResponse() {
        return new ActivityGetAllResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureCreateFromDataArrayResponse }
     * 
     */
    public BudgetFigureCreateFromDataArrayResponse createBudgetFigureCreateFromDataArrayResponse() {
        return new BudgetFigureCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link DebtorUpdateFromData }
     * 
     */
    public DebtorUpdateFromData createDebtorUpdateFromData() {
        return new DebtorUpdateFromData();
    }

    /**
     * Create an instance of {@link DebtorData }
     * 
     */
    public DebtorData createDebtorData() {
        return new DebtorData();
    }

    /**
     * Create an instance of {@link TimeEntryGetDate }
     * 
     */
    public TimeEntryGetDate createTimeEntryGetDate() {
        return new TimeEntryGetDate();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetProduct }
     * 
     */
    public SubscriptionLineGetProduct createSubscriptionLineGetProduct() {
        return new SubscriptionLineGetProduct();
    }

    /**
     * Create an instance of {@link InvoiceGetTermOfPayment }
     * 
     */
    public InvoiceGetTermOfPayment createInvoiceGetTermOfPayment() {
        return new InvoiceGetTermOfPayment();
    }

    /**
     * Create an instance of {@link CreditorGetNumber }
     * 
     */
    public CreditorGetNumber createCreditorGetNumber() {
        return new CreditorGetNumber();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineUpdateFromDataResponse }
     * 
     */
    public CurrentSupplierInvoiceLineUpdateFromDataResponse createCurrentSupplierInvoiceLineUpdateFromDataResponse() {
        return new CurrentSupplierInvoiceLineUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link CashBookEntrySetAmountDefaultCurrencyResponse }
     * 
     */
    public CashBookEntrySetAmountDefaultCurrencyResponse createCashBookEntrySetAmountDefaultCurrencyResponse() {
        return new CashBookEntrySetAmountDefaultCurrencyResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetNumberResponse }
     * 
     */
    public InvoiceGetNumberResponse createInvoiceGetNumberResponse() {
        return new InvoiceGetNumberResponse();
    }

    /**
     * Create an instance of {@link TimeEntryGetIdResponse }
     * 
     */
    public TimeEntryGetIdResponse createTimeEntryGetIdResponse() {
        return new TimeEntryGetIdResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetRoundingAmountResponse }
     * 
     */
    public InvoiceGetRoundingAmountResponse createInvoiceGetRoundingAmountResponse() {
        return new InvoiceGetRoundingAmountResponse();
    }

    /**
     * Create an instance of {@link SumIntervalGetFromAccount }
     * 
     */
    public SumIntervalGetFromAccount createSumIntervalGetFromAccount() {
        return new SumIntervalGetFromAccount();
    }

    /**
     * Create an instance of {@link AccountGetOpeningAccount }
     * 
     */
    public AccountGetOpeningAccount createAccountGetOpeningAccount() {
        return new AccountGetOpeningAccount();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetInvoice }
     * 
     */
    public CurrentInvoiceLineGetInvoice createCurrentInvoiceLineGetInvoice() {
        return new CurrentInvoiceLineGetInvoice();
    }

    /**
     * Create an instance of {@link CompanyGetPostalCode }
     * 
     */
    public CompanyGetPostalCode createCompanyGetPostalCode() {
        return new CompanyGetPostalCode();
    }

    /**
     * Create an instance of {@link PriceGroupCreateFromDataArrayResponse }
     * 
     */
    public PriceGroupCreateFromDataArrayResponse createPriceGroupCreateFromDataArrayResponse() {
        return new PriceGroupCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link AccountingPeriodGetFromDate }
     * 
     */
    public AccountingPeriodGetFromDate createAccountingPeriodGetFromDate() {
        return new AccountingPeriodGetFromDate();
    }

    /**
     * Create an instance of {@link ProductGroupGetProductsResponse }
     * 
     */
    public ProductGroupGetProductsResponse createProductGroupGetProductsResponse() {
        return new ProductGroupGetProductsResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetUnitResponse }
     * 
     */
    public CurrentInvoiceLineGetUnitResponse createCurrentInvoiceLineGetUnitResponse() {
        return new CurrentInvoiceLineGetUnitResponse();
    }

    /**
     * Create an instance of {@link CashBookRegisterPdfVoucherResponse }
     * 
     */
    public CashBookRegisterPdfVoucherResponse createCashBookRegisterPdfVoucherResponse() {
        return new CashBookRegisterPdfVoucherResponse();
    }

    /**
     * Create an instance of {@link SumIntervalUpdateFromDataArrayResponse }
     * 
     */
    public SumIntervalUpdateFromDataArrayResponse createSumIntervalUpdateFromDataArrayResponse() {
        return new SumIntervalUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSumIntervalHandle }
     * 
     */
    public ArrayOfSumIntervalHandle createArrayOfSumIntervalHandle() {
        return new ArrayOfSumIntervalHandle();
    }

    /**
     * Create an instance of {@link DebtorGetOrdersResponse }
     * 
     */
    public DebtorGetOrdersResponse createDebtorGetOrdersResponse() {
        return new DebtorGetOrdersResponse();
    }

    /**
     * Create an instance of {@link QuotationSetDebtorCounty }
     * 
     */
    public QuotationSetDebtorCounty createQuotationSetDebtorCounty() {
        return new QuotationSetDebtorCounty();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetDeliveryDateResponse }
     * 
     */
    public CurrentInvoiceLineSetDeliveryDateResponse createCurrentInvoiceLineSetDeliveryDateResponse() {
        return new CurrentInvoiceLineSetDeliveryDateResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetDebtorAddressResponse }
     * 
     */
    public InvoiceGetDebtorAddressResponse createInvoiceGetDebtorAddressResponse() {
        return new InvoiceGetDebtorAddressResponse();
    }

    /**
     * Create an instance of {@link QuotationGetTermOfPayment }
     * 
     */
    public QuotationGetTermOfPayment createQuotationGetTermOfPayment() {
        return new QuotationGetTermOfPayment();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetDataArrayResponse }
     * 
     */
    public DeliveryLocationGetDataArrayResponse createDeliveryLocationGetDataArrayResponse() {
        return new DeliveryLocationGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDeliveryLocationData }
     * 
     */
    public ArrayOfDeliveryLocationData createArrayOfDeliveryLocationData() {
        return new ArrayOfDeliveryLocationData();
    }

    /**
     * Create an instance of {@link TimeEntryGetProjectResponse }
     * 
     */
    public TimeEntryGetProjectResponse createTimeEntryGetProjectResponse() {
        return new TimeEntryGetProjectResponse();
    }

    /**
     * Create an instance of {@link OrderGetDeliveryCountyResponse }
     * 
     */
    public OrderGetDeliveryCountyResponse createOrderGetDeliveryCountyResponse() {
        return new OrderGetDeliveryCountyResponse();
    }

    /**
     * Create an instance of {@link DebtorFindByPartialName }
     * 
     */
    public DebtorFindByPartialName createDebtorFindByPartialName() {
        return new DebtorFindByPartialName();
    }

    /**
     * Create an instance of {@link OrderGetDueDateResponse }
     * 
     */
    public OrderGetDueDateResponse createOrderGetDueDateResponse() {
        return new OrderGetDueDateResponse();
    }

    /**
     * Create an instance of {@link UnitFindByNumberList }
     * 
     */
    public UnitFindByNumberList createUnitFindByNumberList() {
        return new UnitFindByNumberList();
    }

    /**
     * Create an instance of {@link InvoiceLineGetInvoiceResponse }
     * 
     */
    public InvoiceLineGetInvoiceResponse createInvoiceLineGetInvoiceResponse() {
        return new InvoiceLineGetInvoiceResponse();
    }

    /**
     * Create an instance of {@link OrderLineCreateFromDataResponse }
     * 
     */
    public OrderLineCreateFromDataResponse createOrderLineCreateFromDataResponse() {
        return new OrderLineCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link QuotationLineGetUnitNetPrice }
     * 
     */
    public QuotationLineGetUnitNetPrice createQuotationLineGetUnitNetPrice() {
        return new QuotationLineGetUnitNetPrice();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDeliveryCity }
     * 
     */
    public CurrentInvoiceGetDeliveryCity createCurrentInvoiceGetDeliveryCity() {
        return new CurrentInvoiceGetDeliveryCity();
    }

    /**
     * Create an instance of {@link OrderLineGetDepartmentResponse }
     * 
     */
    public OrderLineGetDepartmentResponse createOrderLineGetDepartmentResponse() {
        return new OrderLineGetDepartmentResponse();
    }

    /**
     * Create an instance of {@link CompanySetCity }
     * 
     */
    public CompanySetCity createCompanySetCity() {
        return new CompanySetCity();
    }

    /**
     * Create an instance of {@link BudgetFigureGetFromDate }
     * 
     */
    public BudgetFigureGetFromDate createBudgetFigureGetFromDate() {
        return new BudgetFigureGetFromDate();
    }

    /**
     * Create an instance of {@link SubscriptionLineCreateFromData }
     * 
     */
    public SubscriptionLineCreateFromData createSubscriptionLineCreateFromData() {
        return new SubscriptionLineCreateFromData();
    }

    /**
     * Create an instance of {@link SubscriptionLineData }
     * 
     */
    public SubscriptionLineData createSubscriptionLineData() {
        return new SubscriptionLineData();
    }

    /**
     * Create an instance of {@link CurrencyGetData }
     * 
     */
    public CurrencyGetData createCurrencyGetData() {
        return new CurrencyGetData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetPublicEntryNumber }
     * 
     */
    public CurrentInvoiceSetPublicEntryNumber createCurrentInvoiceSetPublicEntryNumber() {
        return new CurrentInvoiceSetPublicEntryNumber();
    }

    /**
     * Create an instance of {@link InvoiceGetIsVatIncluded }
     * 
     */
    public InvoiceGetIsVatIncluded createInvoiceGetIsVatIncluded() {
        return new InvoiceGetIsVatIncluded();
    }

    /**
     * Create an instance of {@link MileageEntrySetStartLocation }
     * 
     */
    public MileageEntrySetStartLocation createMileageEntrySetStartLocation() {
        return new MileageEntrySetStartLocation();
    }

    /**
     * Create an instance of {@link ProductGroupFindByNumberResponse }
     * 
     */
    public ProductGroupFindByNumberResponse createProductGroupFindByNumberResponse() {
        return new ProductGroupFindByNumberResponse();
    }

    /**
     * Create an instance of {@link DepartmentGetNumber }
     * 
     */
    public DepartmentGetNumber createDepartmentGetNumber() {
        return new DepartmentGetNumber();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineCreate }
     * 
     */
    public CurrentSupplierInvoiceLineCreate createCurrentSupplierInvoiceLineCreate() {
        return new CurrentSupplierInvoiceLineCreate();
    }

    /**
     * Create an instance of {@link OrderLineSetProduct }
     * 
     */
    public OrderLineSetProduct createOrderLineSetProduct() {
        return new OrderLineSetProduct();
    }

    /**
     * Create an instance of {@link QuotationGetDeliveryCityResponse }
     * 
     */
    public QuotationGetDeliveryCityResponse createQuotationGetDeliveryCityResponse() {
        return new QuotationGetDeliveryCityResponse();
    }

    /**
     * Create an instance of {@link CreditorContactSetName }
     * 
     */
    public CreditorContactSetName createCreditorContactSetName() {
        return new CreditorContactSetName();
    }

    /**
     * Create an instance of {@link CreditorGroupSetName }
     * 
     */
    public CreditorGroupSetName createCreditorGroupSetName() {
        return new CreditorGroupSetName();
    }

    /**
     * Create an instance of {@link CreditorContactCreateFromDataArray }
     * 
     */
    public CreditorContactCreateFromDataArray createCreditorContactCreateFromDataArray() {
        return new CreditorContactCreateFromDataArray();
    }

    /**
     * Create an instance of {@link CashBookEntrySetText }
     * 
     */
    public CashBookEntrySetText createCashBookEntrySetText() {
        return new CashBookEntrySetText();
    }

    /**
     * Create an instance of {@link OrderLineCreate }
     * 
     */
    public OrderLineCreate createOrderLineCreate() {
        return new OrderLineCreate();
    }

    /**
     * Create an instance of {@link CashBookFindByNameResponse }
     * 
     */
    public CashBookFindByNameResponse createCashBookFindByNameResponse() {
        return new CashBookFindByNameResponse();
    }

    /**
     * Create an instance of {@link CompanyGetEmail }
     * 
     */
    public CompanyGetEmail createCompanyGetEmail() {
        return new CompanyGetEmail();
    }

    /**
     * Create an instance of {@link DebtorEntryGetVoucherNumber }
     * 
     */
    public DebtorEntryGetVoucherNumber createDebtorEntryGetVoucherNumber() {
        return new DebtorEntryGetVoucherNumber();
    }

    /**
     * Create an instance of {@link CashBookEntryGetVatAccount }
     * 
     */
    public CashBookEntryGetVatAccount createCashBookEntryGetVatAccount() {
        return new CashBookEntryGetVatAccount();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDeliveryCountyResponse }
     * 
     */
    public CurrentInvoiceSetDeliveryCountyResponse createCurrentInvoiceSetDeliveryCountyResponse() {
        return new CurrentInvoiceSetDeliveryCountyResponse();
    }

    /**
     * Create an instance of {@link CreditorEntryGetTextResponse }
     * 
     */
    public CreditorEntryGetTextResponse createCreditorEntryGetTextResponse() {
        return new CreditorEntryGetTextResponse();
    }

    /**
     * Create an instance of {@link DebtorSetPriceGroup }
     * 
     */
    public DebtorSetPriceGroup createDebtorSetPriceGroup() {
        return new DebtorSetPriceGroup();
    }

    /**
     * Create an instance of {@link AccountingYearCreateFromDataResponse }
     * 
     */
    public AccountingYearCreateFromDataResponse createAccountingYearCreateFromDataResponse() {
        return new AccountingYearCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link DebtorGroupGetDebtorsResponse }
     * 
     */
    public DebtorGroupGetDebtorsResponse createDebtorGroupGetDebtorsResponse() {
        return new DebtorGroupGetDebtorsResponse();
    }

    /**
     * Create an instance of {@link ProductGetOrdered }
     * 
     */
    public ProductGetOrdered createProductGetOrdered() {
        return new ProductGetOrdered();
    }

    /**
     * Create an instance of {@link QuotationGetPublicEntryNumberResponse }
     * 
     */
    public QuotationGetPublicEntryNumberResponse createQuotationGetPublicEntryNumberResponse() {
        return new QuotationGetPublicEntryNumberResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureGetDistributionKeyResponse }
     * 
     */
    public BudgetFigureGetDistributionKeyResponse createBudgetFigureGetDistributionKeyResponse() {
        return new BudgetFigureGetDistributionKeyResponse();
    }

    /**
     * Create an instance of {@link DebtorGetCINumberResponse }
     * 
     */
    public DebtorGetCINumberResponse createDebtorGetCINumberResponse() {
        return new DebtorGetCINumberResponse();
    }

    /**
     * Create an instance of {@link PriceGroupDelete }
     * 
     */
    public PriceGroupDelete createPriceGroupDelete() {
        return new PriceGroupDelete();
    }

    /**
     * Create an instance of {@link CashBookFindByNumberListResponse }
     * 
     */
    public CashBookFindByNumberListResponse createCashBookFindByNumberListResponse() {
        return new CashBookFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDeliveryCounty }
     * 
     */
    public CurrentInvoiceGetDeliveryCounty createCurrentInvoiceGetDeliveryCounty() {
        return new CurrentInvoiceGetDeliveryCounty();
    }

    /**
     * Create an instance of {@link OrderSetOurReference2 }
     * 
     */
    public OrderSetOurReference2 createOrderSetOurReference2() {
        return new OrderSetOurReference2();
    }

    /**
     * Create an instance of {@link DepartmentCreateFromDataResponse }
     * 
     */
    public DepartmentCreateFromDataResponse createDepartmentCreateFromDataResponse() {
        return new DepartmentCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link QuotationLineGetNumber }
     * 
     */
    public QuotationLineGetNumber createQuotationLineGetNumber() {
        return new QuotationLineGetNumber();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDeliveryCityResponse }
     * 
     */
    public CurrentInvoiceGetDeliveryCityResponse createCurrentInvoiceGetDeliveryCityResponse() {
        return new CurrentInvoiceGetDeliveryCityResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetDebtorEan }
     * 
     */
    public InvoiceGetDebtorEan createInvoiceGetDebtorEan() {
        return new InvoiceGetDebtorEan();
    }

    /**
     * Create an instance of {@link DebtorGetIsAccessibleResponse }
     * 
     */
    public DebtorGetIsAccessibleResponse createDebtorGetIsAccessibleResponse() {
        return new DebtorGetIsAccessibleResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureSetToDate }
     * 
     */
    public BudgetFigureSetToDate createBudgetFigureSetToDate() {
        return new BudgetFigureSetToDate();
    }

    /**
     * Create an instance of {@link CreditorSetOurReferenceResponse }
     * 
     */
    public CreditorSetOurReferenceResponse createCreditorSetOurReferenceResponse() {
        return new CreditorSetOurReferenceResponse();
    }

    /**
     * Create an instance of {@link QuotationGetTextLine1 }
     * 
     */
    public QuotationGetTextLine1 createQuotationGetTextLine1() {
        return new QuotationGetTextLine1();
    }

    /**
     * Create an instance of {@link QuotationGetTextLine2 }
     * 
     */
    public QuotationGetTextLine2 createQuotationGetTextLine2() {
        return new QuotationGetTextLine2();
    }

    /**
     * Create an instance of {@link BankPaymentTypeGetNameResponse }
     * 
     */
    public BankPaymentTypeGetNameResponse createBankPaymentTypeGetNameResponse() {
        return new BankPaymentTypeGetNameResponse();
    }

    /**
     * Create an instance of {@link MileageEntryUpdateFromDataResponse }
     * 
     */
    public MileageEntryUpdateFromDataResponse createMileageEntryUpdateFromDataResponse() {
        return new MileageEntryUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureCreateResponse }
     * 
     */
    public BudgetFigureCreateResponse createBudgetFigureCreateResponse() {
        return new BudgetFigureCreateResponse();
    }

    /**
     * Create an instance of {@link DebtorSetCurrency }
     * 
     */
    public DebtorSetCurrency createDebtorSetCurrency() {
        return new DebtorSetCurrency();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetYourReferenceResponse }
     * 
     */
    public CurrentInvoiceGetYourReferenceResponse createCurrentInvoiceGetYourReferenceResponse() {
        return new CurrentInvoiceGetYourReferenceResponse();
    }

    /**
     * Create an instance of {@link ProductGroupGetAccountForVatLiableDebtorInvoicesCurrentResponse }
     * 
     */
    public ProductGroupGetAccountForVatLiableDebtorInvoicesCurrentResponse createProductGroupGetAccountForVatLiableDebtorInvoicesCurrentResponse() {
        return new ProductGroupGetAccountForVatLiableDebtorInvoicesCurrentResponse();
    }

    /**
     * Create an instance of {@link OrderSetDeliveryCountry }
     * 
     */
    public OrderSetDeliveryCountry createOrderSetDeliveryCountry() {
        return new OrderSetDeliveryCountry();
    }

    /**
     * Create an instance of {@link SubscriptionLineSetProductResponse }
     * 
     */
    public SubscriptionLineSetProductResponse createSubscriptionLineSetProductResponse() {
        return new SubscriptionLineSetProductResponse();
    }

    /**
     * Create an instance of {@link DebtorSetCity }
     * 
     */
    public DebtorSetCity createDebtorSetCity() {
        return new DebtorSetCity();
    }

    /**
     * Create an instance of {@link ProductCreateFromDataResponse }
     * 
     */
    public ProductCreateFromDataResponse createProductCreateFromDataResponse() {
        return new ProductCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link DebtorGetTelephoneAndFaxNumberResponse }
     * 
     */
    public DebtorGetTelephoneAndFaxNumberResponse createDebtorGetTelephoneAndFaxNumberResponse() {
        return new DebtorGetTelephoneAndFaxNumberResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetExchangeRate }
     * 
     */
    public CurrentInvoiceSetExchangeRate createCurrentInvoiceSetExchangeRate() {
        return new CurrentInvoiceSetExchangeRate();
    }

    /**
     * Create an instance of {@link EntryGetDataArrayResponse }
     * 
     */
    public EntryGetDataArrayResponse createEntryGetDataArrayResponse() {
        return new EntryGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEntryData }
     * 
     */
    public ArrayOfEntryData createArrayOfEntryData() {
        return new ArrayOfEntryData();
    }

    /**
     * Create an instance of {@link MileageEntryUpdateFromDataArray }
     * 
     */
    public MileageEntryUpdateFromDataArray createMileageEntryUpdateFromDataArray() {
        return new MileageEntryUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfMileageEntryData }
     * 
     */
    public ArrayOfMileageEntryData createArrayOfMileageEntryData() {
        return new ArrayOfMileageEntryData();
    }

    /**
     * Create an instance of {@link ProjectGroupGetName }
     * 
     */
    public ProjectGroupGetName createProjectGroupGetName() {
        return new ProjectGroupGetName();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDeliveryDateResponse }
     * 
     */
    public CurrentInvoiceSetDeliveryDateResponse createCurrentInvoiceSetDeliveryDateResponse() {
        return new CurrentInvoiceSetDeliveryDateResponse();
    }

    /**
     * Create an instance of {@link DebtorGetExtendedVatZone }
     * 
     */
    public DebtorGetExtendedVatZone createDebtorGetExtendedVatZone() {
        return new DebtorGetExtendedVatZone();
    }

    /**
     * Create an instance of {@link QuotationGetLinesResponse }
     * 
     */
    public QuotationGetLinesResponse createQuotationGetLinesResponse() {
        return new QuotationGetLinesResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineGetTotalNetAmount }
     * 
     */
    public InvoiceLineGetTotalNetAmount createInvoiceLineGetTotalNetAmount() {
        return new InvoiceLineGetTotalNetAmount();
    }

    /**
     * Create an instance of {@link ProjectGroupGetNumberResponse }
     * 
     */
    public ProjectGroupGetNumberResponse createProjectGroupGetNumberResponse() {
        return new ProjectGroupGetNumberResponse();
    }

    /**
     * Create an instance of {@link MileageEntryGetEmployeeResponse }
     * 
     */
    public MileageEntryGetEmployeeResponse createMileageEntryGetEmployeeResponse() {
        return new MileageEntryGetEmployeeResponse();
    }

    /**
     * Create an instance of {@link AccountingYearDeleteResponse }
     * 
     */
    public AccountingYearDeleteResponse createAccountingYearDeleteResponse() {
        return new AccountingYearDeleteResponse();
    }

    /**
     * Create an instance of {@link SubscriptionSetDescription }
     * 
     */
    public SubscriptionSetDescription createSubscriptionSetDescription() {
        return new SubscriptionSetDescription();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetTextLine2Response }
     * 
     */
    public CurrentInvoiceSetTextLine2Response createCurrentInvoiceSetTextLine2Response() {
        return new CurrentInvoiceSetTextLine2Response();
    }

    /**
     * Create an instance of {@link DepartmentGetName }
     * 
     */
    public DepartmentGetName createDepartmentGetName() {
        return new DepartmentGetName();
    }

    /**
     * Create an instance of {@link OrderGetAll }
     * 
     */
    public OrderGetAll createOrderGetAll() {
        return new OrderGetAll();
    }

    /**
     * Create an instance of {@link DebtorCreate }
     * 
     */
    public DebtorCreate createDebtorCreate() {
        return new DebtorCreate();
    }

    /**
     * Create an instance of {@link CompanyGetMobileNumber }
     * 
     */
    public CompanyGetMobileNumber createCompanyGetMobileNumber() {
        return new CompanyGetMobileNumber();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetAttention }
     * 
     */
    public CurrentInvoiceGetAttention createCurrentInvoiceGetAttention() {
        return new CurrentInvoiceGetAttention();
    }

    /**
     * Create an instance of {@link OrderLineFindByProductList }
     * 
     */
    public OrderLineFindByProductList createOrderLineFindByProductList() {
        return new OrderLineFindByProductList();
    }

    /**
     * Create an instance of {@link ProductGroupGetNumber }
     * 
     */
    public ProductGroupGetNumber createProductGroupGetNumber() {
        return new ProductGroupGetNumber();
    }

    /**
     * Create an instance of {@link OrderLineUpdateFromDataArrayResponse }
     * 
     */
    public OrderLineUpdateFromDataArrayResponse createOrderLineUpdateFromDataArrayResponse() {
        return new OrderLineUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link OrderFindByNumberInterval }
     * 
     */
    public OrderFindByNumberInterval createOrderFindByNumberInterval() {
        return new OrderFindByNumberInterval();
    }

    /**
     * Create an instance of {@link UnitGetData }
     * 
     */
    public UnitGetData createUnitGetData() {
        return new UnitGetData();
    }

    /**
     * Create an instance of {@link InvoiceGetOrderNumberResponse }
     * 
     */
    public InvoiceGetOrderNumberResponse createInvoiceGetOrderNumberResponse() {
        return new InvoiceGetOrderNumberResponse();
    }

    /**
     * Create an instance of {@link DebtorGroupGetAccount }
     * 
     */
    public DebtorGroupGetAccount createDebtorGroupGetAccount() {
        return new DebtorGroupGetAccount();
    }

    /**
     * Create an instance of {@link InvoiceGetOurReference }
     * 
     */
    public InvoiceGetOurReference createInvoiceGetOurReference() {
        return new InvoiceGetOurReference();
    }

    /**
     * Create an instance of {@link QuotationFindByNumberIntervalResponse }
     * 
     */
    public QuotationFindByNumberIntervalResponse createQuotationFindByNumberIntervalResponse() {
        return new QuotationFindByNumberIntervalResponse();
    }

    /**
     * Create an instance of {@link ArrayOfQuotationHandle }
     * 
     */
    public ArrayOfQuotationHandle createArrayOfQuotationHandle() {
        return new ArrayOfQuotationHandle();
    }

    /**
     * Create an instance of {@link InvoiceLineGetDiscountAsPercent }
     * 
     */
    public InvoiceLineGetDiscountAsPercent createInvoiceLineGetDiscountAsPercent() {
        return new InvoiceLineGetDiscountAsPercent();
    }

    /**
     * Create an instance of {@link AccountGetSumIntervalsResponse }
     * 
     */
    public AccountGetSumIntervalsResponse createAccountGetSumIntervalsResponse() {
        return new AccountGetSumIntervalsResponse();
    }

    /**
     * Create an instance of {@link QuotationSetDebtorCountyResponse }
     * 
     */
    public QuotationSetDebtorCountyResponse createQuotationSetDebtorCountyResponse() {
        return new QuotationSetDebtorCountyResponse();
    }

    /**
     * Create an instance of {@link ProductGroupCreateFromData }
     * 
     */
    public ProductGroupCreateFromData createProductGroupCreateFromData() {
        return new ProductGroupCreateFromData();
    }

    /**
     * Create an instance of {@link ProductGroupData }
     * 
     */
    public ProductGroupData createProductGroupData() {
        return new ProductGroupData();
    }

    /**
     * Create an instance of {@link SubscriptionGetAll }
     * 
     */
    public SubscriptionGetAll createSubscriptionGetAll() {
        return new SubscriptionGetAll();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetCategory }
     * 
     */
    public ScannedDocumentGetCategory createScannedDocumentGetCategory() {
        return new ScannedDocumentGetCategory();
    }

    /**
     * Create an instance of {@link OrderGetDateResponse }
     * 
     */
    public OrderGetDateResponse createOrderGetDateResponse() {
        return new OrderGetDateResponse();
    }

    /**
     * Create an instance of {@link CostTypeGetVatAccount }
     * 
     */
    public CostTypeGetVatAccount createCostTypeGetVatAccount() {
        return new CostTypeGetVatAccount();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDebtorAddress }
     * 
     */
    public CurrentInvoiceSetDebtorAddress createCurrentInvoiceSetDebtorAddress() {
        return new CurrentInvoiceSetDebtorAddress();
    }

    /**
     * Create an instance of {@link EmployeeCreate }
     * 
     */
    public EmployeeCreate createEmployeeCreate() {
        return new EmployeeCreate();
    }

    /**
     * Create an instance of {@link AccountGetContraAccount }
     * 
     */
    public AccountGetContraAccount createAccountGetContraAccount() {
        return new AccountGetContraAccount();
    }

    /**
     * Create an instance of {@link DeliveryLocationSetAddressResponse }
     * 
     */
    public DeliveryLocationSetAddressResponse createDeliveryLocationSetAddressResponse() {
        return new DeliveryLocationSetAddressResponse();
    }

    /**
     * Create an instance of {@link AccountSetName }
     * 
     */
    public AccountSetName createAccountSetName() {
        return new AccountSetName();
    }

    /**
     * Create an instance of {@link DebtorGetNextAvailableNumber }
     * 
     */
    public DebtorGetNextAvailableNumber createDebtorGetNextAvailableNumber() {
        return new DebtorGetNextAvailableNumber();
    }

    /**
     * Create an instance of {@link ActivityGetAll }
     * 
     */
    public ActivityGetAll createActivityGetAll() {
        return new ActivityGetAll();
    }

    /**
     * Create an instance of {@link SumIntervalUpdateFromData }
     * 
     */
    public SumIntervalUpdateFromData createSumIntervalUpdateFromData() {
        return new SumIntervalUpdateFromData();
    }

    /**
     * Create an instance of {@link SumIntervalData }
     * 
     */
    public SumIntervalData createSumIntervalData() {
        return new SumIntervalData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetLayoutResponse }
     * 
     */
    public CurrentInvoiceSetLayoutResponse createCurrentInvoiceSetLayoutResponse() {
        return new CurrentInvoiceSetLayoutResponse();
    }

    /**
     * Create an instance of {@link MileageEntryGetStartLocation }
     * 
     */
    public MileageEntryGetStartLocation createMileageEntryGetStartLocation() {
        return new MileageEntryGetStartLocation();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceCreate }
     * 
     */
    public CurrentSupplierInvoiceCreate createCurrentSupplierInvoiceCreate() {
        return new CurrentSupplierInvoiceCreate();
    }

    /**
     * Create an instance of {@link OrderSetDateResponse }
     * 
     */
    public OrderSetDateResponse createOrderSetDateResponse() {
        return new OrderSetDateResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentUpdateFromData }
     * 
     */
    public TermOfPaymentUpdateFromData createTermOfPaymentUpdateFromData() {
        return new TermOfPaymentUpdateFromData();
    }

    /**
     * Create an instance of {@link ActivityGetNameResponse }
     * 
     */
    public ActivityGetNameResponse createActivityGetNameResponse() {
        return new ActivityGetNameResponse();
    }

    /**
     * Create an instance of {@link CurrencyGetAll }
     * 
     */
    public CurrencyGetAll createCurrencyGetAll() {
        return new CurrencyGetAll();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetOurReference2Response }
     * 
     */
    public CurrentInvoiceSetOurReference2Response createCurrentInvoiceSetOurReference2Response() {
        return new CurrentInvoiceSetOurReference2Response();
    }

    /**
     * Create an instance of {@link OrderLineGetUnit }
     * 
     */
    public OrderLineGetUnit createOrderLineGetUnit() {
        return new OrderLineGetUnit();
    }

    /**
     * Create an instance of {@link DebtorGetDataResponse }
     * 
     */
    public DebtorGetDataResponse createDebtorGetDataResponse() {
        return new DebtorGetDataResponse();
    }

    /**
     * Create an instance of {@link OrderGetDeliveryAddress }
     * 
     */
    public OrderGetDeliveryAddress createOrderGetDeliveryAddress() {
        return new OrderGetDeliveryAddress();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDeliveryAddress }
     * 
     */
    public CurrentInvoiceGetDeliveryAddress createCurrentInvoiceGetDeliveryAddress() {
        return new CurrentInvoiceGetDeliveryAddress();
    }

    /**
     * Create an instance of {@link InvoiceGetOurReferenceResponse }
     * 
     */
    public InvoiceGetOurReferenceResponse createInvoiceGetOurReferenceResponse() {
        return new InvoiceGetOurReferenceResponse();
    }

    /**
     * Create an instance of {@link CompanySetCINumberResponse }
     * 
     */
    public CompanySetCINumberResponse createCompanySetCINumberResponse() {
        return new CompanySetCINumberResponse();
    }

    /**
     * Create an instance of {@link ProductUpdateFromDataArrayResponse }
     * 
     */
    public ProductUpdateFromDataArrayResponse createProductUpdateFromDataArrayResponse() {
        return new ProductUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link AccountingYearGetPeriodsResponse }
     * 
     */
    public AccountingYearGetPeriodsResponse createAccountingYearGetPeriodsResponse() {
        return new AccountingYearGetPeriodsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAccountingPeriodHandle }
     * 
     */
    public ArrayOfAccountingPeriodHandle createArrayOfAccountingPeriodHandle() {
        return new ArrayOfAccountingPeriodHandle();
    }

    /**
     * Create an instance of {@link CashBookEntrySetProjectAndCostTypeResponse }
     * 
     */
    public CashBookEntrySetProjectAndCostTypeResponse createCashBookEntrySetProjectAndCostTypeResponse() {
        return new CashBookEntrySetProjectAndCostTypeResponse();
    }

    /**
     * Create an instance of {@link OrderSetDeliveryDate }
     * 
     */
    public OrderSetDeliveryDate createOrderSetDeliveryDate() {
        return new OrderSetDeliveryDate();
    }

    /**
     * Create an instance of {@link CostTypeGroupFindByNameResponse }
     * 
     */
    public CostTypeGroupFindByNameResponse createCostTypeGroupFindByNameResponse() {
        return new CostTypeGroupFindByNameResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCostTypeGroupHandle }
     * 
     */
    public ArrayOfCostTypeGroupHandle createArrayOfCostTypeGroupHandle() {
        return new ArrayOfCostTypeGroupHandle();
    }

    /**
     * Create an instance of {@link EmployeeSetCutoffDateResponse }
     * 
     */
    public EmployeeSetCutoffDateResponse createEmployeeSetCutoffDateResponse() {
        return new EmployeeSetCutoffDateResponse();
    }

    /**
     * Create an instance of {@link QuotationLineGetDistributionKey }
     * 
     */
    public QuotationLineGetDistributionKey createQuotationLineGetDistributionKey() {
        return new QuotationLineGetDistributionKey();
    }

    /**
     * Create an instance of {@link SubscriptionGetNameResponse }
     * 
     */
    public SubscriptionGetNameResponse createSubscriptionGetNameResponse() {
        return new SubscriptionGetNameResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetDebtor }
     * 
     */
    public CashBookEntryGetDebtor createCashBookEntryGetDebtor() {
        return new CashBookEntryGetDebtor();
    }

    /**
     * Create an instance of {@link QuotationGetRoundingAmountResponse }
     * 
     */
    public QuotationGetRoundingAmountResponse createQuotationGetRoundingAmountResponse() {
        return new QuotationGetRoundingAmountResponse();
    }

    /**
     * Create an instance of {@link EmployeeGroupCreate }
     * 
     */
    public EmployeeGroupCreate createEmployeeGroupCreate() {
        return new EmployeeGroupCreate();
    }

    /**
     * Create an instance of {@link ReportCodeGetCode }
     * 
     */
    public ReportCodeGetCode createReportCodeGetCode() {
        return new ReportCodeGetCode();
    }

    /**
     * Create an instance of {@link InvoiceLineGetInvoice }
     * 
     */
    public InvoiceLineGetInvoice createInvoiceLineGetInvoice() {
        return new InvoiceLineGetInvoice();
    }

    /**
     * Create an instance of {@link CreditorGetCreditorContactsResponse }
     * 
     */
    public CreditorGetCreditorContactsResponse createCreditorGetCreditorContactsResponse() {
        return new CreditorGetCreditorContactsResponse();
    }

    /**
     * Create an instance of {@link CreditorGetEntriesByVoucherNo }
     * 
     */
    public CreditorGetEntriesByVoucherNo createCreditorGetEntriesByVoucherNo() {
        return new CreditorGetEntriesByVoucherNo();
    }

    /**
     * Create an instance of {@link CreditorSetTermOfPaymentResponse }
     * 
     */
    public CreditorSetTermOfPaymentResponse createCreditorSetTermOfPaymentResponse() {
        return new CreditorSetTermOfPaymentResponse();
    }

    /**
     * Create an instance of {@link EntryGetDistributionKeyResponse }
     * 
     */
    public EntryGetDistributionKeyResponse createEntryGetDistributionKeyResponse() {
        return new EntryGetDistributionKeyResponse();
    }

    /**
     * Create an instance of {@link OrderDelete }
     * 
     */
    public OrderDelete createOrderDelete() {
        return new OrderDelete();
    }

    /**
     * Create an instance of {@link OrderGetVatAmount }
     * 
     */
    public OrderGetVatAmount createOrderGetVatAmount() {
        return new OrderGetVatAmount();
    }

    /**
     * Create an instance of {@link CompanyGetNameResponse }
     * 
     */
    public CompanyGetNameResponse createCompanyGetNameResponse() {
        return new CompanyGetNameResponse();
    }

    /**
     * Create an instance of {@link KeyFigureCodeGetDataArray }
     * 
     */
    public KeyFigureCodeGetDataArray createKeyFigureCodeGetDataArray() {
        return new KeyFigureCodeGetDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfKeyFigureCodeHandle }
     * 
     */
    public ArrayOfKeyFigureCodeHandle createArrayOfKeyFigureCodeHandle() {
        return new ArrayOfKeyFigureCodeHandle();
    }

    /**
     * Create an instance of {@link DebtorDeleteResponse }
     * 
     */
    public DebtorDeleteResponse createDebtorDeleteResponse() {
        return new DebtorDeleteResponse();
    }

    /**
     * Create an instance of {@link InventoryLocationGetNameResponse }
     * 
     */
    public InventoryLocationGetNameResponse createInventoryLocationGetNameResponse() {
        return new InventoryLocationGetNameResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceCreateResponse }
     * 
     */
    public CurrentInvoiceCreateResponse createCurrentInvoiceCreateResponse() {
        return new CurrentInvoiceCreateResponse();
    }

    /**
     * Create an instance of {@link QuotationGetGrossAmount }
     * 
     */
    public QuotationGetGrossAmount createQuotationGetGrossAmount() {
        return new QuotationGetGrossAmount();
    }

    /**
     * Create an instance of {@link QuotationGetExchangeRate }
     * 
     */
    public QuotationGetExchangeRate createQuotationGetExchangeRate() {
        return new QuotationGetExchangeRate();
    }

    /**
     * Create an instance of {@link AccountGetOpeningAccountResponse }
     * 
     */
    public AccountGetOpeningAccountResponse createAccountGetOpeningAccountResponse() {
        return new AccountGetOpeningAccountResponse();
    }

    /**
     * Create an instance of {@link QuotationLineFindByProductListResponse }
     * 
     */
    public QuotationLineFindByProductListResponse createQuotationLineFindByProductListResponse() {
        return new QuotationLineFindByProductListResponse();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetPdf }
     * 
     */
    public ScannedDocumentGetPdf createScannedDocumentGetPdf() {
        return new ScannedDocumentGetPdf();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDate }
     * 
     */
    public CurrentInvoiceSetDate createCurrentInvoiceSetDate() {
        return new CurrentInvoiceSetDate();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetNote }
     * 
     */
    public ScannedDocumentGetNote createScannedDocumentGetNote() {
        return new ScannedDocumentGetNote();
    }

    /**
     * Create an instance of {@link DebtorContactGetExternalIdResponse }
     * 
     */
    public DebtorContactGetExternalIdResponse createDebtorContactGetExternalIdResponse() {
        return new DebtorContactGetExternalIdResponse();
    }

    /**
     * Create an instance of {@link VatAccountGetNameResponse }
     * 
     */
    public VatAccountGetNameResponse createVatAccountGetNameResponse() {
        return new VatAccountGetNameResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetAll }
     * 
     */
    public TermOfPaymentGetAll createTermOfPaymentGetAll() {
        return new TermOfPaymentGetAll();
    }

    /**
     * Create an instance of {@link TermOfPaymentDeleteResponse }
     * 
     */
    public TermOfPaymentDeleteResponse createTermOfPaymentDeleteResponse() {
        return new TermOfPaymentDeleteResponse();
    }

    /**
     * Create an instance of {@link DistributionKeyGetDataResponse }
     * 
     */
    public DistributionKeyGetDataResponse createDistributionKeyGetDataResponse() {
        return new DistributionKeyGetDataResponse();
    }

    /**
     * Create an instance of {@link DistributionKeyData }
     * 
     */
    public DistributionKeyData createDistributionKeyData() {
        return new DistributionKeyData();
    }

    /**
     * Create an instance of {@link ProductGetRecommendedPriceResponse }
     * 
     */
    public ProductGetRecommendedPriceResponse createProductGetRecommendedPriceResponse() {
        return new ProductGetRecommendedPriceResponse();
    }

    /**
     * Create an instance of {@link InvoiceFindByOtherReference }
     * 
     */
    public InvoiceFindByOtherReference createInvoiceFindByOtherReference() {
        return new InvoiceFindByOtherReference();
    }

    /**
     * Create an instance of {@link AccountingYearFindByDate }
     * 
     */
    public AccountingYearFindByDate createAccountingYearFindByDate() {
        return new AccountingYearFindByDate();
    }

    /**
     * Create an instance of {@link DebtorGroupUpdateFromDataArrayResponse }
     * 
     */
    public DebtorGroupUpdateFromDataArrayResponse createDebtorGroupUpdateFromDataArrayResponse() {
        return new DebtorGroupUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link ProjectGetDescription }
     * 
     */
    public ProjectGetDescription createProjectGetDescription() {
        return new ProjectGetDescription();
    }

    /**
     * Create an instance of {@link CashBookEntrySetVoucherNumberResponse }
     * 
     */
    public CashBookEntrySetVoucherNumberResponse createCashBookEntrySetVoucherNumberResponse() {
        return new CashBookEntrySetVoucherNumberResponse();
    }

    /**
     * Create an instance of {@link EntryGetAmountDefaultCurrencyResponse }
     * 
     */
    public EntryGetAmountDefaultCurrencyResponse createEntryGetAmountDefaultCurrencyResponse() {
        return new EntryGetAmountDefaultCurrencyResponse();
    }

    /**
     * Create an instance of {@link MileageEntryGetDataArray }
     * 
     */
    public MileageEntryGetDataArray createMileageEntryGetDataArray() {
        return new MileageEntryGetDataArray();
    }

    /**
     * Create an instance of {@link ProjectGetOpenSubProjectsResponse }
     * 
     */
    public ProjectGetOpenSubProjectsResponse createProjectGetOpenSubProjectsResponse() {
        return new ProjectGetOpenSubProjectsResponse();
    }

    /**
     * Create an instance of {@link DebtorGetEmailResponse }
     * 
     */
    public DebtorGetEmailResponse createDebtorGetEmailResponse() {
        return new DebtorGetEmailResponse();
    }

    /**
     * Create an instance of {@link EmployeeGroupSetName }
     * 
     */
    public EmployeeGroupSetName createEmployeeGroupSetName() {
        return new EmployeeGroupSetName();
    }

    /**
     * Create an instance of {@link OrderGetCurrency }
     * 
     */
    public OrderGetCurrency createOrderGetCurrency() {
        return new OrderGetCurrency();
    }

    /**
     * Create an instance of {@link DebtorContactGetTelephoneNumberResponse }
     * 
     */
    public DebtorContactGetTelephoneNumberResponse createDebtorContactGetTelephoneNumberResponse() {
        return new DebtorContactGetTelephoneNumberResponse();
    }

    /**
     * Create an instance of {@link CreditorGetCreditorGroupResponse }
     * 
     */
    public CreditorGetCreditorGroupResponse createCreditorGetCreditorGroupResponse() {
        return new CreditorGetCreditorGroupResponse();
    }

    /**
     * Create an instance of {@link ProjectGroupGetAllResponse }
     * 
     */
    public ProjectGroupGetAllResponse createProjectGroupGetAllResponse() {
        return new ProjectGroupGetAllResponse();
    }

    /**
     * Create an instance of {@link EmployeeFindByNumberListResponse }
     * 
     */
    public EmployeeFindByNumberListResponse createEmployeeFindByNumberListResponse() {
        return new EmployeeFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link SubscriptionGetSubscriptionInterval }
     * 
     */
    public SubscriptionGetSubscriptionInterval createSubscriptionGetSubscriptionInterval() {
        return new SubscriptionGetSubscriptionInterval();
    }

    /**
     * Create an instance of {@link DebtorGetTermOfPaymentResponse }
     * 
     */
    public DebtorGetTermOfPaymentResponse createDebtorGetTermOfPaymentResponse() {
        return new DebtorGetTermOfPaymentResponse();
    }

    /**
     * Create an instance of {@link QuotationLineGetDescriptionResponse }
     * 
     */
    public QuotationLineGetDescriptionResponse createQuotationLineGetDescriptionResponse() {
        return new QuotationLineGetDescriptionResponse();
    }

    /**
     * Create an instance of {@link DebtorSetCityResponse }
     * 
     */
    public DebtorSetCityResponse createDebtorSetCityResponse() {
        return new DebtorSetCityResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetCountyResponse }
     * 
     */
    public DeliveryLocationGetCountyResponse createDeliveryLocationGetCountyResponse() {
        return new DeliveryLocationGetCountyResponse();
    }

    /**
     * Create an instance of {@link OrderGetAttentionResponse }
     * 
     */
    public OrderGetAttentionResponse createOrderGetAttentionResponse() {
        return new OrderGetAttentionResponse();
    }

    /**
     * Create an instance of {@link VatAccountGetTypeResponse }
     * 
     */
    public VatAccountGetTypeResponse createVatAccountGetTypeResponse() {
        return new VatAccountGetTypeResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceUpdateFromDataArrayResponse }
     * 
     */
    public CurrentInvoiceUpdateFromDataArrayResponse createCurrentInvoiceUpdateFromDataArrayResponse() {
        return new CurrentInvoiceUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetDaysResponse }
     * 
     */
    public TermOfPaymentGetDaysResponse createTermOfPaymentGetDaysResponse() {
        return new TermOfPaymentGetDaysResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetNameResponse }
     * 
     */
    public TermOfPaymentGetNameResponse createTermOfPaymentGetNameResponse() {
        return new TermOfPaymentGetNameResponse();
    }

    /**
     * Create an instance of {@link QuotationSetHeading }
     * 
     */
    public QuotationSetHeading createQuotationSetHeading() {
        return new QuotationSetHeading();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineUpdateFromData }
     * 
     */
    public CurrentSupplierInvoiceLineUpdateFromData createCurrentSupplierInvoiceLineUpdateFromData() {
        return new CurrentSupplierInvoiceLineUpdateFromData();
    }

    /**
     * Create an instance of {@link AccountingYearCreateFromDataArrayResponse }
     * 
     */
    public AccountingYearCreateFromDataArrayResponse createAccountingYearCreateFromDataArrayResponse() {
        return new AccountingYearCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAccountingYearHandle }
     * 
     */
    public ArrayOfAccountingYearHandle createArrayOfAccountingYearHandle() {
        return new ArrayOfAccountingYearHandle();
    }

    /**
     * Create an instance of {@link DebtorEntryGetType }
     * 
     */
    public DebtorEntryGetType createDebtorEntryGetType() {
        return new DebtorEntryGetType();
    }

    /**
     * Create an instance of {@link DebtorGroupSetNameResponse }
     * 
     */
    public DebtorGroupSetNameResponse createDebtorGroupSetNameResponse() {
        return new DebtorGroupSetNameResponse();
    }

    /**
     * Create an instance of {@link CreditorSetAttention }
     * 
     */
    public CreditorSetAttention createCreditorSetAttention() {
        return new CreditorSetAttention();
    }

    /**
     * Create an instance of {@link DebtorGetCurrentInvoicesResponse }
     * 
     */
    public DebtorGetCurrentInvoicesResponse createDebtorGetCurrentInvoicesResponse() {
        return new DebtorGetCurrentInvoicesResponse();
    }

    /**
     * Create an instance of {@link ProjectFindByNumberListResponse }
     * 
     */
    public ProjectFindByNumberListResponse createProjectFindByNumberListResponse() {
        return new ProjectFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link QuotationLineGetNumberResponse }
     * 
     */
    public QuotationLineGetNumberResponse createQuotationLineGetNumberResponse() {
        return new QuotationLineGetNumberResponse();
    }

    /**
     * Create an instance of {@link OrderCreate }
     * 
     */
    public OrderCreate createOrderCreate() {
        return new OrderCreate();
    }

    /**
     * Create an instance of {@link QuotationLineGetDiscountAsPercentResponse }
     * 
     */
    public QuotationLineGetDiscountAsPercentResponse createQuotationLineGetDiscountAsPercentResponse() {
        return new QuotationLineGetDiscountAsPercentResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceTotalAmountResponse }
     * 
     */
    public CurrentSupplierInvoiceTotalAmountResponse createCurrentSupplierInvoiceTotalAmountResponse() {
        return new CurrentSupplierInvoiceTotalAmountResponse();
    }

    /**
     * Create an instance of {@link EmployeeFindByNumber }
     * 
     */
    public EmployeeFindByNumber createEmployeeFindByNumber() {
        return new EmployeeFindByNumber();
    }

    /**
     * Create an instance of {@link EntryGetDataArray }
     * 
     */
    public EntryGetDataArray createEntryGetDataArray() {
        return new EntryGetDataArray();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDebtorEan }
     * 
     */
    public CurrentInvoiceGetDebtorEan createCurrentInvoiceGetDebtorEan() {
        return new CurrentInvoiceGetDebtorEan();
    }

    /**
     * Create an instance of {@link MileageEntryGetApproved }
     * 
     */
    public MileageEntryGetApproved createMileageEntryGetApproved() {
        return new MileageEntryGetApproved();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetTotalMargin }
     * 
     */
    public CurrentInvoiceLineGetTotalMargin createCurrentInvoiceLineGetTotalMargin() {
        return new CurrentInvoiceLineGetTotalMargin();
    }

    /**
     * Create an instance of {@link OrderGetNumberResponse }
     * 
     */
    public OrderGetNumberResponse createOrderGetNumberResponse() {
        return new OrderGetNumberResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetOtherReferenceResponse }
     * 
     */
    public CurrentInvoiceSetOtherReferenceResponse createCurrentInvoiceSetOtherReferenceResponse() {
        return new CurrentInvoiceSetOtherReferenceResponse();
    }

    /**
     * Create an instance of {@link MileageEntryGetData }
     * 
     */
    public MileageEntryGetData createMileageEntryGetData() {
        return new MileageEntryGetData();
    }

    /**
     * Create an instance of {@link CashBookEntryGetBankPaymentTypeResponse }
     * 
     */
    public CashBookEntryGetBankPaymentTypeResponse createCashBookEntryGetBankPaymentTypeResponse() {
        return new CashBookEntryGetBankPaymentTypeResponse();
    }

    /**
     * Create an instance of {@link VatAccountGetDataResponse }
     * 
     */
    public VatAccountGetDataResponse createVatAccountGetDataResponse() {
        return new VatAccountGetDataResponse();
    }

    /**
     * Create an instance of {@link VatAccountData }
     * 
     */
    public VatAccountData createVatAccountData() {
        return new VatAccountData();
    }

    /**
     * Create an instance of {@link CreditorGroupFindByName }
     * 
     */
    public CreditorGroupFindByName createCreditorGroupFindByName() {
        return new CreditorGroupFindByName();
    }

    /**
     * Create an instance of {@link MileageEntryGetDate }
     * 
     */
    public MileageEntryGetDate createMileageEntryGetDate() {
        return new MileageEntryGetDate();
    }

    /**
     * Create an instance of {@link QuotationGetDebtorPostalCodeResponse }
     * 
     */
    public QuotationGetDebtorPostalCodeResponse createQuotationGetDebtorPostalCodeResponse() {
        return new QuotationGetDebtorPostalCodeResponse();
    }

    /**
     * Create an instance of {@link DebtorGroupUpdateFromDataArray }
     * 
     */
    public DebtorGroupUpdateFromDataArray createDebtorGroupUpdateFromDataArray() {
        return new DebtorGroupUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link CashBookEntryCreateManualDebtorInvoice }
     * 
     */
    public CashBookEntryCreateManualDebtorInvoice createCashBookEntryCreateManualDebtorInvoice() {
        return new CashBookEntryCreateManualDebtorInvoice();
    }

    /**
     * Create an instance of {@link CompanySetNameResponse }
     * 
     */
    public CompanySetNameResponse createCompanySetNameResponse() {
        return new CompanySetNameResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineGetUnitCostPrice }
     * 
     */
    public InvoiceLineGetUnitCostPrice createInvoiceLineGetUnitCostPrice() {
        return new InvoiceLineGetUnitCostPrice();
    }

    /**
     * Create an instance of {@link DebtorGetNextAvailableNumberResponse }
     * 
     */
    public DebtorGetNextAvailableNumberResponse createDebtorGetNextAvailableNumberResponse() {
        return new DebtorGetNextAvailableNumberResponse();
    }

    /**
     * Create an instance of {@link SubscriberGetExpiryDate }
     * 
     */
    public SubscriberGetExpiryDate createSubscriberGetExpiryDate() {
        return new SubscriberGetExpiryDate();
    }

    /**
     * Create an instance of {@link CashBookEntryGetCashBook }
     * 
     */
    public CashBookEntryGetCashBook createCashBookEntryGetCashBook() {
        return new CashBookEntryGetCashBook();
    }

    /**
     * Create an instance of {@link CashBookEntrySetCurrencyResponse }
     * 
     */
    public CashBookEntrySetCurrencyResponse createCashBookEntrySetCurrencyResponse() {
        return new CashBookEntrySetCurrencyResponse();
    }

    /**
     * Create an instance of {@link ProductGroupGetData }
     * 
     */
    public ProductGroupGetData createProductGroupGetData() {
        return new ProductGroupGetData();
    }

    /**
     * Create an instance of {@link TermOfPaymentUpdateFromDataArray }
     * 
     */
    public TermOfPaymentUpdateFromDataArray createTermOfPaymentUpdateFromDataArray() {
        return new TermOfPaymentUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link CashBookEntryGetAccount }
     * 
     */
    public CashBookEntryGetAccount createCashBookEntryGetAccount() {
        return new CashBookEntryGetAccount();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDebtorCountyResponse }
     * 
     */
    public CurrentInvoiceSetDebtorCountyResponse createCurrentInvoiceSetDebtorCountyResponse() {
        return new CurrentInvoiceSetDebtorCountyResponse();
    }

    /**
     * Create an instance of {@link CashBookBookWithDateClosedPeriodResponse }
     * 
     */
    public CashBookBookWithDateClosedPeriodResponse createCashBookBookWithDateClosedPeriodResponse() {
        return new CashBookBookWithDateClosedPeriodResponse();
    }

    /**
     * Create an instance of {@link UnitFindByName }
     * 
     */
    public UnitFindByName createUnitFindByName() {
        return new UnitFindByName();
    }

    /**
     * Create an instance of {@link CreditorSetCreditorGroupResponse }
     * 
     */
    public CreditorSetCreditorGroupResponse createCreditorSetCreditorGroupResponse() {
        return new CreditorSetCreditorGroupResponse();
    }

    /**
     * Create an instance of {@link ProjectGetAllUpdatedResponse }
     * 
     */
    public ProjectGetAllUpdatedResponse createProjectGetAllUpdatedResponse() {
        return new ProjectGetAllUpdatedResponse();
    }

    /**
     * Create an instance of {@link DebtorEntryGetCurrency }
     * 
     */
    public DebtorEntryGetCurrency createDebtorEntryGetCurrency() {
        return new DebtorEntryGetCurrency();
    }

    /**
     * Create an instance of {@link ExtendedVatZoneGetNumber }
     * 
     */
    public ExtendedVatZoneGetNumber createExtendedVatZoneGetNumber() {
        return new ExtendedVatZoneGetNumber();
    }

    /**
     * Create an instance of {@link ProjectGroupFindByNumberList }
     * 
     */
    public ProjectGroupFindByNumberList createProjectGroupFindByNumberList() {
        return new ProjectGroupFindByNumberList();
    }

    /**
     * Create an instance of {@link OrderGetDeliveryPostalCode }
     * 
     */
    public OrderGetDeliveryPostalCode createOrderGetDeliveryPostalCode() {
        return new OrderGetDeliveryPostalCode();
    }

    /**
     * Create an instance of {@link CostTypeFindByNameResponse }
     * 
     */
    public CostTypeFindByNameResponse createCostTypeFindByNameResponse() {
        return new CostTypeFindByNameResponse();
    }

    /**
     * Create an instance of {@link DebtorSetDebtorGroupResponse }
     * 
     */
    public DebtorSetDebtorGroupResponse createDebtorSetDebtorGroupResponse() {
        return new DebtorSetDebtorGroupResponse();
    }

    /**
     * Create an instance of {@link AccountSetIsAccessibleResponse }
     * 
     */
    public AccountSetIsAccessibleResponse createAccountSetIsAccessibleResponse() {
        return new AccountSetIsAccessibleResponse();
    }

    /**
     * Create an instance of {@link OrderGetOurReference }
     * 
     */
    public OrderGetOurReference createOrderGetOurReference() {
        return new OrderGetOurReference();
    }

    /**
     * Create an instance of {@link DebtorContactGetDataResponse }
     * 
     */
    public DebtorContactGetDataResponse createDebtorContactGetDataResponse() {
        return new DebtorContactGetDataResponse();
    }

    /**
     * Create an instance of {@link ProductGetBarCode }
     * 
     */
    public ProductGetBarCode createProductGetBarCode() {
        return new ProductGetBarCode();
    }

    /**
     * Create an instance of {@link BudgetFigureGetDataResponse }
     * 
     */
    public BudgetFigureGetDataResponse createBudgetFigureGetDataResponse() {
        return new BudgetFigureGetDataResponse();
    }

    /**
     * Create an instance of {@link OrderGetDeliveryCountryResponse }
     * 
     */
    public OrderGetDeliveryCountryResponse createOrderGetDeliveryCountryResponse() {
        return new OrderGetDeliveryCountryResponse();
    }

    /**
     * Create an instance of {@link QuotationLineCreateFromData }
     * 
     */
    public QuotationLineCreateFromData createQuotationLineCreateFromData() {
        return new QuotationLineCreateFromData();
    }

    /**
     * Create an instance of {@link QuotationLineData }
     * 
     */
    public QuotationLineData createQuotationLineData() {
        return new QuotationLineData();
    }

    /**
     * Create an instance of {@link QuotationLineCreateFromDataArray }
     * 
     */
    public QuotationLineCreateFromDataArray createQuotationLineCreateFromDataArray() {
        return new QuotationLineCreateFromDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfQuotationLineData }
     * 
     */
    public ArrayOfQuotationLineData createArrayOfQuotationLineData() {
        return new ArrayOfQuotationLineData();
    }

    /**
     * Create an instance of {@link CreditorEntryGetAmountDefaultCurrency }
     * 
     */
    public CreditorEntryGetAmountDefaultCurrency createCreditorEntryGetAmountDefaultCurrency() {
        return new CreditorEntryGetAmountDefaultCurrency();
    }

    /**
     * Create an instance of {@link EntryGetProjectResponse }
     * 
     */
    public EntryGetProjectResponse createEntryGetProjectResponse() {
        return new EntryGetProjectResponse();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryDeleteResponse }
     * 
     */
    public DocumentArchiveCategoryDeleteResponse createDocumentArchiveCategoryDeleteResponse() {
        return new DocumentArchiveCategoryDeleteResponse();
    }

    /**
     * Create an instance of {@link ProductGetSalesPriceResponse }
     * 
     */
    public ProductGetSalesPriceResponse createProductGetSalesPriceResponse() {
        return new ProductGetSalesPriceResponse();
    }

    /**
     * Create an instance of {@link OrderSetDebtorCountyResponse }
     * 
     */
    public OrderSetDebtorCountyResponse createOrderSetDebtorCountyResponse() {
        return new OrderSetDebtorCountyResponse();
    }

    /**
     * Create an instance of {@link QuotationSetDebtorName }
     * 
     */
    public QuotationSetDebtorName createQuotationSetDebtorName() {
        return new QuotationSetDebtorName();
    }

    /**
     * Create an instance of {@link CreditorEntryGetRemainderResponse }
     * 
     */
    public CreditorEntryGetRemainderResponse createCreditorEntryGetRemainderResponse() {
        return new CreditorEntryGetRemainderResponse();
    }

    /**
     * Create an instance of {@link AccountingYearDelete }
     * 
     */
    public AccountingYearDelete createAccountingYearDelete() {
        return new AccountingYearDelete();
    }

    /**
     * Create an instance of {@link SubscriptionGetCollectionResponse }
     * 
     */
    public SubscriptionGetCollectionResponse createSubscriptionGetCollectionResponse() {
        return new SubscriptionGetCollectionResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineGetInvoiceResponse }
     * 
     */
    public CurrentSupplierInvoiceLineGetInvoiceResponse createCurrentSupplierInvoiceLineGetInvoiceResponse() {
        return new CurrentSupplierInvoiceLineGetInvoiceResponse();
    }

    /**
     * Create an instance of {@link DebtorSetCounty }
     * 
     */
    public DebtorSetCounty createDebtorSetCounty() {
        return new DebtorSetCounty();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetAttentionResponse }
     * 
     */
    public CurrentInvoiceSetAttentionResponse createCurrentInvoiceSetAttentionResponse() {
        return new CurrentInvoiceSetAttentionResponse();
    }

    /**
     * Create an instance of {@link ProductGroupFindByNumberListResponse }
     * 
     */
    public ProductGroupFindByNumberListResponse createProductGroupFindByNumberListResponse() {
        return new ProductGroupFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProductGroupHandle }
     * 
     */
    public ArrayOfProductGroupHandle createArrayOfProductGroupHandle() {
        return new ArrayOfProductGroupHandle();
    }

    /**
     * Create an instance of {@link BankPaymentTypeGetNumber }
     * 
     */
    public BankPaymentTypeGetNumber createBankPaymentTypeGetNumber() {
        return new BankPaymentTypeGetNumber();
    }

    /**
     * Create an instance of {@link OrderGetTermOfPaymentResponse }
     * 
     */
    public OrderGetTermOfPaymentResponse createOrderGetTermOfPaymentResponse() {
        return new OrderGetTermOfPaymentResponse();
    }

    /**
     * Create an instance of {@link QuotationSetIsVatIncluded }
     * 
     */
    public QuotationSetIsVatIncluded createQuotationSetIsVatIncluded() {
        return new QuotationSetIsVatIncluded();
    }

    /**
     * Create an instance of {@link SubscriberSetDiscountAsPercent }
     * 
     */
    public SubscriberSetDiscountAsPercent createSubscriberSetDiscountAsPercent() {
        return new SubscriberSetDiscountAsPercent();
    }

    /**
     * Create an instance of {@link OrderLineSetUnitNetPriceResponse }
     * 
     */
    public OrderLineSetUnitNetPriceResponse createOrderLineSetUnitNetPriceResponse() {
        return new OrderLineSetUnitNetPriceResponse();
    }

    /**
     * Create an instance of {@link QuotationLineUpdateFromDataArray }
     * 
     */
    public QuotationLineUpdateFromDataArray createQuotationLineUpdateFromDataArray() {
        return new QuotationLineUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link CostTypeFindByNumberList }
     * 
     */
    public CostTypeFindByNumberList createCostTypeFindByNumberList() {
        return new CostTypeFindByNumberList();
    }

    /**
     * Create an instance of {@link CreditorGroupUpdateFromData }
     * 
     */
    public CreditorGroupUpdateFromData createCreditorGroupUpdateFromData() {
        return new CreditorGroupUpdateFromData();
    }

    /**
     * Create an instance of {@link CreditorGroupData }
     * 
     */
    public CreditorGroupData createCreditorGroupData() {
        return new CreditorGroupData();
    }

    /**
     * Create an instance of {@link CreditorSetCINumberResponse }
     * 
     */
    public CreditorSetCINumberResponse createCreditorSetCINumberResponse() {
        return new CreditorSetCINumberResponse();
    }

    /**
     * Create an instance of {@link TemplateCollectionGetAllResponse }
     * 
     */
    public TemplateCollectionGetAllResponse createTemplateCollectionGetAllResponse() {
        return new TemplateCollectionGetAllResponse();
    }

    /**
     * Create an instance of {@link DistributionKeyFindByNameResponse }
     * 
     */
    public DistributionKeyFindByNameResponse createDistributionKeyFindByNameResponse() {
        return new DistributionKeyFindByNameResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDistributionKeyHandle }
     * 
     */
    public ArrayOfDistributionKeyHandle createArrayOfDistributionKeyHandle() {
        return new ArrayOfDistributionKeyHandle();
    }

    /**
     * Create an instance of {@link DebtorGroupUpdateFromData }
     * 
     */
    public DebtorGroupUpdateFromData createDebtorGroupUpdateFromData() {
        return new DebtorGroupUpdateFromData();
    }

    /**
     * Create an instance of {@link DebtorGroupData }
     * 
     */
    public DebtorGroupData createDebtorGroupData() {
        return new DebtorGroupData();
    }

    /**
     * Create an instance of {@link CashBookEntryGetDepartmentResponse }
     * 
     */
    public CashBookEntryGetDepartmentResponse createCashBookEntryGetDepartmentResponse() {
        return new CashBookEntryGetDepartmentResponse();
    }

    /**
     * Create an instance of {@link DebtorEntryFindByInvoiceNumber }
     * 
     */
    public DebtorEntryFindByInvoiceNumber createDebtorEntryFindByInvoiceNumber() {
        return new DebtorEntryFindByInvoiceNumber();
    }

    /**
     * Create an instance of {@link CreditorSetCurrencyResponse }
     * 
     */
    public CreditorSetCurrencyResponse createCreditorSetCurrencyResponse() {
        return new CreditorSetCurrencyResponse();
    }

    /**
     * Create an instance of {@link QuotationFindByOtherReference }
     * 
     */
    public QuotationFindByOtherReference createQuotationFindByOtherReference() {
        return new QuotationFindByOtherReference();
    }

    /**
     * Create an instance of {@link DebtorGroupFindByName }
     * 
     */
    public DebtorGroupFindByName createDebtorGroupFindByName() {
        return new DebtorGroupFindByName();
    }

    /**
     * Create an instance of {@link CashBookEntrySetVatAccount }
     * 
     */
    public CashBookEntrySetVatAccount createCashBookEntrySetVatAccount() {
        return new CashBookEntrySetVatAccount();
    }

    /**
     * Create an instance of {@link EmployeeGroupGetEmployees }
     * 
     */
    public EmployeeGroupGetEmployees createEmployeeGroupGetEmployees() {
        return new EmployeeGroupGetEmployees();
    }

    /**
     * Create an instance of {@link DebtorGetOrders }
     * 
     */
    public DebtorGetOrders createDebtorGetOrders() {
        return new DebtorGetOrders();
    }

    /**
     * Create an instance of {@link MileageEntryGetProjectResponse }
     * 
     */
    public MileageEntryGetProjectResponse createMileageEntryGetProjectResponse() {
        return new MileageEntryGetProjectResponse();
    }

    /**
     * Create an instance of {@link CompanyGetWebSite }
     * 
     */
    public CompanyGetWebSite createCompanyGetWebSite() {
        return new CompanyGetWebSite();
    }

    /**
     * Create an instance of {@link EmployeeSetCostPriceBefore }
     * 
     */
    public EmployeeSetCostPriceBefore createEmployeeSetCostPriceBefore() {
        return new EmployeeSetCostPriceBefore();
    }

    /**
     * Create an instance of {@link DebtorSetCreditMaximum }
     * 
     */
    public DebtorSetCreditMaximum createDebtorSetCreditMaximum() {
        return new DebtorSetCreditMaximum();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineGetQuantityResponse }
     * 
     */
    public CurrentSupplierInvoiceLineGetQuantityResponse createCurrentSupplierInvoiceLineGetQuantityResponse() {
        return new CurrentSupplierInvoiceLineGetQuantityResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetPublicEntryNumber }
     * 
     */
    public CurrentInvoiceGetPublicEntryNumber createCurrentInvoiceGetPublicEntryNumber() {
        return new CurrentInvoiceGetPublicEntryNumber();
    }

    /**
     * Create an instance of {@link DebtorContactSetIsToReceiveEmailCopyOfOrderResponse }
     * 
     */
    public DebtorContactSetIsToReceiveEmailCopyOfOrderResponse createDebtorContactSetIsToReceiveEmailCopyOfOrderResponse() {
        return new DebtorContactSetIsToReceiveEmailCopyOfOrderResponse();
    }

    /**
     * Create an instance of {@link SubscriptionSetAllowMoreThanOneForEachDebtorResponse }
     * 
     */
    public SubscriptionSetAllowMoreThanOneForEachDebtorResponse createSubscriptionSetAllowMoreThanOneForEachDebtorResponse() {
        return new SubscriptionSetAllowMoreThanOneForEachDebtorResponse();
    }

    /**
     * Create an instance of {@link CreditorSetAddressResponse }
     * 
     */
    public CreditorSetAddressResponse createCreditorSetAddressResponse() {
        return new CreditorSetAddressResponse();
    }

    /**
     * Create an instance of {@link CashBookFindByNumber }
     * 
     */
    public CashBookFindByNumber createCashBookFindByNumber() {
        return new CashBookFindByNumber();
    }

    /**
     * Create an instance of {@link DebtorGetDebtorContacts }
     * 
     */
    public DebtorGetDebtorContacts createDebtorGetDebtorContacts() {
        return new DebtorGetDebtorContacts();
    }

    /**
     * Create an instance of {@link OrderLineGetTotalNetAmount }
     * 
     */
    public OrderLineGetTotalNetAmount createOrderLineGetTotalNetAmount() {
        return new OrderLineGetTotalNetAmount();
    }

    /**
     * Create an instance of {@link OrderLineGetDeliveryDateResponse }
     * 
     */
    public OrderLineGetDeliveryDateResponse createOrderLineGetDeliveryDateResponse() {
        return new OrderLineGetDeliveryDateResponse();
    }

    /**
     * Create an instance of {@link TemplateCollectionGetDataArray }
     * 
     */
    public TemplateCollectionGetDataArray createTemplateCollectionGetDataArray() {
        return new TemplateCollectionGetDataArray();
    }

    /**
     * Create an instance of {@link CreditorSetAutoContraAccountResponse }
     * 
     */
    public CreditorSetAutoContraAccountResponse createCreditorSetAutoContraAccountResponse() {
        return new CreditorSetAutoContraAccountResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetBankPaymentCreditorInvoiceIdResponse }
     * 
     */
    public CashBookEntryGetBankPaymentCreditorInvoiceIdResponse createCashBookEntryGetBankPaymentCreditorInvoiceIdResponse() {
        return new CashBookEntryGetBankPaymentCreditorInvoiceIdResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetRoundingAmount }
     * 
     */
    public CurrentInvoiceGetRoundingAmount createCurrentInvoiceGetRoundingAmount() {
        return new CurrentInvoiceGetRoundingAmount();
    }

    /**
     * Create an instance of {@link CreditorEntryFindByInvoiceNumber }
     * 
     */
    public CreditorEntryFindByInvoiceNumber createCreditorEntryFindByInvoiceNumber() {
        return new CreditorEntryFindByInvoiceNumber();
    }

    /**
     * Create an instance of {@link ReportCodeSetGetDataArray }
     * 
     */
    public ReportCodeSetGetDataArray createReportCodeSetGetDataArray() {
        return new ReportCodeSetGetDataArray();
    }

    /**
     * Create an instance of {@link EmployeeGroupUpdateFromDataArrayResponse }
     * 
     */
    public EmployeeGroupUpdateFromDataArrayResponse createEmployeeGroupUpdateFromDataArrayResponse() {
        return new EmployeeGroupUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link KeyFigureCodeFindByName }
     * 
     */
    public KeyFigureCodeFindByName createKeyFigureCodeFindByName() {
        return new KeyFigureCodeFindByName();
    }

    /**
     * Create an instance of {@link InvoiceGetTermsOfDeliveryResponse }
     * 
     */
    public InvoiceGetTermsOfDeliveryResponse createInvoiceGetTermsOfDeliveryResponse() {
        return new InvoiceGetTermsOfDeliveryResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetInventoryLocation }
     * 
     */
    public CurrentInvoiceLineSetInventoryLocation createCurrentInvoiceLineSetInventoryLocation() {
        return new CurrentInvoiceLineSetInventoryLocation();
    }

    /**
     * Create an instance of {@link InvoiceGetAttentionResponse }
     * 
     */
    public InvoiceGetAttentionResponse createInvoiceGetAttentionResponse() {
        return new InvoiceGetAttentionResponse();
    }

    /**
     * Create an instance of {@link EmployeeGetNameResponse }
     * 
     */
    public EmployeeGetNameResponse createEmployeeGetNameResponse() {
        return new EmployeeGetNameResponse();
    }

    /**
     * Create an instance of {@link SubscriberGetEndDateResponse }
     * 
     */
    public SubscriberGetEndDateResponse createSubscriberGetEndDateResponse() {
        return new SubscriberGetEndDateResponse();
    }

    /**
     * Create an instance of {@link EmployeeGetNumberResponse }
     * 
     */
    public EmployeeGetNumberResponse createEmployeeGetNumberResponse() {
        return new EmployeeGetNumberResponse();
    }

    /**
     * Create an instance of {@link ProductPriceCreate }
     * 
     */
    public ProductPriceCreate createProductPriceCreate() {
        return new ProductPriceCreate();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceCreateResponse }
     * 
     */
    public CurrentSupplierInvoiceCreateResponse createCurrentSupplierInvoiceCreateResponse() {
        return new CurrentSupplierInvoiceCreateResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetTermOfPaymentResponse }
     * 
     */
    public CurrentInvoiceSetTermOfPaymentResponse createCurrentInvoiceSetTermOfPaymentResponse() {
        return new CurrentInvoiceSetTermOfPaymentResponse();
    }

    /**
     * Create an instance of {@link DebtorGetPostalCode }
     * 
     */
    public DebtorGetPostalCode createDebtorGetPostalCode() {
        return new DebtorGetPostalCode();
    }

    /**
     * Create an instance of {@link InvoiceGetRemainderDefaultCurrency }
     * 
     */
    public InvoiceGetRemainderDefaultCurrency createInvoiceGetRemainderDefaultCurrency() {
        return new InvoiceGetRemainderDefaultCurrency();
    }

    /**
     * Create an instance of {@link CreditorEntryFindBySerialNumberTypeAndInvoiceNumberResponse }
     * 
     */
    public CreditorEntryFindBySerialNumberTypeAndInvoiceNumberResponse createCreditorEntryFindBySerialNumberTypeAndInvoiceNumberResponse() {
        return new CreditorEntryFindBySerialNumberTypeAndInvoiceNumberResponse();
    }

    /**
     * Create an instance of {@link CashBookEntrySetAccrualInformationResponse }
     * 
     */
    public CashBookEntrySetAccrualInformationResponse createCashBookEntrySetAccrualInformationResponse() {
        return new CashBookEntrySetAccrualInformationResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetDeductionAmountResponse }
     * 
     */
    public InvoiceGetDeductionAmountResponse createInvoiceGetDeductionAmountResponse() {
        return new InvoiceGetDeductionAmountResponse();
    }

    /**
     * Create an instance of {@link CostTypeGetData }
     * 
     */
    public CostTypeGetData createCostTypeGetData() {
        return new CostTypeGetData();
    }

    /**
     * Create an instance of {@link ProductPriceUpdateFromDataArrayResponse }
     * 
     */
    public ProductPriceUpdateFromDataArrayResponse createProductPriceUpdateFromDataArrayResponse() {
        return new ProductPriceUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProductPriceHandle }
     * 
     */
    public ArrayOfProductPriceHandle createArrayOfProductPriceHandle() {
        return new ArrayOfProductPriceHandle();
    }

    /**
     * Create an instance of {@link ProductGetCostPriceResponse }
     * 
     */
    public ProductGetCostPriceResponse createProductGetCostPriceResponse() {
        return new ProductGetCostPriceResponse();
    }

    /**
     * Create an instance of {@link DebtorGroupFindByNumber }
     * 
     */
    public DebtorGroupFindByNumber createDebtorGroupFindByNumber() {
        return new DebtorGroupFindByNumber();
    }

    /**
     * Create an instance of {@link MileageEntryGetCostPrice }
     * 
     */
    public MileageEntryGetCostPrice createMileageEntryGetCostPrice() {
        return new MileageEntryGetCostPrice();
    }

    /**
     * Create an instance of {@link DepartmentFindByNumberList }
     * 
     */
    public DepartmentFindByNumberList createDepartmentFindByNumberList() {
        return new DepartmentFindByNumberList();
    }

    /**
     * Create an instance of {@link CashBookEntrySetAmountResponse }
     * 
     */
    public CashBookEntrySetAmountResponse createCashBookEntrySetAmountResponse() {
        return new CashBookEntrySetAmountResponse();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryGetNumber }
     * 
     */
    public DocumentArchiveCategoryGetNumber createDocumentArchiveCategoryGetNumber() {
        return new DocumentArchiveCategoryGetNumber();
    }

    /**
     * Create an instance of {@link SubscriptionCreateFromDataResponse }
     * 
     */
    public SubscriptionCreateFromDataResponse createSubscriptionCreateFromDataResponse() {
        return new SubscriptionCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link MileageEntryGetId }
     * 
     */
    public MileageEntryGetId createMileageEntryGetId() {
        return new MileageEntryGetId();
    }

    /**
     * Create an instance of {@link SubscriberGetExtraTextForInvoiceResponse }
     * 
     */
    public SubscriberGetExtraTextForInvoiceResponse createSubscriberGetExtraTextForInvoiceResponse() {
        return new SubscriberGetExtraTextForInvoiceResponse();
    }

    /**
     * Create an instance of {@link MileageEntryDelete }
     * 
     */
    public MileageEntryDelete createMileageEntryDelete() {
        return new MileageEntryDelete();
    }

    /**
     * Create an instance of {@link QuotationGetOtherReferenceResponse }
     * 
     */
    public QuotationGetOtherReferenceResponse createQuotationGetOtherReferenceResponse() {
        return new QuotationGetOtherReferenceResponse();
    }

    /**
     * Create an instance of {@link SubscriptionLineUpdateFromData }
     * 
     */
    public SubscriptionLineUpdateFromData createSubscriptionLineUpdateFromData() {
        return new SubscriptionLineUpdateFromData();
    }

    /**
     * Create an instance of {@link TemplateCollectionGetDataArrayResponse }
     * 
     */
    public TemplateCollectionGetDataArrayResponse createTemplateCollectionGetDataArrayResponse() {
        return new TemplateCollectionGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTemplateCollectionData }
     * 
     */
    public ArrayOfTemplateCollectionData createArrayOfTemplateCollectionData() {
        return new ArrayOfTemplateCollectionData();
    }

    /**
     * Create an instance of {@link SumIntervalGetData }
     * 
     */
    public SumIntervalGetData createSumIntervalGetData() {
        return new SumIntervalGetData();
    }

    /**
     * Create an instance of {@link AccountSetDebitCreditResponse }
     * 
     */
    public AccountSetDebitCreditResponse createAccountSetDebitCreditResponse() {
        return new AccountSetDebitCreditResponse();
    }

    /**
     * Create an instance of {@link QuotationGetLayoutResponse }
     * 
     */
    public QuotationGetLayoutResponse createQuotationGetLayoutResponse() {
        return new QuotationGetLayoutResponse();
    }

    /**
     * Create an instance of {@link DebtorGetNumberResponse }
     * 
     */
    public DebtorGetNumberResponse createDebtorGetNumberResponse() {
        return new DebtorGetNumberResponse();
    }

    /**
     * Create an instance of {@link DebtorContactGetDebtorResponse }
     * 
     */
    public DebtorContactGetDebtorResponse createDebtorContactGetDebtorResponse() {
        return new DebtorContactGetDebtorResponse();
    }

    /**
     * Create an instance of {@link CashBookEntrySetDebtorResponse }
     * 
     */
    public CashBookEntrySetDebtorResponse createCashBookEntrySetDebtorResponse() {
        return new CashBookEntrySetDebtorResponse();
    }

    /**
     * Create an instance of {@link OrderGetDebtorCountryResponse }
     * 
     */
    public OrderGetDebtorCountryResponse createOrderGetDebtorCountryResponse() {
        return new OrderGetDebtorCountryResponse();
    }

    /**
     * Create an instance of {@link PriceGroupFindByNumberResponse }
     * 
     */
    public PriceGroupFindByNumberResponse createPriceGroupFindByNumberResponse() {
        return new PriceGroupFindByNumberResponse();
    }

    /**
     * Create an instance of {@link SubscriberDeleteResponse }
     * 
     */
    public SubscriberDeleteResponse createSubscriberDeleteResponse() {
        return new SubscriberDeleteResponse();
    }

    /**
     * Create an instance of {@link DebtorEntryGetCurrencyResponse }
     * 
     */
    public DebtorEntryGetCurrencyResponse createDebtorEntryGetCurrencyResponse() {
        return new DebtorEntryGetCurrencyResponse();
    }

    /**
     * Create an instance of {@link CompanySetAddress2Response }
     * 
     */
    public CompanySetAddress2Response createCompanySetAddress2Response() {
        return new CompanySetAddress2Response();
    }

    /**
     * Create an instance of {@link EntryGetTextResponse }
     * 
     */
    public EntryGetTextResponse createEntryGetTextResponse() {
        return new EntryGetTextResponse();
    }

    /**
     * Create an instance of {@link CostTypeGroupGetDataResponse }
     * 
     */
    public CostTypeGroupGetDataResponse createCostTypeGroupGetDataResponse() {
        return new CostTypeGroupGetDataResponse();
    }

    /**
     * Create an instance of {@link CostTypeGroupData }
     * 
     */
    public CostTypeGroupData createCostTypeGroupData() {
        return new CostTypeGroupData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetNumberResponse }
     * 
     */
    public CurrentInvoiceLineGetNumberResponse createCurrentInvoiceLineGetNumberResponse() {
        return new CurrentInvoiceLineGetNumberResponse();
    }

    /**
     * Create an instance of {@link CreditorSetYourReferenceResponse }
     * 
     */
    public CreditorSetYourReferenceResponse createCreditorSetYourReferenceResponse() {
        return new CreditorSetYourReferenceResponse();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryCreateFromDataArray }
     * 
     */
    public DocumentArchiveCategoryCreateFromDataArray createDocumentArchiveCategoryCreateFromDataArray() {
        return new DocumentArchiveCategoryCreateFromDataArray();
    }

    /**
     * Create an instance of {@link CreditorContactSetTelephoneNumber }
     * 
     */
    public CreditorContactSetTelephoneNumber createCreditorContactSetTelephoneNumber() {
        return new CreditorContactSetTelephoneNumber();
    }

    /**
     * Create an instance of {@link CashBookEntrySetDueDate }
     * 
     */
    public CashBookEntrySetDueDate createCashBookEntrySetDueDate() {
        return new CashBookEntrySetDueDate();
    }

    /**
     * Create an instance of {@link ProjectFindByName }
     * 
     */
    public ProjectFindByName createProjectFindByName() {
        return new ProjectFindByName();
    }

    /**
     * Create an instance of {@link ProductFindByNumber }
     * 
     */
    public ProductFindByNumber createProductFindByNumber() {
        return new ProductFindByNumber();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetDepartmentResponse }
     * 
     */
    public SubscriptionLineGetDepartmentResponse createSubscriptionLineGetDepartmentResponse() {
        return new SubscriptionLineGetDepartmentResponse();
    }

    /**
     * Create an instance of {@link DebtorGetPublicEntryNumber }
     * 
     */
    public DebtorGetPublicEntryNumber createDebtorGetPublicEntryNumber() {
        return new DebtorGetPublicEntryNumber();
    }

    /**
     * Create an instance of {@link DepartmentGetAllResponse }
     * 
     */
    public DepartmentGetAllResponse createDepartmentGetAllResponse() {
        return new DepartmentGetAllResponse();
    }

    /**
     * Create an instance of {@link AccountGetTotalFrom }
     * 
     */
    public AccountGetTotalFrom createAccountGetTotalFrom() {
        return new AccountGetTotalFrom();
    }

    /**
     * Create an instance of {@link QuotationLineGetUnitCostPriceResponse }
     * 
     */
    public QuotationLineGetUnitCostPriceResponse createQuotationLineGetUnitCostPriceResponse() {
        return new QuotationLineGetUnitCostPriceResponse();
    }

    /**
     * Create an instance of {@link EntryFindBySerialNumberInterval }
     * 
     */
    public EntryFindBySerialNumberInterval createEntryFindBySerialNumberInterval() {
        return new EntryFindBySerialNumberInterval();
    }

    /**
     * Create an instance of {@link ProductGetDescription }
     * 
     */
    public ProductGetDescription createProductGetDescription() {
        return new ProductGetDescription();
    }

    /**
     * Create an instance of {@link ProjectSetDescriptionResponse }
     * 
     */
    public ProjectSetDescriptionResponse createProjectSetDescriptionResponse() {
        return new ProjectSetDescriptionResponse();
    }

    /**
     * Create an instance of {@link AccountSetDepartment }
     * 
     */
    public AccountSetDepartment createAccountSetDepartment() {
        return new AccountSetDepartment();
    }

    /**
     * Create an instance of {@link OrderGetDataArrayResponse }
     * 
     */
    public OrderGetDataArrayResponse createOrderGetDataArrayResponse() {
        return new OrderGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOrderData }
     * 
     */
    public ArrayOfOrderData createArrayOfOrderData() {
        return new ArrayOfOrderData();
    }

    /**
     * Create an instance of {@link DepartmentCreate }
     * 
     */
    public DepartmentCreate createDepartmentCreate() {
        return new DepartmentCreate();
    }

    /**
     * Create an instance of {@link CashBookEntryCreateDebtorPaymentResponse }
     * 
     */
    public CashBookEntryCreateDebtorPaymentResponse createCashBookEntryCreateDebtorPaymentResponse() {
        return new CashBookEntryCreateDebtorPaymentResponse();
    }

    /**
     * Create an instance of {@link MileageEntrySetProjectResponse }
     * 
     */
    public MileageEntrySetProjectResponse createMileageEntrySetProjectResponse() {
        return new MileageEntrySetProjectResponse();
    }

    /**
     * Create an instance of {@link ProjectGetNumber }
     * 
     */
    public ProjectGetNumber createProjectGetNumber() {
        return new ProjectGetNumber();
    }

    /**
     * Create an instance of {@link QuotationLineGetDeliveryDate }
     * 
     */
    public QuotationLineGetDeliveryDate createQuotationLineGetDeliveryDate() {
        return new QuotationLineGetDeliveryDate();
    }

    /**
     * Create an instance of {@link InvoiceGetHeadingResponse }
     * 
     */
    public InvoiceGetHeadingResponse createInvoiceGetHeadingResponse() {
        return new InvoiceGetHeadingResponse();
    }

    /**
     * Create an instance of {@link QuotationGetOurReference2 }
     * 
     */
    public QuotationGetOurReference2 createQuotationGetOurReference2() {
        return new QuotationGetOurReference2();
    }

    /**
     * Create an instance of {@link CashBookEntrySetContraVatAccountResponse }
     * 
     */
    public CashBookEntrySetContraVatAccountResponse createCashBookEntrySetContraVatAccountResponse() {
        return new CashBookEntrySetContraVatAccountResponse();
    }

    /**
     * Create an instance of {@link QuotationSetIsVatIncludedResponse }
     * 
     */
    public QuotationSetIsVatIncludedResponse createQuotationSetIsVatIncludedResponse() {
        return new QuotationSetIsVatIncludedResponse();
    }

    /**
     * Create an instance of {@link CreditorGetAttentionResponse }
     * 
     */
    public CreditorGetAttentionResponse createCreditorGetAttentionResponse() {
        return new CreditorGetAttentionResponse();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetFromDate }
     * 
     */
    public ScannedDocumentGetFromDate createScannedDocumentGetFromDate() {
        return new ScannedDocumentGetFromDate();
    }

    /**
     * Create an instance of {@link ProductGetVolumeResponse }
     * 
     */
    public ProductGetVolumeResponse createProductGetVolumeResponse() {
        return new ProductGetVolumeResponse();
    }

    /**
     * Create an instance of {@link QuotationGetDateResponse }
     * 
     */
    public QuotationGetDateResponse createQuotationGetDateResponse() {
        return new QuotationGetDateResponse();
    }

    /**
     * Create an instance of {@link DebtorGetOurReferenceResponse }
     * 
     */
    public DebtorGetOurReferenceResponse createDebtorGetOurReferenceResponse() {
        return new DebtorGetOurReferenceResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetContraAccountResponse }
     * 
     */
    public TermOfPaymentGetContraAccountResponse createTermOfPaymentGetContraAccountResponse() {
        return new TermOfPaymentGetContraAccountResponse();
    }

    /**
     * Create an instance of {@link ScannedDocumentFindByVoucherNumberInterval }
     * 
     */
    public ScannedDocumentFindByVoucherNumberInterval createScannedDocumentFindByVoucherNumberInterval() {
        return new ScannedDocumentFindByVoucherNumberInterval();
    }

    /**
     * Create an instance of {@link EmployeeGetSalesPriceBefore }
     * 
     */
    public EmployeeGetSalesPriceBefore createEmployeeGetSalesPriceBefore() {
        return new EmployeeGetSalesPriceBefore();
    }

    /**
     * Create an instance of {@link DebtorGroupFindByNumberList }
     * 
     */
    public DebtorGroupFindByNumberList createDebtorGroupFindByNumberList() {
        return new DebtorGroupFindByNumberList();
    }

    /**
     * Create an instance of {@link UnitUpdateFromDataResponse }
     * 
     */
    public UnitUpdateFromDataResponse createUnitUpdateFromDataResponse() {
        return new UnitUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link DebtorFindByNumberListResponse }
     * 
     */
    public DebtorFindByNumberListResponse createDebtorFindByNumberListResponse() {
        return new DebtorFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetDeliveryDateResponse }
     * 
     */
    public CurrentInvoiceLineGetDeliveryDateResponse createCurrentInvoiceLineGetDeliveryDateResponse() {
        return new CurrentInvoiceLineGetDeliveryDateResponse();
    }

    /**
     * Create an instance of {@link AccountGetBudgetFiguresResponse }
     * 
     */
    public AccountGetBudgetFiguresResponse createAccountGetBudgetFiguresResponse() {
        return new AccountGetBudgetFiguresResponse();
    }

    /**
     * Create an instance of {@link CreditorFindByNameResponse }
     * 
     */
    public CreditorFindByNameResponse createCreditorFindByNameResponse() {
        return new CreditorFindByNameResponse();
    }

    /**
     * Create an instance of {@link OrderSetTermsOfDelivery }
     * 
     */
    public OrderSetTermsOfDelivery createOrderSetTermsOfDelivery() {
        return new OrderSetTermsOfDelivery();
    }

    /**
     * Create an instance of {@link DebtorGetOurReference }
     * 
     */
    public DebtorGetOurReference createDebtorGetOurReference() {
        return new DebtorGetOurReference();
    }

    /**
     * Create an instance of {@link ProjectGetTimeEntries }
     * 
     */
    public ProjectGetTimeEntries createProjectGetTimeEntries() {
        return new ProjectGetTimeEntries();
    }

    /**
     * Create an instance of {@link OrderGetDeliveryCountry }
     * 
     */
    public OrderGetDeliveryCountry createOrderGetDeliveryCountry() {
        return new OrderGetDeliveryCountry();
    }

    /**
     * Create an instance of {@link CreditorSetYourReference }
     * 
     */
    public CreditorSetYourReference createCreditorSetYourReference() {
        return new CreditorSetYourReference();
    }

    /**
     * Create an instance of {@link DebtorSetCountry }
     * 
     */
    public DebtorSetCountry createDebtorSetCountry() {
        return new DebtorSetCountry();
    }

    /**
     * Create an instance of {@link CreditorContactSetEmailResponse }
     * 
     */
    public CreditorContactSetEmailResponse createCreditorContactSetEmailResponse() {
        return new CreditorContactSetEmailResponse();
    }

    /**
     * Create an instance of {@link CreditorGetOpenEntries }
     * 
     */
    public CreditorGetOpenEntries createCreditorGetOpenEntries() {
        return new CreditorGetOpenEntries();
    }

    /**
     * Create an instance of {@link DebtorContactGetCommentsResponse }
     * 
     */
    public DebtorContactGetCommentsResponse createDebtorContactGetCommentsResponse() {
        return new DebtorContactGetCommentsResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDebtorResponse }
     * 
     */
    public CurrentInvoiceGetDebtorResponse createCurrentInvoiceGetDebtorResponse() {
        return new CurrentInvoiceGetDebtorResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetExchangeRate }
     * 
     */
    public CurrentInvoiceGetExchangeRate createCurrentInvoiceGetExchangeRate() {
        return new CurrentInvoiceGetExchangeRate();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetMargin }
     * 
     */
    public CurrentInvoiceGetMargin createCurrentInvoiceGetMargin() {
        return new CurrentInvoiceGetMargin();
    }

    /**
     * Create an instance of {@link DebtorEntryGetDueDate }
     * 
     */
    public DebtorEntryGetDueDate createDebtorEntryGetDueDate() {
        return new DebtorEntryGetDueDate();
    }

    /**
     * Create an instance of {@link ProjectGetAllResponse }
     * 
     */
    public ProjectGetAllResponse createProjectGetAllResponse() {
        return new ProjectGetAllResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureSetFromDateResponse }
     * 
     */
    public BudgetFigureSetFromDateResponse createBudgetFigureSetFromDateResponse() {
        return new BudgetFigureSetFromDateResponse();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryCreateResponse }
     * 
     */
    public DocumentArchiveCategoryCreateResponse createDocumentArchiveCategoryCreateResponse() {
        return new DocumentArchiveCategoryCreateResponse();
    }

    /**
     * Create an instance of {@link OrderLineUpdateFromData }
     * 
     */
    public OrderLineUpdateFromData createOrderLineUpdateFromData() {
        return new OrderLineUpdateFromData();
    }

    /**
     * Create an instance of {@link OrderLineData }
     * 
     */
    public OrderLineData createOrderLineData() {
        return new OrderLineData();
    }

    /**
     * Create an instance of {@link CreditorGroupGetDataResponse }
     * 
     */
    public CreditorGroupGetDataResponse createCreditorGroupGetDataResponse() {
        return new CreditorGroupGetDataResponse();
    }

    /**
     * Create an instance of {@link CreditorSetCreditorGroup }
     * 
     */
    public CreditorSetCreditorGroup createCreditorSetCreditorGroup() {
        return new CreditorSetCreditorGroup();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceGetLines }
     * 
     */
    public CurrentSupplierInvoiceGetLines createCurrentSupplierInvoiceGetLines() {
        return new CurrentSupplierInvoiceGetLines();
    }

    /**
     * Create an instance of {@link CreditorEntryGetDueDateResponse }
     * 
     */
    public CreditorEntryGetDueDateResponse createCreditorEntryGetDueDateResponse() {
        return new CreditorEntryGetDueDateResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetUnitNetPrice }
     * 
     */
    public CurrentInvoiceLineGetUnitNetPrice createCurrentInvoiceLineGetUnitNetPrice() {
        return new CurrentInvoiceLineGetUnitNetPrice();
    }

    /**
     * Create an instance of {@link OrderGetDebtorName }
     * 
     */
    public OrderGetDebtorName createOrderGetDebtorName() {
        return new OrderGetDebtorName();
    }

    /**
     * Create an instance of {@link QuotationSetDebtorPostalCodeResponse }
     * 
     */
    public QuotationSetDebtorPostalCodeResponse createQuotationSetDebtorPostalCodeResponse() {
        return new QuotationSetDebtorPostalCodeResponse();
    }

    /**
     * Create an instance of {@link ProjectGetTimeEntriesByDate }
     * 
     */
    public ProjectGetTimeEntriesByDate createProjectGetTimeEntriesByDate() {
        return new ProjectGetTimeEntriesByDate();
    }

    /**
     * Create an instance of {@link DebtorSetCountyResponse }
     * 
     */
    public DebtorSetCountyResponse createDebtorSetCountyResponse() {
        return new DebtorSetCountyResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDebtorCity }
     * 
     */
    public CurrentInvoiceSetDebtorCity createCurrentInvoiceSetDebtorCity() {
        return new CurrentInvoiceSetDebtorCity();
    }

    /**
     * Create an instance of {@link SubscriptionGetAllResponse }
     * 
     */
    public SubscriptionGetAllResponse createSubscriptionGetAllResponse() {
        return new SubscriptionGetAllResponse();
    }

    /**
     * Create an instance of {@link SumIntervalGetDataResponse }
     * 
     */
    public SumIntervalGetDataResponse createSumIntervalGetDataResponse() {
        return new SumIntervalGetDataResponse();
    }

    /**
     * Create an instance of {@link ProductGetDescriptionResponse }
     * 
     */
    public ProductGetDescriptionResponse createProductGetDescriptionResponse() {
        return new ProductGetDescriptionResponse();
    }

    /**
     * Create an instance of {@link AccountSetTotalFromResponse }
     * 
     */
    public AccountSetTotalFromResponse createAccountSetTotalFromResponse() {
        return new AccountSetTotalFromResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDeliveryDateResponse }
     * 
     */
    public CurrentInvoiceGetDeliveryDateResponse createCurrentInvoiceGetDeliveryDateResponse() {
        return new CurrentInvoiceGetDeliveryDateResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceCreateFromDataArray }
     * 
     */
    public CurrentInvoiceCreateFromDataArray createCurrentInvoiceCreateFromDataArray() {
        return new CurrentInvoiceCreateFromDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfCurrentInvoiceData }
     * 
     */
    public ArrayOfCurrentInvoiceData createArrayOfCurrentInvoiceData() {
        return new ArrayOfCurrentInvoiceData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetAttention }
     * 
     */
    public CurrentInvoiceSetAttention createCurrentInvoiceSetAttention() {
        return new CurrentInvoiceSetAttention();
    }

    /**
     * Create an instance of {@link CreditorGetOurReference }
     * 
     */
    public CreditorGetOurReference createCreditorGetOurReference() {
        return new CreditorGetOurReference();
    }

    /**
     * Create an instance of {@link QuotationGetDate }
     * 
     */
    public QuotationGetDate createQuotationGetDate() {
        return new QuotationGetDate();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetCategoryResponse }
     * 
     */
    public ScannedDocumentGetCategoryResponse createScannedDocumentGetCategoryResponse() {
        return new ScannedDocumentGetCategoryResponse();
    }

    /**
     * Create an instance of {@link InvoiceFindByOurReference }
     * 
     */
    public InvoiceFindByOurReference createInvoiceFindByOurReference() {
        return new InvoiceFindByOurReference();
    }

    /**
     * Create an instance of {@link KeyFigureCodeGetAllResponse }
     * 
     */
    public KeyFigureCodeGetAllResponse createKeyFigureCodeGetAllResponse() {
        return new KeyFigureCodeGetAllResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryCreateManualDebtorInvoiceResponse }
     * 
     */
    public CashBookEntryCreateManualDebtorInvoiceResponse createCashBookEntryCreateManualDebtorInvoiceResponse() {
        return new CashBookEntryCreateManualDebtorInvoiceResponse();
    }

    /**
     * Create an instance of {@link ProductUpdateFromData }
     * 
     */
    public ProductUpdateFromData createProductUpdateFromData() {
        return new ProductUpdateFromData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetDescriptionResponse }
     * 
     */
    public CurrentInvoiceLineGetDescriptionResponse createCurrentInvoiceLineGetDescriptionResponse() {
        return new CurrentInvoiceLineGetDescriptionResponse();
    }

    /**
     * Create an instance of {@link QuotationGetData }
     * 
     */
    public QuotationGetData createQuotationGetData() {
        return new QuotationGetData();
    }

    /**
     * Create an instance of {@link UnitSetNameResponse }
     * 
     */
    public UnitSetNameResponse createUnitSetNameResponse() {
        return new UnitSetNameResponse();
    }

    /**
     * Create an instance of {@link QuotationGetAll }
     * 
     */
    public QuotationGetAll createQuotationGetAll() {
        return new QuotationGetAll();
    }

    /**
     * Create an instance of {@link DebtorCreateResponse }
     * 
     */
    public DebtorCreateResponse createDebtorCreateResponse() {
        return new DebtorCreateResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetTextResponse }
     * 
     */
    public CashBookEntryGetTextResponse createCashBookEntryGetTextResponse() {
        return new CashBookEntryGetTextResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetDiscountAsPercentResponse }
     * 
     */
    public OrderLineGetDiscountAsPercentResponse createOrderLineGetDiscountAsPercentResponse() {
        return new OrderLineGetDiscountAsPercentResponse();
    }

    /**
     * Create an instance of {@link OrderGetDebtorNameResponse }
     * 
     */
    public OrderGetDebtorNameResponse createOrderGetDebtorNameResponse() {
        return new OrderGetDebtorNameResponse();
    }

    /**
     * Create an instance of {@link DebtorEntryGetSerialNumber }
     * 
     */
    public DebtorEntryGetSerialNumber createDebtorEntryGetSerialNumber() {
        return new DebtorEntryGetSerialNumber();
    }

    /**
     * Create an instance of {@link DebtorSetCINumberResponse }
     * 
     */
    public DebtorSetCINumberResponse createDebtorSetCINumberResponse() {
        return new DebtorSetCINumberResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetPublicEntryNumberResponse }
     * 
     */
    public CurrentInvoiceGetPublicEntryNumberResponse createCurrentInvoiceGetPublicEntryNumberResponse() {
        return new CurrentInvoiceGetPublicEntryNumberResponse();
    }

    /**
     * Create an instance of {@link DistributionKeyGetAll }
     * 
     */
    public DistributionKeyGetAll createDistributionKeyGetAll() {
        return new DistributionKeyGetAll();
    }

    /**
     * Create an instance of {@link CreditorEntryGetAccountResponse }
     * 
     */
    public CreditorEntryGetAccountResponse createCreditorEntryGetAccountResponse() {
        return new CreditorEntryGetAccountResponse();
    }

    /**
     * Create an instance of {@link QuotationSetPublicEntryNumber }
     * 
     */
    public QuotationSetPublicEntryNumber createQuotationSetPublicEntryNumber() {
        return new QuotationSetPublicEntryNumber();
    }

    /**
     * Create an instance of {@link ReportCodeGetFullCode }
     * 
     */
    public ReportCodeGetFullCode createReportCodeGetFullCode() {
        return new ReportCodeGetFullCode();
    }

    /**
     * Create an instance of {@link QuotationLineSetUnitResponse }
     * 
     */
    public QuotationLineSetUnitResponse createQuotationLineSetUnitResponse() {
        return new QuotationLineSetUnitResponse();
    }

    /**
     * Create an instance of {@link CreditorEntryGetRemainderDefaultCurrencyResponse }
     * 
     */
    public CreditorEntryGetRemainderDefaultCurrencyResponse createCreditorEntryGetRemainderDefaultCurrencyResponse() {
        return new CreditorEntryGetRemainderDefaultCurrencyResponse();
    }

    /**
     * Create an instance of {@link DebtorFindByEmail }
     * 
     */
    public DebtorFindByEmail createDebtorFindByEmail() {
        return new DebtorFindByEmail();
    }

    /**
     * Create an instance of {@link QuotationGetIsVatIncluded }
     * 
     */
    public QuotationGetIsVatIncluded createQuotationGetIsVatIncluded() {
        return new QuotationGetIsVatIncluded();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineFindByProductResponse }
     * 
     */
    public CurrentInvoiceLineFindByProductResponse createCurrentInvoiceLineFindByProductResponse() {
        return new CurrentInvoiceLineFindByProductResponse();
    }

    /**
     * Create an instance of {@link QuotationFindByOtherReferenceResponse }
     * 
     */
    public QuotationFindByOtherReferenceResponse createQuotationFindByOtherReferenceResponse() {
        return new QuotationFindByOtherReferenceResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetDeliveryPostalCode }
     * 
     */
    public InvoiceGetDeliveryPostalCode createInvoiceGetDeliveryPostalCode() {
        return new InvoiceGetDeliveryPostalCode();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetUnitCostPriceResponse }
     * 
     */
    public CurrentInvoiceLineGetUnitCostPriceResponse createCurrentInvoiceLineGetUnitCostPriceResponse() {
        return new CurrentInvoiceLineGetUnitCostPriceResponse();
    }

    /**
     * Create an instance of {@link DebtorGroupGetLayout }
     * 
     */
    public DebtorGroupGetLayout createDebtorGroupGetLayout() {
        return new DebtorGroupGetLayout();
    }

    /**
     * Create an instance of {@link SubscriptionFindByNameResponse }
     * 
     */
    public SubscriptionFindByNameResponse createSubscriptionFindByNameResponse() {
        return new SubscriptionFindByNameResponse();
    }

    /**
     * Create an instance of {@link OrderLineFindByProductListResponse }
     * 
     */
    public OrderLineFindByProductListResponse createOrderLineFindByProductListResponse() {
        return new OrderLineFindByProductListResponse();
    }

    /**
     * Create an instance of {@link SubscriberGetPriceIndexResponse }
     * 
     */
    public SubscriberGetPriceIndexResponse createSubscriberGetPriceIndexResponse() {
        return new SubscriberGetPriceIndexResponse();
    }

    /**
     * Create an instance of {@link CostTypeGetNameResponse }
     * 
     */
    public CostTypeGetNameResponse createCostTypeGetNameResponse() {
        return new CostTypeGetNameResponse();
    }

    /**
     * Create an instance of {@link SubscriptionSetName }
     * 
     */
    public SubscriptionSetName createSubscriptionSetName() {
        return new SubscriptionSetName();
    }

    /**
     * Create an instance of {@link QuotationSetDebtorNameResponse }
     * 
     */
    public QuotationSetDebtorNameResponse createQuotationSetDebtorNameResponse() {
        return new QuotationSetDebtorNameResponse();
    }

    /**
     * Create an instance of {@link AccountingPeriodGetDataResponse }
     * 
     */
    public AccountingPeriodGetDataResponse createAccountingPeriodGetDataResponse() {
        return new AccountingPeriodGetDataResponse();
    }

    /**
     * Create an instance of {@link AccountingPeriodData }
     * 
     */
    public AccountingPeriodData createAccountingPeriodData() {
        return new AccountingPeriodData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetVatAmount }
     * 
     */
    public CurrentInvoiceGetVatAmount createCurrentInvoiceGetVatAmount() {
        return new CurrentInvoiceGetVatAmount();
    }

    /**
     * Create an instance of {@link DistributionKeyFindByNumber }
     * 
     */
    public DistributionKeyFindByNumber createDistributionKeyFindByNumber() {
        return new DistributionKeyFindByNumber();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceSetCreditorResponse }
     * 
     */
    public CurrentSupplierInvoiceSetCreditorResponse createCurrentSupplierInvoiceSetCreditorResponse() {
        return new CurrentSupplierInvoiceSetCreditorResponse();
    }

    /**
     * Create an instance of {@link CreditorSetName }
     * 
     */
    public CreditorSetName createCreditorSetName() {
        return new CreditorSetName();
    }

    /**
     * Create an instance of {@link AccountGetData }
     * 
     */
    public AccountGetData createAccountGetData() {
        return new AccountGetData();
    }

    /**
     * Create an instance of {@link CompanySetPostalCodeResponse }
     * 
     */
    public CompanySetPostalCodeResponse createCompanySetPostalCodeResponse() {
        return new CompanySetPostalCodeResponse();
    }

    /**
     * Create an instance of {@link ProductGetAvailableResponse }
     * 
     */
    public ProductGetAvailableResponse createProductGetAvailableResponse() {
        return new ProductGetAvailableResponse();
    }

    /**
     * Create an instance of {@link CreditorGetCountry }
     * 
     */
    public CreditorGetCountry createCreditorGetCountry() {
        return new CreditorGetCountry();
    }

    /**
     * Create an instance of {@link TimeEntryDeleteResponse }
     * 
     */
    public TimeEntryDeleteResponse createTimeEntryDeleteResponse() {
        return new TimeEntryDeleteResponse();
    }

    /**
     * Create an instance of {@link ProductPriceCreateResponse }
     * 
     */
    public ProductPriceCreateResponse createProductPriceCreateResponse() {
        return new ProductPriceCreateResponse();
    }

    /**
     * Create an instance of {@link QuotationSetDebtorResponse }
     * 
     */
    public QuotationSetDebtorResponse createQuotationSetDebtorResponse() {
        return new QuotationSetDebtorResponse();
    }

    /**
     * Create an instance of {@link AccountingYearGetYear }
     * 
     */
    public AccountingYearGetYear createAccountingYearGetYear() {
        return new AccountingYearGetYear();
    }

    /**
     * Create an instance of {@link OrderGetMarginAsPercent }
     * 
     */
    public OrderGetMarginAsPercent createOrderGetMarginAsPercent() {
        return new OrderGetMarginAsPercent();
    }

    /**
     * Create an instance of {@link CreditorContactCreateResponse }
     * 
     */
    public CreditorContactCreateResponse createCreditorContactCreateResponse() {
        return new CreditorContactCreateResponse();
    }

    /**
     * Create an instance of {@link DebtorSetYourReferenceResponse }
     * 
     */
    public DebtorSetYourReferenceResponse createDebtorSetYourReferenceResponse() {
        return new DebtorSetYourReferenceResponse();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetQuantity }
     * 
     */
    public SubscriptionLineGetQuantity createSubscriptionLineGetQuantity() {
        return new SubscriptionLineGetQuantity();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDeliveryLocationResponse }
     * 
     */
    public CurrentInvoiceGetDeliveryLocationResponse createCurrentInvoiceGetDeliveryLocationResponse() {
        return new CurrentInvoiceGetDeliveryLocationResponse();
    }

    /**
     * Create an instance of {@link MileageEntryDeleteResponse }
     * 
     */
    public MileageEntryDeleteResponse createMileageEntryDeleteResponse() {
        return new MileageEntryDeleteResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentSetDistributionInPercent }
     * 
     */
    public TermOfPaymentSetDistributionInPercent createTermOfPaymentSetDistributionInPercent() {
        return new TermOfPaymentSetDistributionInPercent();
    }

    /**
     * Create an instance of {@link InvoiceGetDeliveryCounty }
     * 
     */
    public InvoiceGetDeliveryCounty createInvoiceGetDeliveryCounty() {
        return new InvoiceGetDeliveryCounty();
    }

    /**
     * Create an instance of {@link CreditorGetCountryResponse }
     * 
     */
    public CreditorGetCountryResponse createCreditorGetCountryResponse() {
        return new CreditorGetCountryResponse();
    }

    /**
     * Create an instance of {@link DebtorEntryFindBySerialNumber }
     * 
     */
    public DebtorEntryFindBySerialNumber createDebtorEntryFindBySerialNumber() {
        return new DebtorEntryFindBySerialNumber();
    }

    /**
     * Create an instance of {@link CostTypeGetDataArray }
     * 
     */
    public CostTypeGetDataArray createCostTypeGetDataArray() {
        return new CostTypeGetDataArray();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetAttentionResponse }
     * 
     */
    public CurrentInvoiceGetAttentionResponse createCurrentInvoiceGetAttentionResponse() {
        return new CurrentInvoiceGetAttentionResponse();
    }

    /**
     * Create an instance of {@link EmployeeCreateFromDataArray }
     * 
     */
    public EmployeeCreateFromDataArray createEmployeeCreateFromDataArray() {
        return new EmployeeCreateFromDataArray();
    }

    /**
     * Create an instance of {@link EmployeeGetSalesPrice }
     * 
     */
    public EmployeeGetSalesPrice createEmployeeGetSalesPrice() {
        return new EmployeeGetSalesPrice();
    }

    /**
     * Create an instance of {@link CurrentInvoiceFindByOtherReference }
     * 
     */
    public CurrentInvoiceFindByOtherReference createCurrentInvoiceFindByOtherReference() {
        return new CurrentInvoiceFindByOtherReference();
    }

    /**
     * Create an instance of {@link EmployeeGroupCreateResponse }
     * 
     */
    public EmployeeGroupCreateResponse createEmployeeGroupCreateResponse() {
        return new EmployeeGroupCreateResponse();
    }

    /**
     * Create an instance of {@link QuotationLineGetDepartment }
     * 
     */
    public QuotationLineGetDepartment createQuotationLineGetDepartment() {
        return new QuotationLineGetDepartment();
    }

    /**
     * Create an instance of {@link CompanyUpdateFromDataArray }
     * 
     */
    public CompanyUpdateFromDataArray createCompanyUpdateFromDataArray() {
        return new CompanyUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfCompanyData }
     * 
     */
    public ArrayOfCompanyData createArrayOfCompanyData() {
        return new ArrayOfCompanyData();
    }

    /**
     * Create an instance of {@link SubscriptionLineCreateFromDataArray }
     * 
     */
    public SubscriptionLineCreateFromDataArray createSubscriptionLineCreateFromDataArray() {
        return new SubscriptionLineCreateFromDataArray();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDueDate }
     * 
     */
    public CurrentInvoiceGetDueDate createCurrentInvoiceGetDueDate() {
        return new CurrentInvoiceGetDueDate();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetLayout }
     * 
     */
    public CurrentInvoiceSetLayout createCurrentInvoiceSetLayout() {
        return new CurrentInvoiceSetLayout();
    }

    /**
     * Create an instance of {@link ProjectSetProjectGroupResponse }
     * 
     */
    public ProjectSetProjectGroupResponse createProjectSetProjectGroupResponse() {
        return new ProjectSetProjectGroupResponse();
    }

    /**
     * Create an instance of {@link DebtorGroupCreate }
     * 
     */
    public DebtorGroupCreate createDebtorGroupCreate() {
        return new DebtorGroupCreate();
    }

    /**
     * Create an instance of {@link CashBookGetNameResponse }
     * 
     */
    public CashBookGetNameResponse createCashBookGetNameResponse() {
        return new CashBookGetNameResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDeliveryAddress }
     * 
     */
    public CurrentInvoiceSetDeliveryAddress createCurrentInvoiceSetDeliveryAddress() {
        return new CurrentInvoiceSetDeliveryAddress();
    }

    /**
     * Create an instance of {@link DebtorSetOurReferenceResponse }
     * 
     */
    public DebtorSetOurReferenceResponse createDebtorSetOurReferenceResponse() {
        return new DebtorSetOurReferenceResponse();
    }

    /**
     * Create an instance of {@link EmployeeGroupDelete }
     * 
     */
    public EmployeeGroupDelete createEmployeeGroupDelete() {
        return new EmployeeGroupDelete();
    }

    /**
     * Create an instance of {@link CostTypeGroupGetDataArray }
     * 
     */
    public CostTypeGroupGetDataArray createCostTypeGroupGetDataArray() {
        return new CostTypeGroupGetDataArray();
    }

    /**
     * Create an instance of {@link ProjectGetActivities }
     * 
     */
    public ProjectGetActivities createProjectGetActivities() {
        return new ProjectGetActivities();
    }

    /**
     * Create an instance of {@link BudgetFigureDeleteResponse }
     * 
     */
    public BudgetFigureDeleteResponse createBudgetFigureDeleteResponse() {
        return new BudgetFigureDeleteResponse();
    }

    /**
     * Create an instance of {@link QuotationGetDebtorResponse }
     * 
     */
    public QuotationGetDebtorResponse createQuotationGetDebtorResponse() {
        return new QuotationGetDebtorResponse();
    }

    /**
     * Create an instance of {@link CurrencyGetDataArrayResponse }
     * 
     */
    public CurrencyGetDataArrayResponse createCurrencyGetDataArrayResponse() {
        return new CurrencyGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCurrencyData }
     * 
     */
    public ArrayOfCurrencyData createArrayOfCurrencyData() {
        return new ArrayOfCurrencyData();
    }

    /**
     * Create an instance of {@link DebtorSetWebsite }
     * 
     */
    public DebtorSetWebsite createDebtorSetWebsite() {
        return new DebtorSetWebsite();
    }

    /**
     * Create an instance of {@link PriceGroupGetNumberResponse }
     * 
     */
    public PriceGroupGetNumberResponse createPriceGroupGetNumberResponse() {
        return new PriceGroupGetNumberResponse();
    }

    /**
     * Create an instance of {@link ProjectGetIsClosed }
     * 
     */
    public ProjectGetIsClosed createProjectGetIsClosed() {
        return new ProjectGetIsClosed();
    }

    /**
     * Create an instance of {@link VatAccountGetDataArray }
     * 
     */
    public VatAccountGetDataArray createVatAccountGetDataArray() {
        return new VatAccountGetDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfVatAccountHandle }
     * 
     */
    public ArrayOfVatAccountHandle createArrayOfVatAccountHandle() {
        return new ArrayOfVatAccountHandle();
    }

    /**
     * Create an instance of {@link QuotationGetDebtorNameResponse }
     * 
     */
    public QuotationGetDebtorNameResponse createQuotationGetDebtorNameResponse() {
        return new QuotationGetDebtorNameResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineGetQuantity }
     * 
     */
    public InvoiceLineGetQuantity createInvoiceLineGetQuantity() {
        return new InvoiceLineGetQuantity();
    }

    /**
     * Create an instance of {@link DebtorGroupFindByNumberListResponse }
     * 
     */
    public DebtorGroupFindByNumberListResponse createDebtorGroupFindByNumberListResponse() {
        return new DebtorGroupFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link CashBookEntrySetVoucherNumber }
     * 
     */
    public CashBookEntrySetVoucherNumber createCashBookEntrySetVoucherNumber() {
        return new CashBookEntrySetVoucherNumber();
    }

    /**
     * Create an instance of {@link DebtorGetData }
     * 
     */
    public DebtorGetData createDebtorGetData() {
        return new DebtorGetData();
    }

    /**
     * Create an instance of {@link DistributionKeyGetName }
     * 
     */
    public DistributionKeyGetName createDistributionKeyGetName() {
        return new DistributionKeyGetName();
    }

    /**
     * Create an instance of {@link CashBookDeleteAllEntriesResponse }
     * 
     */
    public CashBookDeleteAllEntriesResponse createCashBookDeleteAllEntriesResponse() {
        return new CashBookDeleteAllEntriesResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetTextLine2 }
     * 
     */
    public CurrentInvoiceSetTextLine2 createCurrentInvoiceSetTextLine2() {
        return new CurrentInvoiceSetTextLine2();
    }

    /**
     * Create an instance of {@link InvoiceLineGetQuantityResponse }
     * 
     */
    public InvoiceLineGetQuantityResponse createInvoiceLineGetQuantityResponse() {
        return new InvoiceLineGetQuantityResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetTextLine1 }
     * 
     */
    public CurrentInvoiceSetTextLine1 createCurrentInvoiceSetTextLine1() {
        return new CurrentInvoiceSetTextLine1();
    }

    /**
     * Create an instance of {@link OrderSetDebtorCountry }
     * 
     */
    public OrderSetDebtorCountry createOrderSetDebtorCountry() {
        return new OrderSetDebtorCountry();
    }

    /**
     * Create an instance of {@link QuotationLineCreateResponse }
     * 
     */
    public QuotationLineCreateResponse createQuotationLineCreateResponse() {
        return new QuotationLineCreateResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetAllUpdatedResponse }
     * 
     */
    public CurrentInvoiceGetAllUpdatedResponse createCurrentInvoiceGetAllUpdatedResponse() {
        return new CurrentInvoiceGetAllUpdatedResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetAmountDefaultCurrency }
     * 
     */
    public CashBookEntryGetAmountDefaultCurrency createCashBookEntryGetAmountDefaultCurrency() {
        return new CashBookEntryGetAmountDefaultCurrency();
    }

    /**
     * Create an instance of {@link SubscriberGetPriceIndex }
     * 
     */
    public SubscriberGetPriceIndex createSubscriberGetPriceIndex() {
        return new SubscriberGetPriceIndex();
    }

    /**
     * Create an instance of {@link CurrentInvoiceDeleteResponse }
     * 
     */
    public CurrentInvoiceDeleteResponse createCurrentInvoiceDeleteResponse() {
        return new CurrentInvoiceDeleteResponse();
    }

    /**
     * Create an instance of {@link OrderCancelSentStatus }
     * 
     */
    public OrderCancelSentStatus createOrderCancelSentStatus() {
        return new OrderCancelSentStatus();
    }

    /**
     * Create an instance of {@link QuotationGetDeliveryAddressResponse }
     * 
     */
    public QuotationGetDeliveryAddressResponse createQuotationGetDeliveryAddressResponse() {
        return new QuotationGetDeliveryAddressResponse();
    }

    /**
     * Create an instance of {@link ProductPriceSetPriceResponse }
     * 
     */
    public ProductPriceSetPriceResponse createProductPriceSetPriceResponse() {
        return new ProductPriceSetPriceResponse();
    }

    /**
     * Create an instance of {@link CompanyGetVatNumber }
     * 
     */
    public CompanyGetVatNumber createCompanyGetVatNumber() {
        return new CompanyGetVatNumber();
    }

    /**
     * Create an instance of {@link EmployeeGroupGetNumberResponse }
     * 
     */
    public EmployeeGroupGetNumberResponse createEmployeeGroupGetNumberResponse() {
        return new EmployeeGroupGetNumberResponse();
    }

    /**
     * Create an instance of {@link MileageEntryGetEndLocation }
     * 
     */
    public MileageEntryGetEndLocation createMileageEntryGetEndLocation() {
        return new MileageEntryGetEndLocation();
    }

    /**
     * Create an instance of {@link ProductGetNumber }
     * 
     */
    public ProductGetNumber createProductGetNumber() {
        return new ProductGetNumber();
    }

    /**
     * Create an instance of {@link TermOfPaymentCreateFromDataArrayResponse }
     * 
     */
    public TermOfPaymentCreateFromDataArrayResponse createTermOfPaymentCreateFromDataArrayResponse() {
        return new TermOfPaymentCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link OrderGetCurrencyResponse }
     * 
     */
    public OrderGetCurrencyResponse createOrderGetCurrencyResponse() {
        return new OrderGetCurrencyResponse();
    }

    /**
     * Create an instance of {@link QuotationGetYourReference }
     * 
     */
    public QuotationGetYourReference createQuotationGetYourReference() {
        return new QuotationGetYourReference();
    }

    /**
     * Create an instance of {@link ProjectGetDebtor }
     * 
     */
    public ProjectGetDebtor createProjectGetDebtor() {
        return new ProjectGetDebtor();
    }

    /**
     * Create an instance of {@link OrderGetPdfResponse }
     * 
     */
    public OrderGetPdfResponse createOrderGetPdfResponse() {
        return new OrderGetPdfResponse();
    }

    /**
     * Create an instance of {@link AccountingPeriodGetDataArray }
     * 
     */
    public AccountingPeriodGetDataArray createAccountingPeriodGetDataArray() {
        return new AccountingPeriodGetDataArray();
    }

    /**
     * Create an instance of {@link QuotationSetTextLine2 }
     * 
     */
    public QuotationSetTextLine2 createQuotationSetTextLine2() {
        return new QuotationSetTextLine2();
    }

    /**
     * Create an instance of {@link ProjectGetTimeEntriesByDateResponse }
     * 
     */
    public ProjectGetTimeEntriesByDateResponse createProjectGetTimeEntriesByDateResponse() {
        return new ProjectGetTimeEntriesByDateResponse();
    }

    /**
     * Create an instance of {@link AccountGetDepartment }
     * 
     */
    public AccountGetDepartment createAccountGetDepartment() {
        return new AccountGetDepartment();
    }

    /**
     * Create an instance of {@link QuotationSetTextLine1 }
     * 
     */
    public QuotationSetTextLine1 createQuotationSetTextLine1() {
        return new QuotationSetTextLine1();
    }

    /**
     * Create an instance of {@link EmployeeSetSalesPriceBeforeResponse }
     * 
     */
    public EmployeeSetSalesPriceBeforeResponse createEmployeeSetSalesPriceBeforeResponse() {
        return new EmployeeSetSalesPriceBeforeResponse();
    }

    /**
     * Create an instance of {@link DistributionKeyGetNameResponse }
     * 
     */
    public DistributionKeyGetNameResponse createDistributionKeyGetNameResponse() {
        return new DistributionKeyGetNameResponse();
    }

    /**
     * Create an instance of {@link ReportCodeGetFullCodeResponse }
     * 
     */
    public ReportCodeGetFullCodeResponse createReportCodeGetFullCodeResponse() {
        return new ReportCodeGetFullCodeResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetIsVatIncludedResponse }
     * 
     */
    public CurrentInvoiceGetIsVatIncludedResponse createCurrentInvoiceGetIsVatIncludedResponse() {
        return new CurrentInvoiceGetIsVatIncludedResponse();
    }

    /**
     * Create an instance of {@link SubscriptionLineDelete }
     * 
     */
    public SubscriptionLineDelete createSubscriptionLineDelete() {
        return new SubscriptionLineDelete();
    }

    /**
     * Create an instance of {@link ProjectSetName }
     * 
     */
    public ProjectSetName createProjectSetName() {
        return new ProjectSetName();
    }

    /**
     * Create an instance of {@link QuotationLineSetQuantityResponse }
     * 
     */
    public QuotationLineSetQuantityResponse createQuotationLineSetQuantityResponse() {
        return new QuotationLineSetQuantityResponse();
    }

    /**
     * Create an instance of {@link ProductPriceUpdateFromDataResponse }
     * 
     */
    public ProductPriceUpdateFromDataResponse createProductPriceUpdateFromDataResponse() {
        return new ProductPriceUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetTextLine2Response }
     * 
     */
    public InvoiceGetTextLine2Response createInvoiceGetTextLine2Response() {
        return new InvoiceGetTextLine2Response();
    }

    /**
     * Create an instance of {@link CreditorGetAddressResponse }
     * 
     */
    public CreditorGetAddressResponse createCreditorGetAddressResponse() {
        return new CreditorGetAddressResponse();
    }

    /**
     * Create an instance of {@link DebtorCreateFromData }
     * 
     */
    public DebtorCreateFromData createDebtorCreateFromData() {
        return new DebtorCreateFromData();
    }

    /**
     * Create an instance of {@link InvoiceGetDeductionAmount }
     * 
     */
    public InvoiceGetDeductionAmount createInvoiceGetDeductionAmount() {
        return new InvoiceGetDeductionAmount();
    }

    /**
     * Create an instance of {@link SumIntervalGetDataArray }
     * 
     */
    public SumIntervalGetDataArray createSumIntervalGetDataArray() {
        return new SumIntervalGetDataArray();
    }

    /**
     * Create an instance of {@link DebtorEntryGetRemainderDefaultCurrencyResponse }
     * 
     */
    public DebtorEntryGetRemainderDefaultCurrencyResponse createDebtorEntryGetRemainderDefaultCurrencyResponse() {
        return new DebtorEntryGetRemainderDefaultCurrencyResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineGetNumberResponse }
     * 
     */
    public InvoiceLineGetNumberResponse createInvoiceLineGetNumberResponse() {
        return new InvoiceLineGetNumberResponse();
    }

    /**
     * Create an instance of {@link SubscriptionLineCreateFromDataResponse }
     * 
     */
    public SubscriptionLineCreateFromDataResponse createSubscriptionLineCreateFromDataResponse() {
        return new SubscriptionLineCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link DistributionKeyGetPercentages }
     * 
     */
    public DistributionKeyGetPercentages createDistributionKeyGetPercentages() {
        return new DistributionKeyGetPercentages();
    }

    /**
     * Create an instance of {@link InvoiceLineGetDeliveryDate }
     * 
     */
    public InvoiceLineGetDeliveryDate createInvoiceLineGetDeliveryDate() {
        return new InvoiceLineGetDeliveryDate();
    }

    /**
     * Create an instance of {@link PriceGroupCreateFromData }
     * 
     */
    public PriceGroupCreateFromData createPriceGroupCreateFromData() {
        return new PriceGroupCreateFromData();
    }

    /**
     * Create an instance of {@link BankPaymentTypeGetAll }
     * 
     */
    public BankPaymentTypeGetAll createBankPaymentTypeGetAll() {
        return new BankPaymentTypeGetAll();
    }

    /**
     * Create an instance of {@link CashBookSetName }
     * 
     */
    public CashBookSetName createCashBookSetName() {
        return new CashBookSetName();
    }

    /**
     * Create an instance of {@link CostTypeGroupFindByNumberResponse }
     * 
     */
    public CostTypeGroupFindByNumberResponse createCostTypeGroupFindByNumberResponse() {
        return new CostTypeGroupFindByNumberResponse();
    }

    /**
     * Create an instance of {@link AccountingYearGetAllResponse }
     * 
     */
    public AccountingYearGetAllResponse createAccountingYearGetAllResponse() {
        return new AccountingYearGetAllResponse();
    }

    /**
     * Create an instance of {@link CreditorGetDefaultPaymentType }
     * 
     */
    public CreditorGetDefaultPaymentType createCreditorGetDefaultPaymentType() {
        return new CreditorGetDefaultPaymentType();
    }

    /**
     * Create an instance of {@link CreditorEntryGetVoucherNumber }
     * 
     */
    public CreditorEntryGetVoucherNumber createCreditorEntryGetVoucherNumber() {
        return new CreditorEntryGetVoucherNumber();
    }

    /**
     * Create an instance of {@link CashBookEntrySetCreditorInvoiceNumberResponse }
     * 
     */
    public CashBookEntrySetCreditorInvoiceNumberResponse createCashBookEntrySetCreditorInvoiceNumberResponse() {
        return new CashBookEntrySetCreditorInvoiceNumberResponse();
    }

    /**
     * Create an instance of {@link CostTypeGroupGetAccountOngoingResponse }
     * 
     */
    public CostTypeGroupGetAccountOngoingResponse createCostTypeGroupGetAccountOngoingResponse() {
        return new CostTypeGroupGetAccountOngoingResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryCreateCreditorInvoice }
     * 
     */
    public CashBookEntryCreateCreditorInvoice createCashBookEntryCreateCreditorInvoice() {
        return new CashBookEntryCreateCreditorInvoice();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetCountry }
     * 
     */
    public DeliveryLocationGetCountry createDeliveryLocationGetCountry() {
        return new DeliveryLocationGetCountry();
    }

    /**
     * Create an instance of {@link OrderGetDataResponse }
     * 
     */
    public OrderGetDataResponse createOrderGetDataResponse() {
        return new OrderGetDataResponse();
    }

    /**
     * Create an instance of {@link OrderData }
     * 
     */
    public OrderData createOrderData() {
        return new OrderData();
    }

    /**
     * Create an instance of {@link SubscriptionSetAddPeriod }
     * 
     */
    public SubscriptionSetAddPeriod createSubscriptionSetAddPeriod() {
        return new SubscriptionSetAddPeriod();
    }

    /**
     * Create an instance of {@link MileageEntryGetProject }
     * 
     */
    public MileageEntryGetProject createMileageEntryGetProject() {
        return new MileageEntryGetProject();
    }

    /**
     * Create an instance of {@link EmployeeGetData }
     * 
     */
    public EmployeeGetData createEmployeeGetData() {
        return new EmployeeGetData();
    }

    /**
     * Create an instance of {@link DebtorGetYourReference }
     * 
     */
    public DebtorGetYourReference createDebtorGetYourReference() {
        return new DebtorGetYourReference();
    }

    /**
     * Create an instance of {@link InvoiceGetDebtorCityResponse }
     * 
     */
    public InvoiceGetDebtorCityResponse createInvoiceGetDebtorCityResponse() {
        return new InvoiceGetDebtorCityResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetDebtorCountry }
     * 
     */
    public InvoiceGetDebtorCountry createInvoiceGetDebtorCountry() {
        return new InvoiceGetDebtorCountry();
    }

    /**
     * Create an instance of {@link EntryGetCurrencyResponse }
     * 
     */
    public EntryGetCurrencyResponse createEntryGetCurrencyResponse() {
        return new EntryGetCurrencyResponse();
    }

    /**
     * Create an instance of {@link ProductGetName }
     * 
     */
    public ProductGetName createProductGetName() {
        return new ProductGetName();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetCity }
     * 
     */
    public DeliveryLocationGetCity createDeliveryLocationGetCity() {
        return new DeliveryLocationGetCity();
    }

    /**
     * Create an instance of {@link CostTypeGroupGetAccountClosedResponse }
     * 
     */
    public CostTypeGroupGetAccountClosedResponse createCostTypeGroupGetAccountClosedResponse() {
        return new CostTypeGroupGetAccountClosedResponse();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryCreateFromData }
     * 
     */
    public DocumentArchiveCategoryCreateFromData createDocumentArchiveCategoryCreateFromData() {
        return new DocumentArchiveCategoryCreateFromData();
    }

    /**
     * Create an instance of {@link CreditorContactUpdateFromDataArrayResponse }
     * 
     */
    public CreditorContactUpdateFromDataArrayResponse createCreditorContactUpdateFromDataArrayResponse() {
        return new CreditorContactUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CreditorContactGetCreditor }
     * 
     */
    public CreditorContactGetCreditor createCreditorContactGetCreditor() {
        return new CreditorContactGetCreditor();
    }

    /**
     * Create an instance of {@link QuotationGetVatAmount }
     * 
     */
    public QuotationGetVatAmount createQuotationGetVatAmount() {
        return new QuotationGetVatAmount();
    }

    /**
     * Create an instance of {@link OrderLineSetDiscountAsPercentResponse }
     * 
     */
    public OrderLineSetDiscountAsPercentResponse createOrderLineSetDiscountAsPercentResponse() {
        return new OrderLineSetDiscountAsPercentResponse();
    }

    /**
     * Create an instance of {@link SubscriberGetQuantityFactor }
     * 
     */
    public SubscriberGetQuantityFactor createSubscriberGetQuantityFactor() {
        return new SubscriberGetQuantityFactor();
    }

    /**
     * Create an instance of {@link EmployeeGetCostPriceByDateResponse }
     * 
     */
    public EmployeeGetCostPriceByDateResponse createEmployeeGetCostPriceByDateResponse() {
        return new EmployeeGetCostPriceByDateResponse();
    }

    /**
     * Create an instance of {@link AccountSetVatAccountResponse }
     * 
     */
    public AccountSetVatAccountResponse createAccountSetVatAccountResponse() {
        return new AccountSetVatAccountResponse();
    }

    /**
     * Create an instance of {@link QuotationCreateFromDataResponse }
     * 
     */
    public QuotationCreateFromDataResponse createQuotationCreateFromDataResponse() {
        return new QuotationCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetQuantityResponse }
     * 
     */
    public OrderLineGetQuantityResponse createOrderLineGetQuantityResponse() {
        return new OrderLineGetQuantityResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDebtorCity }
     * 
     */
    public CurrentInvoiceGetDebtorCity createCurrentInvoiceGetDebtorCity() {
        return new CurrentInvoiceGetDebtorCity();
    }

    /**
     * Create an instance of {@link OrderGetDataArray }
     * 
     */
    public OrderGetDataArray createOrderGetDataArray() {
        return new OrderGetDataArray();
    }

    /**
     * Create an instance of {@link InvoiceGetAll }
     * 
     */
    public InvoiceGetAll createInvoiceGetAll() {
        return new InvoiceGetAll();
    }

    /**
     * Create an instance of {@link KeyFigureCodeGetNumberResponse }
     * 
     */
    public KeyFigureCodeGetNumberResponse createKeyFigureCodeGetNumberResponse() {
        return new KeyFigureCodeGetNumberResponse();
    }

    /**
     * Create an instance of {@link CreditorContactGetDataResponse }
     * 
     */
    public CreditorContactGetDataResponse createCreditorContactGetDataResponse() {
        return new CreditorContactGetDataResponse();
    }

    /**
     * Create an instance of {@link CreditorContactData }
     * 
     */
    public CreditorContactData createCreditorContactData() {
        return new CreditorContactData();
    }

    /**
     * Create an instance of {@link ConnectAsAdministrator }
     * 
     */
    public ConnectAsAdministrator createConnectAsAdministrator() {
        return new ConnectAsAdministrator();
    }

    /**
     * Create an instance of {@link SubscriptionGetIncludeNameResponse }
     * 
     */
    public SubscriptionGetIncludeNameResponse createSubscriptionGetIncludeNameResponse() {
        return new SubscriptionGetIncludeNameResponse();
    }

    /**
     * Create an instance of {@link QuotationSetDebtorCountryResponse }
     * 
     */
    public QuotationSetDebtorCountryResponse createQuotationSetDebtorCountryResponse() {
        return new QuotationSetDebtorCountryResponse();
    }

    /**
     * Create an instance of {@link QuotationGetExchangeRateResponse }
     * 
     */
    public QuotationGetExchangeRateResponse createQuotationGetExchangeRateResponse() {
        return new QuotationGetExchangeRateResponse();
    }

    /**
     * Create an instance of {@link MileageEntryGetCostRateResponse }
     * 
     */
    public MileageEntryGetCostRateResponse createMileageEntryGetCostRateResponse() {
        return new MileageEntryGetCostRateResponse();
    }

    /**
     * Create an instance of {@link SubscriptionLineCreateResponse }
     * 
     */
    public SubscriptionLineCreateResponse createSubscriptionLineCreateResponse() {
        return new SubscriptionLineCreateResponse();
    }

    /**
     * Create an instance of {@link InvoiceFindByOtherReferenceResponse }
     * 
     */
    public InvoiceFindByOtherReferenceResponse createInvoiceFindByOtherReferenceResponse() {
        return new InvoiceFindByOtherReferenceResponse();
    }

    /**
     * Create an instance of {@link DebtorContactGetName }
     * 
     */
    public DebtorContactGetName createDebtorContactGetName() {
        return new DebtorContactGetName();
    }

    /**
     * Create an instance of {@link DebtorContactFindByName }
     * 
     */
    public DebtorContactFindByName createDebtorContactFindByName() {
        return new DebtorContactFindByName();
    }

    /**
     * Create an instance of {@link PriceGroupFindByNameResponse }
     * 
     */
    public PriceGroupFindByNameResponse createPriceGroupFindByNameResponse() {
        return new PriceGroupFindByNameResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetVatAccountResponse }
     * 
     */
    public CashBookEntryGetVatAccountResponse createCashBookEntryGetVatAccountResponse() {
        return new CashBookEntryGetVatAccountResponse();
    }

    /**
     * Create an instance of {@link DebtorGroupGetDataArray }
     * 
     */
    public DebtorGroupGetDataArray createDebtorGroupGetDataArray() {
        return new DebtorGroupGetDataArray();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetAll }
     * 
     */
    public SubscriptionLineGetAll createSubscriptionLineGetAll() {
        return new SubscriptionLineGetAll();
    }

    /**
     * Create an instance of {@link BudgetFigureDelete }
     * 
     */
    public BudgetFigureDelete createBudgetFigureDelete() {
        return new BudgetFigureDelete();
    }

    /**
     * Create an instance of {@link AccountingYearGetDataResponse }
     * 
     */
    public AccountingYearGetDataResponse createAccountingYearGetDataResponse() {
        return new AccountingYearGetDataResponse();
    }

    /**
     * Create an instance of {@link AccountingYearData }
     * 
     */
    public AccountingYearData createAccountingYearData() {
        return new AccountingYearData();
    }

    /**
     * Create an instance of {@link SubscriberGetDiscountAsPercentResponse }
     * 
     */
    public SubscriberGetDiscountAsPercentResponse createSubscriberGetDiscountAsPercentResponse() {
        return new SubscriberGetDiscountAsPercentResponse();
    }

    /**
     * Create an instance of {@link EntryGetVatAccount }
     * 
     */
    public EntryGetVatAccount createEntryGetVatAccount() {
        return new EntryGetVatAccount();
    }

    /**
     * Create an instance of {@link VatAccountGetContraAccount }
     * 
     */
    public VatAccountGetContraAccount createVatAccountGetContraAccount() {
        return new VatAccountGetContraAccount();
    }

    /**
     * Create an instance of {@link EmployeeGetSalesPriceBeforeResponse }
     * 
     */
    public EmployeeGetSalesPriceBeforeResponse createEmployeeGetSalesPriceBeforeResponse() {
        return new EmployeeGetSalesPriceBeforeResponse();
    }

    /**
     * Create an instance of {@link SubscriberSetRegisteredDate }
     * 
     */
    public SubscriberSetRegisteredDate createSubscriberSetRegisteredDate() {
        return new SubscriberSetRegisteredDate();
    }

    /**
     * Create an instance of {@link ProductCreateFromDataArray }
     * 
     */
    public ProductCreateFromDataArray createProductCreateFromDataArray() {
        return new ProductCreateFromDataArray();
    }

    /**
     * Create an instance of {@link CreditorEntryGetDataResponse }
     * 
     */
    public CreditorEntryGetDataResponse createCreditorEntryGetDataResponse() {
        return new CreditorEntryGetDataResponse();
    }

    /**
     * Create an instance of {@link CreditorEntryData }
     * 
     */
    public CreditorEntryData createCreditorEntryData() {
        return new CreditorEntryData();
    }

    /**
     * Create an instance of {@link MileageEntryGetDataArrayResponse }
     * 
     */
    public MileageEntryGetDataArrayResponse createMileageEntryGetDataArrayResponse() {
        return new MileageEntryGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link SubscriberGetDataResponse }
     * 
     */
    public SubscriberGetDataResponse createSubscriberGetDataResponse() {
        return new SubscriberGetDataResponse();
    }

    /**
     * Create an instance of {@link ProductGroupGetAccrual }
     * 
     */
    public ProductGroupGetAccrual createProductGroupGetAccrual() {
        return new ProductGroupGetAccrual();
    }

    /**
     * Create an instance of {@link CreditorContactGetName }
     * 
     */
    public CreditorContactGetName createCreditorContactGetName() {
        return new CreditorContactGetName();
    }

    /**
     * Create an instance of {@link OrderSetDebtorPostalCodeResponse }
     * 
     */
    public OrderSetDebtorPostalCodeResponse createOrderSetDebtorPostalCodeResponse() {
        return new OrderSetDebtorPostalCodeResponse();
    }

    /**
     * Create an instance of {@link QuotationLineUpdateFromDataResponse }
     * 
     */
    public QuotationLineUpdateFromDataResponse createQuotationLineUpdateFromDataResponse() {
        return new QuotationLineUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetStatus }
     * 
     */
    public ScannedDocumentGetStatus createScannedDocumentGetStatus() {
        return new ScannedDocumentGetStatus();
    }

    /**
     * Create an instance of {@link VatAccountGetData }
     * 
     */
    public VatAccountGetData createVatAccountGetData() {
        return new VatAccountGetData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDeliveryAddressResponse }
     * 
     */
    public CurrentInvoiceGetDeliveryAddressResponse createCurrentInvoiceGetDeliveryAddressResponse() {
        return new CurrentInvoiceGetDeliveryAddressResponse();
    }

    /**
     * Create an instance of {@link ProjectGroupFindByNameResponse }
     * 
     */
    public ProjectGroupFindByNameResponse createProjectGroupFindByNameResponse() {
        return new ProjectGroupFindByNameResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetNetAmount }
     * 
     */
    public InvoiceGetNetAmount createInvoiceGetNetAmount() {
        return new InvoiceGetNetAmount();
    }

    /**
     * Create an instance of {@link CashBookEntrySetRemittanceInformationResponse }
     * 
     */
    public CashBookEntrySetRemittanceInformationResponse createCashBookEntrySetRemittanceInformationResponse() {
        return new CashBookEntrySetRemittanceInformationResponse();
    }

    /**
     * Create an instance of {@link DistributionKeyFindByNumberList }
     * 
     */
    public DistributionKeyFindByNumberList createDistributionKeyFindByNumberList() {
        return new DistributionKeyFindByNumberList();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineSetQuantity }
     * 
     */
    public CurrentSupplierInvoiceLineSetQuantity createCurrentSupplierInvoiceLineSetQuantity() {
        return new CurrentSupplierInvoiceLineSetQuantity();
    }

    /**
     * Create an instance of {@link QuotationLineSetDiscountAsPercentResponse }
     * 
     */
    public QuotationLineSetDiscountAsPercentResponse createQuotationLineSetDiscountAsPercentResponse() {
        return new QuotationLineSetDiscountAsPercentResponse();
    }

    /**
     * Create an instance of {@link DistributionKeyUpdateFromData }
     * 
     */
    public DistributionKeyUpdateFromData createDistributionKeyUpdateFromData() {
        return new DistributionKeyUpdateFromData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetDiscountAsPercentResponse }
     * 
     */
    public CurrentInvoiceLineSetDiscountAsPercentResponse createCurrentInvoiceLineSetDiscountAsPercentResponse() {
        return new CurrentInvoiceLineSetDiscountAsPercentResponse();
    }

    /**
     * Create an instance of {@link AccountCreateFromDataResponse }
     * 
     */
    public AccountCreateFromDataResponse createAccountCreateFromDataResponse() {
        return new AccountCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link ProductFindByNameResponse }
     * 
     */
    public ProductFindByNameResponse createProductFindByNameResponse() {
        return new ProductFindByNameResponse();
    }

    /**
     * Create an instance of {@link QuotationSetPublicEntryNumberResponse }
     * 
     */
    public QuotationSetPublicEntryNumberResponse createQuotationSetPublicEntryNumberResponse() {
        return new QuotationSetPublicEntryNumberResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetEndDate }
     * 
     */
    public CashBookEntryGetEndDate createCashBookEntryGetEndDate() {
        return new CashBookEntryGetEndDate();
    }

    /**
     * Create an instance of {@link DebtorFindByNumberList }
     * 
     */
    public DebtorFindByNumberList createDebtorFindByNumberList() {
        return new DebtorFindByNumberList();
    }

    /**
     * Create an instance of {@link OrderSetDebtorCityResponse }
     * 
     */
    public OrderSetDebtorCityResponse createOrderSetDebtorCityResponse() {
        return new OrderSetDebtorCityResponse();
    }

    /**
     * Create an instance of {@link PriceGroupGetNumber }
     * 
     */
    public PriceGroupGetNumber createPriceGroupGetNumber() {
        return new PriceGroupGetNumber();
    }

    /**
     * Create an instance of {@link EntryGetDocumentResponse }
     * 
     */
    public EntryGetDocumentResponse createEntryGetDocumentResponse() {
        return new EntryGetDocumentResponse();
    }

    /**
     * Create an instance of {@link EmployeeGroupUpdateFromData }
     * 
     */
    public EmployeeGroupUpdateFromData createEmployeeGroupUpdateFromData() {
        return new EmployeeGroupUpdateFromData();
    }

    /**
     * Create an instance of {@link EmployeeGroupData }
     * 
     */
    public EmployeeGroupData createEmployeeGroupData() {
        return new EmployeeGroupData();
    }

    /**
     * Create an instance of {@link QuotationLineSetProductResponse }
     * 
     */
    public QuotationLineSetProductResponse createQuotationLineSetProductResponse() {
        return new QuotationLineSetProductResponse();
    }

    /**
     * Create an instance of {@link DebtorSetVatNumberResponse }
     * 
     */
    public DebtorSetVatNumberResponse createDebtorSetVatNumberResponse() {
        return new DebtorSetVatNumberResponse();
    }

    /**
     * Create an instance of {@link OrderGetNetAmount }
     * 
     */
    public OrderGetNetAmount createOrderGetNetAmount() {
        return new OrderGetNetAmount();
    }

    /**
     * Create an instance of {@link EmployeeGetSalesPriceByDateResponse }
     * 
     */
    public EmployeeGetSalesPriceByDateResponse createEmployeeGetSalesPriceByDateResponse() {
        return new EmployeeGetSalesPriceByDateResponse();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryCreate }
     * 
     */
    public DocumentArchiveCategoryCreate createDocumentArchiveCategoryCreate() {
        return new DocumentArchiveCategoryCreate();
    }

    /**
     * Create an instance of {@link CreditorGroupGetAll }
     * 
     */
    public CreditorGroupGetAll createCreditorGroupGetAll() {
        return new CreditorGroupGetAll();
    }

    /**
     * Create an instance of {@link CashBookEntryGetTypeResponse }
     * 
     */
    public CashBookEntryGetTypeResponse createCashBookEntryGetTypeResponse() {
        return new CashBookEntryGetTypeResponse();
    }

    /**
     * Create an instance of {@link OrderGetDebtorCityResponse }
     * 
     */
    public OrderGetDebtorCityResponse createOrderGetDebtorCityResponse() {
        return new OrderGetDebtorCityResponse();
    }

    /**
     * Create an instance of {@link DebtorEntryFindByInvoiceNumberResponse }
     * 
     */
    public DebtorEntryFindByInvoiceNumberResponse createDebtorEntryFindByInvoiceNumberResponse() {
        return new DebtorEntryFindByInvoiceNumberResponse();
    }

    /**
     * Create an instance of {@link AccountGetDataArray }
     * 
     */
    public AccountGetDataArray createAccountGetDataArray() {
        return new AccountGetDataArray();
    }

    /**
     * Create an instance of {@link MileageEntryGetDateResponse }
     * 
     */
    public MileageEntryGetDateResponse createMileageEntryGetDateResponse() {
        return new MileageEntryGetDateResponse();
    }

    /**
     * Create an instance of {@link QuotationGetLayout }
     * 
     */
    public QuotationGetLayout createQuotationGetLayout() {
        return new QuotationGetLayout();
    }

    /**
     * Create an instance of {@link DebtorContactCreateFromData }
     * 
     */
    public DebtorContactCreateFromData createDebtorContactCreateFromData() {
        return new DebtorContactCreateFromData();
    }

    /**
     * Create an instance of {@link AccountingPeriodGetAll }
     * 
     */
    public AccountingPeriodGetAll createAccountingPeriodGetAll() {
        return new AccountingPeriodGetAll();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineCreateResponse }
     * 
     */
    public CurrentSupplierInvoiceLineCreateResponse createCurrentSupplierInvoiceLineCreateResponse() {
        return new CurrentSupplierInvoiceLineCreateResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetOurReferenceResponse }
     * 
     */
    public CurrentInvoiceSetOurReferenceResponse createCurrentInvoiceSetOurReferenceResponse() {
        return new CurrentInvoiceSetOurReferenceResponse();
    }

    /**
     * Create an instance of {@link CreditorSetVatZoneResponse }
     * 
     */
    public CreditorSetVatZoneResponse createCreditorSetVatZoneResponse() {
        return new CreditorSetVatZoneResponse();
    }

    /**
     * Create an instance of {@link CreditorGetEntriesByVoucherNoAndInvoiceNoResponse }
     * 
     */
    public CreditorGetEntriesByVoucherNoAndInvoiceNoResponse createCreditorGetEntriesByVoucherNoAndInvoiceNoResponse() {
        return new CreditorGetEntriesByVoucherNoAndInvoiceNoResponse();
    }

    /**
     * Create an instance of {@link ProjectGetMainProjectResponse }
     * 
     */
    public ProjectGetMainProjectResponse createProjectGetMainProjectResponse() {
        return new ProjectGetMainProjectResponse();
    }

    /**
     * Create an instance of {@link DebtorEntryMatchEntriesResponse }
     * 
     */
    public DebtorEntryMatchEntriesResponse createDebtorEntryMatchEntriesResponse() {
        return new DebtorEntryMatchEntriesResponse();
    }

    /**
     * Create an instance of {@link QuotationLineSetDescriptionResponse }
     * 
     */
    public QuotationLineSetDescriptionResponse createQuotationLineSetDescriptionResponse() {
        return new QuotationLineSetDescriptionResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineGetInvoice }
     * 
     */
    public CurrentSupplierInvoiceLineGetInvoice createCurrentSupplierInvoiceLineGetInvoice() {
        return new CurrentSupplierInvoiceLineGetInvoice();
    }

    /**
     * Create an instance of {@link OrderGetDeliveryCityResponse }
     * 
     */
    public OrderGetDeliveryCityResponse createOrderGetDeliveryCityResponse() {
        return new OrderGetDeliveryCityResponse();
    }

    /**
     * Create an instance of {@link DebtorContactSetEmailResponse }
     * 
     */
    public DebtorContactSetEmailResponse createDebtorContactSetEmailResponse() {
        return new DebtorContactSetEmailResponse();
    }

    /**
     * Create an instance of {@link InvoiceFindByNumber }
     * 
     */
    public InvoiceFindByNumber createInvoiceFindByNumber() {
        return new InvoiceFindByNumber();
    }

    /**
     * Create an instance of {@link BankPaymentTypeFindByNumberList }
     * 
     */
    public BankPaymentTypeFindByNumberList createBankPaymentTypeFindByNumberList() {
        return new BankPaymentTypeFindByNumberList();
    }

    /**
     * Create an instance of {@link CurrencyGetCode }
     * 
     */
    public CurrencyGetCode createCurrencyGetCode() {
        return new CurrencyGetCode();
    }

    /**
     * Create an instance of {@link InvoiceLineGetDataArray }
     * 
     */
    public InvoiceLineGetDataArray createInvoiceLineGetDataArray() {
        return new InvoiceLineGetDataArray();
    }

    /**
     * Create an instance of {@link EmployeeSetGroupResponse }
     * 
     */
    public EmployeeSetGroupResponse createEmployeeSetGroupResponse() {
        return new EmployeeSetGroupResponse();
    }

    /**
     * Create an instance of {@link DepartmentGetAllUpdatedResponse }
     * 
     */
    public DepartmentGetAllUpdatedResponse createDepartmentGetAllUpdatedResponse() {
        return new DepartmentGetAllUpdatedResponse();
    }

    /**
     * Create an instance of {@link AccountingPeriodGetFromDateResponse }
     * 
     */
    public AccountingPeriodGetFromDateResponse createAccountingPeriodGetFromDateResponse() {
        return new AccountingPeriodGetFromDateResponse();
    }

    /**
     * Create an instance of {@link OrderGetDebtorResponse }
     * 
     */
    public OrderGetDebtorResponse createOrderGetDebtorResponse() {
        return new OrderGetDebtorResponse();
    }

    /**
     * Create an instance of {@link QuotationSetDeliveryPostalCodeResponse }
     * 
     */
    public QuotationSetDeliveryPostalCodeResponse createQuotationSetDeliveryPostalCodeResponse() {
        return new QuotationSetDeliveryPostalCodeResponse();
    }

    /**
     * Create an instance of {@link CreditorSetEmail }
     * 
     */
    public CreditorSetEmail createCreditorSetEmail() {
        return new CreditorSetEmail();
    }

    /**
     * Create an instance of {@link CreditorGetPostalCodeResponse }
     * 
     */
    public CreditorGetPostalCodeResponse createCreditorGetPostalCodeResponse() {
        return new CreditorGetPostalCodeResponse();
    }

    /**
     * Create an instance of {@link SubscriptionSetCollection }
     * 
     */
    public SubscriptionSetCollection createSubscriptionSetCollection() {
        return new SubscriptionSetCollection();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineCreateFromDataArray }
     * 
     */
    public CurrentSupplierInvoiceLineCreateFromDataArray createCurrentSupplierInvoiceLineCreateFromDataArray() {
        return new CurrentSupplierInvoiceLineCreateFromDataArray();
    }

    /**
     * Create an instance of {@link CreditorEntryFindBySerialNumberTypeAndInvoiceNumber }
     * 
     */
    public CreditorEntryFindBySerialNumberTypeAndInvoiceNumber createCreditorEntryFindBySerialNumberTypeAndInvoiceNumber() {
        return new CreditorEntryFindBySerialNumberTypeAndInvoiceNumber();
    }

    /**
     * Create an instance of {@link BudgetFigureGetTextResponse }
     * 
     */
    public BudgetFigureGetTextResponse createBudgetFigureGetTextResponse() {
        return new BudgetFigureGetTextResponse();
    }

    /**
     * Create an instance of {@link UnitDelete }
     * 
     */
    public UnitDelete createUnitDelete() {
        return new UnitDelete();
    }

    /**
     * Create an instance of {@link CashBookFindByNameListResponse }
     * 
     */
    public CashBookFindByNameListResponse createCashBookFindByNameListResponse() {
        return new CashBookFindByNameListResponse();
    }

    /**
     * Create an instance of {@link CompanyGetContactResponse }
     * 
     */
    public CompanyGetContactResponse createCompanyGetContactResponse() {
        return new CompanyGetContactResponse();
    }

    /**
     * Create an instance of {@link QuotationDelete }
     * 
     */
    public QuotationDelete createQuotationDelete() {
        return new QuotationDelete();
    }

    /**
     * Create an instance of {@link QuotationGetDebtorEan }
     * 
     */
    public QuotationGetDebtorEan createQuotationGetDebtorEan() {
        return new QuotationGetDebtorEan();
    }

    /**
     * Create an instance of {@link SumIntervalCreateFromDataArray }
     * 
     */
    public SumIntervalCreateFromDataArray createSumIntervalCreateFromDataArray() {
        return new SumIntervalCreateFromDataArray();
    }

    /**
     * Create an instance of {@link DepartmentCreateFromDataArray }
     * 
     */
    public DepartmentCreateFromDataArray createDepartmentCreateFromDataArray() {
        return new DepartmentCreateFromDataArray();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetDistributionKey }
     * 
     */
    public CurrentInvoiceLineGetDistributionKey createCurrentInvoiceLineGetDistributionKey() {
        return new CurrentInvoiceLineGetDistributionKey();
    }

    /**
     * Create an instance of {@link ProductGetDistributionKeyResponse }
     * 
     */
    public ProductGetDistributionKeyResponse createProductGetDistributionKeyResponse() {
        return new ProductGetDistributionKeyResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetUnitNetPrice }
     * 
     */
    public CurrentInvoiceLineSetUnitNetPrice createCurrentInvoiceLineSetUnitNetPrice() {
        return new CurrentInvoiceLineSetUnitNetPrice();
    }

    /**
     * Create an instance of {@link QuotationLineGetDataArray }
     * 
     */
    public QuotationLineGetDataArray createQuotationLineGetDataArray() {
        return new QuotationLineGetDataArray();
    }

    /**
     * Create an instance of {@link CashBookGetDataResponse }
     * 
     */
    public CashBookGetDataResponse createCashBookGetDataResponse() {
        return new CashBookGetDataResponse();
    }

    /**
     * Create an instance of {@link CashBookData }
     * 
     */
    public CashBookData createCashBookData() {
        return new CashBookData();
    }

    /**
     * Create an instance of {@link OrderSetOurReferenceResponse }
     * 
     */
    public OrderSetOurReferenceResponse createOrderSetOurReferenceResponse() {
        return new OrderSetOurReferenceResponse();
    }

    /**
     * Create an instance of {@link DebtorUpdateFromDataArray }
     * 
     */
    public DebtorUpdateFromDataArray createDebtorUpdateFromDataArray() {
        return new DebtorUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryUpdateFromDataResponse }
     * 
     */
    public DocumentArchiveCategoryUpdateFromDataResponse createDocumentArchiveCategoryUpdateFromDataResponse() {
        return new DocumentArchiveCategoryUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link VatAccountUpdateFromData }
     * 
     */
    public VatAccountUpdateFromData createVatAccountUpdateFromData() {
        return new VatAccountUpdateFromData();
    }

    /**
     * Create an instance of {@link QuotationGetCurrency }
     * 
     */
    public QuotationGetCurrency createQuotationGetCurrency() {
        return new QuotationGetCurrency();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineCreateFromDataResponse }
     * 
     */
    public CurrentInvoiceLineCreateFromDataResponse createCurrentInvoiceLineCreateFromDataResponse() {
        return new CurrentInvoiceLineCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link QuotationFindByDateIntervalResponse }
     * 
     */
    public QuotationFindByDateIntervalResponse createQuotationFindByDateIntervalResponse() {
        return new QuotationFindByDateIntervalResponse();
    }

    /**
     * Create an instance of {@link OrderGetDebtorCountry }
     * 
     */
    public OrderGetDebtorCountry createOrderGetDebtorCountry() {
        return new OrderGetDebtorCountry();
    }

    /**
     * Create an instance of {@link AccountGetName }
     * 
     */
    public AccountGetName createAccountGetName() {
        return new AccountGetName();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetNetAmountResponse }
     * 
     */
    public CurrentInvoiceGetNetAmountResponse createCurrentInvoiceGetNetAmountResponse() {
        return new CurrentInvoiceGetNetAmountResponse();
    }

    /**
     * Create an instance of {@link EmployeeGetCostPriceBeforeResponse }
     * 
     */
    public EmployeeGetCostPriceBeforeResponse createEmployeeGetCostPriceBeforeResponse() {
        return new EmployeeGetCostPriceBeforeResponse();
    }

    /**
     * Create an instance of {@link OrderSetDeliveryAddress }
     * 
     */
    public OrderSetDeliveryAddress createOrderSetDeliveryAddress() {
        return new OrderSetDeliveryAddress();
    }

    /**
     * Create an instance of {@link AccountingPeriodGetAllUpdated }
     * 
     */
    public AccountingPeriodGetAllUpdated createAccountingPeriodGetAllUpdated() {
        return new AccountingPeriodGetAllUpdated();
    }

    /**
     * Create an instance of {@link CreditorContactSetTelephoneNumberResponse }
     * 
     */
    public CreditorContactSetTelephoneNumberResponse createCreditorContactSetTelephoneNumberResponse() {
        return new CreditorContactSetTelephoneNumberResponse();
    }

    /**
     * Create an instance of {@link CostTypeGetNumber }
     * 
     */
    public CostTypeGetNumber createCostTypeGetNumber() {
        return new CostTypeGetNumber();
    }

    /**
     * Create an instance of {@link ExtendedVatZoneGetDataResponse }
     * 
     */
    public ExtendedVatZoneGetDataResponse createExtendedVatZoneGetDataResponse() {
        return new ExtendedVatZoneGetDataResponse();
    }

    /**
     * Create an instance of {@link ExtendedVatZoneData }
     * 
     */
    public ExtendedVatZoneData createExtendedVatZoneData() {
        return new ExtendedVatZoneData();
    }

    /**
     * Create an instance of {@link UnitFindByNameResponse }
     * 
     */
    public UnitFindByNameResponse createUnitFindByNameResponse() {
        return new UnitFindByNameResponse();
    }

    /**
     * Create an instance of {@link SubscriberGetAll }
     * 
     */
    public SubscriberGetAll createSubscriberGetAll() {
        return new SubscriberGetAll();
    }

    /**
     * Create an instance of {@link InvoiceFindByDateInterval }
     * 
     */
    public InvoiceFindByDateInterval createInvoiceFindByDateInterval() {
        return new InvoiceFindByDateInterval();
    }

    /**
     * Create an instance of {@link AccountingPeriodGetToDate }
     * 
     */
    public AccountingPeriodGetToDate createAccountingPeriodGetToDate() {
        return new AccountingPeriodGetToDate();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceCreateFromDataResponse }
     * 
     */
    public CurrentSupplierInvoiceCreateFromDataResponse createCurrentSupplierInvoiceCreateFromDataResponse() {
        return new CurrentSupplierInvoiceCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link CreditorGetTermOfPaymentResponse }
     * 
     */
    public CreditorGetTermOfPaymentResponse createCreditorGetTermOfPaymentResponse() {
        return new CreditorGetTermOfPaymentResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetTotalMargin }
     * 
     */
    public OrderLineGetTotalMargin createOrderLineGetTotalMargin() {
        return new OrderLineGetTotalMargin();
    }

    /**
     * Create an instance of {@link CashBookEntryUpdateFromDataArrayResponse }
     * 
     */
    public CashBookEntryUpdateFromDataArrayResponse createCashBookEntryUpdateFromDataArrayResponse() {
        return new CashBookEntryUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link SubscriptionGetNumber }
     * 
     */
    public SubscriptionGetNumber createSubscriptionGetNumber() {
        return new SubscriptionGetNumber();
    }

    /**
     * Create an instance of {@link InvoiceGetOtherReference }
     * 
     */
    public InvoiceGetOtherReference createInvoiceGetOtherReference() {
        return new InvoiceGetOtherReference();
    }

    /**
     * Create an instance of {@link OrderGetDeliveryLocation }
     * 
     */
    public OrderGetDeliveryLocation createOrderGetDeliveryLocation() {
        return new OrderGetDeliveryLocation();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetNetAmount }
     * 
     */
    public CurrentInvoiceGetNetAmount createCurrentInvoiceGetNetAmount() {
        return new CurrentInvoiceGetNetAmount();
    }

    /**
     * Create an instance of {@link EmployeeGroupFindByNumberList }
     * 
     */
    public EmployeeGroupFindByNumberList createEmployeeGroupFindByNumberList() {
        return new EmployeeGroupFindByNumberList();
    }

    /**
     * Create an instance of {@link UnitUpdateFromDataArray }
     * 
     */
    public UnitUpdateFromDataArray createUnitUpdateFromDataArray() {
        return new UnitUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link InvoiceGetVatAmount }
     * 
     */
    public InvoiceGetVatAmount createInvoiceGetVatAmount() {
        return new InvoiceGetVatAmount();
    }

    /**
     * Create an instance of {@link CreditorGetTermOfPayment }
     * 
     */
    public CreditorGetTermOfPayment createCreditorGetTermOfPayment() {
        return new CreditorGetTermOfPayment();
    }

    /**
     * Create an instance of {@link ProductGetNameResponse }
     * 
     */
    public ProductGetNameResponse createProductGetNameResponse() {
        return new ProductGetNameResponse();
    }

    /**
     * Create an instance of {@link DebtorContactSetTelephoneNumberResponse }
     * 
     */
    public DebtorContactSetTelephoneNumberResponse createDebtorContactSetTelephoneNumberResponse() {
        return new DebtorContactSetTelephoneNumberResponse();
    }

    /**
     * Create an instance of {@link CompanySetCountry }
     * 
     */
    public CompanySetCountry createCompanySetCountry() {
        return new CompanySetCountry();
    }

    /**
     * Create an instance of {@link CashBookEntryGetText }
     * 
     */
    public CashBookEntryGetText createCashBookEntryGetText() {
        return new CashBookEntryGetText();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetTextLine1Response }
     * 
     */
    public CurrentInvoiceSetTextLine1Response createCurrentInvoiceSetTextLine1Response() {
        return new CurrentInvoiceSetTextLine1Response();
    }

    /**
     * Create an instance of {@link AccountDelete }
     * 
     */
    public AccountDelete createAccountDelete() {
        return new AccountDelete();
    }

    /**
     * Create an instance of {@link ReportCodeSetFindByNameResponse }
     * 
     */
    public ReportCodeSetFindByNameResponse createReportCodeSetFindByNameResponse() {
        return new ReportCodeSetFindByNameResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetCurrencyResponse }
     * 
     */
    public CashBookEntryGetCurrencyResponse createCashBookEntryGetCurrencyResponse() {
        return new CashBookEntryGetCurrencyResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationCreateFromDataResponse }
     * 
     */
    public DeliveryLocationCreateFromDataResponse createDeliveryLocationCreateFromDataResponse() {
        return new DeliveryLocationCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link KeyFigureCodeFindByNumber }
     * 
     */
    public KeyFigureCodeFindByNumber createKeyFigureCodeFindByNumber() {
        return new KeyFigureCodeFindByNumber();
    }

    /**
     * Create an instance of {@link OrderGetTextLine1 }
     * 
     */
    public OrderGetTextLine1 createOrderGetTextLine1() {
        return new OrderGetTextLine1();
    }

    /**
     * Create an instance of {@link OrderGetTextLine2 }
     * 
     */
    public OrderGetTextLine2 createOrderGetTextLine2() {
        return new OrderGetTextLine2();
    }

    /**
     * Create an instance of {@link QuotationGetAllUpdatedResponse }
     * 
     */
    public QuotationGetAllUpdatedResponse createQuotationGetAllUpdatedResponse() {
        return new QuotationGetAllUpdatedResponse();
    }

    /**
     * Create an instance of {@link QuotationGetOurReference }
     * 
     */
    public QuotationGetOurReference createQuotationGetOurReference() {
        return new QuotationGetOurReference();
    }

    /**
     * Create an instance of {@link SubscriptionGetNumberResponse }
     * 
     */
    public SubscriptionGetNumberResponse createSubscriptionGetNumberResponse() {
        return new SubscriptionGetNumberResponse();
    }

    /**
     * Create an instance of {@link ProductCreateFromDataArrayResponse }
     * 
     */
    public ProductCreateFromDataArrayResponse createProductCreateFromDataArrayResponse() {
        return new ProductCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link OrderSetAttentionResponse }
     * 
     */
    public OrderSetAttentionResponse createOrderSetAttentionResponse() {
        return new OrderSetAttentionResponse();
    }

    /**
     * Create an instance of {@link ProductPriceFindByProductAndCurrencyResponse }
     * 
     */
    public ProductPriceFindByProductAndCurrencyResponse createProductPriceFindByProductAndCurrencyResponse() {
        return new ProductPriceFindByProductAndCurrencyResponse();
    }

    /**
     * Create an instance of {@link AccountGetDebitCreditResponse }
     * 
     */
    public AccountGetDebitCreditResponse createAccountGetDebitCreditResponse() {
        return new AccountGetDebitCreditResponse();
    }

    /**
     * Create an instance of {@link ProjectGetIsAccessibleResponse }
     * 
     */
    public ProjectGetIsAccessibleResponse createProjectGetIsAccessibleResponse() {
        return new ProjectGetIsAccessibleResponse();
    }

    /**
     * Create an instance of {@link DebtorGetName }
     * 
     */
    public DebtorGetName createDebtorGetName() {
        return new DebtorGetName();
    }

    /**
     * Create an instance of {@link OrderRegisterAsSentResponse }
     * 
     */
    public OrderRegisterAsSentResponse createOrderRegisterAsSentResponse() {
        return new OrderRegisterAsSentResponse();
    }

    /**
     * Create an instance of {@link OrderLineSetDepartmentResponse }
     * 
     */
    public OrderLineSetDepartmentResponse createOrderLineSetDepartmentResponse() {
        return new OrderLineSetDepartmentResponse();
    }

    /**
     * Create an instance of {@link EmployeeGetAllResponse }
     * 
     */
    public EmployeeGetAllResponse createEmployeeGetAllResponse() {
        return new EmployeeGetAllResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetUnitNetPriceResponse }
     * 
     */
    public CurrentInvoiceLineGetUnitNetPriceResponse createCurrentInvoiceLineGetUnitNetPriceResponse() {
        return new CurrentInvoiceLineGetUnitNetPriceResponse();
    }

    /**
     * Create an instance of {@link EmployeeSetNameResponse }
     * 
     */
    public EmployeeSetNameResponse createEmployeeSetNameResponse() {
        return new EmployeeSetNameResponse();
    }

    /**
     * Create an instance of {@link DebtorContactFindByExternalIdResponse }
     * 
     */
    public DebtorContactFindByExternalIdResponse createDebtorContactFindByExternalIdResponse() {
        return new DebtorContactFindByExternalIdResponse();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetDataArray }
     * 
     */
    public ScannedDocumentGetDataArray createScannedDocumentGetDataArray() {
        return new ScannedDocumentGetDataArray();
    }

    /**
     * Create an instance of {@link DebtorSetYourReference }
     * 
     */
    public DebtorSetYourReference createDebtorSetYourReference() {
        return new DebtorSetYourReference();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDueDateResponse }
     * 
     */
    public CurrentInvoiceGetDueDateResponse createCurrentInvoiceGetDueDateResponse() {
        return new CurrentInvoiceGetDueDateResponse();
    }

    /**
     * Create an instance of {@link ProductPriceFindByProductAndCurrency }
     * 
     */
    public ProductPriceFindByProductAndCurrency createProductPriceFindByProductAndCurrency() {
        return new ProductPriceFindByProductAndCurrency();
    }

    /**
     * Create an instance of {@link CashBookEntrySetVatAccountResponse }
     * 
     */
    public CashBookEntrySetVatAccountResponse createCashBookEntrySetVatAccountResponse() {
        return new CashBookEntrySetVatAccountResponse();
    }

    /**
     * Create an instance of {@link SubscriptionSetSubscriptionInterval }
     * 
     */
    public SubscriptionSetSubscriptionInterval createSubscriptionSetSubscriptionInterval() {
        return new SubscriptionSetSubscriptionInterval();
    }

    /**
     * Create an instance of {@link EmployeeDelete }
     * 
     */
    public EmployeeDelete createEmployeeDelete() {
        return new EmployeeDelete();
    }

    /**
     * Create an instance of {@link EmployeeGetCutoffDateResponse }
     * 
     */
    public EmployeeGetCutoffDateResponse createEmployeeGetCutoffDateResponse() {
        return new EmployeeGetCutoffDateResponse();
    }

    /**
     * Create an instance of {@link QuotationLineGetData }
     * 
     */
    public QuotationLineGetData createQuotationLineGetData() {
        return new QuotationLineGetData();
    }

    /**
     * Create an instance of {@link ProductPriceGetDataArray }
     * 
     */
    public ProductPriceGetDataArray createProductPriceGetDataArray() {
        return new ProductPriceGetDataArray();
    }

    /**
     * Create an instance of {@link OrderSetOurReference }
     * 
     */
    public OrderSetOurReference createOrderSetOurReference() {
        return new OrderSetOurReference();
    }

    /**
     * Create an instance of {@link EmployeeSetSalesPriceAfter }
     * 
     */
    public EmployeeSetSalesPriceAfter createEmployeeSetSalesPriceAfter() {
        return new EmployeeSetSalesPriceAfter();
    }

    /**
     * Create an instance of {@link QuotationSetOurReference }
     * 
     */
    public QuotationSetOurReference createQuotationSetOurReference() {
        return new QuotationSetOurReference();
    }

    /**
     * Create an instance of {@link CostTypeGetAllUpdatedResponse }
     * 
     */
    public CostTypeGetAllUpdatedResponse createCostTypeGetAllUpdatedResponse() {
        return new CostTypeGetAllUpdatedResponse();
    }

    /**
     * Create an instance of {@link QuotationSetYourReferenceResponse }
     * 
     */
    public QuotationSetYourReferenceResponse createQuotationSetYourReferenceResponse() {
        return new QuotationSetYourReferenceResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetDebtorInvoiceNumber }
     * 
     */
    public CashBookEntryGetDebtorInvoiceNumber createCashBookEntryGetDebtorInvoiceNumber() {
        return new CashBookEntryGetDebtorInvoiceNumber();
    }

    /**
     * Create an instance of {@link CreditorGetCityResponse }
     * 
     */
    public CreditorGetCityResponse createCreditorGetCityResponse() {
        return new CreditorGetCityResponse();
    }

    /**
     * Create an instance of {@link ConnectAsAdministratorWithCustomerNumber }
     * 
     */
    public ConnectAsAdministratorWithCustomerNumber createConnectAsAdministratorWithCustomerNumber() {
        return new ConnectAsAdministratorWithCustomerNumber();
    }

    /**
     * Create an instance of {@link InvoiceGetDeliveryLocation }
     * 
     */
    public InvoiceGetDeliveryLocation createInvoiceGetDeliveryLocation() {
        return new InvoiceGetDeliveryLocation();
    }

    /**
     * Create an instance of {@link CreditorSetVatZone }
     * 
     */
    public CreditorSetVatZone createCreditorSetVatZone() {
        return new CreditorSetVatZone();
    }

    /**
     * Create an instance of {@link MileageEntryGetEndLocationResponse }
     * 
     */
    public MileageEntryGetEndLocationResponse createMileageEntryGetEndLocationResponse() {
        return new MileageEntryGetEndLocationResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetDebtorCity }
     * 
     */
    public InvoiceGetDebtorCity createInvoiceGetDebtorCity() {
        return new InvoiceGetDebtorCity();
    }

    /**
     * Create an instance of {@link Disconnect }
     * 
     */
    public Disconnect createDisconnect() {
        return new Disconnect();
    }

    /**
     * Create an instance of {@link SubscriberSetPriceIndex }
     * 
     */
    public SubscriberSetPriceIndex createSubscriberSetPriceIndex() {
        return new SubscriberSetPriceIndex();
    }

    /**
     * Create an instance of {@link EmployeeGroupGetDataArrayResponse }
     * 
     */
    public EmployeeGroupGetDataArrayResponse createEmployeeGroupGetDataArrayResponse() {
        return new EmployeeGroupGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEmployeeGroupData }
     * 
     */
    public ArrayOfEmployeeGroupData createArrayOfEmployeeGroupData() {
        return new ArrayOfEmployeeGroupData();
    }

    /**
     * Create an instance of {@link OrderGetDeliveryAddressResponse }
     * 
     */
    public OrderGetDeliveryAddressResponse createOrderGetDeliveryAddressResponse() {
        return new OrderGetDeliveryAddressResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetTotalMarginResponse }
     * 
     */
    public CurrentInvoiceLineGetTotalMarginResponse createCurrentInvoiceLineGetTotalMarginResponse() {
        return new CurrentInvoiceLineGetTotalMarginResponse();
    }

    /**
     * Create an instance of {@link CreditorSetAttentionResponse }
     * 
     */
    public CreditorSetAttentionResponse createCreditorSetAttentionResponse() {
        return new CreditorSetAttentionResponse();
    }

    /**
     * Create an instance of {@link DebtorContactGetIsToReceiveEmailCopyOfOrder }
     * 
     */
    public DebtorContactGetIsToReceiveEmailCopyOfOrder createDebtorContactGetIsToReceiveEmailCopyOfOrder() {
        return new DebtorContactGetIsToReceiveEmailCopyOfOrder();
    }

    /**
     * Create an instance of {@link DebtorGetVatZone }
     * 
     */
    public DebtorGetVatZone createDebtorGetVatZone() {
        return new DebtorGetVatZone();
    }

    /**
     * Create an instance of {@link MileageEntrySetEmployee }
     * 
     */
    public MileageEntrySetEmployee createMileageEntrySetEmployee() {
        return new MileageEntrySetEmployee();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetDataArray }
     * 
     */
    public TermOfPaymentGetDataArray createTermOfPaymentGetDataArray() {
        return new TermOfPaymentGetDataArray();
    }

    /**
     * Create an instance of {@link AccountingPeriodGetDataArrayResponse }
     * 
     */
    public AccountingPeriodGetDataArrayResponse createAccountingPeriodGetDataArrayResponse() {
        return new AccountingPeriodGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAccountingPeriodData }
     * 
     */
    public ArrayOfAccountingPeriodData createArrayOfAccountingPeriodData() {
        return new ArrayOfAccountingPeriodData();
    }

    /**
     * Create an instance of {@link DebtorGetWebsiteResponse }
     * 
     */
    public DebtorGetWebsiteResponse createDebtorGetWebsiteResponse() {
        return new DebtorGetWebsiteResponse();
    }

    /**
     * Create an instance of {@link CreditorEntryGetDate }
     * 
     */
    public CreditorEntryGetDate createCreditorEntryGetDate() {
        return new CreditorEntryGetDate();
    }

    /**
     * Create an instance of {@link CreditorEntryGetData }
     * 
     */
    public CreditorEntryGetData createCreditorEntryGetData() {
        return new CreditorEntryGetData();
    }

    /**
     * Create an instance of {@link CompanyGetData }
     * 
     */
    public CompanyGetData createCompanyGetData() {
        return new CompanyGetData();
    }

    /**
     * Create an instance of {@link QuotationCreateResponse }
     * 
     */
    public QuotationCreateResponse createQuotationCreateResponse() {
        return new QuotationCreateResponse();
    }

    /**
     * Create an instance of {@link BankPaymentTypeFindByNumberListResponse }
     * 
     */
    public BankPaymentTypeFindByNumberListResponse createBankPaymentTypeFindByNumberListResponse() {
        return new BankPaymentTypeFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link OrderSetDeliveryCountryResponse }
     * 
     */
    public OrderSetDeliveryCountryResponse createOrderSetDeliveryCountryResponse() {
        return new OrderSetDeliveryCountryResponse();
    }

    /**
     * Create an instance of {@link QuotationGetTermsOfDelivery }
     * 
     */
    public QuotationGetTermsOfDelivery createQuotationGetTermsOfDelivery() {
        return new QuotationGetTermsOfDelivery();
    }

    /**
     * Create an instance of {@link EntryGetText }
     * 
     */
    public EntryGetText createEntryGetText() {
        return new EntryGetText();
    }

    /**
     * Create an instance of {@link ActivityGetName }
     * 
     */
    public ActivityGetName createActivityGetName() {
        return new ActivityGetName();
    }

    /**
     * Create an instance of {@link ProductGroupCreateResponse }
     * 
     */
    public ProductGroupCreateResponse createProductGroupCreateResponse() {
        return new ProductGroupCreateResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetProduct }
     * 
     */
    public OrderLineGetProduct createOrderLineGetProduct() {
        return new OrderLineGetProduct();
    }

    /**
     * Create an instance of {@link UnitFindByNumberResponse }
     * 
     */
    public UnitFindByNumberResponse createUnitFindByNumberResponse() {
        return new UnitFindByNumberResponse();
    }

    /**
     * Create an instance of {@link OrderSetDeliveryCountyResponse }
     * 
     */
    public OrderSetDeliveryCountyResponse createOrderSetDeliveryCountyResponse() {
        return new OrderSetDeliveryCountyResponse();
    }

    /**
     * Create an instance of {@link UnitSetName }
     * 
     */
    public UnitSetName createUnitSetName() {
        return new UnitSetName();
    }

    /**
     * Create an instance of {@link CostTypeGroupGetAll }
     * 
     */
    public CostTypeGroupGetAll createCostTypeGroupGetAll() {
        return new CostTypeGroupGetAll();
    }

    /**
     * Create an instance of {@link CostTypeGroupGetName }
     * 
     */
    public CostTypeGroupGetName createCostTypeGroupGetName() {
        return new CostTypeGroupGetName();
    }

    /**
     * Create an instance of {@link AccountFindByNameResponse }
     * 
     */
    public AccountFindByNameResponse createAccountFindByNameResponse() {
        return new AccountFindByNameResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDebtorEan }
     * 
     */
    public CurrentInvoiceSetDebtorEan createCurrentInvoiceSetDebtorEan() {
        return new CurrentInvoiceSetDebtorEan();
    }

    /**
     * Create an instance of {@link OrderCreateFromDataArray }
     * 
     */
    public OrderCreateFromDataArray createOrderCreateFromDataArray() {
        return new OrderCreateFromDataArray();
    }

    /**
     * Create an instance of {@link CreditorGetEmail }
     * 
     */
    public CreditorGetEmail createCreditorGetEmail() {
        return new CreditorGetEmail();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetYourReference }
     * 
     */
    public CurrentInvoiceGetYourReference createCurrentInvoiceGetYourReference() {
        return new CurrentInvoiceGetYourReference();
    }

    /**
     * Create an instance of {@link BudgetFigureSetAmountDefaultCurrency }
     * 
     */
    public BudgetFigureSetAmountDefaultCurrency createBudgetFigureSetAmountDefaultCurrency() {
        return new BudgetFigureSetAmountDefaultCurrency();
    }

    /**
     * Create an instance of {@link TimeEntryGetActivity }
     * 
     */
    public TimeEntryGetActivity createTimeEntryGetActivity() {
        return new TimeEntryGetActivity();
    }

    /**
     * Create an instance of {@link MileageEntryCreateFromData }
     * 
     */
    public MileageEntryCreateFromData createMileageEntryCreateFromData() {
        return new MileageEntryCreateFromData();
    }

    /**
     * Create an instance of {@link MileageEntryData }
     * 
     */
    public MileageEntryData createMileageEntryData() {
        return new MileageEntryData();
    }

    /**
     * Create an instance of {@link SumIntervalUpdateFromDataArray }
     * 
     */
    public SumIntervalUpdateFromDataArray createSumIntervalUpdateFromDataArray() {
        return new SumIntervalUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link EmployeeGetCutoffDate }
     * 
     */
    public EmployeeGetCutoffDate createEmployeeGetCutoffDate() {
        return new EmployeeGetCutoffDate();
    }

    /**
     * Create an instance of {@link SubscriberCreateFromDataArray }
     * 
     */
    public SubscriberCreateFromDataArray createSubscriberCreateFromDataArray() {
        return new SubscriberCreateFromDataArray();
    }

    /**
     * Create an instance of {@link CreditorGetVatZone }
     * 
     */
    public CreditorGetVatZone createCreditorGetVatZone() {
        return new CreditorGetVatZone();
    }

    /**
     * Create an instance of {@link ProductSetRecommendedPrice }
     * 
     */
    public ProductSetRecommendedPrice createProductSetRecommendedPrice() {
        return new ProductSetRecommendedPrice();
    }

    /**
     * Create an instance of {@link EmployeeGetAll }
     * 
     */
    public EmployeeGetAll createEmployeeGetAll() {
        return new EmployeeGetAll();
    }

    /**
     * Create an instance of {@link ProductGetBarCodeResponse }
     * 
     */
    public ProductGetBarCodeResponse createProductGetBarCodeResponse() {
        return new ProductGetBarCodeResponse();
    }

    /**
     * Create an instance of {@link CashBookEntrySetDistributionKeyResponse }
     * 
     */
    public CashBookEntrySetDistributionKeyResponse createCashBookEntrySetDistributionKeyResponse() {
        return new CashBookEntrySetDistributionKeyResponse();
    }

    /**
     * Create an instance of {@link CashBookGetNextVoucherNumberResponse }
     * 
     */
    public CashBookGetNextVoucherNumberResponse createCashBookGetNextVoucherNumberResponse() {
        return new CashBookGetNextVoucherNumberResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDebtorCountryResponse }
     * 
     */
    public CurrentInvoiceGetDebtorCountryResponse createCurrentInvoiceGetDebtorCountryResponse() {
        return new CurrentInvoiceGetDebtorCountryResponse();
    }

    /**
     * Create an instance of {@link InventoryLocationGetDataResponse }
     * 
     */
    public InventoryLocationGetDataResponse createInventoryLocationGetDataResponse() {
        return new InventoryLocationGetDataResponse();
    }

    /**
     * Create an instance of {@link InventoryLocationData }
     * 
     */
    public InventoryLocationData createInventoryLocationData() {
        return new InventoryLocationData();
    }

    /**
     * Create an instance of {@link AccountingPeriodGetToDateResponse }
     * 
     */
    public AccountingPeriodGetToDateResponse createAccountingPeriodGetToDateResponse() {
        return new AccountingPeriodGetToDateResponse();
    }

    /**
     * Create an instance of {@link SubscriptionGetSubscribersResponse }
     * 
     */
    public SubscriptionGetSubscribersResponse createSubscriptionGetSubscribersResponse() {
        return new SubscriptionGetSubscribersResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureCreateFromDataResponse }
     * 
     */
    public BudgetFigureCreateFromDataResponse createBudgetFigureCreateFromDataResponse() {
        return new BudgetFigureCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationSetTermsOfDelivery }
     * 
     */
    public DeliveryLocationSetTermsOfDelivery createDeliveryLocationSetTermsOfDelivery() {
        return new DeliveryLocationSetTermsOfDelivery();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetContraAccount2 }
     * 
     */
    public TermOfPaymentGetContraAccount2 createTermOfPaymentGetContraAccount2() {
        return new TermOfPaymentGetContraAccount2();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDeductionAmountResponse }
     * 
     */
    public CurrentInvoiceGetDeductionAmountResponse createCurrentInvoiceGetDeductionAmountResponse() {
        return new CurrentInvoiceGetDeductionAmountResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceCreateFromData }
     * 
     */
    public CurrentSupplierInvoiceCreateFromData createCurrentSupplierInvoiceCreateFromData() {
        return new CurrentSupplierInvoiceCreateFromData();
    }

    /**
     * Create an instance of {@link CreditorContactUpdateFromData }
     * 
     */
    public CreditorContactUpdateFromData createCreditorContactUpdateFromData() {
        return new CreditorContactUpdateFromData();
    }

    /**
     * Create an instance of {@link TermOfPaymentUpdateFromDataArrayResponse }
     * 
     */
    public TermOfPaymentUpdateFromDataArrayResponse createTermOfPaymentUpdateFromDataArrayResponse() {
        return new TermOfPaymentUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link DebtorGetInvoices }
     * 
     */
    public DebtorGetInvoices createDebtorGetInvoices() {
        return new DebtorGetInvoices();
    }

    /**
     * Create an instance of {@link ProductGetDistributionKey }
     * 
     */
    public ProductGetDistributionKey createProductGetDistributionKey() {
        return new ProductGetDistributionKey();
    }

    /**
     * Create an instance of {@link CreditorSetBankAccount }
     * 
     */
    public CreditorSetBankAccount createCreditorSetBankAccount() {
        return new CreditorSetBankAccount();
    }

    /**
     * Create an instance of {@link CreditorEntryFindBySerialNumberResponse }
     * 
     */
    public CreditorEntryFindBySerialNumberResponse createCreditorEntryFindBySerialNumberResponse() {
        return new CreditorEntryFindBySerialNumberResponse();
    }

    /**
     * Create an instance of {@link BankPaymentTypeGetDataArray }
     * 
     */
    public BankPaymentTypeGetDataArray createBankPaymentTypeGetDataArray() {
        return new BankPaymentTypeGetDataArray();
    }

    /**
     * Create an instance of {@link InvoiceFindByOrderNumber }
     * 
     */
    public InvoiceFindByOrderNumber createInvoiceFindByOrderNumber() {
        return new InvoiceFindByOrderNumber();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetDepartment }
     * 
     */
    public SubscriptionLineGetDepartment createSubscriptionLineGetDepartment() {
        return new SubscriptionLineGetDepartment();
    }

    /**
     * Create an instance of {@link OrderUpdateFromDataArray }
     * 
     */
    public OrderUpdateFromDataArray createOrderUpdateFromDataArray() {
        return new OrderUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link CashBookFindByNumberResponse }
     * 
     */
    public CashBookFindByNumberResponse createCashBookFindByNumberResponse() {
        return new CashBookFindByNumberResponse();
    }

    /**
     * Create an instance of {@link DebtorEntryGetVoucherNumberResponse }
     * 
     */
    public DebtorEntryGetVoucherNumberResponse createDebtorEntryGetVoucherNumberResponse() {
        return new DebtorEntryGetVoucherNumberResponse();
    }

    /**
     * Create an instance of {@link AccountGetBudgetFiguresByDateResponse }
     * 
     */
    public AccountGetBudgetFiguresByDateResponse createAccountGetBudgetFiguresByDateResponse() {
        return new AccountGetBudgetFiguresByDateResponse();
    }

    /**
     * Create an instance of {@link DebtorSetCINumber }
     * 
     */
    public DebtorSetCINumber createDebtorSetCINumber() {
        return new DebtorSetCINumber();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineUpdateFromDataArrayResponse }
     * 
     */
    public CurrentInvoiceLineUpdateFromDataArrayResponse createCurrentInvoiceLineUpdateFromDataArrayResponse() {
        return new CurrentInvoiceLineUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetDeliveryDate }
     * 
     */
    public OrderLineGetDeliveryDate createOrderLineGetDeliveryDate() {
        return new OrderLineGetDeliveryDate();
    }

    /**
     * Create an instance of {@link TermOfPaymentSetDescriptionResponse }
     * 
     */
    public TermOfPaymentSetDescriptionResponse createTermOfPaymentSetDescriptionResponse() {
        return new TermOfPaymentSetDescriptionResponse();
    }

    /**
     * Create an instance of {@link QuotationGetCurrencyResponse }
     * 
     */
    public QuotationGetCurrencyResponse createQuotationGetCurrencyResponse() {
        return new QuotationGetCurrencyResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetTextLine1Response }
     * 
     */
    public InvoiceGetTextLine1Response createInvoiceGetTextLine1Response() {
        return new InvoiceGetTextLine1Response();
    }

    /**
     * Create an instance of {@link AccountSetTotalFrom }
     * 
     */
    public AccountSetTotalFrom createAccountSetTotalFrom() {
        return new AccountSetTotalFrom();
    }

    /**
     * Create an instance of {@link ProductPriceGetPriceResponse }
     * 
     */
    public ProductPriceGetPriceResponse createProductPriceGetPriceResponse() {
        return new ProductPriceGetPriceResponse();
    }

    /**
     * Create an instance of {@link ProductPriceGetProductResponse }
     * 
     */
    public ProductPriceGetProductResponse createProductPriceGetProductResponse() {
        return new ProductPriceGetProductResponse();
    }

    /**
     * Create an instance of {@link AccountUpdateFromDataResponse }
     * 
     */
    public AccountUpdateFromDataResponse createAccountUpdateFromDataResponse() {
        return new AccountUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetDataArrayResponse }
     * 
     */
    public CashBookEntryGetDataArrayResponse createCashBookEntryGetDataArrayResponse() {
        return new CashBookEntryGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link AccountingYearGetPeriods }
     * 
     */
    public AccountingYearGetPeriods createAccountingYearGetPeriods() {
        return new AccountingYearGetPeriods();
    }

    /**
     * Create an instance of {@link DebtorSetName }
     * 
     */
    public DebtorSetName createDebtorSetName() {
        return new DebtorSetName();
    }

    /**
     * Create an instance of {@link DeliveryLocationSetPostalCodeResponse }
     * 
     */
    public DeliveryLocationSetPostalCodeResponse createDeliveryLocationSetPostalCodeResponse() {
        return new DeliveryLocationSetPostalCodeResponse();
    }

    /**
     * Create an instance of {@link EmployeeGroupGetDataResponse }
     * 
     */
    public EmployeeGroupGetDataResponse createEmployeeGroupGetDataResponse() {
        return new EmployeeGroupGetDataResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetDataResponse }
     * 
     */
    public OrderLineGetDataResponse createOrderLineGetDataResponse() {
        return new OrderLineGetDataResponse();
    }

    /**
     * Create an instance of {@link TemplateCollectionGetNameResponse }
     * 
     */
    public TemplateCollectionGetNameResponse createTemplateCollectionGetNameResponse() {
        return new TemplateCollectionGetNameResponse();
    }

    /**
     * Create an instance of {@link CreditorSetIsAccessible }
     * 
     */
    public CreditorSetIsAccessible createCreditorSetIsAccessible() {
        return new CreditorSetIsAccessible();
    }

    /**
     * Create an instance of {@link OrderGetLayoutResponse }
     * 
     */
    public OrderGetLayoutResponse createOrderGetLayoutResponse() {
        return new OrderGetLayoutResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetIsVatIncluded }
     * 
     */
    public CurrentInvoiceSetIsVatIncluded createCurrentInvoiceSetIsVatIncluded() {
        return new CurrentInvoiceSetIsVatIncluded();
    }

    /**
     * Create an instance of {@link ProjectSetIsAccessible }
     * 
     */
    public ProjectSetIsAccessible createProjectSetIsAccessible() {
        return new ProjectSetIsAccessible();
    }

    /**
     * Create an instance of {@link PriceGroupUpdateFromData }
     * 
     */
    public PriceGroupUpdateFromData createPriceGroupUpdateFromData() {
        return new PriceGroupUpdateFromData();
    }

    /**
     * Create an instance of {@link CreditorGetOurReferenceResponse }
     * 
     */
    public CreditorGetOurReferenceResponse createCreditorGetOurReferenceResponse() {
        return new CreditorGetOurReferenceResponse();
    }

    /**
     * Create an instance of {@link OrderGetYourReferenceResponse }
     * 
     */
    public OrderGetYourReferenceResponse createOrderGetYourReferenceResponse() {
        return new OrderGetYourReferenceResponse();
    }

    /**
     * Create an instance of {@link ConnectAsAdministratorWithCustomerNumberResponse }
     * 
     */
    public ConnectAsAdministratorWithCustomerNumberResponse createConnectAsAdministratorWithCustomerNumberResponse() {
        return new ConnectAsAdministratorWithCustomerNumberResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDebtorName }
     * 
     */
    public CurrentInvoiceSetDebtorName createCurrentInvoiceSetDebtorName() {
        return new CurrentInvoiceSetDebtorName();
    }

    /**
     * Create an instance of {@link DistributionKeyGetDataArray }
     * 
     */
    public DistributionKeyGetDataArray createDistributionKeyGetDataArray() {
        return new DistributionKeyGetDataArray();
    }

    /**
     * Create an instance of {@link InvoiceLineGetProduct }
     * 
     */
    public InvoiceLineGetProduct createInvoiceLineGetProduct() {
        return new InvoiceLineGetProduct();
    }

    /**
     * Create an instance of {@link TimeEntryCreateResponse }
     * 
     */
    public TimeEntryCreateResponse createTimeEntryCreateResponse() {
        return new TimeEntryCreateResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureGetData }
     * 
     */
    public BudgetFigureGetData createBudgetFigureGetData() {
        return new BudgetFigureGetData();
    }

    /**
     * Create an instance of {@link PriceGroupCreateFromDataResponse }
     * 
     */
    public PriceGroupCreateFromDataResponse createPriceGroupCreateFromDataResponse() {
        return new PriceGroupCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link QuotationGetAllResponse }
     * 
     */
    public QuotationGetAllResponse createQuotationGetAllResponse() {
        return new QuotationGetAllResponse();
    }

    /**
     * Create an instance of {@link CashBookEntrySetProjectAndCostType }
     * 
     */
    public CashBookEntrySetProjectAndCostType createCashBookEntrySetProjectAndCostType() {
        return new CashBookEntrySetProjectAndCostType();
    }

    /**
     * Create an instance of {@link ProductSetDepartmentResponse }
     * 
     */
    public ProductSetDepartmentResponse createProductSetDepartmentResponse() {
        return new ProductSetDepartmentResponse();
    }

    /**
     * Create an instance of {@link ProductCreate }
     * 
     */
    public ProductCreate createProductCreate() {
        return new ProductCreate();
    }

    /**
     * Create an instance of {@link DistributionKeyGetDepartmentsResponse }
     * 
     */
    public DistributionKeyGetDepartmentsResponse createDistributionKeyGetDepartmentsResponse() {
        return new DistributionKeyGetDepartmentsResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineFindByInvoiceNumberIntervalResponse }
     * 
     */
    public InvoiceLineFindByInvoiceNumberIntervalResponse createInvoiceLineFindByInvoiceNumberIntervalResponse() {
        return new InvoiceLineFindByInvoiceNumberIntervalResponse();
    }

    /**
     * Create an instance of {@link CashBookEntrySetAmountDefaultCurrency }
     * 
     */
    public CashBookEntrySetAmountDefaultCurrency createCashBookEntrySetAmountDefaultCurrency() {
        return new CashBookEntrySetAmountDefaultCurrency();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceGetId }
     * 
     */
    public CurrentSupplierInvoiceGetId createCurrentSupplierInvoiceGetId() {
        return new CurrentSupplierInvoiceGetId();
    }

    /**
     * Create an instance of {@link DebtorContactGetTelephoneNumber }
     * 
     */
    public DebtorContactGetTelephoneNumber createDebtorContactGetTelephoneNumber() {
        return new DebtorContactGetTelephoneNumber();
    }

    /**
     * Create an instance of {@link DebtorGetCreditMaximumResponse }
     * 
     */
    public DebtorGetCreditMaximumResponse createDebtorGetCreditMaximumResponse() {
        return new DebtorGetCreditMaximumResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetEndDateResponse }
     * 
     */
    public CashBookEntryGetEndDateResponse createCashBookEntryGetEndDateResponse() {
        return new CashBookEntryGetEndDateResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetVoucherNumberResponse }
     * 
     */
    public CashBookEntryGetVoucherNumberResponse createCashBookEntryGetVoucherNumberResponse() {
        return new CashBookEntryGetVoucherNumberResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineGetUnitNetPrice }
     * 
     */
    public InvoiceLineGetUnitNetPrice createInvoiceLineGetUnitNetPrice() {
        return new InvoiceLineGetUnitNetPrice();
    }

    /**
     * Create an instance of {@link MileageEntryGetSalesRate }
     * 
     */
    public MileageEntryGetSalesRate createMileageEntryGetSalesRate() {
        return new MileageEntryGetSalesRate();
    }

    /**
     * Create an instance of {@link CostTypeGroupGetAllResponse }
     * 
     */
    public CostTypeGroupGetAllResponse createCostTypeGroupGetAllResponse() {
        return new CostTypeGroupGetAllResponse();
    }

    /**
     * Create an instance of {@link AccountGetTypeResponse }
     * 
     */
    public AccountGetTypeResponse createAccountGetTypeResponse() {
        return new AccountGetTypeResponse();
    }

    /**
     * Create an instance of {@link CashBookEntrySetDepartment }
     * 
     */
    public CashBookEntrySetDepartment createCashBookEntrySetDepartment() {
        return new CashBookEntrySetDepartment();
    }

    /**
     * Create an instance of {@link CurrentInvoiceUpdateFromDataResponse }
     * 
     */
    public CurrentInvoiceUpdateFromDataResponse createCurrentInvoiceUpdateFromDataResponse() {
        return new CurrentInvoiceUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link CompanySetEmail }
     * 
     */
    public CompanySetEmail createCompanySetEmail() {
        return new CompanySetEmail();
    }

    /**
     * Create an instance of {@link EntryGetVoucherNumber }
     * 
     */
    public EntryGetVoucherNumber createEntryGetVoucherNumber() {
        return new EntryGetVoucherNumber();
    }

    /**
     * Create an instance of {@link CreditorContactGetEmail }
     * 
     */
    public CreditorContactGetEmail createCreditorContactGetEmail() {
        return new CreditorContactGetEmail();
    }

    /**
     * Create an instance of {@link SubscriberSetQuantityFactorResponse }
     * 
     */
    public SubscriberSetQuantityFactorResponse createSubscriberSetQuantityFactorResponse() {
        return new SubscriberSetQuantityFactorResponse();
    }

    /**
     * Create an instance of {@link KeyFigureCodeGetAccounts }
     * 
     */
    public KeyFigureCodeGetAccounts createKeyFigureCodeGetAccounts() {
        return new KeyFigureCodeGetAccounts();
    }

    /**
     * Create an instance of {@link SubscriberSetExpiryDateResponse }
     * 
     */
    public SubscriberSetExpiryDateResponse createSubscriberSetExpiryDateResponse() {
        return new SubscriberSetExpiryDateResponse();
    }

    /**
     * Create an instance of {@link AccountSetNameResponse }
     * 
     */
    public AccountSetNameResponse createAccountSetNameResponse() {
        return new AccountSetNameResponse();
    }

    /**
     * Create an instance of {@link AccountCreateResponse }
     * 
     */
    public AccountCreateResponse createAccountCreateResponse() {
        return new AccountCreateResponse();
    }

    /**
     * Create an instance of {@link ProductPriceUpdateFromDataArray }
     * 
     */
    public ProductPriceUpdateFromDataArray createProductPriceUpdateFromDataArray() {
        return new ProductPriceUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link UnitGetNumber }
     * 
     */
    public UnitGetNumber createUnitGetNumber() {
        return new UnitGetNumber();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceGetLinesResponse }
     * 
     */
    public CurrentSupplierInvoiceGetLinesResponse createCurrentSupplierInvoiceGetLinesResponse() {
        return new CurrentSupplierInvoiceGetLinesResponse();
    }

    /**
     * Create an instance of {@link CreditorGetDataArray }
     * 
     */
    public CreditorGetDataArray createCreditorGetDataArray() {
        return new CreditorGetDataArray();
    }

    /**
     * Create an instance of {@link SubscriberSetDiscountAsPercentResponse }
     * 
     */
    public SubscriberSetDiscountAsPercentResponse createSubscriberSetDiscountAsPercentResponse() {
        return new SubscriberSetDiscountAsPercentResponse();
    }

    /**
     * Create an instance of {@link AccountingPeriodGetStatus }
     * 
     */
    public AccountingPeriodGetStatus createAccountingPeriodGetStatus() {
        return new AccountingPeriodGetStatus();
    }

    /**
     * Create an instance of {@link DebtorEntryGetDataArrayResponse }
     * 
     */
    public DebtorEntryGetDataArrayResponse createDebtorEntryGetDataArrayResponse() {
        return new DebtorEntryGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDebtorEntryData }
     * 
     */
    public ArrayOfDebtorEntryData createArrayOfDebtorEntryData() {
        return new ArrayOfDebtorEntryData();
    }

    /**
     * Create an instance of {@link DebtorGetLayout }
     * 
     */
    public DebtorGetLayout createDebtorGetLayout() {
        return new DebtorGetLayout();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetProjectResponse }
     * 
     */
    public CurrentInvoiceGetProjectResponse createCurrentInvoiceGetProjectResponse() {
        return new CurrentInvoiceGetProjectResponse();
    }

    /**
     * Create an instance of {@link OrderGetDueDate }
     * 
     */
    public OrderGetDueDate createOrderGetDueDate() {
        return new OrderGetDueDate();
    }

    /**
     * Create an instance of {@link QuotationSetDeliveryDate }
     * 
     */
    public QuotationSetDeliveryDate createQuotationSetDeliveryDate() {
        return new QuotationSetDeliveryDate();
    }

    /**
     * Create an instance of {@link EmployeeGetDataArray }
     * 
     */
    public EmployeeGetDataArray createEmployeeGetDataArray() {
        return new EmployeeGetDataArray();
    }

    /**
     * Create an instance of {@link QuotationLineSetDeliveryDate }
     * 
     */
    public QuotationLineSetDeliveryDate createQuotationLineSetDeliveryDate() {
        return new QuotationLineSetDeliveryDate();
    }

    /**
     * Create an instance of {@link DebtorSetIsAccessible }
     * 
     */
    public DebtorSetIsAccessible createDebtorSetIsAccessible() {
        return new DebtorSetIsAccessible();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetOurReference }
     * 
     */
    public CurrentInvoiceGetOurReference createCurrentInvoiceGetOurReference() {
        return new CurrentInvoiceGetOurReference();
    }

    /**
     * Create an instance of {@link MileageEntryGetDataResponse }
     * 
     */
    public MileageEntryGetDataResponse createMileageEntryGetDataResponse() {
        return new MileageEntryGetDataResponse();
    }

    /**
     * Create an instance of {@link ProductPriceGetDataArrayResponse }
     * 
     */
    public ProductPriceGetDataArrayResponse createProductPriceGetDataArrayResponse() {
        return new ProductPriceGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceGetAll }
     * 
     */
    public CurrentSupplierInvoiceGetAll createCurrentSupplierInvoiceGetAll() {
        return new CurrentSupplierInvoiceGetAll();
    }

    /**
     * Create an instance of {@link BudgetFigureUpdateFromDataResponse }
     * 
     */
    public BudgetFigureUpdateFromDataResponse createBudgetFigureUpdateFromDataResponse() {
        return new BudgetFigureUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link OrderGetMargin }
     * 
     */
    public OrderGetMargin createOrderGetMargin() {
        return new OrderGetMargin();
    }

    /**
     * Create an instance of {@link PriceGroupUpdateFromDataArray }
     * 
     */
    public PriceGroupUpdateFromDataArray createPriceGroupUpdateFromDataArray() {
        return new PriceGroupUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link CreditorEntryFindByInvoiceNumberResponse }
     * 
     */
    public CreditorEntryFindByInvoiceNumberResponse createCreditorEntryFindByInvoiceNumberResponse() {
        return new CreditorEntryFindByInvoiceNumberResponse();
    }

    /**
     * Create an instance of {@link QuotationSetDeliveryCountryResponse }
     * 
     */
    public QuotationSetDeliveryCountryResponse createQuotationSetDeliveryCountryResponse() {
        return new QuotationSetDeliveryCountryResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineFindByProductResponse }
     * 
     */
    public InvoiceLineFindByProductResponse createInvoiceLineFindByProductResponse() {
        return new InvoiceLineFindByProductResponse();
    }

    /**
     * Create an instance of {@link EntryGetDate }
     * 
     */
    public EntryGetDate createEntryGetDate() {
        return new EntryGetDate();
    }

    /**
     * Create an instance of {@link ProjectGetIsClosedResponse }
     * 
     */
    public ProjectGetIsClosedResponse createProjectGetIsClosedResponse() {
        return new ProjectGetIsClosedResponse();
    }

    /**
     * Create an instance of {@link EntryGetData }
     * 
     */
    public EntryGetData createEntryGetData() {
        return new EntryGetData();
    }

    /**
     * Create an instance of {@link EmployeeGroupFindByName }
     * 
     */
    public EmployeeGroupFindByName createEmployeeGroupFindByName() {
        return new EmployeeGroupFindByName();
    }

    /**
     * Create an instance of {@link DebtorGetAllUpdatedResponse }
     * 
     */
    public DebtorGetAllUpdatedResponse createDebtorGetAllUpdatedResponse() {
        return new DebtorGetAllUpdatedResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetProject }
     * 
     */
    public CashBookEntryGetProject createCashBookEntryGetProject() {
        return new CashBookEntryGetProject();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceUpdateFromDataArray }
     * 
     */
    public CurrentSupplierInvoiceUpdateFromDataArray createCurrentSupplierInvoiceUpdateFromDataArray() {
        return new CurrentSupplierInvoiceUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link DebtorEntryGetAmountDefaultCurrency }
     * 
     */
    public DebtorEntryGetAmountDefaultCurrency createDebtorEntryGetAmountDefaultCurrency() {
        return new DebtorEntryGetAmountDefaultCurrency();
    }

    /**
     * Create an instance of {@link BankPaymentTypeGetNumberResponse }
     * 
     */
    public BankPaymentTypeGetNumberResponse createBankPaymentTypeGetNumberResponse() {
        return new BankPaymentTypeGetNumberResponse();
    }

    /**
     * Create an instance of {@link CreditorDelete }
     * 
     */
    public CreditorDelete createCreditorDelete() {
        return new CreditorDelete();
    }

    /**
     * Create an instance of {@link ProductSetIsAccessibleResponse }
     * 
     */
    public ProductSetIsAccessibleResponse createProductSetIsAccessibleResponse() {
        return new ProductSetIsAccessibleResponse();
    }

    /**
     * Create an instance of {@link QuotationSetDate }
     * 
     */
    public QuotationSetDate createQuotationSetDate() {
        return new QuotationSetDate();
    }

    /**
     * Create an instance of {@link CreditorSetAutoContraAccount }
     * 
     */
    public CreditorSetAutoContraAccount createCreditorSetAutoContraAccount() {
        return new CreditorSetAutoContraAccount();
    }

    /**
     * Create an instance of {@link OrderLineGetTotalMarginResponse }
     * 
     */
    public OrderLineGetTotalMarginResponse createOrderLineGetTotalMarginResponse() {
        return new OrderLineGetTotalMarginResponse();
    }

    /**
     * Create an instance of {@link DebtorGetBalanceResponse }
     * 
     */
    public DebtorGetBalanceResponse createDebtorGetBalanceResponse() {
        return new DebtorGetBalanceResponse();
    }

    /**
     * Create an instance of {@link CreditorGetYourReference }
     * 
     */
    public CreditorGetYourReference createCreditorGetYourReference() {
        return new CreditorGetYourReference();
    }

    /**
     * Create an instance of {@link OrderLineGetDistributionKey }
     * 
     */
    public OrderLineGetDistributionKey createOrderLineGetDistributionKey() {
        return new OrderLineGetDistributionKey();
    }

    /**
     * Create an instance of {@link SubscriptionGetCalendarYearBasisResponse }
     * 
     */
    public SubscriptionGetCalendarYearBasisResponse createSubscriptionGetCalendarYearBasisResponse() {
        return new SubscriptionGetCalendarYearBasisResponse();
    }

    /**
     * Create an instance of {@link CreditorEntryGetCreditor }
     * 
     */
    public CreditorEntryGetCreditor createCreditorEntryGetCreditor() {
        return new CreditorEntryGetCreditor();
    }

    /**
     * Create an instance of {@link InvoiceGetDeliveryCityResponse }
     * 
     */
    public InvoiceGetDeliveryCityResponse createInvoiceGetDeliveryCityResponse() {
        return new InvoiceGetDeliveryCityResponse();
    }

    /**
     * Create an instance of {@link QuotationSetLayoutResponse }
     * 
     */
    public QuotationSetLayoutResponse createQuotationSetLayoutResponse() {
        return new QuotationSetLayoutResponse();
    }

    /**
     * Create an instance of {@link CreditorGetBankAccountResponse }
     * 
     */
    public CreditorGetBankAccountResponse createCreditorGetBankAccountResponse() {
        return new CreditorGetBankAccountResponse();
    }

    /**
     * Create an instance of {@link QuotationUpgradeToOrder }
     * 
     */
    public QuotationUpgradeToOrder createQuotationUpgradeToOrder() {
        return new QuotationUpgradeToOrder();
    }

    /**
     * Create an instance of {@link ProjectCreateFromDataArray }
     * 
     */
    public ProjectCreateFromDataArray createProjectCreateFromDataArray() {
        return new ProjectCreateFromDataArray();
    }

    /**
     * Create an instance of {@link QuotationGetDueDate }
     * 
     */
    public QuotationGetDueDate createQuotationGetDueDate() {
        return new QuotationGetDueDate();
    }

    /**
     * Create an instance of {@link ProductSetCostPriceResponse }
     * 
     */
    public ProductSetCostPriceResponse createProductSetCostPriceResponse() {
        return new ProductSetCostPriceResponse();
    }

    /**
     * Create an instance of {@link OrderUpdateFromDataArrayResponse }
     * 
     */
    public OrderUpdateFromDataArrayResponse createOrderUpdateFromDataArrayResponse() {
        return new OrderUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link ProductGroupCreateFromDataArrayResponse }
     * 
     */
    public ProductGroupCreateFromDataArrayResponse createProductGroupCreateFromDataArrayResponse() {
        return new ProductGroupCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CompanyGetTelephoneNumberResponse }
     * 
     */
    public CompanyGetTelephoneNumberResponse createCompanyGetTelephoneNumberResponse() {
        return new CompanyGetTelephoneNumberResponse();
    }

    /**
     * Create an instance of {@link EmployeeGetCostPriceResponse }
     * 
     */
    public EmployeeGetCostPriceResponse createEmployeeGetCostPriceResponse() {
        return new EmployeeGetCostPriceResponse();
    }

    /**
     * Create an instance of {@link DebtorSetTelephoneAndFaxNumberResponse }
     * 
     */
    public DebtorSetTelephoneAndFaxNumberResponse createDebtorSetTelephoneAndFaxNumberResponse() {
        return new DebtorSetTelephoneAndFaxNumberResponse();
    }

    /**
     * Create an instance of {@link ProjectGetNumberResponse }
     * 
     */
    public ProjectGetNumberResponse createProjectGetNumberResponse() {
        return new ProjectGetNumberResponse();
    }

    /**
     * Create an instance of {@link QuotationSetCurrency }
     * 
     */
    public QuotationSetCurrency createQuotationSetCurrency() {
        return new QuotationSetCurrency();
    }

    /**
     * Create an instance of {@link ActivityFindByNumberResponse }
     * 
     */
    public ActivityFindByNumberResponse createActivityFindByNumberResponse() {
        return new ActivityFindByNumberResponse();
    }

    /**
     * Create an instance of {@link UnitCreateFromDataArray }
     * 
     */
    public UnitCreateFromDataArray createUnitCreateFromDataArray() {
        return new UnitCreateFromDataArray();
    }

    /**
     * Create an instance of {@link CashBookEntryGetBankPaymentType }
     * 
     */
    public CashBookEntryGetBankPaymentType createCashBookEntryGetBankPaymentType() {
        return new CashBookEntryGetBankPaymentType();
    }

    /**
     * Create an instance of {@link ProductGroupSetAccountForVatLiableDebtorInvoicesCurrent }
     * 
     */
    public ProductGroupSetAccountForVatLiableDebtorInvoicesCurrent createProductGroupSetAccountForVatLiableDebtorInvoicesCurrent() {
        return new ProductGroupSetAccountForVatLiableDebtorInvoicesCurrent();
    }

    /**
     * Create an instance of {@link EmployeeCreateFromDataResponse }
     * 
     */
    public EmployeeCreateFromDataResponse createEmployeeCreateFromDataResponse() {
        return new EmployeeCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link PriceGroupUpdateFromDataResponse }
     * 
     */
    public PriceGroupUpdateFromDataResponse createPriceGroupUpdateFromDataResponse() {
        return new PriceGroupUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetLines }
     * 
     */
    public CurrentInvoiceGetLines createCurrentInvoiceGetLines() {
        return new CurrentInvoiceGetLines();
    }

    /**
     * Create an instance of {@link PriceGroupGetName }
     * 
     */
    public PriceGroupGetName createPriceGroupGetName() {
        return new PriceGroupGetName();
    }

    /**
     * Create an instance of {@link DeliveryLocationCreateFromData }
     * 
     */
    public DeliveryLocationCreateFromData createDeliveryLocationCreateFromData() {
        return new DeliveryLocationCreateFromData();
    }

    /**
     * Create an instance of {@link QuotationLineGetAllResponse }
     * 
     */
    public QuotationLineGetAllResponse createQuotationLineGetAllResponse() {
        return new QuotationLineGetAllResponse();
    }

    /**
     * Create an instance of {@link CompanyGetCountry }
     * 
     */
    public CompanyGetCountry createCompanyGetCountry() {
        return new CompanyGetCountry();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetProjectResponse }
     * 
     */
    public CurrentInvoiceSetProjectResponse createCurrentInvoiceSetProjectResponse() {
        return new CurrentInvoiceSetProjectResponse();
    }

    /**
     * Create an instance of {@link CashBookEntrySetContraAccountResponse }
     * 
     */
    public CashBookEntrySetContraAccountResponse createCashBookEntrySetContraAccountResponse() {
        return new CashBookEntrySetContraAccountResponse();
    }

    /**
     * Create an instance of {@link SubscriberSetStartDateResponse }
     * 
     */
    public SubscriberSetStartDateResponse createSubscriberSetStartDateResponse() {
        return new SubscriberSetStartDateResponse();
    }

    /**
     * Create an instance of {@link CreditorUpdateFromDataResponse }
     * 
     */
    public CreditorUpdateFromDataResponse createCreditorUpdateFromDataResponse() {
        return new CreditorUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetTermsOfDelivery }
     * 
     */
    public InvoiceGetTermsOfDelivery createInvoiceGetTermsOfDelivery() {
        return new InvoiceGetTermsOfDelivery();
    }

    /**
     * Create an instance of {@link DeliveryLocationSetTermsOfDeliveryResponse }
     * 
     */
    public DeliveryLocationSetTermsOfDeliveryResponse createDeliveryLocationSetTermsOfDeliveryResponse() {
        return new DeliveryLocationSetTermsOfDeliveryResponse();
    }

    /**
     * Create an instance of {@link SumIntervalDelete }
     * 
     */
    public SumIntervalDelete createSumIntervalDelete() {
        return new SumIntervalDelete();
    }

    /**
     * Create an instance of {@link AccountGetDistributionKeyResponse }
     * 
     */
    public AccountGetDistributionKeyResponse createAccountGetDistributionKeyResponse() {
        return new AccountGetDistributionKeyResponse();
    }

    /**
     * Create an instance of {@link TemplateCollectionGetAll }
     * 
     */
    public TemplateCollectionGetAll createTemplateCollectionGetAll() {
        return new TemplateCollectionGetAll();
    }

    /**
     * Create an instance of {@link BudgetFigureGetAllResponse }
     * 
     */
    public BudgetFigureGetAllResponse createBudgetFigureGetAllResponse() {
        return new BudgetFigureGetAllResponse();
    }

    /**
     * Create an instance of {@link CompanyGetNumber }
     * 
     */
    public CompanyGetNumber createCompanyGetNumber() {
        return new CompanyGetNumber();
    }

    /**
     * Create an instance of {@link SubscriptionLineFindByProductList }
     * 
     */
    public SubscriptionLineFindByProductList createSubscriptionLineFindByProductList() {
        return new SubscriptionLineFindByProductList();
    }

    /**
     * Create an instance of {@link InvoiceGetDate }
     * 
     */
    public InvoiceGetDate createInvoiceGetDate() {
        return new InvoiceGetDate();
    }

    /**
     * Create an instance of {@link CashBookEntryDeleteResponse }
     * 
     */
    public CashBookEntryDeleteResponse createCashBookEntryDeleteResponse() {
        return new CashBookEntryDeleteResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetData }
     * 
     */
    public InvoiceGetData createInvoiceGetData() {
        return new InvoiceGetData();
    }

    /**
     * Create an instance of {@link ProjectGetTimeEntriesResponse }
     * 
     */
    public ProjectGetTimeEntriesResponse createProjectGetTimeEntriesResponse() {
        return new ProjectGetTimeEntriesResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentSetContraAccount2 }
     * 
     */
    public TermOfPaymentSetContraAccount2 createTermOfPaymentSetContraAccount2() {
        return new TermOfPaymentSetContraAccount2();
    }

    /**
     * Create an instance of {@link AccountGetBalance }
     * 
     */
    public AccountGetBalance createAccountGetBalance() {
        return new AccountGetBalance();
    }

    /**
     * Create an instance of {@link ProductGroupFindByNumberList }
     * 
     */
    public ProductGroupFindByNumberList createProductGroupFindByNumberList() {
        return new ProductGroupFindByNumberList();
    }

    /**
     * Create an instance of {@link ExtendedVatZoneGetAllResponse }
     * 
     */
    public ExtendedVatZoneGetAllResponse createExtendedVatZoneGetAllResponse() {
        return new ExtendedVatZoneGetAllResponse();
    }

    /**
     * Create an instance of {@link ProductGetInStock }
     * 
     */
    public ProductGetInStock createProductGetInStock() {
        return new ProductGetInStock();
    }

    /**
     * Create an instance of {@link CostTypeFindByName }
     * 
     */
    public CostTypeFindByName createCostTypeFindByName() {
        return new CostTypeFindByName();
    }

    /**
     * Create an instance of {@link QuotationLineDelete }
     * 
     */
    public QuotationLineDelete createQuotationLineDelete() {
        return new QuotationLineDelete();
    }

    /**
     * Create an instance of {@link PriceGroupCreateFromDataArray }
     * 
     */
    public PriceGroupCreateFromDataArray createPriceGroupCreateFromDataArray() {
        return new PriceGroupCreateFromDataArray();
    }

    /**
     * Create an instance of {@link EmployeeSetCostPriceAfter }
     * 
     */
    public EmployeeSetCostPriceAfter createEmployeeSetCostPriceAfter() {
        return new EmployeeSetCostPriceAfter();
    }

    /**
     * Create an instance of {@link EntryGetAmount }
     * 
     */
    public EntryGetAmount createEntryGetAmount() {
        return new EntryGetAmount();
    }

    /**
     * Create an instance of {@link QuotationSetDebtorCityResponse }
     * 
     */
    public QuotationSetDebtorCityResponse createQuotationSetDebtorCityResponse() {
        return new QuotationSetDebtorCityResponse();
    }

    /**
     * Create an instance of {@link MileageEntryCreate }
     * 
     */
    public MileageEntryCreate createMileageEntryCreate() {
        return new MileageEntryCreate();
    }

    /**
     * Create an instance of {@link OrderLineGetNumber }
     * 
     */
    public OrderLineGetNumber createOrderLineGetNumber() {
        return new OrderLineGetNumber();
    }

    /**
     * Create an instance of {@link ProjectGroupGetNumber }
     * 
     */
    public ProjectGroupGetNumber createProjectGroupGetNumber() {
        return new ProjectGroupGetNumber();
    }

    /**
     * Create an instance of {@link OrderGetPublicEntryNumber }
     * 
     */
    public OrderGetPublicEntryNumber createOrderGetPublicEntryNumber() {
        return new OrderGetPublicEntryNumber();
    }

    /**
     * Create an instance of {@link OrderSetDebtorAddressResponse }
     * 
     */
    public OrderSetDebtorAddressResponse createOrderSetDebtorAddressResponse() {
        return new OrderSetDebtorAddressResponse();
    }

    /**
     * Create an instance of {@link AccountSetOpeningAccountResponse }
     * 
     */
    public AccountSetOpeningAccountResponse createAccountSetOpeningAccountResponse() {
        return new AccountSetOpeningAccountResponse();
    }

    /**
     * Create an instance of {@link MileageEntryGetStartLocationResponse }
     * 
     */
    public MileageEntryGetStartLocationResponse createMileageEntryGetStartLocationResponse() {
        return new MileageEntryGetStartLocationResponse();
    }

    /**
     * Create an instance of {@link OrderLineSetDeliveryDate }
     * 
     */
    public OrderLineSetDeliveryDate createOrderLineSetDeliveryDate() {
        return new OrderLineSetDeliveryDate();
    }

    /**
     * Create an instance of {@link OrderGetHeading }
     * 
     */
    public OrderGetHeading createOrderGetHeading() {
        return new OrderGetHeading();
    }

    /**
     * Create an instance of {@link VatAccountUpdateFromDataArray }
     * 
     */
    public VatAccountUpdateFromDataArray createVatAccountUpdateFromDataArray() {
        return new VatAccountUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link QuotationGetAllCurrentResponse }
     * 
     */
    public QuotationGetAllCurrentResponse createQuotationGetAllCurrentResponse() {
        return new QuotationGetAllCurrentResponse();
    }

    /**
     * Create an instance of {@link ProductGetCostPrice }
     * 
     */
    public ProductGetCostPrice createProductGetCostPrice() {
        return new ProductGetCostPrice();
    }

    /**
     * Create an instance of {@link CashBookEntrySetAmount }
     * 
     */
    public CashBookEntrySetAmount createCashBookEntrySetAmount() {
        return new CashBookEntrySetAmount();
    }

    /**
     * Create an instance of {@link DebtorDelete }
     * 
     */
    public DebtorDelete createDebtorDelete() {
        return new DebtorDelete();
    }

    /**
     * Create an instance of {@link InvoiceGetYourReference }
     * 
     */
    public InvoiceGetYourReference createInvoiceGetYourReference() {
        return new InvoiceGetYourReference();
    }

    /**
     * Create an instance of {@link DebtorGroupGetNumberResponse }
     * 
     */
    public DebtorGroupGetNumberResponse createDebtorGroupGetNumberResponse() {
        return new DebtorGroupGetNumberResponse();
    }

    /**
     * Create an instance of {@link CreditorCreate }
     * 
     */
    public CreditorCreate createCreditorCreate() {
        return new CreditorCreate();
    }

    /**
     * Create an instance of {@link InventoryLocationFindByNumber }
     * 
     */
    public InventoryLocationFindByNumber createInventoryLocationFindByNumber() {
        return new InventoryLocationFindByNumber();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryUpdateFromDataArray }
     * 
     */
    public DocumentArchiveCategoryUpdateFromDataArray createDocumentArchiveCategoryUpdateFromDataArray() {
        return new DocumentArchiveCategoryUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link InvoiceGetProjectResponse }
     * 
     */
    public InvoiceGetProjectResponse createInvoiceGetProjectResponse() {
        return new InvoiceGetProjectResponse();
    }

    /**
     * Create an instance of {@link CompanySetVatNumber }
     * 
     */
    public CompanySetVatNumber createCompanySetVatNumber() {
        return new CompanySetVatNumber();
    }

    /**
     * Create an instance of {@link MileageEntryGetSalesPriceResponse }
     * 
     */
    public MileageEntryGetSalesPriceResponse createMileageEntryGetSalesPriceResponse() {
        return new MileageEntryGetSalesPriceResponse();
    }

    /**
     * Create an instance of {@link ExtendedVatZoneGetNumberResponse }
     * 
     */
    public ExtendedVatZoneGetNumberResponse createExtendedVatZoneGetNumberResponse() {
        return new ExtendedVatZoneGetNumberResponse();
    }

    /**
     * Create an instance of {@link EmployeeGroupCreateFromData }
     * 
     */
    public EmployeeGroupCreateFromData createEmployeeGroupCreateFromData() {
        return new EmployeeGroupCreateFromData();
    }

    /**
     * Create an instance of {@link ProductSetDescriptionResponse }
     * 
     */
    public ProductSetDescriptionResponse createProductSetDescriptionResponse() {
        return new ProductSetDescriptionResponse();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetSpecialPriceResponse }
     * 
     */
    public SubscriptionLineGetSpecialPriceResponse createSubscriptionLineGetSpecialPriceResponse() {
        return new SubscriptionLineGetSpecialPriceResponse();
    }

    /**
     * Create an instance of {@link CompanyUpdateFromData }
     * 
     */
    public CompanyUpdateFromData createCompanyUpdateFromData() {
        return new CompanyUpdateFromData();
    }

    /**
     * Create an instance of {@link ProductPriceGetPrice }
     * 
     */
    public ProductPriceGetPrice createProductPriceGetPrice() {
        return new ProductPriceGetPrice();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetData }
     * 
     */
    public ScannedDocumentGetData createScannedDocumentGetData() {
        return new ScannedDocumentGetData();
    }

    /**
     * Create an instance of {@link CompanyGet }
     * 
     */
    public CompanyGet createCompanyGet() {
        return new CompanyGet();
    }

    /**
     * Create an instance of {@link CashBookEntryGetCostType }
     * 
     */
    public CashBookEntryGetCostType createCashBookEntryGetCostType() {
        return new CashBookEntryGetCostType();
    }

    /**
     * Create an instance of {@link TimeEntryGetDataArrayResponse }
     * 
     */
    public TimeEntryGetDataArrayResponse createTimeEntryGetDataArrayResponse() {
        return new TimeEntryGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTimeEntryData }
     * 
     */
    public ArrayOfTimeEntryData createArrayOfTimeEntryData() {
        return new ArrayOfTimeEntryData();
    }

    /**
     * Create an instance of {@link ReportCodeSetGetDataResponse }
     * 
     */
    public ReportCodeSetGetDataResponse createReportCodeSetGetDataResponse() {
        return new ReportCodeSetGetDataResponse();
    }

    /**
     * Create an instance of {@link ReportCodeSetData }
     * 
     */
    public ReportCodeSetData createReportCodeSetData() {
        return new ReportCodeSetData();
    }

    /**
     * Create an instance of {@link ReportCodeSetGetDataArrayResponse }
     * 
     */
    public ReportCodeSetGetDataArrayResponse createReportCodeSetGetDataArrayResponse() {
        return new ReportCodeSetGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfReportCodeSetData }
     * 
     */
    public ArrayOfReportCodeSetData createArrayOfReportCodeSetData() {
        return new ArrayOfReportCodeSetData();
    }

    /**
     * Create an instance of {@link InvoiceLineGetNumber }
     * 
     */
    public InvoiceLineGetNumber createInvoiceLineGetNumber() {
        return new InvoiceLineGetNumber();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetRoundingAmountResponse }
     * 
     */
    public CurrentInvoiceGetRoundingAmountResponse createCurrentInvoiceGetRoundingAmountResponse() {
        return new CurrentInvoiceGetRoundingAmountResponse();
    }

    /**
     * Create an instance of {@link OrderSetOtherReferenceResponse }
     * 
     */
    public OrderSetOtherReferenceResponse createOrderSetOtherReferenceResponse() {
        return new OrderSetOtherReferenceResponse();
    }

    /**
     * Create an instance of {@link ProductGetOnOrderResponse }
     * 
     */
    public ProductGetOnOrderResponse createProductGetOnOrderResponse() {
        return new ProductGetOnOrderResponse();
    }

    /**
     * Create an instance of {@link CurrencyFindByCode }
     * 
     */
    public CurrencyFindByCode createCurrencyFindByCode() {
        return new CurrencyFindByCode();
    }

    /**
     * Create an instance of {@link OrderSetDueDateResponse }
     * 
     */
    public OrderSetDueDateResponse createOrderSetDueDateResponse() {
        return new OrderSetDueDateResponse();
    }

    /**
     * Create an instance of {@link CreditorGetDefaultPaymentCreditorIdResponse }
     * 
     */
    public CreditorGetDefaultPaymentCreditorIdResponse createCreditorGetDefaultPaymentCreditorIdResponse() {
        return new CreditorGetDefaultPaymentCreditorIdResponse();
    }

    /**
     * Create an instance of {@link TimeEntryUpdateFromDataArray }
     * 
     */
    public TimeEntryUpdateFromDataArray createTimeEntryUpdateFromDataArray() {
        return new TimeEntryUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link CashBookEntryGetCreditorResponse }
     * 
     */
    public CashBookEntryGetCreditorResponse createCashBookEntryGetCreditorResponse() {
        return new CashBookEntryGetCreditorResponse();
    }

    /**
     * Create an instance of {@link ProductGetIsAccessibleResponse }
     * 
     */
    public ProductGetIsAccessibleResponse createProductGetIsAccessibleResponse() {
        return new ProductGetIsAccessibleResponse();
    }

    /**
     * Create an instance of {@link AccountGetSumIntervals }
     * 
     */
    public AccountGetSumIntervals createAccountGetSumIntervals() {
        return new AccountGetSumIntervals();
    }

    /**
     * Create an instance of {@link DepartmentUpdateFromData }
     * 
     */
    public DepartmentUpdateFromData createDepartmentUpdateFromData() {
        return new DepartmentUpdateFromData();
    }

    /**
     * Create an instance of {@link AccountSetVatAccount }
     * 
     */
    public AccountSetVatAccount createAccountSetVatAccount() {
        return new AccountSetVatAccount();
    }

    /**
     * Create an instance of {@link OrderLineCreateFromData }
     * 
     */
    public OrderLineCreateFromData createOrderLineCreateFromData() {
        return new OrderLineCreateFromData();
    }

    /**
     * Create an instance of {@link VatAccountGetName }
     * 
     */
    public VatAccountGetName createVatAccountGetName() {
        return new VatAccountGetName();
    }

    /**
     * Create an instance of {@link DebtorFindByPartialNameResponse }
     * 
     */
    public DebtorFindByPartialNameResponse createDebtorFindByPartialNameResponse() {
        return new DebtorFindByPartialNameResponse();
    }

    /**
     * Create an instance of {@link InventoryLocationGetAll }
     * 
     */
    public InventoryLocationGetAll createInventoryLocationGetAll() {
        return new InventoryLocationGetAll();
    }

    /**
     * Create an instance of {@link QuotationGetDebtorCountryResponse }
     * 
     */
    public QuotationGetDebtorCountryResponse createQuotationGetDebtorCountryResponse() {
        return new QuotationGetDebtorCountryResponse();
    }

    /**
     * Create an instance of {@link DebtorGetCounty }
     * 
     */
    public DebtorGetCounty createDebtorGetCounty() {
        return new DebtorGetCounty();
    }

    /**
     * Create an instance of {@link CreditorSetCINumber }
     * 
     */
    public CreditorSetCINumber createCreditorSetCINumber() {
        return new CreditorSetCINumber();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetQuantityResponse }
     * 
     */
    public SubscriptionLineGetQuantityResponse createSubscriptionLineGetQuantityResponse() {
        return new SubscriptionLineGetQuantityResponse();
    }

    /**
     * Create an instance of {@link AccountingYearGetDataArray }
     * 
     */
    public AccountingYearGetDataArray createAccountingYearGetDataArray() {
        return new AccountingYearGetDataArray();
    }

    /**
     * Create an instance of {@link OrderGetOurReference2Response }
     * 
     */
    public OrderGetOurReference2Response createOrderGetOurReference2Response() {
        return new OrderGetOurReference2Response();
    }

    /**
     * Create an instance of {@link SumIntervalCreateFromData }
     * 
     */
    public SumIntervalCreateFromData createSumIntervalCreateFromData() {
        return new SumIntervalCreateFromData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetTermsOfDelivery }
     * 
     */
    public CurrentInvoiceGetTermsOfDelivery createCurrentInvoiceGetTermsOfDelivery() {
        return new CurrentInvoiceGetTermsOfDelivery();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetUnit }
     * 
     */
    public CurrentInvoiceLineGetUnit createCurrentInvoiceLineGetUnit() {
        return new CurrentInvoiceLineGetUnit();
    }

    /**
     * Create an instance of {@link OrderGetNetAmountResponse }
     * 
     */
    public OrderGetNetAmountResponse createOrderGetNetAmountResponse() {
        return new OrderGetNetAmountResponse();
    }

    /**
     * Create an instance of {@link SubscriberGetSubscriptionResponse }
     * 
     */
    public SubscriberGetSubscriptionResponse createSubscriberGetSubscriptionResponse() {
        return new SubscriberGetSubscriptionResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryCreateFromDataArray }
     * 
     */
    public CashBookEntryCreateFromDataArray createCashBookEntryCreateFromDataArray() {
        return new CashBookEntryCreateFromDataArray();
    }

    /**
     * Create an instance of {@link SumIntervalUpdateFromDataResponse }
     * 
     */
    public SumIntervalUpdateFromDataResponse createSumIntervalUpdateFromDataResponse() {
        return new SumIntervalUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetDepartmentResponse }
     * 
     */
    public CurrentInvoiceLineSetDepartmentResponse createCurrentInvoiceLineSetDepartmentResponse() {
        return new CurrentInvoiceLineSetDepartmentResponse();
    }

    /**
     * Create an instance of {@link SubscriberGetSubscription }
     * 
     */
    public SubscriberGetSubscription createSubscriberGetSubscription() {
        return new SubscriberGetSubscription();
    }

    /**
     * Create an instance of {@link CompanySetCityResponse }
     * 
     */
    public CompanySetCityResponse createCompanySetCityResponse() {
        return new CompanySetCityResponse();
    }

    /**
     * Create an instance of {@link AccountSetDepartmentResponse }
     * 
     */
    public AccountSetDepartmentResponse createAccountSetDepartmentResponse() {
        return new AccountSetDepartmentResponse();
    }

    /**
     * Create an instance of {@link AccountGetVatAccount }
     * 
     */
    public AccountGetVatAccount createAccountGetVatAccount() {
        return new AccountGetVatAccount();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDeliveryDate }
     * 
     */
    public CurrentInvoiceGetDeliveryDate createCurrentInvoiceGetDeliveryDate() {
        return new CurrentInvoiceGetDeliveryDate();
    }

    /**
     * Create an instance of {@link SubscriberGetProjectResponse }
     * 
     */
    public SubscriberGetProjectResponse createSubscriberGetProjectResponse() {
        return new SubscriberGetProjectResponse();
    }

    /**
     * Create an instance of {@link OrderLineCreateResponse }
     * 
     */
    public OrderLineCreateResponse createOrderLineCreateResponse() {
        return new OrderLineCreateResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetMarginAsPercentResponse }
     * 
     */
    public CurrentInvoiceGetMarginAsPercentResponse createCurrentInvoiceGetMarginAsPercentResponse() {
        return new CurrentInvoiceGetMarginAsPercentResponse();
    }

    /**
     * Create an instance of {@link CreditorContactGetNumberResponse }
     * 
     */
    public CreditorContactGetNumberResponse createCreditorContactGetNumberResponse() {
        return new CreditorContactGetNumberResponse();
    }

    /**
     * Create an instance of {@link ProductPriceCreateFromDataResponse }
     * 
     */
    public ProductPriceCreateFromDataResponse createProductPriceCreateFromDataResponse() {
        return new ProductPriceCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetDistributionInPercent2 }
     * 
     */
    public TermOfPaymentGetDistributionInPercent2 createTermOfPaymentGetDistributionInPercent2() {
        return new TermOfPaymentGetDistributionInPercent2();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceUpdateFromDataArrayResponse }
     * 
     */
    public CurrentSupplierInvoiceUpdateFromDataArrayResponse createCurrentSupplierInvoiceUpdateFromDataArrayResponse() {
        return new CurrentSupplierInvoiceUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link EmployeeDeleteResponse }
     * 
     */
    public EmployeeDeleteResponse createEmployeeDeleteResponse() {
        return new EmployeeDeleteResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineCreateFromDataResponse }
     * 
     */
    public CurrentSupplierInvoiceLineCreateFromDataResponse createCurrentSupplierInvoiceLineCreateFromDataResponse() {
        return new CurrentSupplierInvoiceLineCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureGetToDate }
     * 
     */
    public BudgetFigureGetToDate createBudgetFigureGetToDate() {
        return new BudgetFigureGetToDate();
    }

    /**
     * Create an instance of {@link VatAccountGetContraAccountResponse }
     * 
     */
    public VatAccountGetContraAccountResponse createVatAccountGetContraAccountResponse() {
        return new VatAccountGetContraAccountResponse();
    }

    /**
     * Create an instance of {@link SubscriberCreateFromDataResponse }
     * 
     */
    public SubscriberCreateFromDataResponse createSubscriberCreateFromDataResponse() {
        return new SubscriberCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link DebtorGetCountry }
     * 
     */
    public DebtorGetCountry createDebtorGetCountry() {
        return new DebtorGetCountry();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineGetUnitPriceResponse }
     * 
     */
    public CurrentSupplierInvoiceLineGetUnitPriceResponse createCurrentSupplierInvoiceLineGetUnitPriceResponse() {
        return new CurrentSupplierInvoiceLineGetUnitPriceResponse();
    }

    /**
     * Create an instance of {@link DebtorGetVatNumberResponse }
     * 
     */
    public DebtorGetVatNumberResponse createDebtorGetVatNumberResponse() {
        return new DebtorGetVatNumberResponse();
    }

    /**
     * Create an instance of {@link CreditorEntryMatchEntries }
     * 
     */
    public CreditorEntryMatchEntries createCreditorEntryMatchEntries() {
        return new CreditorEntryMatchEntries();
    }

    /**
     * Create an instance of {@link DepartmentCreateFromDataArrayResponse }
     * 
     */
    public DepartmentCreateFromDataArrayResponse createDepartmentCreateFromDataArrayResponse() {
        return new DepartmentCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link DistributionKeySetNameResponse }
     * 
     */
    public DistributionKeySetNameResponse createDistributionKeySetNameResponse() {
        return new DistributionKeySetNameResponse();
    }

    /**
     * Create an instance of {@link VatAccountFindByVatCodeResponse }
     * 
     */
    public VatAccountFindByVatCodeResponse createVatAccountFindByVatCodeResponse() {
        return new VatAccountFindByVatCodeResponse();
    }

    /**
     * Create an instance of {@link EntryGetAmountResponse }
     * 
     */
    public EntryGetAmountResponse createEntryGetAmountResponse() {
        return new EntryGetAmountResponse();
    }

    /**
     * Create an instance of {@link OrderGetIsVatIncluded }
     * 
     */
    public OrderGetIsVatIncluded createOrderGetIsVatIncluded() {
        return new OrderGetIsVatIncluded();
    }

    /**
     * Create an instance of {@link CreditorContactGetData }
     * 
     */
    public CreditorContactGetData createCreditorContactGetData() {
        return new CreditorContactGetData();
    }

    /**
     * Create an instance of {@link BudgetFigureGetAccount }
     * 
     */
    public BudgetFigureGetAccount createBudgetFigureGetAccount() {
        return new BudgetFigureGetAccount();
    }

    /**
     * Create an instance of {@link CashBookEntrySetDebtor }
     * 
     */
    public CashBookEntrySetDebtor createCashBookEntrySetDebtor() {
        return new CashBookEntrySetDebtor();
    }

    /**
     * Create an instance of {@link CompanySetWebSite }
     * 
     */
    public CompanySetWebSite createCompanySetWebSite() {
        return new CompanySetWebSite();
    }

    /**
     * Create an instance of {@link CreditorSetOurReference }
     * 
     */
    public CreditorSetOurReference createCreditorSetOurReference() {
        return new CreditorSetOurReference();
    }

    /**
     * Create an instance of {@link CashBookGetDataArrayResponse }
     * 
     */
    public CashBookGetDataArrayResponse createCashBookGetDataArrayResponse() {
        return new CashBookGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCashBookData }
     * 
     */
    public ArrayOfCashBookData createArrayOfCashBookData() {
        return new ArrayOfCashBookData();
    }

    /**
     * Create an instance of {@link SubscriberSetDebtor }
     * 
     */
    public SubscriberSetDebtor createSubscriberSetDebtor() {
        return new SubscriberSetDebtor();
    }

    /**
     * Create an instance of {@link QuotationLineGetTotalMarginResponse }
     * 
     */
    public QuotationLineGetTotalMarginResponse createQuotationLineGetTotalMarginResponse() {
        return new QuotationLineGetTotalMarginResponse();
    }

    /**
     * Create an instance of {@link OrderSetDebtorResponse }
     * 
     */
    public OrderSetDebtorResponse createOrderSetDebtorResponse() {
        return new OrderSetDebtorResponse();
    }

    /**
     * Create an instance of {@link ProductFindByName }
     * 
     */
    public ProductFindByName createProductFindByName() {
        return new ProductFindByName();
    }

    /**
     * Create an instance of {@link CashBookEntryCreate }
     * 
     */
    public CashBookEntryCreate createCashBookEntryCreate() {
        return new CashBookEntryCreate();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetData }
     * 
     */
    public SubscriptionLineGetData createSubscriptionLineGetData() {
        return new SubscriptionLineGetData();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceGetDataArrayResponse }
     * 
     */
    public CurrentSupplierInvoiceGetDataArrayResponse createCurrentSupplierInvoiceGetDataArrayResponse() {
        return new CurrentSupplierInvoiceGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureFindByDate }
     * 
     */
    public BudgetFigureFindByDate createBudgetFigureFindByDate() {
        return new BudgetFigureFindByDate();
    }

    /**
     * Create an instance of {@link AccountGetTotalFromResponse }
     * 
     */
    public AccountGetTotalFromResponse createAccountGetTotalFromResponse() {
        return new AccountGetTotalFromResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetCurrencyResponse }
     * 
     */
    public CurrentInvoiceGetCurrencyResponse createCurrentInvoiceGetCurrencyResponse() {
        return new CurrentInvoiceGetCurrencyResponse();
    }

    /**
     * Create an instance of {@link EmployeeGetMileageEntriesByDate }
     * 
     */
    public EmployeeGetMileageEntriesByDate createEmployeeGetMileageEntriesByDate() {
        return new EmployeeGetMileageEntriesByDate();
    }

    /**
     * Create an instance of {@link DepartmentUpdateFromDataArrayResponse }
     * 
     */
    public DepartmentUpdateFromDataArrayResponse createDepartmentUpdateFromDataArrayResponse() {
        return new DepartmentUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link DebtorFindByNumber }
     * 
     */
    public DebtorFindByNumber createDebtorFindByNumber() {
        return new DebtorFindByNumber();
    }

    /**
     * Create an instance of {@link OrderLineSetDistributionKey }
     * 
     */
    public OrderLineSetDistributionKey createOrderLineSetDistributionKey() {
        return new OrderLineSetDistributionKey();
    }

    /**
     * Create an instance of {@link SubscriptionLineCreate }
     * 
     */
    public SubscriptionLineCreate createSubscriptionLineCreate() {
        return new SubscriptionLineCreate();
    }

    /**
     * Create an instance of {@link OrderSetHeading }
     * 
     */
    public OrderSetHeading createOrderSetHeading() {
        return new OrderSetHeading();
    }

    /**
     * Create an instance of {@link CreditorSetCountyResponse }
     * 
     */
    public CreditorSetCountyResponse createCreditorSetCountyResponse() {
        return new CreditorSetCountyResponse();
    }

    /**
     * Create an instance of {@link QuotationLineGetQuantityResponse }
     * 
     */
    public QuotationLineGetQuantityResponse createQuotationLineGetQuantityResponse() {
        return new QuotationLineGetQuantityResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetOurReference2 }
     * 
     */
    public CurrentInvoiceSetOurReference2 createCurrentInvoiceSetOurReference2() {
        return new CurrentInvoiceSetOurReference2();
    }

    /**
     * Create an instance of {@link CreditorContactCreateFromData }
     * 
     */
    public CreditorContactCreateFromData createCreditorContactCreateFromData() {
        return new CreditorContactCreateFromData();
    }

    /**
     * Create an instance of {@link InvoiceGetDebtorEanResponse }
     * 
     */
    public InvoiceGetDebtorEanResponse createInvoiceGetDebtorEanResponse() {
        return new InvoiceGetDebtorEanResponse();
    }

    /**
     * Create an instance of {@link ProductSetBarCode }
     * 
     */
    public ProductSetBarCode createProductSetBarCode() {
        return new ProductSetBarCode();
    }

    /**
     * Create an instance of {@link PriceGroupGetPriceResponse }
     * 
     */
    public PriceGroupGetPriceResponse createPriceGroupGetPriceResponse() {
        return new PriceGroupGetPriceResponse();
    }

    /**
     * Create an instance of {@link DebtorSetPostalCode }
     * 
     */
    public DebtorSetPostalCode createDebtorSetPostalCode() {
        return new DebtorSetPostalCode();
    }

    /**
     * Create an instance of {@link ActivityGetData }
     * 
     */
    public ActivityGetData createActivityGetData() {
        return new ActivityGetData();
    }

    /**
     * Create an instance of {@link OrderLineUpdateFromDataArray }
     * 
     */
    public OrderLineUpdateFromDataArray createOrderLineUpdateFromDataArray() {
        return new OrderLineUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link ProductPriceGetProduct }
     * 
     */
    public ProductPriceGetProduct createProductPriceGetProduct() {
        return new ProductPriceGetProduct();
    }

    /**
     * Create an instance of {@link TimeEntryGetCostPriceResponse }
     * 
     */
    public TimeEntryGetCostPriceResponse createTimeEntryGetCostPriceResponse() {
        return new TimeEntryGetCostPriceResponse();
    }

    /**
     * Create an instance of {@link DebtorGetCurrency }
     * 
     */
    public DebtorGetCurrency createDebtorGetCurrency() {
        return new DebtorGetCurrency();
    }

    /**
     * Create an instance of {@link CashBookEntryGetDebtorResponse }
     * 
     */
    public CashBookEntryGetDebtorResponse createCashBookEntryGetDebtorResponse() {
        return new CashBookEntryGetDebtorResponse();
    }

    /**
     * Create an instance of {@link VatAccountGetAllResponse }
     * 
     */
    public VatAccountGetAllResponse createVatAccountGetAllResponse() {
        return new VatAccountGetAllResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetExchangeRateResponse }
     * 
     */
    public CurrentInvoiceGetExchangeRateResponse createCurrentInvoiceGetExchangeRateResponse() {
        return new CurrentInvoiceGetExchangeRateResponse();
    }

    /**
     * Create an instance of {@link MileageEntryCreateResponse }
     * 
     */
    public MileageEntryCreateResponse createMileageEntryCreateResponse() {
        return new MileageEntryCreateResponse();
    }

    /**
     * Create an instance of {@link CreditorContactCreateFromDataArrayResponse }
     * 
     */
    public CreditorContactCreateFromDataArrayResponse createCreditorContactCreateFromDataArrayResponse() {
        return new CreditorContactCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetAllUpdated }
     * 
     */
    public CurrentInvoiceGetAllUpdated createCurrentInvoiceGetAllUpdated() {
        return new CurrentInvoiceGetAllUpdated();
    }

    /**
     * Create an instance of {@link OrderSetProjectResponse }
     * 
     */
    public OrderSetProjectResponse createOrderSetProjectResponse() {
        return new OrderSetProjectResponse();
    }

    /**
     * Create an instance of {@link SubscriptionSetNameResponse }
     * 
     */
    public SubscriptionSetNameResponse createSubscriptionSetNameResponse() {
        return new SubscriptionSetNameResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetDataResponse }
     * 
     */
    public InvoiceGetDataResponse createInvoiceGetDataResponse() {
        return new InvoiceGetDataResponse();
    }

    /**
     * Create an instance of {@link InvoiceData }
     * 
     */
    public InvoiceData createInvoiceData() {
        return new InvoiceData();
    }

    /**
     * Create an instance of {@link QuotationGetDataArrayResponse }
     * 
     */
    public QuotationGetDataArrayResponse createQuotationGetDataArrayResponse() {
        return new QuotationGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfQuotationData }
     * 
     */
    public ArrayOfQuotationData createArrayOfQuotationData() {
        return new ArrayOfQuotationData();
    }

    /**
     * Create an instance of {@link ProductGroupCreateFromDataResponse }
     * 
     */
    public ProductGroupCreateFromDataResponse createProductGroupCreateFromDataResponse() {
        return new ProductGroupCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link OrderSetDebtorCounty }
     * 
     */
    public OrderSetDebtorCounty createOrderSetDebtorCounty() {
        return new OrderSetDebtorCounty();
    }

    /**
     * Create an instance of {@link DistributionKeyGetIsAccessibleResponse }
     * 
     */
    public DistributionKeyGetIsAccessibleResponse createDistributionKeyGetIsAccessibleResponse() {
        return new DistributionKeyGetIsAccessibleResponse();
    }

    /**
     * Create an instance of {@link OrderSetDebtorPostalCode }
     * 
     */
    public OrderSetDebtorPostalCode createOrderSetDebtorPostalCode() {
        return new OrderSetDebtorPostalCode();
    }

    /**
     * Create an instance of {@link EntryGetAmountDefaultCurrency }
     * 
     */
    public EntryGetAmountDefaultCurrency createEntryGetAmountDefaultCurrency() {
        return new EntryGetAmountDefaultCurrency();
    }

    /**
     * Create an instance of {@link InvoiceGetDeliveryDate }
     * 
     */
    public InvoiceGetDeliveryDate createInvoiceGetDeliveryDate() {
        return new InvoiceGetDeliveryDate();
    }

    /**
     * Create an instance of {@link CurrentInvoiceUpdateFromDataArray }
     * 
     */
    public CurrentInvoiceUpdateFromDataArray createCurrentInvoiceUpdateFromDataArray() {
        return new CurrentInvoiceUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link QuotationGetMargin }
     * 
     */
    public QuotationGetMargin createQuotationGetMargin() {
        return new QuotationGetMargin();
    }

    /**
     * Create an instance of {@link DebtorGroupGetAll }
     * 
     */
    public DebtorGroupGetAll createDebtorGroupGetAll() {
        return new DebtorGroupGetAll();
    }

    /**
     * Create an instance of {@link InvoiceGetNetAmountDefaultCurrency }
     * 
     */
    public InvoiceGetNetAmountDefaultCurrency createInvoiceGetNetAmountDefaultCurrency() {
        return new InvoiceGetNetAmountDefaultCurrency();
    }

    /**
     * Create an instance of {@link SubscriptionGetDescription }
     * 
     */
    public SubscriptionGetDescription createSubscriptionGetDescription() {
        return new SubscriptionGetDescription();
    }

    /**
     * Create an instance of {@link QuotationCreateFromDataArrayResponse }
     * 
     */
    public QuotationCreateFromDataArrayResponse createQuotationCreateFromDataArrayResponse() {
        return new QuotationCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link TemplateCollectionGetName }
     * 
     */
    public TemplateCollectionGetName createTemplateCollectionGetName() {
        return new TemplateCollectionGetName();
    }

    /**
     * Create an instance of {@link DisconnectResponse }
     * 
     */
    public DisconnectResponse createDisconnectResponse() {
        return new DisconnectResponse();
    }

    /**
     * Create an instance of {@link UnitGetDataArray }
     * 
     */
    public UnitGetDataArray createUnitGetDataArray() {
        return new UnitGetDataArray();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetData }
     * 
     */
    public TermOfPaymentGetData createTermOfPaymentGetData() {
        return new TermOfPaymentGetData();
    }

    /**
     * Create an instance of {@link InvoiceLineGetDescription }
     * 
     */
    public InvoiceLineGetDescription createInvoiceLineGetDescription() {
        return new InvoiceLineGetDescription();
    }

    /**
     * Create an instance of {@link DebtorSetVatZone }
     * 
     */
    public DebtorSetVatZone createDebtorSetVatZone() {
        return new DebtorSetVatZone();
    }

    /**
     * Create an instance of {@link EmployeeGroupUpdateFromDataArray }
     * 
     */
    public EmployeeGroupUpdateFromDataArray createEmployeeGroupUpdateFromDataArray() {
        return new EmployeeGroupUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link KeyFigureCodeGetNumber }
     * 
     */
    public KeyFigureCodeGetNumber createKeyFigureCodeGetNumber() {
        return new KeyFigureCodeGetNumber();
    }

    /**
     * Create an instance of {@link OrderGetDebtorEanResponse }
     * 
     */
    public OrderGetDebtorEanResponse createOrderGetDebtorEanResponse() {
        return new OrderGetDebtorEanResponse();
    }

    /**
     * Create an instance of {@link DebtorEntryGetTextResponse }
     * 
     */
    public DebtorEntryGetTextResponse createDebtorEntryGetTextResponse() {
        return new DebtorEntryGetTextResponse();
    }

    /**
     * Create an instance of {@link CreditorGetEntries }
     * 
     */
    public CreditorGetEntries createCreditorGetEntries() {
        return new CreditorGetEntries();
    }

    /**
     * Create an instance of {@link QuotationLineGetUnitCostPrice }
     * 
     */
    public QuotationLineGetUnitCostPrice createQuotationLineGetUnitCostPrice() {
        return new QuotationLineGetUnitCostPrice();
    }

    /**
     * Create an instance of {@link TermOfPaymentCreateResponse }
     * 
     */
    public TermOfPaymentCreateResponse createTermOfPaymentCreateResponse() {
        return new TermOfPaymentCreateResponse();
    }

    /**
     * Create an instance of {@link SubscriberGetCommentsResponse }
     * 
     */
    public SubscriberGetCommentsResponse createSubscriberGetCommentsResponse() {
        return new SubscriberGetCommentsResponse();
    }

    /**
     * Create an instance of {@link QuotationLineSetUnitNetPriceResponse }
     * 
     */
    public QuotationLineSetUnitNetPriceResponse createQuotationLineSetUnitNetPriceResponse() {
        return new QuotationLineSetUnitNetPriceResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineSetProduct }
     * 
     */
    public CurrentSupplierInvoiceLineSetProduct createCurrentSupplierInvoiceLineSetProduct() {
        return new CurrentSupplierInvoiceLineSetProduct();
    }

    /**
     * Create an instance of {@link CreditorCreateFromDataResponse }
     * 
     */
    public CreditorCreateFromDataResponse createCreditorCreateFromDataResponse() {
        return new CreditorCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link DebtorGetNumber }
     * 
     */
    public DebtorGetNumber createDebtorGetNumber() {
        return new DebtorGetNumber();
    }

    /**
     * Create an instance of {@link QuotationLineFindByProduct }
     * 
     */
    public QuotationLineFindByProduct createQuotationLineFindByProduct() {
        return new QuotationLineFindByProduct();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryCreateFromDataResponse }
     * 
     */
    public DocumentArchiveCategoryCreateFromDataResponse createDocumentArchiveCategoryCreateFromDataResponse() {
        return new DocumentArchiveCategoryCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link SubscriberGetDebtorResponse }
     * 
     */
    public SubscriberGetDebtorResponse createSubscriberGetDebtorResponse() {
        return new SubscriberGetDebtorResponse();
    }

    /**
     * Create an instance of {@link CostTypeGetName }
     * 
     */
    public CostTypeGetName createCostTypeGetName() {
        return new CostTypeGetName();
    }

    /**
     * Create an instance of {@link DebtorGetCurrentInvoices }
     * 
     */
    public DebtorGetCurrentInvoices createDebtorGetCurrentInvoices() {
        return new DebtorGetCurrentInvoices();
    }

    /**
     * Create an instance of {@link ProjectUpdateFromDataResponse }
     * 
     */
    public ProjectUpdateFromDataResponse createProjectUpdateFromDataResponse() {
        return new ProjectUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link QuotationGetDeliveryCountry }
     * 
     */
    public QuotationGetDeliveryCountry createQuotationGetDeliveryCountry() {
        return new QuotationGetDeliveryCountry();
    }

    /**
     * Create an instance of {@link ProductUpdateFromDataResponse }
     * 
     */
    public ProductUpdateFromDataResponse createProductUpdateFromDataResponse() {
        return new ProductUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link QuotationSetTextLine1Response }
     * 
     */
    public QuotationSetTextLine1Response createQuotationSetTextLine1Response() {
        return new QuotationSetTextLine1Response();
    }

    /**
     * Create an instance of {@link DebtorEntryGetSerialNumberResponse }
     * 
     */
    public DebtorEntryGetSerialNumberResponse createDebtorEntryGetSerialNumberResponse() {
        return new DebtorEntryGetSerialNumberResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDataArray }
     * 
     */
    public CurrentInvoiceGetDataArray createCurrentInvoiceGetDataArray() {
        return new CurrentInvoiceGetDataArray();
    }

    /**
     * Create an instance of {@link DebtorEntryGetDate }
     * 
     */
    public DebtorEntryGetDate createDebtorEntryGetDate() {
        return new DebtorEntryGetDate();
    }

    /**
     * Create an instance of {@link OrderGetTermsOfDeliveryResponse }
     * 
     */
    public OrderGetTermsOfDeliveryResponse createOrderGetTermsOfDeliveryResponse() {
        return new OrderGetTermsOfDeliveryResponse();
    }

    /**
     * Create an instance of {@link ProductPriceCreateFromData }
     * 
     */
    public ProductPriceCreateFromData createProductPriceCreateFromData() {
        return new ProductPriceCreateFromData();
    }

    /**
     * Create an instance of {@link ProductPriceData }
     * 
     */
    public ProductPriceData createProductPriceData() {
        return new ProductPriceData();
    }

    /**
     * Create an instance of {@link CreditorCreateFromDataArray }
     * 
     */
    public CreditorCreateFromDataArray createCreditorCreateFromDataArray() {
        return new CreditorCreateFromDataArray();
    }

    /**
     * Create an instance of {@link InvoiceLineGetVatRate }
     * 
     */
    public InvoiceLineGetVatRate createInvoiceLineGetVatRate() {
        return new InvoiceLineGetVatRate();
    }

    /**
     * Create an instance of {@link QuotationGetDeliveryDate }
     * 
     */
    public QuotationGetDeliveryDate createQuotationGetDeliveryDate() {
        return new QuotationGetDeliveryDate();
    }

    /**
     * Create an instance of {@link OrderGetIsVatIncludedResponse }
     * 
     */
    public OrderGetIsVatIncludedResponse createOrderGetIsVatIncludedResponse() {
        return new OrderGetIsVatIncludedResponse();
    }

    /**
     * Create an instance of {@link QuotationGetTermsOfDeliveryResponse }
     * 
     */
    public QuotationGetTermsOfDeliveryResponse createQuotationGetTermsOfDeliveryResponse() {
        return new QuotationGetTermsOfDeliveryResponse();
    }

    /**
     * Create an instance of {@link TimeEntryGetApproved }
     * 
     */
    public TimeEntryGetApproved createTimeEntryGetApproved() {
        return new TimeEntryGetApproved();
    }

    /**
     * Create an instance of {@link DebtorGetEmail }
     * 
     */
    public DebtorGetEmail createDebtorGetEmail() {
        return new DebtorGetEmail();
    }

    /**
     * Create an instance of {@link CashBookUpdateFromDataResponse }
     * 
     */
    public CashBookUpdateFromDataResponse createCashBookUpdateFromDataResponse() {
        return new CashBookUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link ProductGroupGetNumberResponse }
     * 
     */
    public ProductGroupGetNumberResponse createProductGroupGetNumberResponse() {
        return new ProductGroupGetNumberResponse();
    }

    /**
     * Create an instance of {@link CreditorGetCINumber }
     * 
     */
    public CreditorGetCINumber createCreditorGetCINumber() {
        return new CreditorGetCINumber();
    }

    /**
     * Create an instance of {@link SubscriptionGetSubscriptionLinesResponse }
     * 
     */
    public SubscriptionGetSubscriptionLinesResponse createSubscriptionGetSubscriptionLinesResponse() {
        return new SubscriptionGetSubscriptionLinesResponse();
    }

    /**
     * Create an instance of {@link AccountSetBlockDirectEntries }
     * 
     */
    public AccountSetBlockDirectEntries createAccountSetBlockDirectEntries() {
        return new AccountSetBlockDirectEntries();
    }

    /**
     * Create an instance of {@link MileageEntryGetAllResponse }
     * 
     */
    public MileageEntryGetAllResponse createMileageEntryGetAllResponse() {
        return new MileageEntryGetAllResponse();
    }

    /**
     * Create an instance of {@link CompanyUpdateFromDataResponse }
     * 
     */
    public CompanyUpdateFromDataResponse createCompanyUpdateFromDataResponse() {
        return new CompanyUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link OrderLineFindByProductResponse }
     * 
     */
    public OrderLineFindByProductResponse createOrderLineFindByProductResponse() {
        return new OrderLineFindByProductResponse();
    }

    /**
     * Create an instance of {@link QuotationSetTermOfPayment }
     * 
     */
    public QuotationSetTermOfPayment createQuotationSetTermOfPayment() {
        return new QuotationSetTermOfPayment();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryUpdateFromData }
     * 
     */
    public DocumentArchiveCategoryUpdateFromData createDocumentArchiveCategoryUpdateFromData() {
        return new DocumentArchiveCategoryUpdateFromData();
    }

    /**
     * Create an instance of {@link OrderLineGetOrder }
     * 
     */
    public OrderLineGetOrder createOrderLineGetOrder() {
        return new OrderLineGetOrder();
    }

    /**
     * Create an instance of {@link DebtorSetOurReference }
     * 
     */
    public DebtorSetOurReference createDebtorSetOurReference() {
        return new DebtorSetOurReference();
    }

    /**
     * Create an instance of {@link SubscriberSetStartDate }
     * 
     */
    public SubscriberSetStartDate createSubscriberSetStartDate() {
        return new SubscriberSetStartDate();
    }

    /**
     * Create an instance of {@link BudgetFigureGetAmountDefaultCurrencyResponse }
     * 
     */
    public BudgetFigureGetAmountDefaultCurrencyResponse createBudgetFigureGetAmountDefaultCurrencyResponse() {
        return new BudgetFigureGetAmountDefaultCurrencyResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetHeading }
     * 
     */
    public InvoiceGetHeading createInvoiceGetHeading() {
        return new InvoiceGetHeading();
    }

    /**
     * Create an instance of {@link DistributionKeyGetData }
     * 
     */
    public DistributionKeyGetData createDistributionKeyGetData() {
        return new DistributionKeyGetData();
    }

    /**
     * Create an instance of {@link CreditorGetNumberResponse }
     * 
     */
    public CreditorGetNumberResponse createCreditorGetNumberResponse() {
        return new CreditorGetNumberResponse();
    }

    /**
     * Create an instance of {@link TimeEntryGetAll }
     * 
     */
    public TimeEntryGetAll createTimeEntryGetAll() {
        return new TimeEntryGetAll();
    }

    /**
     * Create an instance of {@link DeliveryLocationSetCountryResponse }
     * 
     */
    public DeliveryLocationSetCountryResponse createDeliveryLocationSetCountryResponse() {
        return new DeliveryLocationSetCountryResponse();
    }

    /**
     * Create an instance of {@link OrderLineDeleteResponse }
     * 
     */
    public OrderLineDeleteResponse createOrderLineDeleteResponse() {
        return new OrderLineDeleteResponse();
    }

    /**
     * Create an instance of {@link EmployeeGetNumber }
     * 
     */
    public EmployeeGetNumber createEmployeeGetNumber() {
        return new EmployeeGetNumber();
    }

    /**
     * Create an instance of {@link DebtorContactGetNumber }
     * 
     */
    public DebtorContactGetNumber createDebtorContactGetNumber() {
        return new DebtorContactGetNumber();
    }

    /**
     * Create an instance of {@link SubscriptionLineSetProductNameResponse }
     * 
     */
    public SubscriptionLineSetProductNameResponse createSubscriptionLineSetProductNameResponse() {
        return new SubscriptionLineSetProductNameResponse();
    }

    /**
     * Create an instance of {@link ReportCodeGetDataArrayResponse }
     * 
     */
    public ReportCodeGetDataArrayResponse createReportCodeGetDataArrayResponse() {
        return new ReportCodeGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfReportCodeData }
     * 
     */
    public ArrayOfReportCodeData createArrayOfReportCodeData() {
        return new ArrayOfReportCodeData();
    }

    /**
     * Create an instance of {@link EntryTurnVoucher }
     * 
     */
    public EntryTurnVoucher createEntryTurnVoucher() {
        return new EntryTurnVoucher();
    }

    /**
     * Create an instance of {@link ProductSetBarCodeResponse }
     * 
     */
    public ProductSetBarCodeResponse createProductSetBarCodeResponse() {
        return new ProductSetBarCodeResponse();
    }

    /**
     * Create an instance of {@link EmployeeGetTimeEntriesByDate }
     * 
     */
    public EmployeeGetTimeEntriesByDate createEmployeeGetTimeEntriesByDate() {
        return new EmployeeGetTimeEntriesByDate();
    }

    /**
     * Create an instance of {@link CreditorEntryGetRemainderDefaultCurrency }
     * 
     */
    public CreditorEntryGetRemainderDefaultCurrency createCreditorEntryGetRemainderDefaultCurrency() {
        return new CreditorEntryGetRemainderDefaultCurrency();
    }

    /**
     * Create an instance of {@link SubscriberSetProjectResponse }
     * 
     */
    public SubscriberSetProjectResponse createSubscriberSetProjectResponse() {
        return new SubscriberSetProjectResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationUpdateFromDataArray }
     * 
     */
    public DeliveryLocationUpdateFromDataArray createDeliveryLocationUpdateFromDataArray() {
        return new DeliveryLocationUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link TimeEntryGetAllUpdated }
     * 
     */
    public TimeEntryGetAllUpdated createTimeEntryGetAllUpdated() {
        return new TimeEntryGetAllUpdated();
    }

    /**
     * Create an instance of {@link CashBookUpdateFromData }
     * 
     */
    public CashBookUpdateFromData createCashBookUpdateFromData() {
        return new CashBookUpdateFromData();
    }

    /**
     * Create an instance of {@link DebtorGetWebsite }
     * 
     */
    public DebtorGetWebsite createDebtorGetWebsite() {
        return new DebtorGetWebsite();
    }

    /**
     * Create an instance of {@link SumIntervalGetAccount }
     * 
     */
    public SumIntervalGetAccount createSumIntervalGetAccount() {
        return new SumIntervalGetAccount();
    }

    /**
     * Create an instance of {@link QuotationGetDeliveryPostalCodeResponse }
     * 
     */
    public QuotationGetDeliveryPostalCodeResponse createQuotationGetDeliveryPostalCodeResponse() {
        return new QuotationGetDeliveryPostalCodeResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetProject }
     * 
     */
    public CurrentInvoiceGetProject createCurrentInvoiceGetProject() {
        return new CurrentInvoiceGetProject();
    }

    /**
     * Create an instance of {@link QuotationCreate }
     * 
     */
    public QuotationCreate createQuotationCreate() {
        return new QuotationCreate();
    }

    /**
     * Create an instance of {@link InvoiceGetDebtorResponse }
     * 
     */
    public InvoiceGetDebtorResponse createInvoiceGetDebtorResponse() {
        return new InvoiceGetDebtorResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceUpdateFromData }
     * 
     */
    public CurrentInvoiceUpdateFromData createCurrentInvoiceUpdateFromData() {
        return new CurrentInvoiceUpdateFromData();
    }

    /**
     * Create an instance of {@link QuotationGetNumber }
     * 
     */
    public QuotationGetNumber createQuotationGetNumber() {
        return new QuotationGetNumber();
    }

    /**
     * Create an instance of {@link DebtorSetTermOfPaymentResponse }
     * 
     */
    public DebtorSetTermOfPaymentResponse createDebtorSetTermOfPaymentResponse() {
        return new DebtorSetTermOfPaymentResponse();
    }

    /**
     * Create an instance of {@link DebtorFindByTelephoneAndFaxNumberResponse }
     * 
     */
    public DebtorFindByTelephoneAndFaxNumberResponse createDebtorFindByTelephoneAndFaxNumberResponse() {
        return new DebtorFindByTelephoneAndFaxNumberResponse();
    }

    /**
     * Create an instance of {@link DepartmentSetNameResponse }
     * 
     */
    public DepartmentSetNameResponse createDepartmentSetNameResponse() {
        return new DepartmentSetNameResponse();
    }

    /**
     * Create an instance of {@link CashBookGetEntriesResponse }
     * 
     */
    public CashBookGetEntriesResponse createCashBookGetEntriesResponse() {
        return new CashBookGetEntriesResponse();
    }

    /**
     * Create an instance of {@link EntryFindByDateIntervalResponse }
     * 
     */
    public EntryFindByDateIntervalResponse createEntryFindByDateIntervalResponse() {
        return new EntryFindByDateIntervalResponse();
    }

    /**
     * Create an instance of {@link CashBookEntrySetContraAccount }
     * 
     */
    public CashBookEntrySetContraAccount createCashBookEntrySetContraAccount() {
        return new CashBookEntrySetContraAccount();
    }

    /**
     * Create an instance of {@link DistributionKeySetIsAccessibleResponse }
     * 
     */
    public DistributionKeySetIsAccessibleResponse createDistributionKeySetIsAccessibleResponse() {
        return new DistributionKeySetIsAccessibleResponse();
    }

    /**
     * Create an instance of {@link OrderFindByOtherReference }
     * 
     */
    public OrderFindByOtherReference createOrderFindByOtherReference() {
        return new OrderFindByOtherReference();
    }

    /**
     * Create an instance of {@link ProductGroupFindByNumber }
     * 
     */
    public ProductGroupFindByNumber createProductGroupFindByNumber() {
        return new ProductGroupFindByNumber();
    }

    /**
     * Create an instance of {@link ProductFindByBarCode }
     * 
     */
    public ProductFindByBarCode createProductFindByBarCode() {
        return new ProductFindByBarCode();
    }

    /**
     * Create an instance of {@link CreditorEntryGetCreditorResponse }
     * 
     */
    public CreditorEntryGetCreditorResponse createCreditorEntryGetCreditorResponse() {
        return new CreditorEntryGetCreditorResponse();
    }

    /**
     * Create an instance of {@link ProductPriceDelete }
     * 
     */
    public ProductPriceDelete createProductPriceDelete() {
        return new ProductPriceDelete();
    }

    /**
     * Create an instance of {@link CreditorGetEntriesByVoucherNoResponse }
     * 
     */
    public CreditorGetEntriesByVoucherNoResponse createCreditorGetEntriesByVoucherNoResponse() {
        return new CreditorGetEntriesByVoucherNoResponse();
    }

    /**
     * Create an instance of {@link CashBookFindByNumberList }
     * 
     */
    public CashBookFindByNumberList createCashBookFindByNumberList() {
        return new CashBookFindByNumberList();
    }

    /**
     * Create an instance of {@link EmployeeUpdateFromDataResponse }
     * 
     */
    public EmployeeUpdateFromDataResponse createEmployeeUpdateFromDataResponse() {
        return new EmployeeUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link MileageEntrySetProject }
     * 
     */
    public MileageEntrySetProject createMileageEntrySetProject() {
        return new MileageEntrySetProject();
    }

    /**
     * Create an instance of {@link DepartmentDelete }
     * 
     */
    public DepartmentDelete createDepartmentDelete() {
        return new DepartmentDelete();
    }

    /**
     * Create an instance of {@link ProductSetDistributionKeyResponse }
     * 
     */
    public ProductSetDistributionKeyResponse createProductSetDistributionKeyResponse() {
        return new ProductSetDistributionKeyResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetAmountResponse }
     * 
     */
    public CashBookEntryGetAmountResponse createCashBookEntryGetAmountResponse() {
        return new CashBookEntryGetAmountResponse();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetDataArrayResponse }
     * 
     */
    public SubscriptionLineGetDataArrayResponse createSubscriptionLineGetDataArrayResponse() {
        return new SubscriptionLineGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationFindByExternalId }
     * 
     */
    public DeliveryLocationFindByExternalId createDeliveryLocationFindByExternalId() {
        return new DeliveryLocationFindByExternalId();
    }

    /**
     * Create an instance of {@link DeliveryLocationUpdateFromData }
     * 
     */
    public DeliveryLocationUpdateFromData createDeliveryLocationUpdateFromData() {
        return new DeliveryLocationUpdateFromData();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetProductNameResponse }
     * 
     */
    public SubscriptionLineGetProductNameResponse createSubscriptionLineGetProductNameResponse() {
        return new SubscriptionLineGetProductNameResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetTermOfPaymentResponse }
     * 
     */
    public CurrentInvoiceGetTermOfPaymentResponse createCurrentInvoiceGetTermOfPaymentResponse() {
        return new CurrentInvoiceGetTermOfPaymentResponse();
    }

    /**
     * Create an instance of {@link EmployeeSetCutoffDate }
     * 
     */
    public EmployeeSetCutoffDate createEmployeeSetCutoffDate() {
        return new EmployeeSetCutoffDate();
    }

    /**
     * Create an instance of {@link ProjectCreate }
     * 
     */
    public ProjectCreate createProjectCreate() {
        return new ProjectCreate();
    }

    /**
     * Create an instance of {@link CreditorEntryGetType }
     * 
     */
    public CreditorEntryGetType createCreditorEntryGetType() {
        return new CreditorEntryGetType();
    }

    /**
     * Create an instance of {@link ProjectGetAllUpdated }
     * 
     */
    public ProjectGetAllUpdated createProjectGetAllUpdated() {
        return new ProjectGetAllUpdated();
    }

    /**
     * Create an instance of {@link AccountingYearGetIsClosedResponse }
     * 
     */
    public AccountingYearGetIsClosedResponse createAccountingYearGetIsClosedResponse() {
        return new AccountingYearGetIsClosedResponse();
    }

    /**
     * Create an instance of {@link CreditorSetCity }
     * 
     */
    public CreditorSetCity createCreditorSetCity() {
        return new CreditorSetCity();
    }

    /**
     * Create an instance of {@link DebtorContactSetExternalIdResponse }
     * 
     */
    public DebtorContactSetExternalIdResponse createDebtorContactSetExternalIdResponse() {
        return new DebtorContactSetExternalIdResponse();
    }

    /**
     * Create an instance of {@link CashBookBookWithDateResponse }
     * 
     */
    public CashBookBookWithDateResponse createCashBookBookWithDateResponse() {
        return new CashBookBookWithDateResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetCapitalise }
     * 
     */
    public CashBookEntryGetCapitalise createCashBookEntryGetCapitalise() {
        return new CashBookEntryGetCapitalise();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineDelete }
     * 
     */
    public CurrentInvoiceLineDelete createCurrentInvoiceLineDelete() {
        return new CurrentInvoiceLineDelete();
    }

    /**
     * Create an instance of {@link OrderFindByOtherReferenceResponse }
     * 
     */
    public OrderFindByOtherReferenceResponse createOrderFindByOtherReferenceResponse() {
        return new OrderFindByOtherReferenceResponse();
    }

    /**
     * Create an instance of {@link ProjectCreateFromData }
     * 
     */
    public ProjectCreateFromData createProjectCreateFromData() {
        return new ProjectCreateFromData();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetExternalId }
     * 
     */
    public DeliveryLocationGetExternalId createDeliveryLocationGetExternalId() {
        return new DeliveryLocationGetExternalId();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetPublicEntryNumberResponse }
     * 
     */
    public CurrentInvoiceSetPublicEntryNumberResponse createCurrentInvoiceSetPublicEntryNumberResponse() {
        return new CurrentInvoiceSetPublicEntryNumberResponse();
    }

    /**
     * Create an instance of {@link DebtorContactGetNameResponse }
     * 
     */
    public DebtorContactGetNameResponse createDebtorContactGetNameResponse() {
        return new DebtorContactGetNameResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetTextLine2Response }
     * 
     */
    public CurrentInvoiceGetTextLine2Response createCurrentInvoiceGetTextLine2Response() {
        return new CurrentInvoiceGetTextLine2Response();
    }

    /**
     * Create an instance of {@link OrderGetDebtorCountyResponse }
     * 
     */
    public OrderGetDebtorCountyResponse createOrderGetDebtorCountyResponse() {
        return new OrderGetDebtorCountyResponse();
    }

    /**
     * Create an instance of {@link OrderSetDeliveryCity }
     * 
     */
    public OrderSetDeliveryCity createOrderSetDeliveryCity() {
        return new OrderSetDeliveryCity();
    }

    /**
     * Create an instance of {@link ProductFindByBarCodeResponse }
     * 
     */
    public ProductFindByBarCodeResponse createProductFindByBarCodeResponse() {
        return new ProductFindByBarCodeResponse();
    }

    /**
     * Create an instance of {@link DebtorGetYourReferenceResponse }
     * 
     */
    public DebtorGetYourReferenceResponse createDebtorGetYourReferenceResponse() {
        return new DebtorGetYourReferenceResponse();
    }

    /**
     * Create an instance of {@link CreditorGetEntriesByInvoiceNoResponse }
     * 
     */
    public CreditorGetEntriesByInvoiceNoResponse createCreditorGetEntriesByInvoiceNoResponse() {
        return new CreditorGetEntriesByInvoiceNoResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetDays }
     * 
     */
    public TermOfPaymentGetDays createTermOfPaymentGetDays() {
        return new TermOfPaymentGetDays();
    }

    /**
     * Create an instance of {@link ProjectCreateResponse }
     * 
     */
    public ProjectCreateResponse createProjectCreateResponse() {
        return new ProjectCreateResponse();
    }

    /**
     * Create an instance of {@link QuotationGetDeliveryLocationResponse }
     * 
     */
    public QuotationGetDeliveryLocationResponse createQuotationGetDeliveryLocationResponse() {
        return new QuotationGetDeliveryLocationResponse();
    }

    /**
     * Create an instance of {@link DebtorGetLayoutResponse }
     * 
     */
    public DebtorGetLayoutResponse createDebtorGetLayoutResponse() {
        return new DebtorGetLayoutResponse();
    }

    /**
     * Create an instance of {@link DebtorEntryGetData }
     * 
     */
    public DebtorEntryGetData createDebtorEntryGetData() {
        return new DebtorEntryGetData();
    }

    /**
     * Create an instance of {@link DebtorSetAttention }
     * 
     */
    public DebtorSetAttention createDebtorSetAttention() {
        return new DebtorSetAttention();
    }

    /**
     * Create an instance of {@link DebtorSetPostalCodeResponse }
     * 
     */
    public DebtorSetPostalCodeResponse createDebtorSetPostalCodeResponse() {
        return new DebtorSetPostalCodeResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineFindByProduct }
     * 
     */
    public InvoiceLineFindByProduct createInvoiceLineFindByProduct() {
        return new InvoiceLineFindByProduct();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDebtorCityResponse }
     * 
     */
    public CurrentInvoiceSetDebtorCityResponse createCurrentInvoiceSetDebtorCityResponse() {
        return new CurrentInvoiceSetDebtorCityResponse();
    }

    /**
     * Create an instance of {@link KeyFigureCodeGetAccountsResponse }
     * 
     */
    public KeyFigureCodeGetAccountsResponse createKeyFigureCodeGetAccountsResponse() {
        return new KeyFigureCodeGetAccountsResponse();
    }

    /**
     * Create an instance of {@link CashBookUpdateFromDataArrayResponse }
     * 
     */
    public CashBookUpdateFromDataArrayResponse createCashBookUpdateFromDataArrayResponse() {
        return new CashBookUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link OrderLineSetDeliveryDateResponse }
     * 
     */
    public OrderLineSetDeliveryDateResponse createOrderLineSetDeliveryDateResponse() {
        return new OrderLineSetDeliveryDateResponse();
    }

    /**
     * Create an instance of {@link SubscriptionUpdateFromDataArray }
     * 
     */
    public SubscriptionUpdateFromDataArray createSubscriptionUpdateFromDataArray() {
        return new SubscriptionUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link OrderFindByNumber }
     * 
     */
    public OrderFindByNumber createOrderFindByNumber() {
        return new OrderFindByNumber();
    }

    /**
     * Create an instance of {@link CashBookEntrySetDebtorInvoiceNumberResponse }
     * 
     */
    public CashBookEntrySetDebtorInvoiceNumberResponse createCashBookEntrySetDebtorInvoiceNumberResponse() {
        return new CashBookEntrySetDebtorInvoiceNumberResponse();
    }

    /**
     * Create an instance of {@link QuotationLineSetQuantity }
     * 
     */
    public QuotationLineSetQuantity createQuotationLineSetQuantity() {
        return new QuotationLineSetQuantity();
    }

    /**
     * Create an instance of {@link InvoiceLineGetUnitNetPriceResponse }
     * 
     */
    public InvoiceLineGetUnitNetPriceResponse createInvoiceLineGetUnitNetPriceResponse() {
        return new InvoiceLineGetUnitNetPriceResponse();
    }

    /**
     * Create an instance of {@link QuotationGetDeliveryCountyResponse }
     * 
     */
    public QuotationGetDeliveryCountyResponse createQuotationGetDeliveryCountyResponse() {
        return new QuotationGetDeliveryCountyResponse();
    }

    /**
     * Create an instance of {@link ProductPriceUpdateFromData }
     * 
     */
    public ProductPriceUpdateFromData createProductPriceUpdateFromData() {
        return new ProductPriceUpdateFromData();
    }

    /**
     * Create an instance of {@link CompanyDeleteCustomFieldResponse }
     * 
     */
    public CompanyDeleteCustomFieldResponse createCompanyDeleteCustomFieldResponse() {
        return new CompanyDeleteCustomFieldResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetDataArrayResponse }
     * 
     */
    public TermOfPaymentGetDataArrayResponse createTermOfPaymentGetDataArrayResponse() {
        return new TermOfPaymentGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link CreditorSetCountryResponse }
     * 
     */
    public CreditorSetCountryResponse createCreditorSetCountryResponse() {
        return new CreditorSetCountryResponse();
    }

    /**
     * Create an instance of {@link CostTypeGetAllUpdated }
     * 
     */
    public CostTypeGetAllUpdated createCostTypeGetAllUpdated() {
        return new CostTypeGetAllUpdated();
    }

    /**
     * Create an instance of {@link QuotationLineSetDeliveryDateResponse }
     * 
     */
    public QuotationLineSetDeliveryDateResponse createQuotationLineSetDeliveryDateResponse() {
        return new QuotationLineSetDeliveryDateResponse();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryGetNumberResponse }
     * 
     */
    public DocumentArchiveCategoryGetNumberResponse createDocumentArchiveCategoryGetNumberResponse() {
        return new DocumentArchiveCategoryGetNumberResponse();
    }

    /**
     * Create an instance of {@link SumIntervalGetToAccount }
     * 
     */
    public SumIntervalGetToAccount createSumIntervalGetToAccount() {
        return new SumIntervalGetToAccount();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetTermsOfDeliveryResponse }
     * 
     */
    public CurrentInvoiceSetTermsOfDeliveryResponse createCurrentInvoiceSetTermsOfDeliveryResponse() {
        return new CurrentInvoiceSetTermsOfDeliveryResponse();
    }

    /**
     * Create an instance of {@link EmployeeGetSalesPriceAfterResponse }
     * 
     */
    public EmployeeGetSalesPriceAfterResponse createEmployeeGetSalesPriceAfterResponse() {
        return new EmployeeGetSalesPriceAfterResponse();
    }

    /**
     * Create an instance of {@link DebtorGetEntriesResponse }
     * 
     */
    public DebtorGetEntriesResponse createDebtorGetEntriesResponse() {
        return new DebtorGetEntriesResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetGrossAmount }
     * 
     */
    public CurrentInvoiceGetGrossAmount createCurrentInvoiceGetGrossAmount() {
        return new CurrentInvoiceGetGrossAmount();
    }

    /**
     * Create an instance of {@link DepartmentGetDataArrayResponse }
     * 
     */
    public DepartmentGetDataArrayResponse createDepartmentGetDataArrayResponse() {
        return new DepartmentGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link EmployeeGroupCreateFromDataArray }
     * 
     */
    public EmployeeGroupCreateFromDataArray createEmployeeGroupCreateFromDataArray() {
        return new EmployeeGroupCreateFromDataArray();
    }

    /**
     * Create an instance of {@link OrderLineSetUnit }
     * 
     */
    public OrderLineSetUnit createOrderLineSetUnit() {
        return new OrderLineSetUnit();
    }

    /**
     * Create an instance of {@link ProductGroupCreateFromDataArray }
     * 
     */
    public ProductGroupCreateFromDataArray createProductGroupCreateFromDataArray() {
        return new ProductGroupCreateFromDataArray();
    }

    /**
     * Create an instance of {@link ProductSetDescription }
     * 
     */
    public ProductSetDescription createProductSetDescription() {
        return new ProductSetDescription();
    }

    /**
     * Create an instance of {@link OrderGetAllCurrent }
     * 
     */
    public OrderGetAllCurrent createOrderGetAllCurrent() {
        return new OrderGetAllCurrent();
    }

    /**
     * Create an instance of {@link InvoiceFindByNumberList }
     * 
     */
    public InvoiceFindByNumberList createInvoiceFindByNumberList() {
        return new InvoiceFindByNumberList();
    }

    /**
     * Create an instance of {@link CostTypeGroupGetAccountClosed }
     * 
     */
    public CostTypeGroupGetAccountClosed createCostTypeGroupGetAccountClosed() {
        return new CostTypeGroupGetAccountClosed();
    }

    /**
     * Create an instance of {@link CostTypeGetDataResponse }
     * 
     */
    public CostTypeGetDataResponse createCostTypeGetDataResponse() {
        return new CostTypeGetDataResponse();
    }

    /**
     * Create an instance of {@link CostTypeData }
     * 
     */
    public CostTypeData createCostTypeData() {
        return new CostTypeData();
    }

    /**
     * Create an instance of {@link DeliveryLocationSetCountry }
     * 
     */
    public DeliveryLocationSetCountry createDeliveryLocationSetCountry() {
        return new DeliveryLocationSetCountry();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDebtorPostalCodeResponse }
     * 
     */
    public CurrentInvoiceSetDebtorPostalCodeResponse createCurrentInvoiceSetDebtorPostalCodeResponse() {
        return new CurrentInvoiceSetDebtorPostalCodeResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetDepartment }
     * 
     */
    public CurrentInvoiceLineSetDepartment createCurrentInvoiceLineSetDepartment() {
        return new CurrentInvoiceLineSetDepartment();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetPageCount }
     * 
     */
    public ScannedDocumentGetPageCount createScannedDocumentGetPageCount() {
        return new ScannedDocumentGetPageCount();
    }

    /**
     * Create an instance of {@link DebtorContactGetData }
     * 
     */
    public DebtorContactGetData createDebtorContactGetData() {
        return new DebtorContactGetData();
    }

    /**
     * Create an instance of {@link CompanyGetEmailResponse }
     * 
     */
    public CompanyGetEmailResponse createCompanyGetEmailResponse() {
        return new CompanyGetEmailResponse();
    }

    /**
     * Create an instance of {@link TimeEntryDelete }
     * 
     */
    public TimeEntryDelete createTimeEntryDelete() {
        return new TimeEntryDelete();
    }

    /**
     * Create an instance of {@link MileageEntrySetDistanceResponse }
     * 
     */
    public MileageEntrySetDistanceResponse createMileageEntrySetDistanceResponse() {
        return new MileageEntrySetDistanceResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureGetAmountDefaultCurrency }
     * 
     */
    public BudgetFigureGetAmountDefaultCurrency createBudgetFigureGetAmountDefaultCurrency() {
        return new BudgetFigureGetAmountDefaultCurrency();
    }

    /**
     * Create an instance of {@link InvoiceLineFindByProductListResponse }
     * 
     */
    public InvoiceLineFindByProductListResponse createInvoiceLineFindByProductListResponse() {
        return new InvoiceLineFindByProductListResponse();
    }

    /**
     * Create an instance of {@link CreditorCreateFromDataArrayResponse }
     * 
     */
    public CreditorCreateFromDataArrayResponse createCreditorCreateFromDataArrayResponse() {
        return new CreditorCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link ProductGetDataArray }
     * 
     */
    public ProductGetDataArray createProductGetDataArray() {
        return new ProductGetDataArray();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceUpdateFromDataResponse }
     * 
     */
    public CurrentSupplierInvoiceUpdateFromDataResponse createCurrentSupplierInvoiceUpdateFromDataResponse() {
        return new CurrentSupplierInvoiceUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link AccountingPeriodGetPeriod }
     * 
     */
    public AccountingPeriodGetPeriod createAccountingPeriodGetPeriod() {
        return new AccountingPeriodGetPeriod();
    }

    /**
     * Create an instance of {@link CreditorSetNameResponse }
     * 
     */
    public CreditorSetNameResponse createCreditorSetNameResponse() {
        return new CreditorSetNameResponse();
    }

    /**
     * Create an instance of {@link CreditorEntryGetSerialNumberResponse }
     * 
     */
    public CreditorEntryGetSerialNumberResponse createCreditorEntryGetSerialNumberResponse() {
        return new CreditorEntryGetSerialNumberResponse();
    }

    /**
     * Create an instance of {@link CompanySetTelephoneNumber }
     * 
     */
    public CompanySetTelephoneNumber createCompanySetTelephoneNumber() {
        return new CompanySetTelephoneNumber();
    }

    /**
     * Create an instance of {@link InvoiceGetOtherReferenceResponse }
     * 
     */
    public InvoiceGetOtherReferenceResponse createInvoiceGetOtherReferenceResponse() {
        return new InvoiceGetOtherReferenceResponse();
    }

    /**
     * Create an instance of {@link EmployeeSetName }
     * 
     */
    public EmployeeSetName createEmployeeSetName() {
        return new EmployeeSetName();
    }

    /**
     * Create an instance of {@link OrderGetProject }
     * 
     */
    public OrderGetProject createOrderGetProject() {
        return new OrderGetProject();
    }

    /**
     * Create an instance of {@link CreditorGroupGetCreditors }
     * 
     */
    public CreditorGroupGetCreditors createCreditorGroupGetCreditors() {
        return new CreditorGroupGetCreditors();
    }

    /**
     * Create an instance of {@link BankPaymentTypeGetDataArrayResponse }
     * 
     */
    public BankPaymentTypeGetDataArrayResponse createBankPaymentTypeGetDataArrayResponse() {
        return new BankPaymentTypeGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBankPaymentTypeData }
     * 
     */
    public ArrayOfBankPaymentTypeData createArrayOfBankPaymentTypeData() {
        return new ArrayOfBankPaymentTypeData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetIsVatIncludedResponse }
     * 
     */
    public CurrentInvoiceSetIsVatIncludedResponse createCurrentInvoiceSetIsVatIncludedResponse() {
        return new CurrentInvoiceSetIsVatIncludedResponse();
    }

    /**
     * Create an instance of {@link QuotationGetPdfResponse }
     * 
     */
    public QuotationGetPdfResponse createQuotationGetPdfResponse() {
        return new QuotationGetPdfResponse();
    }

    /**
     * Create an instance of {@link DebtorContactGetEmail }
     * 
     */
    public DebtorContactGetEmail createDebtorContactGetEmail() {
        return new DebtorContactGetEmail();
    }

    /**
     * Create an instance of {@link SubscriptionDeleteResponse }
     * 
     */
    public SubscriptionDeleteResponse createSubscriptionDeleteResponse() {
        return new SubscriptionDeleteResponse();
    }

    /**
     * Create an instance of {@link MileageEntrySetEndLocation }
     * 
     */
    public MileageEntrySetEndLocation createMileageEntrySetEndLocation() {
        return new MileageEntrySetEndLocation();
    }

    /**
     * Create an instance of {@link SubscriptionLineSetQuantity }
     * 
     */
    public SubscriptionLineSetQuantity createSubscriptionLineSetQuantity() {
        return new SubscriptionLineSetQuantity();
    }

    /**
     * Create an instance of {@link TermOfPaymentSetContraAccount2Response }
     * 
     */
    public TermOfPaymentSetContraAccount2Response createTermOfPaymentSetContraAccount2Response() {
        return new TermOfPaymentSetContraAccount2Response();
    }

    /**
     * Create an instance of {@link SumIntervalSetToAccount }
     * 
     */
    public SumIntervalSetToAccount createSumIntervalSetToAccount() {
        return new SumIntervalSetToAccount();
    }

    /**
     * Create an instance of {@link SubscriptionGetAllowMoreThanOneForEachDebtorResponse }
     * 
     */
    public SubscriptionGetAllowMoreThanOneForEachDebtorResponse createSubscriptionGetAllowMoreThanOneForEachDebtorResponse() {
        return new SubscriptionGetAllowMoreThanOneForEachDebtorResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetTextLine1Response }
     * 
     */
    public CurrentInvoiceGetTextLine1Response createCurrentInvoiceGetTextLine1Response() {
        return new CurrentInvoiceGetTextLine1Response();
    }

    /**
     * Create an instance of {@link EntryGetType }
     * 
     */
    public EntryGetType createEntryGetType() {
        return new EntryGetType();
    }

    /**
     * Create an instance of {@link CurrentInvoiceBook }
     * 
     */
    public CurrentInvoiceBook createCurrentInvoiceBook() {
        return new CurrentInvoiceBook();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetAllResponse }
     * 
     */
    public SubscriptionLineGetAllResponse createSubscriptionLineGetAllResponse() {
        return new SubscriptionLineGetAllResponse();
    }

    /**
     * Create an instance of {@link CreditorContactGetNumber }
     * 
     */
    public CreditorContactGetNumber createCreditorContactGetNumber() {
        return new CreditorContactGetNumber();
    }

    /**
     * Create an instance of {@link AccountCreateFromData }
     * 
     */
    public AccountCreateFromData createAccountCreateFromData() {
        return new AccountCreateFromData();
    }

    /**
     * Create an instance of {@link CreditorGroupSetAccountResponse }
     * 
     */
    public CreditorGroupSetAccountResponse createCreditorGroupSetAccountResponse() {
        return new CreditorGroupSetAccountResponse();
    }

    /**
     * Create an instance of {@link CreditorEntryGetRemainder }
     * 
     */
    public CreditorEntryGetRemainder createCreditorEntryGetRemainder() {
        return new CreditorEntryGetRemainder();
    }

    /**
     * Create an instance of {@link OrderSetTermsOfDeliveryResponse }
     * 
     */
    public OrderSetTermsOfDeliveryResponse createOrderSetTermsOfDeliveryResponse() {
        return new OrderSetTermsOfDeliveryResponse();
    }

    /**
     * Create an instance of {@link ProjectSetDescription }
     * 
     */
    public ProjectSetDescription createProjectSetDescription() {
        return new ProjectSetDescription();
    }

    /**
     * Create an instance of {@link OrderGetDeliveryCounty }
     * 
     */
    public OrderGetDeliveryCounty createOrderGetDeliveryCounty() {
        return new OrderGetDeliveryCounty();
    }

    /**
     * Create an instance of {@link ScannedDocumentFindByVoucherNumberResponse }
     * 
     */
    public ScannedDocumentFindByVoucherNumberResponse createScannedDocumentFindByVoucherNumberResponse() {
        return new ScannedDocumentFindByVoucherNumberResponse();
    }

    /**
     * Create an instance of {@link CreditorContactSetNameResponse }
     * 
     */
    public CreditorContactSetNameResponse createCreditorContactSetNameResponse() {
        return new CreditorContactSetNameResponse();
    }

    /**
     * Create an instance of {@link AccountGetAllUpdated }
     * 
     */
    public AccountGetAllUpdated createAccountGetAllUpdated() {
        return new AccountGetAllUpdated();
    }

    /**
     * Create an instance of {@link ActivityGetNumberResponse }
     * 
     */
    public ActivityGetNumberResponse createActivityGetNumberResponse() {
        return new ActivityGetNumberResponse();
    }

    /**
     * Create an instance of {@link CostTypeGetCostTypeGroupResponse }
     * 
     */
    public CostTypeGetCostTypeGroupResponse createCostTypeGetCostTypeGroupResponse() {
        return new CostTypeGetCostTypeGroupResponse();
    }

    /**
     * Create an instance of {@link CashBookGetAll }
     * 
     */
    public CashBookGetAll createCashBookGetAll() {
        return new CashBookGetAll();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetDescriptionResponse }
     * 
     */
    public CurrentInvoiceLineSetDescriptionResponse createCurrentInvoiceLineSetDescriptionResponse() {
        return new CurrentInvoiceLineSetDescriptionResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetAllResponse }
     * 
     */
    public DeliveryLocationGetAllResponse createDeliveryLocationGetAllResponse() {
        return new DeliveryLocationGetAllResponse();
    }

    /**
     * Create an instance of {@link EmployeeGetDataResponse }
     * 
     */
    public EmployeeGetDataResponse createEmployeeGetDataResponse() {
        return new EmployeeGetDataResponse();
    }

    /**
     * Create an instance of {@link ProjectCreateFromDataResponse }
     * 
     */
    public ProjectCreateFromDataResponse createProjectCreateFromDataResponse() {
        return new ProjectCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link ReportCodeGetParentCodeResponse }
     * 
     */
    public ReportCodeGetParentCodeResponse createReportCodeGetParentCodeResponse() {
        return new ReportCodeGetParentCodeResponse();
    }

    /**
     * Create an instance of {@link ProjectGetEntries }
     * 
     */
    public ProjectGetEntries createProjectGetEntries() {
        return new ProjectGetEntries();
    }

    /**
     * Create an instance of {@link CostTypeGroupGetDataArrayResponse }
     * 
     */
    public CostTypeGroupGetDataArrayResponse createCostTypeGroupGetDataArrayResponse() {
        return new CostTypeGroupGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCostTypeGroupData }
     * 
     */
    public ArrayOfCostTypeGroupData createArrayOfCostTypeGroupData() {
        return new ArrayOfCostTypeGroupData();
    }

    /**
     * Create an instance of {@link EmployeeGetTimeEntriesResponse }
     * 
     */
    public EmployeeGetTimeEntriesResponse createEmployeeGetTimeEntriesResponse() {
        return new EmployeeGetTimeEntriesResponse();
    }

    /**
     * Create an instance of {@link SubscriberUpdateFromDataResponse }
     * 
     */
    public SubscriberUpdateFromDataResponse createSubscriberUpdateFromDataResponse() {
        return new SubscriberUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link CompanyDeleteCustomField }
     * 
     */
    public CompanyDeleteCustomField createCompanyDeleteCustomField() {
        return new CompanyDeleteCustomField();
    }

    /**
     * Create an instance of {@link CashBookEntryGetVoucherNumber }
     * 
     */
    public CashBookEntryGetVoucherNumber createCashBookEntryGetVoucherNumber() {
        return new CashBookEntryGetVoucherNumber();
    }

    /**
     * Create an instance of {@link OrderGetAttention }
     * 
     */
    public OrderGetAttention createOrderGetAttention() {
        return new OrderGetAttention();
    }

    /**
     * Create an instance of {@link ProjectGroupFindByNumber }
     * 
     */
    public ProjectGroupFindByNumber createProjectGroupFindByNumber() {
        return new ProjectGroupFindByNumber();
    }

    /**
     * Create an instance of {@link QuotationGetDeliveryCountryResponse }
     * 
     */
    public QuotationGetDeliveryCountryResponse createQuotationGetDeliveryCountryResponse() {
        return new QuotationGetDeliveryCountryResponse();
    }

    /**
     * Create an instance of {@link EmployeeGroupGetEmployeesResponse }
     * 
     */
    public EmployeeGroupGetEmployeesResponse createEmployeeGroupGetEmployeesResponse() {
        return new EmployeeGroupGetEmployeesResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetDebtorResponse }
     * 
     */
    public TermOfPaymentGetDebtorResponse createTermOfPaymentGetDebtorResponse() {
        return new TermOfPaymentGetDebtorResponse();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryFindByNumber }
     * 
     */
    public DocumentArchiveCategoryFindByNumber createDocumentArchiveCategoryFindByNumber() {
        return new DocumentArchiveCategoryFindByNumber();
    }

    /**
     * Create an instance of {@link DebtorGroupSetAccountResponse }
     * 
     */
    public DebtorGroupSetAccountResponse createDebtorGroupSetAccountResponse() {
        return new DebtorGroupSetAccountResponse();
    }

    /**
     * Create an instance of {@link UnitFindByNumber }
     * 
     */
    public UnitFindByNumber createUnitFindByNumber() {
        return new UnitFindByNumber();
    }

    /**
     * Create an instance of {@link InvoiceGetDebtorPostalCodeResponse }
     * 
     */
    public InvoiceGetDebtorPostalCodeResponse createInvoiceGetDebtorPostalCodeResponse() {
        return new InvoiceGetDebtorPostalCodeResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetOurReference2Response }
     * 
     */
    public InvoiceGetOurReference2Response createInvoiceGetOurReference2Response() {
        return new InvoiceGetOurReference2Response();
    }

    /**
     * Create an instance of {@link TimeEntryGetSalesPriceResponse }
     * 
     */
    public TimeEntryGetSalesPriceResponse createTimeEntryGetSalesPriceResponse() {
        return new TimeEntryGetSalesPriceResponse();
    }

    /**
     * Create an instance of {@link ProjectSetIsAccessibleResponse }
     * 
     */
    public ProjectSetIsAccessibleResponse createProjectSetIsAccessibleResponse() {
        return new ProjectSetIsAccessibleResponse();
    }

    /**
     * Create an instance of {@link ProjectGetProjectGroup }
     * 
     */
    public ProjectGetProjectGroup createProjectGetProjectGroup() {
        return new ProjectGetProjectGroup();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetCurrency }
     * 
     */
    public CurrentInvoiceGetCurrency createCurrentInvoiceGetCurrency() {
        return new CurrentInvoiceGetCurrency();
    }

    /**
     * Create an instance of {@link OrderGetGrossAmount }
     * 
     */
    public OrderGetGrossAmount createOrderGetGrossAmount() {
        return new OrderGetGrossAmount();
    }

    /**
     * Create an instance of {@link CashBookGetNextVoucherNumber }
     * 
     */
    public CashBookGetNextVoucherNumber createCashBookGetNextVoucherNumber() {
        return new CashBookGetNextVoucherNumber();
    }

    /**
     * Create an instance of {@link OrderLineGetMarginAsPercent }
     * 
     */
    public OrderLineGetMarginAsPercent createOrderLineGetMarginAsPercent() {
        return new OrderLineGetMarginAsPercent();
    }

    /**
     * Create an instance of {@link CreditorGroupGetDataArrayResponse }
     * 
     */
    public CreditorGroupGetDataArrayResponse createCreditorGroupGetDataArrayResponse() {
        return new CreditorGroupGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetTermOfPaymentResponse }
     * 
     */
    public InvoiceGetTermOfPaymentResponse createInvoiceGetTermOfPaymentResponse() {
        return new InvoiceGetTermOfPaymentResponse();
    }

    /**
     * Create an instance of {@link ProductCreateResponse }
     * 
     */
    public ProductCreateResponse createProductCreateResponse() {
        return new ProductCreateResponse();
    }

    /**
     * Create an instance of {@link TimeEntryGetActivityResponse }
     * 
     */
    public TimeEntryGetActivityResponse createTimeEntryGetActivityResponse() {
        return new TimeEntryGetActivityResponse();
    }

    /**
     * Create an instance of {@link EmployeeGetSalesPriceByDate }
     * 
     */
    public EmployeeGetSalesPriceByDate createEmployeeGetSalesPriceByDate() {
        return new EmployeeGetSalesPriceByDate();
    }

    /**
     * Create an instance of {@link QuotationCreateFromDataArray }
     * 
     */
    public QuotationCreateFromDataArray createQuotationCreateFromDataArray() {
        return new QuotationCreateFromDataArray();
    }

    /**
     * Create an instance of {@link AccountingYearGetToDateResponse }
     * 
     */
    public AccountingYearGetToDateResponse createAccountingYearGetToDateResponse() {
        return new AccountingYearGetToDateResponse();
    }

    /**
     * Create an instance of {@link CreditorGetAllUpdatedResponse }
     * 
     */
    public CreditorGetAllUpdatedResponse createCreditorGetAllUpdatedResponse() {
        return new CreditorGetAllUpdatedResponse();
    }

    /**
     * Create an instance of {@link CostTypeGroupGetData }
     * 
     */
    public CostTypeGroupGetData createCostTypeGroupGetData() {
        return new CostTypeGroupGetData();
    }

    /**
     * Create an instance of {@link OrderLineSetQuantity }
     * 
     */
    public OrderLineSetQuantity createOrderLineSetQuantity() {
        return new OrderLineSetQuantity();
    }

    /**
     * Create an instance of {@link TermOfPaymentUpdateFromDataResponse }
     * 
     */
    public TermOfPaymentUpdateFromDataResponse createTermOfPaymentUpdateFromDataResponse() {
        return new TermOfPaymentUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link TimeEntryUpdateFromDataArrayResponse }
     * 
     */
    public TimeEntryUpdateFromDataArrayResponse createTimeEntryUpdateFromDataArrayResponse() {
        return new TimeEntryUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CompanyGetDataArrayResponse }
     * 
     */
    public CompanyGetDataArrayResponse createCompanyGetDataArrayResponse() {
        return new CompanyGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link OrderSetDeliveryAddressResponse }
     * 
     */
    public OrderSetDeliveryAddressResponse createOrderSetDeliveryAddressResponse() {
        return new OrderSetDeliveryAddressResponse();
    }

    /**
     * Create an instance of {@link QuotationSetDebtorEan }
     * 
     */
    public QuotationSetDebtorEan createQuotationSetDebtorEan() {
        return new QuotationSetDebtorEan();
    }

    /**
     * Create an instance of {@link EmployeeGetSalesPriceAfter }
     * 
     */
    public EmployeeGetSalesPriceAfter createEmployeeGetSalesPriceAfter() {
        return new EmployeeGetSalesPriceAfter();
    }

    /**
     * Create an instance of {@link TemplateCollectionGetData }
     * 
     */
    public TemplateCollectionGetData createTemplateCollectionGetData() {
        return new TemplateCollectionGetData();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetVoucherNumber }
     * 
     */
    public ScannedDocumentGetVoucherNumber createScannedDocumentGetVoucherNumber() {
        return new ScannedDocumentGetVoucherNumber();
    }

    /**
     * Create an instance of {@link QuotationSetCurrencyResponse }
     * 
     */
    public QuotationSetCurrencyResponse createQuotationSetCurrencyResponse() {
        return new QuotationSetCurrencyResponse();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetFromDateResponse }
     * 
     */
    public ScannedDocumentGetFromDateResponse createScannedDocumentGetFromDateResponse() {
        return new ScannedDocumentGetFromDateResponse();
    }

    /**
     * Create an instance of {@link ProjectGetDataArray }
     * 
     */
    public ProjectGetDataArray createProjectGetDataArray() {
        return new ProjectGetDataArray();
    }

    /**
     * Create an instance of {@link OrderLineUpdateFromDataResponse }
     * 
     */
    public OrderLineUpdateFromDataResponse createOrderLineUpdateFromDataResponse() {
        return new OrderLineUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link ProjectFindByNumber }
     * 
     */
    public ProjectFindByNumber createProjectFindByNumber() {
        return new ProjectFindByNumber();
    }

    /**
     * Create an instance of {@link DistributionKeyUpdateFromDataResponse }
     * 
     */
    public DistributionKeyUpdateFromDataResponse createDistributionKeyUpdateFromDataResponse() {
        return new DistributionKeyUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link CreditorGroupFindByNumberResponse }
     * 
     */
    public CreditorGroupFindByNumberResponse createCreditorGroupFindByNumberResponse() {
        return new CreditorGroupFindByNumberResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetExchangeRateResponse }
     * 
     */
    public CurrentInvoiceSetExchangeRateResponse createCurrentInvoiceSetExchangeRateResponse() {
        return new CurrentInvoiceSetExchangeRateResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureSetDepartment }
     * 
     */
    public BudgetFigureSetDepartment createBudgetFigureSetDepartment() {
        return new BudgetFigureSetDepartment();
    }

    /**
     * Create an instance of {@link AccountCreateFromDataArray }
     * 
     */
    public AccountCreateFromDataArray createAccountCreateFromDataArray() {
        return new AccountCreateFromDataArray();
    }

    /**
     * Create an instance of {@link OrderSetDebtorAddress }
     * 
     */
    public OrderSetDebtorAddress createOrderSetDebtorAddress() {
        return new OrderSetDebtorAddress();
    }

    /**
     * Create an instance of {@link CreditorContactSetEmail }
     * 
     */
    public CreditorContactSetEmail createCreditorContactSetEmail() {
        return new CreditorContactSetEmail();
    }

    /**
     * Create an instance of {@link CreditorContactGetCommentsResponse }
     * 
     */
    public CreditorContactGetCommentsResponse createCreditorContactGetCommentsResponse() {
        return new CreditorContactGetCommentsResponse();
    }

    /**
     * Create an instance of {@link AccountSetType }
     * 
     */
    public AccountSetType createAccountSetType() {
        return new AccountSetType();
    }

    /**
     * Create an instance of {@link InvoiceGetDeliveryCity }
     * 
     */
    public InvoiceGetDeliveryCity createInvoiceGetDeliveryCity() {
        return new InvoiceGetDeliveryCity();
    }

    /**
     * Create an instance of {@link OrderLineSetQuantityResponse }
     * 
     */
    public OrderLineSetQuantityResponse createOrderLineSetQuantityResponse() {
        return new OrderLineSetQuantityResponse();
    }

    /**
     * Create an instance of {@link DebtorGetQuotations }
     * 
     */
    public DebtorGetQuotations createDebtorGetQuotations() {
        return new DebtorGetQuotations();
    }

    /**
     * Create an instance of {@link CashBookGetData }
     * 
     */
    public CashBookGetData createCashBookGetData() {
        return new CashBookGetData();
    }

    /**
     * Create an instance of {@link TermOfPaymentCreateFromData }
     * 
     */
    public TermOfPaymentCreateFromData createTermOfPaymentCreateFromData() {
        return new TermOfPaymentCreateFromData();
    }

    /**
     * Create an instance of {@link CreditorEntryGetAmountDefaultCurrencyResponse }
     * 
     */
    public CreditorEntryGetAmountDefaultCurrencyResponse createCreditorEntryGetAmountDefaultCurrencyResponse() {
        return new CreditorEntryGetAmountDefaultCurrencyResponse();
    }

    /**
     * Create an instance of {@link DistributionKeyGetNumberResponse }
     * 
     */
    public DistributionKeyGetNumberResponse createDistributionKeyGetNumberResponse() {
        return new DistributionKeyGetNumberResponse();
    }

    /**
     * Create an instance of {@link SumIntervalCreate }
     * 
     */
    public SumIntervalCreate createSumIntervalCreate() {
        return new SumIntervalCreate();
    }

    /**
     * Create an instance of {@link SumIntervalGetToAccountResponse }
     * 
     */
    public SumIntervalGetToAccountResponse createSumIntervalGetToAccountResponse() {
        return new SumIntervalGetToAccountResponse();
    }

    /**
     * Create an instance of {@link VatAccountUpdateFromDataResponse }
     * 
     */
    public VatAccountUpdateFromDataResponse createVatAccountUpdateFromDataResponse() {
        return new VatAccountUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link OrderCreateResponse }
     * 
     */
    public OrderCreateResponse createOrderCreateResponse() {
        return new OrderCreateResponse();
    }

    /**
     * Create an instance of {@link TemplateCollectionSetNameResponse }
     * 
     */
    public TemplateCollectionSetNameResponse createTemplateCollectionSetNameResponse() {
        return new TemplateCollectionSetNameResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetBankPaymentCreditorId }
     * 
     */
    public CashBookEntryGetBankPaymentCreditorId createCashBookEntryGetBankPaymentCreditorId() {
        return new CashBookEntryGetBankPaymentCreditorId();
    }

    /**
     * Create an instance of {@link DebtorEntryGetAccountResponse }
     * 
     */
    public DebtorEntryGetAccountResponse createDebtorEntryGetAccountResponse() {
        return new DebtorEntryGetAccountResponse();
    }

    /**
     * Create an instance of {@link QuotationSetDebtorAddressResponse }
     * 
     */
    public QuotationSetDebtorAddressResponse createQuotationSetDebtorAddressResponse() {
        return new QuotationSetDebtorAddressResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentSetDebtor }
     * 
     */
    public TermOfPaymentSetDebtor createTermOfPaymentSetDebtor() {
        return new TermOfPaymentSetDebtor();
    }

    /**
     * Create an instance of {@link BankPaymentTypeFindByNameResponse }
     * 
     */
    public BankPaymentTypeFindByNameResponse createBankPaymentTypeFindByNameResponse() {
        return new BankPaymentTypeFindByNameResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetTotalNetAmountResponse }
     * 
     */
    public OrderLineGetTotalNetAmountResponse createOrderLineGetTotalNetAmountResponse() {
        return new OrderLineGetTotalNetAmountResponse();
    }

    /**
     * Create an instance of {@link ProjectGroupFindByNumberResponse }
     * 
     */
    public ProjectGroupFindByNumberResponse createProjectGroupFindByNumberResponse() {
        return new ProjectGroupFindByNumberResponse();
    }

    /**
     * Create an instance of {@link EmployeeGetGroup }
     * 
     */
    public EmployeeGetGroup createEmployeeGetGroup() {
        return new EmployeeGetGroup();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategorySetName }
     * 
     */
    public DocumentArchiveCategorySetName createDocumentArchiveCategorySetName() {
        return new DocumentArchiveCategorySetName();
    }

    /**
     * Create an instance of {@link CreditorContactSetExternalId }
     * 
     */
    public CreditorContactSetExternalId createCreditorContactSetExternalId() {
        return new CreditorContactSetExternalId();
    }

    /**
     * Create an instance of {@link ProjectGetResponsibleResponse }
     * 
     */
    public ProjectGetResponsibleResponse createProjectGetResponsibleResponse() {
        return new ProjectGetResponsibleResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetYourReferenceResponse }
     * 
     */
    public InvoiceGetYourReferenceResponse createInvoiceGetYourReferenceResponse() {
        return new InvoiceGetYourReferenceResponse();
    }

    /**
     * Create an instance of {@link InventoryLocationGetNumber }
     * 
     */
    public InventoryLocationGetNumber createInventoryLocationGetNumber() {
        return new InventoryLocationGetNumber();
    }

    /**
     * Create an instance of {@link CashBookEntrySetCreditor }
     * 
     */
    public CashBookEntrySetCreditor createCashBookEntrySetCreditor() {
        return new CashBookEntrySetCreditor();
    }

    /**
     * Create an instance of {@link DebtorGroupGetDataResponse }
     * 
     */
    public DebtorGroupGetDataResponse createDebtorGroupGetDataResponse() {
        return new DebtorGroupGetDataResponse();
    }

    /**
     * Create an instance of {@link ProjectGroupGetProjectsResponse }
     * 
     */
    public ProjectGroupGetProjectsResponse createProjectGroupGetProjectsResponse() {
        return new ProjectGroupGetProjectsResponse();
    }

    /**
     * Create an instance of {@link EmployeeSetCostPriceAfterResponse }
     * 
     */
    public EmployeeSetCostPriceAfterResponse createEmployeeSetCostPriceAfterResponse() {
        return new EmployeeSetCostPriceAfterResponse();
    }

    /**
     * Create an instance of {@link SubscriptionLineSetDepartment }
     * 
     */
    public SubscriptionLineSetDepartment createSubscriptionLineSetDepartment() {
        return new SubscriptionLineSetDepartment();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryCreateFromDataArrayResponse }
     * 
     */
    public DocumentArchiveCategoryCreateFromDataArrayResponse createDocumentArchiveCategoryCreateFromDataArrayResponse() {
        return new DocumentArchiveCategoryCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetTermOfPayment }
     * 
     */
    public CurrentInvoiceGetTermOfPayment createCurrentInvoiceGetTermOfPayment() {
        return new CurrentInvoiceGetTermOfPayment();
    }

    /**
     * Create an instance of {@link EmployeeGroupFindByNumberListResponse }
     * 
     */
    public EmployeeGroupFindByNumberListResponse createEmployeeGroupFindByNumberListResponse() {
        return new EmployeeGroupFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineGetUnitCostPriceResponse }
     * 
     */
    public InvoiceLineGetUnitCostPriceResponse createInvoiceLineGetUnitCostPriceResponse() {
        return new InvoiceLineGetUnitCostPriceResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceGetAllResponse }
     * 
     */
    public CurrentSupplierInvoiceGetAllResponse createCurrentSupplierInvoiceGetAllResponse() {
        return new CurrentSupplierInvoiceGetAllResponse();
    }

    /**
     * Create an instance of {@link QuotationGetAllCurrent }
     * 
     */
    public QuotationGetAllCurrent createQuotationGetAllCurrent() {
        return new QuotationGetAllCurrent();
    }

    /**
     * Create an instance of {@link CreditorGroupCreateResponse }
     * 
     */
    public CreditorGroupCreateResponse createCreditorGroupCreateResponse() {
        return new CreditorGroupCreateResponse();
    }

    /**
     * Create an instance of {@link TimeEntryFindApprovedByDate }
     * 
     */
    public TimeEntryFindApprovedByDate createTimeEntryFindApprovedByDate() {
        return new TimeEntryFindApprovedByDate();
    }

    /**
     * Create an instance of {@link TimeEntryUpdateFromData }
     * 
     */
    public TimeEntryUpdateFromData createTimeEntryUpdateFromData() {
        return new TimeEntryUpdateFromData();
    }

    /**
     * Create an instance of {@link EmployeeCreateFromDataArrayResponse }
     * 
     */
    public EmployeeCreateFromDataArrayResponse createEmployeeCreateFromDataArrayResponse() {
        return new EmployeeCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link AccountingPeriodGetAllResponse }
     * 
     */
    public AccountingPeriodGetAllResponse createAccountingPeriodGetAllResponse() {
        return new AccountingPeriodGetAllResponse();
    }

    /**
     * Create an instance of {@link CreditorEntryGetText }
     * 
     */
    public CreditorEntryGetText createCreditorEntryGetText() {
        return new CreditorEntryGetText();
    }

    /**
     * Create an instance of {@link OrderLineSetProductResponse }
     * 
     */
    public OrderLineSetProductResponse createOrderLineSetProductResponse() {
        return new OrderLineSetProductResponse();
    }

    /**
     * Create an instance of {@link ExtendedVatZoneFindByNumberResponse }
     * 
     */
    public ExtendedVatZoneFindByNumberResponse createExtendedVatZoneFindByNumberResponse() {
        return new ExtendedVatZoneFindByNumberResponse();
    }

    /**
     * Create an instance of {@link SubscriptionCreate }
     * 
     */
    public SubscriptionCreate createSubscriptionCreate() {
        return new SubscriptionCreate();
    }

    /**
     * Create an instance of {@link TimeEntryGetEmployeeResponse }
     * 
     */
    public TimeEntryGetEmployeeResponse createTimeEntryGetEmployeeResponse() {
        return new TimeEntryGetEmployeeResponse();
    }

    /**
     * Create an instance of {@link QuotationSetDebtorPostalCode }
     * 
     */
    public QuotationSetDebtorPostalCode createQuotationSetDebtorPostalCode() {
        return new QuotationSetDebtorPostalCode();
    }

    /**
     * Create an instance of {@link CashBookEntrySetAccrualInformation }
     * 
     */
    public CashBookEntrySetAccrualInformation createCashBookEntrySetAccrualInformation() {
        return new CashBookEntrySetAccrualInformation();
    }

    /**
     * Create an instance of {@link DebtorGroupGetNumber }
     * 
     */
    public DebtorGroupGetNumber createDebtorGroupGetNumber() {
        return new DebtorGroupGetNumber();
    }

    /**
     * Create an instance of {@link InvoiceGetDebtorAddress }
     * 
     */
    public InvoiceGetDebtorAddress createInvoiceGetDebtorAddress() {
        return new InvoiceGetDebtorAddress();
    }

    /**
     * Create an instance of {@link SubscriberGetExpiryDateResponse }
     * 
     */
    public SubscriberGetExpiryDateResponse createSubscriberGetExpiryDateResponse() {
        return new SubscriberGetExpiryDateResponse();
    }

    /**
     * Create an instance of {@link OrderSetPublicEntryNumberResponse }
     * 
     */
    public OrderSetPublicEntryNumberResponse createOrderSetPublicEntryNumberResponse() {
        return new OrderSetPublicEntryNumberResponse();
    }

    /**
     * Create an instance of {@link DistributionKeyGetIsAccessible }
     * 
     */
    public DistributionKeyGetIsAccessible createDistributionKeyGetIsAccessible() {
        return new DistributionKeyGetIsAccessible();
    }

    /**
     * Create an instance of {@link CashBookEntrySetCurrency }
     * 
     */
    public CashBookEntrySetCurrency createCashBookEntrySetCurrency() {
        return new CashBookEntrySetCurrency();
    }

    /**
     * Create an instance of {@link OrderFindByNumberIntervalResponse }
     * 
     */
    public OrderFindByNumberIntervalResponse createOrderFindByNumberIntervalResponse() {
        return new OrderFindByNumberIntervalResponse();
    }

    /**
     * Create an instance of {@link OrderGetLines }
     * 
     */
    public OrderGetLines createOrderGetLines() {
        return new OrderGetLines();
    }

    /**
     * Create an instance of {@link TermOfPaymentCreateFromDataResponse }
     * 
     */
    public TermOfPaymentCreateFromDataResponse createTermOfPaymentCreateFromDataResponse() {
        return new TermOfPaymentCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetSubscriptionResponse }
     * 
     */
    public SubscriptionLineGetSubscriptionResponse createSubscriptionLineGetSubscriptionResponse() {
        return new SubscriptionLineGetSubscriptionResponse();
    }

    /**
     * Create an instance of {@link VatAccountGetAccountResponse }
     * 
     */
    public VatAccountGetAccountResponse createVatAccountGetAccountResponse() {
        return new VatAccountGetAccountResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineGetDataResponse }
     * 
     */
    public InvoiceLineGetDataResponse createInvoiceLineGetDataResponse() {
        return new InvoiceLineGetDataResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineData }
     * 
     */
    public InvoiceLineData createInvoiceLineData() {
        return new InvoiceLineData();
    }

    /**
     * Create an instance of {@link AccountingYearGetDataArrayResponse }
     * 
     */
    public AccountingYearGetDataArrayResponse createAccountingYearGetDataArrayResponse() {
        return new AccountingYearGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link CostTypeFindByNumber }
     * 
     */
    public CostTypeFindByNumber createCostTypeFindByNumber() {
        return new CostTypeFindByNumber();
    }

    /**
     * Create an instance of {@link InvoiceGetDataArrayResponse }
     * 
     */
    public InvoiceGetDataArrayResponse createInvoiceGetDataArrayResponse() {
        return new InvoiceGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInvoiceData }
     * 
     */
    public ArrayOfInvoiceData createArrayOfInvoiceData() {
        return new ArrayOfInvoiceData();
    }

    /**
     * Create an instance of {@link DebtorContactSetCommentsResponse }
     * 
     */
    public DebtorContactSetCommentsResponse createDebtorContactSetCommentsResponse() {
        return new DebtorContactSetCommentsResponse();
    }

    /**
     * Create an instance of {@link AccountingYearCreateFromData }
     * 
     */
    public AccountingYearCreateFromData createAccountingYearCreateFromData() {
        return new AccountingYearCreateFromData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceCreateFromDataArrayResponse }
     * 
     */
    public CurrentInvoiceCreateFromDataArrayResponse createCurrentInvoiceCreateFromDataArrayResponse() {
        return new CurrentInvoiceCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link QuotationLineUpdateFromData }
     * 
     */
    public QuotationLineUpdateFromData createQuotationLineUpdateFromData() {
        return new QuotationLineUpdateFromData();
    }

    /**
     * Create an instance of {@link TemplateCollectionSetName }
     * 
     */
    public TemplateCollectionSetName createTemplateCollectionSetName() {
        return new TemplateCollectionSetName();
    }

    /**
     * Create an instance of {@link CashBookEntryGetCostTypeResponse }
     * 
     */
    public CashBookEntryGetCostTypeResponse createCashBookEntryGetCostTypeResponse() {
        return new CashBookEntryGetCostTypeResponse();
    }

    /**
     * Create an instance of {@link OrderSetYourReferenceResponse }
     * 
     */
    public OrderSetYourReferenceResponse createOrderSetYourReferenceResponse() {
        return new OrderSetYourReferenceResponse();
    }

    /**
     * Create an instance of {@link CreditorContactGetAllResponse }
     * 
     */
    public CreditorContactGetAllResponse createCreditorContactGetAllResponse() {
        return new CreditorContactGetAllResponse();
    }

    /**
     * Create an instance of {@link EmployeeGetCostPriceBefore }
     * 
     */
    public EmployeeGetCostPriceBefore createEmployeeGetCostPriceBefore() {
        return new EmployeeGetCostPriceBefore();
    }

    /**
     * Create an instance of {@link EntryGetDataResponse }
     * 
     */
    public EntryGetDataResponse createEntryGetDataResponse() {
        return new EntryGetDataResponse();
    }

    /**
     * Create an instance of {@link EntryData }
     * 
     */
    public EntryData createEntryData() {
        return new EntryData();
    }

    /**
     * Create an instance of {@link SubscriberSetSpecialPriceResponse }
     * 
     */
    public SubscriberSetSpecialPriceResponse createSubscriberSetSpecialPriceResponse() {
        return new SubscriberSetSpecialPriceResponse();
    }

    /**
     * Create an instance of {@link DebtorGroupSetLayout }
     * 
     */
    public DebtorGroupSetLayout createDebtorGroupSetLayout() {
        return new DebtorGroupSetLayout();
    }

    /**
     * Create an instance of {@link QuotationSetOurReference2 }
     * 
     */
    public QuotationSetOurReference2 createQuotationSetOurReference2() {
        return new QuotationSetOurReference2();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineUpdateFromDataArray }
     * 
     */
    public CurrentInvoiceLineUpdateFromDataArray createCurrentInvoiceLineUpdateFromDataArray() {
        return new CurrentInvoiceLineUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link CashBookFindByNameList }
     * 
     */
    public CashBookFindByNameList createCashBookFindByNameList() {
        return new CashBookFindByNameList();
    }

    /**
     * Create an instance of {@link DebtorEntryFindBySerialNumberResponse }
     * 
     */
    public DebtorEntryFindBySerialNumberResponse createDebtorEntryFindBySerialNumberResponse() {
        return new DebtorEntryFindBySerialNumberResponse();
    }

    /**
     * Create an instance of {@link TimeEntryGetAllUpdatedResponse }
     * 
     */
    public TimeEntryGetAllUpdatedResponse createTimeEntryGetAllUpdatedResponse() {
        return new TimeEntryGetAllUpdatedResponse();
    }

    /**
     * Create an instance of {@link CreditorEntryGetDueDate }
     * 
     */
    public CreditorEntryGetDueDate createCreditorEntryGetDueDate() {
        return new CreditorEntryGetDueDate();
    }

    /**
     * Create an instance of {@link AccountSetDistributionKeyResponse }
     * 
     */
    public AccountSetDistributionKeyResponse createAccountSetDistributionKeyResponse() {
        return new AccountSetDistributionKeyResponse();
    }

    /**
     * Create an instance of {@link QuotationSetDebtorEanResponse }
     * 
     */
    public QuotationSetDebtorEanResponse createQuotationSetDebtorEanResponse() {
        return new QuotationSetDebtorEanResponse();
    }

    /**
     * Create an instance of {@link ProductGroupSetAccountForVatExemptDebtorInvoicesCurrentResponse }
     * 
     */
    public ProductGroupSetAccountForVatExemptDebtorInvoicesCurrentResponse createProductGroupSetAccountForVatExemptDebtorInvoicesCurrentResponse() {
        return new ProductGroupSetAccountForVatExemptDebtorInvoicesCurrentResponse();
    }

    /**
     * Create an instance of {@link CreditorGroupFindByNameResponse }
     * 
     */
    public CreditorGroupFindByNameResponse createCreditorGroupFindByNameResponse() {
        return new CreditorGroupFindByNameResponse();
    }

    /**
     * Create an instance of {@link ProjectGetMileageResponse }
     * 
     */
    public ProjectGetMileageResponse createProjectGetMileageResponse() {
        return new ProjectGetMileageResponse();
    }

    /**
     * Create an instance of {@link ProductGetIsAccessible }
     * 
     */
    public ProductGetIsAccessible createProductGetIsAccessible() {
        return new ProductGetIsAccessible();
    }

    /**
     * Create an instance of {@link CashBookEntryCreateResponse }
     * 
     */
    public CashBookEntryCreateResponse createCashBookEntryCreateResponse() {
        return new CashBookEntryCreateResponse();
    }

    /**
     * Create an instance of {@link InvoiceFindByOrderNumberResponse }
     * 
     */
    public InvoiceFindByOrderNumberResponse createInvoiceFindByOrderNumberResponse() {
        return new InvoiceFindByOrderNumberResponse();
    }

    /**
     * Create an instance of {@link QuotationSetTermOfPaymentResponse }
     * 
     */
    public QuotationSetTermOfPaymentResponse createQuotationSetTermOfPaymentResponse() {
        return new QuotationSetTermOfPaymentResponse();
    }

    /**
     * Create an instance of {@link VatAccountGetVatCode }
     * 
     */
    public VatAccountGetVatCode createVatAccountGetVatCode() {
        return new VatAccountGetVatCode();
    }

    /**
     * Create an instance of {@link DebtorEntryGetDataResponse }
     * 
     */
    public DebtorEntryGetDataResponse createDebtorEntryGetDataResponse() {
        return new DebtorEntryGetDataResponse();
    }

    /**
     * Create an instance of {@link DebtorEntryData }
     * 
     */
    public DebtorEntryData createDebtorEntryData() {
        return new DebtorEntryData();
    }

    /**
     * Create an instance of {@link DeliveryLocationSetPostalCode }
     * 
     */
    public DeliveryLocationSetPostalCode createDeliveryLocationSetPostalCode() {
        return new DeliveryLocationSetPostalCode();
    }

    /**
     * Create an instance of {@link ExtendedVatZoneGetData }
     * 
     */
    public ExtendedVatZoneGetData createExtendedVatZoneGetData() {
        return new ExtendedVatZoneGetData();
    }

    /**
     * Create an instance of {@link PriceGroupGetAllResponse }
     * 
     */
    public PriceGroupGetAllResponse createPriceGroupGetAllResponse() {
        return new PriceGroupGetAllResponse();
    }

    /**
     * Create an instance of {@link QuotationLineSetDistributionKeyResponse }
     * 
     */
    public QuotationLineSetDistributionKeyResponse createQuotationLineSetDistributionKeyResponse() {
        return new QuotationLineSetDistributionKeyResponse();
    }

    /**
     * Create an instance of {@link OrderGetAllUpdated }
     * 
     */
    public OrderGetAllUpdated createOrderGetAllUpdated() {
        return new OrderGetAllUpdated();
    }

    /**
     * Create an instance of {@link CashBookEntrySetAccountResponse }
     * 
     */
    public CashBookEntrySetAccountResponse createCashBookEntrySetAccountResponse() {
        return new CashBookEntrySetAccountResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDeliveryCountry }
     * 
     */
    public CurrentInvoiceSetDeliveryCountry createCurrentInvoiceSetDeliveryCountry() {
        return new CurrentInvoiceSetDeliveryCountry();
    }

    /**
     * Create an instance of {@link PriceGroupCreateResponse }
     * 
     */
    public PriceGroupCreateResponse createPriceGroupCreateResponse() {
        return new PriceGroupCreateResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceCreate }
     * 
     */
    public CurrentInvoiceCreate createCurrentInvoiceCreate() {
        return new CurrentInvoiceCreate();
    }

    /**
     * Create an instance of {@link ProductUpdateFromDataArray }
     * 
     */
    public ProductUpdateFromDataArray createProductUpdateFromDataArray() {
        return new ProductUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link EmployeeFindByNumberList }
     * 
     */
    public EmployeeFindByNumberList createEmployeeFindByNumberList() {
        return new EmployeeFindByNumberList();
    }

    /**
     * Create an instance of {@link DebtorGetAttention }
     * 
     */
    public DebtorGetAttention createDebtorGetAttention() {
        return new DebtorGetAttention();
    }

    /**
     * Create an instance of {@link InventoryLocationGetDataArray }
     * 
     */
    public InventoryLocationGetDataArray createInventoryLocationGetDataArray() {
        return new InventoryLocationGetDataArray();
    }

    /**
     * Create an instance of {@link EmployeeGetTimeEntries }
     * 
     */
    public EmployeeGetTimeEntries createEmployeeGetTimeEntries() {
        return new EmployeeGetTimeEntries();
    }

    /**
     * Create an instance of {@link OrderGetIsSentResponse }
     * 
     */
    public OrderGetIsSentResponse createOrderGetIsSentResponse() {
        return new OrderGetIsSentResponse();
    }

    /**
     * Create an instance of {@link EntryGetAccountResponse }
     * 
     */
    public EntryGetAccountResponse createEntryGetAccountResponse() {
        return new EntryGetAccountResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetPdfResponse }
     * 
     */
    public InvoiceGetPdfResponse createInvoiceGetPdfResponse() {
        return new InvoiceGetPdfResponse();
    }

    /**
     * Create an instance of {@link ProductSetIsAccessible }
     * 
     */
    public ProductSetIsAccessible createProductSetIsAccessible() {
        return new ProductSetIsAccessible();
    }

    /**
     * Create an instance of {@link UnitCreateResponse }
     * 
     */
    public UnitCreateResponse createUnitCreateResponse() {
        return new UnitCreateResponse();
    }

    /**
     * Create an instance of {@link OrderCreateFromDataResponse }
     * 
     */
    public OrderCreateFromDataResponse createOrderCreateFromDataResponse() {
        return new OrderCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link GetApiInformation }
     * 
     */
    public GetApiInformation createGetApiInformation() {
        return new GetApiInformation();
    }

    /**
     * Create an instance of {@link SubscriptionGetName }
     * 
     */
    public SubscriptionGetName createSubscriptionGetName() {
        return new SubscriptionGetName();
    }

    /**
     * Create an instance of {@link UnitUpdateFromDataArrayResponse }
     * 
     */
    public UnitUpdateFromDataArrayResponse createUnitUpdateFromDataArrayResponse() {
        return new UnitUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CreditorGetData }
     * 
     */
    public CreditorGetData createCreditorGetData() {
        return new CreditorGetData();
    }

    /**
     * Create an instance of {@link ReportCodeGetCodeResponse }
     * 
     */
    public ReportCodeGetCodeResponse createReportCodeGetCodeResponse() {
        return new ReportCodeGetCodeResponse();
    }

    /**
     * Create an instance of {@link AccountGetBlockDirectEntries }
     * 
     */
    public AccountGetBlockDirectEntries createAccountGetBlockDirectEntries() {
        return new AccountGetBlockDirectEntries();
    }

    /**
     * Create an instance of {@link ReportCodeGetData }
     * 
     */
    public ReportCodeGetData createReportCodeGetData() {
        return new ReportCodeGetData();
    }

    /**
     * Create an instance of {@link OrderLineCreateFromDataArrayResponse }
     * 
     */
    public OrderLineCreateFromDataArrayResponse createOrderLineCreateFromDataArrayResponse() {
        return new OrderLineCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link QuotationLineSetDepartment }
     * 
     */
    public QuotationLineSetDepartment createQuotationLineSetDepartment() {
        return new QuotationLineSetDepartment();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetHeading }
     * 
     */
    public CurrentInvoiceGetHeading createCurrentInvoiceGetHeading() {
        return new CurrentInvoiceGetHeading();
    }

    /**
     * Create an instance of {@link CreditorSetTermOfPayment }
     * 
     */
    public CreditorSetTermOfPayment createCreditorSetTermOfPayment() {
        return new CreditorSetTermOfPayment();
    }

    /**
     * Create an instance of {@link ProductGroupGetDataResponse }
     * 
     */
    public ProductGroupGetDataResponse createProductGroupGetDataResponse() {
        return new ProductGroupGetDataResponse();
    }

    /**
     * Create an instance of {@link CashBookEntrySetContraVatAccount }
     * 
     */
    public CashBookEntrySetContraVatAccount createCashBookEntrySetContraVatAccount() {
        return new CashBookEntrySetContraVatAccount();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineFindByProductListResponse }
     * 
     */
    public CurrentInvoiceLineFindByProductListResponse createCurrentInvoiceLineFindByProductListResponse() {
        return new CurrentInvoiceLineFindByProductListResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineGetVatAmount }
     * 
     */
    public InvoiceLineGetVatAmount createInvoiceLineGetVatAmount() {
        return new InvoiceLineGetVatAmount();
    }

    /**
     * Create an instance of {@link CreditorContactFindByName }
     * 
     */
    public CreditorContactFindByName createCreditorContactFindByName() {
        return new CreditorContactFindByName();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetDescription }
     * 
     */
    public CurrentInvoiceLineGetDescription createCurrentInvoiceLineGetDescription() {
        return new CurrentInvoiceLineGetDescription();
    }

    /**
     * Create an instance of {@link EmployeeSetCostPriceBeforeResponse }
     * 
     */
    public EmployeeSetCostPriceBeforeResponse createEmployeeSetCostPriceBeforeResponse() {
        return new EmployeeSetCostPriceBeforeResponse();
    }

    /**
     * Create an instance of {@link TimeEntryGetNumberOfHoursResponse }
     * 
     */
    public TimeEntryGetNumberOfHoursResponse createTimeEntryGetNumberOfHoursResponse() {
        return new TimeEntryGetNumberOfHoursResponse();
    }

    /**
     * Create an instance of {@link AccountSetDebitCredit }
     * 
     */
    public AccountSetDebitCredit createAccountSetDebitCredit() {
        return new AccountSetDebitCredit();
    }

    /**
     * Create an instance of {@link InvoiceGetDebtorName }
     * 
     */
    public InvoiceGetDebtorName createInvoiceGetDebtorName() {
        return new InvoiceGetDebtorName();
    }

    /**
     * Create an instance of {@link SubscriptionLineSetProductName }
     * 
     */
    public SubscriptionLineSetProductName createSubscriptionLineSetProductName() {
        return new SubscriptionLineSetProductName();
    }

    /**
     * Create an instance of {@link SubscriberSetRegisteredDateResponse }
     * 
     */
    public SubscriberSetRegisteredDateResponse createSubscriberSetRegisteredDateResponse() {
        return new SubscriberSetRegisteredDateResponse();
    }

    /**
     * Create an instance of {@link ProjectSetResponsibleResponse }
     * 
     */
    public ProjectSetResponsibleResponse createProjectSetResponsibleResponse() {
        return new ProjectSetResponsibleResponse();
    }

    /**
     * Create an instance of {@link AccountGetEntriesByDate }
     * 
     */
    public AccountGetEntriesByDate createAccountGetEntriesByDate() {
        return new AccountGetEntriesByDate();
    }

    /**
     * Create an instance of {@link AccountGetBlockDirectEntriesResponse }
     * 
     */
    public AccountGetBlockDirectEntriesResponse createAccountGetBlockDirectEntriesResponse() {
        return new AccountGetBlockDirectEntriesResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetNetAmountResponse }
     * 
     */
    public InvoiceGetNetAmountResponse createInvoiceGetNetAmountResponse() {
        return new InvoiceGetNetAmountResponse();
    }

    /**
     * Create an instance of {@link DebtorGetIsAccessible }
     * 
     */
    public DebtorGetIsAccessible createDebtorGetIsAccessible() {
        return new DebtorGetIsAccessible();
    }

    /**
     * Create an instance of {@link SubscriptionSetCalendarYearBasisResponse }
     * 
     */
    public SubscriptionSetCalendarYearBasisResponse createSubscriptionSetCalendarYearBasisResponse() {
        return new SubscriptionSetCalendarYearBasisResponse();
    }

    /**
     * Create an instance of {@link AccountingPeriodGetAccountingYearResponse }
     * 
     */
    public AccountingPeriodGetAccountingYearResponse createAccountingPeriodGetAccountingYearResponse() {
        return new AccountingPeriodGetAccountingYearResponse();
    }

    /**
     * Create an instance of {@link SubscriptionGetSubscriptionIntervalResponse }
     * 
     */
    public SubscriptionGetSubscriptionIntervalResponse createSubscriptionGetSubscriptionIntervalResponse() {
        return new SubscriptionGetSubscriptionIntervalResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetCreditorInvoiceNumber }
     * 
     */
    public CashBookEntryGetCreditorInvoiceNumber createCashBookEntryGetCreditorInvoiceNumber() {
        return new CashBookEntryGetCreditorInvoiceNumber();
    }

    /**
     * Create an instance of {@link SubscriptionLineFindBySubscriptionResponse }
     * 
     */
    public SubscriptionLineFindBySubscriptionResponse createSubscriptionLineFindBySubscriptionResponse() {
        return new SubscriptionLineFindBySubscriptionResponse();
    }

    /**
     * Create an instance of {@link TimeEntryCreateFromDataArray }
     * 
     */
    public TimeEntryCreateFromDataArray createTimeEntryCreateFromDataArray() {
        return new TimeEntryCreateFromDataArray();
    }

    /**
     * Create an instance of {@link DebtorCreateFromDataArrayResponse }
     * 
     */
    public DebtorCreateFromDataArrayResponse createDebtorCreateFromDataArrayResponse() {
        return new DebtorCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link DebtorContactUpdateFromDataArrayResponse }
     * 
     */
    public DebtorContactUpdateFromDataArrayResponse createDebtorContactUpdateFromDataArrayResponse() {
        return new DebtorContactUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CashBookGetNumberResponse }
     * 
     */
    public CashBookGetNumberResponse createCashBookGetNumberResponse() {
        return new CashBookGetNumberResponse();
    }

    /**
     * Create an instance of {@link InvoiceFindByNumberResponse }
     * 
     */
    public InvoiceFindByNumberResponse createInvoiceFindByNumberResponse() {
        return new InvoiceFindByNumberResponse();
    }

    /**
     * Create an instance of {@link OrderUpdateFromData }
     * 
     */
    public OrderUpdateFromData createOrderUpdateFromData() {
        return new OrderUpdateFromData();
    }

    /**
     * Create an instance of {@link AccountingPeriodGetAllUpdatedResponse }
     * 
     */
    public AccountingPeriodGetAllUpdatedResponse createAccountingPeriodGetAllUpdatedResponse() {
        return new AccountingPeriodGetAllUpdatedResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetExternalIdResponse }
     * 
     */
    public DeliveryLocationGetExternalIdResponse createDeliveryLocationGetExternalIdResponse() {
        return new DeliveryLocationGetExternalIdResponse();
    }

    /**
     * Create an instance of {@link AccountingYearFindByDateResponse }
     * 
     */
    public AccountingYearFindByDateResponse createAccountingYearFindByDateResponse() {
        return new AccountingYearFindByDateResponse();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetDataArray }
     * 
     */
    public SubscriptionLineGetDataArray createSubscriptionLineGetDataArray() {
        return new SubscriptionLineGetDataArray();
    }

    /**
     * Create an instance of {@link DebtorGroupGetDataArrayResponse }
     * 
     */
    public DebtorGroupGetDataArrayResponse createDebtorGroupGetDataArrayResponse() {
        return new DebtorGroupGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link OrderSetDeliveryDateResponse }
     * 
     */
    public OrderSetDeliveryDateResponse createOrderSetDeliveryDateResponse() {
        return new OrderSetDeliveryDateResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetIsAccessibleResponse }
     * 
     */
    public DeliveryLocationGetIsAccessibleResponse createDeliveryLocationGetIsAccessibleResponse() {
        return new DeliveryLocationGetIsAccessibleResponse();
    }

    /**
     * Create an instance of {@link DebtorFindByCINumber }
     * 
     */
    public DebtorFindByCINumber createDebtorFindByCINumber() {
        return new DebtorFindByCINumber();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetDataResponse }
     * 
     */
    public SubscriptionLineGetDataResponse createSubscriptionLineGetDataResponse() {
        return new SubscriptionLineGetDataResponse();
    }

    /**
     * Create an instance of {@link QuotationSetDeliveryPostalCode }
     * 
     */
    public QuotationSetDeliveryPostalCode createQuotationSetDeliveryPostalCode() {
        return new QuotationSetDeliveryPostalCode();
    }

    /**
     * Create an instance of {@link CompanyGetCustomFields }
     * 
     */
    public CompanyGetCustomFields createCompanyGetCustomFields() {
        return new CompanyGetCustomFields();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetDeliveryDate }
     * 
     */
    public CurrentInvoiceLineGetDeliveryDate createCurrentInvoiceLineGetDeliveryDate() {
        return new CurrentInvoiceLineGetDeliveryDate();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetAll }
     * 
     */
    public CurrentInvoiceGetAll createCurrentInvoiceGetAll() {
        return new CurrentInvoiceGetAll();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetDeliveryDate }
     * 
     */
    public CurrentInvoiceLineSetDeliveryDate createCurrentInvoiceLineSetDeliveryDate() {
        return new CurrentInvoiceLineSetDeliveryDate();
    }

    /**
     * Create an instance of {@link DebtorSetCountryResponse }
     * 
     */
    public DebtorSetCountryResponse createDebtorSetCountryResponse() {
        return new DebtorSetCountryResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineGetDeliveryDateResponse }
     * 
     */
    public InvoiceLineGetDeliveryDateResponse createInvoiceLineGetDeliveryDateResponse() {
        return new InvoiceLineGetDeliveryDateResponse();
    }

    /**
     * Create an instance of {@link OrderCreateFromData }
     * 
     */
    public OrderCreateFromData createOrderCreateFromData() {
        return new OrderCreateFromData();
    }

    /**
     * Create an instance of {@link ProductGroupSetName }
     * 
     */
    public ProductGroupSetName createProductGroupSetName() {
        return new ProductGroupSetName();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryGetDocuments }
     * 
     */
    public DocumentArchiveCategoryGetDocuments createDocumentArchiveCategoryGetDocuments() {
        return new DocumentArchiveCategoryGetDocuments();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDeliveryCityResponse }
     * 
     */
    public CurrentInvoiceSetDeliveryCityResponse createCurrentInvoiceSetDeliveryCityResponse() {
        return new CurrentInvoiceSetDeliveryCityResponse();
    }

    /**
     * Create an instance of {@link SubscriberGetQuantityFactorResponse }
     * 
     */
    public SubscriberGetQuantityFactorResponse createSubscriberGetQuantityFactorResponse() {
        return new SubscriberGetQuantityFactorResponse();
    }

    /**
     * Create an instance of {@link DebtorGroupUpdateFromDataResponse }
     * 
     */
    public DebtorGroupUpdateFromDataResponse createDebtorGroupUpdateFromDataResponse() {
        return new DebtorGroupUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link DebtorContactDeleteResponse }
     * 
     */
    public DebtorContactDeleteResponse createDebtorContactDeleteResponse() {
        return new DebtorContactDeleteResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureCreateFromDataArray }
     * 
     */
    public BudgetFigureCreateFromDataArray createBudgetFigureCreateFromDataArray() {
        return new BudgetFigureCreateFromDataArray();
    }

    /**
     * Create an instance of {@link CreditorGroupFindByNumberList }
     * 
     */
    public CreditorGroupFindByNumberList createCreditorGroupFindByNumberList() {
        return new CreditorGroupFindByNumberList();
    }

    /**
     * Create an instance of {@link AccountUpdateFromData }
     * 
     */
    public AccountUpdateFromData createAccountUpdateFromData() {
        return new AccountUpdateFromData();
    }

    /**
     * Create an instance of {@link OrderSetTextLine1Response }
     * 
     */
    public OrderSetTextLine1Response createOrderSetTextLine1Response() {
        return new OrderSetTextLine1Response();
    }

    /**
     * Create an instance of {@link DebtorEntryGetDateResponse }
     * 
     */
    public DebtorEntryGetDateResponse createDebtorEntryGetDateResponse() {
        return new DebtorEntryGetDateResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineGetDepartmentResponse }
     * 
     */
    public InvoiceLineGetDepartmentResponse createInvoiceLineGetDepartmentResponse() {
        return new InvoiceLineGetDepartmentResponse();
    }

    /**
     * Create an instance of {@link QuotationLineGetQuotation }
     * 
     */
    public QuotationLineGetQuotation createQuotationLineGetQuotation() {
        return new QuotationLineGetQuotation();
    }

    /**
     * Create an instance of {@link OrderGetExchangeRate }
     * 
     */
    public OrderGetExchangeRate createOrderGetExchangeRate() {
        return new OrderGetExchangeRate();
    }

    /**
     * Create an instance of {@link EmployeeGetCostPriceByDate }
     * 
     */
    public EmployeeGetCostPriceByDate createEmployeeGetCostPriceByDate() {
        return new EmployeeGetCostPriceByDate();
    }

    /**
     * Create an instance of {@link PriceGroupSetNameResponse }
     * 
     */
    public PriceGroupSetNameResponse createPriceGroupSetNameResponse() {
        return new PriceGroupSetNameResponse();
    }

    /**
     * Create an instance of {@link SubscriberGetSpecialPriceResponse }
     * 
     */
    public SubscriberGetSpecialPriceResponse createSubscriberGetSpecialPriceResponse() {
        return new SubscriberGetSpecialPriceResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureCreate }
     * 
     */
    public BudgetFigureCreate createBudgetFigureCreate() {
        return new BudgetFigureCreate();
    }

    /**
     * Create an instance of {@link InvoiceFindByNumberInterval }
     * 
     */
    public InvoiceFindByNumberInterval createInvoiceFindByNumberInterval() {
        return new InvoiceFindByNumberInterval();
    }

    /**
     * Create an instance of {@link QuotationLineGetMarginAsPercent }
     * 
     */
    public QuotationLineGetMarginAsPercent createQuotationLineGetMarginAsPercent() {
        return new QuotationLineGetMarginAsPercent();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetNumberResponse }
     * 
     */
    public DeliveryLocationGetNumberResponse createDeliveryLocationGetNumberResponse() {
        return new DeliveryLocationGetNumberResponse();
    }

    /**
     * Create an instance of {@link DepartmentFindByNumberListResponse }
     * 
     */
    public DepartmentFindByNumberListResponse createDepartmentFindByNumberListResponse() {
        return new DepartmentFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link SubscriberSetSubscription }
     * 
     */
    public SubscriberSetSubscription createSubscriberSetSubscription() {
        return new SubscriberSetSubscription();
    }

    /**
     * Create an instance of {@link EntryGetDateResponse }
     * 
     */
    public EntryGetDateResponse createEntryGetDateResponse() {
        return new EntryGetDateResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineGetQuantity }
     * 
     */
    public CurrentSupplierInvoiceLineGetQuantity createCurrentSupplierInvoiceLineGetQuantity() {
        return new CurrentSupplierInvoiceLineGetQuantity();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceTotalAmount }
     * 
     */
    public CurrentSupplierInvoiceTotalAmount createCurrentSupplierInvoiceTotalAmount() {
        return new CurrentSupplierInvoiceTotalAmount();
    }

    /**
     * Create an instance of {@link AccountingPeriodGetStatusResponse }
     * 
     */
    public AccountingPeriodGetStatusResponse createAccountingPeriodGetStatusResponse() {
        return new AccountingPeriodGetStatusResponse();
    }

    /**
     * Create an instance of {@link QuotationLineGetDataResponse }
     * 
     */
    public QuotationLineGetDataResponse createQuotationLineGetDataResponse() {
        return new QuotationLineGetDataResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryCreateFromDataArrayResponse }
     * 
     */
    public CashBookEntryCreateFromDataArrayResponse createCashBookEntryCreateFromDataArrayResponse() {
        return new CashBookEntryCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link OrderSetDeliveryCityResponse }
     * 
     */
    public OrderSetDeliveryCityResponse createOrderSetDeliveryCityResponse() {
        return new OrderSetDeliveryCityResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureUpdateFromDataArray }
     * 
     */
    public BudgetFigureUpdateFromDataArray createBudgetFigureUpdateFromDataArray() {
        return new BudgetFigureUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link OrderGetOtherReference }
     * 
     */
    public OrderGetOtherReference createOrderGetOtherReference() {
        return new OrderGetOtherReference();
    }

    /**
     * Create an instance of {@link ProductGroupGetDataArrayResponse }
     * 
     */
    public ProductGroupGetDataArrayResponse createProductGroupGetDataArrayResponse() {
        return new ProductGroupGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link CreditorGroupCreateFromDataArray }
     * 
     */
    public CreditorGroupCreateFromDataArray createCreditorGroupCreateFromDataArray() {
        return new CreditorGroupCreateFromDataArray();
    }

    /**
     * Create an instance of {@link SubscriptionLineSetSpecialPrice }
     * 
     */
    public SubscriptionLineSetSpecialPrice createSubscriptionLineSetSpecialPrice() {
        return new SubscriptionLineSetSpecialPrice();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetPdfResponse }
     * 
     */
    public CurrentInvoiceGetPdfResponse createCurrentInvoiceGetPdfResponse() {
        return new CurrentInvoiceGetPdfResponse();
    }

    /**
     * Create an instance of {@link SubscriberGetRegisteredDate }
     * 
     */
    public SubscriberGetRegisteredDate createSubscriberGetRegisteredDate() {
        return new SubscriberGetRegisteredDate();
    }

    /**
     * Create an instance of {@link TimeEntrySetText }
     * 
     */
    public TimeEntrySetText createTimeEntrySetText() {
        return new TimeEntrySetText();
    }

    /**
     * Create an instance of {@link InvoiceGetLayout }
     * 
     */
    public InvoiceGetLayout createInvoiceGetLayout() {
        return new InvoiceGetLayout();
    }

    /**
     * Create an instance of {@link DebtorEntryGetAmountResponse }
     * 
     */
    public DebtorEntryGetAmountResponse createDebtorEntryGetAmountResponse() {
        return new DebtorEntryGetAmountResponse();
    }

    /**
     * Create an instance of {@link QuotationUpdateFromData }
     * 
     */
    public QuotationUpdateFromData createQuotationUpdateFromData() {
        return new QuotationUpdateFromData();
    }

    /**
     * Create an instance of {@link DebtorFindByEanResponse }
     * 
     */
    public DebtorFindByEanResponse createDebtorFindByEanResponse() {
        return new DebtorFindByEanResponse();
    }

    /**
     * Create an instance of {@link CreditorGroupGetDataArray }
     * 
     */
    public CreditorGroupGetDataArray createCreditorGroupGetDataArray() {
        return new CreditorGroupGetDataArray();
    }

    /**
     * Create an instance of {@link OrderLineSetDiscountAsPercent }
     * 
     */
    public OrderLineSetDiscountAsPercent createOrderLineSetDiscountAsPercent() {
        return new OrderLineSetDiscountAsPercent();
    }

    /**
     * Create an instance of {@link QuotationGetMarginAsPercentResponse }
     * 
     */
    public QuotationGetMarginAsPercentResponse createQuotationGetMarginAsPercentResponse() {
        return new QuotationGetMarginAsPercentResponse();
    }

    /**
     * Create an instance of {@link ProjectGroupGetNameResponse }
     * 
     */
    public ProjectGroupGetNameResponse createProjectGroupGetNameResponse() {
        return new ProjectGroupGetNameResponse();
    }

    /**
     * Create an instance of {@link DebtorContactSetExternalId }
     * 
     */
    public DebtorContactSetExternalId createDebtorContactSetExternalId() {
        return new DebtorContactSetExternalId();
    }

    /**
     * Create an instance of {@link QuotationGetGrossAmountResponse }
     * 
     */
    public QuotationGetGrossAmountResponse createQuotationGetGrossAmountResponse() {
        return new QuotationGetGrossAmountResponse();
    }

    /**
     * Create an instance of {@link CreditorEntryGetCurrencyResponse }
     * 
     */
    public CreditorEntryGetCurrencyResponse createCreditorEntryGetCurrencyResponse() {
        return new CreditorEntryGetCurrencyResponse();
    }

    /**
     * Create an instance of {@link ProjectGetData }
     * 
     */
    public ProjectGetData createProjectGetData() {
        return new ProjectGetData();
    }

    /**
     * Create an instance of {@link QuotationSetDeliveryCountyResponse }
     * 
     */
    public QuotationSetDeliveryCountyResponse createQuotationSetDeliveryCountyResponse() {
        return new QuotationSetDeliveryCountyResponse();
    }

    /**
     * Create an instance of {@link SubscriptionUpdateFromDataResponse }
     * 
     */
    public SubscriptionUpdateFromDataResponse createSubscriptionUpdateFromDataResponse() {
        return new SubscriptionUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link OrderGetVatAmountResponse }
     * 
     */
    public OrderGetVatAmountResponse createOrderGetVatAmountResponse() {
        return new OrderGetVatAmountResponse();
    }

    /**
     * Create an instance of {@link QuotationGetDataArray }
     * 
     */
    public QuotationGetDataArray createQuotationGetDataArray() {
        return new QuotationGetDataArray();
    }

    /**
     * Create an instance of {@link SubscriberGetExtraTextForInvoice }
     * 
     */
    public SubscriberGetExtraTextForInvoice createSubscriberGetExtraTextForInvoice() {
        return new SubscriberGetExtraTextForInvoice();
    }

    /**
     * Create an instance of {@link DebtorSetNameResponse }
     * 
     */
    public DebtorSetNameResponse createDebtorSetNameResponse() {
        return new DebtorSetNameResponse();
    }

    /**
     * Create an instance of {@link MileageEntryUpdateFromData }
     * 
     */
    public MileageEntryUpdateFromData createMileageEntryUpdateFromData() {
        return new MileageEntryUpdateFromData();
    }

    /**
     * Create an instance of {@link EmployeeGetTypeResponse }
     * 
     */
    public EmployeeGetTypeResponse createEmployeeGetTypeResponse() {
        return new EmployeeGetTypeResponse();
    }

    /**
     * Create an instance of {@link CreditorContactGetComments }
     * 
     */
    public CreditorContactGetComments createCreditorContactGetComments() {
        return new CreditorContactGetComments();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetIsVatIncluded }
     * 
     */
    public CurrentInvoiceGetIsVatIncluded createCurrentInvoiceGetIsVatIncluded() {
        return new CurrentInvoiceGetIsVatIncluded();
    }

    /**
     * Create an instance of {@link DebtorCreateFromDataArray }
     * 
     */
    public DebtorCreateFromDataArray createDebtorCreateFromDataArray() {
        return new DebtorCreateFromDataArray();
    }

    /**
     * Create an instance of {@link DebtorFindByTelephoneAndFaxNumber }
     * 
     */
    public DebtorFindByTelephoneAndFaxNumber createDebtorFindByTelephoneAndFaxNumber() {
        return new DebtorFindByTelephoneAndFaxNumber();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetDepartment }
     * 
     */
    public CurrentInvoiceLineGetDepartment createCurrentInvoiceLineGetDepartment() {
        return new CurrentInvoiceLineGetDepartment();
    }

    /**
     * Create an instance of {@link InvoiceGetRemainderResponse }
     * 
     */
    public InvoiceGetRemainderResponse createInvoiceGetRemainderResponse() {
        return new InvoiceGetRemainderResponse();
    }

    /**
     * Create an instance of {@link CostTypeGetVatAccountResponse }
     * 
     */
    public CostTypeGetVatAccountResponse createCostTypeGetVatAccountResponse() {
        return new CostTypeGetVatAccountResponse();
    }

    /**
     * Create an instance of {@link CreditorGetDataResponse }
     * 
     */
    public CreditorGetDataResponse createCreditorGetDataResponse() {
        return new CreditorGetDataResponse();
    }

    /**
     * Create an instance of {@link CreditorData }
     * 
     */
    public CreditorData createCreditorData() {
        return new CreditorData();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetCityResponse }
     * 
     */
    public DeliveryLocationGetCityResponse createDeliveryLocationGetCityResponse() {
        return new DeliveryLocationGetCityResponse();
    }

    /**
     * Create an instance of {@link CreditorUpdateFromDataArrayResponse }
     * 
     */
    public CreditorUpdateFromDataArrayResponse createCreditorUpdateFromDataArrayResponse() {
        return new CreditorUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link TimeEntryGetApprovedResponse }
     * 
     */
    public TimeEntryGetApprovedResponse createTimeEntryGetApprovedResponse() {
        return new TimeEntryGetApprovedResponse();
    }

    /**
     * Create an instance of {@link DebtorGetNameResponse }
     * 
     */
    public DebtorGetNameResponse createDebtorGetNameResponse() {
        return new DebtorGetNameResponse();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetProductName }
     * 
     */
    public SubscriptionLineGetProductName createSubscriptionLineGetProductName() {
        return new SubscriptionLineGetProductName();
    }

    /**
     * Create an instance of {@link ProductPriceDeleteResponse }
     * 
     */
    public ProductPriceDeleteResponse createProductPriceDeleteResponse() {
        return new ProductPriceDeleteResponse();
    }

    /**
     * Create an instance of {@link EmployeeSetSalesPriceAfterResponse }
     * 
     */
    public EmployeeSetSalesPriceAfterResponse createEmployeeSetSalesPriceAfterResponse() {
        return new EmployeeSetSalesPriceAfterResponse();
    }

    /**
     * Create an instance of {@link ProjectUpdateFromDataArray }
     * 
     */
    public ProjectUpdateFromDataArray createProjectUpdateFromDataArray() {
        return new ProjectUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link ProductSetProductGroup }
     * 
     */
    public ProductSetProductGroup createProductSetProductGroup() {
        return new ProductSetProductGroup();
    }

    /**
     * Create an instance of {@link AccountSetOpeningAccount }
     * 
     */
    public AccountSetOpeningAccount createAccountSetOpeningAccount() {
        return new AccountSetOpeningAccount();
    }

    /**
     * Create an instance of {@link PriceGroupFindByName }
     * 
     */
    public PriceGroupFindByName createPriceGroupFindByName() {
        return new PriceGroupFindByName();
    }

    /**
     * Create an instance of {@link CreditorEntryGetAmountResponse }
     * 
     */
    public CreditorEntryGetAmountResponse createCreditorEntryGetAmountResponse() {
        return new CreditorEntryGetAmountResponse();
    }

    /**
     * Create an instance of {@link DistributionKeyFindByNumberListResponse }
     * 
     */
    public DistributionKeyFindByNumberListResponse createDistributionKeyFindByNumberListResponse() {
        return new DistributionKeyFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link CreditorEntryGetVoucherNumberResponse }
     * 
     */
    public CreditorEntryGetVoucherNumberResponse createCreditorEntryGetVoucherNumberResponse() {
        return new CreditorEntryGetVoucherNumberResponse();
    }

    /**
     * Create an instance of {@link SubscriptionGetCollection }
     * 
     */
    public SubscriptionGetCollection createSubscriptionGetCollection() {
        return new SubscriptionGetCollection();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetPostalCode }
     * 
     */
    public DeliveryLocationGetPostalCode createDeliveryLocationGetPostalCode() {
        return new DeliveryLocationGetPostalCode();
    }

    /**
     * Create an instance of {@link QuotationLineGetTotalNetAmount }
     * 
     */
    public QuotationLineGetTotalNetAmount createQuotationLineGetTotalNetAmount() {
        return new QuotationLineGetTotalNetAmount();
    }

    /**
     * Create an instance of {@link CreditorGetAutoContraAccount }
     * 
     */
    public CreditorGetAutoContraAccount createCreditorGetAutoContraAccount() {
        return new CreditorGetAutoContraAccount();
    }

    /**
     * Create an instance of {@link SubscriptionFindByNumber }
     * 
     */
    public SubscriptionFindByNumber createSubscriptionFindByNumber() {
        return new SubscriptionFindByNumber();
    }

    /**
     * Create an instance of {@link CreditorSetAddress }
     * 
     */
    public CreditorSetAddress createCreditorSetAddress() {
        return new CreditorSetAddress();
    }

    /**
     * Create an instance of {@link ReportCodeGetAccounts }
     * 
     */
    public ReportCodeGetAccounts createReportCodeGetAccounts() {
        return new ReportCodeGetAccounts();
    }

    /**
     * Create an instance of {@link EntryGetLastUsedSerialNumberResponse }
     * 
     */
    public EntryGetLastUsedSerialNumberResponse createEntryGetLastUsedSerialNumberResponse() {
        return new EntryGetLastUsedSerialNumberResponse();
    }

    /**
     * Create an instance of {@link QuotationSetHeadingResponse }
     * 
     */
    public QuotationSetHeadingResponse createQuotationSetHeadingResponse() {
        return new QuotationSetHeadingResponse();
    }

    /**
     * Create an instance of {@link EntryGetAccount }
     * 
     */
    public EntryGetAccount createEntryGetAccount() {
        return new EntryGetAccount();
    }

    /**
     * Create an instance of {@link DebtorContactCreateFromDataArray }
     * 
     */
    public DebtorContactCreateFromDataArray createDebtorContactCreateFromDataArray() {
        return new DebtorContactCreateFromDataArray();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetDistributionKeyResponse }
     * 
     */
    public CurrentInvoiceLineSetDistributionKeyResponse createCurrentInvoiceLineSetDistributionKeyResponse() {
        return new CurrentInvoiceLineSetDistributionKeyResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationUpdateFromDataArrayResponse }
     * 
     */
    public DeliveryLocationUpdateFromDataArrayResponse createDeliveryLocationUpdateFromDataArrayResponse() {
        return new DeliveryLocationUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CreditorGetOpenEntriesResponse }
     * 
     */
    public CreditorGetOpenEntriesResponse createCreditorGetOpenEntriesResponse() {
        return new CreditorGetOpenEntriesResponse();
    }

    /**
     * Create an instance of {@link ProjectSetMileageResponse }
     * 
     */
    public ProjectSetMileageResponse createProjectSetMileageResponse() {
        return new ProjectSetMileageResponse();
    }

    /**
     * Create an instance of {@link CreditorSetRemittanceInformation }
     * 
     */
    public CreditorSetRemittanceInformation createCreditorSetRemittanceInformation() {
        return new CreditorSetRemittanceInformation();
    }

    /**
     * Create an instance of {@link CashBookEntryGetCreditor }
     * 
     */
    public CashBookEntryGetCreditor createCashBookEntryGetCreditor() {
        return new CashBookEntryGetCreditor();
    }

    /**
     * Create an instance of {@link SubscriptionLineUpdateFromDataResponse }
     * 
     */
    public SubscriptionLineUpdateFromDataResponse createSubscriptionLineUpdateFromDataResponse() {
        return new SubscriptionLineUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link ProductGetProductGroup }
     * 
     */
    public ProductGetProductGroup createProductGetProductGroup() {
        return new ProductGetProductGroup();
    }

    /**
     * Create an instance of {@link ProjectGetMileageEntriesByDate }
     * 
     */
    public ProjectGetMileageEntriesByDate createProjectGetMileageEntriesByDate() {
        return new ProjectGetMileageEntriesByDate();
    }

    /**
     * Create an instance of {@link MileageEntryGetEmployee }
     * 
     */
    public MileageEntryGetEmployee createMileageEntryGetEmployee() {
        return new MileageEntryGetEmployee();
    }

    /**
     * Create an instance of {@link EmployeeGroupCreateFromDataArrayResponse }
     * 
     */
    public EmployeeGroupCreateFromDataArrayResponse createEmployeeGroupCreateFromDataArrayResponse() {
        return new EmployeeGroupCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link OrderGetTextLine1Response }
     * 
     */
    public OrderGetTextLine1Response createOrderGetTextLine1Response() {
        return new OrderGetTextLine1Response();
    }

    /**
     * Create an instance of {@link VatAccountUpdateFromDataArrayResponse }
     * 
     */
    public VatAccountUpdateFromDataArrayResponse createVatAccountUpdateFromDataArrayResponse() {
        return new VatAccountUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationCreateFromDataArray }
     * 
     */
    public DeliveryLocationCreateFromDataArray createDeliveryLocationCreateFromDataArray() {
        return new DeliveryLocationCreateFromDataArray();
    }

    /**
     * Create an instance of {@link AccountFindByName }
     * 
     */
    public AccountFindByName createAccountFindByName() {
        return new AccountFindByName();
    }

    /**
     * Create an instance of {@link QuotationLineSetDepartmentResponse }
     * 
     */
    public QuotationLineSetDepartmentResponse createQuotationLineSetDepartmentResponse() {
        return new QuotationLineSetDepartmentResponse();
    }

    /**
     * Create an instance of {@link CompanyGetCustomFieldsResponse }
     * 
     */
    public CompanyGetCustomFieldsResponse createCompanyGetCustomFieldsResponse() {
        return new CompanyGetCustomFieldsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCustomField }
     * 
     */
    public ArrayOfCustomField createArrayOfCustomField() {
        return new ArrayOfCustomField();
    }

    /**
     * Create an instance of {@link InvoiceFindByNumberListResponse }
     * 
     */
    public InvoiceFindByNumberListResponse createInvoiceFindByNumberListResponse() {
        return new InvoiceFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link CreditorGroupCreateFromDataArrayResponse }
     * 
     */
    public CreditorGroupCreateFromDataArrayResponse createCreditorGroupCreateFromDataArrayResponse() {
        return new CreditorGroupCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetPostalCodeResponse }
     * 
     */
    public DeliveryLocationGetPostalCodeResponse createDeliveryLocationGetPostalCodeResponse() {
        return new DeliveryLocationGetPostalCodeResponse();
    }

    /**
     * Create an instance of {@link DepartmentGetAll }
     * 
     */
    public DepartmentGetAll createDepartmentGetAll() {
        return new DepartmentGetAll();
    }

    /**
     * Create an instance of {@link BudgetFigureGetAll }
     * 
     */
    public BudgetFigureGetAll createBudgetFigureGetAll() {
        return new BudgetFigureGetAll();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetPdfResponse }
     * 
     */
    public ScannedDocumentGetPdfResponse createScannedDocumentGetPdfResponse() {
        return new ScannedDocumentGetPdfResponse();
    }

    /**
     * Create an instance of {@link EntryGetTypeResponse }
     * 
     */
    public EntryGetTypeResponse createEntryGetTypeResponse() {
        return new EntryGetTypeResponse();
    }

    /**
     * Create an instance of {@link DebtorGetCreditMaximum }
     * 
     */
    public DebtorGetCreditMaximum createDebtorGetCreditMaximum() {
        return new DebtorGetCreditMaximum();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetDataArray }
     * 
     */
    public DeliveryLocationGetDataArray createDeliveryLocationGetDataArray() {
        return new DeliveryLocationGetDataArray();
    }

    /**
     * Create an instance of {@link QuotationGetIsArchived }
     * 
     */
    public QuotationGetIsArchived createQuotationGetIsArchived() {
        return new QuotationGetIsArchived();
    }

    /**
     * Create an instance of {@link DebtorSetIsAccessibleResponse }
     * 
     */
    public DebtorSetIsAccessibleResponse createDebtorSetIsAccessibleResponse() {
        return new DebtorSetIsAccessibleResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetContraVatAccountResponse }
     * 
     */
    public CashBookEntryGetContraVatAccountResponse createCashBookEntryGetContraVatAccountResponse() {
        return new CashBookEntryGetContraVatAccountResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetProductResponse }
     * 
     */
    public CurrentInvoiceLineSetProductResponse createCurrentInvoiceLineSetProductResponse() {
        return new CurrentInvoiceLineSetProductResponse();
    }

    /**
     * Create an instance of {@link InvoiceLineGetDistributionKey }
     * 
     */
    public InvoiceLineGetDistributionKey createInvoiceLineGetDistributionKey() {
        return new InvoiceLineGetDistributionKey();
    }

    /**
     * Create an instance of {@link AccountGetAll }
     * 
     */
    public AccountGetAll createAccountGetAll() {
        return new AccountGetAll();
    }

    /**
     * Create an instance of {@link OrderSetDueDate }
     * 
     */
    public OrderSetDueDate createOrderSetDueDate() {
        return new OrderSetDueDate();
    }

    /**
     * Create an instance of {@link QuotationGetDebtorAddressResponse }
     * 
     */
    public QuotationGetDebtorAddressResponse createQuotationGetDebtorAddressResponse() {
        return new QuotationGetDebtorAddressResponse();
    }

    /**
     * Create an instance of {@link QuotationSetDeliveryAddress }
     * 
     */
    public QuotationSetDeliveryAddress createQuotationSetDeliveryAddress() {
        return new QuotationSetDeliveryAddress();
    }

    /**
     * Create an instance of {@link SubscriptionUpdateFromDataArrayResponse }
     * 
     */
    public SubscriptionUpdateFromDataArrayResponse createSubscriptionUpdateFromDataArrayResponse() {
        return new SubscriptionUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetCurrency }
     * 
     */
    public InvoiceGetCurrency createInvoiceGetCurrency() {
        return new InvoiceGetCurrency();
    }

    /**
     * Create an instance of {@link OrderGetOtherReferenceResponse }
     * 
     */
    public OrderGetOtherReferenceResponse createOrderGetOtherReferenceResponse() {
        return new OrderGetOtherReferenceResponse();
    }

    /**
     * Create an instance of {@link MileageEntryGetAll }
     * 
     */
    public MileageEntryGetAll createMileageEntryGetAll() {
        return new MileageEntryGetAll();
    }

    /**
     * Create an instance of {@link ActivityGetDataResponse }
     * 
     */
    public ActivityGetDataResponse createActivityGetDataResponse() {
        return new ActivityGetDataResponse();
    }

    /**
     * Create an instance of {@link ActivityData }
     * 
     */
    public ActivityData createActivityData() {
        return new ActivityData();
    }

    /**
     * Create an instance of {@link ProductGroupGetAllResponse }
     * 
     */
    public ProductGroupGetAllResponse createProductGroupGetAllResponse() {
        return new ProductGroupGetAllResponse();
    }

    /**
     * Create an instance of {@link VatAccountGetRateAsPercent }
     * 
     */
    public VatAccountGetRateAsPercent createVatAccountGetRateAsPercent() {
        return new VatAccountGetRateAsPercent();
    }

    /**
     * Create an instance of {@link InvoiceGetDebtorCountryResponse }
     * 
     */
    public InvoiceGetDebtorCountryResponse createInvoiceGetDebtorCountryResponse() {
        return new InvoiceGetDebtorCountryResponse();
    }

    /**
     * Create an instance of {@link OrderGetIsSent }
     * 
     */
    public OrderGetIsSent createOrderGetIsSent() {
        return new OrderGetIsSent();
    }

    /**
     * Create an instance of {@link DebtorSetCurrencyResponse }
     * 
     */
    public DebtorSetCurrencyResponse createDebtorSetCurrencyResponse() {
        return new DebtorSetCurrencyResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDeliveryLocation }
     * 
     */
    public CurrentInvoiceSetDeliveryLocation createCurrentInvoiceSetDeliveryLocation() {
        return new CurrentInvoiceSetDeliveryLocation();
    }

    /**
     * Create an instance of {@link SubscriberSetQuantityFactor }
     * 
     */
    public SubscriberSetQuantityFactor createSubscriberSetQuantityFactor() {
        return new SubscriberSetQuantityFactor();
    }

    /**
     * Create an instance of {@link ProductPriceGetData }
     * 
     */
    public ProductPriceGetData createProductPriceGetData() {
        return new ProductPriceGetData();
    }

    /**
     * Create an instance of {@link DebtorContactFindByNameResponse }
     * 
     */
    public DebtorContactFindByNameResponse createDebtorContactFindByNameResponse() {
        return new DebtorContactFindByNameResponse();
    }

    /**
     * Create an instance of {@link ProductPriceGetCurrencyResponse }
     * 
     */
    public ProductPriceGetCurrencyResponse createProductPriceGetCurrencyResponse() {
        return new ProductPriceGetCurrencyResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetOrderNumber }
     * 
     */
    public InvoiceGetOrderNumber createInvoiceGetOrderNumber() {
        return new InvoiceGetOrderNumber();
    }

    /**
     * Create an instance of {@link ConnectWithToken }
     * 
     */
    public ConnectWithToken createConnectWithToken() {
        return new ConnectWithToken();
    }

    /**
     * Create an instance of {@link CashBookEntryGetDistributionKeyResponse }
     * 
     */
    public CashBookEntryGetDistributionKeyResponse createCashBookEntryGetDistributionKeyResponse() {
        return new CashBookEntryGetDistributionKeyResponse();
    }

    /**
     * Create an instance of {@link QuotationDeleteResponse }
     * 
     */
    public QuotationDeleteResponse createQuotationDeleteResponse() {
        return new QuotationDeleteResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDeliveryPostalCode }
     * 
     */
    public CurrentInvoiceSetDeliveryPostalCode createCurrentInvoiceSetDeliveryPostalCode() {
        return new CurrentInvoiceSetDeliveryPostalCode();
    }

    /**
     * Create an instance of {@link SubscriberUpdateFromDataArray }
     * 
     */
    public SubscriberUpdateFromDataArray createSubscriberUpdateFromDataArray() {
        return new SubscriberUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link CurrentInvoiceBookWithNumber }
     * 
     */
    public CurrentInvoiceBookWithNumber createCurrentInvoiceBookWithNumber() {
        return new CurrentInvoiceBookWithNumber();
    }

    /**
     * Create an instance of {@link ProductGroupGetAll }
     * 
     */
    public ProductGroupGetAll createProductGroupGetAll() {
        return new ProductGroupGetAll();
    }

    /**
     * Create an instance of {@link ScannedDocumentFindByVoucherNumberIntervalResponse }
     * 
     */
    public ScannedDocumentFindByVoucherNumberIntervalResponse createScannedDocumentFindByVoucherNumberIntervalResponse() {
        return new ScannedDocumentFindByVoucherNumberIntervalResponse();
    }

    /**
     * Create an instance of {@link DebtorCreateFromDataResponse }
     * 
     */
    public DebtorCreateFromDataResponse createDebtorCreateFromDataResponse() {
        return new DebtorCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link CreditorGroupGetData }
     * 
     */
    public CreditorGroupGetData createCreditorGroupGetData() {
        return new CreditorGroupGetData();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineGetProduct }
     * 
     */
    public CurrentSupplierInvoiceLineGetProduct createCurrentSupplierInvoiceLineGetProduct() {
        return new CurrentSupplierInvoiceLineGetProduct();
    }

    /**
     * Create an instance of {@link DebtorGetTelephoneAndFaxNumber }
     * 
     */
    public DebtorGetTelephoneAndFaxNumber createDebtorGetTelephoneAndFaxNumber() {
        return new DebtorGetTelephoneAndFaxNumber();
    }

    /**
     * Create an instance of {@link SubscriberGetComments }
     * 
     */
    public SubscriberGetComments createSubscriberGetComments() {
        return new SubscriberGetComments();
    }

    /**
     * Create an instance of {@link QuotationLineGetDiscountAsPercent }
     * 
     */
    public QuotationLineGetDiscountAsPercent createQuotationLineGetDiscountAsPercent() {
        return new QuotationLineGetDiscountAsPercent();
    }

    /**
     * Create an instance of {@link DebtorGetCity }
     * 
     */
    public DebtorGetCity createDebtorGetCity() {
        return new DebtorGetCity();
    }

    /**
     * Create an instance of {@link CreditorContactSetCommentsResponse }
     * 
     */
    public CreditorContactSetCommentsResponse createCreditorContactSetCommentsResponse() {
        return new CreditorContactSetCommentsResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetProductResponse }
     * 
     */
    public CurrentInvoiceLineGetProductResponse createCurrentInvoiceLineGetProductResponse() {
        return new CurrentInvoiceLineGetProductResponse();
    }

    /**
     * Create an instance of {@link EmployeeFindByName }
     * 
     */
    public EmployeeFindByName createEmployeeFindByName() {
        return new EmployeeFindByName();
    }

    /**
     * Create an instance of {@link AccountGetContraAccountResponse }
     * 
     */
    public AccountGetContraAccountResponse createAccountGetContraAccountResponse() {
        return new AccountGetContraAccountResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetInventoryLocationResponse }
     * 
     */
    public CurrentInvoiceLineGetInventoryLocationResponse createCurrentInvoiceLineGetInventoryLocationResponse() {
        return new CurrentInvoiceLineGetInventoryLocationResponse();
    }

    /**
     * Create an instance of {@link SumIntervalSetToAccountResponse }
     * 
     */
    public SumIntervalSetToAccountResponse createSumIntervalSetToAccountResponse() {
        return new SumIntervalSetToAccountResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDeliveryCity }
     * 
     */
    public CurrentInvoiceSetDeliveryCity createCurrentInvoiceSetDeliveryCity() {
        return new CurrentInvoiceSetDeliveryCity();
    }

    /**
     * Create an instance of {@link ExtendedVatZoneGetName }
     * 
     */
    public ExtendedVatZoneGetName createExtendedVatZoneGetName() {
        return new ExtendedVatZoneGetName();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDebtorCounty }
     * 
     */
    public CurrentInvoiceGetDebtorCounty createCurrentInvoiceGetDebtorCounty() {
        return new CurrentInvoiceGetDebtorCounty();
    }

    /**
     * Create an instance of {@link PriceGroupGetPrice }
     * 
     */
    public PriceGroupGetPrice createPriceGroupGetPrice() {
        return new PriceGroupGetPrice();
    }

    /**
     * Create an instance of {@link DebtorContactCreateFromDataArrayResponse }
     * 
     */
    public DebtorContactCreateFromDataArrayResponse createDebtorContactCreateFromDataArrayResponse() {
        return new DebtorContactCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetData }
     * 
     */
    public CurrentInvoiceLineGetData createCurrentInvoiceLineGetData() {
        return new CurrentInvoiceLineGetData();
    }

    /**
     * Create an instance of {@link InvoiceLineGetVatRateResponse }
     * 
     */
    public InvoiceLineGetVatRateResponse createInvoiceLineGetVatRateResponse() {
        return new InvoiceLineGetVatRateResponse();
    }

    /**
     * Create an instance of {@link EmployeeGetName }
     * 
     */
    public EmployeeGetName createEmployeeGetName() {
        return new EmployeeGetName();
    }

    /**
     * Create an instance of {@link OrderSetIsVatIncludedResponse }
     * 
     */
    public OrderSetIsVatIncludedResponse createOrderSetIsVatIncludedResponse() {
        return new OrderSetIsVatIncludedResponse();
    }

    /**
     * Create an instance of {@link EntryGetLastUsedSerialNumber }
     * 
     */
    public EntryGetLastUsedSerialNumber createEntryGetLastUsedSerialNumber() {
        return new EntryGetLastUsedSerialNumber();
    }

    /**
     * Create an instance of {@link CurrentInvoiceFindByDateIntervalResponse }
     * 
     */
    public CurrentInvoiceFindByDateIntervalResponse createCurrentInvoiceFindByDateIntervalResponse() {
        return new CurrentInvoiceFindByDateIntervalResponse();
    }

    /**
     * Create an instance of {@link CompanySetCustomFields }
     * 
     */
    public CompanySetCustomFields createCompanySetCustomFields() {
        return new CompanySetCustomFields();
    }

    /**
     * Create an instance of {@link DistributionKeyUpdateFromDataArrayResponse }
     * 
     */
    public DistributionKeyUpdateFromDataArrayResponse createDistributionKeyUpdateFromDataArrayResponse() {
        return new DistributionKeyUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineSetDistributionKey }
     * 
     */
    public CurrentInvoiceLineSetDistributionKey createCurrentInvoiceLineSetDistributionKey() {
        return new CurrentInvoiceLineSetDistributionKey();
    }

    /**
     * Create an instance of {@link AccountGetIsAccessibleResponse }
     * 
     */
    public AccountGetIsAccessibleResponse createAccountGetIsAccessibleResponse() {
        return new AccountGetIsAccessibleResponse();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetSubscription }
     * 
     */
    public SubscriptionLineGetSubscription createSubscriptionLineGetSubscription() {
        return new SubscriptionLineGetSubscription();
    }

    /**
     * Create an instance of {@link SumIntervalSetFromAccountResponse }
     * 
     */
    public SumIntervalSetFromAccountResponse createSumIntervalSetFromAccountResponse() {
        return new SumIntervalSetFromAccountResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceGetCreditorResponse }
     * 
     */
    public CurrentSupplierInvoiceGetCreditorResponse createCurrentSupplierInvoiceGetCreditorResponse() {
        return new CurrentSupplierInvoiceGetCreditorResponse();
    }

    /**
     * Create an instance of {@link QuotationSetOurReference2Response }
     * 
     */
    public QuotationSetOurReference2Response createQuotationSetOurReference2Response() {
        return new QuotationSetOurReference2Response();
    }

    /**
     * Create an instance of {@link DistributionKeyGetAllResponse }
     * 
     */
    public DistributionKeyGetAllResponse createDistributionKeyGetAllResponse() {
        return new DistributionKeyGetAllResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetPdf }
     * 
     */
    public InvoiceGetPdf createInvoiceGetPdf() {
        return new InvoiceGetPdf();
    }

    /**
     * Create an instance of {@link SubscriberSetExtraTextForInvoice }
     * 
     */
    public SubscriberSetExtraTextForInvoice createSubscriberSetExtraTextForInvoice() {
        return new SubscriberSetExtraTextForInvoice();
    }

    /**
     * Create an instance of {@link PriceGroupSetName }
     * 
     */
    public PriceGroupSetName createPriceGroupSetName() {
        return new PriceGroupSetName();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetNumberResponse }
     * 
     */
    public ScannedDocumentGetNumberResponse createScannedDocumentGetNumberResponse() {
        return new ScannedDocumentGetNumberResponse();
    }

    /**
     * Create an instance of {@link CreditorContactGetNameResponse }
     * 
     */
    public CreditorContactGetNameResponse createCreditorContactGetNameResponse() {
        return new CreditorContactGetNameResponse();
    }

    /**
     * Create an instance of {@link DebtorSetAddressResponse }
     * 
     */
    public DebtorSetAddressResponse createDebtorSetAddressResponse() {
        return new DebtorSetAddressResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDataArrayResponse }
     * 
     */
    public CurrentInvoiceGetDataArrayResponse createCurrentInvoiceGetDataArrayResponse() {
        return new CurrentInvoiceGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link OrderSetDeliveryPostalCode }
     * 
     */
    public OrderSetDeliveryPostalCode createOrderSetDeliveryPostalCode() {
        return new OrderSetDeliveryPostalCode();
    }

    /**
     * Create an instance of {@link ConnectResponse }
     * 
     */
    public ConnectResponse createConnectResponse() {
        return new ConnectResponse();
    }

    /**
     * Create an instance of {@link DebtorGetAll }
     * 
     */
    public DebtorGetAll createDebtorGetAll() {
        return new DebtorGetAll();
    }

    /**
     * Create an instance of {@link ReportCodeSetFindByName }
     * 
     */
    public ReportCodeSetFindByName createReportCodeSetFindByName() {
        return new ReportCodeSetFindByName();
    }

    /**
     * Create an instance of {@link CostTypeGetCostTypeGroup }
     * 
     */
    public CostTypeGetCostTypeGroup createCostTypeGetCostTypeGroup() {
        return new CostTypeGetCostTypeGroup();
    }

    /**
     * Create an instance of {@link DeliveryLocationSetAddress }
     * 
     */
    public DeliveryLocationSetAddress createDeliveryLocationSetAddress() {
        return new DeliveryLocationSetAddress();
    }

    /**
     * Create an instance of {@link ProductGroupUpdateFromDataArrayResponse }
     * 
     */
    public ProductGroupUpdateFromDataArrayResponse createProductGroupUpdateFromDataArrayResponse() {
        return new ProductGroupUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CreditorGetEmailResponse }
     * 
     */
    public CreditorGetEmailResponse createCreditorGetEmailResponse() {
        return new CreditorGetEmailResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetIsAccessible }
     * 
     */
    public DeliveryLocationGetIsAccessible createDeliveryLocationGetIsAccessible() {
        return new DeliveryLocationGetIsAccessible();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineFindByProductList }
     * 
     */
    public CurrentInvoiceLineFindByProductList createCurrentInvoiceLineFindByProductList() {
        return new CurrentInvoiceLineFindByProductList();
    }

    /**
     * Create an instance of {@link TimeEntryCreateFromDataArrayResponse }
     * 
     */
    public TimeEntryCreateFromDataArrayResponse createTimeEntryCreateFromDataArrayResponse() {
        return new TimeEntryCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDebtorEanResponse }
     * 
     */
    public CurrentInvoiceGetDebtorEanResponse createCurrentInvoiceGetDebtorEanResponse() {
        return new CurrentInvoiceGetDebtorEanResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetMarginAsPercent }
     * 
     */
    public CurrentInvoiceLineGetMarginAsPercent createCurrentInvoiceLineGetMarginAsPercent() {
        return new CurrentInvoiceLineGetMarginAsPercent();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetNumberResponse }
     * 
     */
    public SubscriptionLineGetNumberResponse createSubscriptionLineGetNumberResponse() {
        return new SubscriptionLineGetNumberResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetQuantityResponse }
     * 
     */
    public CurrentInvoiceLineGetQuantityResponse createCurrentInvoiceLineGetQuantityResponse() {
        return new CurrentInvoiceLineGetQuantityResponse();
    }

    /**
     * Create an instance of {@link CashBookEntrySetEmployee }
     * 
     */
    public CashBookEntrySetEmployee createCashBookEntrySetEmployee() {
        return new CashBookEntrySetEmployee();
    }

    /**
     * Create an instance of {@link SubscriberGetDataArray }
     * 
     */
    public SubscriberGetDataArray createSubscriberGetDataArray() {
        return new SubscriberGetDataArray();
    }

    /**
     * Create an instance of {@link InvoiceGetDebtorPostalCode }
     * 
     */
    public InvoiceGetDebtorPostalCode createInvoiceGetDebtorPostalCode() {
        return new InvoiceGetDebtorPostalCode();
    }

    /**
     * Create an instance of {@link DebtorEntryGetRemainder }
     * 
     */
    public DebtorEntryGetRemainder createDebtorEntryGetRemainder() {
        return new DebtorEntryGetRemainder();
    }

    /**
     * Create an instance of {@link BudgetFigureUpdateFromDataArrayResponse }
     * 
     */
    public BudgetFigureUpdateFromDataArrayResponse createBudgetFigureUpdateFromDataArrayResponse() {
        return new BudgetFigureUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link EmployeeGetType }
     * 
     */
    public EmployeeGetType createEmployeeGetType() {
        return new EmployeeGetType();
    }

    /**
     * Create an instance of {@link MileageEntryGetCostRate }
     * 
     */
    public MileageEntryGetCostRate createMileageEntryGetCostRate() {
        return new MileageEntryGetCostRate();
    }

    /**
     * Create an instance of {@link OrderGetTermsOfDelivery }
     * 
     */
    public OrderGetTermsOfDelivery createOrderGetTermsOfDelivery() {
        return new OrderGetTermsOfDelivery();
    }

    /**
     * Create an instance of {@link EmployeeUpdateFromDataArray }
     * 
     */
    public EmployeeUpdateFromDataArray createEmployeeUpdateFromDataArray() {
        return new EmployeeUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link QuotationLineGetProduct }
     * 
     */
    public QuotationLineGetProduct createQuotationLineGetProduct() {
        return new QuotationLineGetProduct();
    }

    /**
     * Create an instance of {@link CreditorFindByNumberList }
     * 
     */
    public CreditorFindByNumberList createCreditorFindByNumberList() {
        return new CreditorFindByNumberList();
    }

    /**
     * Create an instance of {@link CreditorUpdateFromData }
     * 
     */
    public CreditorUpdateFromData createCreditorUpdateFromData() {
        return new CreditorUpdateFromData();
    }

    /**
     * Create an instance of {@link ExtendedVatZoneGetDataArrayResponse }
     * 
     */
    public ExtendedVatZoneGetDataArrayResponse createExtendedVatZoneGetDataArrayResponse() {
        return new ExtendedVatZoneGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfExtendedVatZoneData }
     * 
     */
    public ArrayOfExtendedVatZoneData createArrayOfExtendedVatZoneData() {
        return new ArrayOfExtendedVatZoneData();
    }

    /**
     * Create an instance of {@link ProductGroupGetDataArray }
     * 
     */
    public ProductGroupGetDataArray createProductGroupGetDataArray() {
        return new ProductGroupGetDataArray();
    }

    /**
     * Create an instance of {@link DistributionKeyUpdateFromDataArray }
     * 
     */
    public DistributionKeyUpdateFromDataArray createDistributionKeyUpdateFromDataArray() {
        return new DistributionKeyUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link ArrayOfDistributionKeyData }
     * 
     */
    public ArrayOfDistributionKeyData createArrayOfDistributionKeyData() {
        return new ArrayOfDistributionKeyData();
    }

    /**
     * Create an instance of {@link CreditorContactGetEmailResponse }
     * 
     */
    public CreditorContactGetEmailResponse createCreditorContactGetEmailResponse() {
        return new CreditorContactGetEmailResponse();
    }

    /**
     * Create an instance of {@link SumIntervalGetFromAccountResponse }
     * 
     */
    public SumIntervalGetFromAccountResponse createSumIntervalGetFromAccountResponse() {
        return new SumIntervalGetFromAccountResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetDeliveryAddressResponse }
     * 
     */
    public InvoiceGetDeliveryAddressResponse createInvoiceGetDeliveryAddressResponse() {
        return new InvoiceGetDeliveryAddressResponse();
    }

    /**
     * Create an instance of {@link OrderGetDebtorEan }
     * 
     */
    public OrderGetDebtorEan createOrderGetDebtorEan() {
        return new OrderGetDebtorEan();
    }

    /**
     * Create an instance of {@link EntryTurnVoucherResponse }
     * 
     */
    public EntryTurnVoucherResponse createEntryTurnVoucherResponse() {
        return new EntryTurnVoucherResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureGetDepartmentResponse }
     * 
     */
    public BudgetFigureGetDepartmentResponse createBudgetFigureGetDepartmentResponse() {
        return new BudgetFigureGetDepartmentResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetContraAccount2Response }
     * 
     */
    public TermOfPaymentGetContraAccount2Response createTermOfPaymentGetContraAccount2Response() {
        return new TermOfPaymentGetContraAccount2Response();
    }

    /**
     * Create an instance of {@link SubscriberSetDiscountExpiryDate }
     * 
     */
    public SubscriberSetDiscountExpiryDate createSubscriberSetDiscountExpiryDate() {
        return new SubscriberSetDiscountExpiryDate();
    }

    /**
     * Create an instance of {@link OrderGetMarginAsPercentResponse }
     * 
     */
    public OrderGetMarginAsPercentResponse createOrderGetMarginAsPercentResponse() {
        return new OrderGetMarginAsPercentResponse();
    }

    /**
     * Create an instance of {@link DebtorGetVatZoneResponse }
     * 
     */
    public DebtorGetVatZoneResponse createDebtorGetVatZoneResponse() {
        return new DebtorGetVatZoneResponse();
    }

    /**
     * Create an instance of {@link DebtorGetPostalCodeResponse }
     * 
     */
    public DebtorGetPostalCodeResponse createDebtorGetPostalCodeResponse() {
        return new DebtorGetPostalCodeResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceFindByOurReferenceResponse }
     * 
     */
    public CurrentInvoiceFindByOurReferenceResponse createCurrentInvoiceFindByOurReferenceResponse() {
        return new CurrentInvoiceFindByOurReferenceResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetAccountResponse }
     * 
     */
    public CashBookEntryGetAccountResponse createCashBookEntryGetAccountResponse() {
        return new CashBookEntryGetAccountResponse();
    }

    /**
     * Create an instance of {@link BudgetFigureFindByDateResponse }
     * 
     */
    public BudgetFigureFindByDateResponse createBudgetFigureFindByDateResponse() {
        return new BudgetFigureFindByDateResponse();
    }

    /**
     * Create an instance of {@link CreditorDeleteResponse }
     * 
     */
    public CreditorDeleteResponse createCreditorDeleteResponse() {
        return new CreditorDeleteResponse();
    }

    /**
     * Create an instance of {@link AccountFindByNumberList }
     * 
     */
    public AccountFindByNumberList createAccountFindByNumberList() {
        return new AccountFindByNumberList();
    }

    /**
     * Create an instance of {@link QuotationLineGetUnit }
     * 
     */
    public QuotationLineGetUnit createQuotationLineGetUnit() {
        return new QuotationLineGetUnit();
    }

    /**
     * Create an instance of {@link InvoiceGetDebtorCounty }
     * 
     */
    public InvoiceGetDebtorCounty createInvoiceGetDebtorCounty() {
        return new InvoiceGetDebtorCounty();
    }

    /**
     * Create an instance of {@link InvoiceGetDebtorNameResponse }
     * 
     */
    public InvoiceGetDebtorNameResponse createInvoiceGetDebtorNameResponse() {
        return new InvoiceGetDebtorNameResponse();
    }

    /**
     * Create an instance of {@link CreditorEntryMatchEntriesResponse }
     * 
     */
    public CreditorEntryMatchEntriesResponse createCreditorEntryMatchEntriesResponse() {
        return new CreditorEntryMatchEntriesResponse();
    }

    /**
     * Create an instance of {@link DebtorGetPriceGroup }
     * 
     */
    public DebtorGetPriceGroup createDebtorGetPriceGroup() {
        return new DebtorGetPriceGroup();
    }

    /**
     * Create an instance of {@link OrderSetDebtorNameResponse }
     * 
     */
    public OrderSetDebtorNameResponse createOrderSetDebtorNameResponse() {
        return new OrderSetDebtorNameResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryCreateDebtorPayment }
     * 
     */
    public CashBookEntryCreateDebtorPayment createCashBookEntryCreateDebtorPayment() {
        return new CashBookEntryCreateDebtorPayment();
    }

    /**
     * Create an instance of {@link CostTypeGetAll }
     * 
     */
    public CostTypeGetAll createCostTypeGetAll() {
        return new CostTypeGetAll();
    }

    /**
     * Create an instance of {@link TermOfPaymentFindByName }
     * 
     */
    public TermOfPaymentFindByName createTermOfPaymentFindByName() {
        return new TermOfPaymentFindByName();
    }

    /**
     * Create an instance of {@link DistributionKeyGetDataArrayResponse }
     * 
     */
    public DistributionKeyGetDataArrayResponse createDistributionKeyGetDataArrayResponse() {
        return new DistributionKeyGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link AccountingPeriodGetData }
     * 
     */
    public AccountingPeriodGetData createAccountingPeriodGetData() {
        return new AccountingPeriodGetData();
    }

    /**
     * Create an instance of {@link MileageEntryGetCostPriceResponse }
     * 
     */
    public MileageEntryGetCostPriceResponse createMileageEntryGetCostPriceResponse() {
        return new MileageEntryGetCostPriceResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryGetDataResponse }
     * 
     */
    public CashBookEntryGetDataResponse createCashBookEntryGetDataResponse() {
        return new CashBookEntryGetDataResponse();
    }

    /**
     * Create an instance of {@link DebtorSetAddress }
     * 
     */
    public DebtorSetAddress createDebtorSetAddress() {
        return new DebtorSetAddress();
    }

    /**
     * Create an instance of {@link CreditorContactGetCreditorResponse }
     * 
     */
    public CreditorContactGetCreditorResponse createCreditorContactGetCreditorResponse() {
        return new CreditorContactGetCreditorResponse();
    }

    /**
     * Create an instance of {@link VatAccountGetAll }
     * 
     */
    public VatAccountGetAll createVatAccountGetAll() {
        return new VatAccountGetAll();
    }

    /**
     * Create an instance of {@link QuotationGetDeliveryLocation }
     * 
     */
    public QuotationGetDeliveryLocation createQuotationGetDeliveryLocation() {
        return new QuotationGetDeliveryLocation();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetAddress }
     * 
     */
    public DeliveryLocationGetAddress createDeliveryLocationGetAddress() {
        return new DeliveryLocationGetAddress();
    }

    /**
     * Create an instance of {@link CurrencyGetAllResponse }
     * 
     */
    public CurrencyGetAllResponse createCurrencyGetAllResponse() {
        return new CurrencyGetAllResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationDelete }
     * 
     */
    public DeliveryLocationDelete createDeliveryLocationDelete() {
        return new DeliveryLocationDelete();
    }

    /**
     * Create an instance of {@link SubscriptionLineGetSpecialPrice }
     * 
     */
    public SubscriptionLineGetSpecialPrice createSubscriptionLineGetSpecialPrice() {
        return new SubscriptionLineGetSpecialPrice();
    }

    /**
     * Create an instance of {@link DebtorGetCurrencyResponse }
     * 
     */
    public DebtorGetCurrencyResponse createDebtorGetCurrencyResponse() {
        return new DebtorGetCurrencyResponse();
    }

    /**
     * Create an instance of {@link DebtorGroupGetLayoutResponse }
     * 
     */
    public DebtorGroupGetLayoutResponse createDebtorGroupGetLayoutResponse() {
        return new DebtorGroupGetLayoutResponse();
    }

    /**
     * Create an instance of {@link AccountGetBudgetFiguresByDate }
     * 
     */
    public AccountGetBudgetFiguresByDate createAccountGetBudgetFiguresByDate() {
        return new AccountGetBudgetFiguresByDate();
    }

    /**
     * Create an instance of {@link InvoiceLineGetUnitResponse }
     * 
     */
    public InvoiceLineGetUnitResponse createInvoiceLineGetUnitResponse() {
        return new InvoiceLineGetUnitResponse();
    }

    /**
     * Create an instance of {@link KeyFigureCodeGetDataResponse }
     * 
     */
    public KeyFigureCodeGetDataResponse createKeyFigureCodeGetDataResponse() {
        return new KeyFigureCodeGetDataResponse();
    }

    /**
     * Create an instance of {@link KeyFigureCodeData }
     * 
     */
    public KeyFigureCodeData createKeyFigureCodeData() {
        return new KeyFigureCodeData();
    }

    /**
     * Create an instance of {@link AccountGetNameResponse }
     * 
     */
    public AccountGetNameResponse createAccountGetNameResponse() {
        return new AccountGetNameResponse();
    }

    /**
     * Create an instance of {@link CashBookEntryCreateFinanceVoucher }
     * 
     */
    public CashBookEntryCreateFinanceVoucher createCashBookEntryCreateFinanceVoucher() {
        return new CashBookEntryCreateFinanceVoucher();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceGetData }
     * 
     */
    public CurrentSupplierInvoiceGetData createCurrentSupplierInvoiceGetData() {
        return new CurrentSupplierInvoiceGetData();
    }

    /**
     * Create an instance of {@link CashBookEntrySetEmployeeResponse }
     * 
     */
    public CashBookEntrySetEmployeeResponse createCashBookEntrySetEmployeeResponse() {
        return new CashBookEntrySetEmployeeResponse();
    }

    /**
     * Create an instance of {@link ProductGetAllUpdatedResponse }
     * 
     */
    public ProductGetAllUpdatedResponse createProductGetAllUpdatedResponse() {
        return new ProductGetAllUpdatedResponse();
    }

    /**
     * Create an instance of {@link VatAccountGetAccount }
     * 
     */
    public VatAccountGetAccount createVatAccountGetAccount() {
        return new VatAccountGetAccount();
    }

    /**
     * Create an instance of {@link PriceGroupFindByNumberList }
     * 
     */
    public PriceGroupFindByNumberList createPriceGroupFindByNumberList() {
        return new PriceGroupFindByNumberList();
    }

    /**
     * Create an instance of {@link OrderGetDeliveryLocationResponse }
     * 
     */
    public OrderGetDeliveryLocationResponse createOrderGetDeliveryLocationResponse() {
        return new OrderGetDeliveryLocationResponse();
    }

    /**
     * Create an instance of {@link OrderGetMarginResponse }
     * 
     */
    public OrderGetMarginResponse createOrderGetMarginResponse() {
        return new OrderGetMarginResponse();
    }

    /**
     * Create an instance of {@link InvoiceFindByNumberIntervalResponse }
     * 
     */
    public InvoiceFindByNumberIntervalResponse createInvoiceFindByNumberIntervalResponse() {
        return new InvoiceFindByNumberIntervalResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDebtorAddressResponse }
     * 
     */
    public CurrentInvoiceSetDebtorAddressResponse createCurrentInvoiceSetDebtorAddressResponse() {
        return new CurrentInvoiceSetDebtorAddressResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDebtorCountry }
     * 
     */
    public CurrentInvoiceGetDebtorCountry createCurrentInvoiceGetDebtorCountry() {
        return new CurrentInvoiceGetDebtorCountry();
    }

    /**
     * Create an instance of {@link CreditorSetIsAccessibleResponse }
     * 
     */
    public CreditorSetIsAccessibleResponse createCreditorSetIsAccessibleResponse() {
        return new CreditorSetIsAccessibleResponse();
    }

    /**
     * Create an instance of {@link QuotationSetExchangeRateResponse }
     * 
     */
    public QuotationSetExchangeRateResponse createQuotationSetExchangeRateResponse() {
        return new QuotationSetExchangeRateResponse();
    }

    /**
     * Create an instance of {@link VatAccountGetVatCodeResponse }
     * 
     */
    public VatAccountGetVatCodeResponse createVatAccountGetVatCodeResponse() {
        return new VatAccountGetVatCodeResponse();
    }

    /**
     * Create an instance of {@link SubscriberFindBySubscription }
     * 
     */
    public SubscriberFindBySubscription createSubscriberFindBySubscription() {
        return new SubscriberFindBySubscription();
    }

    /**
     * Create an instance of {@link EntryGetVoucherNumberResponse }
     * 
     */
    public EntryGetVoucherNumberResponse createEntryGetVoucherNumberResponse() {
        return new EntryGetVoucherNumberResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetAllResponse }
     * 
     */
    public TermOfPaymentGetAllResponse createTermOfPaymentGetAllResponse() {
        return new TermOfPaymentGetAllResponse();
    }

    /**
     * Create an instance of {@link UnitUpdateFromData }
     * 
     */
    public UnitUpdateFromData createUnitUpdateFromData() {
        return new UnitUpdateFromData();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDateResponse }
     * 
     */
    public CurrentInvoiceSetDateResponse createCurrentInvoiceSetDateResponse() {
        return new CurrentInvoiceSetDateResponse();
    }

    /**
     * Create an instance of {@link ProductGroupFindByNameResponse }
     * 
     */
    public ProductGroupFindByNameResponse createProductGroupFindByNameResponse() {
        return new ProductGroupFindByNameResponse();
    }

    /**
     * Create an instance of {@link SubscriptionCreateFromDataArrayResponse }
     * 
     */
    public SubscriptionCreateFromDataArrayResponse createSubscriptionCreateFromDataArrayResponse() {
        return new SubscriptionCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link DebtorGetEntries }
     * 
     */
    public DebtorGetEntries createDebtorGetEntries() {
        return new DebtorGetEntries();
    }

    /**
     * Create an instance of {@link KeyFigureCodeGetAll }
     * 
     */
    public KeyFigureCodeGetAll createKeyFigureCodeGetAll() {
        return new KeyFigureCodeGetAll();
    }

    /**
     * Create an instance of {@link SubscriberFindBySubscriptionResponse }
     * 
     */
    public SubscriberFindBySubscriptionResponse createSubscriberFindBySubscriptionResponse() {
        return new SubscriberFindBySubscriptionResponse();
    }

    /**
     * Create an instance of {@link KeyFigureCodeGetData }
     * 
     */
    public KeyFigureCodeGetData createKeyFigureCodeGetData() {
        return new KeyFigureCodeGetData();
    }

    /**
     * Create an instance of {@link CostTypeGroupFindByName }
     * 
     */
    public CostTypeGroupFindByName createCostTypeGroupFindByName() {
        return new CostTypeGroupFindByName();
    }

    /**
     * Create an instance of {@link OrderRegisterAsSent }
     * 
     */
    public OrderRegisterAsSent createOrderRegisterAsSent() {
        return new OrderRegisterAsSent();
    }

    /**
     * Create an instance of {@link QuotationLineGetUnitNetPriceResponse }
     * 
     */
    public QuotationLineGetUnitNetPriceResponse createQuotationLineGetUnitNetPriceResponse() {
        return new QuotationLineGetUnitNetPriceResponse();
    }

    /**
     * Create an instance of {@link QuotationLineSetUnitNetPrice }
     * 
     */
    public QuotationLineSetUnitNetPrice createQuotationLineSetUnitNetPrice() {
        return new QuotationLineSetUnitNetPrice();
    }

    /**
     * Create an instance of {@link DebtorGetAllResponse }
     * 
     */
    public DebtorGetAllResponse createDebtorGetAllResponse() {
        return new DebtorGetAllResponse();
    }

    /**
     * Create an instance of {@link CreditorSetCityResponse }
     * 
     */
    public CreditorSetCityResponse createCreditorSetCityResponse() {
        return new CreditorSetCityResponse();
    }

    /**
     * Create an instance of {@link OrderSetDeliveryCounty }
     * 
     */
    public OrderSetDeliveryCounty createOrderSetDeliveryCounty() {
        return new OrderSetDeliveryCounty();
    }

    /**
     * Create an instance of {@link QuotationGetOurReference2Response }
     * 
     */
    public QuotationGetOurReference2Response createQuotationGetOurReference2Response() {
        return new QuotationGetOurReference2Response();
    }

    /**
     * Create an instance of {@link DebtorGroupGetAllResponse }
     * 
     */
    public DebtorGroupGetAllResponse createDebtorGroupGetAllResponse() {
        return new DebtorGroupGetAllResponse();
    }

    /**
     * Create an instance of {@link UnitGetNameResponse }
     * 
     */
    public UnitGetNameResponse createUnitGetNameResponse() {
        return new UnitGetNameResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentSetDistributionInPercentResponse }
     * 
     */
    public TermOfPaymentSetDistributionInPercentResponse createTermOfPaymentSetDistributionInPercentResponse() {
        return new TermOfPaymentSetDistributionInPercentResponse();
    }

    /**
     * Create an instance of {@link ReportCodeSetGetData }
     * 
     */
    public ReportCodeSetGetData createReportCodeSetGetData() {
        return new ReportCodeSetGetData();
    }

    /**
     * Create an instance of {@link QuotationGetMarginAsPercent }
     * 
     */
    public QuotationGetMarginAsPercent createQuotationGetMarginAsPercent() {
        return new QuotationGetMarginAsPercent();
    }

    /**
     * Create an instance of {@link CurrentInvoiceCreateFromData }
     * 
     */
    public CurrentInvoiceCreateFromData createCurrentInvoiceCreateFromData() {
        return new CurrentInvoiceCreateFromData();
    }

    /**
     * Create an instance of {@link DeliveryLocationSetExternalId }
     * 
     */
    public DeliveryLocationSetExternalId createDeliveryLocationSetExternalId() {
        return new DeliveryLocationSetExternalId();
    }

    /**
     * Create an instance of {@link SubscriptionGetData }
     * 
     */
    public SubscriptionGetData createSubscriptionGetData() {
        return new SubscriptionGetData();
    }

    /**
     * Create an instance of {@link CreditorGetIsAccessible }
     * 
     */
    public CreditorGetIsAccessible createCreditorGetIsAccessible() {
        return new CreditorGetIsAccessible();
    }

    /**
     * Create an instance of {@link InventoryLocationGetNumberResponse }
     * 
     */
    public InventoryLocationGetNumberResponse createInventoryLocationGetNumberResponse() {
        return new InventoryLocationGetNumberResponse();
    }

    /**
     * Create an instance of {@link ProjectFindByNumberResponse }
     * 
     */
    public ProjectFindByNumberResponse createProjectFindByNumberResponse() {
        return new ProjectFindByNumberResponse();
    }

    /**
     * Create an instance of {@link AccountGetBudgetFigures }
     * 
     */
    public AccountGetBudgetFigures createAccountGetBudgetFigures() {
        return new AccountGetBudgetFigures();
    }

    /**
     * Create an instance of {@link InvoiceGetDeliveryLocationResponse }
     * 
     */
    public InvoiceGetDeliveryLocationResponse createInvoiceGetDeliveryLocationResponse() {
        return new InvoiceGetDeliveryLocationResponse();
    }

    /**
     * Create an instance of {@link OrderLineCreateFromDataArray }
     * 
     */
    public OrderLineCreateFromDataArray createOrderLineCreateFromDataArray() {
        return new OrderLineCreateFromDataArray();
    }

    /**
     * Create an instance of {@link CurrentInvoiceCreateFromDataResponse }
     * 
     */
    public CurrentInvoiceCreateFromDataResponse createCurrentInvoiceCreateFromDataResponse() {
        return new CurrentInvoiceCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link CreditorGetName }
     * 
     */
    public CreditorGetName createCreditorGetName() {
        return new CreditorGetName();
    }

    /**
     * Create an instance of {@link CashBookEntryGetContraAccount }
     * 
     */
    public CashBookEntryGetContraAccount createCashBookEntryGetContraAccount() {
        return new CashBookEntryGetContraAccount();
    }

    /**
     * Create an instance of {@link EntryGetDistributionKey }
     * 
     */
    public EntryGetDistributionKey createEntryGetDistributionKey() {
        return new EntryGetDistributionKey();
    }

    /**
     * Create an instance of {@link DebtorContactSetName }
     * 
     */
    public DebtorContactSetName createDebtorContactSetName() {
        return new DebtorContactSetName();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetTermsOfDeliveryResponse }
     * 
     */
    public CurrentInvoiceGetTermsOfDeliveryResponse createCurrentInvoiceGetTermsOfDeliveryResponse() {
        return new CurrentInvoiceGetTermsOfDeliveryResponse();
    }

    /**
     * Create an instance of {@link ActivityFindByNumberList }
     * 
     */
    public ActivityFindByNumberList createActivityFindByNumberList() {
        return new ActivityFindByNumberList();
    }

    /**
     * Create an instance of {@link QuotationLineGetDataArrayResponse }
     * 
     */
    public QuotationLineGetDataArrayResponse createQuotationLineGetDataArrayResponse() {
        return new QuotationLineGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link DebtorUpdateFromDataArrayResponse }
     * 
     */
    public DebtorUpdateFromDataArrayResponse createDebtorUpdateFromDataArrayResponse() {
        return new DebtorUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link ProductGetAllAccessibleResponse }
     * 
     */
    public ProductGetAllAccessibleResponse createProductGetAllAccessibleResponse() {
        return new ProductGetAllAccessibleResponse();
    }

    /**
     * Create an instance of {@link CompanyGetAddress2Response }
     * 
     */
    public CompanyGetAddress2Response createCompanyGetAddress2Response() {
        return new CompanyGetAddress2Response();
    }

    /**
     * Create an instance of {@link InventoryLocationFindByNumberResponse }
     * 
     */
    public InventoryLocationFindByNumberResponse createInventoryLocationFindByNumberResponse() {
        return new InventoryLocationFindByNumberResponse();
    }

    /**
     * Create an instance of {@link CashBookFindByName }
     * 
     */
    public CashBookFindByName createCashBookFindByName() {
        return new CashBookFindByName();
    }

    /**
     * Create an instance of {@link DeliveryLocationUpdateFromDataResponse }
     * 
     */
    public DeliveryLocationUpdateFromDataResponse createDeliveryLocationUpdateFromDataResponse() {
        return new DeliveryLocationUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link CreditorSetCountry }
     * 
     */
    public CreditorSetCountry createCreditorSetCountry() {
        return new CreditorSetCountry();
    }

    /**
     * Create an instance of {@link QuotationGetTextLine2Response }
     * 
     */
    public QuotationGetTextLine2Response createQuotationGetTextLine2Response() {
        return new QuotationGetTextLine2Response();
    }

    /**
     * Create an instance of {@link QuotationLineGetTotalNetAmountResponse }
     * 
     */
    public QuotationLineGetTotalNetAmountResponse createQuotationLineGetTotalNetAmountResponse() {
        return new QuotationLineGetTotalNetAmountResponse();
    }

    /**
     * Create an instance of {@link DebtorContactCreate }
     * 
     */
    public DebtorContactCreate createDebtorContactCreate() {
        return new DebtorContactCreate();
    }

    /**
     * Create an instance of {@link ProjectGetNameResponse }
     * 
     */
    public ProjectGetNameResponse createProjectGetNameResponse() {
        return new ProjectGetNameResponse();
    }

    /**
     * Create an instance of {@link ProjectSetNameResponse }
     * 
     */
    public ProjectSetNameResponse createProjectSetNameResponse() {
        return new ProjectSetNameResponse();
    }

    /**
     * Create an instance of {@link MileageEntryUpdateFromDataArrayResponse }
     * 
     */
    public MileageEntryUpdateFromDataArrayResponse createMileageEntryUpdateFromDataArrayResponse() {
        return new MileageEntryUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CreditorContactDeleteResponse }
     * 
     */
    public CreditorContactDeleteResponse createCreditorContactDeleteResponse() {
        return new CreditorContactDeleteResponse();
    }

    /**
     * Create an instance of {@link CreditorContactFindByNameResponse }
     * 
     */
    public CreditorContactFindByNameResponse createCreditorContactFindByNameResponse() {
        return new CreditorContactFindByNameResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentSetContraAccount }
     * 
     */
    public TermOfPaymentSetContraAccount createTermOfPaymentSetContraAccount() {
        return new TermOfPaymentSetContraAccount();
    }

    /**
     * Create an instance of {@link ProductSetProductGroupResponse }
     * 
     */
    public ProductSetProductGroupResponse createProductSetProductGroupResponse() {
        return new ProductSetProductGroupResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineSetQuantityResponse }
     * 
     */
    public CurrentSupplierInvoiceLineSetQuantityResponse createCurrentSupplierInvoiceLineSetQuantityResponse() {
        return new CurrentSupplierInvoiceLineSetQuantityResponse();
    }

    /**
     * Create an instance of {@link ProjectGetAll }
     * 
     */
    public ProjectGetAll createProjectGetAll() {
        return new ProjectGetAll();
    }

    /**
     * Create an instance of {@link TimeEntryGetId }
     * 
     */
    public TimeEntryGetId createTimeEntryGetId() {
        return new TimeEntryGetId();
    }

    /**
     * Create an instance of {@link ScannedDocumentGetDataArrayResponse }
     * 
     */
    public ScannedDocumentGetDataArrayResponse createScannedDocumentGetDataArrayResponse() {
        return new ScannedDocumentGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ArrayOfScannedDocumentData }
     * 
     */
    public ArrayOfScannedDocumentData createArrayOfScannedDocumentData() {
        return new ArrayOfScannedDocumentData();
    }

    /**
     * Create an instance of {@link SubscriptionLineUpdateFromDataArrayResponse }
     * 
     */
    public SubscriptionLineUpdateFromDataArrayResponse createSubscriptionLineUpdateFromDataArrayResponse() {
        return new SubscriptionLineUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link QuotationLineGetUnitResponse }
     * 
     */
    public QuotationLineGetUnitResponse createQuotationLineGetUnitResponse() {
        return new QuotationLineGetUnitResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetGrossAmountResponse }
     * 
     */
    public CurrentInvoiceGetGrossAmountResponse createCurrentInvoiceGetGrossAmountResponse() {
        return new CurrentInvoiceGetGrossAmountResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetOurReference2 }
     * 
     */
    public CurrentInvoiceGetOurReference2 createCurrentInvoiceGetOurReference2() {
        return new CurrentInvoiceGetOurReference2();
    }

    /**
     * Create an instance of {@link InvoiceLineFindByInvoiceNumberInterval }
     * 
     */
    public InvoiceLineFindByInvoiceNumberInterval createInvoiceLineFindByInvoiceNumberInterval() {
        return new InvoiceLineFindByInvoiceNumberInterval();
    }

    /**
     * Create an instance of {@link ProjectGroupFindByNumberListResponse }
     * 
     */
    public ProjectGroupFindByNumberListResponse createProjectGroupFindByNumberListResponse() {
        return new ProjectGroupFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link ProductSetSalesPriceResponse }
     * 
     */
    public ProductSetSalesPriceResponse createProductSetSalesPriceResponse() {
        return new ProductSetSalesPriceResponse();
    }

    /**
     * Create an instance of {@link QuotationGetOtherReference }
     * 
     */
    public QuotationGetOtherReference createQuotationGetOtherReference() {
        return new QuotationGetOtherReference();
    }

    /**
     * Create an instance of {@link DepartmentGetNumberResponse }
     * 
     */
    public DepartmentGetNumberResponse createDepartmentGetNumberResponse() {
        return new DepartmentGetNumberResponse();
    }

    /**
     * Create an instance of {@link DebtorContactSetComments }
     * 
     */
    public DebtorContactSetComments createDebtorContactSetComments() {
        return new DebtorContactSetComments();
    }

    /**
     * Create an instance of {@link UnitDeleteResponse }
     * 
     */
    public UnitDeleteResponse createUnitDeleteResponse() {
        return new UnitDeleteResponse();
    }

    /**
     * Create an instance of {@link EmployeeFindByNameResponse }
     * 
     */
    public EmployeeFindByNameResponse createEmployeeFindByNameResponse() {
        return new EmployeeFindByNameResponse();
    }

    /**
     * Create an instance of {@link ProjectSetDebtorResponse }
     * 
     */
    public ProjectSetDebtorResponse createProjectSetDebtorResponse() {
        return new ProjectSetDebtorResponse();
    }

    /**
     * Create an instance of {@link TimeEntryGetText }
     * 
     */
    public TimeEntryGetText createTimeEntryGetText() {
        return new TimeEntryGetText();
    }

    /**
     * Create an instance of {@link CashBookEntryGetDataArray }
     * 
     */
    public CashBookEntryGetDataArray createCashBookEntryGetDataArray() {
        return new CashBookEntryGetDataArray();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineGetNumber }
     * 
     */
    public CurrentInvoiceLineGetNumber createCurrentInvoiceLineGetNumber() {
        return new CurrentInvoiceLineGetNumber();
    }

    /**
     * Create an instance of {@link CashBookEntryUpdateFromDataResponse }
     * 
     */
    public CashBookEntryUpdateFromDataResponse createCashBookEntryUpdateFromDataResponse() {
        return new CashBookEntryUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDebtorName }
     * 
     */
    public CurrentInvoiceGetDebtorName createCurrentInvoiceGetDebtorName() {
        return new CurrentInvoiceGetDebtorName();
    }

    /**
     * Create an instance of {@link CreditorCreateFromData }
     * 
     */
    public CreditorCreateFromData createCreditorCreateFromData() {
        return new CreditorCreateFromData();
    }

    /**
     * Create an instance of {@link DebtorSetCreditMaximumResponse }
     * 
     */
    public DebtorSetCreditMaximumResponse createDebtorSetCreditMaximumResponse() {
        return new DebtorSetCreditMaximumResponse();
    }

    /**
     * Create an instance of {@link EntryGetSerialNumber }
     * 
     */
    public EntryGetSerialNumber createEntryGetSerialNumber() {
        return new EntryGetSerialNumber();
    }

    /**
     * Create an instance of {@link OrderLineGetDistributionKeyResponse }
     * 
     */
    public OrderLineGetDistributionKeyResponse createOrderLineGetDistributionKeyResponse() {
        return new OrderLineGetDistributionKeyResponse();
    }

    /**
     * Create an instance of {@link ProjectGroupGetData }
     * 
     */
    public ProjectGroupGetData createProjectGroupGetData() {
        return new ProjectGroupGetData();
    }

    /**
     * Create an instance of {@link ProductGroupGetAccountForVatExemptDebtorInvoicesCurrent }
     * 
     */
    public ProductGroupGetAccountForVatExemptDebtorInvoicesCurrent createProductGroupGetAccountForVatExemptDebtorInvoicesCurrent() {
        return new ProductGroupGetAccountForVatExemptDebtorInvoicesCurrent();
    }

    /**
     * Create an instance of {@link BankPaymentTypeGetName }
     * 
     */
    public BankPaymentTypeGetName createBankPaymentTypeGetName() {
        return new BankPaymentTypeGetName();
    }

    /**
     * Create an instance of {@link UnitFindByNumberListResponse }
     * 
     */
    public UnitFindByNumberListResponse createUnitFindByNumberListResponse() {
        return new UnitFindByNumberListResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetDeliveryCountry }
     * 
     */
    public InvoiceGetDeliveryCountry createInvoiceGetDeliveryCountry() {
        return new InvoiceGetDeliveryCountry();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetAll }
     * 
     */
    public DeliveryLocationGetAll createDeliveryLocationGetAll() {
        return new DeliveryLocationGetAll();
    }

    /**
     * Create an instance of {@link DebtorContactSetTelephoneNumber }
     * 
     */
    public DebtorContactSetTelephoneNumber createDebtorContactSetTelephoneNumber() {
        return new DebtorContactSetTelephoneNumber();
    }

    /**
     * Create an instance of {@link DebtorGetVatNumber }
     * 
     */
    public DebtorGetVatNumber createDebtorGetVatNumber() {
        return new DebtorGetVatNumber();
    }

    /**
     * Create an instance of {@link DebtorGroupGetName }
     * 
     */
    public DebtorGroupGetName createDebtorGroupGetName() {
        return new DebtorGroupGetName();
    }

    /**
     * Create an instance of {@link QuotationGetPublicEntryNumber }
     * 
     */
    public QuotationGetPublicEntryNumber createQuotationGetPublicEntryNumber() {
        return new QuotationGetPublicEntryNumber();
    }

    /**
     * Create an instance of {@link ProjectGetEntriesByDate }
     * 
     */
    public ProjectGetEntriesByDate createProjectGetEntriesByDate() {
        return new ProjectGetEntriesByDate();
    }

    /**
     * Create an instance of {@link OrderLineSetDepartment }
     * 
     */
    public OrderLineSetDepartment createOrderLineSetDepartment() {
        return new OrderLineSetDepartment();
    }

    /**
     * Create an instance of {@link DebtorContactSetNameResponse }
     * 
     */
    public DebtorContactSetNameResponse createDebtorContactSetNameResponse() {
        return new DebtorContactSetNameResponse();
    }

    /**
     * Create an instance of {@link DepartmentGetNameResponse }
     * 
     */
    public DepartmentGetNameResponse createDepartmentGetNameResponse() {
        return new DepartmentGetNameResponse();
    }

    /**
     * Create an instance of {@link ProductGroupDelete }
     * 
     */
    public ProductGroupDelete createProductGroupDelete() {
        return new ProductGroupDelete();
    }

    /**
     * Create an instance of {@link DebtorContactFindByExternalId }
     * 
     */
    public DebtorContactFindByExternalId createDebtorContactFindByExternalId() {
        return new DebtorContactFindByExternalId();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineSetUnitPrice }
     * 
     */
    public CurrentSupplierInvoiceLineSetUnitPrice createCurrentSupplierInvoiceLineSetUnitPrice() {
        return new CurrentSupplierInvoiceLineSetUnitPrice();
    }

    /**
     * Create an instance of {@link SubscriberDelete }
     * 
     */
    public SubscriberDelete createSubscriberDelete() {
        return new SubscriberDelete();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetProject }
     * 
     */
    public CurrentInvoiceSetProject createCurrentInvoiceSetProject() {
        return new CurrentInvoiceSetProject();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDeliveryCountyResponse }
     * 
     */
    public CurrentInvoiceGetDeliveryCountyResponse createCurrentInvoiceGetDeliveryCountyResponse() {
        return new CurrentInvoiceGetDeliveryCountyResponse();
    }

    /**
     * Create an instance of {@link TimeEntryGetAllResponse }
     * 
     */
    public TimeEntryGetAllResponse createTimeEntryGetAllResponse() {
        return new TimeEntryGetAllResponse();
    }

    /**
     * Create an instance of {@link OrderLineSetDescription }
     * 
     */
    public OrderLineSetDescription createOrderLineSetDescription() {
        return new OrderLineSetDescription();
    }

    /**
     * Create an instance of {@link QuotationLineSetDescription }
     * 
     */
    public QuotationLineSetDescription createQuotationLineSetDescription() {
        return new QuotationLineSetDescription();
    }

    /**
     * Create an instance of {@link InvoiceGetDeliveryCountyResponse }
     * 
     */
    public InvoiceGetDeliveryCountyResponse createInvoiceGetDeliveryCountyResponse() {
        return new InvoiceGetDeliveryCountyResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetDueDateResponse }
     * 
     */
    public InvoiceGetDueDateResponse createInvoiceGetDueDateResponse() {
        return new InvoiceGetDueDateResponse();
    }

    /**
     * Create an instance of {@link ProductPriceSetPrice }
     * 
     */
    public ProductPriceSetPrice createProductPriceSetPrice() {
        return new ProductPriceSetPrice();
    }

    /**
     * Create an instance of {@link ProductPriceGetDataResponse }
     * 
     */
    public ProductPriceGetDataResponse createProductPriceGetDataResponse() {
        return new ProductPriceGetDataResponse();
    }

    /**
     * Create an instance of {@link CompanyGetPostalCodeResponse }
     * 
     */
    public CompanyGetPostalCodeResponse createCompanyGetPostalCodeResponse() {
        return new CompanyGetPostalCodeResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetVatAmountResponse }
     * 
     */
    public InvoiceGetVatAmountResponse createInvoiceGetVatAmountResponse() {
        return new InvoiceGetVatAmountResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineSetUnitPriceResponse }
     * 
     */
    public CurrentSupplierInvoiceLineSetUnitPriceResponse createCurrentSupplierInvoiceLineSetUnitPriceResponse() {
        return new CurrentSupplierInvoiceLineSetUnitPriceResponse();
    }

    /**
     * Create an instance of {@link QuotationLineCreateFromDataResponse }
     * 
     */
    public QuotationLineCreateFromDataResponse createQuotationLineCreateFromDataResponse() {
        return new QuotationLineCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link CreditorGetPostalCode }
     * 
     */
    public CreditorGetPostalCode createCreditorGetPostalCode() {
        return new CreditorGetPostalCode();
    }

    /**
     * Create an instance of {@link ProjectUpdateFromData }
     * 
     */
    public ProjectUpdateFromData createProjectUpdateFromData() {
        return new ProjectUpdateFromData();
    }

    /**
     * Create an instance of {@link EmployeeGetSalesPriceResponse }
     * 
     */
    public EmployeeGetSalesPriceResponse createEmployeeGetSalesPriceResponse() {
        return new EmployeeGetSalesPriceResponse();
    }

    /**
     * Create an instance of {@link DocumentArchiveCategoryUpdateFromDataArrayResponse }
     * 
     */
    public DocumentArchiveCategoryUpdateFromDataArrayResponse createDocumentArchiveCategoryUpdateFromDataArrayResponse() {
        return new DocumentArchiveCategoryUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CashBookGetEntries }
     * 
     */
    public CashBookGetEntries createCashBookGetEntries() {
        return new CashBookGetEntries();
    }

    /**
     * Create an instance of {@link ActivityGetDataArray }
     * 
     */
    public ActivityGetDataArray createActivityGetDataArray() {
        return new ActivityGetDataArray();
    }

    /**
     * Create an instance of {@link QuotationUpdateFromDataArray }
     * 
     */
    public QuotationUpdateFromDataArray createQuotationUpdateFromDataArray() {
        return new QuotationUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link OrderGetOurReferenceResponse }
     * 
     */
    public OrderGetOurReferenceResponse createOrderGetOurReferenceResponse() {
        return new OrderGetOurReferenceResponse();
    }

    /**
     * Create an instance of {@link CreditorGetYourReferenceResponse }
     * 
     */
    public CreditorGetYourReferenceResponse createCreditorGetYourReferenceResponse() {
        return new CreditorGetYourReferenceResponse();
    }

    /**
     * Create an instance of {@link EmployeeGroupCreateFromDataResponse }
     * 
     */
    public EmployeeGroupCreateFromDataResponse createEmployeeGroupCreateFromDataResponse() {
        return new EmployeeGroupCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link TimeEntryFindApprovedByDateResponse }
     * 
     */
    public TimeEntryFindApprovedByDateResponse createTimeEntryFindApprovedByDateResponse() {
        return new TimeEntryFindApprovedByDateResponse();
    }

    /**
     * Create an instance of {@link CreditorGroupGetAccount }
     * 
     */
    public CreditorGroupGetAccount createCreditorGroupGetAccount() {
        return new CreditorGroupGetAccount();
    }

    /**
     * Create an instance of {@link CashBookBookWithDate }
     * 
     */
    public CashBookBookWithDate createCashBookBookWithDate() {
        return new CashBookBookWithDate();
    }

    /**
     * Create an instance of {@link InvoiceLineGetProductResponse }
     * 
     */
    public InvoiceLineGetProductResponse createInvoiceLineGetProductResponse() {
        return new InvoiceLineGetProductResponse();
    }

    /**
     * Create an instance of {@link TimeEntrySetTextResponse }
     * 
     */
    public TimeEntrySetTextResponse createTimeEntrySetTextResponse() {
        return new TimeEntrySetTextResponse();
    }

    /**
     * Create an instance of {@link DebtorEntryGetDebtorResponse }
     * 
     */
    public DebtorEntryGetDebtorResponse createDebtorEntryGetDebtorResponse() {
        return new DebtorEntryGetDebtorResponse();
    }

    /**
     * Create an instance of {@link CashBookUpdateFromDataArray }
     * 
     */
    public CashBookUpdateFromDataArray createCashBookUpdateFromDataArray() {
        return new CashBookUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link DebtorSetEmail }
     * 
     */
    public DebtorSetEmail createDebtorSetEmail() {
        return new DebtorSetEmail();
    }

    /**
     * Create an instance of {@link QuotationUpdateFromDataArrayResponse }
     * 
     */
    public QuotationUpdateFromDataArrayResponse createQuotationUpdateFromDataArrayResponse() {
        return new QuotationUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link CompanyGetFaxNumberResponse }
     * 
     */
    public CompanyGetFaxNumberResponse createCompanyGetFaxNumberResponse() {
        return new CompanyGetFaxNumberResponse();
    }

    /**
     * Create an instance of {@link ProductGroupSetAccountForVatLiableDebtorInvoicesCurrentResponse }
     * 
     */
    public ProductGroupSetAccountForVatLiableDebtorInvoicesCurrentResponse createProductGroupSetAccountForVatLiableDebtorInvoicesCurrentResponse() {
        return new ProductGroupSetAccountForVatLiableDebtorInvoicesCurrentResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineUpdateFromDataArrayResponse }
     * 
     */
    public CurrentSupplierInvoiceLineUpdateFromDataArrayResponse createCurrentSupplierInvoiceLineUpdateFromDataArrayResponse() {
        return new CurrentSupplierInvoiceLineUpdateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link SubscriberSetPriceIndexResponse }
     * 
     */
    public SubscriberSetPriceIndexResponse createSubscriberSetPriceIndexResponse() {
        return new SubscriberSetPriceIndexResponse();
    }

    /**
     * Create an instance of {@link CostTypeGetNumberResponse }
     * 
     */
    public CostTypeGetNumberResponse createCostTypeGetNumberResponse() {
        return new CostTypeGetNumberResponse();
    }

    /**
     * Create an instance of {@link QuotationGetDeliveryCity }
     * 
     */
    public QuotationGetDeliveryCity createQuotationGetDeliveryCity() {
        return new QuotationGetDeliveryCity();
    }

    /**
     * Create an instance of {@link BudgetFigureGetDistributionKey }
     * 
     */
    public BudgetFigureGetDistributionKey createBudgetFigureGetDistributionKey() {
        return new BudgetFigureGetDistributionKey();
    }

    /**
     * Create an instance of {@link QuotationGetNetAmount }
     * 
     */
    public QuotationGetNetAmount createQuotationGetNetAmount() {
        return new QuotationGetNetAmount();
    }

    /**
     * Create an instance of {@link EntryGetSerialNumberResponse }
     * 
     */
    public EntryGetSerialNumberResponse createEntryGetSerialNumberResponse() {
        return new EntryGetSerialNumberResponse();
    }

    /**
     * Create an instance of {@link ProductSetNameResponse }
     * 
     */
    public ProductSetNameResponse createProductSetNameResponse() {
        return new ProductSetNameResponse();
    }

    /**
     * Create an instance of {@link QuotationSetDateResponse }
     * 
     */
    public QuotationSetDateResponse createQuotationSetDateResponse() {
        return new QuotationSetDateResponse();
    }

    /**
     * Create an instance of {@link SubscriberGetStartDate }
     * 
     */
    public SubscriberGetStartDate createSubscriberGetStartDate() {
        return new SubscriberGetStartDate();
    }

    /**
     * Create an instance of {@link CompanySetCustomFieldsResponse }
     * 
     */
    public CompanySetCustomFieldsResponse createCompanySetCustomFieldsResponse() {
        return new CompanySetCustomFieldsResponse();
    }

    /**
     * Create an instance of {@link CashBookEntrySetAccount }
     * 
     */
    public CashBookEntrySetAccount createCashBookEntrySetAccount() {
        return new CashBookEntrySetAccount();
    }

    /**
     * Create an instance of {@link ReportCodeSetGetCodesResponse }
     * 
     */
    public ReportCodeSetGetCodesResponse createReportCodeSetGetCodesResponse() {
        return new ReportCodeSetGetCodesResponse();
    }

    /**
     * Create an instance of {@link ProductGetDataResponse }
     * 
     */
    public ProductGetDataResponse createProductGetDataResponse() {
        return new ProductGetDataResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceLineCreate }
     * 
     */
    public CurrentInvoiceLineCreate createCurrentInvoiceLineCreate() {
        return new CurrentInvoiceLineCreate();
    }

    /**
     * Create an instance of {@link CreditorGetCreditorGroup }
     * 
     */
    public CreditorGetCreditorGroup createCreditorGetCreditorGroup() {
        return new CreditorGetCreditorGroup();
    }

    /**
     * Create an instance of {@link QuotationRegisterAsSent }
     * 
     */
    public QuotationRegisterAsSent createQuotationRegisterAsSent() {
        return new QuotationRegisterAsSent();
    }

    /**
     * Create an instance of {@link QuotationSetOtherReference }
     * 
     */
    public QuotationSetOtherReference createQuotationSetOtherReference() {
        return new QuotationSetOtherReference();
    }

    /**
     * Create an instance of {@link TimeEntryGetDataArray }
     * 
     */
    public TimeEntryGetDataArray createTimeEntryGetDataArray() {
        return new TimeEntryGetDataArray();
    }

    /**
     * Create an instance of {@link OrderGetLinesResponse }
     * 
     */
    public OrderGetLinesResponse createOrderGetLinesResponse() {
        return new OrderGetLinesResponse();
    }

    /**
     * Create an instance of {@link SubscriptionSetAllowMoreThanOneForEachDebtor }
     * 
     */
    public SubscriptionSetAllowMoreThanOneForEachDebtor createSubscriptionSetAllowMoreThanOneForEachDebtor() {
        return new SubscriptionSetAllowMoreThanOneForEachDebtor();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetName }
     * 
     */
    public TermOfPaymentGetName createTermOfPaymentGetName() {
        return new TermOfPaymentGetName();
    }

    /**
     * Create an instance of {@link CashBookBook }
     * 
     */
    public CashBookBook createCashBookBook() {
        return new CashBookBook();
    }

    /**
     * Create an instance of {@link SubscriptionGetAllowMoreThanOneForEachDebtor }
     * 
     */
    public SubscriptionGetAllowMoreThanOneForEachDebtor createSubscriptionGetAllowMoreThanOneForEachDebtor() {
        return new SubscriptionGetAllowMoreThanOneForEachDebtor();
    }

    /**
     * Create an instance of {@link BudgetFigureSetToDateResponse }
     * 
     */
    public BudgetFigureSetToDateResponse createBudgetFigureSetToDateResponse() {
        return new BudgetFigureSetToDateResponse();
    }

    /**
     * Create an instance of {@link ProductSetDepartment }
     * 
     */
    public ProductSetDepartment createProductSetDepartment() {
        return new ProductSetDepartment();
    }

    /**
     * Create an instance of {@link CreditorEntryGetSerialNumber }
     * 
     */
    public CreditorEntryGetSerialNumber createCreditorEntryGetSerialNumber() {
        return new CreditorEntryGetSerialNumber();
    }

    /**
     * Create an instance of {@link OrderGetDebtor }
     * 
     */
    public OrderGetDebtor createOrderGetDebtor() {
        return new OrderGetDebtor();
    }

    /**
     * Create an instance of {@link DebtorFindByNumberResponse }
     * 
     */
    public DebtorFindByNumberResponse createDebtorFindByNumberResponse() {
        return new DebtorFindByNumberResponse();
    }

    /**
     * Create an instance of {@link CompanyGetMobileNumberResponse }
     * 
     */
    public CompanyGetMobileNumberResponse createCompanyGetMobileNumberResponse() {
        return new CompanyGetMobileNumberResponse();
    }

    /**
     * Create an instance of {@link CreditorContactDelete }
     * 
     */
    public CreditorContactDelete createCreditorContactDelete() {
        return new CreditorContactDelete();
    }

    /**
     * Create an instance of {@link OrderLineGetOrderResponse }
     * 
     */
    public OrderLineGetOrderResponse createOrderLineGetOrderResponse() {
        return new OrderLineGetOrderResponse();
    }

    /**
     * Create an instance of {@link SumIntervalCreateResponse }
     * 
     */
    public SumIntervalCreateResponse createSumIntervalCreateResponse() {
        return new SumIntervalCreateResponse();
    }

    /**
     * Create an instance of {@link OrderGetOurReference2 }
     * 
     */
    public OrderGetOurReference2 createOrderGetOurReference2() {
        return new OrderGetOurReference2();
    }

    /**
     * Create an instance of {@link OrderSetTermOfPayment }
     * 
     */
    public OrderSetTermOfPayment createOrderSetTermOfPayment() {
        return new OrderSetTermOfPayment();
    }

    /**
     * Create an instance of {@link DebtorGetSubscribers }
     * 
     */
    public DebtorGetSubscribers createDebtorGetSubscribers() {
        return new DebtorGetSubscribers();
    }

    /**
     * Create an instance of {@link CashBookEntryCreateCreditorPayment }
     * 
     */
    public CashBookEntryCreateCreditorPayment createCashBookEntryCreateCreditorPayment() {
        return new CashBookEntryCreateCreditorPayment();
    }

    /**
     * Create an instance of {@link DebtorGroupSetName }
     * 
     */
    public DebtorGroupSetName createDebtorGroupSetName() {
        return new DebtorGroupSetName();
    }

    /**
     * Create an instance of {@link InvoiceGetRemainder }
     * 
     */
    public InvoiceGetRemainder createInvoiceGetRemainder() {
        return new InvoiceGetRemainder();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDebtorCounty }
     * 
     */
    public CurrentInvoiceSetDebtorCounty createCurrentInvoiceSetDebtorCounty() {
        return new CurrentInvoiceSetDebtorCounty();
    }

    /**
     * Create an instance of {@link OrderSetCurrency }
     * 
     */
    public OrderSetCurrency createOrderSetCurrency() {
        return new OrderSetCurrency();
    }

    /**
     * Create an instance of {@link DeliveryLocationGetTermsOfDelivery }
     * 
     */
    public DeliveryLocationGetTermsOfDelivery createDeliveryLocationGetTermsOfDelivery() {
        return new DeliveryLocationGetTermsOfDelivery();
    }

    /**
     * Create an instance of {@link ProductGetDepartmentResponse }
     * 
     */
    public ProductGetDepartmentResponse createProductGetDepartmentResponse() {
        return new ProductGetDepartmentResponse();
    }

    /**
     * Create an instance of {@link CreditorCreateResponse }
     * 
     */
    public CreditorCreateResponse createCreditorCreateResponse() {
        return new CreditorCreateResponse();
    }

    /**
     * Create an instance of {@link QuotationGetIsArchivedResponse }
     * 
     */
    public QuotationGetIsArchivedResponse createQuotationGetIsArchivedResponse() {
        return new QuotationGetIsArchivedResponse();
    }

    /**
     * Create an instance of {@link CreditorGroupCreateFromData }
     * 
     */
    public CreditorGroupCreateFromData createCreditorGroupCreateFromData() {
        return new CreditorGroupCreateFromData();
    }

    /**
     * Create an instance of {@link UnitGetAll }
     * 
     */
    public UnitGetAll createUnitGetAll() {
        return new UnitGetAll();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDueDate }
     * 
     */
    public CurrentInvoiceSetDueDate createCurrentInvoiceSetDueDate() {
        return new CurrentInvoiceSetDueDate();
    }

    /**
     * Create an instance of {@link CostTypeGroupGetNumberResponse }
     * 
     */
    public CostTypeGroupGetNumberResponse createCostTypeGroupGetNumberResponse() {
        return new CostTypeGroupGetNumberResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentSetDescription }
     * 
     */
    public TermOfPaymentSetDescription createTermOfPaymentSetDescription() {
        return new TermOfPaymentSetDescription();
    }

    /**
     * Create an instance of {@link SumIntervalCreateFromDataArrayResponse }
     * 
     */
    public SumIntervalCreateFromDataArrayResponse createSumIntervalCreateFromDataArrayResponse() {
        return new SumIntervalCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetDeliveryCountryResponse }
     * 
     */
    public InvoiceGetDeliveryCountryResponse createInvoiceGetDeliveryCountryResponse() {
        return new InvoiceGetDeliveryCountryResponse();
    }

    /**
     * Create an instance of {@link SubscriberGetStartDateResponse }
     * 
     */
    public SubscriberGetStartDateResponse createSubscriberGetStartDateResponse() {
        return new SubscriberGetStartDateResponse();
    }

    /**
     * Create an instance of {@link OrderLineGetDataArray }
     * 
     */
    public OrderLineGetDataArray createOrderLineGetDataArray() {
        return new OrderLineGetDataArray();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetOurReference }
     * 
     */
    public CurrentInvoiceSetOurReference createCurrentInvoiceSetOurReference() {
        return new CurrentInvoiceSetOurReference();
    }

    /**
     * Create an instance of {@link InvoiceGetTextLine2 }
     * 
     */
    public InvoiceGetTextLine2 createInvoiceGetTextLine2() {
        return new InvoiceGetTextLine2();
    }

    /**
     * Create an instance of {@link QuotationSetDeliveryDateResponse }
     * 
     */
    public QuotationSetDeliveryDateResponse createQuotationSetDeliveryDateResponse() {
        return new QuotationSetDeliveryDateResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetTextLine1 }
     * 
     */
    public InvoiceGetTextLine1 createInvoiceGetTextLine1() {
        return new InvoiceGetTextLine1();
    }

    /**
     * Create an instance of {@link OrderLineSetUnitResponse }
     * 
     */
    public OrderLineSetUnitResponse createOrderLineSetUnitResponse() {
        return new OrderLineSetUnitResponse();
    }

    /**
     * Create an instance of {@link ProductGroupUpdateFromData }
     * 
     */
    public ProductGroupUpdateFromData createProductGroupUpdateFromData() {
        return new ProductGroupUpdateFromData();
    }

    /**
     * Create an instance of {@link CompanySetEmailResponse }
     * 
     */
    public CompanySetEmailResponse createCompanySetEmailResponse() {
        return new CompanySetEmailResponse();
    }

    /**
     * Create an instance of {@link SubscriptionGetDataArrayResponse }
     * 
     */
    public SubscriptionGetDataArrayResponse createSubscriptionGetDataArrayResponse() {
        return new SubscriptionGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link ProjectSetResponsible }
     * 
     */
    public ProjectSetResponsible createProjectSetResponsible() {
        return new ProjectSetResponsible();
    }

    /**
     * Create an instance of {@link DebtorSetLayoutResponse }
     * 
     */
    public DebtorSetLayoutResponse createDebtorSetLayoutResponse() {
        return new DebtorSetLayoutResponse();
    }

    /**
     * Create an instance of {@link SubscriptionGetSubscriptionLines }
     * 
     */
    public SubscriptionGetSubscriptionLines createSubscriptionGetSubscriptionLines() {
        return new SubscriptionGetSubscriptionLines();
    }

    /**
     * Create an instance of {@link InvoiceLineGetTotalNetAmountResponse }
     * 
     */
    public InvoiceLineGetTotalNetAmountResponse createInvoiceLineGetTotalNetAmountResponse() {
        return new InvoiceLineGetTotalNetAmountResponse();
    }

    /**
     * Create an instance of {@link KeyFigureCodeFindByNumberResponse }
     * 
     */
    public KeyFigureCodeFindByNumberResponse createKeyFigureCodeFindByNumberResponse() {
        return new KeyFigureCodeFindByNumberResponse();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceLineGetDataArrayResponse }
     * 
     */
    public CurrentSupplierInvoiceLineGetDataArrayResponse createCurrentSupplierInvoiceLineGetDataArrayResponse() {
        return new CurrentSupplierInvoiceLineGetDataArrayResponse();
    }

    /**
     * Create an instance of {@link CreditorGroupCreateFromDataResponse }
     * 
     */
    public CreditorGroupCreateFromDataResponse createCreditorGroupCreateFromDataResponse() {
        return new CreditorGroupCreateFromDataResponse();
    }

    /**
     * Create an instance of {@link TermOfPaymentGetDescription }
     * 
     */
    public TermOfPaymentGetDescription createTermOfPaymentGetDescription() {
        return new TermOfPaymentGetDescription();
    }

    /**
     * Create an instance of {@link BudgetFigureGetDepartment }
     * 
     */
    public BudgetFigureGetDepartment createBudgetFigureGetDepartment() {
        return new BudgetFigureGetDepartment();
    }

    /**
     * Create an instance of {@link EmployeeGetCostPriceAfter }
     * 
     */
    public EmployeeGetCostPriceAfter createEmployeeGetCostPriceAfter() {
        return new EmployeeGetCostPriceAfter();
    }

    /**
     * Create an instance of {@link CreditorGroupGetNumber }
     * 
     */
    public CreditorGroupGetNumber createCreditorGroupGetNumber() {
        return new CreditorGroupGetNumber();
    }

    /**
     * Create an instance of {@link ProductPriceCreateFromDataArrayResponse }
     * 
     */
    public ProductPriceCreateFromDataArrayResponse createProductPriceCreateFromDataArrayResponse() {
        return new ProductPriceCreateFromDataArrayResponse();
    }

    /**
     * Create an instance of {@link DeliveryLocationSetCounty }
     * 
     */
    public DeliveryLocationSetCounty createDeliveryLocationSetCounty() {
        return new DeliveryLocationSetCounty();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetAllResponse }
     * 
     */
    public CurrentInvoiceGetAllResponse createCurrentInvoiceGetAllResponse() {
        return new CurrentInvoiceGetAllResponse();
    }

    /**
     * Create an instance of {@link ProductGetAvailable }
     * 
     */
    public ProductGetAvailable createProductGetAvailable() {
        return new ProductGetAvailable();
    }

    /**
     * Create an instance of {@link CashBookEntryGetContraVatAccount }
     * 
     */
    public CashBookEntryGetContraVatAccount createCashBookEntryGetContraVatAccount() {
        return new CashBookEntryGetContraVatAccount();
    }

    /**
     * Create an instance of {@link MileageEntryCreateFromDataArray }
     * 
     */
    public MileageEntryCreateFromDataArray createMileageEntryCreateFromDataArray() {
        return new MileageEntryCreateFromDataArray();
    }

    /**
     * Create an instance of {@link OrderGetAllResponse }
     * 
     */
    public OrderGetAllResponse createOrderGetAllResponse() {
        return new OrderGetAllResponse();
    }

    /**
     * Create an instance of {@link TemplateCollectionGetDataResponse }
     * 
     */
    public TemplateCollectionGetDataResponse createTemplateCollectionGetDataResponse() {
        return new TemplateCollectionGetDataResponse();
    }

    /**
     * Create an instance of {@link TemplateCollectionData }
     * 
     */
    public TemplateCollectionData createTemplateCollectionData() {
        return new TemplateCollectionData();
    }

    /**
     * Create an instance of {@link DebtorGroupCreateFromData }
     * 
     */
    public DebtorGroupCreateFromData createDebtorGroupCreateFromData() {
        return new DebtorGroupCreateFromData();
    }

    /**
     * Create an instance of {@link CashBookEntryDelete }
     * 
     */
    public CashBookEntryDelete createCashBookEntryDelete() {
        return new CashBookEntryDelete();
    }

    /**
     * Create an instance of {@link CreditorGetAll }
     * 
     */
    public CreditorGetAll createCreditorGetAll() {
        return new CreditorGetAll();
    }

    /**
     * Create an instance of {@link EmployeeGroupGetName }
     * 
     */
    public EmployeeGroupGetName createEmployeeGroupGetName() {
        return new EmployeeGroupGetName();
    }

    /**
     * Create an instance of {@link InvoiceGetOurReference2 }
     * 
     */
    public InvoiceGetOurReference2 createInvoiceGetOurReference2() {
        return new InvoiceGetOurReference2();
    }

    /**
     * Create an instance of {@link CurrentSupplierInvoiceGetDataArray }
     * 
     */
    public CurrentSupplierInvoiceGetDataArray createCurrentSupplierInvoiceGetDataArray() {
        return new CurrentSupplierInvoiceGetDataArray();
    }

    /**
     * Create an instance of {@link QuotationGetDebtorAddress }
     * 
     */
    public QuotationGetDebtorAddress createQuotationGetDebtorAddress() {
        return new QuotationGetDebtorAddress();
    }

    /**
     * Create an instance of {@link CashBookEntrySetCreditorResponse }
     * 
     */
    public CashBookEntrySetCreditorResponse createCashBookEntrySetCreditorResponse() {
        return new CashBookEntrySetCreditorResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetDeliveryLocationResponse }
     * 
     */
    public CurrentInvoiceSetDeliveryLocationResponse createCurrentInvoiceSetDeliveryLocationResponse() {
        return new CurrentInvoiceSetDeliveryLocationResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceSetHeadingResponse }
     * 
     */
    public CurrentInvoiceSetHeadingResponse createCurrentInvoiceSetHeadingResponse() {
        return new CurrentInvoiceSetHeadingResponse();
    }

    /**
     * Create an instance of {@link DebtorGetQuotationsResponse }
     * 
     */
    public DebtorGetQuotationsResponse createDebtorGetQuotationsResponse() {
        return new DebtorGetQuotationsResponse();
    }

    /**
     * Create an instance of {@link ProjectGetIsAccessible }
     * 
     */
    public ProjectGetIsAccessible createProjectGetIsAccessible() {
        return new ProjectGetIsAccessible();
    }

    /**
     * Create an instance of {@link DebtorGetExtendedVatZoneResponse }
     * 
     */
    public DebtorGetExtendedVatZoneResponse createDebtorGetExtendedVatZoneResponse() {
        return new DebtorGetExtendedVatZoneResponse();
    }

    /**
     * Create an instance of {@link QuotationLineSetProduct }
     * 
     */
    public QuotationLineSetProduct createQuotationLineSetProduct() {
        return new QuotationLineSetProduct();
    }

    /**
     * Create an instance of {@link AccountGetAllUpdatedResponse }
     * 
     */
    public AccountGetAllUpdatedResponse createAccountGetAllUpdatedResponse() {
        return new AccountGetAllUpdatedResponse();
    }

    /**
     * Create an instance of {@link ProductGetAllAccessible }
     * 
     */
    public ProductGetAllAccessible createProductGetAllAccessible() {
        return new ProductGetAllAccessible();
    }

    /**
     * Create an instance of {@link CreditorContactUpdateFromDataResponse }
     * 
     */
    public CreditorContactUpdateFromDataResponse createCreditorContactUpdateFromDataResponse() {
        return new CreditorContactUpdateFromDataResponse();
    }

    /**
     * Create an instance of {@link CreditorEntryGetInvoiceNumberResponse }
     * 
     */
    public CreditorEntryGetInvoiceNumberResponse createCreditorEntryGetInvoiceNumberResponse() {
        return new CreditorEntryGetInvoiceNumberResponse();
    }

    /**
     * Create an instance of {@link InvoiceGetProject }
     * 
     */
    public InvoiceGetProject createInvoiceGetProject() {
        return new InvoiceGetProject();
    }

    /**
     * Create an instance of {@link CreditorContactUpdateFromDataArray }
     * 
     */
    public CreditorContactUpdateFromDataArray createCreditorContactUpdateFromDataArray() {
        return new CreditorContactUpdateFromDataArray();
    }

    /**
     * Create an instance of {@link GetApiInformationResponse }
     * 
     */
    public GetApiInformationResponse createGetApiInformationResponse() {
        return new GetApiInformationResponse();
    }

    /**
     * Create an instance of {@link CurrentInvoiceGetDebtorCityResponse }
     * 
     */
    public CurrentInvoiceGetDebtorCityResponse createCurrentInvoiceGetDebtorCityResponse() {
        return new CurrentInvoiceGetDebtorCityResponse();
    }

    /**
     * Create an instance of {@link SubscriptionGetDataArray }
     * 
     */
    public SubscriptionGetDataArray createSubscriptionGetDataArray() {
        return new SubscriptionGetDataArray();
    }

    /**
     * Create an instance of {@link CashBookEntryGetBankPaymentCreditorIdResponse }
     * 
     */
    public CashBookEntryGetBankPaymentCreditorIdResponse createCashBookEntryGetBankPaymentCreditorIdResponse() {
        return new CashBookEntryGetBankPaymentCreditorIdResponse();
    }

    /**
     * Create an instance of {@link ConnectAsAdministratorResponse }
     * 
     */
    public ConnectAsAdministratorResponse createConnectAsAdministratorResponse() {
        return new ConnectAsAdministratorResponse();
    }

    /**
     * Create an instance of {@link SubscriberFindBySubscriptonList }
     * 
     */
    public SubscriberFindBySubscriptonList createSubscriberFindBySubscriptonList() {
        return new SubscriberFindBySubscriptonList();
    }

    /**
     * Create an instance of {@link CustomField }
     * 
     */
    public CustomField createCustomField() {
        return new CustomField();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e-conomic.com", name = "CutoffDate", scope = EmployeeData.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeeDataCutoffDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmployeeDataCutoffDate_QNAME, XMLGregorianCalendar.class, EmployeeData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e-conomic.com", name = "CostPriceBefore", scope = EmployeeData.class)
    public JAXBElement<BigDecimal> createEmployeeDataCostPriceBefore(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeeDataCostPriceBefore_QNAME, BigDecimal.class, EmployeeData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e-conomic.com", name = "SalesPrice", scope = EmployeeData.class)
    public JAXBElement<BigDecimal> createEmployeeDataSalesPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeeDataSalesPrice_QNAME, BigDecimal.class, EmployeeData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e-conomic.com", name = "CostPriceAfter", scope = EmployeeData.class)
    public JAXBElement<BigDecimal> createEmployeeDataCostPriceAfter(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeeDataCostPriceAfter_QNAME, BigDecimal.class, EmployeeData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e-conomic.com", name = "CostPrice", scope = EmployeeData.class)
    public JAXBElement<BigDecimal> createEmployeeDataCostPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeeDataCostPrice_QNAME, BigDecimal.class, EmployeeData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e-conomic.com", name = "SalesPriceAfter", scope = EmployeeData.class)
    public JAXBElement<BigDecimal> createEmployeeDataSalesPriceAfter(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeeDataSalesPriceAfter_QNAME, BigDecimal.class, EmployeeData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e-conomic.com", name = "SalesPriceBefore", scope = EmployeeData.class)
    public JAXBElement<BigDecimal> createEmployeeDataSalesPriceBefore(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeeDataSalesPriceBefore_QNAME, BigDecimal.class, EmployeeData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e-conomic.com", name = "CreditMaximum", scope = DebtorData.class)
    public JAXBElement<BigDecimal> createDebtorDataCreditMaximum(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DebtorDataCreditMaximum_QNAME, BigDecimal.class, DebtorData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e-conomic.com", name = "OnOrder", scope = ProductData.class)
    public JAXBElement<BigDecimal> createProductDataOnOrder(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProductDataOnOrder_QNAME, BigDecimal.class, ProductData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e-conomic.com", name = "InStock", scope = ProductData.class)
    public JAXBElement<BigDecimal> createProductDataInStock(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProductDataInStock_QNAME, BigDecimal.class, ProductData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e-conomic.com", name = "Available", scope = ProductData.class)
    public JAXBElement<BigDecimal> createProductDataAvailable(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProductDataAvailable_QNAME, BigDecimal.class, ProductData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e-conomic.com", name = "Ordered", scope = ProductData.class)
    public JAXBElement<BigDecimal> createProductDataOrdered(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProductDataOrdered_QNAME, BigDecimal.class, ProductData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e-conomic.com", name = "DueDate", scope = CashBookEntryData.class)
    public JAXBElement<XMLGregorianCalendar> createCashBookEntryDataDueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CashBookEntryDataDueDate_QNAME, XMLGregorianCalendar.class, CashBookEntryData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e-conomic.com", name = "StartDate", scope = CashBookEntryData.class)
    public JAXBElement<XMLGregorianCalendar> createCashBookEntryDataStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CashBookEntryDataStartDate_QNAME, XMLGregorianCalendar.class, CashBookEntryData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e-conomic.com", name = "EndDate", scope = CashBookEntryData.class)
    public JAXBElement<XMLGregorianCalendar> createCashBookEntryDataEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CashBookEntryDataEndDate_QNAME, XMLGregorianCalendar.class, CashBookEntryData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://e-conomic.com", name = "DebtorInvoiceNumber", scope = CashBookEntryData.class)
    public JAXBElement<Integer> createCashBookEntryDataDebtorInvoiceNumber(Integer value) {
        return new JAXBElement<Integer>(_CashBookEntryDataDebtorInvoiceNumber_QNAME, Integer.class, CashBookEntryData.class, value);
    }

}
