package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckBox {

    WebDriver driver;

    public CheckBox(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "input[type=\"checkbox\"]")
    List<WebElement> Check1;

    @FindBy(css = "input[type=\"checkbox\"]")
    List<WebElement> checked;

    @FindBy(css="input[type=\"checkbox\"]")
    List<WebElement> Deselect;

    @FindBy(css= "input[type=\"checkbox\"]")
    List<WebElement> Selectall;

    public void language(){
        Check1.get(2).click();
    }

    public void print(){
        Boolean x = checked.get(5).isSelected();
        System.out.println(x);
    }

    public void select(){
        Deselect.get(7).click();
    }

    public void Selectall(){
        Selectall.get(8).click();
        Selectall.get(9).click();
        Selectall.get(10).click();
        Selectall.get(11).click();
        Selectall.get(12).click();
    }
}
