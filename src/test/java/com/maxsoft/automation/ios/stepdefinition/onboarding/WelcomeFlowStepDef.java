package com.maxsoft.automation.ios.stepdefinition.onboarding;

import com.maxsoft.automation.ios.page.onboarding.WelcomeFlowPage;
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


public class WelcomeFlowStepDef {

    private WelcomeFlowPage welcomeFlowPage = PageFactory.initElements(DriverSetup.iosDriver, WelcomeFlowPage.class);

    @Step("Tap on Skip button")
    public void tapSkipButton() throws IOException {
        welcomeFlowPage.tapSkipButton();
    }

    @Step("Tap on Next button")
    public void tapNextButton() throws IOException {
        welcomeFlowPage.tapNextButton();
    }

    @Step("Tap on Done button")
    public void tapDoneButton() throws IOException {
        welcomeFlowPage.tapDoneButton();
    }

    @Step("Tap on Got It button")
    public void tapGotItButton() throws IOException {
        welcomeFlowPage.tapGotItButton();
    }


}
