
package core.pojos.historicalWeather;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import core.pojos.BasePojo;
import core.pojos.Location;
import core.pojos.Request;
import core.pojos.currentWeatherAvailable.CurrentWeatherAvailable;

import static core.services.rest.RestHelper.mapper;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "request",
        "location",
        "current",
        "historical"
})
public class HistoryWeather extends BasePojo {

    @JsonProperty("request")
    public Request request;
    @JsonProperty("location")
    public Location location;
    @JsonProperty("current")
    public CurrentWeatherAvailable current;
    @JsonProperty("historical")
    public Historical historical;

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
