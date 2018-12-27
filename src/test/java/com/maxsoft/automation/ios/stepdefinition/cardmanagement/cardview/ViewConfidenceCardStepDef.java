package com.maxsoft.automation.ios.stepdefinition.cardmanagement.cardview;

import com.maxsoft.automation.ios.page.cardmanagement.cardview.ViewConfidenceCardPage;
import com.maxsoft.automation.ios.util.driver.DriverSetup;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Project Name : iOS_Mobile_App_Test_Automation
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 9/10/18
 * Time         : 7:11 PM
 * Description  :
 **/


public class ViewConfidenceCardStepDef {

    private ViewConfidenceCardPage viewConfidenceCardPage = PageFactory.initElements(DriverSetup.iosDriver, ViewConfidenceCardPage.class);

    @Step("Question prompt is <question>")
    public void isQuestionTitleEquals(String question) throws IOException {
        viewConfidenceCardPage.isQuestionTitleEquals(question);
    }

    @Step("Answer is <question>")
    public void isAnswerEquals(String answer) throws IOException {
        viewConfidenceCardPage.isAnswerEquals(answer);
    }

    @Step("Tap option button on the card preview")
    public void tapOptionButton() throws IOException {
        viewConfidenceCardPage.tapOptionButton();
    }

    @Step("Tap close button on the card preview")
    public void tapCloseButton() throws IOException {
        viewConfidenceCardPage.tapCloseButton();
    }


}