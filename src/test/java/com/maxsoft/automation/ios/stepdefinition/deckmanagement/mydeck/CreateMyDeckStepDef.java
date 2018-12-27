package com.maxsoft.automation.ios.stepdefinition.deckmanagement.mydeck;

import com.maxsoft.automation.ios.common.Base;
import com.maxsoft.automation.ios.page.deckmanagement.mydeck.CreateMyDeckPage;
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


public class CreateMyDeckStepDef {

    private CreateMyDeckPage myDeckPage = PageFactory.initElements(DriverSetup.iosDriver, CreateMyDeckPage.class);

    @Step("Set the deck title as <deckTitle>")
    public void setDeckTitle(String deckTitle) throws IOException {
        myDeckPage.setDeckTitle(deckTitle);
    }

    @Step("Set the exam date <month> <date> <year> (Month Date Year)")
    public void setExamDate(String month, String date, String year) throws IOException {
        myDeckPage.setExamDate(month, date, year);
    }

    @Step("Tap on exam reminder frequency type picker")
    public void tapFrequencyTypePicker() throws IOException {
        myDeckPage.tapFrequencyTypePicker();
    }

    @Step("Set exam reminder frequency type picker as <examFrequency>")
    public void setFrequencyTypePicker(String examFrequency) throws IOException {
        myDeckPage.setFrequencyTypePicker(examFrequency);
    }

    @Step("Set exam reminder time <hour> <minute> <amPm> (Hour Minute AM/PM)")
    public void setTimePicker(String hour, String minute, String amPm) throws IOException {
        myDeckPage.setTimePicker(hour, minute, amPm);
    }

    @Step("Cancel the deck creation")
    public void tapCancelButton() throws IOException {
        myDeckPage.tapCancelButton();
    }

    @Step("Save the deck")
    public void tapSaveButton() throws IOException {
        myDeckPage.tapSaveButton();
        Base.freeze(3);
    }


}