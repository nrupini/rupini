package TestLeafWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class alert {

    WebDriver driver;

    public alert(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[text()=\"Alert Box\"]")
    WebElement alert1;

    @FindBy(xpath = "//*[text()=\"Confirm Box\"]")
    WebElement alert2;

    @FindBy(xpath = "//*[text()=\"Prompt Box\"]")
    WebElement alert3;

    @FindBy(xpath = "//*[text()=\"Line Breaks?\"]")
    WebElement alert4;

    @FindBy(id = "btn")
    WebElement sweet;

    public void getAlert1(){
        alert1.click();
    }
    public void getAlert2(){
        alert2.click();
    }
    public void getAlert3(){
        alert3.click();
    }
    public void getAlert4(){
        alert4.click();
    }
    public void getSweet(){
        sweet.click();
    }
}
