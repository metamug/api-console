/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author anish
 */
public class XmlUtil {
  
    //change '<', '>' symbols in the sql inside the xml to '&lt;', '&gt;'
    //to avoid conflict with the validator
    public static void escapeSql(String xmlFilePath)
            throws ParserConfigurationException, SAXException, IOException,
                    TransformerConfigurationException, TransformerException{
        
        DocumentBuilderFactory docFactory =
        DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(xmlFilePath);
        
        NodeList sqlElements = doc.getElementsByTagName("Sql");
        for(int i=0;i<sqlElements.getLength();i++){
            Node sql = sqlElements.item(i);
            Element e = (Element)sql;
            String originalQuery = e.getTextContent();
            String modifiedQuery = originalQuery.replace("<", "&lt;");
            modifiedQuery = modifiedQuery.replace(">", "&gt;");
            e.setTextContent(modifiedQuery);
        }
        
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer transformer = tFactory.newTransformer();
        DOMSource domSource = new DOMSource(doc);
        StreamResult streamRslt = new StreamResult(new File(xmlFilePath));
        transformer.transform(domSource, streamRslt);
    }    
}
