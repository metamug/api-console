//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.02 at 06:40:50 PM IST 
//
package com.metamug.jaxb.gener;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for create complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="create">
 *   &lt;complexContent>
 *     &lt;extension base="{}request">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "create")
public class Create extends Request {

    public Create() {
        super(Method.POST);
    }

    @Override
    public List<Sql> getSql() {
        if (sql == null) {
            sql = new ArrayList<>();
        }
        //System.out.println("Overrided!+_+_+++_++_+_+_++_++_++_+_+_+_");
        for (Sql queryType : this.sql) {
            queryType.setType("update");
        }
        return this.sql;
    }
}
