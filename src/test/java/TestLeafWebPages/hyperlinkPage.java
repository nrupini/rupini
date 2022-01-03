package TestLeafWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class hyperlinkPage {
    WebDriver driver;

    public hyperlinkPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[text()=\"Go to Home Page\"]")
    WebElement ClickHome;

    @FindBy(xpath = "//*[text()=\"Find where am supposed to go without clicking me?\"]")
    WebElement ClichHref;

    @FindBy(xpath = "//*[text()=\"Verify am I broken?\"]")
    WebElement linkBroken;

    @FindBy(xpath = "//*[text()=\"Go to Home Page\"]")
    List<WebElement> sameLink;

    public void setClickHome(){
        ClickHome.click();
    }
    public void clickref(){
        System.out.println(ClichHref.getAttribute("href"));
    }
    public void setLinkBroken() throws IOException {
      String ele = linkBroken.getAttribute("href");
      URL u = new URL(ele);
        HttpURLConnection huc = (HttpURLConnection) u.openConnection();
        huc.connect();
        int responsecode = huc.getResponseCode();
        if (responsecode>=400){
            System.out.println("Link Broken");
        }else{
            System.out.println("Link Not Broken");
        }
    }

    public void setSameLink(){
        sameLink.get(1).click();
    }
}
