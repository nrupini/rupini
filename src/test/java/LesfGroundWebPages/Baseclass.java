package LesfGroundWebPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import utils.DriverUtil;

public class Baseclass {
    WebDriver driver;

    @BeforeTest
    public void setDriver(){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterMethod
   public void close(){
       driver.close();
    }
}
