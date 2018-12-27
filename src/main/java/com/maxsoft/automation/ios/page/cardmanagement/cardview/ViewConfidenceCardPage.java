package com.maxsoft.automation.ios.page.cardmanagement.cardview;

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
 * Date         : 9/10/18
 * Time         : 6:49 PM
 * Description  :
 **/


public class ViewConfidenceCardPage extends Base {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"moreIcon\"]")
    private WebElement BTN_OPTION;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"close\"]")
    private WebElement BTN_CLOSE;

    public static String questionRegex = "questionTitle";
    public static String questionXpath = "//XCUIElementTypeStaticText[@name=\""+questionRegex+"\"]";
    public static String answerRegex = "questionTitle";
    public static String answerXpath = "//XCUIElementTypeStaticText[@name=\""+questionRegex+"\"]";


    public void ViewConfidenceCardPage(){
        PageFactory.initElements(DriverSetup.iosDriver, this);
    }

    public void isQuestionTitleEquals(String question) throws IOException {
        isElementVisibleByName(question, questionXpath, questionRegex);
    }

    public void isAnswerEquals(String answer) throws IOException {
        isElementVisibleByName(answer, answerXpath, answerRegex);
    }

    public void tapOptionButton() throws IOException {
        tap(BTN_OPTION);
    }

    public void tapCloseButton() throws IOException {
        tap(BTN_CLOSE);
    }


}