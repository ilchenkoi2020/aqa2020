package core.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import static core.services.rest.RestHelper.mapper;

@Setter
@Getter
public class Current {
    @JsonProperty("observation_time")
    public String observationTime;
    @JsonProperty("temperature")
    public Integer temperature;
    @JsonProperty("weather_code")
    public Integer weatherCode;
    @JsonProperty("weather_icons")
    public List<String> weatherIcons = null;
    @JsonProperty("weather_descriptions")
    public List<String> weatherDescriptions = null;
    @JsonProperty("wind_speed")
    public Integer windSpeed;
    @JsonProperty("wind_degree")
    public Integer windDegree;
    @JsonProperty("wind_dir")
    public String windDir;
    @JsonProperty("pressure")
    public Integer pressure;
    @JsonProperty("precip")
    public Integer precip;
    @JsonProperty("humidity")
    public Integer humidity;
    @JsonProperty("cloudcover")
    public Integer cloudcover;
    @JsonProperty("feelslike")
    public Integer feelslike;
    @JsonProperty("uv_index")
    public Integer uvIndex;
    @JsonProperty("visibility")
    public Integer visibility;
    @JsonProperty("is_day")
    public String isDay;

    @Override
    public String toString() {
        try {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mapper.convertValue(this, Object.class));
        } catch (Exception e) {
//            LogUtils.logSevereMessageThenFail("File read failed: " + e.getMessage());
            return null;
        }
    }
}
