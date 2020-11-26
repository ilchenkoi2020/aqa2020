package test;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class UiTest {
    @Test(groups = {"ui", "full"})
    public void getGuru99Page() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
//        capabilities.setPlatform(Platform.MAC);
        WebDriver driver;
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        driver.get("https://www.guru99.com/introduction-to-selenium-grid.html");
        driver.quit();
    }
}
