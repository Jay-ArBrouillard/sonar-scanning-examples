package flexagon.fd.core;


public class FlexDeployConstants
{
  public static final String INSTALL_DIR_ENV_NAME = "flexagon.fd.install.root";
  // sub-directories of <install root>/server
  public static final String WORK_SUBDIRECTORY = "work";
  public static final String PLUGINS_SUBDIRECTORY = "plugins";
  // sub-directories of <install root>/work/<project id>/<workflow execution id>
  public static final String ARTIFACTS_SUBDIRECTORY = "artifacts";
  public static final String TEMP_SUBDIRECTORY = "temp";
  public static final String INTERNAL_SUBDIRECTORY = "internal";
  public static final String REPORTS_SUBDIRECTORY = "reports";
  public static final String TEST_RESULTS_SUBDIRECTORY = "test-results";
  public static final String OBJECT_RESULTS_SUBDIRECTORY = "object-results";
  public static final String TRANSFER_SUBDIRECTORY = "transfer";
  public static final String PROJECT_SOURCES_SUBDIRECTORY = "project-sources";
  // sub-directories of INTERNAL_SUBDIRECTORY - <install root>/work/<project id>/<workflow execution id>/internal
  public static final String SIGNALS_SUBDIRECTORY = "signals";

  // signal files under SIGNALS_SUBDIRECTORY - <install root>/work/<project id>/<workflow execution id>/internal/signals
  public static final String ABORT_SIGNAL = "abort";

  public static final String BEGIN_TOKEN = "${{";
  public static final String END_TOKEN = "}}";
  public static final String LINE_SEPARATOR = System.getProperty("line.separator");

  // Yes No LOV
  // Static LOV, no list name defined
  public static final String YES = "Y";
  public static final String NO = "N";

  public static final String INSTANCE_PROPERTY_SEP = ":";

  public static final String NOT_CONFIGURED_PROPERTY_VALUE = "<NOT CONFIGURED>";
  public static final String OPTIONAL_PROPERTY_VALUE = "<OPTIONAL>";
  public static final String CREDENTIAL_PROPERTY_VALUE = "<CREDENTIAL>";

  /*
   * 4.6 Pipeline Metadata Changes
   * Pipeline metadata use the same LOV for mapping dataType attribute.
   * Release inherits the pipeline metadata and also have other release context
   * execution variables. The ReleaseContext execution variables can be different tyes like
   * OBJECT or DECIMAL which may not be a valid PROPERTY_KEY_DATATYPE LOV.
   *
   * NOTE: VariableTypeEnum should always have all the types defined in PROPERTY_KEY_DATATYPE
   * LOV and may have extra datatypes specific for release.
   *
   * In order to keep it in sync, whenever PROPERTY_KEY_DATATYPE LOV is modified, please remember to
   * sync VariableTypeEnum with changes.
   *
   * @see flexagon.fd.model.enums.release.VariableTypeEnum for more details
   *
   * Vijay G, March 15, 2018
   */
  // Data Types LOV
  public static final String LOV_LIST_NAME_PROPERTY_KEY_DATATYPE = "PROPERTY_KEY_DATATYPE";
  public static final String PROPERTY_DATATYPE_STRING = "String";
  public static final String PROPERTY_DATATYPE_INTEGER = "Integer";
  public static final String PROPERTY_DATATYPE_BOOLEAN = "Boolean";
  public static final String PROPERTY_DATATYPE_LONG = "Long";
  public static final String PROPERTY_DATATYPE_DOUBLE = "Double";
  public static final String PROPERTY_DATATYPE_FLOAT = "Float";
  public static final String PROPERTY_NOT_CONFIGURED = "<NOT CONFIGURED>";

  public static final String METADATA_TYPE_PROPERTY = "P";
  public static final String METADATA_TYPE_INPUT = "I";
  public static final String METADATA_TYPE_VARIABLE = "V";

