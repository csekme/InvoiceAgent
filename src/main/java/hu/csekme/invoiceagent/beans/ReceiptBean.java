package hu.csekme.invoiceagent.beans;

import hu.csekme.invoiceagent.domain.Receipt;
import hu.csekme.invoiceagent.domain.ReceiptEntry;
import hu.csekme.invoiceagent.service.ReceiptService;
import hu.szamlazz.xmlnyugtavalasz.Xmlnyugtavalasz;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

/**
 * Receipt editor bean
 *
 * @author Krisztián Csekme
 * @see ReceiptEntry
 */
@Named
@ViewScoped
public class ReceiptBean implements Serializable {

  @Inject
  ReceiptService service;

  @Inject
  SettingsBean settingsBean;

  Receipt receipt;

  /**
   * átutalás, készpénz, bankkártya, csekk, utánvét, ajándékutalvány,
   * barion, barter, csoportos beszedés, OTP Simple,
   * kompenzáció, kupon, PayPal,PayU, SZÉP kártya, utalvány
   */
  private List<String> paymentMethods;
  /**
   * Ft, HUF, EUR, USD stb.
   */
  private List<String> currencies;
  /**
   * Normál: A,
   * Keskeny: J,
   * Keskeny, logóval: L
   */
  private Map<String, String> pdfTemplates;

  // tétel megnevezés
  String entryName;
  // tétel mennyiség
  Double entryQuantity;
  // tétel mennyiségi egység
  String entryUnit;
  // tétel nettó egységár
  Double entryNetUnitPrice;
  // tétel nettó
  Double entryNet;
  // tétel áfakulcs
  String entryVatKey;
  // tétel áfa
  Double entryVat;
  // tétel bruttó
  Double entryGross;

  @PostConstruct
  public void init() {
    receipt = new Receipt();
    paymentMethods = new ArrayList<>(Arrays.asList("átutalás,készpénz,bankkártya,csekk,utánvét,ajándékutalvány,barion,barter,csoportos beszedés,OTP Simple,kompenzáció,kupon,PayPal,PayU,SZÉP kártya,utalvány".split(",")));
    currencies = new ArrayList<>(Arrays.asList("Ft,HUF,EUR,USD".split(",")));
    pdfTemplates = new LinkedHashMap<>();
    pdfTemplates.put("Normál", "A");
    pdfTemplates.put("Keskeny", "J");
    pdfTemplates.put("Keskeny, logóval", "L");
    clearEntryFields();
    receipt.setPrefix(settingsBean.getDefaultReceiptPrefix());
  }

  /**
   * Add new entry
   */
  public void addEntry() {
    receipt.addReceiptEntry(new ReceiptEntry(entryName, entryQuantity, entryUnit, entryNetUnitPrice, entryNet, entryVatKey, entryVat, entryGross));
    clearEntryFields();
  }

  /**
   * Calculate entry fields
   */
  public void autoCalcEntryFields() {
    if (getEntryQuantity() != null && getEntryNetUnitPrice() != null) {
      setEntryNet(getEntryQuantity() * getEntryNetUnitPrice());
      setEntryVat(getEntryNet() * 0.27); // fix áfakulcs
      setEntryGross(getEntryNet() + getEntryVat());
    }
  }

  /**
   * Generate receipt
   */
  public String generateReceipt() {
    //Fill receipt
    if (validation()) {
      Xmlnyugtavalasz valasz = service.build(receipt);
      if (valasz.isSikeres()) {
        addMessage(FacesMessage.SEVERITY_INFO, "Sikeres nyugta létrhozva",
                String.format("Nyugta száma: %s",
                        valasz.getNyugta().getAlap().getNyugtaszam()
                )
        );
        return "receipts.xhtml?faces-redirect=true";
      } else {
        addMessage(FacesMessage.SEVERITY_ERROR, "Hiba történt", valasz.getHibauzenet());
        return null;
      }
    }
    return null;
  }

  public boolean validation() {
    boolean valid = true;
    if (receipt.getPrefix()==null || receipt.getPrefix().isEmpty()) {
      valid = false;
      addMessage(FacesMessage.SEVERITY_WARN, "Kötelező mező", "Az előtag kitöltése kötelező");
    }
    return valid;
  }

  /**
   * Send message to the UI
   * @param severity Level
   * @param summary as Title
   * @param detail as Body
   */
  public void addMessage(FacesMessage.Severity severity, String summary, String detail) {
    FacesContext.getCurrentInstance().
            addMessage(null, new FacesMessage(severity, summary, detail));
  }

  /**
   * Clear entry fields
   */
  private void clearEntryFields() {
    this.entryGross = null;
    this.entryNet = null;
    this.entryName = null;
    this.entryUnit = "darab";
    this.entryNetUnitPrice = null;
    this.entryVatKey = "27";
    this.entryVat = null;
    this.entryQuantity = null;
  }

  public List<String> getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(List<String> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  public List<String> getCurrencies() {
    return currencies;
  }

  public void setCurrencies(List<String> currencies) {
    this.currencies = currencies;
  }

  public String getEntryName() {
    return entryName;
  }

  public void setEntryName(String entryName) {
    this.entryName = entryName;
  }

  public Double getEntryQuantity() {
    return entryQuantity;
  }

  public void setEntryQuantity(Double entryQuantity) {
    this.entryQuantity = entryQuantity;
  }

  public String getEntryUnit() {
    return entryUnit;
  }

  public void setEntryUnit(String entryUnit) {
    this.entryUnit = entryUnit;
  }

  public Double getEntryNetUnitPrice() {
    return entryNetUnitPrice;
  }

  public void setEntryNetUnitPrice(Double entryNetUnitPrice) {
    this.entryNetUnitPrice = entryNetUnitPrice;
  }

  public Double getEntryNet() {
    return entryNet;
  }

  public void setEntryNet(Double entryNet) {
    this.entryNet = entryNet;
  }

  public String getEntryVatKey() {
    return entryVatKey;
  }

  public void setEntryVatKey(String entryVatKey) {
    this.entryVatKey = entryVatKey;
  }

  public Double getEntryVat() {
    return entryVat;
  }

  public void setEntryVat(Double entryVat) {
    this.entryVat = entryVat;
  }

  public Double getEntryGross() {
    return entryGross;
  }

  public void setEntryGross(Double entryGross) {
    this.entryGross = entryGross;
  }

  public Map<String, String> getPdfTemplates() {
    return pdfTemplates;
  }

  public void setPdfTemplates(Map<String, String> pdfTemplates) {
    this.pdfTemplates = pdfTemplates;
  }

  public ReceiptService getService() {
    return service;
  }

  public void setService(ReceiptService service) {
    this.service = service;
  }

  public Receipt getReceipt() {
    return receipt;
  }

  public void setReceipt(Receipt receipt) {
    this.receipt = receipt;
  }

}
