package LesfGroundWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class HyperLink {
    WebDriver driver;

    public HyperLink(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()=\"Go to Home Page\"]")
    WebElement homcli;

    @FindBy(xpath = "//a[text()=\"Find where am supposed to go without clicking me?\"]")
    WebElement href;

    @FindBy(xpath = "//a[text()=\"Verify am I broken?\"]")
    WebElement linkbrok;

    @FindBy(xpath = "//a[text()=\"Go to Home Page\"]")
    List <WebElement> samelink;


    public void goToHome(String homcli) {
       this.homcli.click();
        String exp = "http://www.leafground.com/home.html";
        String act = driver.getCurrentUrl();
        Assert.assertEquals(exp, act, "does not match");
    }

    public void gethref(String gethref) {
        href.getAttribute("href");
    }

    public void getBrokenLink(String getBrokenLink) throws IOException {
        String st = linkbrok.getAttribute("href");
        URL u = new URL(st);
        HttpURLConnection huc = (HttpURLConnection) u.openConnection();
        huc.connect();
        int responsecode = huc.getResponseCode();
        if (responsecode >= 400) {
            System.out.println("link broken");
        } else {
            System.out.println("not broken");
        }
    }

    public void cliSamelnk(String cliSamelnk)
    {
        samelink.get(1).click();

        }
}
