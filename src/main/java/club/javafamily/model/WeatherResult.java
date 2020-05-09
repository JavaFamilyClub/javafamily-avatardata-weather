package club.javafamily.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Arrays;

public class WeatherResult implements Serializable {
    @JsonProperty("realtime")
    private RealTime realTime;
    private Life life;
    private WeatherItem[] weather;
    private Pm25 pm25;
    private int isForeign;

    public RealTime getRealTime() {
        return realTime;
    }

    public void setRealTime(RealTime realTime) {
        this.realTime = realTime;
    }

    public Life getLife() {
        return life;
    }

    public void setLife(Life life) {
        this.life = life;
    }

    public WeatherItem[] getWeather() {
        return weather;
    }

    public void setWeather(WeatherItem[] weather) {
        this.weather = weather;
    }

    public Pm25 getPm25() {
        return pm25;
    }

    public void setPm25(Pm25 pm25) {
        this.pm25 = pm25;
    }

    public int getIsForeign() {
        return isForeign;
    }

    public void setIsForeign(int isForeign) {
        this.isForeign = isForeign;
    }

    @Override
    public String toString() {
        return "WeatherResult{" +
           "realTime=" + realTime +
           ", life=" + life +
           ", weather=" + (weather != null ? Arrays.asList(weather).toString() : "") +
           ", pm25=" + pm25 +
           ", isForeign=" + isForeign +
           '}';
    }
}
