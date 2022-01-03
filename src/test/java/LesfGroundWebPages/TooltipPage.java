package LesfGroundWebPages;

import net.bytebuddy.implementation.bind.annotation.This;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TooltipPage {
    WebDriver driver;

    public TooltipPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="age")
    WebElement name;

    public void Tool(String to){
        WebElement ele=driver.findElement(By.id("age"));
        WebDriverWait wait = new WebDriverWait(driver,10);
        Actions actions= new Actions(driver);
        actions.moveToElement(ele).perform();
        System.out.println(driver.findElement(By.cssSelector("[class=\"ui-tooltip-content\"]")).getText());
    }
}
