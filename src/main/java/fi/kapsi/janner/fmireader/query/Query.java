package fi.kapsi.janner.fmireader.query;

import fi.kapsi.janner.fmireader.connection.Connection;
import fi.kapsi.janner.fmireader.result.Result;

/**
 * Created by janne on 08/03/17.
 */
public interface Query {

  /**
   * Do query using the connection.
   *
   * @param connection the connection to use.
   * @return Result of the query.
   */
  Result query(Connection connection);

}
