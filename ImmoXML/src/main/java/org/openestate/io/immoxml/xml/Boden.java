
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
 * Java class for &lt;boden&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "boden")
public class Boden
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "FLIESEN")
    protected Boolean fliesen;
    @XmlAttribute(name = "STEIN")
    protected Boolean stein;
    @XmlAttribute(name = "TEPPICH")
    protected Boolean teppich;
    @XmlAttribute(name = "PARKETT")
    protected Boolean parkett;
    @XmlAttribute(name = "DIELEN")
    protected Boolean dielen;
    @XmlAttribute(name = "KUNSTSTOFF")
    protected Boolean kunststoff;
    @XmlAttribute(name = "ESTRICH")
    protected Boolean estrich;
    @XmlAttribute(name = "DOPPELBODEN")
    protected Boolean doppelboden;

    /**
     * Gets the value of the fliesen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFLIESEN() {
        return fliesen;
    }

    /**
     * Sets the value of the fliesen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFLIESEN(Boolean value) {
        this.fliesen = value;
    }

    /**
     * Gets the value of the stein property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSTEIN() {
        return stein;
    }

    /**
     * Sets the value of the stein property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSTEIN(Boolean value) {
        this.stein = value;
    }

    /**
     * Gets the value of the teppich property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTEPPICH() {
        return teppich;
    }

    /**
     * Sets the value of the teppich property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTEPPICH(Boolean value) {
        this.teppich = value;
    }

    /**
     * Gets the value of the parkett property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPARKETT() {
        return parkett;
    }

    /**
     * Sets the value of the parkett property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPARKETT(Boolean value) {
        this.parkett = value;
    }

    /**
     * Gets the value of the dielen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDIELEN() {
        return dielen;
    }

    /**
     * Sets the value of the dielen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDIELEN(Boolean value) {
        this.dielen = value;
    }

    /**
     * Gets the value of the kunststoff property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKUNSTSTOFF() {
        return kunststoff;
    }

    /**
     * Sets the value of the kunststoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKUNSTSTOFF(Boolean value) {
        this.kunststoff = value;
    }

    /**
     * Gets the value of the estrich property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isESTRICH() {
        return estrich;
    }

    /**
     * Sets the value of the estrich property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setESTRICH(Boolean value) {
        this.estrich = value;
    }

    /**
     * Gets the value of the doppelboden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDOPPELBODEN() {
        return doppelboden;
    }

    /**
     * Sets the value of the doppelboden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDOPPELBODEN(Boolean value) {
        this.doppelboden = value;
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
            Boolean theFLIESEN;
            theFLIESEN = this.isFLIESEN();
            strategy.appendField(locator, this, "fliesen", buffer, theFLIESEN);
        }
        {
            Boolean theSTEIN;
            theSTEIN = this.isSTEIN();
            strategy.appendField(locator, this, "stein", buffer, theSTEIN);
        }
        {
            Boolean theTEPPICH;
            theTEPPICH = this.isTEPPICH();
            strategy.appendField(locator, this, "teppich", buffer, theTEPPICH);
        }
        {
            Boolean thePARKETT;
            thePARKETT = this.isPARKETT();
            strategy.appendField(locator, this, "parkett", buffer, thePARKETT);
        }
        {
            Boolean theDIELEN;
            theDIELEN = this.isDIELEN();
            strategy.appendField(locator, this, "dielen", buffer, theDIELEN);
        }
        {
            Boolean theKUNSTSTOFF;
            theKUNSTSTOFF = this.isKUNSTSTOFF();
            strategy.appendField(locator, this, "kunststoff", buffer, theKUNSTSTOFF);
        }
        {
            Boolean theESTRICH;
            theESTRICH = this.isESTRICH();
            strategy.appendField(locator, this, "estrich", buffer, theESTRICH);
        }
        {
            Boolean theDOPPELBODEN;
            theDOPPELBODEN = this.isDOPPELBODEN();
            strategy.appendField(locator, this, "doppelboden", buffer, theDOPPELBODEN);
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
        if (draftCopy instanceof Boden) {
            final Boden copy = ((Boden) draftCopy);
            if (this.fliesen!= null) {
                Boolean sourceFLIESEN;
                sourceFLIESEN = this.isFLIESEN();
                Boolean copyFLIESEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "fliesen", sourceFLIESEN), sourceFLIESEN));
                copy.setFLIESEN(copyFLIESEN);
            } else {
                copy.fliesen = null;
            }
            if (this.stein!= null) {
                Boolean sourceSTEIN;
                sourceSTEIN = this.isSTEIN();
                Boolean copySTEIN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "stein", sourceSTEIN), sourceSTEIN));
                copy.setSTEIN(copySTEIN);
            } else {
                copy.stein = null;
            }
            if (this.teppich!= null) {
                Boolean sourceTEPPICH;
                sourceTEPPICH = this.isTEPPICH();
                Boolean copyTEPPICH = ((Boolean) strategy.copy(LocatorUtils.property(locator, "teppich", sourceTEPPICH), sourceTEPPICH));
                copy.setTEPPICH(copyTEPPICH);
            } else {
                copy.teppich = null;
            }
            if (this.parkett!= null) {
                Boolean sourcePARKETT;
                sourcePARKETT = this.isPARKETT();
                Boolean copyPARKETT = ((Boolean) strategy.copy(LocatorUtils.property(locator, "parkett", sourcePARKETT), sourcePARKETT));
                copy.setPARKETT(copyPARKETT);
            } else {
                copy.parkett = null;
            }
            if (this.dielen!= null) {
                Boolean sourceDIELEN;
                sourceDIELEN = this.isDIELEN();
                Boolean copyDIELEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "dielen", sourceDIELEN), sourceDIELEN));
                copy.setDIELEN(copyDIELEN);
            } else {
                copy.dielen = null;
            }
            if (this.kunststoff!= null) {
                Boolean sourceKUNSTSTOFF;
                sourceKUNSTSTOFF = this.isKUNSTSTOFF();
                Boolean copyKUNSTSTOFF = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kunststoff", sourceKUNSTSTOFF), sourceKUNSTSTOFF));
                copy.setKUNSTSTOFF(copyKUNSTSTOFF);
            } else {
                copy.kunststoff = null;
            }
            if (this.estrich!= null) {
                Boolean sourceESTRICH;
                sourceESTRICH = this.isESTRICH();
                Boolean copyESTRICH = ((Boolean) strategy.copy(LocatorUtils.property(locator, "estrich", sourceESTRICH), sourceESTRICH));
                copy.setESTRICH(copyESTRICH);
            } else {
                copy.estrich = null;
            }
            if (this.doppelboden!= null) {
                Boolean sourceDOPPELBODEN;
                sourceDOPPELBODEN = this.isDOPPELBODEN();
                Boolean copyDOPPELBODEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "doppelboden", sourceDOPPELBODEN), sourceDOPPELBODEN));
                copy.setDOPPELBODEN(copyDOPPELBODEN);
            } else {
                copy.doppelboden = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Boden();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Boden)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Boden that = ((Boden) object);
        {
            Boolean lhsFLIESEN;
            lhsFLIESEN = this.isFLIESEN();
            Boolean rhsFLIESEN;
            rhsFLIESEN = that.isFLIESEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fliesen", lhsFLIESEN), LocatorUtils.property(thatLocator, "fliesen", rhsFLIESEN), lhsFLIESEN, rhsFLIESEN)) {
                return false;
            }
        }
        {
            Boolean lhsSTEIN;
            lhsSTEIN = this.isSTEIN();
            Boolean rhsSTEIN;
            rhsSTEIN = that.isSTEIN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stein", lhsSTEIN), LocatorUtils.property(thatLocator, "stein", rhsSTEIN), lhsSTEIN, rhsSTEIN)) {
                return false;
            }
        }
        {
            Boolean lhsTEPPICH;
            lhsTEPPICH = this.isTEPPICH();
            Boolean rhsTEPPICH;
            rhsTEPPICH = that.isTEPPICH();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teppich", lhsTEPPICH), LocatorUtils.property(thatLocator, "teppich", rhsTEPPICH), lhsTEPPICH, rhsTEPPICH)) {
                return false;
            }
        }
        {
            Boolean lhsPARKETT;
            lhsPARKETT = this.isPARKETT();
            Boolean rhsPARKETT;
            rhsPARKETT = that.isPARKETT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkett", lhsPARKETT), LocatorUtils.property(thatLocator, "parkett", rhsPARKETT), lhsPARKETT, rhsPARKETT)) {
                return false;
            }
        }
        {
            Boolean lhsDIELEN;
            lhsDIELEN = this.isDIELEN();
            Boolean rhsDIELEN;
            rhsDIELEN = that.isDIELEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dielen", lhsDIELEN), LocatorUtils.property(thatLocator, "dielen", rhsDIELEN), lhsDIELEN, rhsDIELEN)) {
                return false;
            }
        }
        {
            Boolean lhsKUNSTSTOFF;
            lhsKUNSTSTOFF = this.isKUNSTSTOFF();
            Boolean rhsKUNSTSTOFF;
            rhsKUNSTSTOFF = that.isKUNSTSTOFF();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kunststoff", lhsKUNSTSTOFF), LocatorUtils.property(thatLocator, "kunststoff", rhsKUNSTSTOFF), lhsKUNSTSTOFF, rhsKUNSTSTOFF)) {
                return false;
            }
        }
        {
            Boolean lhsESTRICH;
            lhsESTRICH = this.isESTRICH();
            Boolean rhsESTRICH;
            rhsESTRICH = that.isESTRICH();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estrich", lhsESTRICH), LocatorUtils.property(thatLocator, "estrich", rhsESTRICH), lhsESTRICH, rhsESTRICH)) {
                return false;
            }
        }
        {
            Boolean lhsDOPPELBODEN;
            lhsDOPPELBODEN = this.isDOPPELBODEN();
            Boolean rhsDOPPELBODEN;
            rhsDOPPELBODEN = that.isDOPPELBODEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "doppelboden", lhsDOPPELBODEN), LocatorUtils.property(thatLocator, "doppelboden", rhsDOPPELBODEN), lhsDOPPELBODEN, rhsDOPPELBODEN)) {
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
