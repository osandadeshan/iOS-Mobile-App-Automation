package com.maxsoft.automation.ios.page.cardmanagement.practice;

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
 * Date         : 9/21/18
 * Time         : 12:21 PM
 * Description  :
 **/


public class PracticePage extends Base {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Close button\"]")
    private WebElement BTN_CLOSE;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Session Summary, close button\"]")
    private WebElement BTN_SESSION_SUMMARY_CLOSE;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"markCorrect\"]")
    private WebElement BTN_CORRECT_ANSWER;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"markIncorrect\"]")
    private WebElement BTN_INCORRECT_ANSWER;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Correct\"]/following-sibling::XCUIElementTypeStaticText")
    private WebElement LBL_CORRECT_ANSWERS_COUNT;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Practice More\"]")
    private WebElement BTN_PRACTICE_MORE;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"moreIcon\"]")
    private WebElement BTN_OPTION;

    private static String cardTitleRegex = "cardTitle";
    private static final String questionTitleAppendText = ", double tap the screen to answer the question";
    private static String cardTitleXpath = "//XCUIElementTypeStaticText[@name=\""+cardTitleRegex+questionTitleAppendText+"\"]";
    private static String answerTitleRegex = "answerTitle";
    private static String answerTitleXpath = "//XCUIElementTypeStaticText[@name=\""+answerTitleRegex+"\"]";
    private String modifiedDeckXpath = "";
    private String correctCardsCountRegex = "correctCardsCount";
    private String correctCardsCountXpath = "//XCUIElementTypeStaticText[@name=\"Correct\"]/following-sibling::(XCUIElementTypeStaticText[@name=\""+correctCardsCountRegex+"\"])[2]";
    private String allCardsCorrectCountXpath = "(//XCUIElementTypeStaticText[@name=\""+correctCardsCountRegex+"\"])[2]";


    public void PracticePage(){
        PageFactory.initElements(DriverSetup.iosDriver, this);
    }

    public void tapOnCloseButton() throws IOException {
        tap(BTN_CLOSE);
    }

    public void isQuestionTitleEquals(String questionTitle) throws IOException {
        modifiedDeckXpath = cardTitleXpath.replace(cardTitleRegex, questionTitle);
        isElementValueEquals(modifiedDeckXpath, questionTitle.concat(questionTitleAppendText));
    }

    public void tapOnQuestion(String questionTitle) throws IOException {
        modifiedDeckXpath = cardTitleXpath.replace(cardTitleRegex, questionTitle);
        tapByXpath(modifiedDeckXpath);
    }

    public void isAnswerEquals(String questionTitle) throws IOException {
        modifiedDeckXpath = answerTitleXpath.replace(cardTitleRegex, questionTitle);
        tapByXpath(modifiedDeckXpath);
    }

    public void tapOnCorrectAnswerButton() throws IOException {
        tap(BTN_CORRECT_ANSWER);
    }

    public void tapOnInCorrectAnswerButton() throws IOException {
        tap(BTN_INCORRECT_ANSWER);
    }

    public void tapOnClosePracticeSessionButton() throws IOException {
        tap(BTN_SESSION_SUMMARY_CLOSE);
    }

    public void isCorrectAnswerCountEquals(String correctAnswerCount) throws IOException {
        modifiedDeckXpath = allCardsCorrectCountXpath.replace(correctCardsCountRegex, correctAnswerCount);
        print(modifiedDeckXpath);
        isElementValueEquals(modifiedDeckXpath, correctAnswerCount);
    }

    public void tapOnPracticeMoreButton() throws IOException {
        tap(BTN_PRACTICE_MORE);
    }

    public void tapOnOptionButton() throws IOException {
        tap(BTN_OPTION);
    }


}