package club.javafamily.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class RealTime implements Serializable {
   private String date; // 测量日期
   private String time; // 测量时间
   private String week; // 星期
   @JsonProperty("city_name")
   private String cityName; // 城市
   private String moon; // 农历
   private Weather weather; // 实时天气情况
   private Wind wind; // 风况
   private String dataUptime; // data up time
   @JsonProperty("city_code")
   private String cityCode;

   public String getCityCode() {
      return cityCode;
   }

   public void setCityCode(String cityCode) {
      this.cityCode = cityCode;
   }

   public String getDataUptime() {
      return dataUptime;
   }

   public void setDataUptime(String dataUptime) {
      this.dataUptime = dataUptime;
   }

   public String getDate() {
      return date;
   }

   public void setDate(String date) {
      this.date = date;
   }

   public String getTime() {
      return time;
   }

   public void setTime(String time) {
      this.time = time;
   }

   public String getWeek() {
      return week;
   }

   public void setWeek(String week) {
      this.week = week;
   }

   public String getCityName() {
      return cityName;
   }

   public void setCityName(String cityName) {
      this.cityName = cityName;
   }

   public String getMoon() {
      return moon;
   }

   public void setMoon(String moon) {
      this.moon = moon;
   }

   public Weather getWeather() {
      return weather;
   }

   public void setWeather(Weather weather) {
      this.weather = weather;
   }

   public Wind getWind() {
      return wind;
   }

   public void setWind(Wind wind) {
      this.wind = wind;
   }

   @Override
   public String toString() {
      return "RealTime{" +
         "date='" + date + '\'' +
         ", time='" + time + '\'' +
         ", week='" + week + '\'' +
         ", cityName='" + cityName + '\'' +
         ", moon='" + moon + '\'' +
         ", weather=" + weather +
         ", wind=" + wind +
         ", dataUptime='" + dataUptime + '\'' +
         ", cityCode='" + cityCode + '\'' +
         '}';
   }

   public class Wind implements Serializable {
      private String direct; // wind direction
      private String power; // wind power
      private String windspeed;
      private String offset;

      public String getDirect() {
         return direct;
      }

      public void setDirect(String direct) {
         this.direct = direct;
      }

      public String getPower() {
         return power;
      }

      public void setPower(String power) {
         this.power = power;
      }

      public String getWindspeed() {
         return windspeed;
      }

      public void setWindspeed(String windspeed) {
         this.windspeed = windspeed;
      }

      public String getOffset() {
         return offset;
      }

      public void setOffset(String offset) {
         this.offset = offset;
      }

      @Override
      public String toString() {
         return "Wind{" +
            "direct='" + direct + '\'' +
            ", power='" + power + '\'' +
            ", windspeed='" + windspeed + '\'' +
            ", offset='" + offset + '\'' +
            '}';
      }
   }

   public class Weather implements Serializable {
      private String humidity; // 湿度
      private String temperature; // 温度
      private String info; // 天气情况
      private String img; // image

      public String getHumidity() {
         return humidity;
      }

      public void setHumidity(String humidity) {
         this.humidity = humidity;
      }

      public String getTemperature() {
         return temperature;
      }

      public void setTemperature(String temperature) {
         this.temperature = temperature;
      }

      public String getInfo() {
         return info;
      }

      public void setInfo(String info) {
         this.info = info;
      }

      public String getImg() {
         return img;
      }

      public void setImg(String img) {
         this.img = img;
      }

      @Override
      public String toString() {
         return "Weather{" +
            "humidity='" + humidity + '\'' +
            ", temperature='" + temperature + '\'' +
            ", info='" + info + '\'' +
            ", img='" + img + '\'' +
            '}';
      }
   }
}
