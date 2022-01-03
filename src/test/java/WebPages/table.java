package WebPages;

import LesfGroundWebPages.TablePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class table {

    WebDriver driver;

    public table(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "table_id")
   WebElement table;

    @FindBy(tagName = "th")
   List <WebElement> columnHeader;

    @FindBy(tagName = "tr")
    List<WebElement> Rows;

    @FindBy(css = "td:nth-child(2)")
    List<WebElement> ProgressList;

     @FindBy(css = "td:nth-child(3) input")
     List<WebElement> least;

    public void getTable(){
        table.click();
    }

    public void NoOfColumn(){
        System.out.println(columnHeader.size());
        }

    public void NoOfRows(){
        System.out.println(Rows.size());

    }
    public void Progress(){
        System.out.println(ProgressList.get(1).getText());
    }

    public void Leastvalue(){


        least.get(2).click();


    }
    }

