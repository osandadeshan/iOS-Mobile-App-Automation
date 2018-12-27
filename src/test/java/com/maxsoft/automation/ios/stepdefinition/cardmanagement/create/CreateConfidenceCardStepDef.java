package com.maxsoft.automation.ios.stepdefinition.cardmanagement.create;

import com.maxsoft.automation.ios.page.cardmanagement.create.CreateConfidenceCardPage;
import com.maxsoft.automation.ios.util.driver.DriverSetup;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

/**
 * Project Name : iOS_Mobile_App_Test_Automation
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/28/18
 * Time         : 4:32 PM
 * Description  :
 **/


public class CreateConfidenceCardStepDef {

    private CreateConfidenceCardPage cardListPage = PageFactory.initElements(DriverSetup.iosDriver, CreateConfidenceCardPage.class);

    @Step("Confidence Card page title is <pageTitle>")
    public void isPageTitleEquals(String pageTitle) throws IOException {
        cardListPage.isPageTitleEquals(pageTitle);
    }

    @Step("Tap on Front button")
    public void tapFrontButton() throws IOException {
        cardListPage.tapFrontButton();
    }

    @Step("Tap on Back button")
    public void tapBackButton() throws IOException {
        cardListPage.tapBackButton();
    }

    @Step("Set question as <question>")
    public void setQuestion(String question) throws IOException {
        cardListPage.setQuestion(question);
    }

    @Step("Set answer as <answer>")
    public void setTextAs(String answer) throws IOException {
        cardListPage.setAnswer(answer);
    }

    @Step("Tap on Save button")
    public void tapSaveButton() throws IOException {
        cardListPage.tapSaveButton();
    }

    @Step("Tap on Cancel button")
    public void tapCancelButton() throws IOException {
        cardListPage.tapCancelButton();
    }

    @Step("Error Alert box should be visible on the confidence card page")
    public void isAlertVisible() throws IOException {
        cardListPage.isAlertVisible();
    }

    @Step("Error Alert title is <alertTitle>")
    public void isAlertTitleEquals(String alertTitle) throws IOException {
        cardListPage.isAlertTitleEquals(alertTitle);
    }

    @Step("Error Alert description is <alertDescription>")
    public void isAlertDescriptionEquals(String alertDescription) throws IOException {
        cardListPage.isAlertDescriptionEquals(alertDescription);
    }


}