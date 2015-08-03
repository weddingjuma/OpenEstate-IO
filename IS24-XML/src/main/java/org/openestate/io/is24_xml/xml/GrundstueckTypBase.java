
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
 * Basisklasse fuer alle Grundstueckstypen
 * 
 * <p>Java class for GrundstueckTypBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrundstueckTypBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}ImmobilieBaseTyp"&gt;
 *       &lt;attribute name="GrundstuecksFlaeche" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="TeilbarAb" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl8Typ" /&gt;
 *       &lt;attribute name="BebaubarNach" type="{http://www.immobilienscout24.de/immobilientransfer}BebaubarNachTyp" /&gt;
 *       &lt;attribute name="BaugenehmigungVorhanden" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AbrissErforderlich" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GRZ" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl32Typ" /&gt;
 *       &lt;attribute name="GFZ" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl32Typ" /&gt;
 *       &lt;attribute name="Erschliessungszustand" type="{http://www.immobilienscout24.de/immobilientransfer}ErschliessungszustandTyp" /&gt;
 *       &lt;attribute name="KurzfristigBebaubar" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FreiAb" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrundstueckTypBase")
@XmlSeeAlso({
    Grundstueck.class,
    org.openestate.io.is24_xml.xml.GrundstueckWohnenKauf.Type.class,
    org.openestate.io.is24_xml.xml.GrundstueckWohnenMiete.Type.class,
    org.openestate.io.is24_xml.xml.GrundstueckGewerbe.Type.class
})
public abstract class GrundstueckTypBase
    extends ImmobilieBaseTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "GrundstuecksFlaeche", required = true)
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected Double grundstuecksFlaeche;
    @XmlAttribute(name = "TeilbarAb")
    @XmlJavaTypeAdapter(Adapter24 .class)
    protected Long teilbarAb;
    @XmlAttribute(name = "BebaubarNach")
    protected BebaubarNachTyp bebaubarNach;
    @XmlAttribute(name = "BaugenehmigungVorhanden")
    protected Boolean baugenehmigungVorhanden;
    @XmlAttribute(name = "AbrissErforderlich")
    protected Boolean abrissErforderlich;
    @XmlAttribute(name = "GRZ")
    @XmlJavaTypeAdapter(Adapter28 .class)
    protected Double grz;
    @XmlAttribute(name = "GFZ")
    @XmlJavaTypeAdapter(Adapter28 .class)
    protected Double gfz;
    @XmlAttribute(name = "Erschliessungszustand")
    protected ErschliessungszustandTyp erschliessungszustand;
    @XmlAttribute(name = "KurzfristigBebaubar")
    protected Boolean kurzfristigBebaubar;
    @XmlAttribute(name = "FreiAb")
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String freiAb;

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
     * Gets the value of the teilbarAb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTeilbarAb() {
        return teilbarAb;
    }

    /**
     * Sets the value of the teilbarAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeilbarAb(Long value) {
        this.teilbarAb = value;
    }

    /**
     * Gets the value of the bebaubarNach property.
     * 
     * @return
     *     possible object is
     *     {@link BebaubarNachTyp }
     *     
     */
    public BebaubarNachTyp getBebaubarNach() {
        return bebaubarNach;
    }

    /**
     * Sets the value of the bebaubarNach property.
     * 
     * @param value
     *     allowed object is
     *     {@link BebaubarNachTyp }
     *     
     */
    public void setBebaubarNach(BebaubarNachTyp value) {
        this.bebaubarNach = value;
    }

    /**
     * Gets the value of the baugenehmigungVorhanden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBaugenehmigungVorhanden() {
        return baugenehmigungVorhanden;
    }

    /**
     * Sets the value of the baugenehmigungVorhanden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBaugenehmigungVorhanden(Boolean value) {
        this.baugenehmigungVorhanden = value;
    }

    /**
     * Gets the value of the abrissErforderlich property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAbrissErforderlich() {
        return abrissErforderlich;
    }

    /**
     * Sets the value of the abrissErforderlich property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbrissErforderlich(Boolean value) {
        this.abrissErforderlich = value;
    }

    /**
     * Gets the value of the grz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getGRZ() {
        return grz;
    }

    /**
     * Sets the value of the grz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRZ(Double value) {
        this.grz = value;
    }

    /**
     * Gets the value of the gfz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getGFZ() {
        return gfz;
    }

    /**
     * Sets the value of the gfz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGFZ(Double value) {
        this.gfz = value;
    }

    /**
     * Gets the value of the erschliessungszustand property.
     * 
     * @return
     *     possible object is
     *     {@link ErschliessungszustandTyp }
     *     
     */
    public ErschliessungszustandTyp getErschliessungszustand() {
        return erschliessungszustand;
    }

    /**
     * Sets the value of the erschliessungszustand property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErschliessungszustandTyp }
     *     
     */
    public void setErschliessungszustand(ErschliessungszustandTyp value) {
        this.erschliessungszustand = value;
    }

    /**
     * Gets the value of the kurzfristigBebaubar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKurzfristigBebaubar() {
        return kurzfristigBebaubar;
    }

    /**
     * Sets the value of the kurzfristigBebaubar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKurzfristigBebaubar(Boolean value) {
        this.kurzfristigBebaubar = value;
    }

    /**
     * Gets the value of the freiAb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreiAb() {
        return freiAb;
    }

    /**
     * Sets the value of the freiAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreiAb(String value) {
        this.freiAb = value;
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
            Double theGrundstuecksFlaeche;
            theGrundstuecksFlaeche = this.getGrundstuecksFlaeche();
            strategy.appendField(locator, this, "grundstuecksFlaeche", buffer, theGrundstuecksFlaeche);
        }
        {
            Long theTeilbarAb;
            theTeilbarAb = this.getTeilbarAb();
            strategy.appendField(locator, this, "teilbarAb", buffer, theTeilbarAb);
        }
        {
            BebaubarNachTyp theBebaubarNach;
            theBebaubarNach = this.getBebaubarNach();
            strategy.appendField(locator, this, "bebaubarNach", buffer, theBebaubarNach);
        }
        {
            Boolean theBaugenehmigungVorhanden;
            theBaugenehmigungVorhanden = this.isBaugenehmigungVorhanden();
            strategy.appendField(locator, this, "baugenehmigungVorhanden", buffer, theBaugenehmigungVorhanden);
        }
        {
            Boolean theAbrissErforderlich;
            theAbrissErforderlich = this.isAbrissErforderlich();
            strategy.appendField(locator, this, "abrissErforderlich", buffer, theAbrissErforderlich);
        }
        {
            Double theGRZ;
            theGRZ = this.getGRZ();
            strategy.appendField(locator, this, "grz", buffer, theGRZ);
        }
        {
            Double theGFZ;
            theGFZ = this.getGFZ();
            strategy.appendField(locator, this, "gfz", buffer, theGFZ);
        }
        {
            ErschliessungszustandTyp theErschliessungszustand;
            theErschliessungszustand = this.getErschliessungszustand();
            strategy.appendField(locator, this, "erschliessungszustand", buffer, theErschliessungszustand);
        }
        {
            Boolean theKurzfristigBebaubar;
            theKurzfristigBebaubar = this.isKurzfristigBebaubar();
            strategy.appendField(locator, this, "kurzfristigBebaubar", buffer, theKurzfristigBebaubar);
        }
        {
            String theFreiAb;
            theFreiAb = this.getFreiAb();
            strategy.appendField(locator, this, "freiAb", buffer, theFreiAb);
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof GrundstueckTypBase) {
            final GrundstueckTypBase copy = ((GrundstueckTypBase) target);
            if (this.grundstuecksFlaeche!= null) {
                Double sourceGrundstuecksFlaeche;
                sourceGrundstuecksFlaeche = this.getGrundstuecksFlaeche();
                Double copyGrundstuecksFlaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "grundstuecksFlaeche", sourceGrundstuecksFlaeche), sourceGrundstuecksFlaeche));
                copy.setGrundstuecksFlaeche(copyGrundstuecksFlaeche);
            } else {
                copy.grundstuecksFlaeche = null;
            }
            if (this.teilbarAb!= null) {
                Long sourceTeilbarAb;
                sourceTeilbarAb = this.getTeilbarAb();
                Long copyTeilbarAb = ((Long) strategy.copy(LocatorUtils.property(locator, "teilbarAb", sourceTeilbarAb), sourceTeilbarAb));
                copy.setTeilbarAb(copyTeilbarAb);
            } else {
                copy.teilbarAb = null;
            }
            if (this.bebaubarNach!= null) {
                BebaubarNachTyp sourceBebaubarNach;
                sourceBebaubarNach = this.getBebaubarNach();
                BebaubarNachTyp copyBebaubarNach = ((BebaubarNachTyp) strategy.copy(LocatorUtils.property(locator, "bebaubarNach", sourceBebaubarNach), sourceBebaubarNach));
                copy.setBebaubarNach(copyBebaubarNach);
            } else {
                copy.bebaubarNach = null;
            }
            if (this.baugenehmigungVorhanden!= null) {
                Boolean sourceBaugenehmigungVorhanden;
                sourceBaugenehmigungVorhanden = this.isBaugenehmigungVorhanden();
                Boolean copyBaugenehmigungVorhanden = ((Boolean) strategy.copy(LocatorUtils.property(locator, "baugenehmigungVorhanden", sourceBaugenehmigungVorhanden), sourceBaugenehmigungVorhanden));
                copy.setBaugenehmigungVorhanden(copyBaugenehmigungVorhanden);
            } else {
                copy.baugenehmigungVorhanden = null;
            }
            if (this.abrissErforderlich!= null) {
                Boolean sourceAbrissErforderlich;
                sourceAbrissErforderlich = this.isAbrissErforderlich();
                Boolean copyAbrissErforderlich = ((Boolean) strategy.copy(LocatorUtils.property(locator, "abrissErforderlich", sourceAbrissErforderlich), sourceAbrissErforderlich));
                copy.setAbrissErforderlich(copyAbrissErforderlich);
            } else {
                copy.abrissErforderlich = null;
            }
            if (this.grz!= null) {
                Double sourceGRZ;
                sourceGRZ = this.getGRZ();
                Double copyGRZ = ((Double) strategy.copy(LocatorUtils.property(locator, "grz", sourceGRZ), sourceGRZ));
                copy.setGRZ(copyGRZ);
            } else {
                copy.grz = null;
            }
            if (this.gfz!= null) {
                Double sourceGFZ;
                sourceGFZ = this.getGFZ();
                Double copyGFZ = ((Double) strategy.copy(LocatorUtils.property(locator, "gfz", sourceGFZ), sourceGFZ));
                copy.setGFZ(copyGFZ);
            } else {
                copy.gfz = null;
            }
            if (this.erschliessungszustand!= null) {
                ErschliessungszustandTyp sourceErschliessungszustand;
                sourceErschliessungszustand = this.getErschliessungszustand();
                ErschliessungszustandTyp copyErschliessungszustand = ((ErschliessungszustandTyp) strategy.copy(LocatorUtils.property(locator, "erschliessungszustand", sourceErschliessungszustand), sourceErschliessungszustand));
                copy.setErschliessungszustand(copyErschliessungszustand);
            } else {
                copy.erschliessungszustand = null;
            }
            if (this.kurzfristigBebaubar!= null) {
                Boolean sourceKurzfristigBebaubar;
                sourceKurzfristigBebaubar = this.isKurzfristigBebaubar();
                Boolean copyKurzfristigBebaubar = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kurzfristigBebaubar", sourceKurzfristigBebaubar), sourceKurzfristigBebaubar));
                copy.setKurzfristigBebaubar(copyKurzfristigBebaubar);
            } else {
                copy.kurzfristigBebaubar = null;
            }
            if (this.freiAb!= null) {
                String sourceFreiAb;
                sourceFreiAb = this.getFreiAb();
                String copyFreiAb = ((String) strategy.copy(LocatorUtils.property(locator, "freiAb", sourceFreiAb), sourceFreiAb));
                copy.setFreiAb(copyFreiAb);
            } else {
                copy.freiAb = null;
            }
        }
        return target;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GrundstueckTypBase)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GrundstueckTypBase that = ((GrundstueckTypBase) object);
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
            Long lhsTeilbarAb;
            lhsTeilbarAb = this.getTeilbarAb();
            Long rhsTeilbarAb;
            rhsTeilbarAb = that.getTeilbarAb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teilbarAb", lhsTeilbarAb), LocatorUtils.property(thatLocator, "teilbarAb", rhsTeilbarAb), lhsTeilbarAb, rhsTeilbarAb)) {
                return false;
            }
        }
        {
            BebaubarNachTyp lhsBebaubarNach;
            lhsBebaubarNach = this.getBebaubarNach();
            BebaubarNachTyp rhsBebaubarNach;
            rhsBebaubarNach = that.getBebaubarNach();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bebaubarNach", lhsBebaubarNach), LocatorUtils.property(thatLocator, "bebaubarNach", rhsBebaubarNach), lhsBebaubarNach, rhsBebaubarNach)) {
                return false;
            }
        }
        {
            Boolean lhsBaugenehmigungVorhanden;
            lhsBaugenehmigungVorhanden = this.isBaugenehmigungVorhanden();
            Boolean rhsBaugenehmigungVorhanden;
            rhsBaugenehmigungVorhanden = that.isBaugenehmigungVorhanden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baugenehmigungVorhanden", lhsBaugenehmigungVorhanden), LocatorUtils.property(thatLocator, "baugenehmigungVorhanden", rhsBaugenehmigungVorhanden), lhsBaugenehmigungVorhanden, rhsBaugenehmigungVorhanden)) {
                return false;
            }
        }
        {
            Boolean lhsAbrissErforderlich;
            lhsAbrissErforderlich = this.isAbrissErforderlich();
            Boolean rhsAbrissErforderlich;
            rhsAbrissErforderlich = that.isAbrissErforderlich();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abrissErforderlich", lhsAbrissErforderlich), LocatorUtils.property(thatLocator, "abrissErforderlich", rhsAbrissErforderlich), lhsAbrissErforderlich, rhsAbrissErforderlich)) {
                return false;
            }
        }
        {
            Double lhsGRZ;
            lhsGRZ = this.getGRZ();
            Double rhsGRZ;
            rhsGRZ = that.getGRZ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grz", lhsGRZ), LocatorUtils.property(thatLocator, "grz", rhsGRZ), lhsGRZ, rhsGRZ)) {
                return false;
            }
        }
        {
            Double lhsGFZ;
            lhsGFZ = this.getGFZ();
            Double rhsGFZ;
            rhsGFZ = that.getGFZ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gfz", lhsGFZ), LocatorUtils.property(thatLocator, "gfz", rhsGFZ), lhsGFZ, rhsGFZ)) {
                return false;
            }
        }
        {
            ErschliessungszustandTyp lhsErschliessungszustand;
            lhsErschliessungszustand = this.getErschliessungszustand();
            ErschliessungszustandTyp rhsErschliessungszustand;
            rhsErschliessungszustand = that.getErschliessungszustand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erschliessungszustand", lhsErschliessungszustand), LocatorUtils.property(thatLocator, "erschliessungszustand", rhsErschliessungszustand), lhsErschliessungszustand, rhsErschliessungszustand)) {
                return false;
            }
        }
        {
            Boolean lhsKurzfristigBebaubar;
            lhsKurzfristigBebaubar = this.isKurzfristigBebaubar();
            Boolean rhsKurzfristigBebaubar;
            rhsKurzfristigBebaubar = that.isKurzfristigBebaubar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kurzfristigBebaubar", lhsKurzfristigBebaubar), LocatorUtils.property(thatLocator, "kurzfristigBebaubar", rhsKurzfristigBebaubar), lhsKurzfristigBebaubar, rhsKurzfristigBebaubar)) {
                return false;
            }
        }
        {
            String lhsFreiAb;
            lhsFreiAb = this.getFreiAb();
            String rhsFreiAb;
            rhsFreiAb = that.getFreiAb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freiAb", lhsFreiAb), LocatorUtils.property(thatLocator, "freiAb", rhsFreiAb), lhsFreiAb, rhsFreiAb)) {
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
