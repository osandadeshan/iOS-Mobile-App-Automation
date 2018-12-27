package com.maxsoft.automation.ios.stepdefinition.deckmanagement.expertdeck;

import com.maxsoft.automation.ios.page.deckmanagement.expertdeck.ExpertDeckListPage;
import com.maxsoft.automation.ios.util.driver.DriverSetup;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

/**
 * Project Name : iOS_Mobile_App_Test_Automation
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 9/7/18
 * Time         : 11:31 AM
 * Description  :
 **/


public class ExpertDeckListStepDef {

    private ExpertDeckListPage expertDeckListPage = PageFactory.initElements(DriverSetup.iosDriver, ExpertDeckListPage.class);

    @Step("Tap on Options button of <deckTitle> expert deck")
    public void tapOptionsButton(String deckTitle) throws IOException {
        expertDeckListPage.tapOptionsButton(deckTitle);
    }

    @Step("Tap on <deckTitle> expert deck")
    public void tapOnDeck(String deckTitle) throws IOException {
        expertDeckListPage.tapOnDeck(deckTitle);
    }

    @Step("<deckTitle> expert deck should be visible")
    public void isExpertDeckVisible(String deckTitle) throws IOException {
        expertDeckListPage.isExpertDeckVisible(deckTitle);
    }

    @Step("<deckTitle> expert deck should not be visible")
    public void isExpertDeckNotVisible(String deckTitle) throws IOException {
        expertDeckListPage.isExpertDeckNotVisible(deckTitle);
    }


}