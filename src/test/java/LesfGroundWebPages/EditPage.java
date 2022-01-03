package LesfGroundWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPage {
    WebDriver driver;

    public EditPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "email")
    WebElement getemail;

    @FindBy(css = "input[value=\"Append \"]")
    WebElement sendval;

    @FindBy(css ="input[value=\"TestLeaf\"]")
    WebElement val;

    @FindBy(css = "input[value=\"Clear me!!\"]")
    WebElement cli;

    @FindBy(css = "input[style=\"width:350px;background-color:LightGrey;\"]")
    WebElement disable;

    public void sendEmail(String email)
    {
        getemail.sendKeys("email");
    }

    public void appe(String app){
        sendval.sendKeys("app");
    }

    public void Getval(String value){
        System.out.println(val.getAttribute("value"));
    }

    public void clear(String Clear)
    {
        cli.clear();
    }

    public void getdisabled(String disabled)
    {
         System.out.println(disable.getAttribute("disabled"));

    }
}
