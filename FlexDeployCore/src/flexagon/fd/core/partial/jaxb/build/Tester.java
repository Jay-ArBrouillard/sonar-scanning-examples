package flexagon.fd.core.partial.jaxb.build;

import flexagon.fd.core.partial.pojo.PackageObject;
import flexagon.fd.core.partial.util.BuildManifestXMLUtil;

import flexagon.ff.common.core.exceptions.FlexCheckedException;

import java.io.StringReader;

import java.util.List;

public class Tester
{
  public Tester()
  {
    super();
  }

  public static void main(String args[])
    throws FlexCheckedException
  {
    String xml =
      "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
      "<BuildManifest xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://flexagon.com/partial/manifest src/flexagon/fd/core/partial/jaxb/build/BuildManifest.xsd\"\n" +
      "               xmlns=\"http://flexagon.com/partial/manifest\">\n" + "  <BuildObject>\n" + "    <PackageObjectId>2000</PackageObjectId>\n" + "    <ObjectPath>foo/bar</ObjectPath>\n" +
      "    <ObjectTypeCode>AOL</ObjectTypeCode>\n" + "    <ObjectHash>12sadfw3423sd</ObjectHash>\n" + "  </BuildObject>\n" + "  <BuildObject>\n" + "    <PackageObjectId>2001</PackageObjectId>\n" +
      "    <ObjectPath>big/kahuna</ObjectPath>\n" + "    <ObjectTypeCode>SQL</ObjectTypeCode>\n" + "    <ObjectHash>43gg34thg4</ObjectHash>\n" + "  </BuildObject>\n" + "</BuildManifest>";


    List<PackageObject> pos = BuildManifestXMLUtil.singleton().unmarshal(new StringReader(xml));
    for (PackageObject p: pos)
    {
      System.out.println(p.getObjectHash());
      System.out.println(p.getPackageObjectId());
      System.out.println(p.getProjectObject().getObjectPath());
      System.out.println(p.getProjectObject().getObjectTypeCode());
    }


    String xml2 = BuildManifestXMLUtil.singleton().marshal(pos);
    System.out.println(xml2);
  }
}
