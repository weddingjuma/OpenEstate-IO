
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * <p>Java class for businessElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessElement"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://feed.immobiliare.it&gt;PropertyTypeBusiness"&gt;
 *       &lt;attribute name="category"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Attivit\u00e0"/&gt;
 *             &lt;enumeration value="Immobile"/&gt;
 *             &lt;enumeration value="Terreno"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessElement", propOrder = {
    "value"
})
public class BusinessElement
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlValue
    protected PropertyTypeBusiness value;
    @XmlAttribute(name = "category")
    protected BusinessElement.BusinessElementCategory category;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyTypeBusiness }
     *     
     */
    public PropertyTypeBusiness getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyTypeBusiness }
     *     
     */
    public void setValue(PropertyTypeBusiness value) {
        this.value = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessElement.BusinessElementCategory }
     *     
     */
    public BusinessElement.BusinessElementCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessElement.BusinessElementCategory }
     *     
     */
    public void setCategory(BusinessElement.BusinessElementCategory value) {
        this.category = value;
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
            PropertyTypeBusiness theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            BusinessElement.BusinessElementCategory theCategory;
            theCategory = this.getCategory();
            strategy.appendField(locator, this, "category", buffer, theCategory);
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
        if (draftCopy instanceof BusinessElement) {
            final BusinessElement copy = ((BusinessElement) draftCopy);
            if (this.value!= null) {
                PropertyTypeBusiness sourceValue;
                sourceValue = this.getValue();
                PropertyTypeBusiness copyValue = ((PropertyTypeBusiness) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.category!= null) {
                BusinessElement.BusinessElementCategory sourceCategory;
                sourceCategory = this.getCategory();
                BusinessElement.BusinessElementCategory copyCategory = ((BusinessElement.BusinessElementCategory) strategy.copy(LocatorUtils.property(locator, "category", sourceCategory), sourceCategory));
                copy.setCategory(copyCategory);
            } else {
                copy.category = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BusinessElement();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BusinessElement)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BusinessElement that = ((BusinessElement) object);
        {
            PropertyTypeBusiness lhsValue;
            lhsValue = this.getValue();
            PropertyTypeBusiness rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            BusinessElement.BusinessElementCategory lhsCategory;
            lhsCategory = this.getCategory();
            BusinessElement.BusinessElementCategory rhsCategory;
            rhsCategory = that.getCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "category", lhsCategory), LocatorUtils.property(thatLocator, "category", rhsCategory), lhsCategory, rhsCategory)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="Attivit\u00e0"/&gt;
     *     &lt;enumeration value="Immobile"/&gt;
     *     &lt;enumeration value="Terreno"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum BusinessElementCategory {

        @XmlEnumValue("Attivit\u00e0")
        ATTIVITA("Attivit\u00e0"),
        @XmlEnumValue("Immobile")
        IMMOBILE("Immobile"),
        @XmlEnumValue("Terreno")
        TERRENO("Terreno");
        private final String value;

        BusinessElementCategory(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static BusinessElement.BusinessElementCategory fromValue(String v) {
            for (BusinessElement.BusinessElementCategory c: BusinessElement.BusinessElementCategory.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
