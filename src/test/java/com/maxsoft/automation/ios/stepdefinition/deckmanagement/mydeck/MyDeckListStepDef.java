package com.maxsoft.automation.ios.stepdefinition.deckmanagement.mydeck;

import com.maxsoft.automation.ios.page.deckmanagement.mydeck.MyDeckListPage;
import com.maxsoft.automation.ios.util.driver.DriverSetup;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

/**
 * Project Name : iOS_Mobile_App_Test_Automation
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/20/18
 * Time         : 1:31 PM
 * Description  :
 **/


public class MyDeckListStepDef {

    private MyDeckListPage myDeckListPage = PageFactory.initElements(DriverSetup.iosDriver, MyDeckListPage.class);

    @Step("Tap on Create Deck button")
    public void tapCreateDeckButton() throws IOException {
        myDeckListPage.tapCreateDeckButton();
    }

    @Step("Tap on Options button of <deckTitle> deck")
    public void tapOptionsButton(String deckTitle) throws IOException {
        myDeckListPage.tapOptionsButton(deckTitle);
    }

    @Step("Tap on Archive button")
    public void tapArchive() throws IOException {
        myDeckListPage.tapArchive();
    }

    @Step("Tap on <deckTitle> deck")
    public void tapOnDeck(String deckTitle) throws IOException {
        myDeckListPage.tapOnDeck(deckTitle);
    }

    @Step("<deckTitle> my deck should be visible")
    public void isMyDeckVisible(String deckTitle) throws IOException {
        myDeckListPage.isMyDeckVisible(deckTitle);
    }

    @Step("<deckTitle> my deck should not be visible")
    public void isMyDeckNotVisible(String deckTitle) throws IOException {
        myDeckListPage.isMyDeckNotVisible(deckTitle);
    }


}