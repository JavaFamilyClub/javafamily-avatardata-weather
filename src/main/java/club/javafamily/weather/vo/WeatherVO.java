package club.javafamily.weather.vo;

import club.javafamily.weather.model.WeatherResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;

public class WeatherVO implements Serializable {
   @JsonDeserialize(as = WeatherResult.class)
   private WeatherResult result;
   @JsonProperty("error_code")
   private int errorCode;
   private String reason;

   public WeatherResult getResult() {
      return result;
   }

   public void setResult(WeatherResult result) {
      this.result = result;
   }

   public int getErrorCode() {
      return errorCode;
   }

   public void setErrorCode(int errorCode) {
      this.errorCode = errorCode;
   }

   public String getReason() {
      return reason;
   }

   public void setReason(String reason) {
      this.reason = reason;
   }

   @Override
   public String toString() {
      return "WeatherVO{" +
         "result=" + result +
         ", errorCode=" + errorCode +
         ", reason='" + reason + '\'' +
         '}';
   }
}
