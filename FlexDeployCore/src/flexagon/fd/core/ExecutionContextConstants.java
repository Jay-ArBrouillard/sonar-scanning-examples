package flexagon.fd.core;

import java.util.ArrayList;
import java.util.List;


/**
 * A collection of constants used to extract information from the WorkflowExecutionContext.  In many cases accessor methods exist on the WorkflowExecutionContext itself, making the constants unnecessary.
 */
public class ExecutionContextConstants
{
  private ExecutionContextConstants()
  {

  }
  public static final String FD_BASE_WORKING_DIR = "FD_BASE_WORKING_DIR";
  public static final String FD_WORKING_DIR = "FD_WORKING_DIR";
  public static final String FD_ARTIFACTS_DIR = "FD_ARTIFACTS_DIR";
  public static final String FD_TEMP_DIR = "FD_TEMP_DIR";
  public static final String FD_INTERNAL_DIR = "FD_INTERNAL_DIR";
  public static final String FD_REPORTS_DIR = "FD_REPORTS_DIR";
  public static final String FD_TEST_RESULTS_DIR = "FD_TEST_RESULTS_DIR";
  public static final String FD_OBJECT_RESULTS_DIR = "FD_OBJECT_RESULTS_DIR";
  public static final String FD_TRANSFER_DIR = "FD_TRANSFER_DIR";
  public static final String FD_PLUGIN_INSTALL_DIR = "FD_PLUGIN_INSTALL_DIR";
  public static final String FD_ENVIRONMENT_CODE = "FD_ENVIRONMENT_CODE";
  public static final String FD_ENVIRONMENT_NAME = "FD_ENVIRONMENT_NAME";
  public static final String FD_INSTANCE_CODE = "FD_INSTANCE_CODE";
  public static final String FD_INSTANCE_NAME = "FD_INSTANCE_NAME";
  public static final String FD_PROJECT_NAME = "FD_PROJECT_NAME";
  public static final String FD_PROJECT_FULL_PATH = "FD_PROJECT_FULL_PATH";
  public static final String FD_PROJECT_ID = "FD_PROJECT_ID";
  public static final String FD_PROJECT_VERSION = "FD_PROJECT_VERSION";
  public static final String FD_PLUGIN_NAME = "FD_PLUGIN_NAME";
  public static final String FD_ENDPOINT_NAME = "FD_ENDPOINT_NAME";
  public static final String FD_ENDPOINT_ADDRESS = "FD_ENDPOINT_ADDRESS";
  public static final String FD_ENDPOINT_RESOURCE_TYPES = "FD_ENDPOINT_RESOURCE_TYPES";
  public static final String FD_PLUGIN_OPERATION = "FD_PLUGIN_OPERATION";
  public static final String FD_PLUGIN_VERSION = "FD_PLUGIN_VERSION";
  public static final String FD_PLUGIN = "FD_PLUGIN";
  public static final String FD_APPLICATION_NAME = "FD_APPLICATION_NAME";
  public static final String FD_APPLICATION_ID = "FD_APPLICATION_ID";
  public static final String FD_PROJECT_TYPE = "FD_PROJECT_TYPE";
  public static final String FD_IS_PARTIAL_DEPLOY = "FD_IS_PARTIAL_DEPLOY";
  public static final String FD_ALL_FILES_REQUESTED = "FD_ALL_FILES_REQUESTED";
  public static final String FD_PACKAGE_NAME = "FD_PACKAGE_NAME";
  public static final String FD_WF_USER = "FD_WF_USER";
  public static final String FD_WF_USER_EMAIL = "FD_WF_USER_EMAIL";
  public static final String FD_RELEASE_NAME = "FD_RELEASE_NAME";
  public static final String FD_RELEASE_SNAPSHOT_NAME = "FD_RELEASE_SNAPSHOT_NAME";
  public static final String FD_RELEASE_SNAPSHOT_DUPLICATE_FILES = "FD_RELEASE_SNAPSHOT_DUPLICATE_FILES";
  public static final String FD_IS_FORCE_DEPLOY = "FD_IS_FORCE_DEPLOY";
  public static final String FD_CMS_TICKETS = "FD_CMS_TICKETS";
  public static final String FD_ITS_TICKETS = "FD_ITS_TICKETS";
  public static final String FD_RESULT_FILE_NAME = "FD_RESULT_FILE_NAME";

