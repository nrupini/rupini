package LesfGroundWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Set;

public class WindowPage {
    WebDriver driver;

    public WindowPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "home")
    WebElement windowhand;

    public void newWindow(String nw){
        windowhand.click();
       Set<String> wind= driver.getWindowHandles();
       ArrayList<String>arrayList =new ArrayList(wind);
       driver.switchTo().window(arrayList.get(1));
       driver.findElement(By.cssSelector("[alt=\"Edit / Text Fields\"]")).click();
       driver.switchTo().window(arrayList.get(0));
    }

    @FindBy(id = "home")
    WebElement NoOfWindows;

    public void OpenWindows(String Op){
        Set<String> wind1= driver.getWindowHandles();
        System.out.println(wind1.size());
    }

    @FindBy(id = "color")
    WebElement WaitToOpen;

    public void WaitExcep(String we) throws InterruptedException {
        WaitToOpen.click();
        Set<String> wind2= driver.getWindowHandles();
        wind2.size();
        Thread.sleep(Long.parseLong("5000"));
        Assert.assertEquals(wind2.size(),4);
    }
}
