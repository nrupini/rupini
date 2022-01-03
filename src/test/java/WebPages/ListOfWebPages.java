package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
//import utils.proputil;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;

public class ListOfWebPages extends Baseclass {

    @Test
    public void edit() {
        driver.get("http://www.leafground.com/pages/Edit.html");
        EditWebPage edit = new EditWebPage(driver);
        edit.sendmail("sendmail");
        edit.append("append");
        edit.GetString("print");
        edit.Clear("clear");
        edit.GetDisabled("disabled");
    }

    @Test
    public void button() {
        driver.get("http://www.leafground.com/pages/Button.html");
        Button buttonpage = new Button(driver);
        buttonpage.GoToHome();
        String exp = "http://www.leafground.com/home.html";
        String act = driver.getCurrentUrl();
        Assert.assertEquals(exp, act, "does not match");
        driver.get("http://www.leafground.com/pages/Button.html");
        buttonpage.PositionX("Getx");
        buttonpage.Positiony("GetY");
        buttonpage.Color("GetColor");
        buttonpage.Height("GetHeight");
        buttonpage.Width("GetWidth");
    }

    @Test
    public void Hyperlink() throws IOException {
        driver.get("http://www.leafground.com/pages/Link.html");
        HyperLink links = new HyperLink(driver);
        links.Home();
        String exp = "http://www.leafground.com/home.html";
        String act = driver.getCurrentUrl();
        Assert.assertEquals(exp, act, "does not match");
        driver.get("http://www.leafground.com/pages/Link.html");
        links.getHref("href");
        links.Link();
        links.getSamelink();
        exp = "http://www.leafground.com/home.html";
        act = driver.getCurrentUrl();
        Assert.assertEquals(exp, act, "does not match");
    }

    @Test
    public void image() throws IOException {
        driver.get("http://www.leafground.com/pages/Image.html");
        Image imagepage = new Image(driver);
        imagepage.Homebtn();
        String exp = "http://www.leafground.com/home.html";
        String act = driver.getCurrentUrl();
        Assert.assertEquals(exp, act, "does not match");
        driver.get("http://www.leafground.com/pages/Image.html");
        imagepage.ImageBroken();
        imagepage.Keyboard();
        exp = "http://www.leafground.com/home.html";
        act = driver.getCurrentUrl();
        Assert.assertEquals(exp, act, "does not match");
    }

    @Test
    public void dropdown() {
        driver.get("http://www.leafground.com/pages/Dropdown.html");
        DropDown dropdownlist = new DropDown(driver);
        dropdownlist.Index();
        dropdownlist.VisibleText();
        dropdownlist.value();
        dropdownlist.setListOfDropdown();
    }

    @Test
    public void radiobutton() {
        driver.get("http://www.leafground.com/pages/radio.html");
        Radio radio = new Radio(driver);
        radio.enjoy();
        radio.getcheck();
        radio.ages();
    }

    @Test
    public void Checkbox() {
        driver.get("http://www.leafground.com/pages/checkbox.html");
        CheckBox check = new CheckBox(driver);
        check.language();
        check.print();
        check.select();
        check.Selectall();
    }

    @Test
    public void Table() {
        driver.get("http://www.leafground.com/pages/table.html");
        table tablepage = new table(driver);
        tablepage.getTable();
        tablepage.NoOfRows();
        tablepage.NoOfColumn();
        tablepage.Progress();
        tablepage.Leastvalue();
    }

    @Test
    public void alert() {
        driver.get("http://www.leafground.com/pages/Alert.html");
        AlertPage alertPage = new AlertPage(driver);
        alertPage.display();
        driver.switchTo().alert().accept();
        alertPage.confirm();
        driver.switchTo().alert().accept();
        alertPage.prompt();
        driver.switchTo().alert().sendKeys("TestLeaf");
        driver.switchTo().alert().accept();
        alertPage.line();
        driver.switchTo().alert().accept();
        alertPage.sweet();
        driver.findElement(By.cssSelector("[class=\"swal-button swal-button--confirm\"]")).click();
    }

    @Test
    public void frames() {
        driver.get("http://www.leafground.com/pages/frame.html");
        Frames frame1 = new Frames(driver);
        frame1.ClickFrame();
        frame1.ClickFrame2();
        frame1.numberFrame();

    }

