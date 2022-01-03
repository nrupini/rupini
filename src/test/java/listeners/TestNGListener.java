package listeners;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.*;
import utils.driverUtil;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static java.util.Calendar.getInstance;

public class TestNGListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        Calendar calender = getInstance();
        SimpleDateFormat format= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        String methodName = iTestResult.getName();
        File srcFile=((TakesScreenshot) driverUtil.getDriver()).getScreenshotAs(OutputType.FILE);
        {
            String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/Failure_screenshot/";
            File descFile= new File(reportDirectory + methodName +"_"+format.format(calender.getTime()) +".png");
            try {
                FileUtils.copyFile(srcFile,descFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Reporter.log("<a href =" +descFile.getAbsolutePath() + "<img src =" +descFile.getAbsolutePath() +"height ='100' width='100'/> </a>");
        }

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
