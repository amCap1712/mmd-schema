//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.09 at 04:54:13 PM IST 
//


package org.musicbrainz.mmd2;

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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for def_area-element_inner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="def_area-element_inner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}name" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}sort-name" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}disambiguation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}iso-3166-1-code-list" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}iso-3166-2-code-list" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}iso-3166-3-code-list" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}annotation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}life-span" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}alias-list" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}relation-list" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}tag-list" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}user-tag-list" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}genre-list" minOccurs="0"/&gt;
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}user-genre-list" minOccurs="0"/&gt;
 *         &lt;group ref="{http://musicbrainz.org/ns/mmd-2.0#}def_area-element_extension"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://musicbrainz.org/ns/mmd-2.0#}def_area-attribute_extension"/&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="type-id" type="{http://musicbrainz.org/ns/mmd-2.0#}def_uuid" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "def_area-element_inner", propOrder = {
    "name",
    "sortName",
    "disambiguation",
    "iso31661CodeList",
    "iso31662CodeList",
    "iso31663CodeList",
    "annotation",
    "lifeSpan",
    "aliasList",
    "relationList",
    "tagList",
    "userTagList",
    "genreList",
    "userGenreList",
    "defExtensionElement"
})
public class DefAreaElementInner {

    protected String name;
    @XmlElement(name = "sort-name")
    protected String sortName;
    protected String disambiguation;
    @XmlElement(name = "iso-3166-1-code-list")
    protected Iso31661CodeList iso31661CodeList;
    @XmlElement(name = "iso-3166-2-code-list")
    protected Iso31662CodeList iso31662CodeList;
    @XmlElement(name = "iso-3166-3-code-list")
    protected Iso31663CodeList iso31663CodeList;
    protected Annotation annotation;
    @XmlElement(name = "life-span")
    protected LifeSpan lifeSpan;
    @XmlElement(name = "alias-list")
    protected AliasList aliasList;
    @XmlElement(name = "relation-list")
    protected List<RelationList> relationList;
    @XmlElement(name = "tag-list")
    protected TagList tagList;
    @XmlElement(name = "user-tag-list")
    protected UserTagList userTagList;
    @XmlElement(name = "genre-list")
    protected GenreList genreList;
    @XmlElement(name = "user-genre-list")
    protected UserGenreList userGenreList;
    @XmlAnyElement
    protected List<Element> defExtensionElement;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlAttribute(name = "type")
    @XmlSchemaType(name = "anyURI")
    protected String type;
    @XmlAttribute(name = "type-id")
    protected String typeId;
    @XmlAttribute(name = "score", namespace = "http://musicbrainz.org/ns/ext#-2.0")
    protected Integer score;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the sortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortName() {
        return sortName;
    }

    /**
     * Sets the value of the sortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortName(String value) {
        this.sortName = value;
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
     * Gets the value of the iso31661CodeList property.
     * 
     * @return
     *     possible object is
     *     {@link Iso31661CodeList }
     *     
     */
    public Iso31661CodeList getIso31661CodeList() {
        return iso31661CodeList;
    }

    /**
     * Sets the value of the iso31661CodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Iso31661CodeList }
     *     
     */
    public void setIso31661CodeList(Iso31661CodeList value) {
        this.iso31661CodeList = value;
    }

    /**
     * Gets the value of the iso31662CodeList property.
     * 
     * @return
     *     possible object is
     *     {@link Iso31662CodeList }
     *     
     */
    public Iso31662CodeList getIso31662CodeList() {
        return iso31662CodeList;
    }

    /**
     * Sets the value of the iso31662CodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Iso31662CodeList }
     *     
     */
    public void setIso31662CodeList(Iso31662CodeList value) {
        this.iso31662CodeList = value;
    }

    /**
     * Gets the value of the iso31663CodeList property.
     * 
     * @return
     *     possible object is
     *     {@link Iso31663CodeList }
     *     
     */
    public Iso31663CodeList getIso31663CodeList() {
        return iso31663CodeList;
    }

    /**
     * Sets the value of the iso31663CodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Iso31663CodeList }
     *     
     */
    public void setIso31663CodeList(Iso31663CodeList value) {
        this.iso31663CodeList = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setAnnotation(Annotation value) {
        this.annotation = value;
    }

    /**
     * Gets the value of the lifeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link LifeSpan }
     *     
     */
    public LifeSpan getLifeSpan() {
        return lifeSpan;
    }

    /**
     * Sets the value of the lifeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeSpan }
     *     
     */
    public void setLifeSpan(LifeSpan value) {
        this.lifeSpan = value;
    }

    /**
     * Gets the value of the aliasList property.
     * 
     * @return
     *     possible object is
     *     {@link AliasList }
     *     
     */
    public AliasList getAliasList() {
        return aliasList;
    }

    /**
     * Sets the value of the aliasList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasList }
     *     
     */
    public void setAliasList(AliasList value) {
        this.aliasList = value;
    }

    /**
     * Gets the value of the relationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationList }
     * 
     * 
     */
    public List<RelationList> getRelationList() {
        if (relationList == null) {
            relationList = new ArrayList<RelationList>();
        }
        return this.relationList;
    }

    /**
     * Gets the value of the tagList property.
     * 
     * @return
     *     possible object is
     *     {@link TagList }
     *     
     */
    public TagList getTagList() {
        return tagList;
    }

    /**
     * Sets the value of the tagList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TagList }
     *     
     */
    public void setTagList(TagList value) {
        this.tagList = value;
    }

    /**
     * Gets the value of the userTagList property.
     * 
     * @return
     *     possible object is
     *     {@link UserTagList }
     *     
     */
    public UserTagList getUserTagList() {
        return userTagList;
    }

    /**
     * Sets the value of the userTagList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserTagList }
     *     
     */
    public void setUserTagList(UserTagList value) {
        this.userTagList = value;
    }

    /**
     * Gets the value of the genreList property.
     * 
     * @return
     *     possible object is
     *     {@link GenreList }
     *     
     */
    public GenreList getGenreList() {
        return genreList;
    }

    /**
     * Sets the value of the genreList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenreList }
     *     
     */
    public void setGenreList(GenreList value) {
        this.genreList = value;
    }

    /**
     * Gets the value of the userGenreList property.
     * 
     * @return
     *     possible object is
     *     {@link UserGenreList }
     *     
     */
    public UserGenreList getUserGenreList() {
        return userGenreList;
    }

    /**
     * Sets the value of the userGenreList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserGenreList }
     *     
     */
    public void setUserGenreList(UserGenreList value) {
        this.userGenreList = value;
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

}
