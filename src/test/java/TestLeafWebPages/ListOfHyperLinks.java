package TestLeafWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class ListOfHyperLinks {
    WebDriver driver;
    public ListOfHyperLinks(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a")
    List<WebElement> listOfLink;

    public void setListOfLink() throws IOException {
        for (int i = 0; i < listOfLink.size(); i++) {
            WebElement ele =listOfLink.get(i);
            String st = ele.getAttribute("href");
            URL u = new URL(st);
            HttpURLConnection huc = (HttpURLConnection) u.openConnection();
            huc.setRequestMethod("GET");
            huc.connect();
            int responsecode = huc.getResponseCode();
            if (responsecode>=400){
                System.out.println("link broken");
            }else{
                System.out.println("link not broken");
            }
        }

    }
}
