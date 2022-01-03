package TestLeafWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class radioButtonPage {
    WebDriver driver;

    public radioButtonPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "yes")
    WebElement clickyes;

    @FindBy(name = "news")
    List<WebElement> select;

    @FindBy(name = "age")
    List<WebElement> getAge;

    public void getEnjoyClass() {
        clickyes.click();
    }

    public void defaultselect() {
        for (int i = 0; i < select.size(); i++) {
            if (select.get(i).isSelected())
                System.out.println(select.get(i).getAttribute("value").trim());
        }
    }

    public void setGetAge() {
        int age = 20;
        ArrayList<String> catagory = new ArrayList<>();
        catagory.add("1 - 20 years");
        catagory.add("21 - 40 years");
        catagory.add("Above 40 years");
        for (int i = 0; i < catagory.size(); i++) {
            String st = catagory.get(i);
            st = st.replace("years", "");
            st = st.replace("Above", "");
            st = st.trim();
            String[] x = st.split("-");
            for (int j = 0; j < getAge.size(); j++) {

                if (x.length >= 1 && age >= Integer.parseInt(x[0].trim()) && age <= Integer.parseInt(x[1].trim())) {

                    getAge.get(i).click();

                } else if (age > Integer.parseInt(x[0].trim())) {
                    getAge.get(i).click();
                }
            }
        }
    }
}