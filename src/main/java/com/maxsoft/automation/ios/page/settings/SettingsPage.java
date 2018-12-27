package com.maxsoft.automation.ios.page.settings;

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
 * Date         : 8/24/18
 * Time         : 10:50 AM
 * Description  :
 **/


public class SettingsPage extends Base {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"signOut\"]")
    private WebElement OPT_SIGNOUT;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Sign out\"]")
    private WebElement ALERT_TITLE_SIGNOUT;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Are you sure want to Sign out?\"]")
    private WebElement ALERT_DESCRIPTION_SIGNOUT;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    private WebElement ALERT_OK_SIGNOUT;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    private WebElement ALERT_CANCEL_SIGNOUT;


    public SettingsPage() {
        PageFactory.initElements(DriverSetup.iosDriver, this);
    }

    public void tapSignOutButton() throws IOException {
        tap(OPT_SIGNOUT);
    }

    public void isSignOutAlertVisible() throws IOException {
        isElementVisibleByValue(ALERT_TITLE_SIGNOUT);
    }

    public void isSignOutAlertTitleEquals(String alertTitle) throws IOException {
        isElementValueEquals(ALERT_TITLE_SIGNOUT, alertTitle);
    }

    public void isSignOutAlertDescriptionEquals(String alertDescription) throws IOException {
        isElementValueEquals(ALERT_DESCRIPTION_SIGNOUT, alertDescription);
    }

    public void tapSignOutOkButton() throws IOException {
        tap(ALERT_OK_SIGNOUT);
    }

    public void tapSignOutCancelButton() throws IOException {
        tap(ALERT_CANCEL_SIGNOUT);
    }


}