  // -- BUILD related constants (START)
  // project version related constants
  public static final String FDBLD_STREAM_NAME = "FDBLD_STREAM_NAME";
  public static final Boolean FDBLD_STREAM_NAME_PASS_IN_CONTEXT = true;
  public static final String FDBLD_IS_MAIN_STREAM = "FDBLD_IS_MAIN_STREAM";
  public static final Boolean FDBLD_IS_MAIN_STREAM_PASS_IN_CONTEXT = true;
  public static final String FDBLD_STREAM_ATTRIBUTE1 = "FDBLD_STREAM_ATTRIBUTE1";
  public static final Boolean FDBLD_STREAM_ATTRIBUTE1_PASS_IN_CONTEXT = true;
  public static final String FDBLD_STREAM_ATTRIBUTE2 = "FDBLD_STREAM_ATTRIBUTE2";
  public static final Boolean FDBLD_STREAM_ATTRIBUTE2_PASS_IN_CONTEXT = true;
  public static final String FDBLD_STREAM_ATTRIBUTE3 = "FDBLD_STREAM_ATTRIBUTE3";
  public static final Boolean FDBLD_STREAM_ATTRIBUTE3_PASS_IN_CONTEXT = true;
  public static final String FDBLD_TICKETS = "FDBLD_TICKETS";

  public static final String FDBLD_SCM_TYPE = "FDBLD_SCM_TYPE";
  public static final Boolean FDBLD_SCM_TYPE_PASS_IN_CONTEXT = true;

  // sequence number (generated) used with project version
  // updated to pass this value in 4.0.3 fixpack
  public static final String FDBLD_VERSION_SEQUENCE = "FDBLD_VERSION_SEQUENCE";
  public static final Boolean FDBLD_VERSION_SEQUENCE_PASS_IN_CONTEXT = true;

  // where Build was executed
  public static final String FDBLD_ENVIRONMENT_CODE = "FDBLD_ENVIRONMENT_CODE";
  public static final String FDBLD_INSTANCE_CODE = "FDBLD_INSTANCE_CODE";

  // request and execution id
  public static final String FD_WORKFLOW_REQUEST_ID = "FD_WORKFLOW_REQUEST_ID";
  public static final String FD_WORKFLOW_EXECUTION_ID = "FD_WORKFLOW_EXECUTION_ID";

  // Chandresh - decided to keep this separate instead of generic name of SCM
  // moved this to be generic so that we can use same xml structure and UI
  // not persisting SCM Changes, to be derived from SCM system dynamically
  public static final String FDBLD_SCM_SOURCE1_CHANGES = "FDBLD_SCM_SOURCE1_CHANGES";
  public static final Boolean FDBLD_SCM_SOURCE1_CHANGES_IN_CONTEXT = false;
  public static final String FDBLD_SCM_SOURCE_BASE = "FDBLD_SCM_SOURCE";
  public static final String SCM_CHANGES = "CHANGES";
  public static final String EFFECTIVE_CHECKOUT_FOLDER = "EFFECTIVE_CHECKOUT_FOLDER";

  private static final String SOURCE_KEY_NAME_DELIMITER = "_";

  public static final String REVISION_SUFFIX = "REVISION";
  public static final String COMMITDATE_SUFFIX = "COMMITDATE";
  public static final String SECONDARYREVISION_SUFFIX = "SECONDARYREVISION";

