
package org.openestate.io.immoxml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * Java class for &lt;daten&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pfad",
    "anhanginhalt"
})
@XmlRootElement(name = "daten")
public class Daten
    implements Cloneable, CopyTo, Equals, ToString
{

    protected String pfad;
    protected byte[] anhanginhalt;

    /**
     * Gets the value of the pfad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfad() {
        return pfad;
    }

    /**
     * Sets the value of the pfad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfad(String value) {
        this.pfad = value;
    }

    /**
     * Gets the value of the anhanginhalt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAnhanginhalt() {
        return anhanginhalt;
    }

    /**
     * Sets the value of the anhanginhalt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAnhanginhalt(byte[] value) {
        this.anhanginhalt = value;
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
            String thePfad;
            thePfad = this.getPfad();
            strategy.appendField(locator, this, "pfad", buffer, thePfad);
        }
        {
            byte[] theAnhanginhalt;
            theAnhanginhalt = this.getAnhanginhalt();
            strategy.appendField(locator, this, "anhanginhalt", buffer, theAnhanginhalt);
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
        if (draftCopy instanceof Daten) {
            final Daten copy = ((Daten) draftCopy);
            if (this.pfad!= null) {
                String sourcePfad;
                sourcePfad = this.getPfad();
                String copyPfad = ((String) strategy.copy(LocatorUtils.property(locator, "pfad", sourcePfad), sourcePfad));
                copy.setPfad(copyPfad);
            } else {
                copy.pfad = null;
            }
            if (this.anhanginhalt!= null) {
                byte[] sourceAnhanginhalt;
                sourceAnhanginhalt = this.getAnhanginhalt();
                byte[] copyAnhanginhalt = ((byte[]) strategy.copy(LocatorUtils.property(locator, "anhanginhalt", sourceAnhanginhalt), sourceAnhanginhalt));
                copy.setAnhanginhalt(copyAnhanginhalt);
            } else {
                copy.anhanginhalt = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Daten();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Daten)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Daten that = ((Daten) object);
        {
            String lhsPfad;
            lhsPfad = this.getPfad();
            String rhsPfad;
            rhsPfad = that.getPfad();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pfad", lhsPfad), LocatorUtils.property(thatLocator, "pfad", rhsPfad), lhsPfad, rhsPfad)) {
                return false;
            }
        }
        {
            byte[] lhsAnhanginhalt;
            lhsAnhanginhalt = this.getAnhanginhalt();
            byte[] rhsAnhanginhalt;
            rhsAnhanginhalt = that.getAnhanginhalt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anhanginhalt", lhsAnhanginhalt), LocatorUtils.property(thatLocator, "anhanginhalt", rhsAnhanginhalt), lhsAnhanginhalt, rhsAnhanginhalt)) {
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
