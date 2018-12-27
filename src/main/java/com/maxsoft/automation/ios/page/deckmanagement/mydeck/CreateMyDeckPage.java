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
 * Time         : 3:12 PM
 * Description  :
 **/


public class CreateMyDeckPage extends Base {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    private WebElement BTN_CANCEL;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Save\"]")
    private WebElement BTN_SAVE;

    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"deckTitle\"]")
    private WebElement TXT_DECK_TITLE;

    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"examDate\"]")
    private WebElement TXT_EXAM_DATE;

    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"reminderDescription\"]")
    private WebElement TYPE_PICKER_EXAM_REMINDER_FREQUENCY;

    @FindBy(className = "XCUIElementTypePickerWheel")
    private WebElement TYPE_PICKER_WHEEL;

    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"reminderTime\"]")
    private WebElement TYPE_PICKER_EXAM_REMINDER_TIME;


    public CreateMyDeckPage() {
        PageFactory.initElements(DriverSetup.iosDriver, this);
    }

    public void setDeckTitle(String deckTitle) throws IOException {
        setTextAs(TXT_DECK_TITLE, deckTitle);
    }

    public void setExamDate(String month, String date, String year) throws IOException {
        setDatePickerIOS(TXT_EXAM_DATE, month, date, year);
    }

    public void tapFrequencyTypePicker() throws IOException {
        tap(TYPE_PICKER_EXAM_REMINDER_FREQUENCY);
    }

    public void setFrequencyTypePicker(String examFrequency) throws IOException {
        if (examFrequency.toLowerCase().contains("2 weeks")){
            setTextAs(TYPE_PICKER_WHEEL, "2 weeks before exam");
        }
        else if(examFrequency.toLowerCase().contains("1 week")){
            setTextAs(TYPE_PICKER_WHEEL, "1 week before exam");
        }
        else if(examFrequency.toLowerCase().contains("5 days")){
            setTextAs(TYPE_PICKER_WHEEL, "5 days before exam");
        }
        else if(examFrequency.toLowerCase().contains("3 days")){
            setTextAs(TYPE_PICKER_WHEEL, "3 days before exam");
        }
        else {
            print("\"" + examFrequency + "\" cannot be found on the type picker");
        }
    }

    public void setTimePicker(String hour, String minute, String amPm){
        setTimePickerIOS(TYPE_PICKER_EXAM_REMINDER_TIME, hour, minute, amPm);
    }

    public void tapCancelButton() throws IOException {
        tap(BTN_CANCEL);
    }

    public void tapSaveButton() throws IOException {
        tap(BTN_SAVE);
    }


}