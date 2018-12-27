package com.maxsoft.automation.ios.page.cardmanagement.cardlist;

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
 * Date         : 8/27/18
 * Time         : 7:23 PM
 * Description  :
 **/


public class CardListPage extends Base {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Create new card\"]")
    private WebElement BTN_CREATE_CARD;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Back\"])[1]")
    private WebElement BTN_BACK;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Card Create\"]")
    private WebElement ALERT_TITLE_CARD_CREATE;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\" You can upload class notes and other files to auto-create flashcards. Accepts .docx Google Drive files.\"]")
    private WebElement ALERT_DESCRIPTION_CARD_CREATE;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"New Card\"]")
    private WebElement ALERT_BTN_NEW_CARD;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Upload File (Auto-Create)\"]")
    private WebElement ALERT_BTN_UPLOAD_FILE;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    private WebElement ALERT_BTN_CANCEL;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"lastModified\"]")
    private WebElement BTN_LAST_MODIFIED;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Archive filter Option, Not selected, double tap to select\"]")
    private WebElement BTN_ARCHIVED_CARDS;

    private static String cardTitleRegex = "cardTitle";
    private static String cardTitleXpath = "//XCUIElementTypeButton[@name=\""+cardTitleRegex+"\"]";


    public void CardListPage(){
        PageFactory.initElements(DriverSetup.iosDriver, this);
    }

    public void tapCreateCardButton() throws IOException {
        tap(BTN_CREATE_CARD);
    }

    public void tapOnBackButton() throws IOException {
        tap(BTN_BACK);
    }

    public void isAlertVisible() throws IOException {
        isElementVisibleByValue(ALERT_TITLE_CARD_CREATE);
    }

    public void isAlertTitleEquals(String alertTitle) throws IOException {
        isElementValueEquals(ALERT_TITLE_CARD_CREATE, alertTitle);
    }

    public void isAlertDescriptionEquals(String alertDescription) throws IOException {
        isElementValueEquals(ALERT_DESCRIPTION_CARD_CREATE, alertDescription);
    }

    public void tapNewCardButton() throws IOException {
        tap(ALERT_BTN_NEW_CARD);
    }

    public void tapUploadButton() throws IOException {
        tap(ALERT_BTN_UPLOAD_FILE);
    }

    public void tapCancelButton() throws IOException {
        tap(ALERT_BTN_CANCEL);
    }

    public void isCardVisible(String cardTitle) throws IOException {
        isElementVisibleByName(cardTitle, cardTitleXpath, cardTitleRegex);
    }

    public void isCardNotVisible(String cardTitle) throws IOException {
        scrollByNameNotVisible(cardTitle);
        //isElementNotVisibleByValue(cardTitle, cardTitleXpath, cardTitleRegex);
    }

    public void tapOptionsButton(String cardTitle) throws IOException {
        scrollByName(cardTitle);
        String modifiedDeckXpath = cardTitleXpath.replace(cardTitleRegex, cardTitle) + "/following-sibling::XCUIElementTypeButton[@name=\"More Info\"]";
        tapByXpath(modifiedDeckXpath);
    }

    public void tapCard(String cardTitle) throws IOException {
        scrollByName(cardTitle);
        String modifiedDeckXpath = cardTitleXpath.replace(cardTitleRegex, cardTitle);
        tapByXpath(modifiedDeckXpath);
    }


}
