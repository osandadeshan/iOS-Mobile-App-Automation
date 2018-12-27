package com.maxsoft.automation.ios.page.deckmanagement.expertdeck;

import com.maxsoft.automation.ios.common.Base;
import com.maxsoft.automation.ios.util.driver.DriverSetup;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

/**
 * Project Name : iOS_Mobile_App_Test_Automation
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 9/7/18
 * Time         : 10:50 AM
 * Description  :
 **/


public class ExpertDeckListPage extends Base {

    private static final String deckTitleRegex = "deckTitle";
    private static String deckXpath = "//XCUIElementTypeButton[@name=\""+deckTitleRegex+"\"]";


    public ExpertDeckListPage() {
        PageFactory.initElements(DriverSetup.iosDriver, this);
    }

    public void tapOnDeck(String deckTitle) throws IOException {
        scrollByName(deckTitle);
        String modifiedDeckXpath = deckXpath.replace(deckTitleRegex, deckTitle);
        tapByXpath(modifiedDeckXpath);
    }

    public void tapOptionsButton(String deckTitle) throws IOException {
        scrollByName(deckTitle);
        String modifiedDeckXpath = deckXpath.replace(deckTitleRegex, deckTitle) + "/following-sibling::XCUIElementTypeButton[@name=\"More options\"]";
        tapByXpath(modifiedDeckXpath);
    }

    public void isExpertDeckVisible(String deckTitle) throws IOException {
        scrollByName(deckTitle);
    }

    public void isExpertDeckNotVisible(String deckTitle) throws IOException {
        scrollByNameNotVisible(deckTitle);
    }


}