package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.accessibility.AccessibleTable;
import java.util.List;

public class MouseHover {
   WebDriver driver;

   public MouseHover(WebDriver driver){
       this.driver=driver;
       PageFactory.initElements(driver,this);
   }

   @FindBy(className = "btnMouse")
    WebElement mouse;

   @FindBy(xpath = "//a")
   List<WebElement> cli;

   public void Hover(){
       mouse.click();
       }
   public void hover1(){
       cli.get(3).click();
   }
}
