
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ISOBundeslaenderCodeTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ISOBundeslaenderCodeTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="5"/>
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="DE-BW"/>
 *     &lt;enumeration value="DE-BY"/>
 *     &lt;enumeration value="DE-BE"/>
 *     &lt;enumeration value="DE-BB"/>
 *     &lt;enumeration value="DE-HB"/>
 *     &lt;enumeration value="DE-HH"/>
 *     &lt;enumeration value="DE-HE"/>
 *     &lt;enumeration value="DE-MV"/>
 *     &lt;enumeration value="DE-NI"/>
 *     &lt;enumeration value="DE-NW"/>
 *     &lt;enumeration value="DE-RP"/>
 *     &lt;enumeration value="DE-SL"/>
 *     &lt;enumeration value="DE-SN"/>
 *     &lt;enumeration value="DE-ST"/>
 *     &lt;enumeration value="DE-SH"/>
 *     &lt;enumeration value="DE-TH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ISOBundeslaenderCodeTyp")
@XmlEnum
public enum ISOBundeslaenderCodeTyp {

    @XmlEnumValue("DE-BW")
    DE_BW("DE-BW"),
    @XmlEnumValue("DE-BY")
    DE_BY("DE-BY"),
    @XmlEnumValue("DE-BE")
    DE_BE("DE-BE"),
    @XmlEnumValue("DE-BB")
    DE_BB("DE-BB"),
    @XmlEnumValue("DE-HB")
    DE_HB("DE-HB"),
    @XmlEnumValue("DE-HH")
    DE_HH("DE-HH"),
    @XmlEnumValue("DE-HE")
    DE_HE("DE-HE"),
    @XmlEnumValue("DE-MV")
    DE_MV("DE-MV"),
    @XmlEnumValue("DE-NI")
    DE_NI("DE-NI"),
    @XmlEnumValue("DE-NW")
    DE_NW("DE-NW"),
    @XmlEnumValue("DE-RP")
    DE_RP("DE-RP"),
    @XmlEnumValue("DE-SL")
    DE_SL("DE-SL"),
    @XmlEnumValue("DE-SN")
    DE_SN("DE-SN"),
    @XmlEnumValue("DE-ST")
    DE_ST("DE-ST"),
    @XmlEnumValue("DE-SH")
    DE_SH("DE-SH"),
    @XmlEnumValue("DE-TH")
    DE_TH("DE-TH");
    private final String value;

    ISOBundeslaenderCodeTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ISOBundeslaenderCodeTyp fromValue(String v) {
        for (ISOBundeslaenderCodeTyp c: ISOBundeslaenderCodeTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
