package TestLeafWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.print.DocFlavor;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class imagePage {
    WebDriver driver;

    public imagePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "[src=\"../images/home.png\"]")
    WebElement ClickHome;

    @FindBy(css = "[src=\"../images/abcd.jpg\"]")
    WebElement imageBroken;

    @FindBy(css = "[src=\"../images/keyboard.png\"]")
    WebElement KeyBoard;

    public void setClickHome(){
        ClickHome.click();
    }
    public void brkImg() throws IOException {
        String img = imageBroken.getAttribute("src");
        URL u = new URL(img);
        HttpURLConnection huc= (HttpURLConnection) u.openConnection();
        huc.connect();
        int responsecode= huc.getResponseCode();
        if (responsecode>=400){
            System.out.println("image Broken");
        }else   {
            System.out.println("image Not broken");
        }
    }

    public void actKey(){
        Actions actions = new Actions(driver);
        actions.click(KeyBoard).perform();
    }
}
