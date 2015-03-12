
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyTypeBusiness.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PropertyTypeBusiness">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Centro commerciale"/>
 *     &lt;enumeration value="Azienda agricola"/>
 *     &lt;enumeration value="Ristorante"/>
 *     &lt;enumeration value="Bar"/>
 *     &lt;enumeration value="Pizzeria"/>
 *     &lt;enumeration value="Pizza Al Taglio"/>
 *     &lt;enumeration value="Pub"/>
 *     &lt;enumeration value="Alimentari"/>
 *     &lt;enumeration value="Rosticceria"/>
 *     &lt;enumeration value="Pasticceria"/>
 *     &lt;enumeration value="Discoteca"/>
 *     &lt;enumeration value="Hotel"/>
 *     &lt;enumeration value="Bed and Breakfast"/>
 *     &lt;enumeration value="Pensione"/>
 *     &lt;enumeration value="Gelateria"/>
 *     &lt;enumeration value="Panetteria"/>
 *     &lt;enumeration value="Altro | Alimentare"/>
 *     &lt;enumeration value="Negozio"/>
 *     &lt;enumeration value="Ferramenta"/>
 *     &lt;enumeration value="Casalinghi"/>
 *     &lt;enumeration value="Palestra"/>
 *     &lt;enumeration value="Abbigliamento"/>
 *     &lt;enumeration value="Estetica / Solarium"/>
 *     &lt;enumeration value="Parrucchiere uomo/donna"/>
 *     &lt;enumeration value="Auto officina"/>
 *     &lt;enumeration value="Videonoleggio"/>
 *     &lt;enumeration value="Tabaccheria"/>
 *     &lt;enumeration value="Tintoria"/>
 *     &lt;enumeration value="Lavanderia"/>
 *     &lt;enumeration value="Cartoleria"/>
 *     &lt;enumeration value="Libreria"/>
 *     &lt;enumeration value="Informatica"/>
 *     &lt;enumeration value="Telefonia"/>
 *     &lt;enumeration value="Edicola"/>
 *     &lt;enumeration value="Altro | Non alimentare"/>
 *     &lt;enumeration value="Giochi"/>
 *     &lt;enumeration value="Scommesse"/>
 *     &lt;enumeration value="Residenziale"/>
 *     &lt;enumeration value="Commerciale"/>
 *     &lt;enumeration value="Industriale"/>
 *     &lt;enumeration value="Agricolo"/>
 *     &lt;enumeration value="Capannone"/>
 *     &lt;enumeration value="Garage"/>
 *     &lt;enumeration value="Negozio"/>
 *     &lt;enumeration value="Ufficio"/>
 *     &lt;enumeration value="Stabile"/>
 *     &lt;enumeration value="Capannone Industriale"/>
 *     &lt;enumeration value="Casa di cura"/>
 *     &lt;enumeration value="Magazzino"/>
 *     &lt;enumeration value="Showroom"/>
 *     &lt;enumeration value="Scuderia"/>
 *     &lt;enumeration value="Stabilimento Balneare"/>
 *     &lt;enumeration value="Laboratorio"/>
 *     &lt;enumeration value="Albergo"/>
 *     &lt;enumeration value="Altro"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PropertyTypeBusiness")
@XmlEnum
public enum PropertyTypeBusiness {

