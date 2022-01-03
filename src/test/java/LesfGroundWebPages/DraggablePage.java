package LesfGroundWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DraggablePage {
    WebDriver driver;

    public DraggablePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "draggable")
    WebElement drag1;

    public void Drag(String dg){
        drag1.click();
        Actions actions= new Actions(driver);
        actions.dragAndDropBy(drag1,200,200).perform();

    }
}
