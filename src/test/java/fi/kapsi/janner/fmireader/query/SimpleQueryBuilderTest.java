package fi.kapsi.janner.fmireader.query;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by janne on 17/05/17.
 */
public class SimpleQueryBuilderTest {

  @Test
  public void testGeoId() throws Exception {
    SimpleQuery query = new SimpleQueryBuilder()
        .geoid(1234).finish();

    assertThat(query.getGeoid(), is(1234));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFinish() {
    SimpleQueryBuilder builder = new SimpleQueryBuilder();
    builder.finish();
  }

}