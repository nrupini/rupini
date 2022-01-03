package LesfGroundWebPages;

import org.testng.annotations.Test;

import java.io.IOException;

public class WebPages extends Baseclass{

@Test
    public void edit(){
        driver.get("http://www.leafground.com/pages/Edit.html");
        EditPage EditPage = new EditPage(driver);
        EditPage.sendEmail("asdf@gmail.com");
        EditPage.appe("app");
        EditPage.Getval("value");
        EditPage.clear("clear");
        EditPage.getdisabled("disabled");
    }
    @Test
    public void button(){
    driver.get("http://www.leafground.com/pages/Button.html");
    ButtonPage Buttonpage= new ButtonPage(driver);
    Buttonpage.home("clihome");
    driver.get("http://www.leafground.com/pages/Button.html");
    Buttonpage.posx("x");
    Buttonpage.posy("y");
    Buttonpage.getcolor("col");
    Buttonpage.getheight("height");
    Buttonpage.getwidth("width");
    }

    @Test
    public void hyperlink(){
    driver.get("http://www.leafground.com/pages/Link.html");
    HyperLink hyperLink= new HyperLink(driver);
    hyperLink.goToHome("homcli");
    driver.get("http://www.leafground.com/pages/Link.html");
    hyperLink.gethref("href");
    hyperLink.cliSamelnk("samelink");
    }

    @Test
    public void image() throws IOException {
    driver.get("http://www.leafground.com/pages/Image.html");
    Image imagepage= new Image(driver);
    imagepage.clichome("home");
    driver.get("http://www.leafground.com/pages/Image.html");
    imagepage.imgbrk("imagebroken");
    imagepage.getAct("act");
    }
    @Test
    public void dropdown(){
    driver.get("http://www.leafground.com/pages/Dropdown.html");
    DropDownPage dropdownlist= new DropDownPage(driver);
    dropdownlist.SlctByInd("ind");
    dropdownlist.SlByVisTxt("Visible");
    dropdownlist.SlByval("valu");
    dropdownlist.getdrplist("dropDownList");
    }
    @Test
    public void radiobutton(){
    driver.get("http://www.leafground.com/pages/radio.html");
    RadioButtonPage radioButton= new RadioButtonPage(driver);
    radioButton.getLikeClass("classlike");
    radioButton.SelDef("default1");
    radioButton.radioList("rdList");
    }
    @Test
    public void checkbox(){
    driver.get("http://www.leafground.com/pages/checkbox.html");
    CheckBoxPage checkbox= new CheckBoxPage(driver);
    checkbox.Check("select");
    checkbox.check1("getselect");
    checkbox.check2("getdeselect");
    checkbox.chkall("selectAll");
    }
    @Test
    public void table(){
    driver.get("http://www.leafground.com/pages/table.html");
    TablePage table= new TablePage(driver);
    table.getentireTable("entireTable");
    table.NoOfRoes("Rows");
    table.NoOfCols("ColsHeader");
    table.ColsOf2ndrow("progressList");
    table.RowsOf3Cols("Checkleast");
    }
    @Test
    public void alert(){
    driver.get("http://www.leafground.com/pages/Alert.html");
    AlertPage alert= new AlertPage(driver);
    alert.alaertbox("alert1");
    alert.CofirmationBox("alert2");
    alert.promptBox("alert3");
    alert.LineBreaks("alert4");
    alert.sweetmsg("button");
    }
    @Test
    public void frame(){
    driver.get("http://www.leafground.com/pages/frame.html");
    FramePage framepage= new FramePage(driver);
    framepage.FirstFrame("frames");
    framepage.SecondFrame("frame2");
    framepage.NoOfFrame("TotalFrames");
    }
    @Test
    public void window() throws InterruptedException {
    driver.get("http://www.leafground.com/pages/Window.html");
    WindowPage window= new WindowPage(driver);
    window.newWindow("windowhand");
    window.OpenWindows("NoOfWindows");
    window.WaitExcep("WaittoOpen");
    }
    @Test
    public void calender(){
    driver.get("http://www.leafground.com/pages/Calendar.html");
    CalenderPage calender = new CalenderPage(driver);
    calender.getDate("pickdate");
    }
    @Test
    public void draggable(){
    driver.get("http://www.leafground.com/pages/drag.html");
    DraggablePage draggablePage = new DraggablePage(driver);
    draggablePage.Drag("drag1");
    }
    @Test
    public void droppable(){
    driver.get("http://www.leafground.com/pages/drop.html");
    DroppablePage droppablePage= new DroppablePage(driver);
    droppablePage.Dragga("drag1");
    }
    @Test
    public void selectable(){
    driver.get("http://www.leafground.com/pages/selectable.html");
    SelectablePage selectablePage= new SelectablePage(driver);
    selectablePage.getSelect("select1");
    }
    @Test
    public void sortable(){
    driver.get("http://www.leafground.com/pages/sortable.html");
    SortablePage  sort = new SortablePage(driver);
    sort.getSort("sort1");
    }
    @Test
    public void autocomplete() throws InterruptedException {
    driver.get("http://www.leafground.com/pages/autoComplete.html");
    AutocompletePage autocompletePage= new AutocompletePage(driver);
    autocompletePage.AutoComp("autocom");
    }
    @Test
    public void download() throws InterruptedException {
    driver.get("http://www.leafground.com/pages/download.html");
    DownloadPage download= new DownloadPage(driver);
    download.listOfFiles("dwnload");
    }
    @Test
    public void upload() throws InterruptedException {
    driver.get("http://www.leafground.com/pages/upload.html");
    UploadPage upload= new UploadPage(driver);
    upload.FileUpload("upLoadFile");
    }
    @Test
    public void tooltip(){
    driver.get("http://www.leafground.com/pages/tooltip.html");
    TooltipPage tooltip = new TooltipPage(driver);
    tooltip.Tool("name");
    }
    @Test
    public void waitfordisapper(){
    driver.get("http://www.leafground.com/pages/disapper.html");
    WaitToDisappearPage waitdisappear= new WaitToDisappearPage(driver);
    waitdisappear.disapper("msg");
    }
    @Test
    public void waitforAppear(){
    driver.get("http://www.leafground.com/pages/appear.html");
    WaittoappearPage waittoappearPage= new WaittoappearPage(driver);
    waittoappearPage.appearmsg("apprmsg");
    }
    @Test
    public void textchange(){
    driver.get("http://www.leafground.com/pages/TextChange.html");
    TextchangePage textchange= new TextchangePage(driver);
    textchange.TxtChnge("txtchnge");
    }
    @Test
    public void waitForApperance(){
    driver.get("http://www.leafground.com/pages/alertappear.html");
    WaitForApperance waitForApperance= new WaitForApperance(driver);
    waitForApperance.wtAppear("alr");
    }
    @Test
    public void MouseHover(){
    driver.get("http://www.leafground.com/pages/mouseOver.html");
    MouseHoverPage mousehover= new MouseHoverPage(driver);
    mousehover.getmousehov("element");
    mousehover.HandAlert("handlealert");
    }
    @Test
    public void WebTable(){
    driver.get("http://www.leafground.com/pages/sorttable.html");
    WebtablePage webtable= new WebtablePage(driver);
    webtable.WTable("wbTable");
    }
}
