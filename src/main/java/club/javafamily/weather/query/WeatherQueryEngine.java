package club.javafamily.weather.query;

import org.javafamily.model.HttpHeaders;
import org.javafamily.model.HttpParameters;
import org.javafamily.rest.BaseQueryEngine;

/**
 * Weather Query Engine.
 */
public class WeatherQueryEngine extends BaseQueryEngine {

   public WeatherQueryEngine() {
      super("http://api.avatardata.cn");
   }

   @Override
   public HttpParameters requiredParameters() {
      HttpParameters requiredParameters = super.requiredParameters();
      requiredParameters.addParam("key", "8741319d614f47f39ea7618fc4ce08f2");

      return requiredParameters;
   }

   /**
    * Query special city weather.
    * @param city query city
    * @return json string.
    * @throws Exception Query failed.
    */
   public String queryWeather(String city) throws Exception {
      HttpParameters httpParameters = new HttpParameters();
      httpParameters.addParam("cityname", city);

      HttpHeaders httpHeaders = new HttpHeaders();
      String jsonResult = query(WEATHER_API_URI, httpParameters, httpHeaders);

      return jsonResult;
   }

   private static final String WEATHER_API_URI = "/Weather/Query";
}