  //EBS Partial Deployment object type Codes
  public static final String OBJ_TYPE_JAVA = "OAF_JAVA";
  public static final String OBJ_TYPE_OAF_MDS = "OAF_MDS";
  public static final String OBJ_TYPE_CP_SQL = "CP_SQL";
  public static final String OBJ_TYPE_JAVA_SP = "JAVA_SP";
  public static final String OBJ_TYPE_SQL = "SQL";
  public static final String OBJ_TYPE_XDF = "XDF";
  public static final String OBJ_TYPE_SQL_LDR = "SQL_LDR";
  public static final String OBJ_TYPE_JLT = "JLT";
  public static final String OBJ_TYPE_AOL = "AOL";
  public static final String OBJ_TYPE_FORM = "FORM";
  public static final String OBJ_TYPE_MENU = "MENU";
  public static final String OBJ_TYPE_REPORT = "REPORT";
  public static final String OBJ_TYPE_WORKFLOW_DEF = "WORKFLOW_DEFINITION";
  public static final String OBJ_TYPE_WORKFLOW_XML = "WORKFLOW_XML";
  public static final String OBJ_TYPE_SETUPS = "SETUPS";
  public static final String OBJ_TYPE_LIBRARY = "LIBRARY";
  public static final String OBJ_TYPE_PUBLISHER = "PUBLISHER";
  public static final String OBJ_TYPE_PROG = "PROG";
  public static final String OBJ_TYPE_FONT = "FONT";
  public static final String OBJ_TYPE_SCRIPT = "SCRIPT";
  public static final String OBJ_TYPE_PM = "PERL_MODULE";
  public static final String OBJ_TYPE_MEDIA = "MEDIA";
  public static final String OBJ_TYPE_HTML = "HTML";
  public static final String OBJ_TYPE_OTHER = "OTHER";
  public static final String OBJ_TYPE_WEB_ADI = "WEB_ADI";
  public static final String OBJ_TYPE_DATA_FIX = "DATA_FIX";
  public static final String OBJ_TYPE_IGNORE = "__IGNORE__";

  //MDS Objects
  public static final String OBJ_TYPE_WSDL = "WSDL";
  public static final String OBJ_TYPE_XSD = "XSD";
  public static final String OBJ_TYPE_DVM = "DVM";
  public static final String OBJ_TYPE_XSLT = "XSLT";
  public static final String OBJ_TYPE_XREF = "XREF";


  // mft object types
  public static final String OBJ_TYPE_ARTIFACT = "ARTIFACT";
  public static final String OBJ_TYPE_USER_PROPERTIES = "USER_PROPERTIES";

  //Partial Deployment EBS objects attributes - common ones for all EBS objects
  public static final String OBJECT_ATTRIBUTE_SOURCE = "SOURCE";
  public static final String OBJECT_ATTRIBUTE_TARGET_LOCATION = "TARGET_LOCATION";
  public static final String OBJECT_ATTRIBUTE_DEPLOY_COMMAND = "DEPLOY_COMMAND";
  //Source Attribute Value SCM
  public static final String OBJECT_ATTRIBUTE_SOURCE_SCM = "SCM";

  //EBS object - AOL attributes
  public static final String OBJECT_ATTRIBUTE_AOL_NAME = "NAME";
  public static final String OBJECT_ATTRIBUTE_AOL_TYPE = "TYPE";
  public static final String OBJECT_ATTRIBUTE_AOL_CONTROL_FILE = "CONTROL_FILE";
  public static final String OBJECT_ATTRIBUTE_AOL_UPLOAD_MODE = "UPLOAD_MODE";
  public static final String OBJECT_ATTRIBUTE_AOL_CUSTOM_MODE = "CUSTOM_MODE";
  public static final String OBJECT_ATTRIBUTE_AOL_PARAMS = "ADDITIONAL_PARAMS";

  //EBS object - SQL attributes
  public static final String OBJECT_ATTRIBUTE_SQL_TYPE = "TYPE";
  public static final String OBJECT_ATTRIBUTE_SQL_SCHEMA = "SCHEMA";

  //EBS object - FORMS attributes
  public static final String OBJECT_ATTRIBUTE_FORMS_TYPE = "TYPE";
  public static final String OBJECT_ATTRIBUTE_FORMS_CLASSPATH = "CLASSPATH";
  public static final String OBJECT_ATTRIBUTE_FORMS_COUNTRY = "COUNTRY";
  public static final String OBJECT_ATTRIBUTE_FORMS_MODULE_TYPE = "MODULE_TYPE";
  public static final String OBJECT_ATTRIBUTE_FORMS_COMPILE_ALL = "COMPILE_ALL";
  public static final String OBJECT_ATTRIBUTE_FORMS_STAGE_LOCATION = "STAGE_LOCATION";
  public static final String OBJECT_ATTRIBUTE_FORMS_PARAMS = "ADDITIONAL_PARAMS";

  //EBS object - REPORTS attributes
  public static final String OBJECT_ATTRIBUTE_REPORTS_COUNTRY = "COUNTRY";

