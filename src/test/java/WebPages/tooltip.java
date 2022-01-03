package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tooltip {
    WebDriver driver;

    public tooltip(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "age")
    WebElement enter;


    public void name(){
        enter.click();
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,10);
        action.moveToElement(enter).perform();
        System.out.println(driver.findElement(By.cssSelector("[class=\"ui-tooltip-content\"]")).getText());
    }
}