  // SVN
  // following are commented, as they are dynamically generated now
  //  public static final String FDBLD_SVN_SOURCE1_REVISION = "FDBLD_SVN_SOURCE1_REVISION";
  //  public static final Boolean FDBLD_SVN_SOURCE1_REVISION_IN_CONTEXT = true;
  //  public static final String FDBLD_SVN_SOURCE1_INSTANCE = "FDBLD_SVN_SOURCE1_INSTANCE";
  //  public static final Boolean FDBLD_SVN_SOURCE1_INSTANCE_PASS_IN_CONTEXT = true;
  //  public static final String FDBLD_SVN_SOURCE1_PATH = "FDBLD_SVN_SOURCE1_PATH";
  //  public static final Boolean FDBLD_SVN_SOURCE1_PATH_PASS_IN_CONTEXT = true;
  //  public static final String FDBLD_SVN_SOURCE1_TAG_PATH = "FDBLD_SVN_SOURCE1_TAG_PATH";
  //  public static final Boolean FDBLD_SVN_SOURCE1_TAG_PATH_PASS_IN_CONTEXT = true;
  //  public static final String FDBLD_SVN_SOURCE1_CHECKOUT_FOLDER = "FDBLD_SVN_SOURCE1_CHECKOUT_FOLDER";
  //  public static final Boolean FDBLD_SVN_SOURCE1_CHECKOUT_FOLDER_PASS_IN_CONTEXT = true;
  public static final String FDBLD_SVN_SOURCE_BASE = "FDBLD_SVN_SOURCE";
  public static final String SVN_REVISION = REVISION_SUFFIX;
  public static final String SVN_INSTANCE = "INSTANCE";
  public static final String SVN_PATH = "PATH";
  public static final String SVN_TAG_PATH = "TAG_PATH";
  public static final String SVN_CHECKOUT_FOLDER = "CHECKOUT_FOLDER";

  // GIT
  public static final String FDBLD_GIT_SOURCE_BASE = "FDBLD_GIT_SOURCE";
  public static final String GIT_REVISION = REVISION_SUFFIX;
  public static final String GIT_INSTANCE = "INSTANCE";
  public static final String GIT_BRANCH = "BRANCH";
  public static final String GIT_TAG = "TAG";
  public static final String GIT_SPARSE_CHECKOUT_FOLDERS = "SPARSE_CHECKOUT_FOLDERS";
  public static final String GIT_CHECKOUT_FOLDER = "CHECKOUT_FOLDER";

  // CVS
  public static final String FDBLD_CVS_SOURCE_BASE = "FDBLD_CVS_SOURCE";
  public static final String CVS_REVISION = REVISION_SUFFIX;
  public static final String CVS_INSTANCE = "INSTANCE";
  public static final String CVS_BRANCH = "BRANCH";
  public static final String CVS_TAG = "TAG";
  public static final String CVS_MODULES = "MODULES";
  public static final String CVS_CHECKOUT_FOLDER = "CHECKOUT_FOLDER";

  // TFVC
  public static final String FDBLD_TFVC_SOURCE_BASE = "FDBLD_TFVC_SOURCE";
  public static final String TFVC_REVISION = REVISION_SUFFIX;
  public static final String TFVC_INSTANCE = "INSTANCE";
  //public static final String TFVC_BRANCH = "BRANCH";
  public static final String TFVC_LABEL = "LABEL";
  public static final String TFVC_FOLDER = "FOLDER";
  public static final String TFVC_GET_FOLDER = "GET_FOLDER";

  // PERF
  public static final String FDBLD_PERF_SOURCE_BASE = "FDBLD_PERF_SOURCE";
  public static final String PERF_REVISION = REVISION_SUFFIX;
  public static final String PERF_INSTANCE = "INSTANCE";
  //public static final String PERF_BRANCH = "BRANCH";
  public static final String PERF_LABEL = "LABEL";
  public static final String PERF_DEPOT = "DEPOT";
  public static final String PERF_CHECKOUT_FOLDER = "CHECKOUT_FOLDER";

  // CCUCM
  public static final String FDBLD_CCUCM_SOURCE_BASE = "FDBLD_CCUCM_SOURCE";
  public static final String CCUCM_REVISION = REVISION_SUFFIX;
  public static final String CCUCM_INSTANCE = "INSTANCE";
  public static final String CCUCM_PROJECT_VOB = "PVOB";
  public static final String CCUCM_VOB_PATHS = "VOBS";
  public static final String CCUCM_STREAM = "STREAM";
  public static final String CCUCM_LABEL = "LABEL";
  public static final String CCUCM_CHECKOUT_FOLDER = "CHECKOUT_FOLDER";

  // PVCS
  public static final String FDBLD_PVCS_SOURCE_BASE = "FDBLD_PVCS_SOURCE";
  public static final String PVCS_REVISION = REVISION_SUFFIX;
  public static final String PVCS_INSTANCE = "INSTANCE";
  public static final String PVCS_BRANCH = "BRANCH";
  public static final String PVCS_PROMOTIONGROUP = "PROMOTIONGROUP";
  public static final String PVCS_USING_PG = "USING_PG";
  public static final String PVCS_LABEL = "LABEL";
  public static final String PVCS_PROJECT_PATH = "PROJECT_PATH";
  public static final String PVCS_CHECKOUT_FOLDER = "CHECKOUT_FOLDER";

