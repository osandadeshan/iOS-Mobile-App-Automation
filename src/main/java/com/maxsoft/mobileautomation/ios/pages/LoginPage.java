package com.maxsoft.mobileautomation.ios.pages;

import com.maxsoft.mobileautomation.ios.util.DriverSetup;
import com.maxsoft.mobileautomation.ios.common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;


/**
 * Created by Osanda on 5/14/2017.
 */


public class LoginPage extends Base {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Login\"]")
    public WebElement LBL_LOGIN_PAGE_TITLE;
    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"username\"]")
    public WebElement TXT_USERNAME;
    @FindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"password\"]")
    public WebElement TXT_PASSWORD;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"signIn\"]")
    public WebElement BTN_SIGN_IN;
    @FindBy(xpath = "//XCUIElementTypeAlert[@name=\"Login Failed\"]/XCUIElementTypeOther")
    public WebElement ALERT;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Login Failed\"]")
    public WebElement ALERT_TITLE;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Incorrect username or password!\"]")
    public WebElement ALERT_MESSAGE;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    public WebElement BTN_ALERT_OK;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"createAccount\"]")
    public WebElement BTN_CREATE_ACCOUNT;
    @FindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Expert Decks\"]")
    public WebElement LBL_EXPERT_DECKS_PAGE_TITLE;

    private static final String CREATE_ACCOUNT_BUTTON_LABEL = "Create account";

    public LoginPage() {
        PageFactory.initElements(DriverSetup.iosDriver, this);
    }

    public void isLoginPageTitleEquals(String pageTitle) throws IOException {
        isPageTitleEquals(LBL_LOGIN_PAGE_TITLE, pageTitle);
    }

    public void login(String username, String password) throws IOException {
        setTextAs(TXT_USERNAME, username);
        setTextAs(TXT_PASSWORD, password);
    }

    public void tapSignInButton() throws IOException {
        tap(BTN_SIGN_IN);
    }

    public void clearTextFields() throws IOException {
        clearText(TXT_USERNAME);
        clearText(TXT_PASSWORD);
    }

    public void isLandingPageTitleEquals(String pageTitle) throws IOException {
        isPageTitleEquals(LBL_EXPERT_DECKS_PAGE_TITLE, pageTitle);
    }

    public void isLoginErrorAlertTitleEquals(String loginErrorAlertTitle) throws IOException {
        isElementNameEquals(ALERT_TITLE, loginErrorAlertTitle);
    }

    public void isLoginErrorAlertMessageEquals(String loginErrorAlertMessage) throws IOException {
        isElementNameEquals(ALERT_MESSAGE, loginErrorAlertMessage);
    }

    public void tapLoginErrorAlertOkButton() throws IOException {
        tap(BTN_ALERT_OK);
    }

    public void navigateToCreateAccount() throws IOException {
        tap(BTN_CREATE_ACCOUNT);
    }

    public void isCreateAccountButtonVisible() throws IOException {
        isElementLabelEquals(BTN_CREATE_ACCOUNT, CREATE_ACCOUNT_BUTTON_LABEL);
    }


}
