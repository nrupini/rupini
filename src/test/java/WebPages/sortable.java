package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class sortable {
    WebDriver driver;

    public sortable(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[id=\"sortable\"] li")
    List<WebElement> sort;

    public void Sort1(){
        Actions actions= new Actions(driver);
        actions.dragAndDrop(sort.get(4),sort.get(2)).perform();
    }
}
