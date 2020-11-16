
package core.pojos.historicalWeather;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import static core.services.rest.RestHelper.mapper;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "sunrise",
        "sunset",
        "moonrise",
        "moonset",
        "moon_phase",
        "moon_illumination"
})
public class Astro {

    @JsonProperty("sunrise")
    public String sunrise;
    @JsonProperty("sunset")
    public String sunset;
    @JsonProperty("moonrise")
    public String moonrise;
    @JsonProperty("moonset")
    public String moonset;
    @JsonProperty("moon_phase")
    public String moonPhase;
    @JsonProperty("moon_illumination")
    public Integer moonIllumination;

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
