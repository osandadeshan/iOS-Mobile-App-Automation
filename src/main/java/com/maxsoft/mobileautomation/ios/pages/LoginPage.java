package com.maxsoft.mobileautomation.ios.pages;

import com.maxsoft.mobileautomation.ios.common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static com.maxsoft.mobileautomation.ios.util.DriverSetup.iosDriver;


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
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Ok\"]")
    public WebElement BTN_ALERT_OK;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"createAccount\"]")
    public WebElement BTN_CREATE_ACCOUNT;
    @FindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Expert Decks\"]")
    public WebElement LBL_EXPERT_DECKS_PAGE_TITLE;

    private static final String CREATE_ACCOUNT_BUTTON_LABEL = "Create account";
    private static final String LOGIN_ERROR_TITLE = "Login Failed";
    private static final String LOGIN_ERROR_MESSAGE = "Incorrect username or password!";
    private static final String LOGIN_PAGE_TITLE = "Login";
    private static final String EXPERT_DECKS_HOME_PAGE_TITLE = "Expert Decks";

    public LoginPage() {
        PageFactory.initElements(iosDriver, this);
    }

    public void isLoginPageTitleEquals(String pageTitle) throws IOException {
        isPageTitleEquals(LBL_LOGIN_PAGE_TITLE, pageTitle);
    }

    public void login(String username, String password) throws IOException {
        setTextAs(TXT_USERNAME, username);
        setTextAs(TXT_PASSWORD, password);
        tap(BTN_SIGN_IN);
    }

    public void clearTextFields() throws IOException {
        clearText(TXT_USERNAME);
        clearText(TXT_PASSWORD);
    }

    public void isLoginSuccess() throws IOException {
        isPageTitleEquals(LBL_EXPERT_DECKS_PAGE_TITLE, EXPERT_DECKS_HOME_PAGE_TITLE);
    }

    public void isLandingPageTitleEquals(String pageTitle) throws IOException {
        isPageTitleEquals(LBL_EXPERT_DECKS_PAGE_TITLE, pageTitle);
    }

    public void isLoginFail() throws IOException {
        isElementNameEquals(ALERT_TITLE, LOGIN_ERROR_TITLE);
        isElementNameEquals(ALERT_MESSAGE, LOGIN_ERROR_MESSAGE);
        tap(BTN_ALERT_OK);
        isPageTitleEquals(LBL_LOGIN_PAGE_TITLE, LOGIN_PAGE_TITLE);
    }

    public void navigateToCreateAccount() throws IOException {
        tap(BTN_CREATE_ACCOUNT);
    }

    public void isCreateAccountButtonVisible() throws IOException {
        isElementLabelEquals(BTN_CREATE_ACCOUNT, CREATE_ACCOUNT_BUTTON_LABEL);
    }


}
