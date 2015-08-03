
package org.openestate.io.is24_xml.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for ImmobilienTransferTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImmobilienTransferTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Anbieter"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}AnbieterTyp"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.immobilienscout24.de/immobilientransfer}VirtuelleImmobilie" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.immobilienscout24.de/immobilientransfer}Immobilie" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="EmailBeiFehler" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}EmailTyp" /&gt;
 *       &lt;attribute name="ErstellerSoftware" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.immobilienscout24.de/immobilientransfer}Text100Typ"&gt;
 *             &lt;minLength value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ErstellerSoftwareVersion" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.immobilienscout24.de/immobilientransfer}Text100Typ"&gt;
 *             &lt;minLength value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmobilienTransferTyp", propOrder = {
    "anbieter"
})
public class ImmobilienTransferTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "Anbieter", required = true)
    protected ImmobilienTransferTyp.Anbieter anbieter;
    @XmlAttribute(name = "EmailBeiFehler", required = true)
    @XmlJavaTypeAdapter(Adapter16 .class)
    protected String emailBeiFehler;
    @XmlAttribute(name = "ErstellerSoftware", required = true)
    @XmlJavaTypeAdapter(Adapter9 .class)
    protected String erstellerSoftware;
    @XmlAttribute(name = "ErstellerSoftwareVersion", required = true)
    @XmlJavaTypeAdapter(Adapter9 .class)
    protected String erstellerSoftwareVersion;

    /**
     * Gets the value of the anbieter property.
     * 
     * @return
     *     possible object is
     *     {@link ImmobilienTransferTyp.Anbieter }
     *     
     */
    public ImmobilienTransferTyp.Anbieter getAnbieter() {
        return anbieter;
    }

    /**
     * Sets the value of the anbieter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmobilienTransferTyp.Anbieter }
     *     
     */
    public void setAnbieter(ImmobilienTransferTyp.Anbieter value) {
        this.anbieter = value;
    }

    /**
     * Gets the value of the emailBeiFehler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailBeiFehler() {
        return emailBeiFehler;
    }

    /**
     * Sets the value of the emailBeiFehler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailBeiFehler(String value) {
        this.emailBeiFehler = value;
    }

    /**
     * Gets the value of the erstellerSoftware property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErstellerSoftware() {
        return erstellerSoftware;
    }

    /**
     * Sets the value of the erstellerSoftware property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErstellerSoftware(String value) {
        this.erstellerSoftware = value;
    }

    /**
     * Gets the value of the erstellerSoftwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErstellerSoftwareVersion() {
        return erstellerSoftwareVersion;
    }

    /**
     * Sets the value of the erstellerSoftwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErstellerSoftwareVersion(String value) {
        this.erstellerSoftwareVersion = value;
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
            ImmobilienTransferTyp.Anbieter theAnbieter;
            theAnbieter = this.getAnbieter();
            strategy.appendField(locator, this, "anbieter", buffer, theAnbieter);
        }
        {
            String theEmailBeiFehler;
            theEmailBeiFehler = this.getEmailBeiFehler();
            strategy.appendField(locator, this, "emailBeiFehler", buffer, theEmailBeiFehler);
        }
        {
            String theErstellerSoftware;
            theErstellerSoftware = this.getErstellerSoftware();
            strategy.appendField(locator, this, "erstellerSoftware", buffer, theErstellerSoftware);
        }
        {
            String theErstellerSoftwareVersion;
            theErstellerSoftwareVersion = this.getErstellerSoftwareVersion();
            strategy.appendField(locator, this, "erstellerSoftwareVersion", buffer, theErstellerSoftwareVersion);
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
        if (draftCopy instanceof ImmobilienTransferTyp) {
            final ImmobilienTransferTyp copy = ((ImmobilienTransferTyp) draftCopy);
            if (this.anbieter!= null) {
                ImmobilienTransferTyp.Anbieter sourceAnbieter;
                sourceAnbieter = this.getAnbieter();
                ImmobilienTransferTyp.Anbieter copyAnbieter = ((ImmobilienTransferTyp.Anbieter) strategy.copy(LocatorUtils.property(locator, "anbieter", sourceAnbieter), sourceAnbieter));
                copy.setAnbieter(copyAnbieter);
            } else {
                copy.anbieter = null;
            }
            if (this.emailBeiFehler!= null) {
                String sourceEmailBeiFehler;
                sourceEmailBeiFehler = this.getEmailBeiFehler();
                String copyEmailBeiFehler = ((String) strategy.copy(LocatorUtils.property(locator, "emailBeiFehler", sourceEmailBeiFehler), sourceEmailBeiFehler));
                copy.setEmailBeiFehler(copyEmailBeiFehler);
            } else {
                copy.emailBeiFehler = null;
            }
            if (this.erstellerSoftware!= null) {
                String sourceErstellerSoftware;
                sourceErstellerSoftware = this.getErstellerSoftware();
                String copyErstellerSoftware = ((String) strategy.copy(LocatorUtils.property(locator, "erstellerSoftware", sourceErstellerSoftware), sourceErstellerSoftware));
                copy.setErstellerSoftware(copyErstellerSoftware);
            } else {
                copy.erstellerSoftware = null;
            }
            if (this.erstellerSoftwareVersion!= null) {
                String sourceErstellerSoftwareVersion;
                sourceErstellerSoftwareVersion = this.getErstellerSoftwareVersion();
                String copyErstellerSoftwareVersion = ((String) strategy.copy(LocatorUtils.property(locator, "erstellerSoftwareVersion", sourceErstellerSoftwareVersion), sourceErstellerSoftwareVersion));
                copy.setErstellerSoftwareVersion(copyErstellerSoftwareVersion);
            } else {
                copy.erstellerSoftwareVersion = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ImmobilienTransferTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ImmobilienTransferTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ImmobilienTransferTyp that = ((ImmobilienTransferTyp) object);
        {
            ImmobilienTransferTyp.Anbieter lhsAnbieter;
            lhsAnbieter = this.getAnbieter();
            ImmobilienTransferTyp.Anbieter rhsAnbieter;
            rhsAnbieter = that.getAnbieter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anbieter", lhsAnbieter), LocatorUtils.property(thatLocator, "anbieter", rhsAnbieter), lhsAnbieter, rhsAnbieter)) {
                return false;
            }
        }
        {
            String lhsEmailBeiFehler;
            lhsEmailBeiFehler = this.getEmailBeiFehler();
            String rhsEmailBeiFehler;
            rhsEmailBeiFehler = that.getEmailBeiFehler();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailBeiFehler", lhsEmailBeiFehler), LocatorUtils.property(thatLocator, "emailBeiFehler", rhsEmailBeiFehler), lhsEmailBeiFehler, rhsEmailBeiFehler)) {
                return false;
            }
        }
        {
            String lhsErstellerSoftware;
            lhsErstellerSoftware = this.getErstellerSoftware();
            String rhsErstellerSoftware;
            rhsErstellerSoftware = that.getErstellerSoftware();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erstellerSoftware", lhsErstellerSoftware), LocatorUtils.property(thatLocator, "erstellerSoftware", rhsErstellerSoftware), lhsErstellerSoftware, rhsErstellerSoftware)) {
                return false;
            }
        }
        {
            String lhsErstellerSoftwareVersion;
            lhsErstellerSoftwareVersion = this.getErstellerSoftwareVersion();
            String rhsErstellerSoftwareVersion;
            rhsErstellerSoftwareVersion = that.getErstellerSoftwareVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erstellerSoftwareVersion", lhsErstellerSoftwareVersion), LocatorUtils.property(thatLocator, "erstellerSoftwareVersion", rhsErstellerSoftwareVersion), lhsErstellerSoftwareVersion, rhsErstellerSoftwareVersion)) {
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}AnbieterTyp"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.immobilienscout24.de/immobilientransfer}VirtuelleImmobilie" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.immobilienscout24.de/immobilientransfer}Immobilie" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "virtuelleImmobilie",
        "immobilie"
    })
    public static class Anbieter
        extends AnbieterTyp
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlElementRef(name = "VirtuelleImmobilie", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
        protected List<JAXBElement<? extends VirtuelleImmobilieBaseTyp>> virtuelleImmobilie;
        @XmlElementRef(name = "Immobilie", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
        protected List<JAXBElement<? extends ImmobilieBaseTyp>> immobilie;

        /**
         * Gets the value of the virtuelleImmobilie property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the virtuelleImmobilie property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVirtuelleImmobilie().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link VirtuelleImmobilieBaseTyp }{@code >}
         * {@link JAXBElement }{@code <}{@link TypenHaus }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends VirtuelleImmobilieBaseTyp>> getVirtuelleImmobilie() {
            if (virtuelleImmobilie == null) {
                virtuelleImmobilie = new ArrayList<JAXBElement<? extends VirtuelleImmobilieBaseTyp>>();
            }
            return this.virtuelleImmobilie;
        }

        /**
         * Gets the value of the immobilie property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the immobilie property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImmobilie().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link Grundstueck }{@code >}
         * {@link WohnungMiete }
         * {@link Anlageobjekt }
         * {@link WAZ }
         * {@link GrundstueckWohnenKauf }
         * {@link HausKauf }
         * {@link GrundstueckWohnenMiete }
         * {@link GrundstueckGewerbe }
         * {@link HalleProduktion }
         * {@link Einzelhandel }
         * {@link WGZimmer }
         * {@link SonstigeGewerbe }
         * {@link Gastronomie }
         * {@link GarageMiete }
         * {@link JAXBElement }{@code <}{@link ImmobilieBaseTyp }{@code >}
         * {@link BueroPraxis }
         * {@link HausMiete }
         * {@link GarageKauf }
         * {@link WohnungKauf }
         * {@link Zwangsversteigerung }
         * 
         * 
         */
        public List<JAXBElement<? extends ImmobilieBaseTyp>> getImmobilie() {
            if (immobilie == null) {
                immobilie = new ArrayList<JAXBElement<? extends ImmobilieBaseTyp>>();
            }
            return this.immobilie;
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
                List<JAXBElement<? extends VirtuelleImmobilieBaseTyp>> theVirtuelleImmobilie;
                theVirtuelleImmobilie = (((this.virtuelleImmobilie!= null)&&(!this.virtuelleImmobilie.isEmpty()))?this.getVirtuelleImmobilie():null);
                strategy.appendField(locator, this, "virtuelleImmobilie", buffer, theVirtuelleImmobilie);
            }
            {
                List<JAXBElement<? extends ImmobilieBaseTyp>> theImmobilie;
                theImmobilie = (((this.immobilie!= null)&&(!this.immobilie.isEmpty()))?this.getImmobilie():null);
                strategy.appendField(locator, this, "immobilie", buffer, theImmobilie);
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
            if (draftCopy instanceof ImmobilienTransferTyp.Anbieter) {
                final ImmobilienTransferTyp.Anbieter copy = ((ImmobilienTransferTyp.Anbieter) draftCopy);
                if ((this.virtuelleImmobilie!= null)&&(!this.virtuelleImmobilie.isEmpty())) {
                    List<JAXBElement<? extends VirtuelleImmobilieBaseTyp>> sourceVirtuelleImmobilie;
                    sourceVirtuelleImmobilie = (((this.virtuelleImmobilie!= null)&&(!this.virtuelleImmobilie.isEmpty()))?this.getVirtuelleImmobilie():null);
                    @SuppressWarnings("unchecked")
                    List<JAXBElement<? extends VirtuelleImmobilieBaseTyp>> copyVirtuelleImmobilie = ((List<JAXBElement<? extends VirtuelleImmobilieBaseTyp>> ) strategy.copy(LocatorUtils.property(locator, "virtuelleImmobilie", sourceVirtuelleImmobilie), sourceVirtuelleImmobilie));
                    copy.virtuelleImmobilie = null;
                    if (copyVirtuelleImmobilie!= null) {
                        List<JAXBElement<? extends VirtuelleImmobilieBaseTyp>> uniqueVirtuelleImmobiliel = copy.getVirtuelleImmobilie();
                        uniqueVirtuelleImmobiliel.addAll(copyVirtuelleImmobilie);
                    }
                } else {
                    copy.virtuelleImmobilie = null;
                }
                if ((this.immobilie!= null)&&(!this.immobilie.isEmpty())) {
                    List<JAXBElement<? extends ImmobilieBaseTyp>> sourceImmobilie;
                    sourceImmobilie = (((this.immobilie!= null)&&(!this.immobilie.isEmpty()))?this.getImmobilie():null);
                    @SuppressWarnings("unchecked")
                    List<JAXBElement<? extends ImmobilieBaseTyp>> copyImmobilie = ((List<JAXBElement<? extends ImmobilieBaseTyp>> ) strategy.copy(LocatorUtils.property(locator, "immobilie", sourceImmobilie), sourceImmobilie));
                    copy.immobilie = null;
                    if (copyImmobilie!= null) {
                        List<JAXBElement<? extends ImmobilieBaseTyp>> uniqueImmobiliel = copy.getImmobilie();
                        uniqueImmobiliel.addAll(copyImmobilie);
                    }
                } else {
                    copy.immobilie = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ImmobilienTransferTyp.Anbieter();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof ImmobilienTransferTyp.Anbieter)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                return false;
            }
            final ImmobilienTransferTyp.Anbieter that = ((ImmobilienTransferTyp.Anbieter) object);
            {
                List<JAXBElement<? extends VirtuelleImmobilieBaseTyp>> lhsVirtuelleImmobilie;
                lhsVirtuelleImmobilie = (((this.virtuelleImmobilie!= null)&&(!this.virtuelleImmobilie.isEmpty()))?this.getVirtuelleImmobilie():null);
                List<JAXBElement<? extends VirtuelleImmobilieBaseTyp>> rhsVirtuelleImmobilie;
                rhsVirtuelleImmobilie = (((that.virtuelleImmobilie!= null)&&(!that.virtuelleImmobilie.isEmpty()))?that.getVirtuelleImmobilie():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "virtuelleImmobilie", lhsVirtuelleImmobilie), LocatorUtils.property(thatLocator, "virtuelleImmobilie", rhsVirtuelleImmobilie), lhsVirtuelleImmobilie, rhsVirtuelleImmobilie)) {
                    return false;
                }
            }
            {
                List<JAXBElement<? extends ImmobilieBaseTyp>> lhsImmobilie;
                lhsImmobilie = (((this.immobilie!= null)&&(!this.immobilie.isEmpty()))?this.getImmobilie():null);
                List<JAXBElement<? extends ImmobilieBaseTyp>> rhsImmobilie;
                rhsImmobilie = (((that.immobilie!= null)&&(!that.immobilie.isEmpty()))?that.getImmobilie():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "immobilie", lhsImmobilie), LocatorUtils.property(thatLocator, "immobilie", rhsImmobilie), lhsImmobilie, rhsImmobilie)) {
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
