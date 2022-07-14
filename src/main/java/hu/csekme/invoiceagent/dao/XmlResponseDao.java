package hu.csekme.invoiceagent.dao;

import hu.szamlazz.xmlnyugtavalasz.Xmlnyugtavalasz;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
@Named
public class XmlResponseDao implements Serializable {

  List<Xmlnyugtavalasz> receipts;

  @PostConstruct
  public void init() {
    receipts = new ArrayList<>();
  }

  public void addReceipt(Xmlnyugtavalasz response) {
    receipts.add(response);
  }

  public List<Xmlnyugtavalasz> getReceipts() {
    return receipts;
  }

  public void setReceipts(List<Xmlnyugtavalasz> receipts) {
    this.receipts = receipts;
  }
}
