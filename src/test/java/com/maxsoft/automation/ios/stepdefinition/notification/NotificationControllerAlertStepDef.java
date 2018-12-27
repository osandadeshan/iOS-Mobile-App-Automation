package com.maxsoft.automation.ios.stepdefinition.notification;

import com.maxsoft.automation.ios.page.notification.NotificationControllerAlertPage;
import com.maxsoft.automation.ios.util.driver.DriverSetup;
import com.thoughtworks.gauge.Step;
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


public class NotificationControllerAlertStepDef {

    private NotificationControllerAlertPage notificationControllerAlertPage = PageFactory.initElements(DriverSetup.iosDriver, NotificationControllerAlertPage.class);

    @Step("Tap on Allow button")
    public void tapOnAllow() throws IOException {
        notificationControllerAlertPage.tapOnAllow();
    }

    @Step("Tap on Don't Allow button")
    public void tapOnDontAllow() throws IOException {
        notificationControllerAlertPage.tapOnDontAllow();
    }


}
