package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAlert {
    WebDriver driver;

    public WaitAlert(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "alert")
    WebElement wtalert;

    public void Alert(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wtalert.click();
        wait.until(ExpectedConditions.alertIsPresent());


    }
}
