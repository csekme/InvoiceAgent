//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.15 at 08:51:13 AM CEST 
//


package hu.szamlazz.xmlnyugtast;

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
 *         &lt;element name="beallitasok" type="{http://www.szamlazz.hu/xmlnyugtast}beallitasokTipus"/&gt;
 *         &lt;element name="fejlec" type="{http://www.szamlazz.hu/xmlnyugtast}fejlecTipus"/&gt;
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
    "fejlec"
})
@XmlRootElement(name = "xmlnyugtast")
public class Xmlnyugtast {

    @XmlElement(required = true)
    protected BeallitasokTipus beallitasok;
    @XmlElement(required = true)
    protected FejlecTipus fejlec;

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

}
