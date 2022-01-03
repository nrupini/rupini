package pages;

import listeners.TestNGListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.propUtil;

@Listeners(TestNGListener.class)
public class wpages extends baseClass1{

    @Test
    public void editPage() throws Exception {
        String url = propUtil.getProperty("url");
        driver.get( url + "pages/Edit.html");
        page1 editPage = new page1(driver);
        editPage.edit("asgcj@gmail.com");
        throw new Exception();

    }
}