  // FILE
  public static final String FDBLD_FILE_SOURCE_BASE = "FDBLD_FILE_SOURCE";
  public static final String FILE_REVISION = REVISION_SUFFIX;
  public static final String FILE_INSTANCE = "INSTANCE";
  public static final String FILE_FOLDER = "FOLDER";
  public static final String FILE_CHECKOUT_FOLDER = "CHECKOUT_FOLDER";

  // EMail settings
  public static final String FD_SMTP_HOST_NAME = "FD_SMTP_HOST_NAME";
  public static final String FD_SMTP_HOST_PORT = "FD_SMTP_HOST_PORT";
  public static final String FD_SMTP_USER = "FD_SMTP_USER";
  public static final String FD_SMTP_PASSWORD = "FD_SMTP_PASSWORD";
  public static final String FD_SMTP_FROM_ADDRESS = "FD_SMTP_FROM_ADDRESS";
  public static final String FD_SMTP_ENABLE_TLS = "FD_SMTP_ENABLE_TLS";

  // Settings
  public static final String FD_SERVER_BASE_URL = "FD_SERVER_BASE_URL";

  // Docker
  public static final String FD_PROJECT_DOCKER_IMAGE_NAME = "FD_PROJECT_DOCKER_IMAGE_NAME";
  public static final String FD_PROJECT_DOCKER_BUILD = "FD_PROJECT_DOCKER_BUILD";
  public static final String FD_PROJECT_DOCKER_PUSH = "FD_PROJECT_DOCKER_PUSH";
  public static final String FD_PROJECT_DOCKERFILE = "FD_PROJECT_DOCKERFILE";
  public static final String FD_BUILT_DOCKER_IMAGE_NAME = "FD_BUILT_DOCKER_IMAGE_NAME";

  //Helm
  public static final String FD_HELM_VALUE_PREFIX = "FD_HELM_VALUE_";

  //Kubernetes
  public static final String FD_KN_CHART_PATH = "FD_HELM_CHART_PATH";
  public static final String FD_KN_RELEASE_NAME = "FD_HELM_RELEASE_NAME";
  public static final String FD_KN_MANIFEST_NAMES = "FD_KN_MANIFEST_NAMES";
  public static final String FD_KN_BLUE_GREEN_MANIFEST_NAMES = "FD_KN_BLUE_GREEN_MANIFEST_NAMES";
  public static final String FD_KN_CANARY_MANIFEST_NAMES = "FD_KN_CANARY_MANIFEST_NAMES";
  public static final String FD_KN_AB_MANIFEST_NAMES = "FD_KN_AB_MANIFEST_NAMES";
  public static final String FD_KN_DEPLOYMENT_STRATEGY = "FD_KN_DEPLOYMENT_STRATEGY";
  public static final String FD_KN_OLD_WEIGHT = "FD_KN_OLD_WEIGHT";
  public static final String FD_KN_NEW_WEIGHT = "FD_KN_NEW_WEIGHT";
  public static final String FD_KN_ROUTE_RULE = "FD_KN_ROUTE_RULE";
  public static final String FD_KN_DEPLOYMENT_NAME = "FD_KN_DEPLOYMENT_NAME";
  public static final String FD_KN_FINISH_DEPLOYMENT = "FD_KN_FINISH_DEPLOYMENT";

  // -- BUILD related constants (END)

  public static String createKeyName(String pKeyBase, int pSequenceNumber, String pKey)
  {
    // Do we need StrinBuffer ?
    return pKeyBase + pSequenceNumber + SOURCE_KEY_NAME_DELIMITER + pKey;
  }

