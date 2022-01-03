import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.net.UrlChecker;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class leafgroundpages {

    WebDriver driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterTest
    public void close(){
        driver.close();
    }

    @Test
    public void edit(){
        driver.get("http://www.leafground.com/pages/Edit.html");
        driver.findElement(By.id("email")).sendKeys("assvjh@gmail.com");
        driver.findElement(By.cssSelector("input[value=\"Append \"]")).sendKeys("jhsgj");
        String x= driver.findElement(By.cssSelector("input[value=\"TestLeaf\"]")).getAttribute("value");
        System.out.println(x);
        driver.findElement(By.cssSelector("input[value=\"Clear me!!\"]")).clear();
        String a = driver.findElement(By.cssSelector("input[style=\"width:350px;background-color:LightGrey;\"]")).getAttribute("disabled");
        System.out.println(a);
    }

    @Test
    public void button(){
        driver.get("http://www.leafground.com/pages/Button.html");
        driver.findElement(By.id("home")).click();
        String exp= "http://www.leafground.com/home.html";
        String act = driver.getCurrentUrl();
        Assert.assertEquals(exp, act,"does not match");
        driver.get("http://www.leafground.com/pages/Button.html");
        int x = driver.findElement(By.id("position")).getLocation().getX();
        int y = driver.findElement(By.id("position")).getLocation().getY();
        System.out.println(x);
        System.out.println(y);
       String col= driver.findElement(By.id("color")).getAttribute("style");
        System.out.println(col);
        int height= driver.findElement(By.id("size")).getSize().getHeight();
        int width = driver.findElement(By.id("size")).getSize().getWidth();
        System.out.println(height);
        System.out.println(width);
    }
    @Test
    public void Hyperlink() throws IOException {
        driver.get("http://www.leafground.com/pages/Link.html");
        driver.findElement(By.xpath("//a[text()=\"Go to Home Page\"]")).click();
        String exp= "http://www.leafground.com/home.html";
        String act = driver.getCurrentUrl();
        Assert.assertEquals(exp,act,"does not match");
        driver.get("http://www.leafground.com/pages/Link.html");
       String href= driver.findElement(By.xpath("//a[text()=\"Find where am supposed to go without clicking me?\"]")).getAttribute("href");
        System.out.println(href);
       WebElement li= driver.findElement(By.xpath("//a[text()=\"Verify am I broken?\"]"));
       String ele = li.getAttribute("href");
        URL u = new URL(ele);
        HttpURLConnection huc= (HttpURLConnection) u.openConnection();
        huc.connect();
        int responsecode= huc.getResponseCode();
        if (responsecode>=400){
            System.out.println("link broken");
        }else{
            System.out.println("valid link");
        }
        List<WebElement> Samelink = driver.findElements(By.xpath("//a[text()=\"Go to Home Page\"]"));
        Samelink.get(1).click();
    }
    @Test
    public void image() throws IOException {
        driver.get("http://www.leafground.com/pages/Image.html");
        driver.findElement(By.cssSelector("[src=\"../images/home.png\"]")).click();
        String exp= "http://www.leafground.com/home.html";
        String act = driver.getCurrentUrl();
        Assert.assertEquals(exp,act,"does not match");
        driver.get("http://www.leafground.com/pages/Image.html");
        WebElement img= driver.findElement(By.cssSelector("[src=\"../images/abcd.jpg\"]"));
        String st = img.getAttribute("src");
        URL u = new URL(st);
        HttpURLConnection huc= (HttpURLConnection) u.openConnection();
        huc.connect();
        int responsecode= huc.getResponseCode();
        if (responsecode>=400){
            System.out.println("Image broken");
        }else   {
            System.out.println("Image Not Broken");
        }
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(By.cssSelector("[src=\"../images/keyboard.png\"]"))).perform();
        exp ="http://www.leafground.com/home.html";
        act = driver.getCurrentUrl();
        Assert.assertEquals(exp,act,"does not match");
    }
}
