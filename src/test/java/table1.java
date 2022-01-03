import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class table1 {
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
    public void table() {
        driver.get("http://www.leafground.com/pages/table.html");
        List<WebElement> name = driver.findElements(By.cssSelector("td:nth-child(5)"));
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i).getText());
        }

    }

    @Test
    public void sorttable() {
        driver.get("http://www.leafground.com/pages/sorttable.html");
        //WebElement table= driver.findElement(By.id("table_id"));
        //List<WebElement> name= driver.findElements(By.cssSelector("td:nth-child(2)"));
        //for (int i = 0; i < name.size(); i++) {
        //}
        List<String> list = new ArrayList<>();
        list.add("Sam David");
        list.add("Gopi");
        list.add("Naveen");
        list.add("Balaji");
        list.add("Koushik");
        list.add("Narashiman");
        System.out.println(list);
        List<String> list1 = new ArrayList<>();
        list1.add("Sam David");
        list1.add("Gopi");
        list1.add("Naveen");
        list1.add("Balaji");
        list1.add("Koushik");
        list1.add("Narashiman");
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);
        // Assert.assertEquals(list,list1);
        //  System.out.println(Collections.sort(list1,Collections.reverseOrder());
    }

    // List<WebElement> name= driver.findElements(By.id("table_id"));
    // WebElement row = driver.findElement(By.cssSelector("td:nth-child(2)"));
//
    @Test
    public void table1() {
        driver.get("http://www.leafground.com/pages/sorttable.html");
        WebElement table = driver.findElement(By.id("table_id"));
        List<WebElement> rows = driver.findElements(By.tagName("tr"));
        List<WebElement> colsheader = table.findElements(By.tagName("th"));
        // System.out.println("Rows:"+rows.size());
        //   System.out.println("colsheader:"+colsheader.size());
        ArrayList<String> name = new ArrayList<>();
       // List<WebElement> elementList = driver.findElements(By.)
        name.add("Sam David");
        name.add("Gopi");
        name.add("Naveen");
        name.add("Balaji");
        name.add("Koushik");
        name.add("Narashiman");
        Collections.sort(name);
        System.out.println(name);
        Collections.sort(name, Collections.reverseOrder());
        System.out.println();
        WebElement table1 = driver.findElement(By.className("sorting_desc"));

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
              System.out.println(cols.get(j).getText()+" ");
            }
            System.out.println();
        }
       List<WebElement> name1 = driver.findElements(By.cssSelector("td:nth-child(2)"));
        for (int i = 0; i < name1.size(); i++) {
            System.out.println(name1.get(i).getText());
        }
        List<String> name= new ArrayList<>();
          name.add("Sam David");
         name.add("Gopi");
          name.add("Naveen");
           name.add("Balaji");
          name.add("Koushik");
          name.add("Narashiman");
        System.out.println(name);
      //  Collections.sort(name,Collections.reverseOrder());

    }
}

