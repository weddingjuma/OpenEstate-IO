
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for AnlageObjektTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnlageObjektTyp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}GewerbeImmoBaseTyp">
 *       &lt;attribute name="Objektkategorie2" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}AnlageobjekteKategorieTyp" />
 *       &lt;attribute name="VermietbareFlaeche" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" />
 *       &lt;attribute name="WohnFlaechen" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" />
 *       &lt;attribute name="GewerbeFlaechen" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" />
 *       &lt;attribute name="GrundstuecksFlaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" />
 *       &lt;attribute name="SonstigeFlaechen" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" />
 *       &lt;attribute name="XFacheMiete" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl31Typ" />
 *       &lt;attribute name="MietEinnahmePaIst" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *       &lt;attribute name="MietEinnahmePaSoll" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *       &lt;attribute name="Kaufpreis" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *       &lt;attribute name="KaufpreisProQm" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *       &lt;attribute name="BetriebskostenUmgelegt" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *       &lt;attribute name="NichtUmgelegteKosten" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *       &lt;attribute name="PreisProParkflaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *       &lt;attribute name="Denkmalschutzobjekt" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnlageObjektTyp")
@XmlSeeAlso({
    org.openestate.io.is24_xml.xml.Anlageobjekt.Type.class
})
public class AnlageObjektTyp
    extends GewerbeImmoBaseTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "Objektkategorie2", required = true)
    protected AnlageobjekteKategorieTyp objektkategorie2;
    @XmlAttribute(name = "VermietbareFlaeche", required = true)
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected Double vermietbareFlaeche;
    @XmlAttribute(name = "WohnFlaechen")
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected Double wohnFlaechen;
    @XmlAttribute(name = "GewerbeFlaechen")
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected Double gewerbeFlaechen;
    @XmlAttribute(name = "GrundstuecksFlaeche")
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected Double grundstuecksFlaeche;
    @XmlAttribute(name = "SonstigeFlaechen")
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected Double sonstigeFlaechen;
    @XmlAttribute(name = "XFacheMiete")
    @XmlJavaTypeAdapter(Adapter19 .class)
    protected Double xFacheMiete;
    @XmlAttribute(name = "MietEinnahmePaIst")
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Double mietEinnahmePaIst;
    @XmlAttribute(name = "MietEinnahmePaSoll")
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Double mietEinnahmePaSoll;
    @XmlAttribute(name = "Kaufpreis", required = true)
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Double kaufpreis;
    @XmlAttribute(name = "KaufpreisProQm")
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Double kaufpreisProQm;
    @XmlAttribute(name = "BetriebskostenUmgelegt")
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Double betriebskostenUmgelegt;
    @XmlAttribute(name = "NichtUmgelegteKosten")
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Double nichtUmgelegteKosten;
    @XmlAttribute(name = "PreisProParkflaeche")
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Double preisProParkflaeche;
    @XmlAttribute(name = "Denkmalschutzobjekt")
    protected Boolean denkmalschutzobjekt;

    /**
     * Gets the value of the objektkategorie2 property.
     * 
     * @return
     *     possible object is
     *     {@link AnlageobjekteKategorieTyp }
     *     
     */
    public AnlageobjekteKategorieTyp getObjektkategorie2() {
        return objektkategorie2;
    }

    /**
     * Sets the value of the objektkategorie2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlageobjekteKategorieTyp }
     *     
     */
    public void setObjektkategorie2(AnlageobjekteKategorieTyp value) {
        this.objektkategorie2 = value;
    }

    /**
     * Gets the value of the vermietbareFlaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getVermietbareFlaeche() {
        return vermietbareFlaeche;
    }

    /**
     * Sets the value of the vermietbareFlaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVermietbareFlaeche(Double value) {
        this.vermietbareFlaeche = value;
    }

    /**
     * Gets the value of the wohnFlaechen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getWohnFlaechen() {
        return wohnFlaechen;
    }

    /**
     * Sets the value of the wohnFlaechen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWohnFlaechen(Double value) {
        this.wohnFlaechen = value;
    }

    /**
     * Gets the value of the gewerbeFlaechen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getGewerbeFlaechen() {
        return gewerbeFlaechen;
    }

    /**
     * Sets the value of the gewerbeFlaechen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGewerbeFlaechen(Double value) {
        this.gewerbeFlaechen = value;
    }

    /**
     * Gets the value of the grundstuecksFlaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getGrundstuecksFlaeche() {
        return grundstuecksFlaeche;
    }

    /**
     * Sets the value of the grundstuecksFlaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrundstuecksFlaeche(Double value) {
        this.grundstuecksFlaeche = value;
    }

    /**
     * Gets the value of the sonstigeFlaechen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getSonstigeFlaechen() {
        return sonstigeFlaechen;
    }

    /**
     * Sets the value of the sonstigeFlaechen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonstigeFlaechen(Double value) {
        this.sonstigeFlaechen = value;
    }

    /**
     * Gets the value of the xFacheMiete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getXFacheMiete() {
        return xFacheMiete;
    }

    /**
     * Sets the value of the xFacheMiete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFacheMiete(Double value) {
        this.xFacheMiete = value;
    }

    /**
     * Gets the value of the mietEinnahmePaIst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getMietEinnahmePaIst() {
        return mietEinnahmePaIst;
    }

    /**
     * Sets the value of the mietEinnahmePaIst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMietEinnahmePaIst(Double value) {
        this.mietEinnahmePaIst = value;
    }

    /**
     * Gets the value of the mietEinnahmePaSoll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getMietEinnahmePaSoll() {
        return mietEinnahmePaSoll;
    }

    /**
     * Sets the value of the mietEinnahmePaSoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMietEinnahmePaSoll(Double value) {
        this.mietEinnahmePaSoll = value;
    }

    /**
     * Gets the value of the kaufpreis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getKaufpreis() {
        return kaufpreis;
    }

    /**
     * Sets the value of the kaufpreis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKaufpreis(Double value) {
        this.kaufpreis = value;
    }

    /**
     * Gets the value of the kaufpreisProQm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getKaufpreisProQm() {
        return kaufpreisProQm;
    }

    /**
     * Sets the value of the kaufpreisProQm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKaufpreisProQm(Double value) {
        this.kaufpreisProQm = value;
    }

    /**
     * Gets the value of the betriebskostenUmgelegt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getBetriebskostenUmgelegt() {
        return betriebskostenUmgelegt;
    }

    /**
     * Sets the value of the betriebskostenUmgelegt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetriebskostenUmgelegt(Double value) {
        this.betriebskostenUmgelegt = value;
    }

    /**
     * Gets the value of the nichtUmgelegteKosten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getNichtUmgelegteKosten() {
        return nichtUmgelegteKosten;
    }

    /**
     * Sets the value of the nichtUmgelegteKosten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNichtUmgelegteKosten(Double value) {
        this.nichtUmgelegteKosten = value;
    }

    /**
     * Gets the value of the preisProParkflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getPreisProParkflaeche() {
        return preisProParkflaeche;
    }

    /**
     * Sets the value of the preisProParkflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreisProParkflaeche(Double value) {
        this.preisProParkflaeche = value;
    }

    /**
     * Gets the value of the denkmalschutzobjekt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDenkmalschutzobjekt() {
        return denkmalschutzobjekt;
    }

    /**
     * Sets the value of the denkmalschutzobjekt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDenkmalschutzobjekt(Boolean value) {
        this.denkmalschutzobjekt = value;
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
            AnlageobjekteKategorieTyp theObjektkategorie2;
            theObjektkategorie2 = this.getObjektkategorie2();
            strategy.appendField(locator, this, "objektkategorie2", buffer, theObjektkategorie2);
        }
        {
            Double theVermietbareFlaeche;
            theVermietbareFlaeche = this.getVermietbareFlaeche();
            strategy.appendField(locator, this, "vermietbareFlaeche", buffer, theVermietbareFlaeche);
        }
        {
            Double theWohnFlaechen;
            theWohnFlaechen = this.getWohnFlaechen();
            strategy.appendField(locator, this, "wohnFlaechen", buffer, theWohnFlaechen);
        }
        {
            Double theGewerbeFlaechen;
            theGewerbeFlaechen = this.getGewerbeFlaechen();
            strategy.appendField(locator, this, "gewerbeFlaechen", buffer, theGewerbeFlaechen);
        }
        {
            Double theGrundstuecksFlaeche;
            theGrundstuecksFlaeche = this.getGrundstuecksFlaeche();
            strategy.appendField(locator, this, "grundstuecksFlaeche", buffer, theGrundstuecksFlaeche);
        }
        {
            Double theSonstigeFlaechen;
            theSonstigeFlaechen = this.getSonstigeFlaechen();
            strategy.appendField(locator, this, "sonstigeFlaechen", buffer, theSonstigeFlaechen);
        }
        {
            Double theXFacheMiete;
            theXFacheMiete = this.getXFacheMiete();
            strategy.appendField(locator, this, "xFacheMiete", buffer, theXFacheMiete);
        }
        {
            Double theMietEinnahmePaIst;
            theMietEinnahmePaIst = this.getMietEinnahmePaIst();
            strategy.appendField(locator, this, "mietEinnahmePaIst", buffer, theMietEinnahmePaIst);
        }
        {
            Double theMietEinnahmePaSoll;
            theMietEinnahmePaSoll = this.getMietEinnahmePaSoll();
            strategy.appendField(locator, this, "mietEinnahmePaSoll", buffer, theMietEinnahmePaSoll);
        }
        {
            Double theKaufpreis;
            theKaufpreis = this.getKaufpreis();
            strategy.appendField(locator, this, "kaufpreis", buffer, theKaufpreis);
        }
        {
            Double theKaufpreisProQm;
            theKaufpreisProQm = this.getKaufpreisProQm();
            strategy.appendField(locator, this, "kaufpreisProQm", buffer, theKaufpreisProQm);
        }
        {
            Double theBetriebskostenUmgelegt;
            theBetriebskostenUmgelegt = this.getBetriebskostenUmgelegt();
            strategy.appendField(locator, this, "betriebskostenUmgelegt", buffer, theBetriebskostenUmgelegt);
        }
        {
            Double theNichtUmgelegteKosten;
            theNichtUmgelegteKosten = this.getNichtUmgelegteKosten();
            strategy.appendField(locator, this, "nichtUmgelegteKosten", buffer, theNichtUmgelegteKosten);
        }
        {
            Double thePreisProParkflaeche;
            thePreisProParkflaeche = this.getPreisProParkflaeche();
            strategy.appendField(locator, this, "preisProParkflaeche", buffer, thePreisProParkflaeche);
        }
        {
            Boolean theDenkmalschutzobjekt;
            theDenkmalschutzobjekt = this.isDenkmalschutzobjekt();
            strategy.appendField(locator, this, "denkmalschutzobjekt", buffer, theDenkmalschutzobjekt);
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
        if (draftCopy instanceof AnlageObjektTyp) {
            final AnlageObjektTyp copy = ((AnlageObjektTyp) draftCopy);
            if (this.objektkategorie2 != null) {
                AnlageobjekteKategorieTyp sourceObjektkategorie2;
                sourceObjektkategorie2 = this.getObjektkategorie2();
                AnlageobjekteKategorieTyp copyObjektkategorie2 = ((AnlageobjekteKategorieTyp) strategy.copy(LocatorUtils.property(locator, "objektkategorie2", sourceObjektkategorie2), sourceObjektkategorie2));
                copy.setObjektkategorie2(copyObjektkategorie2);
            } else {
                copy.objektkategorie2 = null;
            }
            if (this.vermietbareFlaeche!= null) {
                Double sourceVermietbareFlaeche;
                sourceVermietbareFlaeche = this.getVermietbareFlaeche();
                Double copyVermietbareFlaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "vermietbareFlaeche", sourceVermietbareFlaeche), sourceVermietbareFlaeche));
                copy.setVermietbareFlaeche(copyVermietbareFlaeche);
            } else {
                copy.vermietbareFlaeche = null;
            }
            if (this.wohnFlaechen!= null) {
                Double sourceWohnFlaechen;
                sourceWohnFlaechen = this.getWohnFlaechen();
                Double copyWohnFlaechen = ((Double) strategy.copy(LocatorUtils.property(locator, "wohnFlaechen", sourceWohnFlaechen), sourceWohnFlaechen));
                copy.setWohnFlaechen(copyWohnFlaechen);
            } else {
                copy.wohnFlaechen = null;
            }
            if (this.gewerbeFlaechen!= null) {
                Double sourceGewerbeFlaechen;
                sourceGewerbeFlaechen = this.getGewerbeFlaechen();
                Double copyGewerbeFlaechen = ((Double) strategy.copy(LocatorUtils.property(locator, "gewerbeFlaechen", sourceGewerbeFlaechen), sourceGewerbeFlaechen));
                copy.setGewerbeFlaechen(copyGewerbeFlaechen);
            } else {
                copy.gewerbeFlaechen = null;
            }
            if (this.grundstuecksFlaeche!= null) {
                Double sourceGrundstuecksFlaeche;
                sourceGrundstuecksFlaeche = this.getGrundstuecksFlaeche();
                Double copyGrundstuecksFlaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "grundstuecksFlaeche", sourceGrundstuecksFlaeche), sourceGrundstuecksFlaeche));
                copy.setGrundstuecksFlaeche(copyGrundstuecksFlaeche);
            } else {
                copy.grundstuecksFlaeche = null;
            }
            if (this.sonstigeFlaechen!= null) {
                Double sourceSonstigeFlaechen;
                sourceSonstigeFlaechen = this.getSonstigeFlaechen();
                Double copySonstigeFlaechen = ((Double) strategy.copy(LocatorUtils.property(locator, "sonstigeFlaechen", sourceSonstigeFlaechen), sourceSonstigeFlaechen));
                copy.setSonstigeFlaechen(copySonstigeFlaechen);
            } else {
                copy.sonstigeFlaechen = null;
            }
            if (this.xFacheMiete!= null) {
                Double sourceXFacheMiete;
                sourceXFacheMiete = this.getXFacheMiete();
                Double copyXFacheMiete = ((Double) strategy.copy(LocatorUtils.property(locator, "xFacheMiete", sourceXFacheMiete), sourceXFacheMiete));
                copy.setXFacheMiete(copyXFacheMiete);
            } else {
                copy.xFacheMiete = null;
            }
            if (this.mietEinnahmePaIst!= null) {
                Double sourceMietEinnahmePaIst;
                sourceMietEinnahmePaIst = this.getMietEinnahmePaIst();
                Double copyMietEinnahmePaIst = ((Double) strategy.copy(LocatorUtils.property(locator, "mietEinnahmePaIst", sourceMietEinnahmePaIst), sourceMietEinnahmePaIst));
                copy.setMietEinnahmePaIst(copyMietEinnahmePaIst);
            } else {
                copy.mietEinnahmePaIst = null;
            }
            if (this.mietEinnahmePaSoll!= null) {
                Double sourceMietEinnahmePaSoll;
                sourceMietEinnahmePaSoll = this.getMietEinnahmePaSoll();
                Double copyMietEinnahmePaSoll = ((Double) strategy.copy(LocatorUtils.property(locator, "mietEinnahmePaSoll", sourceMietEinnahmePaSoll), sourceMietEinnahmePaSoll));
                copy.setMietEinnahmePaSoll(copyMietEinnahmePaSoll);
            } else {
                copy.mietEinnahmePaSoll = null;
            }
            if (this.kaufpreis!= null) {
                Double sourceKaufpreis;
                sourceKaufpreis = this.getKaufpreis();
                Double copyKaufpreis = ((Double) strategy.copy(LocatorUtils.property(locator, "kaufpreis", sourceKaufpreis), sourceKaufpreis));
                copy.setKaufpreis(copyKaufpreis);
            } else {
                copy.kaufpreis = null;
            }
            if (this.kaufpreisProQm!= null) {
                Double sourceKaufpreisProQm;
                sourceKaufpreisProQm = this.getKaufpreisProQm();
                Double copyKaufpreisProQm = ((Double) strategy.copy(LocatorUtils.property(locator, "kaufpreisProQm", sourceKaufpreisProQm), sourceKaufpreisProQm));
                copy.setKaufpreisProQm(copyKaufpreisProQm);
            } else {
                copy.kaufpreisProQm = null;
            }
            if (this.betriebskostenUmgelegt!= null) {
                Double sourceBetriebskostenUmgelegt;
                sourceBetriebskostenUmgelegt = this.getBetriebskostenUmgelegt();
                Double copyBetriebskostenUmgelegt = ((Double) strategy.copy(LocatorUtils.property(locator, "betriebskostenUmgelegt", sourceBetriebskostenUmgelegt), sourceBetriebskostenUmgelegt));
                copy.setBetriebskostenUmgelegt(copyBetriebskostenUmgelegt);
            } else {
                copy.betriebskostenUmgelegt = null;
            }
            if (this.nichtUmgelegteKosten!= null) {
                Double sourceNichtUmgelegteKosten;
                sourceNichtUmgelegteKosten = this.getNichtUmgelegteKosten();
                Double copyNichtUmgelegteKosten = ((Double) strategy.copy(LocatorUtils.property(locator, "nichtUmgelegteKosten", sourceNichtUmgelegteKosten), sourceNichtUmgelegteKosten));
                copy.setNichtUmgelegteKosten(copyNichtUmgelegteKosten);
            } else {
                copy.nichtUmgelegteKosten = null;
            }
            if (this.preisProParkflaeche!= null) {
                Double sourcePreisProParkflaeche;
                sourcePreisProParkflaeche = this.getPreisProParkflaeche();
                Double copyPreisProParkflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "preisProParkflaeche", sourcePreisProParkflaeche), sourcePreisProParkflaeche));
                copy.setPreisProParkflaeche(copyPreisProParkflaeche);
            } else {
                copy.preisProParkflaeche = null;
            }
            if (this.denkmalschutzobjekt!= null) {
                Boolean sourceDenkmalschutzobjekt;
                sourceDenkmalschutzobjekt = this.isDenkmalschutzobjekt();
                Boolean copyDenkmalschutzobjekt = ((Boolean) strategy.copy(LocatorUtils.property(locator, "denkmalschutzobjekt", sourceDenkmalschutzobjekt), sourceDenkmalschutzobjekt));
                copy.setDenkmalschutzobjekt(copyDenkmalschutzobjekt);
            } else {
                copy.denkmalschutzobjekt = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AnlageObjektTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AnlageObjektTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AnlageObjektTyp that = ((AnlageObjektTyp) object);
        {
            AnlageobjekteKategorieTyp lhsObjektkategorie2;
            lhsObjektkategorie2 = this.getObjektkategorie2();
            AnlageobjekteKategorieTyp rhsObjektkategorie2;
            rhsObjektkategorie2 = that.getObjektkategorie2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektkategorie2", lhsObjektkategorie2), LocatorUtils.property(thatLocator, "objektkategorie2", rhsObjektkategorie2), lhsObjektkategorie2, rhsObjektkategorie2)) {
                return false;
            }
        }
        {
            Double lhsVermietbareFlaeche;
            lhsVermietbareFlaeche = this.getVermietbareFlaeche();
            Double rhsVermietbareFlaeche;
            rhsVermietbareFlaeche = that.getVermietbareFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermietbareFlaeche", lhsVermietbareFlaeche), LocatorUtils.property(thatLocator, "vermietbareFlaeche", rhsVermietbareFlaeche), lhsVermietbareFlaeche, rhsVermietbareFlaeche)) {
                return false;
            }
        }
        {
            Double lhsWohnFlaechen;
            lhsWohnFlaechen = this.getWohnFlaechen();
            Double rhsWohnFlaechen;
            rhsWohnFlaechen = that.getWohnFlaechen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnFlaechen", lhsWohnFlaechen), LocatorUtils.property(thatLocator, "wohnFlaechen", rhsWohnFlaechen), lhsWohnFlaechen, rhsWohnFlaechen)) {
                return false;
            }
        }
        {
            Double lhsGewerbeFlaechen;
            lhsGewerbeFlaechen = this.getGewerbeFlaechen();
            Double rhsGewerbeFlaechen;
            rhsGewerbeFlaechen = that.getGewerbeFlaechen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gewerbeFlaechen", lhsGewerbeFlaechen), LocatorUtils.property(thatLocator, "gewerbeFlaechen", rhsGewerbeFlaechen), lhsGewerbeFlaechen, rhsGewerbeFlaechen)) {
                return false;
            }
        }
        {
            Double lhsGrundstuecksFlaeche;
            lhsGrundstuecksFlaeche = this.getGrundstuecksFlaeche();
            Double rhsGrundstuecksFlaeche;
            rhsGrundstuecksFlaeche = that.getGrundstuecksFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grundstuecksFlaeche", lhsGrundstuecksFlaeche), LocatorUtils.property(thatLocator, "grundstuecksFlaeche", rhsGrundstuecksFlaeche), lhsGrundstuecksFlaeche, rhsGrundstuecksFlaeche)) {
                return false;
            }
        }
        {
            Double lhsSonstigeFlaechen;
            lhsSonstigeFlaechen = this.getSonstigeFlaechen();
            Double rhsSonstigeFlaechen;
            rhsSonstigeFlaechen = that.getSonstigeFlaechen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sonstigeFlaechen", lhsSonstigeFlaechen), LocatorUtils.property(thatLocator, "sonstigeFlaechen", rhsSonstigeFlaechen), lhsSonstigeFlaechen, rhsSonstigeFlaechen)) {
                return false;
            }
        }
        {
            Double lhsXFacheMiete;
            lhsXFacheMiete = this.getXFacheMiete();
            Double rhsXFacheMiete;
            rhsXFacheMiete = that.getXFacheMiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xFacheMiete", lhsXFacheMiete), LocatorUtils.property(thatLocator, "xFacheMiete", rhsXFacheMiete), lhsXFacheMiete, rhsXFacheMiete)) {
                return false;
            }
        }
        {
            Double lhsMietEinnahmePaIst;
            lhsMietEinnahmePaIst = this.getMietEinnahmePaIst();
            Double rhsMietEinnahmePaIst;
            rhsMietEinnahmePaIst = that.getMietEinnahmePaIst();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mietEinnahmePaIst", lhsMietEinnahmePaIst), LocatorUtils.property(thatLocator, "mietEinnahmePaIst", rhsMietEinnahmePaIst), lhsMietEinnahmePaIst, rhsMietEinnahmePaIst)) {
                return false;
            }
        }
        {
            Double lhsMietEinnahmePaSoll;
            lhsMietEinnahmePaSoll = this.getMietEinnahmePaSoll();
            Double rhsMietEinnahmePaSoll;
            rhsMietEinnahmePaSoll = that.getMietEinnahmePaSoll();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mietEinnahmePaSoll", lhsMietEinnahmePaSoll), LocatorUtils.property(thatLocator, "mietEinnahmePaSoll", rhsMietEinnahmePaSoll), lhsMietEinnahmePaSoll, rhsMietEinnahmePaSoll)) {
                return false;
            }
        }
        {
            Double lhsKaufpreis;
            lhsKaufpreis = this.getKaufpreis();
            Double rhsKaufpreis;
            rhsKaufpreis = that.getKaufpreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreis", lhsKaufpreis), LocatorUtils.property(thatLocator, "kaufpreis", rhsKaufpreis), lhsKaufpreis, rhsKaufpreis)) {
                return false;
            }
        }
        {
            Double lhsKaufpreisProQm;
            lhsKaufpreisProQm = this.getKaufpreisProQm();
            Double rhsKaufpreisProQm;
            rhsKaufpreisProQm = that.getKaufpreisProQm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreisProQm", lhsKaufpreisProQm), LocatorUtils.property(thatLocator, "kaufpreisProQm", rhsKaufpreisProQm), lhsKaufpreisProQm, rhsKaufpreisProQm)) {
                return false;
            }
        }
        {
            Double lhsBetriebskostenUmgelegt;
            lhsBetriebskostenUmgelegt = this.getBetriebskostenUmgelegt();
            Double rhsBetriebskostenUmgelegt;
            rhsBetriebskostenUmgelegt = that.getBetriebskostenUmgelegt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betriebskostenUmgelegt", lhsBetriebskostenUmgelegt), LocatorUtils.property(thatLocator, "betriebskostenUmgelegt", rhsBetriebskostenUmgelegt), lhsBetriebskostenUmgelegt, rhsBetriebskostenUmgelegt)) {
                return false;
            }
        }
        {
            Double lhsNichtUmgelegteKosten;
            lhsNichtUmgelegteKosten = this.getNichtUmgelegteKosten();
            Double rhsNichtUmgelegteKosten;
            rhsNichtUmgelegteKosten = that.getNichtUmgelegteKosten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nichtUmgelegteKosten", lhsNichtUmgelegteKosten), LocatorUtils.property(thatLocator, "nichtUmgelegteKosten", rhsNichtUmgelegteKosten), lhsNichtUmgelegteKosten, rhsNichtUmgelegteKosten)) {
                return false;
            }
        }
        {
            Double lhsPreisProParkflaeche;
            lhsPreisProParkflaeche = this.getPreisProParkflaeche();
            Double rhsPreisProParkflaeche;
            rhsPreisProParkflaeche = that.getPreisProParkflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisProParkflaeche", lhsPreisProParkflaeche), LocatorUtils.property(thatLocator, "preisProParkflaeche", rhsPreisProParkflaeche), lhsPreisProParkflaeche, rhsPreisProParkflaeche)) {
                return false;
            }
        }
        {
            Boolean lhsDenkmalschutzobjekt;
            lhsDenkmalschutzobjekt = this.isDenkmalschutzobjekt();
            Boolean rhsDenkmalschutzobjekt;
            rhsDenkmalschutzobjekt = that.isDenkmalschutzobjekt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "denkmalschutzobjekt", lhsDenkmalschutzobjekt), LocatorUtils.property(thatLocator, "denkmalschutzobjekt", rhsDenkmalschutzobjekt), lhsDenkmalschutzobjekt, rhsDenkmalschutzobjekt)) {
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