  //EBS object - PUBLISHER attributes
  public static final String OBJECT_ATTRIBUTE_PUBLISHER_LOB_TYPE = "LOB_TYPE";
  public static final String OBJECT_ATTRIBUTE_PUBLISHER_LOB_CODE = "LOB_CODE";
  public static final String OBJECT_ATTRIBUTE_PUBLISHER_LANGUAGE = "LANGUAGE";
  public static final String OBJECT_ATTRIBUTE_PUBLISHER_TERRITORY = "TERRITORY";
  public static final String OBJECT_ATTRIBUTE_PUBLISHER_NLS_LANG = "NLS_LANG";
  public static final String OBJECT_ATTRIBUTE_PUBLISHER_XDO_FILE_TYPE = "XDO_FILE_TYPE";

  //EBS object - OAF MDS attributes
  public static final String OBJECT_ATTRIBUTE_JAVA_TYPE = "TYPE";
  public static final String OBJECT_ATTRIBUTE_JAVA_CLASSPATH = "CLASSPATH";

  //EBS object - OAF MDS attributes
  public static final String OBJECT_ATTRIBUTE_MDS_ROOT_DIR = "ROOT_DIRECTORY";

  //EBS object - Java SP attributes
  public static final String OBJECT_ATTRIBUTE_JAVA_SP_FORCE = "FORCE";

  //EBS object - SQL*Ldr attributes
  public static final String OBJECT_ATTRIBUTE_SQLLDR_LOG_FILE = "LOG_FILE";

  //EBS object - XDF attributes
  public static final String OBJECT_ATTRIBUTE_XDF_PRIMARY_OBJECT_SCHEMA = "PRIMARY_OBJECT_SCHEMA";
  public static final String OBJECT_ATTRIBUTE_XDF_PRIMARY_OBJECT_PASSWORD = "PRIMARY_OBJECT_PASSWORD";
  public static final String OBJECT_ATTRIBUTE_XDF_JDBC_PROTOCOL = "JDBC_PROTOCOL";
  public static final String OBJECT_ATTRIBUTE_XDF_TYPE = "TYPE";
  public static final String OBJECT_ATTRIBUTE_XSL_DIRECTORY = "XSL_DIRECTORY";

  //EBS object - JLT attributes
  public static final String OBJECT_ATTRIBUTE_JLT_JDBC_PROTOCOL = "JDBC_PROTOCOL";
  public static final String OBJECT_ATTRIBUTE_JLT_MODE = "MODE";
  public static final String OBJECT_ATTRIBUTE_JLT_LANG = "LANG";

  //EBS object - WF Def attributes
  public static final String OBJECT_ATTRIBUTE_WFD_UPLOAD_MODE = "UPLOAD_MODE";

  //EBS object - WF XML attributes
  public static final String OBJECT_ATTRIBUTE_WFX_FORCE = "FORCE";
  public static final String OBJECT_ATTRIBUTE_WFX_JDBC_PROTOCOL = "JDBC_PROTOCOL";
  public static final String OBJECT_ATTRIBUTE_WFX_LANG = "LANG";
  public static final String OBJECT_ATTRIBUTE_WFX_CLASSPATH = "CLASSPATH";

  //SQL Extensions in order
  public static final String SQL_EXTS = "SEQ TBL IDX TYP TPS TPB SQL PKH PLB PKS PKB PLS PCK FNC TRG SPC BDY PRC";
  //Publisher Extensions
  public static final String PUB_EXTS = "XML XLS XSL PDF RTF XSD";
  //Java  Extensions
  public static final String JAVA_EXTS = "ZIP EAR JAR CLASS JAVA";
  //HTML  Extensions
  public static final String HTML_EXTS = "HTML HTM JS JSP CSS XSS XSL";
  //Media (Image)  Extensions
  public static final String MEDIA_EXTS = "TIF JPG JPEG GIF PNG JFIF BMP";
  // SQL Loader Extensions in order
  public static final String SQL_LDR_EXTS = "DAT LDR CTL";

  //Supported AOL types
  public static final String FD_AOL_TYPES =
    "PROGRAM FND_LOOKUP_TYPE REQUEST_GROUP REQ_SET REQ_SET_LINKS DESC_FLEX KEY_FLEX MENU PRINTER PRINTER_STYLE PROFILE FND_USER FND_RESPONSIBILITY FND_NEW_MESSAGES FND_ATTACHMENT_FUNCTIONS FND_CURRENCY FND_LANGUAGE FND_TERRITORY FND_TABLE FND_VIEW GRANT FND_SEQUENCE FND_DOC_SEQUENCE_CATEGORIES VALUE_SET VALUE_SET_VALUE VALUE_SECURITY_RULE VALUE_ROLLUP_GROUP SCHEDULE FND_FORM_CUSTOM_RULES FORM FUNCTION ALR_ALERTS WF_ROLE XDO_DS_DEFINITIONS JTF_GRID_DATASOURCES AME_CONDITIONS AME_APPROVAL_GROUPS AME_APPROVAL_GROUP_CONFIG AME_RULES AME_ACTION_USAGES AME_CALLING_APPS AME_ATTRIBUTES AME_ATTRIBUTE_USAGES OTHER";

