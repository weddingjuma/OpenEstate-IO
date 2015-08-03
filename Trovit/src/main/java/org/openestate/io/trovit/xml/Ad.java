
package org.openestate.io.trovit.xml;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
import org.openestate.io.trovit.xml.types.Action;
import org.openestate.io.trovit.xml.types.IntBool;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}url"/&gt;
 *         &lt;element ref="{}title"/&gt;
 *         &lt;element ref="{}type"/&gt;
 *         &lt;element ref="{}content"/&gt;
 *         &lt;element ref="{}date"/&gt;
 *         &lt;element ref="{}expiration_date" minOccurs="0"/&gt;
 *         &lt;element ref="{}is_new" minOccurs="0"/&gt;
 *         &lt;element ref="{}city" minOccurs="0"/&gt;
 *         &lt;element ref="{}price" minOccurs="0"/&gt;
 *         &lt;element ref="{}time" minOccurs="0"/&gt;
 *         &lt;element ref="{}agency" minOccurs="0"/&gt;
 *         &lt;element ref="{}property_type" minOccurs="0"/&gt;
 *         &lt;element ref="{}floor_area" minOccurs="0"/&gt;
 *         &lt;element ref="{}rooms" minOccurs="0"/&gt;
 *         &lt;element ref="{}bathrooms" minOccurs="0"/&gt;
 *         &lt;element ref="{}parking" minOccurs="0"/&gt;
 *         &lt;element ref="{}address" minOccurs="0"/&gt;
 *         &lt;element ref="{}city_area" minOccurs="0"/&gt;
 *         &lt;element ref="{}postcode" minOccurs="0"/&gt;
 *         &lt;element ref="{}region" minOccurs="0"/&gt;
 *         &lt;element ref="{}latitude" minOccurs="0"/&gt;
 *         &lt;element ref="{}longitude" minOccurs="0"/&gt;
 *         &lt;element ref="{}virtual_tour" minOccurs="0"/&gt;
 *         &lt;element ref="{}pictures" minOccurs="0"/&gt;
 *         &lt;element ref="{}plot_area" minOccurs="0"/&gt;
 *         &lt;element ref="{}floor_number" minOccurs="0"/&gt;
 *         &lt;element ref="{}orientation" minOccurs="0"/&gt;
 *         &lt;element ref="{}condition" minOccurs="0"/&gt;
 *         &lt;element ref="{}foreclosure" minOccurs="0"/&gt;
 *         &lt;element ref="{}mls_database" minOccurs="0"/&gt;
 *         &lt;element ref="{}is_furnished" minOccurs="0"/&gt;
 *         &lt;element ref="{}year" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "ad")
