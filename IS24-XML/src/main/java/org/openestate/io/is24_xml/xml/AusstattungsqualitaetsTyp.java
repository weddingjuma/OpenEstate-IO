
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AusstattungsqualitaetsTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AusstattungsqualitaetsTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KeineAngabe"/>
 *     &lt;enumeration value="Luxus"/>
 *     &lt;enumeration value="Gehoben"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Einfach"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AusstattungsqualitaetsTyp")
@XmlEnum
public enum AusstattungsqualitaetsTyp {

    @XmlEnumValue("KeineAngabe")
    KEINE_ANGABE("KeineAngabe"),
    @XmlEnumValue("Luxus")
    LUXUS("Luxus"),
    @XmlEnumValue("Gehoben")
    GEHOBEN("Gehoben"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Einfach")
    EINFACH("Einfach");
    private final String value;

    AusstattungsqualitaetsTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AusstattungsqualitaetsTyp fromValue(String v) {
        for (AusstattungsqualitaetsTyp c: AusstattungsqualitaetsTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
