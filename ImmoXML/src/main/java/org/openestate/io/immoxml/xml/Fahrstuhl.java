
package org.openestate.io.immoxml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
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
 * Java class for &lt;fahrstuhl&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "fahrstuhl")
public class Fahrstuhl
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "PERSONEN")
    protected Boolean personen;
    @XmlAttribute(name = "LASTEN")
    protected Boolean lasten;

    /**
     * Gets the value of the personen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPERSONEN() {
        return personen;
    }

    /**
     * Sets the value of the personen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPERSONEN(Boolean value) {
        this.personen = value;
    }

    /**
     * Gets the value of the lasten property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLASTEN() {
        return lasten;
    }

    /**
     * Sets the value of the lasten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLASTEN(Boolean value) {
        this.lasten = value;
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
            Boolean thePERSONEN;
            thePERSONEN = this.isPERSONEN();
            strategy.appendField(locator, this, "personen", buffer, thePERSONEN);
        }
        {
            Boolean theLASTEN;
            theLASTEN = this.isLASTEN();
            strategy.appendField(locator, this, "lasten", buffer, theLASTEN);
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
        if (draftCopy instanceof Fahrstuhl) {
            final Fahrstuhl copy = ((Fahrstuhl) draftCopy);
            if (this.personen!= null) {
                Boolean sourcePERSONEN;
                sourcePERSONEN = this.isPERSONEN();
                Boolean copyPERSONEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "personen", sourcePERSONEN), sourcePERSONEN));
                copy.setPERSONEN(copyPERSONEN);
            } else {
                copy.personen = null;
            }
            if (this.lasten!= null) {
                Boolean sourceLASTEN;
                sourceLASTEN = this.isLASTEN();
                Boolean copyLASTEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "lasten", sourceLASTEN), sourceLASTEN));
                copy.setLASTEN(copyLASTEN);
            } else {
                copy.lasten = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Fahrstuhl();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Fahrstuhl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Fahrstuhl that = ((Fahrstuhl) object);
        {
            Boolean lhsPERSONEN;
            lhsPERSONEN = this.isPERSONEN();
            Boolean rhsPERSONEN;
            rhsPERSONEN = that.isPERSONEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "personen", lhsPERSONEN), LocatorUtils.property(thatLocator, "personen", rhsPERSONEN), lhsPERSONEN, rhsPERSONEN)) {
                return false;
            }
        }
        {
            Boolean lhsLASTEN;
            lhsLASTEN = this.isLASTEN();
            Boolean rhsLASTEN;
            rhsLASTEN = that.isLASTEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lasten", lhsLASTEN), LocatorUtils.property(thatLocator, "lasten", rhsLASTEN), lhsLASTEN, rhsLASTEN)) {
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
