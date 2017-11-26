//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.01.24 at 06:38:28 PM IST
//
package com.metamug.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "execute", propOrder = {
    "className",
    "script"
})
public class Execute {

    @XmlAttribute(name = "requires")
    protected String requires;
    @XmlAttribute(name = "classname", required = true)
    protected String className;
    @XmlAttribute(name = "when")
    protected String when;
    @XmlAttribute(name = "script")
    protected String script;
    @XmlAttribute(name = "status")
    protected Integer status;

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
     * Gets the value of the script property.
     *
     * @return possible object is {@link String}
     * 
     */
    public String getScript() {
        return script;
    }

    /**
     * Sets the value of the script property.
     *
     * @param scriptPath allowed object is {@link String}
     * 
     */
    public void setScript(String scriptPath) {
        this.script = scriptPath;
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

}
