package WebPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.List;

public class Selectable {
    WebDriver driver;

    public Selectable(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[id=\"selectable\"] li")
    List<WebElement> selectable;

    public void GetSelect(){
        Actions actions= new Actions(driver);
        actions.click(selectable.get(2)).keyDown(Keys.CONTROL).click(selectable.get(4)).keyDown(Keys.CONTROL).perform();
    }
}
