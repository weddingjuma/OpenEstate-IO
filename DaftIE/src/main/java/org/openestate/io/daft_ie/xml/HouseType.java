
package org.openestate.io.daft_ie.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for houseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="houseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="detached"/>
 *     &lt;enumeration value="semi-detached"/>
 *     &lt;enumeration value="terraced"/>
 *     &lt;enumeration value="end-of-terrace"/>
 *     &lt;enumeration value="townhouse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "houseType")
@XmlEnum
public enum HouseType {

    @XmlEnumValue("detached")
    DETACHED("detached"),
    @XmlEnumValue("semi-detached")
    SEMI_DETACHED("semi-detached"),
    @XmlEnumValue("terraced")
    TERRACED("terraced"),
    @XmlEnumValue("end-of-terrace")
    END_OF_TERRACE("end-of-terrace"),
    @XmlEnumValue("townhouse")
    TOWNHOUSE("townhouse");
    private final String value;

    HouseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HouseType fromValue(String v) {
        for (HouseType c: HouseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
