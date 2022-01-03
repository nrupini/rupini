package TestLeafWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class framePage {
    WebDriver driver;

    public  framePage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//iframe")
   List <WebElement> frame1;

    @FindBy(xpath = "//iframe")
   List<WebElement> frame2;

    @FindBy(xpath = "//iframe")
  List <WebElement> frame3;

    public void getFrame1(){
        driver.switchTo().frame(frame1.get(0));
        driver.findElement(By.id("Click")).click();
        driver.switchTo().parentFrame();
    }
    public  void getFrame2(){
        driver.switchTo().frame(frame2.get(1));
        driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(frame2.get(0));
        driver.findElement(By.id("Click1")).click();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void getNoOfFrames(){
        System.out.println(frame3.size());
    }
}
