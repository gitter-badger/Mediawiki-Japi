//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.02 at 01:58:10 AM CET 
//


package com.bitplan.jmediawiki.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ns" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pageid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="revid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="old_revid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="rcid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="user" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="oldlen" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="newlen" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="new" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
public class Rc {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "ns")
    protected Short ns;
    @XmlAttribute(name = "title")
    protected String title;
    @XmlAttribute(name = "pageid")
    protected Integer pageid;
    @XmlAttribute(name = "revid")
    protected Integer revid;
    @XmlAttribute(name = "old_revid")
    protected Integer oldRevid;
    @XmlAttribute(name = "rcid")
    protected Integer rcid;
    @XmlAttribute(name = "user")
    protected String user;
    @XmlAttribute(name = "oldlen")
    protected Short oldlen;
    @XmlAttribute(name = "newlen")
    protected Short newlen;
    @XmlAttribute(name = "new")
    protected String _new;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
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
     * Gets the value of the ns property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNs() {
        return ns;
    }

    /**
     * Sets the value of the ns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNs(Short value) {
        this.ns = value;
    }

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
     * Gets the value of the pageid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageid() {
        return pageid;
    }

    /**
     * Sets the value of the pageid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageid(Integer value) {
        this.pageid = value;
    }

    /**
     * Gets the value of the revid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRevid() {
        return revid;
    }

    /**
     * Sets the value of the revid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRevid(Integer value) {
        this.revid = value;
    }

    /**
     * Gets the value of the oldRevid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOldRevid() {
        return oldRevid;
    }

    /**
     * Sets the value of the oldRevid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOldRevid(Integer value) {
        this.oldRevid = value;
    }

    /**
     * Gets the value of the rcid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRcid() {
        return rcid;
    }

    /**
     * Sets the value of the rcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRcid(Integer value) {
        this.rcid = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the oldlen property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOldlen() {
        return oldlen;
    }

    /**
     * Sets the value of the oldlen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOldlen(Short value) {
        this.oldlen = value;
    }

    /**
     * Gets the value of the newlen property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNewlen() {
        return newlen;
    }

    /**
     * Sets the value of the newlen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNewlen(Short value) {
        this.newlen = value;
    }

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNew(String value) {
        this._new = value;
    }

}
