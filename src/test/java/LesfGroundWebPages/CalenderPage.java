package LesfGroundWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalenderPage {
    WebDriver driver;

    public CalenderPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "datepicker")
    WebElement pickdate;

    public void  getDate(String gd){
       pickdate.click();
        driver.findElement(By.xpath(String.format("//*[text()='%s']",10))).click();
    }
}
