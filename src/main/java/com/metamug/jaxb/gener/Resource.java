//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.07 at 10:53:17 AM IST 
//
package com.metamug.jaxb.gener;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="desc" type="{}desc" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="Request" type="{}request"/>
 *           &lt;element name="Create" type="{}create"/>
 *           &lt;element name="Read" type="{}read"/>
 *           &lt;element name="Update" type="{}update"/>
 *           &lt;element name="Delete" type="{}delete"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{}version" />
 *       &lt;attribute name="table" use="required" type="{}table" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "desc",
    "requestOrCreateOrRead"
})
@XmlRootElement(name = "Resource")
public class Resource {

    protected String desc;
    @XmlElements({
        @XmlElement(name = "Request"),
        @XmlElement(name = "Create", type = Create.class),
        @XmlElement(name = "Read", type = Read.class),
        @XmlElement(name = "Update", type = Update.class),
        @XmlElement(name = "Delete", type = Delete.class)
    })
    protected List<Request> requestOrCreateOrRead;
    @XmlAttribute(name = "version", required = true)
    protected float version;
    @XmlAttribute(name = "table", required = true)
    protected String table;

    /**
     * Gets the value of the desc property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the requestOrCreateOrRead property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
     * not a <CODE>set</CODE> method for the requestOrCreateOrRead property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestOrCreateOrRead().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list null     {@link Request }
     * {@link Create }
     * {@link Read }
     * {@link Update }
     * {@link Delete }
     *
     *
     * @return
     */
    public List<Request> getRequestOrCreateOrRead() {
        if (requestOrCreateOrRead == null) {
            requestOrCreateOrRead = new ArrayList<>();
        }
        return this.requestOrCreateOrRead;
    }

    /**
     * Gets the value of the version property.
     *
     * @return
     */
    public float getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param version
     */
    public void setVersion(float version) {
        this.version = version;
    }

    /**
     * Gets the value of the table property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTable(String value) {
        this.table = value;
    }

}
