package TestLeafWebPages;

import listeners.TestNGListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.propUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class webPages extends base {

    @Test
    public void edit(){
        String url = propUtil.getProperty("url");
        driver.get(url +"pages/Edit.html");
        editPage edit =new editPage(driver);
        edit.setEmail("assjgk@gmail.com");
        edit.setAppendText("cxhsvxs");
        edit.defau();
        edit.getclear();
        edit.getDisabled();
    }

    @Test
    public void button(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/Button.html");
        buttonPage button = new buttonPage(driver);
        button.CliHome();
        String exp ="http://www.leafground.com/home.html";
        String act = driver.getCurrentUrl();
        Assert.assertEquals(exp,act,"does nt match");
        driver.get("http://www.leafground.com/pages/Button.html");
        button.setxPosition();
        button.setyPosition();
        button.getColor();
        button.setHeight();
        button.setHeight();
    }

    @Test
    public void hyperlink() throws IOException {
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/Link.html");
        hyperlinkPage hyperlink = new hyperlinkPage(driver);
        hyperlink.setClickHome();
        String exp ="http://www.leafground.com/home.html";
        String act= driver.getCurrentUrl();
        Assert.assertEquals(exp,act,"does not match");
        driver.get("http://www.leafground.com/pages/Link.html");
        hyperlink.clickref();
        hyperlink.setLinkBroken();
        hyperlink.setSameLink();
        exp ="http://www.leafground.com/home.html";
        act= driver.getCurrentUrl();
        Assert.assertEquals(exp,act,"does not match");
    }
    @Test
    public void image() throws IOException {
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/Image.html");
        imagePage image = new imagePage(driver);
        image.setClickHome();
        String exp ="http://www.leafground.com/home.html";
        String act = driver.getCurrentUrl();
        Assert.assertEquals(exp,act,"does not match");
        driver.get("http://www.leafground.com/pages/Image.html");
        image.brkImg();
        image.actKey();
        exp ="http://www.leafground.com/home.html";
         act = driver.getCurrentUrl();
        Assert.assertEquals(exp,act,"does not match");
    }

    @Test
    public void Linkspage() throws IOException {
        String url = propUtil.getProperty("url");
        driver.get(url +"pages/Link.html");
        ListOfHyperLinks list = new ListOfHyperLinks(driver);
        list.setListOfLink();
    }
    @Test
    public void dropDown(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/Dropdown.html");
        dropDwn dropDownList = new dropDwn(driver);
        dropDownList.getIndex();
        dropDownList.getvisible();
        dropDownList.getvalue();
        dropDownList.List();
    }
    @Test
    public void radio(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/radio.html");
        radioButtonPage radio = new radioButtonPage(driver);
        radio.getEnjoyClass();
        radio.defaultselect();
        radio.setGetAge();
    }
    @Test
    public void check(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/checkbox.html");
        checkBoxPage checkBox = new checkBoxPage(driver);
        checkBox.checkBox();
        checkBox.checkBox1();
        checkBox.checkbox2();
        checkBox.checkbox3();
    }
    @Test
    public void tables(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/table.html");
        Table tablePage = new Table(driver);
        tablePage.tab();
        tablePage.noOfCol();
        tablePage.noOfRow();
        tablePage.progressList();
        tablePage.getLeast();
    }
    @Test
    public void alertp(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/Alert.html");
        alert alertPage = new alert(driver);
        alertPage.getAlert1();
        driver.switchTo().alert().accept();
        alertPage.getAlert2();
        driver.switchTo().alert().accept();
        alertPage.getAlert3();
        driver.switchTo().alert().sendKeys("TestLeaf");
        driver.switchTo().alert().accept();
        alertPage.getAlert4();
        driver.switchTo().alert().accept();
        alertPage.getSweet();
        driver.findElement(By.cssSelector("[class=\"swal-button swal-button--confirm\"]")).click();
    }
    @Test
    public void frame(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/frame.html");
        framePage frames = new framePage(driver);
        frames.getFrame1();
        frames.getFrame2();
        frames.getNoOfFrames();
    }
    @Test
    public void windows(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/Window.html");
        window windowPage = new window(driver);
        windowPage.getHome();
        windowPage.getNoOfWindow();
        windowPage.getWind();
    }
    @Test
    public void calenders(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/Calendar.html");
        calender calenderPage = new calender(driver);
        calenderPage.getCal();
    }
    @Test
    public void drop(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/drag.html");
        droppable droppablePage= new droppable(driver);
        droppablePage.dragga();
    }
    @Test
    public void drag(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/drop.html");
        dragg dragPage = new dragg(driver);
        dragPage.getDrag();
    }
    @Test
    public void select(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/selectable.html");
        sortablePage sort = new sortablePage(driver);
        sort.getSort();
    }
    @Test
    public void select1(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/sortable.html");
        sortable1 sortable1 = new sortable1(driver);
        sortable1.selectable();
    }
    @Test
    public void auto(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/autoComplete.html");
        autoComplete autoCompletePage = new autoComplete(driver);
        autoCompletePage.auto1();
        driver.findElement(By.cssSelector("[class=\"ui-menu-item-wrapper\"]")).click();
    }
    @Test
    public void download(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/download.html");
        download downloadPage = new download(driver);
        downloadPage.getDwnLoad();
        File folder = new File(System.getProperty("user.dir"));
        int befdwn = listOfFiles(folder);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        int aftdwn = listOfFiles(folder);
        Assert.assertEquals(befdwn , aftdwn);
    }
    public int listOfFiles(final File folder) {
        return folder.listFiles().length;
    }

    @Test
    public void upload(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/upload.html");
        upload uploadPage=new upload(driver);
        uploadPage.fileNew();
    }

    @Test
    public void ToolTip(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/tooltip.html");
        toolTip tool = new toolTip(driver);
        tool.getTip();
    }
    @Test
    public void Disappear(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/disapper.html");
        disappear disappearPage= new disappear(driver);
        disappearPage.getDisappear();
    }
    @Test
    public void appear(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/appear.html");
        appear appearPage = new appear(driver);
        appearPage.app();
    }
    @Test
    public void TextChange(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/TextChange.html");
        txtChange txtChangePage = new txtChange(driver);
        txtChangePage.change();
    }
    @Test
    public void alertAppear(){
        String url = propUtil.getProperty("url");
        driver.get(url + "pages/alertappear.html");
        alaerappear alaerappearPage = new alaerappear(driver);
        alaerappearPage.getApp();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
    @Test
    public void mouse(){
        String url = propUtil.getProperty("url");
        driver.get(url +"pages/mouseOver.html");
        mouseHover mouseHover = new mouseHover(driver);
        mouseHover.mouse();
        List<WebElement> list = driver.findElements(By.xpath("//a"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
        }
        mouseHover.path();
        driver.switchTo().alert().accept();
    }
    @Test
    public void webTable(){
        String url = propUtil.getProperty("url");
        driver.get(url +"pages/sorttable.html");
        WebTable web = new WebTable(driver);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Sam David");
        arrayList.add("Gopi");
        arrayList.add("Naveen");
        arrayList.add("Balaji");
        arrayList.add("Koushik");
        arrayList.add("Narashiman");
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println(arrayList);
        Assert.assertEquals(arrayList,arrayList);
        web.getTab();
    }
    }
