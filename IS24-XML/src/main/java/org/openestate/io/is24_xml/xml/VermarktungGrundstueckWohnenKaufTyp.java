
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
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
 * <p>Java class for VermarktungGrundstueckWohnenKaufTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VermarktungGrundstueckWohnenKaufTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Kauf">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Erbpacht">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="DauerInJahren" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl3Typ" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="Preis" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}PreisAufAnfrage" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VermarktungGrundstueckWohnenKaufTyp", propOrder = {
    "kauf",
    "erbpacht"
})
public class VermarktungGrundstueckWohnenKaufTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElementRef(name = "Kauf", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<VermarktungGrundstueckWohnenKaufTyp.Kauf> kauf;
    @XmlElementRef(name = "Erbpacht", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<VermarktungGrundstueckWohnenKaufTyp.Erbpacht> erbpacht;
    @XmlAttribute(name = "Preis", required = true)
    @XmlJavaTypeAdapter(Adapter17 .class)
    protected Double preis;

    /**
     * Gets the value of the kauf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckWohnenKaufTyp.Kauf }{@code >}
     *     
     */
    public JAXBElement<VermarktungGrundstueckWohnenKaufTyp.Kauf> getKauf() {
        return kauf;
    }

    /**
     * Sets the value of the kauf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckWohnenKaufTyp.Kauf }{@code >}
     *     
     */
    public void setKauf(JAXBElement<VermarktungGrundstueckWohnenKaufTyp.Kauf> value) {
        this.kauf = value;
    }

    /**
     * Gets the value of the erbpacht property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckWohnenKaufTyp.Erbpacht }{@code >}
     *     
     */
    public JAXBElement<VermarktungGrundstueckWohnenKaufTyp.Erbpacht> getErbpacht() {
        return erbpacht;
    }

    /**
     * Sets the value of the erbpacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckWohnenKaufTyp.Erbpacht }{@code >}
     *     
     */
    public void setErbpacht(JAXBElement<VermarktungGrundstueckWohnenKaufTyp.Erbpacht> value) {
        this.erbpacht = value;
    }

    /**
     * Gets the value of the preis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getPreis() {
        return preis;
    }

    /**
     * Sets the value of the preis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreis(Double value) {
        this.preis = value;
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
            JAXBElement<VermarktungGrundstueckWohnenKaufTyp.Kauf> theKauf;
            theKauf = this.getKauf();
            strategy.appendField(locator, this, "kauf", buffer, theKauf);
        }
        {
            JAXBElement<VermarktungGrundstueckWohnenKaufTyp.Erbpacht> theErbpacht;
            theErbpacht = this.getErbpacht();
            strategy.appendField(locator, this, "erbpacht", buffer, theErbpacht);
        }
        {
            Double thePreis;
            thePreis = this.getPreis();
            strategy.appendField(locator, this, "preis", buffer, thePreis);
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
        if (draftCopy instanceof VermarktungGrundstueckWohnenKaufTyp) {
            final VermarktungGrundstueckWohnenKaufTyp copy = ((VermarktungGrundstueckWohnenKaufTyp) draftCopy);
            if (this.kauf!= null) {
                JAXBElement<VermarktungGrundstueckWohnenKaufTyp.Kauf> sourceKauf;
                sourceKauf = this.getKauf();
                @SuppressWarnings("unchecked")
                JAXBElement<VermarktungGrundstueckWohnenKaufTyp.Kauf> copyKauf = ((JAXBElement<VermarktungGrundstueckWohnenKaufTyp.Kauf> ) strategy.copy(LocatorUtils.property(locator, "kauf", sourceKauf), sourceKauf));
                copy.setKauf(copyKauf);
            } else {
                copy.kauf = null;
            }
            if (this.erbpacht!= null) {
                JAXBElement<VermarktungGrundstueckWohnenKaufTyp.Erbpacht> sourceErbpacht;
                sourceErbpacht = this.getErbpacht();
                @SuppressWarnings("unchecked")
                JAXBElement<VermarktungGrundstueckWohnenKaufTyp.Erbpacht> copyErbpacht = ((JAXBElement<VermarktungGrundstueckWohnenKaufTyp.Erbpacht> ) strategy.copy(LocatorUtils.property(locator, "erbpacht", sourceErbpacht), sourceErbpacht));
                copy.setErbpacht(copyErbpacht);
            } else {
                copy.erbpacht = null;
            }
            if (this.preis!= null) {
                Double sourcePreis;
                sourcePreis = this.getPreis();
                Double copyPreis = ((Double) strategy.copy(LocatorUtils.property(locator, "preis", sourcePreis), sourcePreis));
                copy.setPreis(copyPreis);
            } else {
                copy.preis = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new VermarktungGrundstueckWohnenKaufTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VermarktungGrundstueckWohnenKaufTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VermarktungGrundstueckWohnenKaufTyp that = ((VermarktungGrundstueckWohnenKaufTyp) object);
        {
            JAXBElement<VermarktungGrundstueckWohnenKaufTyp.Kauf> lhsKauf;
            lhsKauf = this.getKauf();
            JAXBElement<VermarktungGrundstueckWohnenKaufTyp.Kauf> rhsKauf;
            rhsKauf = that.getKauf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kauf", lhsKauf), LocatorUtils.property(thatLocator, "kauf", rhsKauf), lhsKauf, rhsKauf)) {
                return false;
            }
        }
        {
            JAXBElement<VermarktungGrundstueckWohnenKaufTyp.Erbpacht> lhsErbpacht;
            lhsErbpacht = this.getErbpacht();
            JAXBElement<VermarktungGrundstueckWohnenKaufTyp.Erbpacht> rhsErbpacht;
            rhsErbpacht = that.getErbpacht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erbpacht", lhsErbpacht), LocatorUtils.property(thatLocator, "erbpacht", rhsErbpacht), lhsErbpacht, rhsErbpacht)) {
                return false;
            }
        }
        {
            Double lhsPreis;
            lhsPreis = this.getPreis();
            Double rhsPreis;
            rhsPreis = that.getPreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preis", lhsPreis), LocatorUtils.property(thatLocator, "preis", rhsPreis), lhsPreis, rhsPreis)) {
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="DauerInJahren" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl3Typ" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Erbpacht
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlAttribute(name = "DauerInJahren", required = true)
        @XmlJavaTypeAdapter(Adapter5 .class)
        protected Long dauerInJahren;

        /**
         * Gets the value of the dauerInJahren property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Long getDauerInJahren() {
            return dauerInJahren;
        }

        /**
         * Sets the value of the dauerInJahren property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDauerInJahren(Long value) {
            this.dauerInJahren = value;
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
                Long theDauerInJahren;
                theDauerInJahren = this.getDauerInJahren();
                strategy.appendField(locator, this, "dauerInJahren", buffer, theDauerInJahren);
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
            if (draftCopy instanceof VermarktungGrundstueckWohnenKaufTyp.Erbpacht) {
                final VermarktungGrundstueckWohnenKaufTyp.Erbpacht copy = ((VermarktungGrundstueckWohnenKaufTyp.Erbpacht) draftCopy);
                if (this.dauerInJahren!= null) {
                    Long sourceDauerInJahren;
                    sourceDauerInJahren = this.getDauerInJahren();
                    Long copyDauerInJahren = ((Long) strategy.copy(LocatorUtils.property(locator, "dauerInJahren", sourceDauerInJahren), sourceDauerInJahren));
                    copy.setDauerInJahren(copyDauerInJahren);
                } else {
                    copy.dauerInJahren = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new VermarktungGrundstueckWohnenKaufTyp.Erbpacht();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof VermarktungGrundstueckWohnenKaufTyp.Erbpacht)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final VermarktungGrundstueckWohnenKaufTyp.Erbpacht that = ((VermarktungGrundstueckWohnenKaufTyp.Erbpacht) object);
            {
                Long lhsDauerInJahren;
                lhsDauerInJahren = this.getDauerInJahren();
                Long rhsDauerInJahren;
                rhsDauerInJahren = that.getDauerInJahren();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "dauerInJahren", lhsDauerInJahren), LocatorUtils.property(thatLocator, "dauerInJahren", rhsDauerInJahren), lhsDauerInJahren, rhsDauerInJahren)) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Kauf
        implements Cloneable, CopyTo, Equals, ToString
    {


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
            return draftCopy;
        }

        public Object createNewInstance() {
            return new VermarktungGrundstueckWohnenKaufTyp.Kauf();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof VermarktungGrundstueckWohnenKaufTyp.Kauf)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

    }

}
