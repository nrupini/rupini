import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class dec15 {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void close() {
        driver.close();
    }

    @Test
    public void edit() {
        driver.get("http://www.leafground.com/pages/Edit.html");
        driver.findElement(By.id("email")).sendKeys("asjhgk@gmail.com");
        driver.findElement(By.cssSelector("input[value=\"Append \"]")).sendKeys("shdfsj");
        String s = driver.findElement(By.cssSelector("input[value=\"TestLeaf\"]")).getAttribute("value");
        System.out.println(s);
        driver.findElement(By.cssSelector("input[value=\"Clear me!!\"]")).clear();
        String dis = driver.findElement(By.cssSelector("input[style=\"width:350px;background-color:LightGrey;\"]")).getAttribute("disabled");
        System.out.println(dis);
    }

    @Test
    public void button() {
        driver.get("http://www.leafground.com/pages/Button.html");
        driver.findElement(By.id("home")).click();
        String exp = "http://www.leafground.com/home.html";
        String act = driver.getCurrentUrl();
        Assert.assertEquals(exp, act, "does not match");
        driver.get("http://www.leafground.com/pages/Button.html");
        int x = driver.findElement(By.id("position")).getLocation().getX();
        int y = driver.findElement(By.id("position")).getLocation().getY();
        System.out.println("position of:" + x);
        System.out.println("position of:" + y);
        String color = driver.findElement(By.id("color")).getAttribute("style");
        System.out.println(color);
        int height = driver.findElement(By.id("size")).getSize().getHeight();
        int width = driver.findElement(By.id("size")).getSize().getWidth();
        System.out.println("size of:" + height);
        System.out.println("size of:" + width);
    }

    @Test
    public void hyperlink() throws IOException {
        driver.get("http://www.leafground.com/pages/Link.html");
        driver.findElement(By.xpath("//*[text()=\"Go to Home Page\"]")).click();
        String exp = "http://www.leafground.com/home.html";
        String act = driver.getCurrentUrl();
        Assert.assertEquals(exp, act, "does not match");
        driver.get("http://www.leafground.com/pages/Link.html");
        String href = driver.findElement(By.xpath("//*[text()=\"Find where am supposed to go without clicking me?\"]")).getAttribute("href");
        System.out.println(href);
        WebElement ele = driver.findElement(By.xpath("//*[text()=\"Verify am I broken?\"]"));
        String st = ele.getAttribute("href");
        URL u = new URL(st);
        HttpURLConnection huc = (HttpURLConnection) u.openConnection();
        huc.connect();
        int responsecode = huc.getResponseCode();
        if (responsecode >= 400) {
            System.out.println("link broken");
        } else {
            System.out.println("valid link");
        }
        List<WebElement> Samelink = driver.findElements(By.xpath("//*[text()=\"Go to Home Page\"]"));
        Samelink.get(1).click();
    }

    @Test
    public void brokenlinks() throws IOException {
        driver.get("http://www.leafground.com/pages/Link.html");
        List<WebElement> NoBrokenLink = driver.findElements(By.xpath("//a"));
        for (int i = 0; i < NoBrokenLink.size(); i++) {
            WebElement ele = NoBrokenLink.get(i);
            String s = ele.getAttribute("href");
            URL u = new URL(s);
            HttpURLConnection huc = (HttpURLConnection) u.openConnection();
            huc.setRequestMethod("GET");
            huc.connect();
            int responsecode = huc.getResponseCode();
            if (responsecode >= 400) {
                System.out.println("link broken");
            } else {
                System.out.println("valid link");
            }

        }
    }

    @Test
    public void image() throws IOException {
        driver.get("http://www.leafground.com/pages/Image.html");
        driver.findElement(By.cssSelector("[src=\"../images/home.png\"]")).click();
        String exp = "http://www.leafground.com/home.html";
        String act = driver.getCurrentUrl();
        Assert.assertEquals(exp, act, "does not match");
        driver.get("http://www.leafground.com/pages/Image.html");
        WebElement ele = driver.findElement(By.cssSelector("[src=\"../images/abcd.jpg\"]"));
        String a = ele.getAttribute("src");
        URL u = new URL(a);
        HttpURLConnection huc = (HttpURLConnection) u.openConnection();
        huc.connect();
        int responsecode = huc.getResponseCode();
        if (responsecode >= 400) {
            System.out.println("image broken");
        } else {
            System.out.println("valid image");
        }
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(By.cssSelector("[src=\"../images/keyboard.png\"]"))).perform();
        exp = "http://www.leafground.com/home.html";
        act = driver.getCurrentUrl();
        Assert.assertEquals(exp, act, "does not match");
    }

    @Test
    public void dropdown() {
        driver.get("http://www.leafground.com/pages/Dropdown.html");
        Select select = new Select(driver.findElement(By.id("dropdown1")));
        select.selectByIndex(2);
        select = new Select(driver.findElement(By.name("dropdown2")));
        select.selectByVisibleText("Loadrunner");
        select = new Select(driver.findElement(By.id("dropdown3")));
        select.selectByValue("1");
        List<WebElement> ListOfDropDown = driver.findElements(By.className("dropdown"));
        for (int i = 0; i < ListOfDropDown.size(); i++) {
            System.out.println(ListOfDropDown.get(i).getText());
        }
    }

    @Test
    public void radiobutton() {
        driver.get("http://www.leafground.com/pages/radio.html");
        driver.findElement(By.id("yes")).click();
        List<WebElement> radiobtn = driver.findElements(By.name("news"));
        for (int i = 0; i < radiobtn.size(); i++) {
            if (radiobtn.get(i).isSelected()) {
                System.out.println(radiobtn.get(i).getAttribute("value"));
            }
        }
        int age = 20;
        radiobtn = driver.findElements(By.name("age"));
        ArrayList<String> catagory = new ArrayList<>();
        catagory.add("1- 20 years");
        catagory.add("21- 40 years");
        catagory.add("Above 40 years");
        for (int i = 0; i < catagory.size(); i++) {

            String s = catagory.get(i);
            s = s.replace("years", "");
            s = s.replace("Above", "");
            s = s.trim();
            String[] st = s.split("-");
            if (st.length > 1 && age >= Integer.parseInt(st[0].trim()) && age <= Integer.parseInt(st[1].trim())) {
                radiobtn.get(i).click();
            } else if (age > Integer.parseInt(st[0].trim())) {
                radiobtn.get(i).click();
            }

        }
    }

    @Test
    public void check() {
        driver.get("http://www.leafground.com/pages/checkbox.html");
        List<WebElement> checkbox = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
        checkbox.get(2).click();
        checkbox.get(3).click();
        checkbox = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
        Boolean x = checkbox.get(5).isSelected();
        System.out.println(x);
        checkbox = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
        checkbox.get(7).click();
        checkbox = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
        checkbox.get(8).click();
        checkbox.get(9).click();
        checkbox.get(10).click();
        checkbox.get(11).click();
        checkbox.get(12).click();
    }

    @Test
    public void alert() {
        driver.get("http://www.leafground.com/pages/Alert.html");
        driver.findElement(By.xpath("//*[text()=\"Alert Box\"]")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//*[text()=\"Confirm Box\"]")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//*[text()=\"Prompt Box\"]")).click();
        driver.switchTo().alert().sendKeys("TestLeaf");
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//*[text()=\"Line Breaks?\"]")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.id("btn")).click();
        driver.findElement(By.cssSelector("[class=\"swal-button swal-button--confirm\"]")).click();
    }

    @Test
    public void frame() {
        driver.get("http://www.leafground.com/pages/frame.html");
        List<WebElement> frames1 = driver.findElements(By.xpath("//iframe"));
        driver.switchTo().frame(frames1.get(0));
        driver.findElement(By.id("Click")).click();
        driver.switchTo().parentFrame();
        driver.switchTo().frame(frames1.get(1));
        frames1 = driver.findElements(By.xpath("//iframe"));
        driver.switchTo().frame(frames1.get(0));
        driver.findElement(By.id("Click1")).click();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        frames1 = driver.findElements(By.xpath("//iframe"));
        System.out.println("no of frames:" + frames1.size());
    }

    @Test
    public void window() throws InterruptedException {
        driver.get("http://www.leafground.com/pages/Window.html");
        driver.findElement(By.id("home")).click();
        Set<String> wind = driver.getWindowHandles();
        ArrayList<String> winhandle = new ArrayList(wind);
        driver.switchTo().window(winhandle.get(1));
        driver.findElement(By.cssSelector("[alt=\"Edit / Text Fields\"]")).click();
        driver.switchTo().window(winhandle.get(0));
        wind = driver.getWindowHandles();
        int x = wind.size();
        System.out.println(x);
        driver.findElement(By.id("color")).click();
        Thread.sleep(5000);
        wind = driver.getWindowHandles();
        Assert.assertEquals(wind.size(), 4);
    }

    @Test
    public void calender() {
        driver.get("http://www.leafground.com/pages/Calendar.html");
        driver.findElement(By.id("datepicker")).click();
        driver.findElement(By.xpath(String.format("//*[text()='%s']", 15))).click();
    }

    @Test
    public void drag() {
        driver.get("http://www.leafground.com/pages/drag.html");
        WebElement drag = driver.findElement(By.id("draggable"));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(drag, 200, 300).perform();
        System.out.println();
    }

    @Test
    public void drop() {
        driver.get("http://www.leafground.com/pages/drop.html");
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag, drop).perform();
        System.out.println();
    }

    @Test
    public void select() {
        driver.get("http://www.leafground.com/pages/selectable.html");
        List<WebElement> select1 = driver.findElements(By.cssSelector("[id=\"selectable\"] li"));
        Actions actions = new Actions(driver);
        actions.click(select1.get(2)).keyDown(Keys.CONTROL).click(select1.get(4)).keyDown(Keys.CONTROL).perform();
        System.out.println();
    }

    @Test
    public void sort() {
        driver.get("http://www.leafground.com/pages/sortable.html");
        List<WebElement> sortable = driver.findElements(By.cssSelector("[id=\"sortable\"] li"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(sortable.get(4), sortable.get(2)).perform();
        System.out.println();
    }

    @Test
    public void autocomplete() throws InterruptedException {
        driver.get("http://www.leafground.com/pages/autoComplete.html");
        driver.findElement(By.id("tags")).sendKeys("App");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("[class=\"ui-menu-item-wrapper\"]")).click();//after select from list in autocomplete page then go to inspect to get cssselector
        System.out.println();
    }

    @Test
    public void download() throws InterruptedException {
        driver.get("http://www.leafground.com/pages/download.html");
        final File folder= new File("C:\\Users\\ELCOT\\Downloads");
        int befdwn = FilesInFolder(folder);
        driver.findElement(By.cssSelector("[href=\"../testleaf.xlsx\"]")).click();
        Thread.sleep(5000);
        int aftdwn= FilesInFolder(folder);
        Assert.assertEquals(befdwn+1,aftdwn,"does not match");
    }

    public int FilesInFolder(final File folder) {

        return folder.listFiles().length;

    }
    @Test
    public void upload() throws InterruptedException {
        driver.get("http://www.leafground.com/pages/upload.html");
        Thread.sleep(5000);
        driver.findElement(By.name("filename")).sendKeys("C:\\Users\\ELCOT");
    }
    @Test
    public void tooltip(){
        driver.get("http://www.leafground.com/pages/tooltip.html");
        WebElement ele= driver.findElement(By.id("age"));
        Actions actions=  new Actions(driver);
        actions.moveToElement(ele).perform();
        System.out.println(driver.findElement(By.cssSelector("[class=\"ui-tooltip-content\"]")).getText());
    }
    @Test
    public void disappear(){
        driver.get("http://www.leafground.com/pages/disapper.html");
        WebElement ele = driver.findElement(By.id("btn"));
        WebDriverWait wait = new WebDriverWait(driver,5000);
        wait.until(ExpectedConditions.invisibilityOf(ele));
        System.out.println(driver.findElement(By.id("show")).getText());
    }
    @Test
    public void appear(){
        driver.get("http://www.leafground.com/pages/appear.html");
        WebDriverWait wait = new WebDriverWait(driver,5000);
        WebElement ele = driver.findElement(By.id("btn"));
        wait.until(ExpectedConditions.visibilityOf(ele));
        System.out.println(driver.findElement(By.id("btn")).getText());
    }
    @Test
    public void textchange(){
        driver.get("http://www.leafground.com/pages/TextChange.html");
        WebDriverWait wait = new WebDriverWait(driver,5000);
        WebElement element = driver.findElement(By.id("btn"));
        wait.until(ExpectedConditions.visibilityOf(element));
        driver.findElement(By.id("btn")).click();
        driver.switchTo().alert().accept();
        System.out.println("Click Me");
    }
    @Test
    public void waitalert(){
        driver.get("http://www.leafground.com/pages/alertappear.html");
        WebDriverWait wait= new WebDriverWait(driver,5000);
        driver.findElement(By.id("alert")).click();
    }
    @Test
    public void mouse1(){
        driver.get("http://www.leafground.com/pages/mouseOver.html");
        WebElement ele= driver.findElement(By.className("btnMouse"));
        WebDriverWait wait = new WebDriverWait(driver,5000);
        Actions actions = new Actions(driver);
        actions.moveToElement(ele).perform();
        List<WebElement> list1 = driver.findElements(By.xpath("//a"));
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).getText());
        }
        list1 = driver.findElements(By.xpath("//a"));
        list1.get(2).click();
        driver.switchTo().alert().accept();
    }
}

