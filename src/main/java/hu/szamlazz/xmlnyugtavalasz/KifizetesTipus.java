//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.15 at 08:51:13 AM CEST 
//


package hu.szamlazz.xmlnyugtavalasz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kifizetesTipus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kifizetesTipus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="fizetoeszkoz" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="osszeg" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="leiras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kifizetesTipus", propOrder = {

})
public class KifizetesTipus {

    @XmlElement(required = true)
    protected String fizetoeszkoz;
    protected double osszeg;
    protected String leiras;

    /**
     * Gets the value of the fizetoeszkoz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFizetoeszkoz() {
        return fizetoeszkoz;
    }

    /**
     * Sets the value of the fizetoeszkoz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFizetoeszkoz(String value) {
        this.fizetoeszkoz = value;
    }

    /**
     * Gets the value of the osszeg property.
     * 
     */
    public double getOsszeg() {
        return osszeg;
    }

    /**
     * Sets the value of the osszeg property.
     * 
     */
    public void setOsszeg(double value) {
        this.osszeg = value;
    }

    /**
     * Gets the value of the leiras property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeiras() {
        return leiras;
    }

    /**
     * Sets the value of the leiras property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeiras(String value) {
        this.leiras = value;
    }

}
