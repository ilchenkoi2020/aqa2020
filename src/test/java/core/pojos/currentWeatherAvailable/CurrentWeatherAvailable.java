package core.pojos.currentWeatherAvailable;

import com.fasterxml.jackson.annotation.JsonProperty;
import core.pojos.BasePojo;
import core.pojos.Current;
import core.pojos.Location;
import core.pojos.Request;
import lombok.Getter;
import lombok.Setter;

import static core.services.rest.RestHelper.mapper;
@Getter
@Setter
public class CurrentWeatherAvailable extends BasePojo {
    @JsonProperty("request")
    public Request request;
    @JsonProperty("location")
    public Location location;
    @JsonProperty("current")
    public Current current;

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
