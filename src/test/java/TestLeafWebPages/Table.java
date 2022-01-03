package TestLeafWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Table {
    WebDriver driver;

    public Table(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id ="table_id")
    WebElement getTab;

    @FindBy(tagName = "tr")
   List<WebElement>  Row;

    @FindBy(tagName = "th")
   List<WebElement>  Col;

    @FindBy(css = "td:nth-child(2)")
    List<WebElement>  progress;

    @FindBy(css = "td:nth-child(3) input")
    List<WebElement> least;

    public void tab(){
        getTab.click();
    }
    public void noOfRow(){
        System.out.println(Row.size());

    }
    public void noOfCol(){
        System.out.println(Col.size());

    }
    public void progressList(){
        System.out.println(progress.get(1).getText());
    }
    public void getLeast(){
       least.get(2).click();
    }
}

