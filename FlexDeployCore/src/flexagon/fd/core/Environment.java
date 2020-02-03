package flexagon.fd.core;

import flexagon.ff.common.core.pojos.BasePOJO;


/**
 * Represents a FlexDeploy environment, which contains a name, code, and generated id.  The name is the display name shown in the UI, whereas, the code is used within scripts (e.g. Groovy, Shell, Ant, etc.).
 */
public class Environment
  extends BasePOJO
{
  @SuppressWarnings("compatibility:-770392406460287617")
  private static final long serialVersionUID = -5493216909022978551L;

  private Long mEnvironmentID;
  private String mCode;
  private String mName;


  /**
   * Creates an Environment with the given id, code, and name.
   *
   * @param pID the generated primary key for the environment
   * @param pCode the code for the environment
   * @param pName the display name for the environment
   */
  public Environment(Long pID, String pCode, String pName)
  {
    super();
    this.mEnvironmentID = pID;
    this.mCode = pCode;
    this.mName = pName;
  }

  /**
   * Returns this environment's internal id
   * @return the environment's internal id
   */
  public final Long getEnvironmentID()
  {
    return mEnvironmentID;
  }


  /**
   * Returns this environment's code name
   * @return the environment code
   */
  public final String getCode()
  {
    return mCode;
  }

  /**
   * Returns this environment's display name
   * @return the environment display name
   */
  public final String getName()
  {
    return mName;
  }

  /**
   * Returns whether the given environment is equal to this one.
   *
   * @param pObject the environment to compare to this environment
   * @return true if this environment is the same as the pOpject argument; false otherwise.
   */
  @Override
  public boolean equals(Object pObject)
  {
    if (pObject instanceof Environment)
    {
      Environment other = (Environment) pObject;
      return mEnvironmentID.equals(other.mEnvironmentID);
    }
    return false;
  }

  /**
   * Returns a hash code value for this environment. This method is supported for the benefit of hash tables such as those provided by HashMap.
   * @return a hash code value for this object.
   */
  @Override
  public int hashCode()
  {
    return mEnvironmentID.hashCode();
  }

  @Override
  public String toString()
  {
    return getClass().getName() + "@" + System.identityHashCode(this) + " " + mEnvironmentID + "-" + mCode;
  }
}
