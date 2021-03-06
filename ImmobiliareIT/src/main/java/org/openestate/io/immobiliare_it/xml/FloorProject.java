
package org.openestate.io.immobiliare_it.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for floorProject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="floorProject"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
 *       &lt;attribute name="type"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Intermedio"/&gt;
 *             &lt;enumeration value="Interrato"/&gt;
 *             &lt;enumeration value="Seminterrato"/&gt;
 *             &lt;enumeration value="PianoTerra"/&gt;
 *             &lt;enumeration value="Rialzato"/&gt;
 *             &lt;enumeration value="PianoNobile"/&gt;
 *             &lt;enumeration value="Multipiano su pi\u00f9 livelli"/&gt;
 *             &lt;enumeration value="Ultimo"/&gt;
 *             &lt;enumeration value="Attico"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "floorProject", propOrder = {
    "value"
})
public class FloorProject implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected BigInteger value;
    @XmlAttribute(name = "type")
    protected FloorProject.FloorProjectType type;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FloorProject.FloorProjectType }
     *     
     */
    public FloorProject.FloorProjectType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloorProject.FloorProjectType }
     *     
     */
    public void setType(FloorProject.FloorProjectType value) {
        this.type = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            BigInteger theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            FloorProject.FloorProjectType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof FloorProject) {
            final FloorProject copy = ((FloorProject) draftCopy);
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceValue;
                    sourceValue = this.getValue();
                    BigInteger copyValue = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                    copy.setValue(copyValue);
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
            {
                Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                    FloorProject.FloorProjectType sourceType;
                    sourceType = this.getType();
                    FloorProject.FloorProjectType copyType = ((FloorProject.FloorProjectType) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType, (this.type!= null)));
                    copy.setType(copyType);
                } else {
                    if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.type = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FloorProject();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FloorProject that = ((FloorProject) object);
        {
            BigInteger lhsValue;
            lhsValue = this.getValue();
            BigInteger rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                return false;
            }
        }
        {
            FloorProject.FloorProjectType lhsType;
            lhsType = this.getType();
            FloorProject.FloorProjectType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="Intermedio"/&gt;
     *     &lt;enumeration value="Interrato"/&gt;
     *     &lt;enumeration value="Seminterrato"/&gt;
     *     &lt;enumeration value="PianoTerra"/&gt;
     *     &lt;enumeration value="Rialzato"/&gt;
     *     &lt;enumeration value="PianoNobile"/&gt;
     *     &lt;enumeration value="Multipiano su pi\u00f9 livelli"/&gt;
     *     &lt;enumeration value="Ultimo"/&gt;
     *     &lt;enumeration value="Attico"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum FloorProjectType {

        @XmlEnumValue("Intermedio")
        INTERMEDIO("Intermedio"),
        @XmlEnumValue("Interrato")
        INTERRATO("Interrato"),
        @XmlEnumValue("Seminterrato")
        SEMINTERRATO("Seminterrato"),
        @XmlEnumValue("PianoTerra")
        PIANO_TERRA("PianoTerra"),
        @XmlEnumValue("Rialzato")
        RIALZATO("Rialzato"),
        @XmlEnumValue("PianoNobile")
        PIANO_NOBILE("PianoNobile"),
        @XmlEnumValue("Multipiano su pi\u00f9 livelli")
        MULTIPIANO_SU_PI\u00d9_LIVELLI("Multipiano su pi\u00f9 livelli"),
        @XmlEnumValue("Ultimo")
        ULTIMO("Ultimo"),
        @XmlEnumValue("Attico")
        ATTICO("Attico");
        private final String value;

        FloorProjectType(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static FloorProject.FloorProjectType fromValue(String v) {
            for (FloorProject.FloorProjectType c: FloorProject.FloorProjectType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
