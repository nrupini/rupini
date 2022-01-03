package TestLeafWebPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.driverUtil;

public class base {

    WebDriver driver;

    @BeforeTest
    public void setDriver(){
        driver= driverUtil.getDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void close(){
        driver.close();
    }

}