  // Sequence File name for ordering objects with partial deployment
  // File must exist at root of SCM source path
  public static final String FD_PARTIAL_SEQUENCE_FILE = "/FD_ORDER.seq";
  // include exclude for specific files or folders. There are cases where customers have various other
  // folders in SCM that are not necessary to be pulled in to FlexDeploy
  public static final String FD_PARTIAL_FILE_INCLUDES = "FD_PARTIAL_FILE_INCLUDES";
  public static final String FD_PARTIAL_FILE_EXCLUDES = "FD_PARTIAL_FILE_EXCLUDES";

  //JDBC Partial Deployment object type Codes
  public static final String OBJ_TYPE_DB_OBJECT = "DB_OBJECT";


  //OBIEE Partial Deployment Object Type Codes
  public static final String OBJ_TYPE_OBIEE_FOLDER = "FOLDER";


  public static final String DOCKER_HUB_URL = "http://hub.docker.com/r/";

  //Groovy function area pool key prefixes
  public static final String GROOVY_KEY_PREFIX_WEBHOOK_FUNCTION = "WH_FUNCTION_";
  public static final String GROOVY_KEY_PREFIX_WEBHOOK_PROVIDER = "WH_PROVIDER_";

  // **************** standard for all error codes ****************************************************************
  //  error-code: aapp[p]-##### (constant value)  NOTE: the separator is a hyphen for the value
  //    aa = 2 character representation of application (FD)
  //    ppp = 2 or 3 character representation of project (CR, ML, SV ...)
  //    - = hyphen as the error code separator
  //    ##### = 5 character representation of error number
  //
  //    NOTE: the error code separator is an underscore for the constant string
  //  error constant: aapp[p]_#####_cccccc__eeee...
  //    aa = 2 character representation of application (FD for Flex Deploy)
  //    ppp = 2 or 3 character representation of project (CR, ML, SV ...)
  //    _ = underscore as the error code separator
  //    ##### = 5 character representation of error number (01002)
  //    _ = underscore as the error code to classname separator
  //    cccccc - 6 character representation of the class name (WF_SVC for workflow service)
  //    __ = double underscore as the classname and error string separator
  //    eeee = character string representation of the error string description (ERR_IN_GET_WF)
  //    Example: public static final String FDSV_01002_WF_SVC__ERR_IN_GET_WF = "FDSV-01002";
  //
  //  Header standards for each distinct error code section below
  //      //Project FlexDeployServices
  //      // Code: [ (F)lex (D)eploy (SV)Services ]
  //      // Class flexagon.fd.services.workflow.WorkflowService  range 00050-00099
  // **************** standard for all error codes ****************************************************************

  //Project FlexDeployCore
  // Code: [ (F)lex (D)eploy (C)O(R)E ]
  // Class flexagon.fd.core.Properties  range 00000-00049
  public static final String FDCR_PROP_INST_KEY_MISSING = "FDCR-00000";
  // Class flexagon.fd.core.workflow.WorkflowExecutionContext  range 00150-00199
  //public static final String BASE_WORK_DIR_SYS_PROP_MISSING = "FDCR-00150";
  public static final String INSTALL_DIR_SYS_PROP_MISSING = "FDCR-00151";
  // Class flexagon.fd.core.plugin.BasePluginExecutionContext   range 00200-00249
  public static final String FDCR_00200_BS_PEC__REQUIRED_INPUTS_PROPERTIES_MISSING = "FDCR-00200";
  // Class flexagon.fd.core.utils.Serializationutil   range 00250-00299
  //public static final String FDCR_00250_SER_UTL__ERROR_LOADING_JCE = "FDCR-00250";
  // Class flexagon.fd.core.partial.util.BuildManifestXMLUtil   range 00350-00399
  public static final String FDCR_00350_BLD_MNFST__ERROR_MARSHALL_PKG_OBJECT = "FDCR-00350";
  public static final String FDCR_00351_BLD_MNFST__ERROR_UNMARSHALL_PKG_OBJECT = "FDCR-00351";
  // Class flexagon.fd.core.partial.util.DeployResultsXMLUtil   range 00400-00449
  public static final String FDCR_00400_DEPLOY_RES__ERROR_MARSHALL_DEPLOY_RES = "FDCR-00400";
  public static final String FDCR_00401_DEPLOY_RES__ERROR_UNMARSHALL_DEPLOY_RES = "FDCR-00401";

}
