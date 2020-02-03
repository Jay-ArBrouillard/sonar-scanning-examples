package flexagon.fd.core;

import flexagon.ff.common.core.pojos.BasePOJO;

/**
 * Represents a FlexDeploy instance, which contains a name, code, and generated id.  The name is the display name shown in the UI, whereas, the code is used within scripts (e.g. Groovy, Shell, Ant, etc.).
 */
public class Instance
  extends BasePOJO
{
  @SuppressWarnings("compatibility:704239540165403907")
  private static final long serialVersionUID = 5107746517867184392L;

  private Long mInstanceID;
  private String mCode;
  private String mName;

  /**
   * Creates an Instance with the given id, code, and name.
   *
   * @param pID the generated primary key for the instance
   * @param pCode the code for the instance
   * @param pName the display name for the instance
   */
  public Instance(Long pID, String pCode, String pName)
  {
    super();
    this.mInstanceID = pID;
    this.mCode = pCode;
    this.mName = pName;
  }

  /**
   * Returns this instance's internal id
   * @return the instance's internal id
   */
  public final Long getInstanceID()
  {
    return mInstanceID;
  }

  /**
   * Returns this instance's code name
   * @return the instance code
   */
  public final String getCode()
  {
    return mCode;
  }

  /**
   * Returns this instance's display name
   * @return the instance display name
   */
  public final String getName()
  {
    return mName;
  }

  /**
   * Returns whether the given instance is equal to this one.
   *
   * @param pObject the instance to compare to this instance
   * @return true if this instance is the same as the pOpject argument; false otherwise.
   */
  @Override
  public boolean equals(Object pObject)
  {
    if (pObject instanceof Instance)
    {
      Instance other = (Instance) pObject;
      return mInstanceID.equals(other.mInstanceID);
    }
    return false;
  }

  /**
   * Returns a hash code value for this instance. This method is supported for the benefit of hash tables such as those provided by HashMap.
   * @return a hash code value for this object.
   */
  @Override
  public int hashCode()
  {
    return mInstanceID.hashCode();
  }

  @Override
  public String toString()
  {
    return getClass().getName() + "@" + System.identityHashCode(this) + " " + mInstanceID + "-" + mCode;
  }
}
