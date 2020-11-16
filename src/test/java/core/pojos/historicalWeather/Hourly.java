
package core.pojos.historicalWeather;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import static core.services.rest.RestHelper.mapper;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "time",
    "temperature",
    "wind_speed",
    "wind_degree",
    "wind_dir",
    "weather_code",
    "weather_icons",
    "weather_descriptions",
    "precip",
    "humidity",
    "visibility",
    "pressure",
    "cloudcover",
    "heatindex",
    "dewpoint",
    "windchill",
    "windgust",
    "feelslike",
    "chanceofrain",
    "chanceofremdry",
    "chanceofwindy",
    "chanceofovercast",
    "chanceofsunshine",
    "chanceoffrost",
    "chanceofhightemp",
    "chanceoffog",
    "chanceofsnow",
    "chanceofthunder",
    "uv_index"
})
public class Hourly {

    @JsonProperty("time")
    public String time;
    @JsonProperty("temperature")
    public Integer temperature;
    @JsonProperty("wind_speed")
    public Integer windSpeed;
    @JsonProperty("wind_degree")
    public Integer windDegree;
    @JsonProperty("wind_dir")
    public String windDir;
    @JsonProperty("weather_code")
    public Integer weatherCode;
    @JsonProperty("weather_icons")
    public List<String> weatherIcons = null;
    @JsonProperty("weather_descriptions")
    public List<String> weatherDescriptions = null;
    @JsonProperty("precip")
    public Double precip;
    @JsonProperty("humidity")
    public Integer humidity;
    @JsonProperty("visibility")
    public Integer visibility;
    @JsonProperty("pressure")
    public Integer pressure;
    @JsonProperty("cloudcover")
    public Integer cloudcover;
    @JsonProperty("heatindex")
    public Integer heatindex;
    @JsonProperty("dewpoint")
    public Integer dewpoint;
    @JsonProperty("windchill")
    public Integer windchill;
    @JsonProperty("windgust")
    public Integer windgust;
    @JsonProperty("feelslike")
    public Integer feelslike;
    @JsonProperty("chanceofrain")
    public Integer chanceofrain;
    @JsonProperty("chanceofremdry")
    public Integer chanceofremdry;
    @JsonProperty("chanceofwindy")
    public Integer chanceofwindy;
    @JsonProperty("chanceofovercast")
    public Integer chanceofovercast;
    @JsonProperty("chanceofsunshine")
    public Integer chanceofsunshine;
    @JsonProperty("chanceoffrost")
    public Integer chanceoffrost;
    @JsonProperty("chanceofhightemp")
    public Integer chanceofhightemp;
    @JsonProperty("chanceoffog")
    public Integer chanceoffog;
    @JsonProperty("chanceofsnow")
    public Integer chanceofsnow;
    @JsonProperty("chanceofthunder")
    public Integer chanceofthunder;
    @JsonProperty("uv_index")
    public Integer uvIndex;

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
