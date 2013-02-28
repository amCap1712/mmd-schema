//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.28 at 12:06:39 PM GMT 
//


package org.musicbrainz.mmd2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}target"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}direction" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}attribute-list" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}begin" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}end" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}ended" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}artist"/>
 *           &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}release"/>
 *           &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}release-group"/>
 *           &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}recording"/>
 *           &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}label"/>
 *           &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}work"/>
 *           &lt;group ref="{http://musicbrainz.org/ns/mmd-2.0#}def_relation-element_extension"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="type-id" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "target",
    "direction",
    "attributeList",
    "begin",
    "end",
    "ended",
    "artist",
    "release",
    "releaseGroup",
    "recording",
    "label",
    "work",
    "any"
})
@XmlRootElement(name = "relation")
public class Relation {

    @XmlElement(required = true)
    protected Target target;
    protected DefDirection direction;
    @XmlElement(name = "attribute-list")
    protected AttributeList attributeList;
    protected String begin;
    protected String end;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ended;
    protected Artist artist;
    protected Release release;
    @XmlElement(name = "release-group")
    protected ReleaseGroup releaseGroup;
    protected Recording recording;
    protected Label label;
    protected Work work;
    @XmlAnyElement
    protected Element any;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String type;
    @XmlAttribute(name = "type-id", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String typeId;

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Target }
     *     
     */
    public Target getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Target }
     *     
     */
    public void setTarget(Target value) {
        this.target = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link DefDirection }
     *     
     */
    public DefDirection getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefDirection }
     *     
     */
    public void setDirection(DefDirection value) {
        this.direction = value;
    }

    /**
     * Gets the value of the attributeList property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeList }
     *     
     */
    public AttributeList getAttributeList() {
        return attributeList;
    }

    /**
     * Sets the value of the attributeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeList }
     *     
     */
    public void setAttributeList(AttributeList value) {
        this.attributeList = value;
    }

    /**
     * Gets the value of the begin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegin() {
        return begin;
    }

    /**
     * Sets the value of the begin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegin(String value) {
        this.begin = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * Gets the value of the ended property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnded() {
        return ended;
    }

    /**
     * Sets the value of the ended property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnded(String value) {
        this.ended = value;
    }

    /**
     * Gets the value of the artist property.
     * 
     * @return
     *     possible object is
     *     {@link Artist }
     *     
     */
    public Artist getArtist() {
        return artist;
    }

    /**
     * Sets the value of the artist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Artist }
     *     
     */
    public void setArtist(Artist value) {
        this.artist = value;
    }

    /**
     * Gets the value of the release property.
     * 
     * @return
     *     possible object is
     *     {@link Release }
     *     
     */
    public Release getRelease() {
        return release;
    }

    /**
     * Sets the value of the release property.
     * 
     * @param value
     *     allowed object is
     *     {@link Release }
     *     
     */
    public void setRelease(Release value) {
        this.release = value;
    }

    /**
     * Gets the value of the releaseGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseGroup }
     *     
     */
    public ReleaseGroup getReleaseGroup() {
        return releaseGroup;
    }

    /**
     * Sets the value of the releaseGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseGroup }
     *     
     */
    public void setReleaseGroup(ReleaseGroup value) {
        this.releaseGroup = value;
    }

    /**
     * Gets the value of the recording property.
     * 
     * @return
     *     possible object is
     *     {@link Recording }
     *     
     */
    public Recording getRecording() {
        return recording;
    }

    /**
     * Sets the value of the recording property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recording }
     *     
     */
    public void setRecording(Recording value) {
        this.recording = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setLabel(Label value) {
        this.label = value;
    }

    /**
     * Gets the value of the work property.
     * 
     * @return
     *     possible object is
     *     {@link Work }
     *     
     */
    public Work getWork() {
        return work;
    }

    /**
     * Sets the value of the work property.
     * 
     * @param value
     *     allowed object is
     *     {@link Work }
     *     
     */
    public void setWork(Work value) {
        this.work = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setAny(Element value) {
        this.any = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeId(String value) {
        this.typeId = value;
    }

}
