
package flexagon.fd.core.partial.jaxb.build;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="PackageObjectId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ObjectPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ObjectTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ObjectHash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "packageObjectId", "objectPath", "objectTypeCode", "objectHash" })
public class BuildObject
  implements Serializable
{

  @XmlElement(name = "PackageObjectId")
  protected long packageObjectId;
  @XmlElement(name = "ObjectPath", required = true)
  protected String objectPath;
  @XmlElement(name = "ObjectTypeCode", required = true)
  protected String objectTypeCode;
  @XmlElement(name = "ObjectHash", required = true)
  protected String objectHash;

  /**
   * Gets the value of the packageObjectId property.
   *
   */
  public long getPackageObjectId()
  {
    return packageObjectId;
  }

  /**
   * Sets the value of the packageObjectId property.
   *
   */
  public void setPackageObjectId(long value)
  {
    this.packageObjectId = value;
  }

  /**
   * Gets the value of the objectPath property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getObjectPath()
  {
    return objectPath;
  }

  /**
   * Sets the value of the objectPath property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setObjectPath(String value)
  {
    this.objectPath = value;
  }

  /**
   * Gets the value of the objectTypeCode property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getObjectTypeCode()
  {
    return objectTypeCode;
  }

  /**
   * Sets the value of the objectTypeCode property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setObjectTypeCode(String value)
  {
    this.objectTypeCode = value;
  }

  /**
   * Gets the value of the objectHash property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getObjectHash()
  {
    return objectHash;
  }

  /**
   * Sets the value of the objectHash property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setObjectHash(String value)
  {
    this.objectHash = value;
  }

}
