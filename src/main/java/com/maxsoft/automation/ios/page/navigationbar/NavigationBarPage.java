package com.maxsoft.automation.ios.page.navigationbar;

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


public class NavigationBarPage extends Base {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Expert Decks\"]")
    private WebElement BTN_EXPERT_DECK;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"My Decks\"]")
    private WebElement BTN_MY_DECK;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Browse\"]")
    private WebElement BTN_BROWSE;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Archived\"]")
    private WebElement BTN_ARCHIVED;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Settings\"]")
    private WebElement BTN_SETTINGS;


    public NavigationBarPage() {
        PageFactory.initElements(DriverSetup.iosDriver, this);
    }

    public void navigateToExpertDeckPage() throws IOException {
        tap(BTN_EXPERT_DECK);
    }

    public void navigateToMyDeckPage() throws IOException {
        tap(BTN_MY_DECK);
    }

    public void navigateToBrowsePage() throws IOException {
        tap(BTN_BROWSE);
    }

    public void navigateToArchivedPage() throws IOException {
        tap(BTN_ARCHIVED);
    }

    public void navigateToSettingsPage() throws IOException {
        tap(BTN_SETTINGS);
    }


}
