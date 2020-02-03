
package flexagon.fd.core.partial.jaxb.build;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="BuildObject" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PackageObjectId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="ObjectPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ObjectTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ObjectHash" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "", propOrder = { "buildObject" })
@XmlRootElement(name = "BuildManifest")
public class BuildManifest
  implements Serializable
{

  @XmlElement(name = "BuildObject", required = true)
  protected List<BuildObject> buildObject;

  /**
   * Gets the value of the buildObject property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the buildObject property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBuildObject().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link BuildObject }
   *
   *
   */
  public List<BuildObject> getBuildObject()
  {
    if (buildObject == null)
    {
      buildObject = new ArrayList<BuildObject>();
    }
    return this.buildObject;
  }

}
