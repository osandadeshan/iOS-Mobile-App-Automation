package com.maxsoft.automation.ios.page.onboarding;

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


public class WelcomeFlowPage extends Base {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
    private WebElement BTN_SKIP;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Next\"]")
    private WebElement BTN_NEXT;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Done\"]")
    private WebElement BTN_DONE;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Got It\"]")
    private WebElement BTN_GOT_IT;


    public WelcomeFlowPage() {
        PageFactory.initElements(DriverSetup.iosDriver, this);
    }

    public void tapSkipButton() throws IOException {
        tap(BTN_SKIP);
    }

    public void tapNextButton() throws IOException {
        tap(BTN_NEXT);
    }

    public void tapDoneButton() throws IOException {
        tap(BTN_DONE);
    }

    public void tapGotItButton() throws IOException {
        tap(BTN_GOT_IT);
    }


}
