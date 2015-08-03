
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
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

public class GarageKauf
    extends JAXBElement<GarageKauf.Type>
{

    protected final static QName NAME = new QName("http://www.immobilienscout24.de/immobilientransfer", "GarageKauf");

    public GarageKauf(GarageKauf.Type value) {
        super(NAME, ((Class) GarageKauf.Type.class), null, value);
    }

    public GarageKauf() {
        super(NAME, ((Class) GarageKauf.Type.class), null, null);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}GarageTyp"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Kaufpreise" type="{http://www.immobilienscout24.de/immobilientransfer}VermarktungGarageKaufTyp"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "kaufpreise"
    })
    public static class Type
        extends GarageTyp
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(name = "Kaufpreise", required = true)
        protected VermarktungGarageKaufTyp kaufpreise;

        /**
         * Gets the value of the kaufpreise property.
         * 
         * @return
         *     possible object is
         *     {@link VermarktungGarageKaufTyp }
         *     
         */
        public VermarktungGarageKaufTyp getKaufpreise() {
            return kaufpreise;
        }

        /**
         * Sets the value of the kaufpreise property.
         * 
         * @param value
         *     allowed object is
         *     {@link VermarktungGarageKaufTyp }
         *     
         */
        public void setKaufpreise(VermarktungGarageKaufTyp value) {
            this.kaufpreise = value;
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
            super.appendFields(locator, buffer, strategy);
            {
                VermarktungGarageKaufTyp theKaufpreise;
                theKaufpreise = this.getKaufpreise();
                strategy.appendField(locator, this, "kaufpreise", buffer, theKaufpreise);
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
            super.copyTo(locator, draftCopy, strategy);
            if (draftCopy instanceof GarageKauf.Type) {
                final GarageKauf.Type copy = ((GarageKauf.Type) draftCopy);
                if (this.kaufpreise!= null) {
                    VermarktungGarageKaufTyp sourceKaufpreise;
                    sourceKaufpreise = this.getKaufpreise();
                    VermarktungGarageKaufTyp copyKaufpreise = ((VermarktungGarageKaufTyp) strategy.copy(LocatorUtils.property(locator, "kaufpreise", sourceKaufpreise), sourceKaufpreise));
                    copy.setKaufpreise(copyKaufpreise);
                } else {
                    copy.kaufpreise = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new GarageKauf.Type();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof GarageKauf.Type)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                return false;
            }
            final GarageKauf.Type that = ((GarageKauf.Type) object);
            {
                VermarktungGarageKaufTyp lhsKaufpreise;
                lhsKaufpreise = this.getKaufpreise();
                VermarktungGarageKaufTyp rhsKaufpreise;
                rhsKaufpreise = that.getKaufpreise();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreise", lhsKaufpreise), LocatorUtils.property(thatLocator, "kaufpreise", rhsKaufpreise), lhsKaufpreise, rhsKaufpreise)) {
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

}
