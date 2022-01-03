package TestLeafWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class buttonPage {
    WebDriver driver;

    public  buttonPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="home")
    WebElement Click;

    @FindBy(id = "position")
    WebElement xPosition;

    @FindBy(id = "position")
    WebElement yPosition;

    @FindBy(id = "color")
    WebElement bGColor;

    @FindBy(id = "size")
    WebElement height;

    @FindBy(id = "size")
    WebElement width;

    public void CliHome(){
        Click.click();
    }
    public void setxPosition(){
        System.out.println(xPosition.getLocation().getX());
    }
    public void setyPosition(){
        System.out.println(yPosition.getLocation().getY());
    }
    public void getColor(){
        System.out.println(bGColor.getAttribute("style"));
    }
    public void setHeight(){
        System.out.println(height.getSize().getHeight());
    }
    public void setWidth(){
        System.out.println(width.getSize().getWidth());
    }
}
