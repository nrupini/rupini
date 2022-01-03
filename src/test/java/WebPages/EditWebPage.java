package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditWebPage {
     WebDriver driver;

     public EditWebPage(WebDriver driver){
         this.driver = driver;
         PageFactory.initElements(driver,this);

     }
        @FindBy(id = "email")
        WebElement sendEmail;

     public void sendmail(String sendmail)
     {
         sendEmail.sendKeys("email");

     }

        @FindBy(css = "input[value=\"Append \"]")
        WebElement sendKey;

        @FindBy(css = "input[value=\"TestLeaf\"]")
        WebElement Print;

        @FindBy(css = "input[value=\"Clear me!!\"]")
        WebElement clear;

        @FindBy(css = "input[style=\"width:350px;background-color:LightGrey;\"]")
        WebElement disabled;




        public void append(String append){
            sendKey.sendKeys("app");
        }

        public void GetString(String GetString){
            System.out.println(Print.getAttribute("value"));
        }

        public void Clear(String Clear){
            clear.click();
        }

        public void GetDisabled(String GetDisabled){
            System.out.println(disabled.getAttribute("disabled"));
        }

    }


