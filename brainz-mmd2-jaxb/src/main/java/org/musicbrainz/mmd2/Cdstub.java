//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.27 at 04:21:55 PM IST 
//


package org.musicbrainz.mmd2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


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
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}title"/&gt;
 *         &lt;element name="artist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}barcode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}disambiguation" minOccurs="0"/&gt;
 *         &lt;group ref="{http://musicbrainz.org/ns/mmd-2.0#}def_nonmb-track-list"/&gt;
 *         &lt;group ref="{http://musicbrainz.org/ns/mmd-2.0#}def_cdstub-element_extension"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://musicbrainz.org/ns/mmd-2.0#}def_cdstub-attribute_extension"/&gt;
 *       &lt;attribute name="id" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;pattern value="[a-zA-Z0-9._]{27}-"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "artist",
    "barcode",
    "disambiguation",
    "trackList",
    "defExtensionElement"
})
@XmlRootElement(name = "cdstub")
public class Cdstub {

    @XmlElement(required = true)
    protected String title;
    protected String artist;
    protected String barcode;
    protected String disambiguation;
    @XmlElement(name = "track-list", required = true)
    protected Cdstub.TrackList trackList;
    @XmlAnyElement
    protected List<Element> defExtensionElement;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "score", namespace = "http://musicbrainz.org/ns/ext#-2.0")
    protected Integer score;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the artist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Sets the value of the artist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtist(String value) {
        this.artist = value;
    }

    /**
     * Gets the value of the barcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcode(String value) {
        this.barcode = value;
    }

    /**
     * Gets the value of the disambiguation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisambiguation() {
        return disambiguation;
    }

    /**
     * Sets the value of the disambiguation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisambiguation(String value) {
        this.disambiguation = value;
    }

    /**
     * Gets the value of the trackList property.
     * 
     * @return
     *     possible object is
     *     {@link Cdstub.TrackList }
     *     
     */
    public Cdstub.TrackList getTrackList() {
        return trackList;
    }

    /**
     * Sets the value of the trackList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cdstub.TrackList }
     *     
     */
    public void setTrackList(Cdstub.TrackList value) {
        this.trackList = value;
    }

    /**
     * Gets the value of the defExtensionElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defExtensionElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefExtensionElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getDefExtensionElement() {
        if (defExtensionElement == null) {
            defExtensionElement = new ArrayList<Element>();
        }
        return this.defExtensionElement;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScore(Integer value) {
        this.score = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;group ref="{http://musicbrainz.org/ns/mmd-2.0#}def_nonmb-track" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;attGroup ref="{http://musicbrainz.org/ns/mmd-2.0#}def_list-attributes"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "defNonmbTrack"
    })
    public static class TrackList {

        @XmlElement(name = "track")
        protected List<Cdstub.TrackList.Track> defNonmbTrack;
        @XmlAttribute(name = "count")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger count;
        @XmlAttribute(name = "offset")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger offset;

        /**
         * Gets the value of the defNonmbTrack property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the defNonmbTrack property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDefNonmbTrack().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Cdstub.TrackList.Track }
         * 
         * 
         */
        public List<Cdstub.TrackList.Track> getDefNonmbTrack() {
            if (defNonmbTrack == null) {
                defNonmbTrack = new ArrayList<Cdstub.TrackList.Track>();
            }
            return this.defNonmbTrack;
        }

        /**
         * Gets the value of the count property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCount() {
            return count;
        }

        /**
         * Sets the value of the count property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCount(BigInteger value) {
            this.count = value;
        }

        /**
         * Gets the value of the offset property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOffset() {
            return offset;
        }

        /**
         * Sets the value of the offset property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOffset(BigInteger value) {
            this.offset = value;
        }


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
         *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}title"/&gt;
         *         &lt;element name="artist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}length"/&gt;
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
            "title",
            "artist",
            "length"
        })
        public static class Track {

            @XmlElement(required = true)
            protected String title;
            protected String artist;
            @XmlElement(required = true)
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger length;

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Gets the value of the artist property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArtist() {
                return artist;
            }

            /**
             * Sets the value of the artist property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArtist(String value) {
                this.artist = value;
            }

            /**
             * Gets the value of the length property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getLength() {
                return length;
            }

            /**
             * Sets the value of the length property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setLength(BigInteger value) {
                this.length = value;
            }

        }

    }

}
