package TestLeafWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.Pageable;

public class editPage {

     WebDriver driver;

     public editPage(WebDriver driver){
         this.driver=driver;
         PageFactory.initElements(driver,this);
     }

     @FindBy(id="email")
    WebElement getEmail;

     @FindBy(css = "input[value=\"Append \"]")
    WebElement AppendText;

     @FindBy(css = "input[value=\"TestLeaf\"]")
    WebElement Text;

     @FindBy(css = "input[value=\"Clear me!!\"]")
    WebElement clear;

     @FindBy(css="input[style=\"width:350px;background-color:LightGrey;\"]")
    WebElement disabled;

     public void setEmail(String mail){
         getEmail.sendKeys(mail);
     }
     public void setAppendText(String txt){
         AppendText.sendKeys(txt);
     }
     public void defau(){
         System.out.println(Text.getAttribute("value"));
     }
     public void getclear(){
         clear.click();
     }
     public void getDisabled(){
         System.out.println(disabled.getAttribute("disabled"));
     }
}
