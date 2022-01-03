package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Frames {

    WebDriver driver;

    public Frames(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//iframe")
    List<WebElement> frame1;

    @FindBy(xpath = "//iframe")
   List <WebElement> Insideframe;

   @FindBy(xpath = "//iframe")
   List <WebElement> NoOfFrame;

    public void ClickFrame(){
        driver.switchTo().frame(frame1.get(0));
        driver.findElement(By.id("Click")).click();
        driver.switchTo().parentFrame();
    }

    public void ClickFrame2(){
   driver.switchTo().frame(Insideframe.get(1));
   driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(Insideframe.get(0));
        driver.findElement(By.id("Click1")).click();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void numberFrame(){
        System.out.println(NoOfFrame.size());
    }

}
