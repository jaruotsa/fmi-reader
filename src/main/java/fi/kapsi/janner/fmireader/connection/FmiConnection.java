package fi.kapsi.janner.fmireader.connection;

/**
 * Created by janne on 03/05/17.
 */
public class FmiConnection implements Connection {

  /**
   * Base address for fmi api.
   */
  public static final String BASE_ADDRESS = "http://data.fmi.fi/fmi-apikey/";

  /**
   * API-key for FMI service.
   */
  private final String apiKey;

  public FmiConnection(String apiKey) {
    this.apiKey = apiKey;
  }

  @Override
  public String getBaseAddress() {
    return BASE_ADDRESS + apiKey + "/";
  }


}
