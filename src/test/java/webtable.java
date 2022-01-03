import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class webtable {
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
    public void table2() {
        driver.get("http://www.leafground.com/pages/sorttable.html");
        WebElement table = driver.findElement(By.id("table_id"));
        List<WebElement> rows = driver.findElements(By.tagName("tr"));
        List<WebElement> colsheader = table.findElements(By.tagName("th"));
        System.out.println("Rows:" + rows.size());
        System.out.println("colsheader:" + colsheader.size());
        for (int i = 1; i < rows.size(); i++) {
            WebElement Row = rows.get(i);
            List<WebElement> cols = Row.findElements(By.tagName("td"));
            for (int j = 0; j < cols.size(); j++) {
                System.out.println(cols.get(j).getText() + " ");
            }
            System.out.println();
        }
        List<WebElement> name1 = driver.findElements(By.cssSelector("td:nth-child(2)"));
        for (int i = 0; i < name1.size(); i++) {
            System.out.println(name1.get(i).getText());
        }
        List<String> name = new ArrayList<>();
        name.add("Sam David");
        name.add("Gopi");
        name.add("Naveen");
        name.add("Balaji");
        name.add("Koushik");
        name.add("Narashiman");
        System.out.println(name);
        Collections.sort(name, Collections.reverseOrder());
    }

    @Test
    public void WebTable() {
        driver.get("http://www.leafground.com/pages/sorttable.html");
     //   WebElement webtable = driver.findElement(By.id("table_id"));
     //   List<WebElement> Row = driver.findElements(By.tagName("tr"));
      //  List<WebElement> ColsHeader = driver.findElements(By.tagName("th"));
       // System.out.println("no of row:" + Row.size());
      //  System.out.println("No of ColsHeader:" + ColsHeader.size());
//
      //  for (int i = 0; i < Row.size(); i++) {
     //       System.out.println(Row.get(i).getText());
     //       List<WebElement> cols = driver.findElements(By.tagName("//td"));
     //           for (int j = 0; j < cols.size(); j++) {
     //               System.out.println(cols.get(i).getText() + "");
  //              }
     //   }

        List<String> namelist= new ArrayList<>();

        namelist.add("Sam David");
        namelist.add("Gopi");
        namelist.add("Naveen");
        namelist.add("Balaji");
        namelist.add("Koushik");
        namelist.add("Narashiman");
        System.out.println(namelist);
        Collections.sort(namelist,Collections.reverseOrder());
        System.out.println(namelist);
        Assert.assertEquals(namelist,namelist);
        }
    }


