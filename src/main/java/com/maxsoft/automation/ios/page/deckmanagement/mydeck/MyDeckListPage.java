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
 * Date         : 8/20/18
 * Time         : 12:50 PM
 * Description  :
 **/


public class MyDeckListPage extends Base {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Create new deck\"]")
    private WebElement BTN_CREATE_DECK;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Archive Deck\"]")
    private WebElement OPT_ARCHIVE;

    private static final String deckTitleRegex = "deckTitle";
    private static String deckXpath = "//XCUIElementTypeButton[@name=\""+deckTitleRegex+"\"]";


    public MyDeckListPage() {
        PageFactory.initElements(DriverSetup.iosDriver, this);
    }

    public void tapCreateDeckButton() throws IOException {
        tap(BTN_CREATE_DECK);
    }

    public void tapOnDeck(String deckTitle) throws IOException {
        try {
            scrollByName(deckTitle);
        } catch (Exception ex){ }
        String modifiedDeckXpath = deckXpath.replace(deckTitleRegex, deckTitle);
        tapByXpath(modifiedDeckXpath);
    }

    public void tapOptionsButton(String deckTitle) throws IOException {
        scrollByName(deckTitle);
        String modifiedDeckXpath = deckXpath.replace(deckTitleRegex, deckTitle) + "/following-sibling::XCUIElementTypeButton[@name=\"More options\"]";
        tapByXpath(modifiedDeckXpath);
    }

    public void tapArchive() throws IOException {
        tap(OPT_ARCHIVE);
    }

    public void isMyDeckVisible(String deckTitle) throws IOException {
        scrollByName(deckTitle);
    }

    public void isMyDeckNotVisible(String deckTitle) throws IOException {
        scrollByNameNotVisible(deckTitle);
    }


}