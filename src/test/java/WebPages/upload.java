package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upload {
    WebDriver driver;

    public upload(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "filename")
    WebElement load;

    public void uploadfile(String Send){
        load.sendKeys(Send);
    }
}
