//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.28 at 08:04:33 PM IST 
//


package com.metamug.parser.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for script complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="script">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" use="required" type="{http://xml.metamug.net/resource/1.0}elementId" />
 *       &lt;attribute name="file" use="required" type="{http://xml.metamug.net/resource/1.0}scriptFile" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "script")
public class Script {

    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "file", required = true)
    protected String file;
    @XmlAttribute(name = "output")
    private Boolean output;
    @XmlAttribute(name = "when")
    protected String when;

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
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        String val = file.contains(".groovy") ? file : file+".groovy";
        return val;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }
    
    /**
     * Gets the value of the when property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setWhen(String value) {
        this.when = value;
    }
    /**
     * Gets the value of the output property.
     *
     * @return possible object is {@link Boolean}.
     *
     */
    public Boolean getOutput() {
        if (output == null) {
            return true;
        } else {
            return output;
        }
    }

    /**
     * Sets the value of the verbose property.
     *
     * @param output allowed object is {@link Boolean}
     *
     */
    public void setOutput(Boolean output) {
        this.output = output;
    }
}
