package LesfGroundWebPages;

import org.openqa.selenium.By;
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

    public void alaertbox(String at){
        alert1.click();
        driver.switchTo().alert().accept();
    }

    @FindBy(xpath = "//*[text()=\"Confirm Box\"]")
    WebElement alert2;

    public void CofirmationBox(String cb){
        alert2.click();
        driver.switchTo().alert().accept();
    }
    @FindBy(xpath = "//*[text()=\"Prompt Box\"]")
    WebElement alert3;

    public void promptBox(String bx){
        alert3.click();
        driver.switchTo().alert().sendKeys("TestLeaf");
        driver.switchTo().alert().accept();
    }

    @FindBy(xpath = "//*[text()=\"Line Breaks?\"]")
    WebElement alert4;

    public void LineBreaks(String lb){
        alert4.click();
        driver.switchTo().alert().accept();
    }

    @FindBy(id="btn")
    WebElement button;

    public void sweetmsg(String sw){
        button.click();
        driver.findElement(By.cssSelector("[class=\"swal-button swal-button--confirm\"]")).click();
    }
}
