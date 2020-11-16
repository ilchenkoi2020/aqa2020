package core.services.rest;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import core.pojos.BasePojo;
import io.restassured.response.Response;

import java.io.IOException;

public class RestHelper {
    public static ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    public static <T extends BasePojo> T getObjectFromRestResponseByClassName(Response response, Class<T> className) {
        BasePojo baseEntity = null;
        JavaType javaType = mapper.getTypeFactory().constructType(className);
        try {
            baseEntity = mapper.readValue(response.body().asString(), javaType);
        } catch (IOException e) {
//            LogUtils.logSevereMessageThenFail("Json parsing failed: " + e.getMessage());
        }
        return (T) baseEntity;
    }

    public static void verifyResponseStatusCode(Response response, int statusCode) {
        if (response.statusCode() != statusCode) {
//            LogUtils.logSevereMessageThenFail("Status code is incorrect Expected " + statusCode + " but was " + response.statusCode() + " \n" + response.body().asString());
        }
    }
}
