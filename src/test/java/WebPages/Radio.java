package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Radio {
    WebDriver driver;

    public Radio(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "yes")
    WebElement ClickYes;

    @FindBy(name = "news")
    List<WebElement> check;

    @FindBy(name = "age")
    List<WebElement> Selectage;

    public void enjoy(){

        this.ClickYes.click();
    }

    public void getcheck(){
        for (int i = 0; i < check.size(); i++) {
            System.out.println(check.get(i).getAttribute("value").trim());
        }
    }

    public void ages(){
        int age = 25;
        ArrayList<String> catagory= new ArrayList<>();
        catagory.add("1- 20 years");
        catagory.add("21- 40 years");
        catagory.add("Above 40 years");
        for (int i = 0; i < catagory.size(); i++) {
            String s = catagory.get(i);
            s = s.replace("years", "");
            s = s.replace("Above", "");
            s = s.trim();
            String[] x = s.split("-");
            for (int j = 0; j < Selectage.size(); j++) {

                if (x.length>1 && age>=Integer.parseInt(x[0].trim()) && age<=Integer.parseInt(x[1].trim())){
                    Selectage.get(i).click();
                }else if (age>Integer.parseInt(x[0].trim())){
                    Selectage.get(i).click();
                }

            }
        }

    }
}
