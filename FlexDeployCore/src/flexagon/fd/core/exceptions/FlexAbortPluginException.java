package flexagon.fd.core.exceptions;

import flexagon.ff.common.core.exceptions.FlexCheckedException;

public class FlexAbortPluginException
  extends FlexRemotePluginException
{
  public FlexAbortPluginException(FlexCheckedException pFlexCheckedException)
  {
    super(pFlexCheckedException);
  }
}