public class Ad
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String id;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String url;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String title;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Action type;
    @XmlElement(required = true)
    protected String content;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Calendar date;
    @XmlElement(name = "expiration_date", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Calendar expirationDate;
    @XmlElement(name = "is_new")
    @XmlSchemaType(name = "string")
    protected TypeNew isNew;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String city;
    protected Price price;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Calendar time;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String agency;
    @XmlElement(name = "property_type")
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String propertyType;
    @XmlElement(name = "floor_area")
    protected FloorArea floorArea;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double rooms;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double bathrooms;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter10 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected IntBool parking;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String address;
    @XmlElement(name = "city_area")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String cityArea;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String postcode;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String region;
    @XmlElement(type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter11 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Double latitude;
    @XmlElement(type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter11 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Double longitude;
    @XmlElement(name = "virtual_tour")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String virtualTour;
    protected Pictures pictures;
    @XmlElement(name = "plot_area", type = String.class)
    @XmlJavaTypeAdapter(Adapter8 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Integer plotArea;
    @XmlElement(name = "floor_number")
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String floorNumber;
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String orientation;
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String condition;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String foreclosure;
    @XmlElement(name = "mls_database")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String mlsDatabase;
    @XmlElement(name = "is_furnished", type = String.class)
    @XmlJavaTypeAdapter(Adapter10 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected IntBool isFurnished;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Integer year;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Action getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(Action value) {
        this.type = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(Calendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(Calendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the isNew property.
     * 
     * @return
     *     possible object is
     *     {@link TypeNew }
     *     
     */
    public TypeNew getIsNew() {
        return isNew;
    }

    /**
     * Sets the value of the isNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeNew }
     *     
     */
    public void setIsNew(TypeNew value) {
        this.isNew = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(Calendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgency() {
        return agency;
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgency(String value) {
        this.agency = value;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyType(String value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the floorArea property.
     * 
     * @return
     *     possible object is
     *     {@link FloorArea }
     *     
     */
    public FloorArea getFloorArea() {
        return floorArea;
    }

    /**
     * Sets the value of the floorArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloorArea }
     *     
     */
    public void setFloorArea(FloorArea value) {
        this.floorArea = value;
    }

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRooms(Double value) {
        this.rooms = value;
    }

    /**
     * Gets the value of the bathrooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getBathrooms() {
        return bathrooms;
    }

    /**
     * Sets the value of the bathrooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBathrooms(Double value) {
        this.bathrooms = value;
    }

    /**
     * Gets the value of the parking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public IntBool getParking() {
        return parking;
    }

    /**
     * Sets the value of the parking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParking(IntBool value) {
        this.parking = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the cityArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityArea() {
        return cityArea;
    }

    /**
     * Sets the value of the cityArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityArea(String value) {
        this.cityArea = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the virtualTour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualTour() {
        return virtualTour;
    }

    /**
     * Sets the value of the virtualTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualTour(String value) {
        this.virtualTour = value;
    }

    /**
     * Gets the value of the pictures property.
     * 
     * @return
     *     possible object is
     *     {@link Pictures }
     *     
     */
    public Pictures getPictures() {
        return pictures;
    }

    /**
     * Sets the value of the pictures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pictures }
     *     
     */
    public void setPictures(Pictures value) {
        this.pictures = value;
    }

    /**
     * Gets the value of the plotArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getPlotArea() {
        return plotArea;
    }

    /**
     * Sets the value of the plotArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlotArea(Integer value) {
        this.plotArea = value;
    }

    /**
     * Gets the value of the floorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorNumber() {
        return floorNumber;
    }

    /**
     * Sets the value of the floorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorNumber(String value) {
        this.floorNumber = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the foreclosure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeclosure() {
        return foreclosure;
    }

    /**
     * Sets the value of the foreclosure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeclosure(String value) {
        this.foreclosure = value;
    }

    /**
     * Gets the value of the mlsDatabase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlsDatabase() {
        return mlsDatabase;
    }

    /**
     * Sets the value of the mlsDatabase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlsDatabase(String value) {
        this.mlsDatabase = value;
    }

    /**
     * Gets the value of the isFurnished property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public IntBool getIsFurnished() {
        return isFurnished;
    }

    /**
     * Sets the value of the isFurnished property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsFurnished(IntBool value) {
        this.isFurnished = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(Integer value) {
        this.year = value;
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
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle);
        }
        {
            Action theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            String theContent;
            theContent = this.getContent();
            strategy.appendField(locator, this, "content", buffer, theContent);
        }
        {
            Calendar theDate;
            theDate = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theDate);
        }
        {
            Calendar theExpirationDate;
            theExpirationDate = this.getExpirationDate();
            strategy.appendField(locator, this, "expirationDate", buffer, theExpirationDate);
        }
        {
            TypeNew theIsNew;
            theIsNew = this.getIsNew();
            strategy.appendField(locator, this, "isNew", buffer, theIsNew);
        }
        {
            String theCity;
            theCity = this.getCity();
            strategy.appendField(locator, this, "city", buffer, theCity);
        }
        {
            Price thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice);
        }
        {
            Calendar theTime;
            theTime = this.getTime();
            strategy.appendField(locator, this, "time", buffer, theTime);
        }
        {
            String theAgency;
            theAgency = this.getAgency();
            strategy.appendField(locator, this, "agency", buffer, theAgency);
        }
        {
            String thePropertyType;
            thePropertyType = this.getPropertyType();
            strategy.appendField(locator, this, "propertyType", buffer, thePropertyType);
        }
        {
            FloorArea theFloorArea;
            theFloorArea = this.getFloorArea();
            strategy.appendField(locator, this, "floorArea", buffer, theFloorArea);
        }
        {
            Double theRooms;
            theRooms = this.getRooms();
            strategy.appendField(locator, this, "rooms", buffer, theRooms);
        }
        {
            Double theBathrooms;
            theBathrooms = this.getBathrooms();
            strategy.appendField(locator, this, "bathrooms", buffer, theBathrooms);
        }
        {
            IntBool theParking;
            theParking = this.getParking();
            strategy.appendField(locator, this, "parking", buffer, theParking);
        }
        {
            String theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress);
        }
        {
            String theCityArea;
            theCityArea = this.getCityArea();
            strategy.appendField(locator, this, "cityArea", buffer, theCityArea);
        }
        {
            String thePostcode;
            thePostcode = this.getPostcode();
            strategy.appendField(locator, this, "postcode", buffer, thePostcode);
        }
        {
            String theRegion;
            theRegion = this.getRegion();
            strategy.appendField(locator, this, "region", buffer, theRegion);
        }
        {
            Double theLatitude;
            theLatitude = this.getLatitude();
            strategy.appendField(locator, this, "latitude", buffer, theLatitude);
        }
        {
            Double theLongitude;
            theLongitude = this.getLongitude();
            strategy.appendField(locator, this, "longitude", buffer, theLongitude);
        }
        {
            String theVirtualTour;
            theVirtualTour = this.getVirtualTour();
            strategy.appendField(locator, this, "virtualTour", buffer, theVirtualTour);
        }
        {
            Pictures thePictures;
            thePictures = this.getPictures();
            strategy.appendField(locator, this, "pictures", buffer, thePictures);
        }
        {
            Integer thePlotArea;
            thePlotArea = this.getPlotArea();
            strategy.appendField(locator, this, "plotArea", buffer, thePlotArea);
        }
        {
            String theFloorNumber;
            theFloorNumber = this.getFloorNumber();
            strategy.appendField(locator, this, "floorNumber", buffer, theFloorNumber);
        }
        {
            String theOrientation;
            theOrientation = this.getOrientation();
            strategy.appendField(locator, this, "orientation", buffer, theOrientation);
        }
        {
            String theCondition;
            theCondition = this.getCondition();
            strategy.appendField(locator, this, "condition", buffer, theCondition);
        }
        {
            String theForeclosure;
            theForeclosure = this.getForeclosure();
            strategy.appendField(locator, this, "foreclosure", buffer, theForeclosure);
        }
        {
            String theMlsDatabase;
            theMlsDatabase = this.getMlsDatabase();
            strategy.appendField(locator, this, "mlsDatabase", buffer, theMlsDatabase);
        }
        {
            IntBool theIsFurnished;
            theIsFurnished = this.getIsFurnished();
            strategy.appendField(locator, this, "isFurnished", buffer, theIsFurnished);
        }
        {
            Integer theYear;
            theYear = this.getYear();
            strategy.appendField(locator, this, "year", buffer, theYear);
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
        if (draftCopy instanceof Ad) {
            final Ad copy = ((Ad) draftCopy);
            if (this.id!= null) {
                String sourceId;
                sourceId = this.getId();
                String copyId = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId));
                copy.setId(copyId);
            } else {
                copy.id = null;
            }
            if (this.url!= null) {
                String sourceUrl;
                sourceUrl = this.getUrl();
                String copyUrl = ((String) strategy.copy(LocatorUtils.property(locator, "url", sourceUrl), sourceUrl));
                copy.setUrl(copyUrl);
            } else {
                copy.url = null;
            }
            if (this.title!= null) {
                String sourceTitle;
                sourceTitle = this.getTitle();
                String copyTitle = ((String) strategy.copy(LocatorUtils.property(locator, "title", sourceTitle), sourceTitle));
                copy.setTitle(copyTitle);
            } else {
                copy.title = null;
            }
            if (this.type!= null) {
                Action sourceType;
                sourceType = this.getType();
                Action copyType = ((Action) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType));
                copy.setType(copyType);
            } else {
                copy.type = null;
            }
            if (this.content!= null) {
                String sourceContent;
                sourceContent = this.getContent();
                String copyContent = ((String) strategy.copy(LocatorUtils.property(locator, "content", sourceContent), sourceContent));
                copy.setContent(copyContent);
            } else {
                copy.content = null;
            }
            if (this.date!= null) {
                Calendar sourceDate;
                sourceDate = this.getDate();
                Calendar copyDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "date", sourceDate), sourceDate));
                copy.setDate(copyDate);
            } else {
                copy.date = null;
            }
            if (this.expirationDate!= null) {
                Calendar sourceExpirationDate;
                sourceExpirationDate = this.getExpirationDate();
                Calendar copyExpirationDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "expirationDate", sourceExpirationDate), sourceExpirationDate));
                copy.setExpirationDate(copyExpirationDate);
            } else {
                copy.expirationDate = null;
            }
            if (this.isNew!= null) {
                TypeNew sourceIsNew;
                sourceIsNew = this.getIsNew();
                TypeNew copyIsNew = ((TypeNew) strategy.copy(LocatorUtils.property(locator, "isNew", sourceIsNew), sourceIsNew));
                copy.setIsNew(copyIsNew);
            } else {
                copy.isNew = null;
            }
            if (this.city!= null) {
                String sourceCity;
                sourceCity = this.getCity();
                String copyCity = ((String) strategy.copy(LocatorUtils.property(locator, "city", sourceCity), sourceCity));
                copy.setCity(copyCity);
            } else {
                copy.city = null;
            }
            if (this.price!= null) {
                Price sourcePrice;
                sourcePrice = this.getPrice();
                Price copyPrice = ((Price) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice));
                copy.setPrice(copyPrice);
            } else {
                copy.price = null;
            }
            if (this.time!= null) {
                Calendar sourceTime;
                sourceTime = this.getTime();
                Calendar copyTime = ((Calendar) strategy.copy(LocatorUtils.property(locator, "time", sourceTime), sourceTime));
                copy.setTime(copyTime);
            } else {
                copy.time = null;
            }
            if (this.agency!= null) {
                String sourceAgency;
                sourceAgency = this.getAgency();
                String copyAgency = ((String) strategy.copy(LocatorUtils.property(locator, "agency", sourceAgency), sourceAgency));
                copy.setAgency(copyAgency);
            } else {
                copy.agency = null;
            }
            if (this.propertyType!= null) {
                String sourcePropertyType;
                sourcePropertyType = this.getPropertyType();
                String copyPropertyType = ((String) strategy.copy(LocatorUtils.property(locator, "propertyType", sourcePropertyType), sourcePropertyType));
                copy.setPropertyType(copyPropertyType);
            } else {
                copy.propertyType = null;
            }
            if (this.floorArea!= null) {
                FloorArea sourceFloorArea;
                sourceFloorArea = this.getFloorArea();
                FloorArea copyFloorArea = ((FloorArea) strategy.copy(LocatorUtils.property(locator, "floorArea", sourceFloorArea), sourceFloorArea));
                copy.setFloorArea(copyFloorArea);
            } else {
                copy.floorArea = null;
            }
            if (this.rooms!= null) {
                Double sourceRooms;
                sourceRooms = this.getRooms();
                Double copyRooms = ((Double) strategy.copy(LocatorUtils.property(locator, "rooms", sourceRooms), sourceRooms));
                copy.setRooms(copyRooms);
            } else {
                copy.rooms = null;
            }
            if (this.bathrooms!= null) {
                Double sourceBathrooms;
                sourceBathrooms = this.getBathrooms();
                Double copyBathrooms = ((Double) strategy.copy(LocatorUtils.property(locator, "bathrooms", sourceBathrooms), sourceBathrooms));
                copy.setBathrooms(copyBathrooms);
            } else {
                copy.bathrooms = null;
            }
            if (this.parking!= null) {
                IntBool sourceParking;
                sourceParking = this.getParking();
                IntBool copyParking = ((IntBool) strategy.copy(LocatorUtils.property(locator, "parking", sourceParking), sourceParking));
                copy.setParking(copyParking);
            } else {
                copy.parking = null;
            }
            if (this.address!= null) {
                String sourceAddress;
                sourceAddress = this.getAddress();
                String copyAddress = ((String) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress));
                copy.setAddress(copyAddress);
            } else {
                copy.address = null;
            }
            if (this.cityArea!= null) {
                String sourceCityArea;
                sourceCityArea = this.getCityArea();
                String copyCityArea = ((String) strategy.copy(LocatorUtils.property(locator, "cityArea", sourceCityArea), sourceCityArea));
                copy.setCityArea(copyCityArea);
            } else {
                copy.cityArea = null;
            }
            if (this.postcode!= null) {
                String sourcePostcode;
                sourcePostcode = this.getPostcode();
                String copyPostcode = ((String) strategy.copy(LocatorUtils.property(locator, "postcode", sourcePostcode), sourcePostcode));
                copy.setPostcode(copyPostcode);
            } else {
                copy.postcode = null;
            }
            if (this.region!= null) {
                String sourceRegion;
                sourceRegion = this.getRegion();
                String copyRegion = ((String) strategy.copy(LocatorUtils.property(locator, "region", sourceRegion), sourceRegion));
                copy.setRegion(copyRegion);
            } else {
                copy.region = null;
            }
            if (this.latitude!= null) {
                Double sourceLatitude;
                sourceLatitude = this.getLatitude();
                Double copyLatitude = ((Double) strategy.copy(LocatorUtils.property(locator, "latitude", sourceLatitude), sourceLatitude));
                copy.setLatitude(copyLatitude);
            } else {
                copy.latitude = null;
            }
            if (this.longitude!= null) {
                Double sourceLongitude;
                sourceLongitude = this.getLongitude();
                Double copyLongitude = ((Double) strategy.copy(LocatorUtils.property(locator, "longitude", sourceLongitude), sourceLongitude));
                copy.setLongitude(copyLongitude);
            } else {
                copy.longitude = null;
            }
            if (this.virtualTour!= null) {
                String sourceVirtualTour;
                sourceVirtualTour = this.getVirtualTour();
                String copyVirtualTour = ((String) strategy.copy(LocatorUtils.property(locator, "virtualTour", sourceVirtualTour), sourceVirtualTour));
                copy.setVirtualTour(copyVirtualTour);
            } else {
                copy.virtualTour = null;
            }
            if (this.pictures!= null) {
                Pictures sourcePictures;
                sourcePictures = this.getPictures();
                Pictures copyPictures = ((Pictures) strategy.copy(LocatorUtils.property(locator, "pictures", sourcePictures), sourcePictures));
                copy.setPictures(copyPictures);
            } else {
                copy.pictures = null;
            }
            if (this.plotArea!= null) {
                Integer sourcePlotArea;
                sourcePlotArea = this.getPlotArea();
                Integer copyPlotArea = ((Integer) strategy.copy(LocatorUtils.property(locator, "plotArea", sourcePlotArea), sourcePlotArea));
                copy.setPlotArea(copyPlotArea);
            } else {
                copy.plotArea = null;
            }
            if (this.floorNumber!= null) {
                String sourceFloorNumber;
                sourceFloorNumber = this.getFloorNumber();
                String copyFloorNumber = ((String) strategy.copy(LocatorUtils.property(locator, "floorNumber", sourceFloorNumber), sourceFloorNumber));
                copy.setFloorNumber(copyFloorNumber);
            } else {
                copy.floorNumber = null;
            }
            if (this.orientation!= null) {
                String sourceOrientation;
                sourceOrientation = this.getOrientation();
                String copyOrientation = ((String) strategy.copy(LocatorUtils.property(locator, "orientation", sourceOrientation), sourceOrientation));
                copy.setOrientation(copyOrientation);
            } else {
                copy.orientation = null;
            }
            if (this.condition!= null) {
                String sourceCondition;
                sourceCondition = this.getCondition();
                String copyCondition = ((String) strategy.copy(LocatorUtils.property(locator, "condition", sourceCondition), sourceCondition));
                copy.setCondition(copyCondition);
            } else {
                copy.condition = null;
            }
            if (this.foreclosure!= null) {
                String sourceForeclosure;
                sourceForeclosure = this.getForeclosure();
                String copyForeclosure = ((String) strategy.copy(LocatorUtils.property(locator, "foreclosure", sourceForeclosure), sourceForeclosure));
                copy.setForeclosure(copyForeclosure);
            } else {
                copy.foreclosure = null;
            }
            if (this.mlsDatabase!= null) {
                String sourceMlsDatabase;
                sourceMlsDatabase = this.getMlsDatabase();
                String copyMlsDatabase = ((String) strategy.copy(LocatorUtils.property(locator, "mlsDatabase", sourceMlsDatabase), sourceMlsDatabase));
                copy.setMlsDatabase(copyMlsDatabase);
            } else {
                copy.mlsDatabase = null;
            }
            if (this.isFurnished!= null) {
                IntBool sourceIsFurnished;
                sourceIsFurnished = this.getIsFurnished();
                IntBool copyIsFurnished = ((IntBool) strategy.copy(LocatorUtils.property(locator, "isFurnished", sourceIsFurnished), sourceIsFurnished));
                copy.setIsFurnished(copyIsFurnished);
            } else {
                copy.isFurnished = null;
            }
            if (this.year!= null) {
                Integer sourceYear;
                sourceYear = this.getYear();
                Integer copyYear = ((Integer) strategy.copy(LocatorUtils.property(locator, "year", sourceYear), sourceYear));
                copy.setYear(copyYear);
            } else {
                copy.year = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Ad();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Ad)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Ad that = ((Ad) object);
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            String lhsUrl;
            lhsUrl = this.getUrl();
            String rhsUrl;
            rhsUrl = that.getUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl)) {
                return false;
            }
        }
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle)) {
                return false;
            }
        }
        {
            Action lhsType;
            lhsType = this.getType();
            Action rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            String lhsContent;
            lhsContent = this.getContent();
            String rhsContent;
            rhsContent = that.getContent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "content", lhsContent), LocatorUtils.property(thatLocator, "content", rhsContent), lhsContent, rhsContent)) {
                return false;
            }
        }
        {
            Calendar lhsDate;
            lhsDate = this.getDate();
            Calendar rhsDate;
            rhsDate = that.getDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "date", lhsDate), LocatorUtils.property(thatLocator, "date", rhsDate), lhsDate, rhsDate)) {
                return false;
            }
        }
        {
            Calendar lhsExpirationDate;
            lhsExpirationDate = this.getExpirationDate();
            Calendar rhsExpirationDate;
            rhsExpirationDate = that.getExpirationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expirationDate", lhsExpirationDate), LocatorUtils.property(thatLocator, "expirationDate", rhsExpirationDate), lhsExpirationDate, rhsExpirationDate)) {
                return false;
            }
        }
        {
            TypeNew lhsIsNew;
            lhsIsNew = this.getIsNew();
            TypeNew rhsIsNew;
            rhsIsNew = that.getIsNew();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isNew", lhsIsNew), LocatorUtils.property(thatLocator, "isNew", rhsIsNew), lhsIsNew, rhsIsNew)) {
                return false;
            }
        }
        {
            String lhsCity;
            lhsCity = this.getCity();
            String rhsCity;
            rhsCity = that.getCity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "city", lhsCity), LocatorUtils.property(thatLocator, "city", rhsCity), lhsCity, rhsCity)) {
                return false;
            }
        }
        {
            Price lhsPrice;
            lhsPrice = this.getPrice();
            Price rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice)) {
                return false;
            }
        }
        {
            Calendar lhsTime;
            lhsTime = this.getTime();
            Calendar rhsTime;
            rhsTime = that.getTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "time", lhsTime), LocatorUtils.property(thatLocator, "time", rhsTime), lhsTime, rhsTime)) {
                return false;
            }
        }
        {
            String lhsAgency;
            lhsAgency = this.getAgency();
            String rhsAgency;
            rhsAgency = that.getAgency();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agency", lhsAgency), LocatorUtils.property(thatLocator, "agency", rhsAgency), lhsAgency, rhsAgency)) {
                return false;
            }
        }
        {
            String lhsPropertyType;
            lhsPropertyType = this.getPropertyType();
            String rhsPropertyType;
            rhsPropertyType = that.getPropertyType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyType", lhsPropertyType), LocatorUtils.property(thatLocator, "propertyType", rhsPropertyType), lhsPropertyType, rhsPropertyType)) {
                return false;
            }
        }
        {
            FloorArea lhsFloorArea;
            lhsFloorArea = this.getFloorArea();
            FloorArea rhsFloorArea;
            rhsFloorArea = that.getFloorArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floorArea", lhsFloorArea), LocatorUtils.property(thatLocator, "floorArea", rhsFloorArea), lhsFloorArea, rhsFloorArea)) {
                return false;
            }
        }
        {
            Double lhsRooms;
            lhsRooms = this.getRooms();
            Double rhsRooms;
            rhsRooms = that.getRooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rooms", lhsRooms), LocatorUtils.property(thatLocator, "rooms", rhsRooms), lhsRooms, rhsRooms)) {
                return false;
            }
        }
        {
            Double lhsBathrooms;
            lhsBathrooms = this.getBathrooms();
            Double rhsBathrooms;
            rhsBathrooms = that.getBathrooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bathrooms", lhsBathrooms), LocatorUtils.property(thatLocator, "bathrooms", rhsBathrooms), lhsBathrooms, rhsBathrooms)) {
                return false;
            }
        }
        {
            IntBool lhsParking;
            lhsParking = this.getParking();
            IntBool rhsParking;
            rhsParking = that.getParking();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parking", lhsParking), LocatorUtils.property(thatLocator, "parking", rhsParking), lhsParking, rhsParking)) {
                return false;
            }
        }
        {
            String lhsAddress;
            lhsAddress = this.getAddress();
            String rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress)) {
                return false;
            }
        }
        {
            String lhsCityArea;
            lhsCityArea = this.getCityArea();
            String rhsCityArea;
            rhsCityArea = that.getCityArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cityArea", lhsCityArea), LocatorUtils.property(thatLocator, "cityArea", rhsCityArea), lhsCityArea, rhsCityArea)) {
                return false;
            }
        }
        {
            String lhsPostcode;
            lhsPostcode = this.getPostcode();
            String rhsPostcode;
            rhsPostcode = that.getPostcode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postcode", lhsPostcode), LocatorUtils.property(thatLocator, "postcode", rhsPostcode), lhsPostcode, rhsPostcode)) {
                return false;
            }
        }
        {
            String lhsRegion;
            lhsRegion = this.getRegion();
            String rhsRegion;
            rhsRegion = that.getRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "region", lhsRegion), LocatorUtils.property(thatLocator, "region", rhsRegion), lhsRegion, rhsRegion)) {
                return false;
            }
        }
        {
            Double lhsLatitude;
            lhsLatitude = this.getLatitude();
            Double rhsLatitude;
            rhsLatitude = that.getLatitude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latitude", lhsLatitude), LocatorUtils.property(thatLocator, "latitude", rhsLatitude), lhsLatitude, rhsLatitude)) {
                return false;
            }
        }
        {
            Double lhsLongitude;
            lhsLongitude = this.getLongitude();
            Double rhsLongitude;
            rhsLongitude = that.getLongitude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "longitude", lhsLongitude), LocatorUtils.property(thatLocator, "longitude", rhsLongitude), lhsLongitude, rhsLongitude)) {
                return false;
            }
        }
        {
            String lhsVirtualTour;
            lhsVirtualTour = this.getVirtualTour();
            String rhsVirtualTour;
            rhsVirtualTour = that.getVirtualTour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "virtualTour", lhsVirtualTour), LocatorUtils.property(thatLocator, "virtualTour", rhsVirtualTour), lhsVirtualTour, rhsVirtualTour)) {
                return false;
            }
        }
        {
            Pictures lhsPictures;
            lhsPictures = this.getPictures();
            Pictures rhsPictures;
            rhsPictures = that.getPictures();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pictures", lhsPictures), LocatorUtils.property(thatLocator, "pictures", rhsPictures), lhsPictures, rhsPictures)) {
                return false;
            }
        }
        {
            Integer lhsPlotArea;
            lhsPlotArea = this.getPlotArea();
            Integer rhsPlotArea;
            rhsPlotArea = that.getPlotArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plotArea", lhsPlotArea), LocatorUtils.property(thatLocator, "plotArea", rhsPlotArea), lhsPlotArea, rhsPlotArea)) {
                return false;
            }
        }
        {
            String lhsFloorNumber;
            lhsFloorNumber = this.getFloorNumber();
            String rhsFloorNumber;
            rhsFloorNumber = that.getFloorNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floorNumber", lhsFloorNumber), LocatorUtils.property(thatLocator, "floorNumber", rhsFloorNumber), lhsFloorNumber, rhsFloorNumber)) {
                return false;
            }
        }
        {
            String lhsOrientation;
            lhsOrientation = this.getOrientation();
            String rhsOrientation;
            rhsOrientation = that.getOrientation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orientation", lhsOrientation), LocatorUtils.property(thatLocator, "orientation", rhsOrientation), lhsOrientation, rhsOrientation)) {
                return false;
            }
        }
        {
            String lhsCondition;
            lhsCondition = this.getCondition();
            String rhsCondition;
            rhsCondition = that.getCondition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "condition", lhsCondition), LocatorUtils.property(thatLocator, "condition", rhsCondition), lhsCondition, rhsCondition)) {
                return false;
            }
        }
        {
            String lhsForeclosure;
            lhsForeclosure = this.getForeclosure();
            String rhsForeclosure;
            rhsForeclosure = that.getForeclosure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "foreclosure", lhsForeclosure), LocatorUtils.property(thatLocator, "foreclosure", rhsForeclosure), lhsForeclosure, rhsForeclosure)) {
                return false;
            }
        }
        {
            String lhsMlsDatabase;
            lhsMlsDatabase = this.getMlsDatabase();
            String rhsMlsDatabase;
            rhsMlsDatabase = that.getMlsDatabase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mlsDatabase", lhsMlsDatabase), LocatorUtils.property(thatLocator, "mlsDatabase", rhsMlsDatabase), lhsMlsDatabase, rhsMlsDatabase)) {
                return false;
            }
        }
        {
            IntBool lhsIsFurnished;
            lhsIsFurnished = this.getIsFurnished();
            IntBool rhsIsFurnished;
            rhsIsFurnished = that.getIsFurnished();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isFurnished", lhsIsFurnished), LocatorUtils.property(thatLocator, "isFurnished", rhsIsFurnished), lhsIsFurnished, rhsIsFurnished)) {
                return false;
            }
        }
        {
            Integer lhsYear;
            lhsYear = this.getYear();
            Integer rhsYear;
            rhsYear = that.getYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "year", lhsYear), LocatorUtils.property(thatLocator, "year", rhsYear), lhsYear, rhsYear)) {
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
