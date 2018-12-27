package com.maxsoft.automation.ios.stepdefinition.deckmanagement.mydeck;

import com.maxsoft.automation.ios.page.deckmanagement.mydeck.SelectedMyDeckPage;
import com.maxsoft.automation.ios.util.driver.DriverSetup;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

/**
 * Project Name : iOS_Mobile_App_Test_Automation
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/28/18
 * Time         : 11:59 AM
 * Description  :
 **/


public class SelectedMyDeckStepDef {

    private SelectedMyDeckPage selectedMyDeckPage = PageFactory.initElements(DriverSetup.iosDriver, SelectedMyDeckPage.class);

    @Step("Deck title is <deckTitle>")
    public void isDeckTitleEquals(String deckTitle) throws IOException {
        selectedMyDeckPage.isDeckTitleEquals(deckTitle);
    }

    @Step("Tap on Practice button")
    public void isDeckTitleEquals() throws IOException {
        selectedMyDeckPage.tapPracticeButton();
    }

    @Step("Tap on View Cards button")
    public void tapViewCardsButton() throws IOException {
        selectedMyDeckPage.tapViewCardsButton();
    }


}