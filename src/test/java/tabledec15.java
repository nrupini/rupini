import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class tabledec15 {
    WebDriver driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterTest
   public void close(){
        driver.close();
    }
    @Test
    public void table(){
        driver.get("http://www.leafground.com/pages/table.html");
       WebElement table = driver.findElement(By.id("table_id"));
       List<WebElement> rows = driver.findElements(By.tagName("tr"));
       List<WebElement> columnheader = table.findElements(By.tagName("th"));
        System.out.println("rows:"+rows.size());
        System.out.println("colums:"+columnheader.size());
        List<WebElement> columnsOf2ndRow= rows.get(2).findElements(By.tagName("td"));//--->td column
        System.out.println("progress value:"+columnsOf2ndRow.get(1).getText());

        List<WebElement> progresslist= driver.findElements(By.cssSelector("td:nth-child(2)"));

        int Min= Integer.MAX_VALUE;
        int minRow=0;
        for (int i = 0; i < progresslist.size(); i++) {
            String a= progresslist.get(i).getText();
            a= a.replace("%","");

            if (Min> Integer.parseInt(a)){
                Min =Integer.parseInt(a);
                minRow=i;
            }
        }
        rows.get(minRow+1).findElement(By.cssSelector("td:nth-child(3) input")).click();
        for (int i = 1; i < rows.size(); i++) {
            WebElement Row=rows.get(i);
            List<WebElement> cols=Row.findElements(By.tagName("td"));
            for (int j = 0; j < columnheader.size(); j++) {
                System.out.println(cols.get(j).getText() +"  ");
            }
            System.out.println();
        }
        List<WebElement> name = driver.findElements(By.cssSelector("td:nth-child(5)"));
        for (int i = 0; i < name.size() ; i++) {
            System.out.println(name.get(i).getText());
        }

    }


}
