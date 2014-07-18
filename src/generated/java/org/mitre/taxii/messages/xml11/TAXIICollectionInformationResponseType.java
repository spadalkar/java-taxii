
package org.mitre.taxii.messages.xml11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.taxii.messages.xmldsig.SignatureType;


/**
 * A response to a Collection Information Request. Contains 0 or more Collection records.
 * 
 * <p>Java class for TAXIICollectionInformationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAXIICollectionInformationResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="Collection" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}CollectionRecordType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAXIICollectionInformationResponseType", propOrder = {
    "collection",
    "signature"
})
public class TAXIICollectionInformationResponseType
    extends ResponseMessageType
{

    @XmlElement(name = "Collection")
    protected List<CollectionRecordType> collection;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;

    /**
     * Gets the value of the collection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectionRecordType }
     * 
     * 
     */
    public List<CollectionRecordType> getCollection() {
        if (collection == null) {
            collection = new ArrayList<CollectionRecordType>();
        }
        return this.collection;
    }

    /**
     * An XML Digital Signature scoped to this message.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

}