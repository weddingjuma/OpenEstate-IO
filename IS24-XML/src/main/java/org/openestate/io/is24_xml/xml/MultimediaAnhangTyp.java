
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for MultimediaAnhangTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultimediaAnhangTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="AnhangArt" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}MMAnhangArtenTyp" /&gt;
 *       &lt;attribute name="Dateiname" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Text255Typ" /&gt;
 *       &lt;attribute name="Titel" type="{http://www.immobilienscout24.de/immobilientransfer}Text30Typ" /&gt;
 *       &lt;attribute name="Dateityp" type="{http://www.immobilienscout24.de/immobilientransfer}Text4Typ" /&gt;
 *       &lt;attribute name="Abspieldauer" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl5Typ" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultimediaAnhangTyp")
public class MultimediaAnhangTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "AnhangArt", required = true)
    protected MMAnhangArtenTyp anhangArt;
    @XmlAttribute(name = "Dateiname", required = true)
    @XmlJavaTypeAdapter(Adapter12 .class)
    protected String dateiname;
    @XmlAttribute(name = "Titel")
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected String titel;
    @XmlAttribute(name = "Dateityp")
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected String dateityp;
    @XmlAttribute(name = "Abspieldauer")
    @XmlJavaTypeAdapter(Adapter23 .class)
    protected Long abspieldauer;

    /**
     * Gets the value of the anhangArt property.
     * 
     * @return
     *     possible object is
     *     {@link MMAnhangArtenTyp }
     *     
     */
    public MMAnhangArtenTyp getAnhangArt() {
        return anhangArt;
    }

    /**
     * Sets the value of the anhangArt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MMAnhangArtenTyp }
     *     
     */
    public void setAnhangArt(MMAnhangArtenTyp value) {
        this.anhangArt = value;
    }

    /**
     * Gets the value of the dateiname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateiname() {
        return dateiname;
    }

    /**
     * Sets the value of the dateiname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateiname(String value) {
        this.dateiname = value;
    }

    /**
     * Gets the value of the titel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Sets the value of the titel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Gets the value of the dateityp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateityp() {
        return dateityp;
    }

    /**
     * Sets the value of the dateityp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateityp(String value) {
        this.dateityp = value;
    }

    /**
     * Gets the value of the abspieldauer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAbspieldauer() {
        return abspieldauer;
    }

    /**
     * Sets the value of the abspieldauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbspieldauer(Long value) {
        this.abspieldauer = value;
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
            MMAnhangArtenTyp theAnhangArt;
            theAnhangArt = this.getAnhangArt();
            strategy.appendField(locator, this, "anhangArt", buffer, theAnhangArt);
        }
        {
            String theDateiname;
            theDateiname = this.getDateiname();
            strategy.appendField(locator, this, "dateiname", buffer, theDateiname);
        }
        {
            String theTitel;
            theTitel = this.getTitel();
            strategy.appendField(locator, this, "titel", buffer, theTitel);
        }
        {
            String theDateityp;
            theDateityp = this.getDateityp();
            strategy.appendField(locator, this, "dateityp", buffer, theDateityp);
        }
        {
            Long theAbspieldauer;
            theAbspieldauer = this.getAbspieldauer();
            strategy.appendField(locator, this, "abspieldauer", buffer, theAbspieldauer);
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
        if (draftCopy instanceof MultimediaAnhangTyp) {
            final MultimediaAnhangTyp copy = ((MultimediaAnhangTyp) draftCopy);
            if (this.anhangArt!= null) {
                MMAnhangArtenTyp sourceAnhangArt;
                sourceAnhangArt = this.getAnhangArt();
                MMAnhangArtenTyp copyAnhangArt = ((MMAnhangArtenTyp) strategy.copy(LocatorUtils.property(locator, "anhangArt", sourceAnhangArt), sourceAnhangArt));
                copy.setAnhangArt(copyAnhangArt);
            } else {
                copy.anhangArt = null;
            }
            if (this.dateiname!= null) {
                String sourceDateiname;
                sourceDateiname = this.getDateiname();
                String copyDateiname = ((String) strategy.copy(LocatorUtils.property(locator, "dateiname", sourceDateiname), sourceDateiname));
                copy.setDateiname(copyDateiname);
            } else {
                copy.dateiname = null;
            }
            if (this.titel!= null) {
                String sourceTitel;
                sourceTitel = this.getTitel();
                String copyTitel = ((String) strategy.copy(LocatorUtils.property(locator, "titel", sourceTitel), sourceTitel));
                copy.setTitel(copyTitel);
            } else {
                copy.titel = null;
            }
            if (this.dateityp!= null) {
                String sourceDateityp;
                sourceDateityp = this.getDateityp();
                String copyDateityp = ((String) strategy.copy(LocatorUtils.property(locator, "dateityp", sourceDateityp), sourceDateityp));
                copy.setDateityp(copyDateityp);
            } else {
                copy.dateityp = null;
            }
            if (this.abspieldauer!= null) {
                Long sourceAbspieldauer;
                sourceAbspieldauer = this.getAbspieldauer();
                Long copyAbspieldauer = ((Long) strategy.copy(LocatorUtils.property(locator, "abspieldauer", sourceAbspieldauer), sourceAbspieldauer));
                copy.setAbspieldauer(copyAbspieldauer);
            } else {
                copy.abspieldauer = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MultimediaAnhangTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MultimediaAnhangTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MultimediaAnhangTyp that = ((MultimediaAnhangTyp) object);
        {
            MMAnhangArtenTyp lhsAnhangArt;
            lhsAnhangArt = this.getAnhangArt();
            MMAnhangArtenTyp rhsAnhangArt;
            rhsAnhangArt = that.getAnhangArt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anhangArt", lhsAnhangArt), LocatorUtils.property(thatLocator, "anhangArt", rhsAnhangArt), lhsAnhangArt, rhsAnhangArt)) {
                return false;
            }
        }
        {
            String lhsDateiname;
            lhsDateiname = this.getDateiname();
            String rhsDateiname;
            rhsDateiname = that.getDateiname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateiname", lhsDateiname), LocatorUtils.property(thatLocator, "dateiname", rhsDateiname), lhsDateiname, rhsDateiname)) {
                return false;
            }
        }
        {
            String lhsTitel;
            lhsTitel = this.getTitel();
            String rhsTitel;
            rhsTitel = that.getTitel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "titel", lhsTitel), LocatorUtils.property(thatLocator, "titel", rhsTitel), lhsTitel, rhsTitel)) {
                return false;
            }
        }
        {
            String lhsDateityp;
            lhsDateityp = this.getDateityp();
            String rhsDateityp;
            rhsDateityp = that.getDateityp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateityp", lhsDateityp), LocatorUtils.property(thatLocator, "dateityp", rhsDateityp), lhsDateityp, rhsDateityp)) {
                return false;
            }
        }
        {
            Long lhsAbspieldauer;
            lhsAbspieldauer = this.getAbspieldauer();
            Long rhsAbspieldauer;
            rhsAbspieldauer = that.getAbspieldauer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abspieldauer", lhsAbspieldauer), LocatorUtils.property(thatLocator, "abspieldauer", rhsAbspieldauer), lhsAbspieldauer, rhsAbspieldauer)) {
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
