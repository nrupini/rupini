package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Droppable {

  WebDriver driver;

  public Droppable(WebDriver driver){
      this.driver= driver;
      PageFactory.initElements(driver,this);
  }
  @FindBy(id="draggable")
    WebElement drag1;

  @FindBy(id = "droppable")
    WebElement drop;

  public void getdrag(){
      Actions actions= new Actions(driver);
      actions.dragAndDrop(drag1,drop).perform();
  }
}
