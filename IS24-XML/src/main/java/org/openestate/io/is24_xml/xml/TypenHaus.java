
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.immobilienscout24.de/immobilientransfer}TypenHausTyp"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Kontaktperson" type="{http://www.immobilienscout24.de/immobilientransfer}KontaktAdresseTyp" minOccurs="0"/&gt;
 *           &lt;element name="ApiSuchfelder" type="{http://www.immobilienscout24.de/immobilientransfer}ApiSuchfelderTyp" minOccurs="0"/&gt;
 *           &lt;element name="MultimediaAnhang" type="{http://www.immobilienscout24.de/immobilientransfer}MultimediaAnhangTyp" maxOccurs="15" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Baureihe" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/&gt;
 *           &lt;element name="Haustypinfo" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/&gt;
 *           &lt;element name="Dachform" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/&gt;
 *           &lt;element name="WohnFlProGeschoss" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/&gt;
 *           &lt;element name="PreisProBauleistung" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class TypenHaus
    extends TypenHausTyp
    implements Cloneable, CopyTo, Equals, ToString
{


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
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TypenHaus();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TypenHaus)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
