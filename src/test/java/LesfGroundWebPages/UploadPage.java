package LesfGroundWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPage {
    WebDriver driver;

    public UploadPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "filename")
    WebElement upLoadFile;

    public void FileUpload(String Fi) throws InterruptedException {
        driver.findElement(By.name("filename")).sendKeys("C:\\Users\\ELCOT");
        Thread.sleep(5000);
    }
}
