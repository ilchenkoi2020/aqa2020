package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class UiTest {
    @Test(groups = {"ui", "full"})
    public void chromeDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.LINUX);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//        options.addArguments("--no-sandbox");
//        options.addArguments("--headless"); //should be enabled for Jenkins
//        options.addArguments("--disable-dev-shm-usage"); //should be enabled for Jenkins
//        options.addArguments("--window-size=1920x1080"); //should be enable
        WebDriver driver;
        driver = new RemoteWebDriver(new URL("http://34.76.237.86:4444/wd/hub"), capabilities);
//        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        driver.get("https://www.guru99.com/introduction-to-selenium-grid.html");
        driver.quit();
    }

    @Test(groups = {"ui", "full"})
    public void testGoogleSearch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/m2b011990/selenium/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(options);
//        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/downloads/");
        System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Downloads')]")).getText());
        Thread.sleep(5000);  // Let the user actually see something!
        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();
    }
}