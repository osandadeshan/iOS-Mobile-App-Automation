package com.maxsoft.mobileautomation.ios.pages;

import com.maxsoft.mobileautomation.ios.util.DriverSetup;
import org.openqa.selenium.WebElement;


/**
 * Created by Osanda on 5/14/2017.
 */


public class CommonElementsPage {

    public WebElement getPageTitleElement(String pageTitle) {
        return DriverSetup.iosDriver.findElementByXPath("//XCUIElementTypeNavigationBar[@name=\""+pageTitle+"\"]");
    }


}
