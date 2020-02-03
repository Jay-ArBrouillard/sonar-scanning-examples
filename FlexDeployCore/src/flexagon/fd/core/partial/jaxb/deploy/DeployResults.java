
package flexagon.fd.core.partial.jaxb.deploy;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DeployObject" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PackageObjectId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="ObjectPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ObjectTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="Status" type="{http://flexagon.com/partial/results}StatusType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "startTime", "endTime", "deployObject" })
@XmlRootElement(name = "DeployResults")
public class DeployResults
  implements Serializable
{

  @XmlElement(name = "StartTime", required = true, type = String.class)
  @XmlJavaTypeAdapter(Adapter1.class)
  @XmlSchemaType(name = "dateTime")
  protected Calendar startTime;
  @XmlElement(name = "EndTime", required = true, type = String.class)
  @XmlJavaTypeAdapter(Adapter1.class)
  @XmlSchemaType(name = "dateTime")
  protected Calendar endTime;
  @XmlElement(name = "DeployObject", required = true)
  protected List<DeployObject> deployObject;

  /**
   * Gets the value of the startTime property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public Calendar getStartTime()
  {
    return startTime;
  }

  /**
   * Sets the value of the startTime property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setStartTime(Calendar value)
  {
    this.startTime = value;
  }

  /**
   * Gets the value of the endTime property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public Calendar getEndTime()
  {
    return endTime;
  }

  /**
   * Sets the value of the endTime property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setEndTime(Calendar value)
  {
    this.endTime = value;
  }

  /**
   * Gets the value of the deployObject property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the deployObject property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDeployObject().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link DeployObject }
   *
   *
   */
  public List<DeployObject> getDeployObject()
  {
    if (deployObject == null)
    {
      deployObject = new ArrayList<DeployObject>();
    }
    return this.deployObject;
  }

}
