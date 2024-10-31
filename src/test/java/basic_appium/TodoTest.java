package basic_appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class TodoTest {

    AppiumDriver driver;

    @BeforeEach
    public void openApp() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:deviceNam", "Nice");
        capabilities.setCapability("appium:platformVersion", "15.0");
        capabilities.setCapability("appium:appPackage", "com.vrproductiveapps.whendo");
        capabilities.setCapability("appium:appActivity", "com.vrproductiveapps.whendo.ui.HomeActivity");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appium:automationName","uiautomator2");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
    @AfterEach
    public void closeApp(){
        driver.quit();
    }

    @Test
    public void verifyAddTask() throws InterruptedException {
        String TITLE = "FirstTitle";
        driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id=\"com.vrproductiveapps.whendo:id/fab\"]")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.vrproductiveapps.whendo:id/noteTextTitle\"]")).sendKeys(TITLE);
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.vrproductiveapps.whendo:id/noteTextNotes\"]")).sendKeys("NOtes...");
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Save\"]")).click();
        Thread.sleep(5000);
        String Title = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.vrproductiveapps.whendo:id/home_list_item_text\"]")).getText();
        Assertions.assertEquals(TITLE,TITLE, "Error, al crear el task");
    }
}



//{
//        "appium:deviceName": "Nice",
//        "appium:platformVersion": "15.0",
//        "appium:appPackage": "com.vrproductiveapps.whendo",
//        "appium:appActivity": "com.vrproductiveapps.whendo.ui.HomeActivity",
//        "platformName": "Android",
//        "appium:automationName": "uiautomator2"
//        }
