
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
import org.openestate.io.immobiliare_it.xml.types.Category;


/**
 * <p>Java class for building complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="building"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="status" type="{http://feed.immobiliare.it}status"/&gt;
 *         &lt;element name="terrains" type="{http://feed.immobiliare.it}terrains" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{http://feed.immobiliare.it}class" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="category" type="{http://feed.immobiliare.it}cat" /&gt;
 *       &lt;attribute name="type" type="{http://feed.immobiliare.it}allPropertyTypeSimple" /&gt;
 *       &lt;attribute name="detail" type="{http://feed.immobiliare.it}PropertyTypeBusiness" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "building", propOrder = {

})
public class Building
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Status status;
    protected Terrains terrains;
    @XmlElement(name = "class")
    @XmlSchemaType(name = "string")
    protected Clazz clazz;
    @XmlAttribute(name = "category")
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected Category category;
    @XmlAttribute(name = "type")
    protected PropertyType type;
    @XmlAttribute(name = "detail")
    protected PropertyTypeBusiness detail;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the terrains property.
     * 
     * @return
     *     possible object is
     *     {@link Terrains }
     *     
     */
    public Terrains getTerrains() {
        return terrains;
    }

    /**
     * Sets the value of the terrains property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terrains }
     *     
     */
    public void setTerrains(Terrains value) {
        this.terrains = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link Clazz }
     *     
     */
    public Clazz getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Clazz }
     *     
     */
    public void setClazz(Clazz value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(Category value) {
        this.category = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyType }
     *     
     */
    public PropertyType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType }
     *     
     */
    public void setType(PropertyType value) {
        this.type = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyTypeBusiness }
     *     
     */
    public PropertyTypeBusiness getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyTypeBusiness }
     *     
     */
    public void setDetail(PropertyTypeBusiness value) {
        this.detail = value;
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
            Status theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            Terrains theTerrains;
            theTerrains = this.getTerrains();
            strategy.appendField(locator, this, "terrains", buffer, theTerrains);
        }
        {
            Clazz theClazz;
            theClazz = this.getClazz();
            strategy.appendField(locator, this, "clazz", buffer, theClazz);
        }
        {
            Category theCategory;
            theCategory = this.getCategory();
            strategy.appendField(locator, this, "category", buffer, theCategory);
        }
        {
            PropertyType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            PropertyTypeBusiness theDetail;
            theDetail = this.getDetail();
            strategy.appendField(locator, this, "detail", buffer, theDetail);
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
        if (draftCopy instanceof Building) {
            final Building copy = ((Building) draftCopy);
            if (this.status!= null) {
                Status sourceStatus;
                sourceStatus = this.getStatus();
                Status copyStatus = ((Status) strategy.copy(LocatorUtils.property(locator, "status", sourceStatus), sourceStatus));
                copy.setStatus(copyStatus);
            } else {
                copy.status = null;
            }
            if (this.terrains!= null) {
                Terrains sourceTerrains;
                sourceTerrains = this.getTerrains();
                Terrains copyTerrains = ((Terrains) strategy.copy(LocatorUtils.property(locator, "terrains", sourceTerrains), sourceTerrains));
                copy.setTerrains(copyTerrains);
            } else {
                copy.terrains = null;
            }
            if (this.clazz!= null) {
                Clazz sourceClazz;
                sourceClazz = this.getClazz();
                Clazz copyClazz = ((Clazz) strategy.copy(LocatorUtils.property(locator, "clazz", sourceClazz), sourceClazz));
                copy.setClazz(copyClazz);
            } else {
                copy.clazz = null;
            }
            if (this.category!= null) {
                Category sourceCategory;
                sourceCategory = this.getCategory();
                Category copyCategory = ((Category) strategy.copy(LocatorUtils.property(locator, "category", sourceCategory), sourceCategory));
                copy.setCategory(copyCategory);
            } else {
                copy.category = null;
            }
            if (this.type!= null) {
                PropertyType sourceType;
                sourceType = this.getType();
                PropertyType copyType = ((PropertyType) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType));
                copy.setType(copyType);
            } else {
                copy.type = null;
            }
            if (this.detail!= null) {
                PropertyTypeBusiness sourceDetail;
                sourceDetail = this.getDetail();
                PropertyTypeBusiness copyDetail = ((PropertyTypeBusiness) strategy.copy(LocatorUtils.property(locator, "detail", sourceDetail), sourceDetail));
                copy.setDetail(copyDetail);
            } else {
                copy.detail = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Building();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Building)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Building that = ((Building) object);
        {
            Status lhsStatus;
            lhsStatus = this.getStatus();
            Status rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            Terrains lhsTerrains;
            lhsTerrains = this.getTerrains();
            Terrains rhsTerrains;
            rhsTerrains = that.getTerrains();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "terrains", lhsTerrains), LocatorUtils.property(thatLocator, "terrains", rhsTerrains), lhsTerrains, rhsTerrains)) {
                return false;
            }
        }
        {
            Clazz lhsClazz;
            lhsClazz = this.getClazz();
            Clazz rhsClazz;
            rhsClazz = that.getClazz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clazz", lhsClazz), LocatorUtils.property(thatLocator, "clazz", rhsClazz), lhsClazz, rhsClazz)) {
                return false;
            }
        }
        {
            Category lhsCategory;
            lhsCategory = this.getCategory();
            Category rhsCategory;
            rhsCategory = that.getCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "category", lhsCategory), LocatorUtils.property(thatLocator, "category", rhsCategory), lhsCategory, rhsCategory)) {
                return false;
            }
        }
        {
            PropertyType lhsType;
            lhsType = this.getType();
            PropertyType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            PropertyTypeBusiness lhsDetail;
            lhsDetail = this.getDetail();
            PropertyTypeBusiness rhsDetail;
            rhsDetail = that.getDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "detail", lhsDetail), LocatorUtils.property(thatLocator, "detail", rhsDetail), lhsDetail, rhsDetail)) {
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
