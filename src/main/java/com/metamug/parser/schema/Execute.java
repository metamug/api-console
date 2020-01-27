//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.01.24 at 06:38:28 PM IST
//
package com.metamug.parser.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "execute", propOrder = {
    "arg"
})
public class Execute {
    @XmlElement(name = "Arg")
    protected List<Arg> arg;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "requires")
    protected String requires;
    @XmlAttribute(name = "classname", required = true)
    protected String className;
    @XmlAttribute(name = "when")
    protected String when;
    @XmlAttribute(name = "onerror")
    protected String onerror;
    @XmlAttribute(name = "status")
    protected Integer status;
    @XmlAttribute(name = "verbose")
    private Boolean verbose;
    @XmlAttribute(name = "output")
    private Boolean output;

    public List<Arg> getArg() {
        if (arg == null) {
            arg = new ArrayList<>();
        }
        return this.arg;
    }
    
    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the requires property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getRequires() {
        return requires;
    }

    /**
     * Sets the value of the requires property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setRequires(String value) {
        this.requires = value;
    }

    /**
     * Gets the value of the className property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setClassName(String value) {
        this.className = value;
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
     * Gets the value of the onerror property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getOnerror() {
        return onerror;
    }

    /**
     * Sets the value of the onerror property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setOnerror(String value) {
        this.onerror = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the verbose property.
     *
     * @return possible object is {@link Boolean}.
     *
     */
    public Boolean getVerbose() {
        return verbose;
    }

    /**
     * Sets the value of the verbose property.
     *
     * @param verbose allowed object is {@link Boolean}
     *
     */
    public void setVerbose(Boolean verbose) {
        this.verbose = verbose;
    }
    /**
     * Gets the value of the output property.
     *
     * @return possible object is {@link Boolean}.
     *
     */
    public Boolean getOutput() {
        return output;
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