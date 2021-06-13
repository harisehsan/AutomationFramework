package global.APP.starter;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import cucumber.api.java.Before;
import cucumber.api.testng.TestNGCucumberRunner;
import global.Base;
import global.Drivers;
import io.appium.java_client.AppiumDriver;
import jdk.nashorn.tools.Shell;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class BaseRunner{

    public static TestNGCucumberRunner testNGCucumberRunner;
    public Drivers drv = new Drivers();

    @BeforeClass(alwaysRun = true)
    //@Parameters({"platformName","deviceName","platformVersion","udid","port","systemPort"})
    //public void testLoginAndLogout(String platformName, String deviceName, String platformVersion, String udid, String port, String systemPort) throws Exception {
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        //drv.IOS_Launch_LazadaApp_iphone8();
        drv.Android_Launch_LazadaApp_honor10();
        //drv.Android_Launch_LazadaApp_honor8();
        //drv.MultipleDriver2(port, platformName, platformVersion, deviceName, udid, systemPort );
        //drv.MultipleDriver3(port, platformName, platformVersion, deviceName, udid, systemPort );


    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();

    }

    @AfterTest(alwaysRun = true)
    public void teardownBrowser() throws Exception {
        //driver.quit();
    }
}
