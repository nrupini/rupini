package TestLeafWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class toolTip {
    WebDriver driver;

    public toolTip(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="age")
   WebElement tip;

    public void getTip(){
        tip.click();
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,5);
        actions.moveToElement(tip).perform();
        System.out.println(driver.findElement(By.cssSelector("[class=\"ui-tooltip-content\"]")).getText());

    }
}
