package TestLeafWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dragg {
    WebDriver driver;

    public dragg(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "draggable")
    WebElement drop;

    @FindBy(id="droppable")
    WebElement desc;

    public void getDrag(){
        Actions actions= new Actions(driver);
        actions.dragAndDrop(drop, desc).perform();
    }
}
