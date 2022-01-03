package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class HyperLink {

    WebDriver driver;

    public HyperLink(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()=\"Go to Home Page\"]")
    WebElement ClickHome;

    @FindBy(xpath = "//a[text()=\"Find where am supposed to go without clicking me?\"]")
    WebElement Clickhref;

    @FindBy(xpath = "//a[text()=\"Verify am I broken?\"]")
    WebElement Linkbroken;

    @FindBy(xpath = "//a[text()=\"Go to Home Page\"]")
    List<WebElement> Samelink;

    public void Home(){
        this.ClickHome.click();
    }
    public void getHref(String getHref){
        System.out.println(Clickhref.getAttribute("href"));
    }
    public void Link() throws IOException {
        String lk = Linkbroken.getAttribute("href");
        URL u = new URL(lk);
        HttpURLConnection huc = (HttpURLConnection) u.openConnection();
        huc.connect();
        int responsecode = huc.getResponseCode();
        if (responsecode>=400){
            System.out.println("link broken");
        }else{
            System.out.println("link valid");
        }

    }

    public void getSamelink(){
        Samelink.get(1).click();
    }

}