  public static List<String> getEndpointKeyNames()
  {
    List<String> keyNames = new ArrayList<String>();
    keyNames.add(FD_BASE_WORKING_DIR);
    keyNames.add(FD_WORKING_DIR);
    keyNames.add(FD_ARTIFACTS_DIR);
    keyNames.add(FD_TEMP_DIR);
    keyNames.add(FD_INTERNAL_DIR);
    keyNames.add(FD_REPORTS_DIR);
    keyNames.add(FD_TEST_RESULTS_DIR);
    keyNames.add(FD_OBJECT_RESULTS_DIR);
    keyNames.add(FD_TRANSFER_DIR);
    keyNames.add(FD_PLUGIN_INSTALL_DIR);
    keyNames.add(FD_PLUGIN_NAME);
    keyNames.add(FD_ENDPOINT_NAME);
    keyNames.add(FD_ENDPOINT_ADDRESS);
    keyNames.add(FD_ENDPOINT_RESOURCE_TYPES);
    keyNames.add(FD_PLUGIN_OPERATION);
    keyNames.add(FD_PLUGIN);
    return keyNames;
  }

  /**
   * Method returns all the Source related Execution Constants with the
   * default sequence number as 1. This is used for auto suggesting in the
   * WF Definition UI
   *
   * @return List
   */
  public static List<String> getExecutionContextKeyNames()
  {
    List<String> keyNames = new ArrayList<String>();

    // -- Generic Execution Constants (START)
    keyNames.add(FD_ENVIRONMENT_CODE);
    keyNames.add(FD_ENVIRONMENT_NAME);
    keyNames.add(FD_INSTANCE_CODE);
    keyNames.add(FD_INSTANCE_NAME);
    keyNames.add(FD_PROJECT_NAME);
    keyNames.add(FD_PROJECT_FULL_PATH);
    keyNames.add(FD_PROJECT_ID);
    keyNames.add(FD_PROJECT_VERSION);
    keyNames.add(FD_APPLICATION_NAME);
    keyNames.add(FD_APPLICATION_ID);
    keyNames.add(FD_PROJECT_TYPE);
    keyNames.add(FD_IS_PARTIAL_DEPLOY);
    keyNames.add(FDBLD_STREAM_NAME);
    keyNames.add(FDBLD_IS_MAIN_STREAM);
    keyNames.add(FDBLD_STREAM_ATTRIBUTE1);
    keyNames.add(FDBLD_STREAM_ATTRIBUTE2);
    keyNames.add(FDBLD_STREAM_ATTRIBUTE3);
    //keyNames.add(FDBLD_TICKETS); // Tickets are not available in Context at this point.
    keyNames.add(FDBLD_VERSION_SEQUENCE);
    keyNames.add(FDBLD_ENVIRONMENT_CODE);
    keyNames.add(FDBLD_INSTANCE_CODE);
    keyNames.add(FD_WORKFLOW_REQUEST_ID);
    keyNames.add(FD_WORKFLOW_EXECUTION_ID);
    keyNames.add(FD_IS_FORCE_DEPLOY);
    keyNames.add(FD_CMS_TICKETS);
    keyNames.add(FD_ITS_TICKETS);
    keyNames.add(FD_PACKAGE_NAME);
    keyNames.add(FD_WF_USER);
    keyNames.add(FD_WF_USER_EMAIL);
    keyNames.add(FD_ALL_FILES_REQUESTED);
    keyNames.add(FD_RELEASE_NAME);
    keyNames.add(FD_RELEASE_SNAPSHOT_NAME);
    keyNames.add(FD_RELEASE_SNAPSHOT_DUPLICATE_FILES);
    keyNames.add(FD_SMTP_HOST_NAME);
    keyNames.add(FD_SMTP_HOST_PORT);
    keyNames.add(FD_SMTP_USER);
    keyNames.add(FD_SMTP_PASSWORD);
    keyNames.add(FD_SMTP_FROM_ADDRESS);
    keyNames.add(FD_SMTP_ENABLE_TLS);
    keyNames.add(FD_SERVER_BASE_URL);
    keyNames.add(FD_PROJECT_DOCKER_IMAGE_NAME);
    keyNames.add(FD_PROJECT_DOCKERFILE);
    keyNames.add(FD_PROJECT_DOCKER_BUILD);
    keyNames.add(FD_PROJECT_DOCKER_PUSH);
    keyNames.add(FD_KN_CHART_PATH);
    keyNames.add(FD_KN_RELEASE_NAME);
    keyNames.add(FD_KN_MANIFEST_NAMES);
    keyNames.add(FD_KN_BLUE_GREEN_MANIFEST_NAMES);
    keyNames.add(FD_KN_CANARY_MANIFEST_NAMES);
    keyNames.add(FD_KN_AB_MANIFEST_NAMES);
    keyNames.add(FD_KN_DEPLOYMENT_STRATEGY);
    keyNames.add(FD_KN_OLD_WEIGHT);
    keyNames.add(FD_KN_NEW_WEIGHT);
    keyNames.add(FD_KN_ROUTE_RULE);
    keyNames.add(FD_KN_DEPLOYMENT_NAME);
    keyNames.add(FD_KN_FINISH_DEPLOYMENT);


    // -- Generic Execution Constants (END)

    // -- SCM Related Constants using default sequence as 1 (START)

    int defaultSequenceNumber = 1;

    keyNames.add(FDBLD_SCM_TYPE);
    keyNames.add(createKeyName(FDBLD_SCM_SOURCE_BASE, defaultSequenceNumber, SCM_CHANGES));

    // Effective Folder could be different than checkout folder but more importantly it would be common name for all SCM types.
    // FDBLD_SCM_SOURCE1_EFFECTIVE_CHECKOUT_FOLDER
    keyNames.add(createKeyName(FDBLD_SCM_SOURCE_BASE, defaultSequenceNumber, EFFECTIVE_CHECKOUT_FOLDER));

    // SVN
    keyNames.add(createKeyName(FDBLD_SVN_SOURCE_BASE, defaultSequenceNumber, SVN_REVISION));
    keyNames.add(createKeyName(FDBLD_SVN_SOURCE_BASE, defaultSequenceNumber, SVN_INSTANCE));
    keyNames.add(createKeyName(FDBLD_SVN_SOURCE_BASE, defaultSequenceNumber, SVN_PATH));
    keyNames.add(createKeyName(FDBLD_SVN_SOURCE_BASE, defaultSequenceNumber, SVN_TAG_PATH));
    keyNames.add(createKeyName(FDBLD_SVN_SOURCE_BASE, defaultSequenceNumber, SVN_CHECKOUT_FOLDER));

    // GIT
    keyNames.add(createKeyName(FDBLD_GIT_SOURCE_BASE, defaultSequenceNumber, GIT_REVISION));
    keyNames.add(createKeyName(FDBLD_GIT_SOURCE_BASE, defaultSequenceNumber, GIT_INSTANCE));
    keyNames.add(createKeyName(FDBLD_GIT_SOURCE_BASE, defaultSequenceNumber, GIT_BRANCH));
    keyNames.add(createKeyName(FDBLD_GIT_SOURCE_BASE, defaultSequenceNumber, GIT_TAG));
    keyNames.add(createKeyName(FDBLD_GIT_SOURCE_BASE, defaultSequenceNumber, GIT_SPARSE_CHECKOUT_FOLDERS));
    keyNames.add(createKeyName(FDBLD_GIT_SOURCE_BASE, defaultSequenceNumber, GIT_CHECKOUT_FOLDER));

    // CVS
    keyNames.add(createKeyName(FDBLD_CVS_SOURCE_BASE, defaultSequenceNumber, CVS_REVISION));
    keyNames.add(createKeyName(FDBLD_CVS_SOURCE_BASE, defaultSequenceNumber, CVS_INSTANCE));
    keyNames.add(createKeyName(FDBLD_CVS_SOURCE_BASE, defaultSequenceNumber, CVS_BRANCH));
    keyNames.add(createKeyName(FDBLD_CVS_SOURCE_BASE, defaultSequenceNumber, CVS_TAG));
    keyNames.add(createKeyName(FDBLD_CVS_SOURCE_BASE, defaultSequenceNumber, CVS_MODULES));
    keyNames.add(createKeyName(FDBLD_CVS_SOURCE_BASE, defaultSequenceNumber, CVS_CHECKOUT_FOLDER));

    // TFVC
    keyNames.add(createKeyName(FDBLD_TFVC_SOURCE_BASE, defaultSequenceNumber, TFVC_REVISION));
    keyNames.add(createKeyName(FDBLD_TFVC_SOURCE_BASE, defaultSequenceNumber, TFVC_INSTANCE));
    //keyNames.add(createKeyName(FDBLD_TFVC_SOURCE_BASE, defaultSequenceNumber, TFVC_BRANCH));
    keyNames.add(createKeyName(FDBLD_TFVC_SOURCE_BASE, defaultSequenceNumber, TFVC_LABEL));
    keyNames.add(createKeyName(FDBLD_TFVC_SOURCE_BASE, defaultSequenceNumber, TFVC_FOLDER));
    keyNames.add(createKeyName(FDBLD_TFVC_SOURCE_BASE, defaultSequenceNumber, TFVC_GET_FOLDER));

    // Perforce
    keyNames.add(createKeyName(FDBLD_PERF_SOURCE_BASE, defaultSequenceNumber, PERF_REVISION));
    keyNames.add(createKeyName(FDBLD_PERF_SOURCE_BASE, defaultSequenceNumber, PERF_INSTANCE));
    //keyNames.add(createKeyName(FDBLD_PERF_SOURCE_BASE, defaultSequenceNumber, PERF_BRANCH));
    keyNames.add(createKeyName(FDBLD_PERF_SOURCE_BASE, defaultSequenceNumber, PERF_LABEL));
    keyNames.add(createKeyName(FDBLD_PERF_SOURCE_BASE, defaultSequenceNumber, PERF_DEPOT));
    keyNames.add(createKeyName(FDBLD_PERF_SOURCE_BASE, defaultSequenceNumber, PERF_CHECKOUT_FOLDER));

    // ClearCase UCM
    keyNames.add(createKeyName(FDBLD_CCUCM_SOURCE_BASE, defaultSequenceNumber, CCUCM_REVISION));
    keyNames.add(createKeyName(FDBLD_CCUCM_SOURCE_BASE, defaultSequenceNumber, CCUCM_INSTANCE));
    keyNames.add(createKeyName(FDBLD_CCUCM_SOURCE_BASE, defaultSequenceNumber, CCUCM_PROJECT_VOB));
    keyNames.add(createKeyName(FDBLD_CCUCM_SOURCE_BASE, defaultSequenceNumber, CCUCM_VOB_PATHS));
    keyNames.add(createKeyName(FDBLD_CCUCM_SOURCE_BASE, defaultSequenceNumber, CCUCM_STREAM));
    keyNames.add(createKeyName(FDBLD_CCUCM_SOURCE_BASE, defaultSequenceNumber, CCUCM_LABEL));
    keyNames.add(createKeyName(FDBLD_CCUCM_SOURCE_BASE, defaultSequenceNumber, CCUCM_CHECKOUT_FOLDER));

    // PVCS
    keyNames.add(createKeyName(FDBLD_PVCS_SOURCE_BASE, defaultSequenceNumber, PVCS_REVISION));
    keyNames.add(createKeyName(FDBLD_PVCS_SOURCE_BASE, defaultSequenceNumber, PVCS_INSTANCE));
    keyNames.add(createKeyName(FDBLD_PVCS_SOURCE_BASE, defaultSequenceNumber, PVCS_BRANCH));
    keyNames.add(createKeyName(FDBLD_PVCS_SOURCE_BASE, defaultSequenceNumber, PVCS_PROMOTIONGROUP));
    keyNames.add(createKeyName(FDBLD_PVCS_SOURCE_BASE, defaultSequenceNumber, PVCS_USING_PG));
    keyNames.add(createKeyName(FDBLD_PVCS_SOURCE_BASE, defaultSequenceNumber, PVCS_LABEL));
    keyNames.add(createKeyName(FDBLD_PVCS_SOURCE_BASE, defaultSequenceNumber, PVCS_PROJECT_PATH));
    keyNames.add(createKeyName(FDBLD_PVCS_SOURCE_BASE, defaultSequenceNumber, PVCS_CHECKOUT_FOLDER));

    // File System
    keyNames.add(createKeyName(FDBLD_FILE_SOURCE_BASE, defaultSequenceNumber, FILE_REVISION));
    keyNames.add(createKeyName(FDBLD_FILE_SOURCE_BASE, defaultSequenceNumber, FILE_INSTANCE));
    keyNames.add(createKeyName(FDBLD_FILE_SOURCE_BASE, defaultSequenceNumber, FILE_FOLDER));
    keyNames.add(createKeyName(FDBLD_FILE_SOURCE_BASE, defaultSequenceNumber, FILE_CHECKOUT_FOLDER));


    // -- SCM Related Constants using default sequence as 1 (END)

    return keyNames;
  }
}
