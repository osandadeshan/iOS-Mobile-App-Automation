package com.maxsoft.automation.ios.page.notification;

import com.maxsoft.automation.ios.common.Base;
import com.maxsoft.automation.ios.util.driver.DriverSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

/**
 * Project Name : iOS_Mobile_App_Test_Automation
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 5/14/17
 * Time         : 12:50 PM
 * Description  :
 **/


public class NotificationControllerAlertPage extends Base {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Allow\"]")
    private WebElement BTN_ALLOW;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Don’t Allow\"]")
    private WebElement BTN_DONT_ALLOW;


    public NotificationControllerAlertPage() {
        PageFactory.initElements(DriverSetup.iosDriver, this);
    }

    public void tapOnAllow() throws IOException {
        tap(BTN_ALLOW);
    }

    public void tapOnDontAllow() throws IOException {
        tap(BTN_DONT_ALLOW);
    }


}
