package LesfGroundWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SelectablePage {
    WebDriver driver;

    public SelectablePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[id=\"selectable\"] li")
    List<WebElement> select1;

    public void getSelect(String gS){
        driver.findElement(By.cssSelector("[id=\"selectable\"] li"));
        Actions actions= new Actions(driver);
        actions.click(select1.get(3)).keyDown(Keys.CONTROL).click(select1.get(5)).keyDown(Keys.CONTROL).perform();
    }

}
