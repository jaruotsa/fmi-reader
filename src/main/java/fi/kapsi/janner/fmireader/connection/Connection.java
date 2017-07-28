package fi.kapsi.janner.fmireader.connection;

import fi.kapsi.janner.fmireader.query.Query;
import fi.kapsi.janner.fmireader.result.Result;

/**
 * Created by janne on 08/03/17.
 */
public interface Connection {

  /**
   * Get base address for connection.
   *
   * @return base address.
   */
  String getBaseAddress();
  
}
