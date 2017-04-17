//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.17 at 03:16:44 PM AEST 
//


package au.com.scds.agric.fixture.xml.generated;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A batch of product, efficiently created in bulk for
 * 				subdivision into product-item lots.
 * 			
 * 
 * <p>Java class for Batch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Batch">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.org/AgricProducerSchema}Sampled">
 *       &lt;sequence>
 *         &lt;element name="product-line" type="{http://www.example.org/AgricProducerSchema}ProductLine"/>
 *         &lt;element name="created-on" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="created-by" type="{http://www.example.org/AgricProducerSchema}Person"/>
 *         &lt;element name="scheduled-for" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="completed-on" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="completed-by" type="{http://www.example.org/AgricProducerSchema}Person" minOccurs="0"/>
 *         &lt;element name="specification" type="{http://www.example.org/AgricProducerSchema}Specification" minOccurs="0"/>
 *         &lt;element name="batch-component" type="{http://www.example.org/AgricProducerSchema}BatchComponent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="orderline-portion" type="{http://www.example.org/AgricProducerSchema}OrderLineBatch" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="product-item" type="{http://www.example.org/AgricProducerSchema}ProductItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Batch", propOrder = {
    "productLine",
    "createdOn",
    "createdBy",
    "scheduledFor",
    "completedOn",
    "completedBy",
    "specification",
    "batchComponent",
    "orderlinePortion",
    "productItem"
})
public class Batch
    extends Sampled
{

    @XmlElement(name = "product-line", required = true)
    protected ProductLine productLine;
    @XmlElement(name = "created-on", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date createdOn;
    @XmlElement(name = "created-by", required = true)
    protected Person createdBy;
    @XmlElement(name = "scheduled-for", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date scheduledFor;
    @XmlElement(name = "completed-on", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date completedOn;
    @XmlElement(name = "completed-by")
    protected Person completedBy;
    protected Specification specification;
    @XmlElement(name = "batch-component")
    protected List<BatchComponent> batchComponent;
    @XmlElement(name = "orderline-portion")
    protected List<OrderLineBatch> orderlinePortion;
    @XmlElement(name = "product-item")
    protected List<ProductItem> productItem;

    /**
     * Gets the value of the productLine property.
     * 
     * @return
     *     possible object is
     *     {@link ProductLine }
     *     
     */
    public ProductLine getProductLine() {
        return productLine;
    }

    /**
     * Sets the value of the productLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductLine }
     *     
     */
    public void setProductLine(ProductLine value) {
        this.productLine = value;
    }

    /**
     * Gets the value of the createdOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets the value of the createdOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedOn(Date value) {
        this.createdOn = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setCreatedBy(Person value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the scheduledFor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getScheduledFor() {
        return scheduledFor;
    }

    /**
     * Sets the value of the scheduledFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledFor(Date value) {
        this.scheduledFor = value;
    }

    /**
     * Gets the value of the completedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCompletedOn() {
        return completedOn;
    }

    /**
     * Sets the value of the completedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletedOn(Date value) {
        this.completedOn = value;
    }

    /**
     * Gets the value of the completedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getCompletedBy() {
        return completedBy;
    }

    /**
     * Sets the value of the completedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setCompletedBy(Person value) {
        this.completedBy = value;
    }

    /**
     * Gets the value of the specification property.
     * 
     * @return
     *     possible object is
     *     {@link Specification }
     *     
     */
    public Specification getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Specification }
     *     
     */
    public void setSpecification(Specification value) {
        this.specification = value;
    }

    /**
     * Gets the value of the batchComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchComponent }
     * 
     * 
     */
    public List<BatchComponent> getBatchComponent() {
        if (batchComponent == null) {
            batchComponent = new ArrayList<BatchComponent>();
        }
        return this.batchComponent;
    }

    /**
     * Gets the value of the orderlinePortion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderlinePortion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderlinePortion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderLineBatch }
     * 
     * 
     */
    public List<OrderLineBatch> getOrderlinePortion() {
        if (orderlinePortion == null) {
            orderlinePortion = new ArrayList<OrderLineBatch>();
        }
        return this.orderlinePortion;
    }

    /**
     * Gets the value of the productItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductItem }
     * 
     * 
     */
    public List<ProductItem> getProductItem() {
        if (productItem == null) {
            productItem = new ArrayList<ProductItem>();
        }
        return this.productItem;
    }

}
