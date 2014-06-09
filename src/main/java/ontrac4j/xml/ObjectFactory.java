//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.09 at 02:36:41 PM EDT 
//


package ontrac4j.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ontrac4j.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OnTracZipResponse_QNAME = new QName("", "OnTracZipResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ontrac4j.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ZipCodeList }
     * 
     */
    public ZipCodeList createZipCodeList() {
        return new ZipCodeList();
    }

    /**
     * Create an instance of {@link ZipCode }
     * 
     */
    public ZipCode createZipCode() {
        return new ZipCode();
    }

    /**
     * Create an instance of {@link ArrayOfZipCode }
     * 
     */
    public ArrayOfZipCode createArrayOfZipCode() {
        return new ArrayOfZipCode();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZipCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OnTracZipResponse")
    public JAXBElement<ZipCodeList> createOnTracZipResponse(ZipCodeList value) {
        return new JAXBElement<ZipCodeList>(_OnTracZipResponse_QNAME, ZipCodeList.class, null, value);
    }

}