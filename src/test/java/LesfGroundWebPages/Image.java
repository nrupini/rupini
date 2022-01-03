package LesfGroundWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import javax.swing.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Image {
    WebDriver driver;

    public Image(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[src=\"../images/home.png\"]")
    WebElement home;

    public void clichome(String chome) {
        home.click();
        String exp = "http://www.leafground.com/home.html";
        String act = driver.getCurrentUrl();
        Assert.assertEquals(exp, act, "does not match");
    }

    @FindBy(css = "[src=\"../images/abcd.jpg\"]")
    WebElement imagebroken;

    public void imgbrk(String imbk) throws IOException {
        String s = imagebroken.getAttribute("src");
        URL ul = new URL(s);
        HttpURLConnection huc = (HttpURLConnection) ul.openConnection();
        huc.connect();
        int responsecode = huc.getResponseCode();
        if (responsecode >= 400) {
            System.out.println("image Broken");
        } else {
            System.out.println("image not broken");
        }
    }

    @FindBy(css = "[src=\"../images/keyboard.png\"]")
    WebElement act;

    public void getAct(String gt){
        Actions actions = new Actions(driver);
        actions.perform();
    }
}

