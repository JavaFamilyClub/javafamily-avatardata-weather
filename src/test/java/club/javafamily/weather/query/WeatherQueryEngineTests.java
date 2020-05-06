package club.javafamily.weather.query;

import org.javafamily.util.JsonPathUtils;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeatherQueryEngineTests {

   private static WeatherQueryEngine engine;

   @BeforeAll
   public static void init() {
      engine = new WeatherQueryEngine();
   }

   @Test
   public void testWeatherQueryEngine() throws Exception {
      String weather = engine.queryWeather("西安");

      LOGGER.info("### Query Weather: {}", weather);

      Assertions.assertNotNull(weather, "Query Result is Null.");

      String reason = JsonPathUtils.parsePath(weather, "$.reason");

      LOGGER.info("### Query Reason: {}", reason);

      Assertions.assertTrue("Succes".equals(reason), "Query Failed.");
   }

   private static final Logger LOGGER = LoggerFactory.getLogger(WeatherQueryEngineTests.class);
}
