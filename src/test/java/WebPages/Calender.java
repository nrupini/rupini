package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calender {

    WebDriver driver;

    public Calender(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "datepicker")
    WebElement table;


    public void cal(){
        table.click();
        driver.findElement(By.xpath(String.format("//*[text()='%s']",10))).click();
    }
}
