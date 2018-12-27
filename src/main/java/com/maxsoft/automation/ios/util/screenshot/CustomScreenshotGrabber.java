package com.maxsoft.automation.ios.util.screenshot;

import com.maxsoft.automation.ios.util.driver.DriverSetup;
import com.thoughtworks.gauge.screenshot.ICustomScreenshotGrabber;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 * Project Name : iOS_Mobile_App_Test_Automation
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 5/14/17
 * Time         : 12:50 PM
 * Description  :
 **/


// Using WebDriver public class
public class CustomScreenshotGrabber implements ICustomScreenshotGrabber {

    public CustomScreenshotGrabber(){

    }

    // Return a screenshot byte array
    public byte[] takeScreenshot() {
        return ((TakesScreenshot) DriverSetup.iosDriver).getScreenshotAs(OutputType.BYTES);
    }


}
