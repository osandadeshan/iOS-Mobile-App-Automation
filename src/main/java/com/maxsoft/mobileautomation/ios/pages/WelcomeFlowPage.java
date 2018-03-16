package com.maxsoft.mobileautomation.ios.pages;

import com.maxsoft.mobileautomation.ios.util.DriverSetup;
import com.maxsoft.mobileautomation.ios.common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;


/**
 * Created by Osanda on 5/14/2017.
 */


public class WelcomeFlowPage extends Base {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
    public WebElement BTN_SKIP;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Next\"]")
    public WebElement BTN_NEXT;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Got It\"]")
    public WebElement BTN_GOT_IT;

    public WelcomeFlowPage() {
        PageFactory.initElements(DriverSetup.iosDriver, this);
    }

    public void tapSkipButton() throws IOException {
        tap(BTN_SKIP);
    }

    public void tapNextButton() throws IOException {
        tap(BTN_NEXT);
    }

    public void tapGotItButton() throws IOException {
        tap(BTN_GOT_IT);
    }


}
