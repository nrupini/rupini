package LesfGroundWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownPage {
    WebDriver driver;

    public DropDownPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "dropdown1")
    WebElement ind;

    public void SlctByInd(String SBI){
        Select select= new Select(ind);
        select.selectByIndex(2);
    }
    @FindBy(name = "dropdown2")
    WebElement Visible;

    public void SlByVisTxt(String sbvt){
        Select select= new Select(Visible);
        select.selectByVisibleText("Selenium");
    }
    @FindBy(id ="dropdown3")
    WebElement valu;

    public void SlByval(String slv){
        Select select= new Select(valu);
        select.selectByValue("3");
    }

    @FindBy(className = "dropdown")
    List<WebElement> dropDownList;

    public void getdrplist(String drpli){
        for (int i = 0; i < dropDownList.size(); i++) {
            System.out.println(dropDownList.get(i).getText());
        }
    }

}
