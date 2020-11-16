
package core.pojos.historicalWeather;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import static core.services.rest.RestHelper.mapper;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "date_epoch",
    "astro",
    "mintemp",
    "maxtemp",
    "avgtemp",
    "totalsnow",
    "sunhour",
    "uv_index",
    "hourly"
})
public class RequestedDate {

    @JsonProperty("date")
    public String date;
    @JsonProperty("date_epoch")
    public Integer dateEpoch;
    @JsonProperty("astro")
    public Astro astro;
    @JsonProperty("mintemp")
    public Integer mintemp;
    @JsonProperty("maxtemp")
    public Integer maxtemp;
    @JsonProperty("avgtemp")
    public Integer avgtemp;
    @JsonProperty("totalsnow")
    public Integer totalsnow;
    @JsonProperty("sunhour")
    public Double sunhour;
    @JsonProperty("uv_index")
    public Integer uvIndex;
    @JsonProperty("hourly")
    public List<Hourly> hourly = null;

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
