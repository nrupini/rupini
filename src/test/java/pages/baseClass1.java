package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.driverUtil;

import java.util.concurrent.TimeUnit;

public class baseClass1 {

    WebDriver driver;

    @BeforeTest
    public void setDriver(){
        driver= driverUtil.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void close(){
        driver.close();
    }
}
