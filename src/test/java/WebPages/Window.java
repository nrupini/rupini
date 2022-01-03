package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Window {
    WebDriver driver;

    public Window(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "home")
    WebElement home;

    @FindBy(xpath = "//*[text()=\"Open Multiple Windows\"]")
   List <WebElement> NoOfWindows;

    @FindBy(id = "color")
    WebElement WaitWindows;

    public void Click(){
        home.click();
        Set<String> wind= driver.getWindowHandles();
        List<String> handle= new ArrayList(wind);
        driver.findElement(By.id("home")).click();
        driver.switchTo().window(handle.get(1));
        driver.findElement(By.cssSelector("[alt=\"Edit / Text Fields\"]")).click();
        driver.switchTo().window(handle.get(0));
    }

    public void Windows(){
        Set<String> wind1= driver.getWindowHandles();
        System.out.println(wind1.size());
    }

    public void waitt(){
        WebDriverWait wait= new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(WaitWindows));
        WaitWindows.click();
    }
}
