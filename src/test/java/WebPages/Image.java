package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Image {
    WebDriver driver;

    public Image(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[src=\"../images/home.png\"]")
    WebElement ClickHome;

    @FindBy(css = "[src=\"../images/abcd.jpg\"]")
    WebElement ImageBroken;

    @FindBy(css = "[src=\"../images/keyboard.png\"]")
    WebElement Action;

    public void Homebtn(){
        this.ClickHome.click();
    }

    public void ImageBroken() throws IOException {
        String st= ImageBroken.getAttribute("src");
        URL u = new URL(st);
        HttpURLConnection huc = (HttpURLConnection) u.openConnection();
        huc.connect();
        int responsecode = huc.getResponseCode();
        if (responsecode>=400){
            System.out.println("link broken");
        }else{
            System.out.println("link valid");
        }
    }

    public void Keyboard(){
        Actions actions= new Actions(driver);
        actions.click(Action).perform();
    }
    }

