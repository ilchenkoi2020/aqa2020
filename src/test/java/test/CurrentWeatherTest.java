package test;

import core.pojos.currentWeatherAvailable.CurrentWeatherAvailable;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CurrentWeatherTest extends BaseTest {
    @Test(groups = {"api", "full"})
    public void kievCityCurrentWeatherTest() {
        String CITY = "Kiev";
        CurrentWeatherAvailable currentWeatherAvailable = getCurrentWeatherAvailable(CITY);
        Assert.assertEquals(currentWeatherAvailable.getLocation().getName(), CITY);
    }

    @Test(groups = {"api", "full"})
    public void LondonCityCurrentWeatherTest() {
        String CITY = "London";
        CurrentWeatherAvailable currentWeatherAvailable = getCurrentWeatherAvailable(CITY);
        Assert.assertEquals(currentWeatherAvailable.getLocation().getName(), CITY);
    }

    @Test(groups = {"api", "full"})
    public void BerlinCityCurrentWeatherTest() {
        String CITY = "Berlin";
        CurrentWeatherAvailable currentWeatherAvailable = getCurrentWeatherAvailable(CITY);
        Assert.assertEquals(currentWeatherAvailable.getLocation().getName(), CITY);
    }

    @Test(groups = {"api", "full"})
    public void Berlin2CityCurrentWeatherTest() {
        String CITY = "Berlin";
        CurrentWeatherAvailable currentWeatherAvailable = getCurrentWeatherAvailable(CITY);
        Assert.assertEquals(currentWeatherAvailable.getLocation().getName(), CITY + 1);
    }

    @Test(groups = {"api", "full"})
    public void LvivCityCurrentWeatherTest() {
        String CITY = "Lviv";
        CurrentWeatherAvailable currentWeatherAvailable = getCurrentWeatherAvailable(CITY);
        Assert.assertEquals(currentWeatherAvailable.getLocation().getName(), CITY);
    }

}
