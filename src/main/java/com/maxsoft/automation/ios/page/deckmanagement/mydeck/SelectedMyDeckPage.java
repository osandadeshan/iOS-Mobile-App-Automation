package com.maxsoft.automation.ios.page.deckmanagement.mydeck;

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
 * Date         : 8/28/18
 * Time         : 11:21 AM
 * Description  :
 **/


public class SelectedMyDeckPage extends Base {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"deckTitle\"]")
    private WebElement LBL_DECK_TITLE;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"practice\"]")
    private WebElement BTN_PRACTICE;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"viewEditCards\"]")
    private WebElement BTN_VIEW_CARDS;


    public SelectedMyDeckPage() {
        PageFactory.initElements(DriverSetup.iosDriver, this);
    }

    public void isDeckTitleEquals(String deckTitle) throws IOException {
        isElementValueEquals(LBL_DECK_TITLE, deckTitle);
    }

    public void tapPracticeButton() throws IOException {
        tap(BTN_PRACTICE);
    }

    public void tapViewCardsButton() throws IOException {
        tap(BTN_VIEW_CARDS);
    }


}