package TestLeafWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDwn {
    WebDriver driver;

    public dropDwn(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="dropdown1")
    WebElement index;

    @FindBy(name = "dropdown2")
    WebElement visible;

    @FindBy(id = "dropdown3")
    WebElement value;

    @FindBy(className = "dropdown")
    List<WebElement> dropDownList;

    public void getIndex(){
        Select select= new Select(index);
        select.selectByIndex(2);
    }

    public void getvisible(){
        Select select = new Select(visible);
        select.selectByVisibleText("Appium");
    }

    public void getvalue(){
        Select select= new Select(value);
        select.selectByValue("3");
    }

    public void List(){
        for (int i = 0; i < dropDownList.size(); i++) {
            System.out.println(dropDownList.get(i).getText());
        }
    }
}
