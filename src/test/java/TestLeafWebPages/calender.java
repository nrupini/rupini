package TestLeafWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class calender {

    WebDriver driver;

    public calender(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id ="datepicker")
    WebElement dateId;


    public void getCal(){
        dateId.click();
        driver.findElement(By.xpath(String.format("//*[text()='%s']",10))).click();
    }
}
