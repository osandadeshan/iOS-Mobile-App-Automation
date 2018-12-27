package com.maxsoft.automation.ios.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static com.maxsoft.automation.ios.util.driver.DriverSetup.iosDriver;

/**
 * Project Name : iOS_Mobile_App_Test_Automation
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 5/14/17
 * Time         : 12:50 PM
 * Description  :
 **/


public class CommonElementsPage extends Base {

    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"toogleButton\"]")
    private WebElement BTN_TOGGLE;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    private WebElement BTN_OK;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    private WebElement BTN_CANCEL;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Save\"]")
    private WebElement BTN_SAVE;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
    private WebElement BTN_BACK;


    public CommonElementsPage() {
        PageFactory.initElements(iosDriver, this);
    }

    public WebElement getPageTitleElement(String pageTitle) {
        return iosDriver.findElementByXPath("//XCUIElementTypeNavigationBar[@name=\""+pageTitle+"\"]");
    }

    public void tapToggle() throws IOException {
        tap(BTN_TOGGLE);
    }

    public int getToggleActiveStatus() throws IOException {
        waitForElementVisible(BTN_TOGGLE);
        return Integer.valueOf(BTN_TOGGLE.getAttribute("value"));
    }

    public void tapButton(String buttonName) throws IOException {
        String xpath = "//XCUIElementTypeButton[@name=\""+buttonName+"\"]";
        waitForElementVisible(xpath);
        tapByXpath(xpath);
    }

    public void isTextVisible(String alertTitle) throws IOException {
        String xpath = "//XCUIElementTypeStaticText[@name=\""+alertTitle+"\"]";
        isElementVisibleByValue(alertTitle, xpath, alertTitle);
    }

    public void isTextEquals(String text) throws IOException {
        String xpath = "//XCUIElementTypeStaticText[@name=\""+text+"\"]";
        isElementValueEquals(xpath, text);
    }

    public void tapOkButton() throws IOException {
        tap(BTN_OK);
    }

    public void tapCancelButton() throws IOException {
        tap(BTN_CANCEL);
    }

    public void tapSaveButton() throws IOException {
        tap(BTN_SAVE);
    }

    public void tapBackButton() throws IOException {
        tap(BTN_BACK);
    }


}
