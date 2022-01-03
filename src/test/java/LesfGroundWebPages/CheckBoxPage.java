package LesfGroundWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckBoxPage {
        WebDriver driver;

        public CheckBoxPage(WebDriver driver){
            this.driver= driver;
            PageFactory.initElements(driver,this);
        }

        @FindBy(css = "input[type=\"checkbox\"]")
        List<WebElement> select;

        public void Check(String ch){
            select.get(3).click();
        }

        @FindBy(css = "input[type=\"checkbox\"]")
        List<WebElement> getselect;

        public void check1(String ch1){
            Boolean x =getselect.get(5).isSelected();
            System.out.println(x);
        }

        @FindBy(css = "input[type=\"checkbox\"]")
        List<WebElement> getdeselect;

        public void check2(String ch2){
            getdeselect.get(7).click();
        }

        @FindBy(css = "input[type=\"checkbox\"]")
        List<WebElement> selectAll;

        public void chkall(String ch3){
            selectAll.get(8).click();
            selectAll.get(9).click();
            selectAll.get(10).click();
            selectAll.get(11).click();
            selectAll.get(12).click();
        }
    }

