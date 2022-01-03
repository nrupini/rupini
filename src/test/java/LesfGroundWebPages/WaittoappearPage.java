package LesfGroundWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaittoappearPage {
    WebDriver driver;

    public WaittoappearPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "btn")
    WebElement apprmsg;

    public void appearmsg(String apms){
        WebDriverWait wait= new WebDriverWait(driver,10);
        WebElement ele1 = driver.findElement(By.id("btn"));
        wait.until(ExpectedConditions.visibilityOf(ele1));
        System.out.println(driver.findElement(By.id("btn")).getText());
    }
}
