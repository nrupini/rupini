package TestLeafWebPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class sortablePage {

    WebDriver driver;

    public sortablePage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[id=\"selectable\"] li")
   List <WebElement> sort;

    public void getSort(){
        Actions actions = new Actions(driver);
        actions.click(sort.get(5)).keyDown(Keys.CONTROL).click(sort.get(2)).keyDown(Keys.CONTROL).perform();
    }
}
