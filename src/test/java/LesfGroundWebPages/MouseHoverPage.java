package LesfGroundWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MouseHoverPage {
    WebDriver driver;

    public MouseHoverPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "btnMouse")
   WebElement element;

    public void getmousehov(String gmh){
        element.click();
      List<WebElement> ele=  driver.findElements(By.xpath("//a"));
        for (int i = 0; i < ele.size(); i++) {

            System.out.println(ele.get(i).getText());
        }
    }

    @FindBy(className = "btnMouse")
    WebElement handlealert;

    public void HandAlert(String hd) {
        List<WebElement> ele1 = driver.findElements(By.xpath("//a"));
        ele1.get(2).click();
        driver.switchTo().alert().accept();
    }
}

