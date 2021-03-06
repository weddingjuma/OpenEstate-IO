
package org.openestate.io.immoxml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Java class for &lt;land&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "land")
public class Land implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "iso_land")
    protected String isoLand;

    /**
     * Gets the value of the isoLand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoLand() {
        return isoLand;
    }

    /**
     * Sets the value of the isoLand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoLand(String value) {
        this.isoLand = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theIsoLand;
            theIsoLand = this.getIsoLand();
            strategy.appendField(locator, this, "isoLand", buffer, theIsoLand, (this.isoLand!= null));
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Land) {
            final Land copy = ((Land) draftCopy);
            {
                Boolean isoLandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isoLand!= null));
                if (isoLandShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceIsoLand;
                    sourceIsoLand = this.getIsoLand();
                    String copyIsoLand = ((String) strategy.copy(LocatorUtils.property(locator, "isoLand", sourceIsoLand), sourceIsoLand, (this.isoLand!= null)));
                    copy.setIsoLand(copyIsoLand);
                } else {
                    if (isoLandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isoLand = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Land();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Land that = ((Land) object);
        {
            String lhsIsoLand;
            lhsIsoLand = this.getIsoLand();
            String rhsIsoLand;
            rhsIsoLand = that.getIsoLand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isoLand", lhsIsoLand), LocatorUtils.property(thatLocator, "isoLand", rhsIsoLand), lhsIsoLand, rhsIsoLand, (this.isoLand!= null), (that.isoLand!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
