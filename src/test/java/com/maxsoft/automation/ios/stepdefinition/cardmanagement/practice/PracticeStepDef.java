package com.maxsoft.automation.ios.stepdefinition.cardmanagement.practice;

import com.maxsoft.automation.ios.page.cardmanagement.practice.PracticePage;
import com.maxsoft.automation.ios.util.driver.DriverSetup;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

/**
 * Project Name : iOS_Mobile_App_Test_Automation
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 9/21/18
 * Time         : 3:12 PM
 * Description  :
 **/


public class PracticeStepDef {

    private PracticePage practicePage = PageFactory.initElements(DriverSetup.iosDriver, PracticePage.class);

    @Step("Question title is <question>")
    public void isQuestionTitleEquals(String question) throws IOException {
        practicePage.isQuestionTitleEquals(question);
    }

    @Step("Tap on question <question> to see the answer")
    public void tapOnQuestion(String question) throws IOException {
        practicePage.tapOnQuestion(question);
    }

    @Step("Set answer as correct")
    public void tapOnCorrectAnswerButton() throws IOException {
        practicePage.tapOnCorrectAnswerButton();
    }

    @Step("Set answer as incorrect")
    public void tapOnInCorrectAnswerButton() throws IOException {
        practicePage.tapOnInCorrectAnswerButton();
    }

    @Step("Tap close button on the practice session")
    public void tapOnCloseButton() throws IOException {
        practicePage.tapOnCloseButton();
    }

    @Step("Tap close button on the practice summary")
    public void tapOnClosePracticeSessionButton() throws IOException {
        practicePage.tapOnClosePracticeSessionButton();
    }

    @Step("Correct cards count of the practice session is <correctAnswerCount>")
    public void isCorrectAnswerCountEquals(String correctAnswerCount) throws IOException {
        practicePage.isCorrectAnswerCountEquals(correctAnswerCount);
    }

    @Step("Tap on Practice More button")
    public void tapOnPracticeMoreButton() throws IOException {
        practicePage.tapOnPracticeMoreButton();
    }

    @Step("Tap on Option button on the practice session")
    public void tapOnOptionButton() throws IOException {
        practicePage.tapOnOptionButton();
    }


}