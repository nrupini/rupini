package LesfGroundWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TablePage {
    WebDriver driver;

    public TablePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

     @FindBy(id = "table_id")
    WebElement entireTable;

    public void getentireTable(String gentable){
       entireTable.click();
    }

    @FindBy(tagName = "tr")
    List<WebElement> Rows;

    public void NoOfRoes(String nor){
        System.out.println(Rows.size());
    }

    @FindBy(tagName = "th")
    List<WebElement> ColsHeader;

    public void NoOfCols(String noc){
        System.out.println(ColsHeader.size());
    }

    @FindBy(css = "td:nth-child(2)")
    List<WebElement> progressList;

    public void ColsOf2ndrow(String st){
        System.out.println(progressList.get(1).getText());
    }

    @FindBy(css = "td:nth-child(3) input")
    List<WebElement> Checkleast;

    public void RowsOf3Cols(String cs){
        for (int i = 0; i < Checkleast.size(); i++) {

            Checkleast.get(2).click();
        }
    }
}