    @XmlEnumValue("Centro commerciale")
    CENTRO_COMMERCIALE("Centro commerciale"),
    @XmlEnumValue("Azienda agricola")
    AZIENDA_AGRICOLA("Azienda agricola"),
    @XmlEnumValue("Ristorante")
    RISTORANTE("Ristorante"),
    @XmlEnumValue("Bar")
    BAR("Bar"),
    @XmlEnumValue("Pizzeria")
    PIZZERIA("Pizzeria"),
    @XmlEnumValue("Pizza Al Taglio")
    PIZZA_AL_TAGLIO("Pizza Al Taglio"),
    @XmlEnumValue("Pub")
    PUB("Pub"),
    @XmlEnumValue("Alimentari")
    ALIMENTARI("Alimentari"),
    @XmlEnumValue("Rosticceria")
    ROSTICCERIA("Rosticceria"),
    @XmlEnumValue("Pasticceria")
    PASTICCERIA("Pasticceria"),
    @XmlEnumValue("Discoteca")
    DISCOTECA("Discoteca"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Bed and Breakfast")
    BED_AND_BREAKFAST("Bed and Breakfast"),
    @XmlEnumValue("Pensione")
    PENSIONE("Pensione"),
    @XmlEnumValue("Gelateria")
    GELATERIA("Gelateria"),
    @XmlEnumValue("Panetteria")
    PANETTERIA("Panetteria"),
    @XmlEnumValue("Altro | Alimentare")
    ALTRO_ALIMENTARE("Altro | Alimentare"),
    @XmlEnumValue("Negozio")
    NEGOZIO("Negozio"),
    @XmlEnumValue("Ferramenta")
    FERRAMENTA("Ferramenta"),
    @XmlEnumValue("Casalinghi")
    CASALINGHI("Casalinghi"),
    @XmlEnumValue("Palestra")
    PALESTRA("Palestra"),
    @XmlEnumValue("Abbigliamento")
    ABBIGLIAMENTO("Abbigliamento"),
    @XmlEnumValue("Estetica / Solarium")
    ESTETICA_SOLARIUM("Estetica / Solarium"),
    @XmlEnumValue("Parrucchiere uomo/donna")
    PARRUCCHIERE_UOMO_DONNA("Parrucchiere uomo/donna"),
    @XmlEnumValue("Auto officina")
    AUTO_OFFICINA("Auto officina"),
    @XmlEnumValue("Videonoleggio")
    VIDEONOLEGGIO("Videonoleggio"),
    @XmlEnumValue("Tabaccheria")
    TABACCHERIA("Tabaccheria"),
    @XmlEnumValue("Tintoria")
    TINTORIA("Tintoria"),
    @XmlEnumValue("Lavanderia")
    LAVANDERIA("Lavanderia"),
    @XmlEnumValue("Cartoleria")
    CARTOLERIA("Cartoleria"),
    @XmlEnumValue("Libreria")
    LIBRERIA("Libreria"),
    @XmlEnumValue("Informatica")
    INFORMATICA("Informatica"),
    @XmlEnumValue("Telefonia")
    TELEFONIA("Telefonia"),
    @XmlEnumValue("Edicola")
    EDICOLA("Edicola"),
    @XmlEnumValue("Altro | Non alimentare")
    ALTRO_NON_ALIMENTARE("Altro | Non alimentare"),
    @XmlEnumValue("Giochi")
    GIOCHI("Giochi"),
    @XmlEnumValue("Scommesse")
    SCOMMESSE("Scommesse"),
    @XmlEnumValue("Residenziale")
    RESIDENZIALE("Residenziale"),
    @XmlEnumValue("Commerciale")
    COMMERCIALE("Commerciale"),
    @XmlEnumValue("Industriale")
    INDUSTRIALE("Industriale"),
    @XmlEnumValue("Agricolo")
    AGRICOLO("Agricolo"),
    @XmlEnumValue("Capannone")
    CAPANNONE("Capannone"),
    @XmlEnumValue("Garage")
    GARAGE("Garage"),
    @XmlEnumValue("Ufficio")
    UFFICIO("Ufficio"),
    @XmlEnumValue("Stabile")
    STABILE("Stabile"),
    @XmlEnumValue("Capannone Industriale")
    CAPANNONE_INDUSTRIALE("Capannone Industriale"),
    @XmlEnumValue("Casa di cura")
    CASA_DI_CURA("Casa di cura"),
    @XmlEnumValue("Magazzino")
    MAGAZZINO("Magazzino"),
    @XmlEnumValue("Showroom")
    SHOWROOM("Showroom"),
    @XmlEnumValue("Scuderia")
    SCUDERIA("Scuderia"),
    @XmlEnumValue("Stabilimento Balneare")
    STABILIMENTO_BALNEARE("Stabilimento Balneare"),
    @XmlEnumValue("Laboratorio")
    LABORATORIO("Laboratorio"),
    @XmlEnumValue("Albergo")
    ALBERGO("Albergo"),
    @XmlEnumValue("Altro")
    ALTRO("Altro");
    private final String value;

    PropertyTypeBusiness(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyTypeBusiness fromValue(String v) {
        for (PropertyTypeBusiness c: PropertyTypeBusiness.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
