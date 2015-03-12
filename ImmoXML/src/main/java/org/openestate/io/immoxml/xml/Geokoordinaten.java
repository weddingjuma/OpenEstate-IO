
package org.openestate.io.immoxml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * Java class for &lt;geokoordinaten&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "geokoordinaten")
public class Geokoordinaten
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "breitengrad", required = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "float")
    protected Double breitengrad;
    @XmlAttribute(name = "laengengrad", required = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "float")
    protected Double laengengrad;

    /**
     * Gets the value of the breitengrad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getBreitengrad() {
        return breitengrad;
    }

    /**
     * Sets the value of the breitengrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreitengrad(Double value) {
        this.breitengrad = value;
    }

    /**
     * Gets the value of the laengengrad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getLaengengrad() {
        return laengengrad;
    }

    /**
     * Sets the value of the laengengrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaengengrad(Double value) {
        this.laengengrad = value;
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
            Double theBreitengrad;
            theBreitengrad = this.getBreitengrad();
            strategy.appendField(locator, this, "breitengrad", buffer, theBreitengrad);
        }
        {
            Double theLaengengrad;
            theLaengengrad = this.getLaengengrad();
            strategy.appendField(locator, this, "laengengrad", buffer, theLaengengrad);
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
        if (draftCopy instanceof Geokoordinaten) {
            final Geokoordinaten copy = ((Geokoordinaten) draftCopy);
            if (this.breitengrad!= null) {
                Double sourceBreitengrad;
                sourceBreitengrad = this.getBreitengrad();
                Double copyBreitengrad = ((Double) strategy.copy(LocatorUtils.property(locator, "breitengrad", sourceBreitengrad), sourceBreitengrad));
                copy.setBreitengrad(copyBreitengrad);
            } else {
                copy.breitengrad = null;
            }
            if (this.laengengrad!= null) {
                Double sourceLaengengrad;
                sourceLaengengrad = this.getLaengengrad();
                Double copyLaengengrad = ((Double) strategy.copy(LocatorUtils.property(locator, "laengengrad", sourceLaengengrad), sourceLaengengrad));
                copy.setLaengengrad(copyLaengengrad);
            } else {
                copy.laengengrad = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Geokoordinaten();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Geokoordinaten)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Geokoordinaten that = ((Geokoordinaten) object);
        {
            Double lhsBreitengrad;
            lhsBreitengrad = this.getBreitengrad();
            Double rhsBreitengrad;
            rhsBreitengrad = that.getBreitengrad();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "breitengrad", lhsBreitengrad), LocatorUtils.property(thatLocator, "breitengrad", rhsBreitengrad), lhsBreitengrad, rhsBreitengrad)) {
                return false;
            }
        }
        {
            Double lhsLaengengrad;
            lhsLaengengrad = this.getLaengengrad();
            Double rhsLaengengrad;
            rhsLaengengrad = that.getLaengengrad();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "laengengrad", lhsLaengengrad), LocatorUtils.property(thatLocator, "laengengrad", rhsLaengengrad), lhsLaengengrad, rhsLaengengrad)) {
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
