package club.javafamily.weather.query;

import club.javafamily.model.HttpParameters;
import club.javafamily.rest.BaseQueryEngine;
import club.javafamily.util.string.StringUtils;
import club.javafamily.weather.exception.AuthorizationException;
import club.javafamily.weather.vo.WeatherVO;

/**
 * Weather Query Engine.
 */
public class WeatherQueryEngine extends BaseQueryEngine {

   public WeatherQueryEngine(String key) {
      super("http://api.avatardata.cn");
      this.key = key;

      init(key);
   }

   /**
    * 完成 QueryEngine 创建的初始化和校验工作.
    * @param key rest key
    */
   private void init(String key) {
      if(StringUtils.isEmpty(key)) {
         throw new AuthorizationException("The key can't is empty.");
      }
   }

   @Override
   public HttpParameters requiredParameters() {
      HttpParameters requiredParameters = super.requiredParameters();
      requiredParameters.addParam("key", this.key);

      return requiredParameters;
   }

   /**
    * Query special city weather.
    * @param city query city
    * @return weather vo model.
    * @throws Exception Query failed.
    */
   public WeatherVO queryWeather(String city) throws Exception {
      HttpParameters httpParameters = new HttpParameters();
      httpParameters.addParam("cityname", city);

      WeatherVO result = query(WEATHER_API_URI, httpParameters, null, WeatherVO.class);

      return result;
   }

   /**
    * Query special city weather.
    * @param city query city
    * @return weather json result.
    * @throws Exception Query failed.
    */
   public String queryWeatherJson(String city) throws Exception {
      HttpParameters httpParameters = new HttpParameters();
      httpParameters.addParam("cityname", city);

      String result = query(WEATHER_API_URI, httpParameters, null);

      return result;
   }

   private String key;
   private static final String WEATHER_API_URI = "/Weather/Query";
}
