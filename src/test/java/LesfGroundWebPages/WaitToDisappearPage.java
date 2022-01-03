package LesfGroundWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitToDisappearPage {
    WebDriver driver;

    public WaitToDisappearPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "show")
    WebElement msg;

    public void disapper(String dp){
        WebElement ele =driver.findElement(By.id("btn"));
        WebDriverWait wait= new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.invisibilityOf(ele));
        System.out.println(driver.findElement(By.id("show")).getText());

    }
}
