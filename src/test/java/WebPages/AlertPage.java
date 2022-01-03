package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage {

    WebDriver driver;

    public AlertPage(WebDriver driver){
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

    @FindBy(xpath = "//*[text()=\"Sweet Alert\"]")
    WebElement alert5;

    @FindBy(id="btn")
    WebElement alert6;

    public void display(){
        alert1.click();
    }

    public void confirm(){
        alert2.click();
    }

    public void prompt(){
        alert3.click();
    }
    public void line(){
        alert4.click();
    }
    public void sweet(){
        alert5.click();
    }
}
