
package org.openestate.io.daft_ie.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commercialType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="commercialType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="land"/>
 *     &lt;enumeration value="shop"/>
 *     &lt;enumeration value="hotel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "commercialType")
@XmlEnum
public enum CommercialType {

    @XmlEnumValue("land")
    LAND("land"),
    @XmlEnumValue("shop")
    SHOP("shop"),
    @XmlEnumValue("hotel")
    HOTEL("hotel");
    private final String value;

    CommercialType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommercialType fromValue(String v) {
        for (CommercialType c: CommercialType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
