//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.14 at 11:25:36 AM CEST 
//


package hu.szamlazz.xmlnyugtavalasz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for afakulcsosszTipus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="afakulcsosszTipus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="afatipus" type="{http://www.szamlazz.hu/xmlnyugtavalasz}afatipusTipus" minOccurs="0"/&gt;
 *         &lt;element name="afakulcs"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="netto" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="afa" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="brutto" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "afakulcsosszTipus", propOrder = {

})
public class AfakulcsosszTipus {

    @XmlSchemaType(name = "string")
    protected AfatipusTipus afatipus;
    protected int afakulcs;
    protected double netto;
    protected double afa;
    protected double brutto;

    /**
     * Gets the value of the afatipus property.
     * 
     * @return
     *     possible object is
     *     {@link AfatipusTipus }
     *     
     */
    public AfatipusTipus getAfatipus() {
        return afatipus;
    }

    /**
     * Sets the value of the afatipus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfatipusTipus }
     *     
     */
    public void setAfatipus(AfatipusTipus value) {
        this.afatipus = value;
    }

    /**
     * Gets the value of the afakulcs property.
     * 
     */
    public int getAfakulcs() {
        return afakulcs;
    }

    /**
     * Sets the value of the afakulcs property.
     * 
     */
    public void setAfakulcs(int value) {
        this.afakulcs = value;
    }

    /**
     * Gets the value of the netto property.
     * 
     */
    public double getNetto() {
        return netto;
    }

    /**
     * Sets the value of the netto property.
     * 
     */
    public void setNetto(double value) {
        this.netto = value;
    }

    /**
     * Gets the value of the afa property.
     * 
     */
    public double getAfa() {
        return afa;
    }

    /**
     * Sets the value of the afa property.
     * 
     */
    public void setAfa(double value) {
        this.afa = value;
    }

    /**
     * Gets the value of the brutto property.
     * 
     */
    public double getBrutto() {
        return brutto;
    }

    /**
     * Sets the value of the brutto property.
     * 
     */
    public void setBrutto(double value) {
        this.brutto = value;
    }

}
