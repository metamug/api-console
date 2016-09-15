//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.01.02 at 06:40:50 PM IST
//
package com.metamug.jaxb.gener;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sql", propOrder = {
    "value"
})
public class Sql {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "type")
    protected SqlType type;
    @XmlAttribute(name = "when")
    protected String when;
    @XmlAttribute(name = "className")
    protected String className;

    public Sql() {
    }

    /**
     * Gets the value of the value property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is {@link String }
     *
     */
    public SqlType getType() {
        if (type == null) {
            return SqlType.QUERY;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setType(SqlType value) {
        this.type = value;
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

}
