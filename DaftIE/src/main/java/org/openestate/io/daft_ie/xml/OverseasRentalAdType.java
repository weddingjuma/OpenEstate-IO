
package org.openestate.io.daft_ie.xml;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
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


/**
 * <p>Java class for overseasRentalAdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="overseasRentalAdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="property_type" type="{}propertyType"/>
 *         &lt;element name="house_type" type="{}houseType"/>
 *         &lt;element name="commercial_type" type="{}commercialType"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rent" type="{}positiveInteger"/>
 *         &lt;element name="rent_collection_period">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="weekly"/>
 *               &lt;enumeration value="monthly"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bathroom_number" type="{}positiveInteger"/>
 *         &lt;element name="bedroom_number" type="{}positiveInteger"/>
 *         &lt;element name="furnished">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="furnished"/>
 *               &lt;enumeration value="unfurnished"/>
 *               &lt;enumeration value="either"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cable_television" type="{}bool"/>
 *         &lt;element name="washing_machine" type="{}bool"/>
 *         &lt;element name="dryer" type="{}bool"/>
 *         &lt;element name="dishwasher" type="{}bool"/>
 *         &lt;element name="microwave" type="{}bool"/>
 *         &lt;element name="single_beds" type="{}positiveInteger" minOccurs="0"/>
 *         &lt;element name="double_beds" type="{}positiveInteger" minOccurs="0"/>
 *         &lt;element name="twin_beds" type="{}positiveInteger" minOccurs="0"/>
 *         &lt;element name="number_people" type="{}positiveInteger" minOccurs="0"/>
 *         &lt;element name="available_from" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lease" type="{}positiveInteger" minOccurs="0"/>
 *         &lt;element name="phone1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phone_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="main_email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cc_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="external_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agent_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="photos" type="{}photosType" minOccurs="0"/>
 *         &lt;element name="features" type="{}featuresType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "overseasRentalAdType", propOrder = {
    "country",
    "region",
    "area",
    "address",
    "propertyType",
    "houseType",
    "commercialType",
    "description",
    "rent",
    "rentCollectionPeriod",
    "bathroomNumber",
    "bedroomNumber",
    "furnished",
    "cableTelevision",
    "washingMachine",
    "dryer",
    "dishwasher",
    "microwave",
    "singleBeds",
    "doubleBeds",
    "twinBeds",
    "numberPeople",
    "availableFrom",
    "lease",
    "phone1",
    "phone2",
    "contactName",
    "phoneInfo",
    "mainEmail",
    "ccEmail",
    "externalId",
    "agentId",
    "photos",
    "features"
})
public class OverseasRentalAdType
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String country;
    @XmlElement(required = true)
    protected java.lang.String region;
    @XmlElement(required = true)
    protected java.lang.String area;
    @XmlElement(required = true)
    protected java.lang.String address;
    @XmlElement(name = "property_type", required = true)
    protected PropertyType propertyType;
    @XmlElement(name = "house_type", required = true)
    protected HouseType houseType;
    @XmlElement(name = "commercial_type", required = true)
    protected CommercialType commercialType;
    @XmlElement(required = true)
    protected java.lang.String description;
    @XmlElement(required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Integer rent;
    @XmlElement(name = "rent_collection_period", required = true)
    protected OverseasRentalAdType.RentPeriod rentCollectionPeriod;
    @XmlElement(name = "bathroom_number", required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Integer bathroomNumber;
    @XmlElement(name = "bedroom_number", required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Integer bedroomNumber;
    @XmlElement(required = true)
    protected OverseasRentalAdType.Furnished furnished;
    @XmlElement(name = "cable_television", required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected Boolean cableTelevision;
    @XmlElement(name = "washing_machine", required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected Boolean washingMachine;
    @XmlElement(required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected Boolean dryer;
    @XmlElement(required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected Boolean dishwasher;
    @XmlElement(required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected Boolean microwave;
    @XmlElement(name = "single_beds", type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Integer singleBeds;
    @XmlElement(name = "double_beds", type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Integer doubleBeds;
    @XmlElement(name = "twin_beds", type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Integer twinBeds;
    @XmlElement(name = "number_people", type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Integer numberPeople;
    @XmlElement(name = "available_from", type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    protected Calendar availableFrom;
    @XmlElement(type = java.lang.String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Integer lease;
    @XmlElement(required = true)
    protected java.lang.String phone1;
    protected java.lang.String phone2;
    @XmlElement(name = "contact_name", required = true)
    protected java.lang.String contactName;
    @XmlElement(name = "phone_info")
    protected java.lang.String phoneInfo;
    @XmlElement(name = "main_email", required = true)
    protected java.lang.String mainEmail;
    @XmlElement(name = "cc_email")
    protected java.lang.String ccEmail;
    @XmlElement(name = "external_id", required = true)
    protected java.lang.String externalId;
    @XmlElement(name = "agent_id", required = true)
    protected java.lang.String agentId;
    protected PhotosType photos;
    protected FeaturesType features;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRegion(java.lang.String value) {
        this.region = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setArea(java.lang.String value) {
        this.area = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAddress(java.lang.String value) {
        this.address = value;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyType }
     *     
     */
    public PropertyType getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType }
     *     
     */
    public void setPropertyType(PropertyType value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the houseType property.
     * 
     * @return
     *     possible object is
     *     {@link HouseType }
     *     
     */
    public HouseType getHouseType() {
        return houseType;
    }

    /**
     * Sets the value of the houseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseType }
     *     
     */
    public void setHouseType(HouseType value) {
        this.houseType = value;
    }

    /**
     * Gets the value of the commercialType property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialType }
     *     
     */
    public CommercialType getCommercialType() {
        return commercialType;
    }

    /**
     * Sets the value of the commercialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialType }
     *     
     */
    public void setCommercialType(CommercialType value) {
        this.commercialType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDescription(java.lang.String value) {
        this.description = value;
    }

    /**
     * Gets the value of the rent property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Integer getRent() {
        return rent;
    }

    /**
     * Sets the value of the rent property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRent(Integer value) {
        this.rent = value;
    }

    /**
     * Gets the value of the rentCollectionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link OverseasRentalAdType.RentPeriod }
     *     
     */
    public OverseasRentalAdType.RentPeriod getRentCollectionPeriod() {
        return rentCollectionPeriod;
    }

    /**
     * Sets the value of the rentCollectionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverseasRentalAdType.RentPeriod }
     *     
     */
    public void setRentCollectionPeriod(OverseasRentalAdType.RentPeriod value) {
        this.rentCollectionPeriod = value;
    }

    /**
     * Gets the value of the bathroomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Integer getBathroomNumber() {
        return bathroomNumber;
    }

    /**
     * Sets the value of the bathroomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setBathroomNumber(Integer value) {
        this.bathroomNumber = value;
    }

    /**
     * Gets the value of the bedroomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Integer getBedroomNumber() {
        return bedroomNumber;
    }

    /**
     * Sets the value of the bedroomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setBedroomNumber(Integer value) {
        this.bedroomNumber = value;
    }

    /**
     * Gets the value of the furnished property.
     * 
     * @return
     *     possible object is
     *     {@link OverseasRentalAdType.Furnished }
     *     
     */
    public OverseasRentalAdType.Furnished getFurnished() {
        return furnished;
    }

    /**
     * Sets the value of the furnished property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverseasRentalAdType.Furnished }
     *     
     */
    public void setFurnished(OverseasRentalAdType.Furnished value) {
        this.furnished = value;
    }

    /**
     * Gets the value of the cableTelevision property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Boolean getCableTelevision() {
        return cableTelevision;
    }

    /**
     * Sets the value of the cableTelevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCableTelevision(Boolean value) {
        this.cableTelevision = value;
    }

    /**
     * Gets the value of the washingMachine property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Boolean getWashingMachine() {
        return washingMachine;
    }

    /**
     * Sets the value of the washingMachine property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setWashingMachine(Boolean value) {
        this.washingMachine = value;
    }

    /**
     * Gets the value of the dryer property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Boolean getDryer() {
        return dryer;
    }

    /**
     * Sets the value of the dryer property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDryer(Boolean value) {
        this.dryer = value;
    }

    /**
     * Gets the value of the dishwasher property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Boolean getDishwasher() {
        return dishwasher;
    }

    /**
     * Sets the value of the dishwasher property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDishwasher(Boolean value) {
        this.dishwasher = value;
    }

    /**
     * Gets the value of the microwave property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Boolean getMicrowave() {
        return microwave;
    }

    /**
     * Sets the value of the microwave property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setMicrowave(Boolean value) {
        this.microwave = value;
    }

    /**
     * Gets the value of the singleBeds property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Integer getSingleBeds() {
        return singleBeds;
    }

    /**
     * Sets the value of the singleBeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSingleBeds(Integer value) {
        this.singleBeds = value;
    }

    /**
     * Gets the value of the doubleBeds property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Integer getDoubleBeds() {
        return doubleBeds;
    }

    /**
     * Sets the value of the doubleBeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDoubleBeds(Integer value) {
        this.doubleBeds = value;
    }

    /**
     * Gets the value of the twinBeds property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Integer getTwinBeds() {
        return twinBeds;
    }

    /**
     * Sets the value of the twinBeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTwinBeds(Integer value) {
        this.twinBeds = value;
    }

    /**
     * Gets the value of the numberPeople property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Integer getNumberPeople() {
        return numberPeople;
    }

    /**
     * Sets the value of the numberPeople property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNumberPeople(Integer value) {
        this.numberPeople = value;
    }

    /**
     * Gets the value of the availableFrom property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Calendar getAvailableFrom() {
        return availableFrom;
    }

    /**
     * Sets the value of the availableFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAvailableFrom(Calendar value) {
        this.availableFrom = value;
    }

    /**
     * Gets the value of the lease property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public Integer getLease() {
        return lease;
    }

    /**
     * Sets the value of the lease property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLease(Integer value) {
        this.lease = value;
    }

    /**
     * Gets the value of the phone1 property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPhone1() {
        return phone1;
    }

    /**
     * Sets the value of the phone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPhone1(java.lang.String value) {
        this.phone1 = value;
    }

    /**
     * Gets the value of the phone2 property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPhone2() {
        return phone2;
    }

    /**
     * Sets the value of the phone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPhone2(java.lang.String value) {
        this.phone2 = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setContactName(java.lang.String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the phoneInfo property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPhoneInfo() {
        return phoneInfo;
    }

    /**
     * Sets the value of the phoneInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPhoneInfo(java.lang.String value) {
        this.phoneInfo = value;
    }

    /**
     * Gets the value of the mainEmail property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getMainEmail() {
        return mainEmail;
    }

    /**
     * Sets the value of the mainEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setMainEmail(java.lang.String value) {
        this.mainEmail = value;
    }

    /**
     * Gets the value of the ccEmail property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCcEmail() {
        return ccEmail;
    }

    /**
     * Sets the value of the ccEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCcEmail(java.lang.String value) {
        this.ccEmail = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setExternalId(java.lang.String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the agentId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAgentId(java.lang.String value) {
        this.agentId = value;
    }

    /**
     * Gets the value of the photos property.
     * 
     * @return
     *     possible object is
     *     {@link PhotosType }
     *     
     */
    public PhotosType getPhotos() {
        return photos;
    }

    /**
     * Sets the value of the photos property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhotosType }
     *     
     */
    public void setPhotos(PhotosType value) {
        this.photos = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesType }
     *     
     */
    public FeaturesType getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesType }
     *     
     */
    public void setFeatures(FeaturesType value) {
        this.features = value;
    }

    public java.lang.String toString() {
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
            String theCountry;
            theCountry = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theCountry);
        }
        {
            java.lang.String theRegion;
            theRegion = this.getRegion();
            strategy.appendField(locator, this, "region", buffer, theRegion);
        }
        {
            java.lang.String theArea;
            theArea = this.getArea();
            strategy.appendField(locator, this, "area", buffer, theArea);
        }
        {
            java.lang.String theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress);
        }
        {
            PropertyType thePropertyType;
            thePropertyType = this.getPropertyType();
            strategy.appendField(locator, this, "propertyType", buffer, thePropertyType);
        }
        {
            HouseType theHouseType;
            theHouseType = this.getHouseType();
            strategy.appendField(locator, this, "houseType", buffer, theHouseType);
        }
        {
            CommercialType theCommercialType;
            theCommercialType = this.getCommercialType();
            strategy.appendField(locator, this, "commercialType", buffer, theCommercialType);
        }
        {
            java.lang.String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            Integer theRent;
            theRent = this.getRent();
            strategy.appendField(locator, this, "rent", buffer, theRent);
        }
        {
            OverseasRentalAdType.RentPeriod theRentCollectionPeriod;
            theRentCollectionPeriod = this.getRentCollectionPeriod();
            strategy.appendField(locator, this, "rentCollectionPeriod", buffer, theRentCollectionPeriod);
        }
        {
            Integer theBathroomNumber;
            theBathroomNumber = this.getBathroomNumber();
            strategy.appendField(locator, this, "bathroomNumber", buffer, theBathroomNumber);
        }
        {
            Integer theBedroomNumber;
            theBedroomNumber = this.getBedroomNumber();
            strategy.appendField(locator, this, "bedroomNumber", buffer, theBedroomNumber);
        }
        {
            OverseasRentalAdType.Furnished theFurnished;
            theFurnished = this.getFurnished();
            strategy.appendField(locator, this, "furnished", buffer, theFurnished);
        }
        {
            Boolean theCableTelevision;
            theCableTelevision = this.getCableTelevision();
            strategy.appendField(locator, this, "cableTelevision", buffer, theCableTelevision);
        }
        {
            Boolean theWashingMachine;
            theWashingMachine = this.getWashingMachine();
            strategy.appendField(locator, this, "washingMachine", buffer, theWashingMachine);
        }
        {
            Boolean theDryer;
            theDryer = this.getDryer();
            strategy.appendField(locator, this, "dryer", buffer, theDryer);
        }
        {
            Boolean theDishwasher;
            theDishwasher = this.getDishwasher();
            strategy.appendField(locator, this, "dishwasher", buffer, theDishwasher);
        }
        {
            Boolean theMicrowave;
            theMicrowave = this.getMicrowave();
            strategy.appendField(locator, this, "microwave", buffer, theMicrowave);
        }
        {
            Integer theSingleBeds;
            theSingleBeds = this.getSingleBeds();
            strategy.appendField(locator, this, "singleBeds", buffer, theSingleBeds);
        }
        {
            Integer theDoubleBeds;
            theDoubleBeds = this.getDoubleBeds();
            strategy.appendField(locator, this, "doubleBeds", buffer, theDoubleBeds);
        }
        {
            Integer theTwinBeds;
            theTwinBeds = this.getTwinBeds();
            strategy.appendField(locator, this, "twinBeds", buffer, theTwinBeds);
        }
        {
            Integer theNumberPeople;
            theNumberPeople = this.getNumberPeople();
            strategy.appendField(locator, this, "numberPeople", buffer, theNumberPeople);
        }
        {
            Calendar theAvailableFrom;
            theAvailableFrom = this.getAvailableFrom();
            strategy.appendField(locator, this, "availableFrom", buffer, theAvailableFrom);
        }
        {
            Integer theLease;
            theLease = this.getLease();
            strategy.appendField(locator, this, "lease", buffer, theLease);
        }
        {
            java.lang.String thePhone1;
            thePhone1 = this.getPhone1();
            strategy.appendField(locator, this, "phone1", buffer, thePhone1);
        }
        {
            java.lang.String thePhone2;
            thePhone2 = this.getPhone2();
            strategy.appendField(locator, this, "phone2", buffer, thePhone2);
        }
        {
            java.lang.String theContactName;
            theContactName = this.getContactName();
            strategy.appendField(locator, this, "contactName", buffer, theContactName);
        }
        {
            java.lang.String thePhoneInfo;
            thePhoneInfo = this.getPhoneInfo();
            strategy.appendField(locator, this, "phoneInfo", buffer, thePhoneInfo);
        }
        {
            java.lang.String theMainEmail;
            theMainEmail = this.getMainEmail();
            strategy.appendField(locator, this, "mainEmail", buffer, theMainEmail);
        }
        {
            java.lang.String theCcEmail;
            theCcEmail = this.getCcEmail();
            strategy.appendField(locator, this, "ccEmail", buffer, theCcEmail);
        }
        {
            java.lang.String theExternalId;
            theExternalId = this.getExternalId();
            strategy.appendField(locator, this, "externalId", buffer, theExternalId);
        }
        {
            java.lang.String theAgentId;
            theAgentId = this.getAgentId();
            strategy.appendField(locator, this, "agentId", buffer, theAgentId);
        }
        {
            PhotosType thePhotos;
            thePhotos = this.getPhotos();
            strategy.appendField(locator, this, "photos", buffer, thePhotos);
        }
        {
            FeaturesType theFeatures;
            theFeatures = this.getFeatures();
            strategy.appendField(locator, this, "features", buffer, theFeatures);
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
        if (draftCopy instanceof OverseasRentalAdType) {
            final OverseasRentalAdType copy = ((OverseasRentalAdType) draftCopy);
            if (this.country!= null) {
                String sourceCountry;
                sourceCountry = this.getCountry();
                String copyCountry = ((String) strategy.copy(LocatorUtils.property(locator, "country", sourceCountry), sourceCountry));
                copy.setCountry(copyCountry);
            } else {
                copy.country = null;
            }
            if (this.region!= null) {
                java.lang.String sourceRegion;
                sourceRegion = this.getRegion();
                java.lang.String copyRegion = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "region", sourceRegion), sourceRegion));
                copy.setRegion(copyRegion);
            } else {
                copy.region = null;
            }
            if (this.area!= null) {
                java.lang.String sourceArea;
                sourceArea = this.getArea();
                java.lang.String copyArea = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "area", sourceArea), sourceArea));
                copy.setArea(copyArea);
            } else {
                copy.area = null;
            }
            if (this.address!= null) {
                java.lang.String sourceAddress;
                sourceAddress = this.getAddress();
                java.lang.String copyAddress = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress));
                copy.setAddress(copyAddress);
            } else {
                copy.address = null;
            }
            if (this.propertyType!= null) {
                PropertyType sourcePropertyType;
                sourcePropertyType = this.getPropertyType();
                PropertyType copyPropertyType = ((PropertyType) strategy.copy(LocatorUtils.property(locator, "propertyType", sourcePropertyType), sourcePropertyType));
                copy.setPropertyType(copyPropertyType);
            } else {
                copy.propertyType = null;
            }
            if (this.houseType!= null) {
                HouseType sourceHouseType;
                sourceHouseType = this.getHouseType();
                HouseType copyHouseType = ((HouseType) strategy.copy(LocatorUtils.property(locator, "houseType", sourceHouseType), sourceHouseType));
                copy.setHouseType(copyHouseType);
            } else {
                copy.houseType = null;
            }
            if (this.commercialType!= null) {
                CommercialType sourceCommercialType;
                sourceCommercialType = this.getCommercialType();
                CommercialType copyCommercialType = ((CommercialType) strategy.copy(LocatorUtils.property(locator, "commercialType", sourceCommercialType), sourceCommercialType));
                copy.setCommercialType(copyCommercialType);
            } else {
                copy.commercialType = null;
            }
            if (this.description!= null) {
                java.lang.String sourceDescription;
                sourceDescription = this.getDescription();
                java.lang.String copyDescription = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription));
                copy.setDescription(copyDescription);
            } else {
                copy.description = null;
            }
            if (this.rent!= null) {
                Integer sourceRent;
                sourceRent = this.getRent();
                Integer copyRent = ((Integer) strategy.copy(LocatorUtils.property(locator, "rent", sourceRent), sourceRent));
                copy.setRent(copyRent);
            } else {
                copy.rent = null;
            }
            if (this.rentCollectionPeriod!= null) {
                OverseasRentalAdType.RentPeriod sourceRentCollectionPeriod;
                sourceRentCollectionPeriod = this.getRentCollectionPeriod();
                OverseasRentalAdType.RentPeriod copyRentCollectionPeriod = ((OverseasRentalAdType.RentPeriod) strategy.copy(LocatorUtils.property(locator, "rentCollectionPeriod", sourceRentCollectionPeriod), sourceRentCollectionPeriod));
                copy.setRentCollectionPeriod(copyRentCollectionPeriod);
            } else {
                copy.rentCollectionPeriod = null;
            }
            if (this.bathroomNumber!= null) {
                Integer sourceBathroomNumber;
                sourceBathroomNumber = this.getBathroomNumber();
                Integer copyBathroomNumber = ((Integer) strategy.copy(LocatorUtils.property(locator, "bathroomNumber", sourceBathroomNumber), sourceBathroomNumber));
                copy.setBathroomNumber(copyBathroomNumber);
            } else {
                copy.bathroomNumber = null;
            }
            if (this.bedroomNumber!= null) {
                Integer sourceBedroomNumber;
                sourceBedroomNumber = this.getBedroomNumber();
                Integer copyBedroomNumber = ((Integer) strategy.copy(LocatorUtils.property(locator, "bedroomNumber", sourceBedroomNumber), sourceBedroomNumber));
                copy.setBedroomNumber(copyBedroomNumber);
            } else {
                copy.bedroomNumber = null;
            }
            if (this.furnished!= null) {
                OverseasRentalAdType.Furnished sourceFurnished;
                sourceFurnished = this.getFurnished();
                OverseasRentalAdType.Furnished copyFurnished = ((OverseasRentalAdType.Furnished) strategy.copy(LocatorUtils.property(locator, "furnished", sourceFurnished), sourceFurnished));
                copy.setFurnished(copyFurnished);
            } else {
                copy.furnished = null;
            }
            if (this.cableTelevision!= null) {
                Boolean sourceCableTelevision;
                sourceCableTelevision = this.getCableTelevision();
                Boolean copyCableTelevision = ((Boolean) strategy.copy(LocatorUtils.property(locator, "cableTelevision", sourceCableTelevision), sourceCableTelevision));
                copy.setCableTelevision(copyCableTelevision);
            } else {
                copy.cableTelevision = null;
            }
            if (this.washingMachine!= null) {
                Boolean sourceWashingMachine;
                sourceWashingMachine = this.getWashingMachine();
                Boolean copyWashingMachine = ((Boolean) strategy.copy(LocatorUtils.property(locator, "washingMachine", sourceWashingMachine), sourceWashingMachine));
                copy.setWashingMachine(copyWashingMachine);
            } else {
                copy.washingMachine = null;
            }
            if (this.dryer!= null) {
                Boolean sourceDryer;
                sourceDryer = this.getDryer();
                Boolean copyDryer = ((Boolean) strategy.copy(LocatorUtils.property(locator, "dryer", sourceDryer), sourceDryer));
                copy.setDryer(copyDryer);
            } else {
                copy.dryer = null;
            }
            if (this.dishwasher!= null) {
                Boolean sourceDishwasher;
                sourceDishwasher = this.getDishwasher();
                Boolean copyDishwasher = ((Boolean) strategy.copy(LocatorUtils.property(locator, "dishwasher", sourceDishwasher), sourceDishwasher));
                copy.setDishwasher(copyDishwasher);
            } else {
                copy.dishwasher = null;
            }
            if (this.microwave!= null) {
                Boolean sourceMicrowave;
                sourceMicrowave = this.getMicrowave();
                Boolean copyMicrowave = ((Boolean) strategy.copy(LocatorUtils.property(locator, "microwave", sourceMicrowave), sourceMicrowave));
                copy.setMicrowave(copyMicrowave);
            } else {
                copy.microwave = null;
            }
            if (this.singleBeds!= null) {
                Integer sourceSingleBeds;
                sourceSingleBeds = this.getSingleBeds();
                Integer copySingleBeds = ((Integer) strategy.copy(LocatorUtils.property(locator, "singleBeds", sourceSingleBeds), sourceSingleBeds));
                copy.setSingleBeds(copySingleBeds);
            } else {
                copy.singleBeds = null;
            }
            if (this.doubleBeds!= null) {
                Integer sourceDoubleBeds;
                sourceDoubleBeds = this.getDoubleBeds();
                Integer copyDoubleBeds = ((Integer) strategy.copy(LocatorUtils.property(locator, "doubleBeds", sourceDoubleBeds), sourceDoubleBeds));
                copy.setDoubleBeds(copyDoubleBeds);
            } else {
                copy.doubleBeds = null;
            }
            if (this.twinBeds!= null) {
                Integer sourceTwinBeds;
                sourceTwinBeds = this.getTwinBeds();
                Integer copyTwinBeds = ((Integer) strategy.copy(LocatorUtils.property(locator, "twinBeds", sourceTwinBeds), sourceTwinBeds));
                copy.setTwinBeds(copyTwinBeds);
            } else {
                copy.twinBeds = null;
            }
            if (this.numberPeople!= null) {
                Integer sourceNumberPeople;
                sourceNumberPeople = this.getNumberPeople();
                Integer copyNumberPeople = ((Integer) strategy.copy(LocatorUtils.property(locator, "numberPeople", sourceNumberPeople), sourceNumberPeople));
                copy.setNumberPeople(copyNumberPeople);
            } else {
                copy.numberPeople = null;
            }
            if (this.availableFrom!= null) {
                Calendar sourceAvailableFrom;
                sourceAvailableFrom = this.getAvailableFrom();
                Calendar copyAvailableFrom = ((Calendar) strategy.copy(LocatorUtils.property(locator, "availableFrom", sourceAvailableFrom), sourceAvailableFrom));
                copy.setAvailableFrom(copyAvailableFrom);
            } else {
                copy.availableFrom = null;
            }
            if (this.lease!= null) {
                Integer sourceLease;
                sourceLease = this.getLease();
                Integer copyLease = ((Integer) strategy.copy(LocatorUtils.property(locator, "lease", sourceLease), sourceLease));
                copy.setLease(copyLease);
            } else {
                copy.lease = null;
            }
            if (this.phone1 != null) {
                java.lang.String sourcePhone1;
                sourcePhone1 = this.getPhone1();
                java.lang.String copyPhone1 = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "phone1", sourcePhone1), sourcePhone1));
                copy.setPhone1(copyPhone1);
            } else {
                copy.phone1 = null;
            }
            if (this.phone2 != null) {
                java.lang.String sourcePhone2;
                sourcePhone2 = this.getPhone2();
                java.lang.String copyPhone2 = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "phone2", sourcePhone2), sourcePhone2));
                copy.setPhone2(copyPhone2);
            } else {
                copy.phone2 = null;
            }
            if (this.contactName!= null) {
                java.lang.String sourceContactName;
                sourceContactName = this.getContactName();
                java.lang.String copyContactName = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "contactName", sourceContactName), sourceContactName));
                copy.setContactName(copyContactName);
            } else {
                copy.contactName = null;
            }
            if (this.phoneInfo!= null) {
                java.lang.String sourcePhoneInfo;
                sourcePhoneInfo = this.getPhoneInfo();
                java.lang.String copyPhoneInfo = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "phoneInfo", sourcePhoneInfo), sourcePhoneInfo));
                copy.setPhoneInfo(copyPhoneInfo);
            } else {
                copy.phoneInfo = null;
            }
            if (this.mainEmail!= null) {
                java.lang.String sourceMainEmail;
                sourceMainEmail = this.getMainEmail();
                java.lang.String copyMainEmail = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "mainEmail", sourceMainEmail), sourceMainEmail));
                copy.setMainEmail(copyMainEmail);
            } else {
                copy.mainEmail = null;
            }
            if (this.ccEmail!= null) {
                java.lang.String sourceCcEmail;
                sourceCcEmail = this.getCcEmail();
                java.lang.String copyCcEmail = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "ccEmail", sourceCcEmail), sourceCcEmail));
                copy.setCcEmail(copyCcEmail);
            } else {
                copy.ccEmail = null;
            }
            if (this.externalId!= null) {
                java.lang.String sourceExternalId;
                sourceExternalId = this.getExternalId();
                java.lang.String copyExternalId = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "externalId", sourceExternalId), sourceExternalId));
                copy.setExternalId(copyExternalId);
            } else {
                copy.externalId = null;
            }
            if (this.agentId!= null) {
                java.lang.String sourceAgentId;
                sourceAgentId = this.getAgentId();
                java.lang.String copyAgentId = ((java.lang.String) strategy.copy(LocatorUtils.property(locator, "agentId", sourceAgentId), sourceAgentId));
                copy.setAgentId(copyAgentId);
            } else {
                copy.agentId = null;
            }
            if (this.photos!= null) {
                PhotosType sourcePhotos;
                sourcePhotos = this.getPhotos();
                PhotosType copyPhotos = ((PhotosType) strategy.copy(LocatorUtils.property(locator, "photos", sourcePhotos), sourcePhotos));
                copy.setPhotos(copyPhotos);
            } else {
                copy.photos = null;
            }
            if (this.features!= null) {
                FeaturesType sourceFeatures;
                sourceFeatures = this.getFeatures();
                FeaturesType copyFeatures = ((FeaturesType) strategy.copy(LocatorUtils.property(locator, "features", sourceFeatures), sourceFeatures));
                copy.setFeatures(copyFeatures);
            } else {
                copy.features = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new OverseasRentalAdType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OverseasRentalAdType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OverseasRentalAdType that = ((OverseasRentalAdType) object);
        {
            String lhsCountry;
            lhsCountry = this.getCountry();
            String rhsCountry;
            rhsCountry = that.getCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "country", lhsCountry), LocatorUtils.property(thatLocator, "country", rhsCountry), lhsCountry, rhsCountry)) {
                return false;
            }
        }
        {
            java.lang.String lhsRegion;
            lhsRegion = this.getRegion();
            java.lang.String rhsRegion;
            rhsRegion = that.getRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "region", lhsRegion), LocatorUtils.property(thatLocator, "region", rhsRegion), lhsRegion, rhsRegion)) {
                return false;
            }
        }
        {
            java.lang.String lhsArea;
            lhsArea = this.getArea();
            java.lang.String rhsArea;
            rhsArea = that.getArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "area", lhsArea), LocatorUtils.property(thatLocator, "area", rhsArea), lhsArea, rhsArea)) {
                return false;
            }
        }
        {
            java.lang.String lhsAddress;
            lhsAddress = this.getAddress();
            java.lang.String rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress)) {
                return false;
            }
        }
        {
            PropertyType lhsPropertyType;
            lhsPropertyType = this.getPropertyType();
            PropertyType rhsPropertyType;
            rhsPropertyType = that.getPropertyType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyType", lhsPropertyType), LocatorUtils.property(thatLocator, "propertyType", rhsPropertyType), lhsPropertyType, rhsPropertyType)) {
                return false;
            }
        }
        {
            HouseType lhsHouseType;
            lhsHouseType = this.getHouseType();
            HouseType rhsHouseType;
            rhsHouseType = that.getHouseType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "houseType", lhsHouseType), LocatorUtils.property(thatLocator, "houseType", rhsHouseType), lhsHouseType, rhsHouseType)) {
                return false;
            }
        }
        {
            CommercialType lhsCommercialType;
            lhsCommercialType = this.getCommercialType();
            CommercialType rhsCommercialType;
            rhsCommercialType = that.getCommercialType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commercialType", lhsCommercialType), LocatorUtils.property(thatLocator, "commercialType", rhsCommercialType), lhsCommercialType, rhsCommercialType)) {
                return false;
            }
        }
        {
            java.lang.String lhsDescription;
            lhsDescription = this.getDescription();
            java.lang.String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            Integer lhsRent;
            lhsRent = this.getRent();
            Integer rhsRent;
            rhsRent = that.getRent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rent", lhsRent), LocatorUtils.property(thatLocator, "rent", rhsRent), lhsRent, rhsRent)) {
                return false;
            }
        }
        {
            OverseasRentalAdType.RentPeriod lhsRentCollectionPeriod;
            lhsRentCollectionPeriod = this.getRentCollectionPeriod();
            OverseasRentalAdType.RentPeriod rhsRentCollectionPeriod;
            rhsRentCollectionPeriod = that.getRentCollectionPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rentCollectionPeriod", lhsRentCollectionPeriod), LocatorUtils.property(thatLocator, "rentCollectionPeriod", rhsRentCollectionPeriod), lhsRentCollectionPeriod, rhsRentCollectionPeriod)) {
                return false;
            }
        }
        {
            Integer lhsBathroomNumber;
            lhsBathroomNumber = this.getBathroomNumber();
            Integer rhsBathroomNumber;
            rhsBathroomNumber = that.getBathroomNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bathroomNumber", lhsBathroomNumber), LocatorUtils.property(thatLocator, "bathroomNumber", rhsBathroomNumber), lhsBathroomNumber, rhsBathroomNumber)) {
                return false;
            }
        }
        {
            Integer lhsBedroomNumber;
            lhsBedroomNumber = this.getBedroomNumber();
            Integer rhsBedroomNumber;
            rhsBedroomNumber = that.getBedroomNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bedroomNumber", lhsBedroomNumber), LocatorUtils.property(thatLocator, "bedroomNumber", rhsBedroomNumber), lhsBedroomNumber, rhsBedroomNumber)) {
                return false;
            }
        }
        {
            OverseasRentalAdType.Furnished lhsFurnished;
            lhsFurnished = this.getFurnished();
            OverseasRentalAdType.Furnished rhsFurnished;
            rhsFurnished = that.getFurnished();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "furnished", lhsFurnished), LocatorUtils.property(thatLocator, "furnished", rhsFurnished), lhsFurnished, rhsFurnished)) {
                return false;
            }
        }
        {
            Boolean lhsCableTelevision;
            lhsCableTelevision = this.getCableTelevision();
            Boolean rhsCableTelevision;
            rhsCableTelevision = that.getCableTelevision();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cableTelevision", lhsCableTelevision), LocatorUtils.property(thatLocator, "cableTelevision", rhsCableTelevision), lhsCableTelevision, rhsCableTelevision)) {
                return false;
            }
        }
        {
            Boolean lhsWashingMachine;
            lhsWashingMachine = this.getWashingMachine();
            Boolean rhsWashingMachine;
            rhsWashingMachine = that.getWashingMachine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "washingMachine", lhsWashingMachine), LocatorUtils.property(thatLocator, "washingMachine", rhsWashingMachine), lhsWashingMachine, rhsWashingMachine)) {
                return false;
            }
        }
        {
            Boolean lhsDryer;
            lhsDryer = this.getDryer();
            Boolean rhsDryer;
            rhsDryer = that.getDryer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dryer", lhsDryer), LocatorUtils.property(thatLocator, "dryer", rhsDryer), lhsDryer, rhsDryer)) {
                return false;
            }
        }
        {
            Boolean lhsDishwasher;
            lhsDishwasher = this.getDishwasher();
            Boolean rhsDishwasher;
            rhsDishwasher = that.getDishwasher();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dishwasher", lhsDishwasher), LocatorUtils.property(thatLocator, "dishwasher", rhsDishwasher), lhsDishwasher, rhsDishwasher)) {
                return false;
            }
        }
        {
            Boolean lhsMicrowave;
            lhsMicrowave = this.getMicrowave();
            Boolean rhsMicrowave;
            rhsMicrowave = that.getMicrowave();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "microwave", lhsMicrowave), LocatorUtils.property(thatLocator, "microwave", rhsMicrowave), lhsMicrowave, rhsMicrowave)) {
                return false;
            }
        }
        {
            Integer lhsSingleBeds;
            lhsSingleBeds = this.getSingleBeds();
            Integer rhsSingleBeds;
            rhsSingleBeds = that.getSingleBeds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "singleBeds", lhsSingleBeds), LocatorUtils.property(thatLocator, "singleBeds", rhsSingleBeds), lhsSingleBeds, rhsSingleBeds)) {
                return false;
            }
        }
        {
            Integer lhsDoubleBeds;
            lhsDoubleBeds = this.getDoubleBeds();
            Integer rhsDoubleBeds;
            rhsDoubleBeds = that.getDoubleBeds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "doubleBeds", lhsDoubleBeds), LocatorUtils.property(thatLocator, "doubleBeds", rhsDoubleBeds), lhsDoubleBeds, rhsDoubleBeds)) {
                return false;
            }
        }
        {
            Integer lhsTwinBeds;
            lhsTwinBeds = this.getTwinBeds();
            Integer rhsTwinBeds;
            rhsTwinBeds = that.getTwinBeds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "twinBeds", lhsTwinBeds), LocatorUtils.property(thatLocator, "twinBeds", rhsTwinBeds), lhsTwinBeds, rhsTwinBeds)) {
                return false;
            }
        }
        {
            Integer lhsNumberPeople;
            lhsNumberPeople = this.getNumberPeople();
            Integer rhsNumberPeople;
            rhsNumberPeople = that.getNumberPeople();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberPeople", lhsNumberPeople), LocatorUtils.property(thatLocator, "numberPeople", rhsNumberPeople), lhsNumberPeople, rhsNumberPeople)) {
                return false;
            }
        }
        {
            Calendar lhsAvailableFrom;
            lhsAvailableFrom = this.getAvailableFrom();
            Calendar rhsAvailableFrom;
            rhsAvailableFrom = that.getAvailableFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "availableFrom", lhsAvailableFrom), LocatorUtils.property(thatLocator, "availableFrom", rhsAvailableFrom), lhsAvailableFrom, rhsAvailableFrom)) {
                return false;
            }
        }
        {
            Integer lhsLease;
            lhsLease = this.getLease();
            Integer rhsLease;
            rhsLease = that.getLease();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lease", lhsLease), LocatorUtils.property(thatLocator, "lease", rhsLease), lhsLease, rhsLease)) {
                return false;
            }
        }
        {
            java.lang.String lhsPhone1;
            lhsPhone1 = this.getPhone1();
            java.lang.String rhsPhone1;
            rhsPhone1 = that.getPhone1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phone1", lhsPhone1), LocatorUtils.property(thatLocator, "phone1", rhsPhone1), lhsPhone1, rhsPhone1)) {
                return false;
            }
        }
        {
            java.lang.String lhsPhone2;
            lhsPhone2 = this.getPhone2();
            java.lang.String rhsPhone2;
            rhsPhone2 = that.getPhone2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phone2", lhsPhone2), LocatorUtils.property(thatLocator, "phone2", rhsPhone2), lhsPhone2, rhsPhone2)) {
                return false;
            }
        }
        {
            java.lang.String lhsContactName;
            lhsContactName = this.getContactName();
            java.lang.String rhsContactName;
            rhsContactName = that.getContactName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactName", lhsContactName), LocatorUtils.property(thatLocator, "contactName", rhsContactName), lhsContactName, rhsContactName)) {
                return false;
            }
        }
        {
            java.lang.String lhsPhoneInfo;
            lhsPhoneInfo = this.getPhoneInfo();
            java.lang.String rhsPhoneInfo;
            rhsPhoneInfo = that.getPhoneInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phoneInfo", lhsPhoneInfo), LocatorUtils.property(thatLocator, "phoneInfo", rhsPhoneInfo), lhsPhoneInfo, rhsPhoneInfo)) {
                return false;
            }
        }
        {
            java.lang.String lhsMainEmail;
            lhsMainEmail = this.getMainEmail();
            java.lang.String rhsMainEmail;
            rhsMainEmail = that.getMainEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mainEmail", lhsMainEmail), LocatorUtils.property(thatLocator, "mainEmail", rhsMainEmail), lhsMainEmail, rhsMainEmail)) {
                return false;
            }
        }
        {
            java.lang.String lhsCcEmail;
            lhsCcEmail = this.getCcEmail();
            java.lang.String rhsCcEmail;
            rhsCcEmail = that.getCcEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ccEmail", lhsCcEmail), LocatorUtils.property(thatLocator, "ccEmail", rhsCcEmail), lhsCcEmail, rhsCcEmail)) {
                return false;
            }
        }
        {
            java.lang.String lhsExternalId;
            lhsExternalId = this.getExternalId();
            java.lang.String rhsExternalId;
            rhsExternalId = that.getExternalId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "externalId", lhsExternalId), LocatorUtils.property(thatLocator, "externalId", rhsExternalId), lhsExternalId, rhsExternalId)) {
                return false;
            }
        }
        {
            java.lang.String lhsAgentId;
            lhsAgentId = this.getAgentId();
            java.lang.String rhsAgentId;
            rhsAgentId = that.getAgentId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agentId", lhsAgentId), LocatorUtils.property(thatLocator, "agentId", rhsAgentId), lhsAgentId, rhsAgentId)) {
                return false;
            }
        }
        {
            PhotosType lhsPhotos;
            lhsPhotos = this.getPhotos();
            PhotosType rhsPhotos;
            rhsPhotos = that.getPhotos();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "photos", lhsPhotos), LocatorUtils.property(thatLocator, "photos", rhsPhotos), lhsPhotos, rhsPhotos)) {
                return false;
            }
        }
        {
            FeaturesType lhsFeatures;
            lhsFeatures = this.getFeatures();
            FeaturesType rhsFeatures;
            rhsFeatures = that.getFeatures();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "features", lhsFeatures), LocatorUtils.property(thatLocator, "features", rhsFeatures), lhsFeatures, rhsFeatures)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="furnished"/>
     *     &lt;enumeration value="unfurnished"/>
     *     &lt;enumeration value="either"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum Furnished {

        @XmlEnumValue("furnished")
        FURNISHED("furnished"),
        @XmlEnumValue("unfurnished")
        UNFURNISHED("unfurnished"),
        @XmlEnumValue("either")
        EITHER("either");
        private final java.lang.String value;

        Furnished(java.lang.String v) {
            value = v;
        }

        public java.lang.String value() {
            return value;
        }

        public static OverseasRentalAdType.Furnished fromValue(java.lang.String v) {
            for (OverseasRentalAdType.Furnished c: OverseasRentalAdType.Furnished.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="weekly"/>
     *     &lt;enumeration value="monthly"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum RentPeriod {

        @XmlEnumValue("weekly")
        WEEKLY("weekly"),
        @XmlEnumValue("monthly")
        MONTHLY("monthly");
        private final java.lang.String value;

        RentPeriod(java.lang.String v) {
            value = v;
        }

        public java.lang.String value() {
            return value;
        }

        public static OverseasRentalAdType.RentPeriod fromValue(java.lang.String v) {
            for (OverseasRentalAdType.RentPeriod c: OverseasRentalAdType.RentPeriod.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
