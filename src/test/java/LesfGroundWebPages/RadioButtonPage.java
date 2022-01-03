package LesfGroundWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class RadioButtonPage {
    WebDriver driver;

    public RadioButtonPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="yes")
    WebElement classlike;

    public void getLikeClass(String gsc){
        classlike.click();
    }

    @FindBy(name = "news")
    List<WebElement> default1;

    public void SelDef(String sd){
        for (int i = 0; i < default1.size(); i++) {
            System.out.println(default1.get(i).getAttribute("value").trim());
        }
    }

    @FindBy(name = "age")
    List<WebElement> rdList;

    public void radioList(String rdl){

        int age= 25;
        ArrayList<String> catagory = new ArrayList<>();

        catagory.add("1- 20 years");
        catagory.add("21- 40 years");
        catagory.add("Above 40 years");

        for (int i = 0; i < catagory.size() ; i++) {

            String s = catagory.get(i);
            s=s.replace("years","");
            s=s.replace("Above","");
            s=s.trim();
            String[] x =s.split("-");

            for (int j = 0; j < rdList.size(); j++) {

                if (age>=x.length && age>=Integer.parseInt(x[0].trim()) && age<=Integer.parseInt(x[1].trim())){
                    rdList.get(i).click();
                }else if (age>Integer.parseInt(x[0])){
                    rdList.get(i).click();
                }
            }

        }

    }
}
