package club.javafamily.weather.query;

import club.javafamily.vo.WeatherVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.javafamily.test.MockUtils;
import org.javafamily.util.JsonPathUtils;
import org.javafamily.util.JsonUtils;
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
   @Disabled("Query times limit.")
   public void testWeatherQueryEngine() throws Exception {
      String weather = engine.queryWeatherJson("西安");

      LOGGER.info("### Query Weather: {}", weather);

      Assertions.assertNotNull(weather, "Query Result is Null.");

      String reason = JsonPathUtils.parsePath(weather, "$.reason");

      LOGGER.info("### Query Reason: {}", reason);

      Assertions.assertTrue("Succes".equals(reason), "Query Failed.");
   }

   @Test
   public void testJsonToModel() throws JsonProcessingException {
      JsonUtils.jsonToObject(MockUtils.WEATHER_JSON, WeatherVO.class);
   }

   private static final Logger LOGGER = LoggerFactory.getLogger(WeatherQueryEngineTests.class);
}
