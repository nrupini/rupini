package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Button {

          WebDriver driver;

        public Button(WebDriver driver){
            this.driver= driver;
            PageFactory.initElements(driver,this);
        }

        @FindBy(id="home")
    WebElement Clihom;

        @FindBy(id="position")
    WebElement Getx;

        @FindBy(id="position")
    WebElement Gety;

        @FindBy(id ="color")
    WebElement GetColor;

        @FindBy(id = "size")
    WebElement GetHeight;

        @FindBy(id="size")
    WebElement GetWidth;

    public void GoToHome(){
        this.Clihom.click();
    }

    public void PositionX(String PositionX){
        System.out.println(Getx.getLocation().getX());
    }

    public void Positiony(String PositionY){
        System.out.println(Gety.getLocation().getY());
    }

    public void Color(String Color){
        System.out.println(GetColor.getAttribute("style"));
    }
    public void Height(String Height){
        System.out.println(GetHeight.getSize().getHeight());
    }
    public void Width(String Width){
        System.out.println(GetHeight.getSize().getWidth());
    }
    }

