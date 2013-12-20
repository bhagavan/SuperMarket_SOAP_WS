
package com.vgsconsultancy.webservics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestKpi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestKpi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CNAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MOU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Network" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="networkDevice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originatingNetwork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminatingNetwork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestKpi", propOrder = {
    "cnar",
    "fromNumber",
    "mos",
    "mou",
    "network",
    "networkDevice",
    "originatingNetwork",
    "sdf",
    "seer",
    "ser",
    "status",
    "terminatingNetwork",
    "productTime",
    "toNumber"
})
public class RequestKpi {

    @XmlElement(name = "CNAR")
    protected String cnar;
    protected String fromNumber;
    @XmlElement(name = "MOS")
    protected String mos;
    @XmlElement(name = "MOU")
    protected String mou;
    @XmlElement(name = "Network")
    protected String network;
    protected String networkDevice;
    protected String originatingNetwork;
    @XmlElement(name = "SDF")
    protected String sdf;
    @XmlElement(name = "SEER")
    protected String seer;
    @XmlElement(name = "SER")
    protected String ser;
    protected String status;
    protected String terminatingNetwork;
    @XmlElement(name = "ProductTime")
    protected String productTime;
    protected String toNumber;

    /**
     * Gets the value of the cnar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNAR() {
        return cnar;
    }

    /**
     * Sets the value of the cnar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNAR(String value) {
        this.cnar = value;
    }

    /**
     * Gets the value of the fromNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromNumber() {
        return fromNumber;
    }

    /**
     * Sets the value of the fromNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromNumber(String value) {
        this.fromNumber = value;
    }

    /**
     * Gets the value of the mos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOS() {
        return mos;
    }

    /**
     * Sets the value of the mos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOS(String value) {
        this.mos = value;
    }

    /**
     * Gets the value of the mou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOU() {
        return mou;
    }

    /**
     * Sets the value of the mou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOU(String value) {
        this.mou = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetwork(String value) {
        this.network = value;
    }

    /**
     * Gets the value of the networkDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkDevice() {
        return networkDevice;
    }

    /**
     * Sets the value of the networkDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkDevice(String value) {
        this.networkDevice = value;
    }

    /**
     * Gets the value of the originatingNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingNetwork() {
        return originatingNetwork;
    }

    /**
     * Sets the value of the originatingNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingNetwork(String value) {
        this.originatingNetwork = value;
    }

    /**
     * Gets the value of the sdf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDF() {
        return sdf;
    }

    /**
     * Sets the value of the sdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDF(String value) {
        this.sdf = value;
    }

    /**
     * Gets the value of the seer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEER() {
        return seer;
    }

    /**
     * Sets the value of the seer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEER(String value) {
        this.seer = value;
    }

    /**
     * Gets the value of the ser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSER() {
        return ser;
    }

    /**
     * Sets the value of the ser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSER(String value) {
        this.ser = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the terminatingNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminatingNetwork() {
        return terminatingNetwork;
    }

    /**
     * Sets the value of the terminatingNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminatingNetwork(String value) {
        this.terminatingNetwork = value;
    }

    /**
     * Gets the value of the productTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTime() {
        return productTime;
    }

    /**
     * Sets the value of the productTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTime(String value) {
        this.productTime = value;
    }

    /**
     * Gets the value of the toNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToNumber() {
        return toNumber;
    }

    /**
     * Sets the value of the toNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToNumber(String value) {
        this.toNumber = value;
    }

}
