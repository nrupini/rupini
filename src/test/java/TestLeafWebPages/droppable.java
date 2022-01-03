package TestLeafWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class droppable {

    WebDriver driver;

    public droppable(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id ="draggable")
    WebElement dra;

    public void dragga(){
        Actions actions= new Actions(driver);
        actions.dragAndDropBy(dra,200,200).perform();


    }
}
