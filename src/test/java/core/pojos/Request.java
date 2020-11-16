package core.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import static core.services.rest.RestHelper.mapper;

@Setter
@Getter
public class Request {
    @JsonProperty("type")
    public String type;
    @JsonProperty("query")
    public String query;
    @JsonProperty("language")
    public String language;
    @JsonProperty("unit")
    public String unit;

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
