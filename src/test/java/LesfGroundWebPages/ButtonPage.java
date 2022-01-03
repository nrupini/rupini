package LesfGroundWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ButtonPage {
    WebDriver driver;

    public ButtonPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="home")
    WebElement clihome;

    @FindBy(id="position")
    WebElement x;

    @FindBy(id="position")
    WebElement y;

    @FindBy(id="color")
    WebElement col;

    @FindBy(id = "size")
    WebElement height;

    @FindBy(id = "size")
    WebElement width;

    public void home(String clihome){
        this.clihome.click();
        String exp= "http://www.leafground.com/home.html";
        String act= driver.getCurrentUrl();
        Assert.assertEquals(exp,act,"does not match");
    }


    public void posx(String posx){
        System.out.println(x.getLocation().getX());
    }



    public void posy(String posy){
        System.out.println(y.getLocation().getY());
    }

    public void getcolor(String getcolor){
        System.out.println(col.getAttribute("style"));
    }


    public void getheight(String getheight){
        System.out.println(height.getSize().getHeight());
    }



    public void getwidth(String getwidth)
    {
        System.out.println(width.getSize().getWidth());

    }
}
