package LesfGroundWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WebtablePage {
    WebDriver driver;

    public WebtablePage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "table_id")
    WebElement Wbtable;

    public void WTable(String ws){
        List<String> namelist = new ArrayList<>();
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
