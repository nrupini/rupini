package TestLeafWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class txtChange {
    WebDriver driver;

    public txtChange(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "btn")
    WebElement txt;

    public void change(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(txt));
        System.out.println("Click ME!");
    }
    public void alertAppera(){
        driver.get("http://www.leafground.com/pages/alertappear.html");

    }
}
