package com.maxsoft.automation.ios.page.cardmanagement.create;

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
 * Time         : 3:19 PM
 * Description  :
 **/


public class CreateConfidenceCardPage extends Base {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Create Card\"]")
    private WebElement PAGE_TITLE;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Front\"]")
    private WebElement BTN_FRONT;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
    private WebElement BTN_BACK;

    @FindBy(xpath = "//XCUIElementTypeTextView[@name=\"question\"]")
    private WebElement TXT_QUESTION;

    @FindBy(xpath = "//XCUIElementTypeTextView[@name=\"answer\"]")
    private WebElement TXT_ANSWER;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Save\"]")
    private WebElement BTN_SAVE;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    private WebElement BTN_CANCEL;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Error\"]")
    private WebElement ALERT_TITLE_ERROR;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Answer can't be empty!\"]")
    private WebElement ALERT_DESCRIPTION_ERROR;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    private WebElement ALERT_OK;


    public void ConfidenceCardPage(){
        PageFactory.initElements(DriverSetup.iosDriver, this);
    }

    public void isPageTitleEquals(String pageTitle) throws IOException {
        isElementNameEquals(PAGE_TITLE, pageTitle);
    }

    public void tapFrontButton() throws IOException {
        tap(BTN_FRONT);
    }

    public void setQuestion(String question) throws IOException {
        setTextAs(TXT_QUESTION, question);
    }

    public void tapBackButton() throws IOException {
        tap(BTN_BACK);
    }

    public void setAnswer(String answer) throws IOException {
        setTextAs(TXT_ANSWER, answer);
    }

    public void tapSaveButton() throws IOException {
        tap(BTN_SAVE);
    }

    public void tapCancelButton() throws IOException {
        tap(BTN_CANCEL);
    }

    public void isAlertVisible() throws IOException {
        isElementVisibleByValue(ALERT_TITLE_ERROR);
    }

    public void isAlertTitleEquals(String alertTitle) throws IOException {
        isElementValueEquals(ALERT_TITLE_ERROR, alertTitle);
    }

    public void isAlertDescriptionEquals(String alertDescription) throws IOException {
        isElementValueEquals(ALERT_TITLE_ERROR, alertDescription);
    }

    public void tapOkButton() throws IOException {
        tap(ALERT_OK);
    }


}