package LesfGroundWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextchangePage {
    WebDriver driver;

    public TextchangePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "btn")
    WebElement txtchnge;

    public void TxtChnge(String tcg){
        WebDriverWait wait= new WebDriverWait(driver,10);
        WebElement ele= driver.findElement(By.id("btn"));
        wait.until(ExpectedConditions.visibilityOf(ele));
        ele.click();
        driver.switchTo().alert().accept();
        System.out.println("Click Me");
    }
}
