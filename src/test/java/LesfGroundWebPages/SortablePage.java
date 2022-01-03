package LesfGroundWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SortablePage {
    WebDriver driver;

    public SortablePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[id=\"sortable\"] li")
    List<WebElement> sort1;

    public void getSort(String gS){
        driver.findElement(By.cssSelector("[id=\"sortable\"] li"));
        Actions actions= new Actions(driver);
        actions.dragAndDrop(sort1.get(4),sort1.get(2)).perform();
    }
}
