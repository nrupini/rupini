package LesfGroundWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutocompletePage {
    WebDriver driver;

    public AutocompletePage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="tags")
    WebElement autocom;

    public void AutoComp(String at) throws InterruptedException {
        autocom.click();
        driver.findElement(By.id("tags")).sendKeys("Sel");
        Thread.sleep(Long.parseLong("5000"));
        driver.findElement(By.cssSelector("[class=\"ui-menu-item-wrapper\"]")).click();
    }
}
