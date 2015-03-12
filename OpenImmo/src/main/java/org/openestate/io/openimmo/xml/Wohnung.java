
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
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
 * Java class for &lt;wohnung&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "wohnung")
public class Wohnung
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "wohnungtyp")
    protected Wohnung.Wohnungtyp wohnungtyp;

    /**
     * Gets the value of the wohnungtyp property.
     *
     * @return
     *     possible object is
     *     {@link Wohnung.Wohnungtyp }
     *
     */
    public Wohnung.Wohnungtyp getWohnungtyp() {
        return wohnungtyp;
    }

    /**
     * Sets the value of the wohnungtyp property.
     *
     * @param value
     *     allowed object is
     *     {@link Wohnung.Wohnungtyp }
     *
     */
    public void setWohnungtyp(Wohnung.Wohnungtyp value) {
        this.wohnungtyp = value;
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
            Wohnung.Wohnungtyp theWohnungtyp;
            theWohnungtyp = this.getWohnungtyp();
            strategy.appendField(locator, this, "wohnungtyp", buffer, theWohnungtyp);
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
        if (draftCopy instanceof Wohnung) {
            final Wohnung copy = ((Wohnung) draftCopy);
            if (this.wohnungtyp!= null) {
                Wohnung.Wohnungtyp sourceWohnungtyp;
                sourceWohnungtyp = this.getWohnungtyp();
                Wohnung.Wohnungtyp copyWohnungtyp = ((Wohnung.Wohnungtyp) strategy.copy(LocatorUtils.property(locator, "wohnungtyp", sourceWohnungtyp), sourceWohnungtyp));
                copy.setWohnungtyp(copyWohnungtyp);
            } else {
                copy.wohnungtyp = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Wohnung();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Wohnung)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Wohnung that = ((Wohnung) object);
        {
            Wohnung.Wohnungtyp lhsWohnungtyp;
            lhsWohnungtyp = this.getWohnungtyp();
            Wohnung.Wohnungtyp rhsWohnungtyp;
            rhsWohnungtyp = that.getWohnungtyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnungtyp", lhsWohnungtyp), LocatorUtils.property(thatLocator, "wohnungtyp", rhsWohnungtyp), lhsWohnungtyp, rhsWohnungtyp)) {
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
     * Java enum for <em>wohnungtyp</em> attribute in &lt;wohnung&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Wohnungtyp {

        DACHGESCHOSS("DACHGESCHOSS"),
        MAISONETTE("MAISONETTE"),
        @XmlEnumValue("LOFT-STUDIO-ATELIER")
        LOFT_STUDIO_ATELIER("LOFT-STUDIO-ATELIER"),
        PENTHOUSE("PENTHOUSE"),
        TERRASSEN("TERRASSEN"),
        ETAGE("ETAGE"),
        ERDGESCHOSS("ERDGESCHOSS"),
        SOUTERRAIN("SOUTERRAIN"),
        APARTMENT("APARTMENT"),
        FERIENWOHNUNG("FERIENWOHNUNG"),
        GALERIE("GALERIE"),
        ROHDACHBODEN("ROHDACHBODEN"),
        ATTIKAWOHNUNG("ATTIKAWOHNUNG"),
        KEINE_ANGABE("KEINE_ANGABE");
        private final String value;

        Wohnungtyp(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static Wohnung.Wohnungtyp fromValue(String v) {
            for (Wohnung.Wohnungtyp c: Wohnung.Wohnungtyp.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}