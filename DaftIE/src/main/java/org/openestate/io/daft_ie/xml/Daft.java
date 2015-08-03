
package org.openestate.io.daft_ie.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="overseas_sales" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="overseas_sale_ad" type="{}overseasSaleAdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="overseas_rental" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="overseas_rental_ad" type="{}overseasRentalAdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "daft")
public class Daft
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "overseas_sales")
    protected Daft.OverseasSales overseasSales;
    @XmlElement(name = "overseas_rental")
    protected Daft.OverseasRental overseasRental;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the overseasSales property.
     * 
     * @return
     *     possible object is
     *     {@link Daft.OverseasSales }
     *     
     */
    public Daft.OverseasSales getOverseasSales() {
        return overseasSales;
    }

    /**
     * Sets the value of the overseasSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Daft.OverseasSales }
     *     
     */
    public void setOverseasSales(Daft.OverseasSales value) {
        this.overseasSales = value;
    }

    /**
     * Gets the value of the overseasRental property.
     * 
     * @return
     *     possible object is
     *     {@link Daft.OverseasRental }
     *     
     */
    public Daft.OverseasRental getOverseasRental() {
        return overseasRental;
    }

    /**
     * Sets the value of the overseasRental property.
     * 
     * @param value
     *     allowed object is
     *     {@link Daft.OverseasRental }
     *     
     */
    public void setOverseasRental(Daft.OverseasRental value) {
        this.overseasRental = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
            Daft.OverseasSales theOverseasSales;
            theOverseasSales = this.getOverseasSales();
            strategy.appendField(locator, this, "overseasSales", buffer, theOverseasSales);
        }
        {
            Daft.OverseasRental theOverseasRental;
            theOverseasRental = this.getOverseasRental();
            strategy.appendField(locator, this, "overseasRental", buffer, theOverseasRental);
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion);
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
        if (draftCopy instanceof Daft) {
            final Daft copy = ((Daft) draftCopy);
            if (this.overseasSales!= null) {
                Daft.OverseasSales sourceOverseasSales;
                sourceOverseasSales = this.getOverseasSales();
                Daft.OverseasSales copyOverseasSales = ((Daft.OverseasSales) strategy.copy(LocatorUtils.property(locator, "overseasSales", sourceOverseasSales), sourceOverseasSales));
                copy.setOverseasSales(copyOverseasSales);
            } else {
                copy.overseasSales = null;
            }
            if (this.overseasRental!= null) {
                Daft.OverseasRental sourceOverseasRental;
                sourceOverseasRental = this.getOverseasRental();
                Daft.OverseasRental copyOverseasRental = ((Daft.OverseasRental) strategy.copy(LocatorUtils.property(locator, "overseasRental", sourceOverseasRental), sourceOverseasRental));
                copy.setOverseasRental(copyOverseasRental);
            } else {
                copy.overseasRental = null;
            }
            if (this.version!= null) {
                String sourceVersion;
                sourceVersion = this.getVersion();
                String copyVersion = ((String) strategy.copy(LocatorUtils.property(locator, "version", sourceVersion), sourceVersion));
                copy.setVersion(copyVersion);
            } else {
                copy.version = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Daft();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Daft)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Daft that = ((Daft) object);
        {
            Daft.OverseasSales lhsOverseasSales;
            lhsOverseasSales = this.getOverseasSales();
            Daft.OverseasSales rhsOverseasSales;
            rhsOverseasSales = that.getOverseasSales();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "overseasSales", lhsOverseasSales), LocatorUtils.property(thatLocator, "overseasSales", rhsOverseasSales), lhsOverseasSales, rhsOverseasSales)) {
                return false;
            }
        }
        {
            Daft.OverseasRental lhsOverseasRental;
            lhsOverseasRental = this.getOverseasRental();
            Daft.OverseasRental rhsOverseasRental;
            rhsOverseasRental = that.getOverseasRental();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "overseasRental", lhsOverseasRental), LocatorUtils.property(thatLocator, "overseasRental", rhsOverseasRental), lhsOverseasRental, rhsOverseasRental)) {
                return false;
            }
        }
        {
            String lhsVersion;
            lhsVersion = this.getVersion();
            String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion)) {
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="overseas_rental_ad" type="{}overseasRentalAdType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "overseasRentalAd"
    })
    public static class OverseasRental
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(name = "overseas_rental_ad")
        protected List<OverseasRentalAdType> overseasRentalAd;

        /**
         * Gets the value of the overseasRentalAd property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the overseasRentalAd property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOverseasRentalAd().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OverseasRentalAdType }
         * 
         * 
         */
        public List<OverseasRentalAdType> getOverseasRentalAd() {
            if (overseasRentalAd == null) {
                overseasRentalAd = new ArrayList<OverseasRentalAdType>();
            }
            return this.overseasRentalAd;
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
                List<OverseasRentalAdType> theOverseasRentalAd;
                theOverseasRentalAd = (((this.overseasRentalAd!= null)&&(!this.overseasRentalAd.isEmpty()))?this.getOverseasRentalAd():null);
                strategy.appendField(locator, this, "overseasRentalAd", buffer, theOverseasRentalAd);
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
            if (draftCopy instanceof Daft.OverseasRental) {
                final Daft.OverseasRental copy = ((Daft.OverseasRental) draftCopy);
                if ((this.overseasRentalAd!= null)&&(!this.overseasRentalAd.isEmpty())) {
                    List<OverseasRentalAdType> sourceOverseasRentalAd;
                    sourceOverseasRentalAd = (((this.overseasRentalAd!= null)&&(!this.overseasRentalAd.isEmpty()))?this.getOverseasRentalAd():null);
                    @SuppressWarnings("unchecked")
                    List<OverseasRentalAdType> copyOverseasRentalAd = ((List<OverseasRentalAdType> ) strategy.copy(LocatorUtils.property(locator, "overseasRentalAd", sourceOverseasRentalAd), sourceOverseasRentalAd));
                    copy.overseasRentalAd = null;
                    if (copyOverseasRentalAd!= null) {
                        List<OverseasRentalAdType> uniqueOverseasRentalAdl = copy.getOverseasRentalAd();
                        uniqueOverseasRentalAdl.addAll(copyOverseasRentalAd);
                    }
                } else {
                    copy.overseasRentalAd = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new Daft.OverseasRental();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof Daft.OverseasRental)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Daft.OverseasRental that = ((Daft.OverseasRental) object);
            {
                List<OverseasRentalAdType> lhsOverseasRentalAd;
                lhsOverseasRentalAd = (((this.overseasRentalAd!= null)&&(!this.overseasRentalAd.isEmpty()))?this.getOverseasRentalAd():null);
                List<OverseasRentalAdType> rhsOverseasRentalAd;
                rhsOverseasRentalAd = (((that.overseasRentalAd!= null)&&(!that.overseasRentalAd.isEmpty()))?that.getOverseasRentalAd():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "overseasRentalAd", lhsOverseasRentalAd), LocatorUtils.property(thatLocator, "overseasRentalAd", rhsOverseasRentalAd), lhsOverseasRentalAd, rhsOverseasRentalAd)) {
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="overseas_sale_ad" type="{}overseasSaleAdType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "overseasSaleAd"
    })
    public static class OverseasSales
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(name = "overseas_sale_ad")
        protected List<OverseasSaleAdType> overseasSaleAd;

        /**
         * Gets the value of the overseasSaleAd property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the overseasSaleAd property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOverseasSaleAd().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OverseasSaleAdType }
         * 
         * 
         */
        public List<OverseasSaleAdType> getOverseasSaleAd() {
            if (overseasSaleAd == null) {
                overseasSaleAd = new ArrayList<OverseasSaleAdType>();
            }
            return this.overseasSaleAd;
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
                List<OverseasSaleAdType> theOverseasSaleAd;
                theOverseasSaleAd = (((this.overseasSaleAd!= null)&&(!this.overseasSaleAd.isEmpty()))?this.getOverseasSaleAd():null);
                strategy.appendField(locator, this, "overseasSaleAd", buffer, theOverseasSaleAd);
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
            if (draftCopy instanceof Daft.OverseasSales) {
                final Daft.OverseasSales copy = ((Daft.OverseasSales) draftCopy);
                if ((this.overseasSaleAd!= null)&&(!this.overseasSaleAd.isEmpty())) {
                    List<OverseasSaleAdType> sourceOverseasSaleAd;
                    sourceOverseasSaleAd = (((this.overseasSaleAd!= null)&&(!this.overseasSaleAd.isEmpty()))?this.getOverseasSaleAd():null);
                    @SuppressWarnings("unchecked")
                    List<OverseasSaleAdType> copyOverseasSaleAd = ((List<OverseasSaleAdType> ) strategy.copy(LocatorUtils.property(locator, "overseasSaleAd", sourceOverseasSaleAd), sourceOverseasSaleAd));
                    copy.overseasSaleAd = null;
                    if (copyOverseasSaleAd!= null) {
                        List<OverseasSaleAdType> uniqueOverseasSaleAdl = copy.getOverseasSaleAd();
                        uniqueOverseasSaleAdl.addAll(copyOverseasSaleAd);
                    }
                } else {
                    copy.overseasSaleAd = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new Daft.OverseasSales();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof Daft.OverseasSales)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Daft.OverseasSales that = ((Daft.OverseasSales) object);
            {
                List<OverseasSaleAdType> lhsOverseasSaleAd;
                lhsOverseasSaleAd = (((this.overseasSaleAd!= null)&&(!this.overseasSaleAd.isEmpty()))?this.getOverseasSaleAd():null);
                List<OverseasSaleAdType> rhsOverseasSaleAd;
                rhsOverseasSaleAd = (((that.overseasSaleAd!= null)&&(!that.overseasSaleAd.isEmpty()))?that.getOverseasSaleAd():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "overseasSaleAd", lhsOverseasSaleAd), LocatorUtils.property(thatLocator, "overseasSaleAd", rhsOverseasSaleAd), lhsOverseasSaleAd, rhsOverseasSaleAd)) {
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
