package flexagon.fd.core.enums;


/**
 * An enumerated type defining the supported Source Control Management (SCM) Systems.
 * <br><br>
 * <ul>
 *   <li><b>SVN</b> - Subversion</li>
 *   <li><b>GIT</b> - Git</li>
 *   <li><b>CVS</b> - CVS</li>
 *   <li><b>TFVC</b> - Team Foundation Version Control (part of Microsoft TFS)</li>
 *   <li><b>PERF</b> - Perforce</li>
 *   <li><b>NONE</b> - No SCM being used</li>
 * </ul>
 */
public enum SCMTypeEnum
{
  SVN,
  GIT,
  CVS,
  TFVC,
  PERF,
  CCUCM,
  PVCS,
  FILE,
  NONE
}
