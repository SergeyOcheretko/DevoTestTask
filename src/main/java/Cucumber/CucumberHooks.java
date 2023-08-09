package Cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CucumberHooks  {
    public static void main(String[] args) {

    }
    protected static WebDriver driver;

    @Before
    public void setup() throws IOException {
     if (System.getProperty("webdriver.chrome.driver")==null) {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sergey\\QWEQWRT\\DevoTestTask\\src\\main\\resources\\driver\\chromedriver.exe");
     }

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://subsly.com/checkout/?order=698 ");
    }

    public static WebDriver getDriver() {
        return driver;
    }

    @After
    public void quit() {
        driver.quit();
    }}
