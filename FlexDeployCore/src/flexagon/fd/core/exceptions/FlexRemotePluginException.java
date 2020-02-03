package flexagon.fd.core.exceptions;

import flexagon.ff.common.core.exceptions.FlexCheckedException;

public class FlexRemotePluginException
  extends FlexCheckedException
{
  @SuppressWarnings("compatibility:6228066475088545187")
  private static final long serialVersionUID = -8662062420519414261L;

  public FlexRemotePluginException(FlexCheckedException pCause)
  {
    super(pCause.getMessage());
    setStackTrace(pCause.getStackTrace());
    super.log();
  }


  @Override
  // do not log here.  This exception class will call super to log after stacktrace is established.
  protected void log()
  {

  }
}
