package flexagon.fd.core;

import flexagon.ff.common.core.pojos.BasePOJO;
import flexagon.ff.common.core.properties.FlexProperties;
import flexagon.ff.common.core.properties.PropertiesLoaderType;
import flexagon.ff.common.core.utils.FlexCommonUtils;
import flexagon.ff.common.core.utils.FlexDateTimeUtils;

import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class FlexDeployVersion
  extends BasePOJO
{
  @SuppressWarnings("compatibility:348834486360708062")
  private static final long serialVersionUID = 2301833236731883064L;

  private String mMajorVersion;
  private String mMinorVersion;
  private String mBuildNumber;

  private String mBuildDate;
  private String mBuildTime;

  public FlexDeployVersion()
  {
    super();
    initialize();
  }

  private void initialize()
  {
    FlexProperties p = new FlexProperties("flexagon.fd.core.FlexDeployVersion.properties", PropertiesLoaderType.FILE);
    mMajorVersion = p.getString("Major");
    mMinorVersion = p.getString("Minor");
    mBuildNumber = p.getString("BuildNumber");
    mBuildDate = p.getString("BuildDate");
    mBuildTime = p.getString("BuildTime");
  }

  public String getFullVersion()
  {
    return mMajorVersion + "." + mMinorVersion + "." + mBuildNumber;
  }

  public String getBuildDateTime()
  {
    return mBuildDate + " " + mBuildTime;
  }

  public String getMajorVersion()
  {
    return mMajorVersion;
  }

  public String getMinorVersion()
  {
    return mMinorVersion;
  }

  public String getBuildNumber()
  {
    return mBuildNumber;
  }

  public String getBuildDate()
  {
    return mBuildDate;
  }

  public String getBuildTime()
  {
    return mBuildTime;
  }

  public String getCopyrightMessage()
  {
    String currentYear = FlexDateTimeUtils.getYear(new Date(), TimeZone.getDefault()) + "";

    return "Copyright © 2014-" + currentYear + " Flexagon.  All rights reserved.";
  }

  public String getDownloadURL()
  {
    String thirdPartOfVersion = "";
    List<String> buildNumberParts = FlexCommonUtils.splitByDot(mBuildNumber);
    if (buildNumberParts.size() >= 1)
    {
      thirdPartOfVersion = buildNumberParts.get(0);
    }
    return "https://flexagon.com/downloads/plugins/" + mMajorVersion + "." + mMinorVersion + "." + thirdPartOfVersion;
  }

  public static void main(String[] args)
  {
    FlexDeployVersion v = new FlexDeployVersion();
    System.out.println("Version = " + v.getFullVersion());
    System.out.println("Build Time = " + v.getBuildDateTime());
    System.out.println("Plugin Download URL = " + v.getDownloadURL());
  }
}
