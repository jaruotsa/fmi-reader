package fi.kapsi.janner.fmireader.query;

import fi.kapsi.janner.fmireader.connection.Connection;
import fi.kapsi.janner.fmireader.result.SimpleResult;

/**
 * Created by janne on 08/03/17.
 */
public final class SimpleQuery implements Query {

  protected int geoid;

  @Override
  public SimpleResult query(Connection connection) {
    return null;
  }

  public int getGeoid() {
    return geoid;
  }
}
