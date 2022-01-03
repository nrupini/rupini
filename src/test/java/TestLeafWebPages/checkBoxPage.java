package TestLeafWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class checkBoxPage {
    WebDriver driver;

    public checkBoxPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy( css= "input[type=\"checkbox\"]")
    List <WebElement> Select;

    @FindBy( css ="input[type=\"checkbox\"]")
    List<WebElement> Select1;

    @FindBy(css ="input[type=\"checkbox\"]")
    List<WebElement> Select2;

    @FindBy( css= "input[type=\"checkbox\"]")
    List<WebElement> Select3;

    public void checkBox(){
        Select.get(2).click();
    }
    public void checkBox1(){
       Boolean x= Select1.get(5).isSelected();
        System.out.println(x);
        }
     public void checkbox2(){
        Select2.get(7).click();
     }
     public void  checkbox3(){
        Select3.get(8).click();
         Select3.get(9).click();
         Select3.get(10).click();
         Select3.get(11).click();
         Select3.get(12).click();
     }
    }
