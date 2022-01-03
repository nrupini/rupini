package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverUtil {

   static WebDriver driver;

     private driverUtil(){

      }

      public static WebDriver init(){
          if (driver==null){
              WebDriverManager.chromedriver().setup();
              driver = new ChromeDriver();
          }
          return driver;
      }

      public static WebDriver getDriver(){
         return init();
      }
}
