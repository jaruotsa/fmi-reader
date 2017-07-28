package fi.kapsi.janner.fmireader.query;

/**
 * Created by janne on 03/05/17.
 */
public class SimpleQueryBuilder {

  private static final int NOT_SET = -1;

  /**
   * Is location parameter set?
   */
  private boolean locationParameterSet;

  public SimpleQueryBuilder() {

  }

  /**
   * Finish query building and return resulting query.
   *
   * @return
   * @throws IllegalArgumentException if incomplete query.
   */
  public SimpleQuery finish() {
    if (!locationParameterSet) {
      throw new IllegalArgumentException("No location parameter given.");
    }

    SimpleQuery query = new SimpleQuery();
    query.geoid = geoid;

    return query;
  }

  private int geoid = NOT_SET;

  /**
   * Set Geoid of the location for which to return data. (ID from geonames.org)
   *
   * @param geoid id value.
   * @return this builder.
   */
  public SimpleQueryBuilder geoid(int geoid) {
    this.locationParameterSet = true;
    this.geoid = geoid;
    return this;
  }

  /*
      Possible query parameters:

    starttime       Parameter begin specifies the begin of time interval in
                    ISO-format (for example 2012-02-27T00:00:00Z).

    endtime         End of time interval in ISO-format
                    (for example 2012-02-27T00:00:00Z).

    timestep        The time step of data in minutes. Notice that timestep is
                    calculated from start of the ongoing hour or day.

    parameters      Comma separated list of meteorological parameters to
                    return.

    crs             Coordinate projection to use in results.  For example
                    EPSG::3067

    bbox            Bounding box of area for which to return data
                    (lon,lat,lon,lat). For example 21,61,22,62

    place           The location for which to provide data. Region can be given
                    after location name separated by comma (for example
                    Kumpula,Kolari).

    fmisid          Identifier of the observation station.

    maxlocations    How many observation stations are fetched around queried
                    locations. Note that stations are only searched with 50
                    kilometers radius around the location.

    wmo             WMO code of the location for which to return data.
   */



}
