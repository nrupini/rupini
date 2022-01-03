package TestLeafWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.accessibility.AccessibleTable;
import java.util.List;

public class mouseHover {
    WebDriver driver;

    public mouseHover(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(className ="btnMouse")
  WebElement mouCli;

    @FindBy(xpath = "//a")
    List<WebElement> list;

     public void mouse(){
         mouCli.click();
     }

     public void path(){
        list.get(2).click();
     }
}
