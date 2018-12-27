package com.maxsoft.automation.ios.stepdefinition.settings;

import com.maxsoft.automation.ios.page.settings.SettingsPage;
import com.maxsoft.automation.ios.util.driver.DriverSetup;
import com.thoughtworks.gauge.Step;
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


public class SettingsStepDef {

    private SettingsPage settingsPage = PageFactory.initElements(DriverSetup.iosDriver, SettingsPage.class);

    @Step("Tap on Signout button")
    public void tapOnSignoutButton() throws IOException {
        settingsPage.tapSignOutButton();
    }

    @Step("Signout Alert should be visible")
    public void isSignOutAlertVisible() throws IOException {
        settingsPage.isSignOutAlertVisible();
    }

    @Step("Signout Alert title is <alertTitle>")
    public void isSignOutAlertTitleIs(String alertTitle) throws IOException {
        settingsPage.isSignOutAlertTitleEquals(alertTitle);
    }

    @Step("Signout Alert description is <alertDescription>")
    public void isSignOutAlertDescriptionIs(String alertDescription) throws IOException {
        settingsPage.isSignOutAlertDescriptionEquals(alertDescription);
    }

    @Step("Tap on Ok button in Signout Alert box")
    public void tapSignOutOkButton() throws IOException {
        settingsPage.tapSignOutOkButton();
    }

    @Step("Tap on Cancel button in Signout Alert box")
    public void tapSignOutCancelButton() throws IOException {
        settingsPage.tapSignOutCancelButton();
    }


}