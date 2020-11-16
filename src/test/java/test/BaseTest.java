package test;

import core.pojos.currentWeatherAvailable.CurrentWeatherAvailable;
import core.services.rest.Route;
import core.utils.properties.AppProperties;
import io.restassured.response.Response;

import static core.services.rest.RestHelper.getObjectFromRestResponseByClassName;
import static core.services.rest.RestHelper.verifyResponseStatusCode;
import static core.services.rest.RestService.sendGetRequest;
import static core.utils.properties.AppProperties.secretKey;

public class BaseTest {
    protected AppProperties weatherstackProperties = new AppProperties();
    protected String appApiKey = weatherstackProperties.getAppProperty("weatherstackApiAccessKey");

    protected CurrentWeatherAvailable getCurrentWeatherAvailable(String city) {
        Response response = sendGetRequest(Route.getCurrentWeatherUrl(secretKey, city));
        verifyResponseStatusCode(response, 200);
        return getObjectFromRestResponseByClassName(response, CurrentWeatherAvailable.class);
    }
}
