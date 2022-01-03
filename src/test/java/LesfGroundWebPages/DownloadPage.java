package LesfGroundWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.File;

public class DownloadPage {
    WebDriver driver;

    public DownloadPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[href=\"../testleaf.xlsx\"]")
    WebElement dwnload;

    public void listOfFiles(String st) throws InterruptedException
    {
      //  dwnload.click();
       final File folder = new File("C:\\Users\\ELCOT\\Downloads");
       int bfwdwn= FileInFolder(folder);
       driver.findElement(By.cssSelector("[href=\"../testleaf.xlsx\"]")).click();
       Thread.sleep(Long.parseLong("5000"));
       int aftdwn= FileInFolder(folder);
        Assert.assertEquals(bfwdwn+1,aftdwn);

    }
    public int FileInFolder(final File folder){
        return folder.listFiles().length;
    }

}