    @Test
    public void window() {
        driver.get("http://www.leafground.com/pages/Window.html");
        Window windowpage = new Window(driver);
        windowpage.Click();
        windowpage.Windows();
        windowpage.waitt();
    }

    @Test
    public void calender() {
        driver.get("http://www.leafground.com/pages/Calendar.html");
        Calender calender = new Calender(driver);
        calender.cal();
    }

    @Test
    public void drag() {
        driver.get("http://www.leafground.com/pages/drag.html");
        Draggable drag = new Draggable(driver);
        drag.DragandDrop();
    }

    @Test
    public void drop() {
        driver.get("http://www.leafground.com/pages/drop.html");
        Droppable drop = new Droppable(driver);
        drop.getdrag();
    }

    @Test
    public void select() {
        driver.get("http://www.leafground.com/pages/selectable.html");
        Selectable selectable = new Selectable(driver);
        selectable.GetSelect();
    }

    @Test
    public void sortable() {
        driver.get("http://www.leafground.com/pages/sortable.html");
        sortable sortable = new sortable(driver);
        sortable.Sort1();
    }

    @Test
    public void Autocomplete() {
        driver.get("http://www.leafground.com/pages/autoComplete.html");
        autocomplete auto = new autocomplete(driver);
        auto.Getcourse();
        driver.findElement(By.cssSelector("[class=\"ui-menu-item-wrapper\"]")).click();
    }

    @Test
    public void dwn() {
        driver.get("http://www.leafground.com/pages/download.html");
        download dwn = new download(driver);
        dwn.ListOfFiles();
        final File folder = new File("C:\\Users\\ELCOT\\Downloads");
        int befdwn = FilesInfolder(folder);
        driver.findElement(By.cssSelector("[href=\"../testleaf.xlsx\"]")).click();
        int aftdwn = FilesInfolder(folder);
        Assert.assertEquals(befdwn, aftdwn);

    }

    public int FilesInfolder(final File folder) {
        return folder.listFiles().length;
    }

    @Test
    public void uploadfl() {
        driver.get("http://www.leafground.com/pages/upload.html");
        upload Upload = new upload(driver);
        Upload.uploadfile("C:\\Users\\ELCOT\\Downloads");
    }

    @Test
    public void ToolTip() {
        driver.get("http://www.leafground.com/pages/tooltip.html");
        tooltip tool = new tooltip(driver);
        tool.name();
    }

    @Test
    public void waitapp() {
        driver.get("http://www.leafground.com/pages/disapper.html");
        WaitAppear appear = new WaitAppear(driver);
        appear.getDisappear();
    }

    @Test
    public void appear() {
        driver.get("http://www.leafground.com/pages/appear.html");
        Appear appear = new Appear(driver);
        appear.Getappe();
    }

    @Test
    public void txtchange() {
        driver.get("http://www.leafground.com/pages/TextChange.html");
        TextChange change = new TextChange(driver);
        driver.findElement(By.id("btn")).click();
        driver.switchTo().alert().accept();
        change.change();
    }

    @Test
    public void WaitfrAlert() {
        driver.get("http://www.leafground.com/pages/alertappear.html");
        WaitAlert alert = new WaitAlert(driver);
        alert.Alert();
    }

    @Test
    public void mouse() {
        driver.get("http://www.leafground.com/pages/mouseOver.html");
        MouseHover mouseHover = new MouseHover(driver);
        mouseHover.Hover();
        List<WebElement> mouse = driver.findElements(By.xpath("//a"));
        for (int i = 0; i < mouse.size(); i++) {
            System.out.println(mouse.get(i).getText());
        }
        mouseHover.hover1();
        driver.switchTo().alert().accept();
    }
    @Test
    public void WebTable(){
        driver.get("http://www.leafground.com/pages/sorttable.html");
        WebTable wtable= new WebTable(driver);
        List<String> name = new ArrayList<>();
        name.add("Sam David");
        name.add("Gopi");
        name.add("Naveen");
        name.add("Balaji");
        name.add("Koushik");
        name.add("Narashiman");
        System.out.println(name);
        Collections.sort(name,Collections.reverseOrder());
        System.out.println(name);
        Assert.assertEquals(name,name);
        wtable.sorting();
    }
}



