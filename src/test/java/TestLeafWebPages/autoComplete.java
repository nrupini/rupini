package TestLeafWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autoComplete {
    WebDriver driver;

    public autoComplete(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="tags")
    WebElement select;

   // @FindBy(css = "[class=\"ui-menu-item-wrapper\"]")
 //   WebElement select1;

    public void auto1(){
       select.sendKeys("Sel");
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(select));
        select.click();
    }


    }

