//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.13 at 09:29:52 PM AEST 
//


package au.com.scds.agric.fixture.xml.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				A suite (set) of tests and/or test-groups that can be
 * 				applied to a Sample, usually of a specific type of
 * 				Sampled
 * 			
 * 
 * <p>Java class for TestSuite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestSuite">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.org/AgricProducerSchema}Test">
 *       &lt;sequence>
 *         &lt;element name="test-single" type="{http://www.example.org/AgricProducerSchema}TestSingle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="test-group" type="{http://www.example.org/AgricProducerSchema}TestGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestSuite", propOrder = {
    "testSingle",
    "testGroup"
})
public class TestSuite
    extends Test
{

    @XmlElement(name = "test-single")
    protected List<TestSingle> testSingle;
    @XmlElement(name = "test-group")
    protected List<TestGroup> testGroup;

    /**
     * Gets the value of the testSingle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSingle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSingle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSingle }
     * 
     * 
     */
    public List<TestSingle> getTestSingle() {
        if (testSingle == null) {
            testSingle = new ArrayList<TestSingle>();
        }
        return this.testSingle;
    }

    /**
     * Gets the value of the testGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestGroup }
     * 
     * 
     */
    public List<TestGroup> getTestGroup() {
        if (testGroup == null) {
            testGroup = new ArrayList<TestGroup>();
        }
        return this.testGroup;
    }

}
