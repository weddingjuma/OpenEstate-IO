//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.20 at 02:13:55 AM CET 
//


package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.trovit.xml.types.Unit;

public class Adapter4
    extends XmlAdapter<String, Unit>
{


    public Unit unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseUnit(value));
    }

    public String marshal(Unit value) {
        return (org.openestate.io.trovit.TrovitUtils.printUnit(value));
    }

}
