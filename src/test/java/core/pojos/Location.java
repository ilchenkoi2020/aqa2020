package core.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import static core.services.rest.RestHelper.mapper;

@Setter
@Getter
public class Location {
    @JsonProperty("name")
    public String name;
    @JsonProperty("country")
    public String country;
    @JsonProperty("region")
    public String region;
    @JsonProperty("lat")
    public String lat;
    @JsonProperty("lon")
    public String lon;
    @JsonProperty("timezone_id")
    public String timezoneId;
    @JsonProperty("localtime")
    public String localtime;
    @JsonProperty("localtime_epoch")
    public Integer localtimeEpoch;
    @JsonProperty("utc_offset")
    public String utcOffset;

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
