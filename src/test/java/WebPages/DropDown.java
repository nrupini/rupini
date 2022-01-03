package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {

    WebDriver driver;

    public DropDown(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "dropdown1")
    WebElement selectIndex;

    @FindBy(name = "dropdown2")
    WebElement selectVisibleText;

    @FindBy(id = "dropdown3")
    WebElement selectValue;

    @FindBy(className = "dropdown")
    List<WebElement> ListOfDropdown;

    public void Index(){
        Select select= new Select(selectIndex);
        select.selectByIndex(1);
    }

    public void VisibleText(){
        Select select= new Select(selectVisibleText);
        select.selectByVisibleText("Appium");
    }

    public void value(){
        Select select = new Select(selectValue);
        select.selectByValue("3");
    }

    public void setListOfDropdown(){
        for (int i = 0; i < ListOfDropdown.size(); i++) {
            System.out.println(ListOfDropdown.get(i).getText());
        }

    }

}
