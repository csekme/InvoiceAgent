//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.15 at 02:01:18 PM CEST 
//


package hu.szamlazz.xmlnyugtasend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beallitasok" type="{http://www.szamlazz.hu/xmlnyugtasend}beallitasokTipus"/&gt;
 *         &lt;element name="fejlec" type="{http://www.szamlazz.hu/xmlnyugtasend}fejlecTipus"/&gt;
 *         &lt;element name="emailKuldes" type="{http://www.szamlazz.hu/xmlnyugtasend}emailKuldes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "beallitasok",
    "fejlec",
    "emailKuldes"
})
@XmlRootElement(name = "xmlnyugtasend")
public class Xmlnyugtasend {

    @XmlElement(required = true)
    protected BeallitasokTipus beallitasok;
    @XmlElement(required = true)
    protected FejlecTipus fejlec;
    protected EmailKuldes emailKuldes;

    /**
     * Gets the value of the beallitasok property.
     * 
     * @return
     *     possible object is
     *     {@link BeallitasokTipus }
     *     
     */
    public BeallitasokTipus getBeallitasok() {
        return beallitasok;
    }

    /**
     * Sets the value of the beallitasok property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeallitasokTipus }
     *     
     */
    public void setBeallitasok(BeallitasokTipus value) {
        this.beallitasok = value;
    }

    /**
     * Gets the value of the fejlec property.
     * 
     * @return
     *     possible object is
     *     {@link FejlecTipus }
     *     
     */
    public FejlecTipus getFejlec() {
        return fejlec;
    }

    /**
     * Sets the value of the fejlec property.
     * 
     * @param value
     *     allowed object is
     *     {@link FejlecTipus }
     *     
     */
    public void setFejlec(FejlecTipus value) {
        this.fejlec = value;
    }

    /**
     * Gets the value of the emailKuldes property.
     * 
     * @return
     *     possible object is
     *     {@link EmailKuldes }
     *     
     */
    public EmailKuldes getEmailKuldes() {
        return emailKuldes;
    }

    /**
     * Sets the value of the emailKuldes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailKuldes }
     *     
     */
    public void setEmailKuldes(EmailKuldes value) {
        this.emailKuldes = value;
    }

}
