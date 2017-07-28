package fi.kapsi.janner.fmireader.connection;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by janne on 17/05/17.
 */
public class FmiConnectionTest {

  @Test
  public void testBaseAddress() throws Exception {
    Connection connection = new FmiConnection("secret-api-key");
    assertThat(connection.getBaseAddress(), is("http://data.fmi.fi/fmi-apikey/secret-api-key/wfs"));
  }

}