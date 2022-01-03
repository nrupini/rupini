package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Draggable {
    WebDriver driver;

    public Draggable(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="draggable")
    WebElement drag;

    public void DragandDrop(){
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(drag,200,250).perform();
    }
}
