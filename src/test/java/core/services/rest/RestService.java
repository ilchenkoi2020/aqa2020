package core.services.rest;

import core.utils.properties.AppProperties;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RestService {
    private static final AppProperties appProperties = new AppProperties();
    private static final String baseUrl = appProperties.getEnvUrl();

    public static Response sendGetRequest(String requestUrl) {
        return given().log().all().filter(new AllureRestAssured()).get(baseUrl + requestUrl);
    }
}
