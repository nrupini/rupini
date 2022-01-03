package LesfGroundWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForApperance {
    WebDriver driver;

   public WaitForApperance(WebDriver driver){
       this.driver=driver;
       PageFactory.initElements(driver,this);
   }
   @FindBy(id = "alert")
    WebElement alr;

   public void wtAppear(String wta){
       alr.click();
       WebDriverWait wait= new WebDriverWait(driver,10);
   }
}
