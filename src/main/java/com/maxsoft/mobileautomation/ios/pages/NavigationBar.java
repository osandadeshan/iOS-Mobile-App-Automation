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


public class NavigationBar extends Base {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Expert Decks\"]")
    public WebElement BTN_EXPERTDECK;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"My Decks\"]")
    public WebElement BTN_MYDECK;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Archived\"]")
    public WebElement BTN_ARCHIVED;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Settings\"]")
    public WebElement BTN_SETTINGS;

    public NavigationBar() {
        PageFactory.initElements(DriverSetup.iosDriver, this);
    }

    public void navigateToExpertDeckPage() throws IOException {
        tap(BTN_EXPERTDECK);
    }

    public void navigateToMyDeckPage() throws IOException {
        tap(BTN_MYDECK);
    }

    public void navigateToArchivedPage() throws IOException {
        tap(BTN_ARCHIVED);
    }

    public void navigateToSettingsPage() throws IOException {
        tap(BTN_SETTINGS);
    }


}
