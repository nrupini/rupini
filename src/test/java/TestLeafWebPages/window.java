package TestLeafWebPages;

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

public class window {
    WebDriver driver;

    public window(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "home")
    WebElement ClickHome;

    @FindBy(xpath = "//*[text()=\"Open Multiple Windows\"]")
   List <WebElement> NoOfWindow;

   @FindBy(id ="color")
    WebElement windowOpen;

    public void getHome(){
        ClickHome.click();
        Set<String> wind = driver.getWindowHandles();
        List<String> array = new ArrayList(wind);
        driver.findElement(By.id("home")).click();
        driver.switchTo().window(array.get(1));
        driver.findElement(By.cssSelector("[alt=\"Edit / Text Fields\"]")).click();
        driver.switchTo().window(array.get(0));
    }

    public void getNoOfWindow(){
        Set<String> wind1 = driver.getWindowHandles();
        System.out.println(wind1.size());
    }

    public void getWind(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(windowOpen));
        windowOpen.click();
    }
}
