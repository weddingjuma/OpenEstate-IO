
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ApiSuchfelderTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApiSuchfelderTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApiSuchfeld1" type="{http://www.immobilienscout24.de/immobilientransfer}ApiSearchStringTyp" minOccurs="0"/>
 *         &lt;element name="ApiSuchfeld2" type="{http://www.immobilienscout24.de/immobilientransfer}ApiSearchStringTyp" minOccurs="0"/>
 *         &lt;element name="ApiSuchfeld3" type="{http://www.immobilienscout24.de/immobilientransfer}ApiSearchStringTyp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiSuchfelderTyp", propOrder = {
    "apiSuchfeld1",
    "apiSuchfeld2",
    "apiSuchfeld3"
})
public class ApiSuchfelderTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElementRef(name = "ApiSuchfeld1", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<String> apiSuchfeld1;
    @XmlElementRef(name = "ApiSuchfeld2", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<String> apiSuchfeld2;
    @XmlElementRef(name = "ApiSuchfeld3", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<String> apiSuchfeld3;

    /**
     * Gets the value of the apiSuchfeld1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApiSuchfeld1() {
        return apiSuchfeld1;
    }

    /**
     * Sets the value of the apiSuchfeld1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApiSuchfeld1(JAXBElement<String> value) {
        this.apiSuchfeld1 = value;
    }

    /**
     * Gets the value of the apiSuchfeld2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApiSuchfeld2() {
        return apiSuchfeld2;
    }

    /**
     * Sets the value of the apiSuchfeld2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApiSuchfeld2(JAXBElement<String> value) {
        this.apiSuchfeld2 = value;
    }

    /**
     * Gets the value of the apiSuchfeld3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApiSuchfeld3() {
        return apiSuchfeld3;
    }

    /**
     * Sets the value of the apiSuchfeld3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApiSuchfeld3(JAXBElement<String> value) {
        this.apiSuchfeld3 = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            JAXBElement<String> theApiSuchfeld1;
            theApiSuchfeld1 = this.getApiSuchfeld1();
            strategy.appendField(locator, this, "apiSuchfeld1", buffer, theApiSuchfeld1);
        }
        {
            JAXBElement<String> theApiSuchfeld2;
            theApiSuchfeld2 = this.getApiSuchfeld2();
            strategy.appendField(locator, this, "apiSuchfeld2", buffer, theApiSuchfeld2);
        }
        {
            JAXBElement<String> theApiSuchfeld3;
            theApiSuchfeld3 = this.getApiSuchfeld3();
            strategy.appendField(locator, this, "apiSuchfeld3", buffer, theApiSuchfeld3);
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof ApiSuchfelderTyp) {
            final ApiSuchfelderTyp copy = ((ApiSuchfelderTyp) draftCopy);
            if (this.apiSuchfeld1 != null) {
                JAXBElement<String> sourceApiSuchfeld1;
                sourceApiSuchfeld1 = this.getApiSuchfeld1();
                @SuppressWarnings("unchecked")
                JAXBElement<String> copyApiSuchfeld1 = ((JAXBElement<String> ) strategy.copy(LocatorUtils.property(locator, "apiSuchfeld1", sourceApiSuchfeld1), sourceApiSuchfeld1));
                copy.setApiSuchfeld1(copyApiSuchfeld1);
            } else {
                copy.apiSuchfeld1 = null;
            }
            if (this.apiSuchfeld2 != null) {
                JAXBElement<String> sourceApiSuchfeld2;
                sourceApiSuchfeld2 = this.getApiSuchfeld2();
                @SuppressWarnings("unchecked")
                JAXBElement<String> copyApiSuchfeld2 = ((JAXBElement<String> ) strategy.copy(LocatorUtils.property(locator, "apiSuchfeld2", sourceApiSuchfeld2), sourceApiSuchfeld2));
                copy.setApiSuchfeld2(copyApiSuchfeld2);
            } else {
                copy.apiSuchfeld2 = null;
            }
            if (this.apiSuchfeld3 != null) {
                JAXBElement<String> sourceApiSuchfeld3;
                sourceApiSuchfeld3 = this.getApiSuchfeld3();
                @SuppressWarnings("unchecked")
                JAXBElement<String> copyApiSuchfeld3 = ((JAXBElement<String> ) strategy.copy(LocatorUtils.property(locator, "apiSuchfeld3", sourceApiSuchfeld3), sourceApiSuchfeld3));
                copy.setApiSuchfeld3(copyApiSuchfeld3);
            } else {
                copy.apiSuchfeld3 = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ApiSuchfelderTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ApiSuchfelderTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ApiSuchfelderTyp that = ((ApiSuchfelderTyp) object);
        {
            JAXBElement<String> lhsApiSuchfeld1;
            lhsApiSuchfeld1 = this.getApiSuchfeld1();
            JAXBElement<String> rhsApiSuchfeld1;
            rhsApiSuchfeld1 = that.getApiSuchfeld1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apiSuchfeld1", lhsApiSuchfeld1), LocatorUtils.property(thatLocator, "apiSuchfeld1", rhsApiSuchfeld1), lhsApiSuchfeld1, rhsApiSuchfeld1)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsApiSuchfeld2;
            lhsApiSuchfeld2 = this.getApiSuchfeld2();
            JAXBElement<String> rhsApiSuchfeld2;
            rhsApiSuchfeld2 = that.getApiSuchfeld2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apiSuchfeld2", lhsApiSuchfeld2), LocatorUtils.property(thatLocator, "apiSuchfeld2", rhsApiSuchfeld2), lhsApiSuchfeld2, rhsApiSuchfeld2)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsApiSuchfeld3;
            lhsApiSuchfeld3 = this.getApiSuchfeld3();
            JAXBElement<String> rhsApiSuchfeld3;
            rhsApiSuchfeld3 = that.getApiSuchfeld3();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apiSuchfeld3", lhsApiSuchfeld3), LocatorUtils.property(thatLocator, "apiSuchfeld3", rhsApiSuchfeld3), lhsApiSuchfeld3, rhsApiSuchfeld3)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
