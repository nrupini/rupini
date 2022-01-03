package LesfGroundWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class FramePage {
    WebDriver driver;

    public FramePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//iframe")
    List<WebElement> frames;

    public void FirstFrame(String ff){
        driver.switchTo().frame(frames.get(0));
        driver.findElement(By.id("Click")).click();
        driver.switchTo().parentFrame();
    }

    @FindBy(xpath = "//iframe")
    List<WebElement> frame2;

    public void SecondFrame(String sf){
        driver.switchTo().frame(frame2.get(1));
        driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(frame2.get(0));
        driver.findElement(By.id("Click1")).click();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    @FindBy(xpath = "//iframe")
    List<WebElement> TotalFrames;

    public void NoOfFrame(String nff){
        System.out.println(TotalFrames.size());
    }

}
