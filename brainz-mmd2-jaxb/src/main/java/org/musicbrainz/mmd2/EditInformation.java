//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.27 at 04:21:55 PM IST 
//


package org.musicbrainz.mmd2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}edits-accepted"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}edits-rejected"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}auto-edits-accepted"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}edits-failed"/&gt;
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
    "editsAccepted",
    "editsRejected",
    "autoEditsAccepted",
    "editsFailed"
})
@XmlRootElement(name = "edit-information")
public class EditInformation {

    @XmlElement(name = "edits-accepted", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger editsAccepted;
    @XmlElement(name = "edits-rejected", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger editsRejected;
    @XmlElement(name = "auto-edits-accepted", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger autoEditsAccepted;
    @XmlElement(name = "edits-failed", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger editsFailed;

    /**
     * Gets the value of the editsAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEditsAccepted() {
        return editsAccepted;
    }

    /**
     * Sets the value of the editsAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEditsAccepted(BigInteger value) {
        this.editsAccepted = value;
    }

    /**
     * Gets the value of the editsRejected property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEditsRejected() {
        return editsRejected;
    }

    /**
     * Sets the value of the editsRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEditsRejected(BigInteger value) {
        this.editsRejected = value;
    }

    /**
     * Gets the value of the autoEditsAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAutoEditsAccepted() {
        return autoEditsAccepted;
    }

    /**
     * Sets the value of the autoEditsAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAutoEditsAccepted(BigInteger value) {
        this.autoEditsAccepted = value;
    }

    /**
     * Gets the value of the editsFailed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEditsFailed() {
        return editsFailed;
    }

    /**
     * Sets the value of the editsFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEditsFailed(BigInteger value) {
        this.editsFailed = value;
    }

}
