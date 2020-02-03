package flexagon.fd.core.enums;


/**
 * An enumerated type defining a FlexDeploy project type.  For most types of projects the project type will be null, as this is currently only used
 * for partial deployment and EBS (whether partial deployment or full deployment).
 *
 * The values here must match those in FD_LIST.
 */
public enum ProjectTypeEnum
{
  GENERAL,
  EBS,
  PARTIAL_FILE,
  PARTIAL_JDBC,
  OracleForms,
  ORACLE_DB,
  ORACLE_BI,
  ORACLE_APEX,
  MFT,
  SALESFORCE,
  UTILITY,
  MDS,
  GENERIC
}
