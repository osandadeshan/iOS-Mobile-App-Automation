package com.maxsoft.automation.ios.stepdefinition.usermanagement;

import com.maxsoft.automation.ios.page.usermanagement.LoginPage;
import com.maxsoft.automation.ios.util.driver.DriverSetup;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import java.util.List;

/**
 * Project Name : iOS_Mobile_App_Test_Automation
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 5/14/17
 * Time         : 12:50 PM
 * Description  :
 **/


public class LoginStepDef {

    private LoginPage loginPage = PageFactory.initElements(DriverSetup.iosDriver, LoginPage.class);

    @Step("Login page title is <pageTitle>")
    public void isLoginPageTitleEquals(String pageTitle) throws IOException {
        loginPage.isLoginPageTitleEquals(pageTitle);
    }

    @Step("Set the username and the password <table>")
    public void login(Table table) throws IOException {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        for (TableRow row : rows) {
            loginPage.login(row.getCell(columnNames.get(0)), row.getCell(columnNames.get(1)));
        }
    }

    @Step("Tap on Sign In button")
    public void tapSignInButton() throws IOException {
        loginPage.tapSignInButton();
    }

    @Step("Clear text fields in Login page")
    public void clearTextFields() throws IOException {
        loginPage.clearTextFields();
    }

    @Step("Create Account button should be visible")
    public void isCreateAccountButtonVisible() throws IOException {
        loginPage.isCreateAccountButtonVisible();
    }

    @Step("On Create Account Page")
    public void navigateToCreateAccount() throws IOException {
        loginPage.navigateToCreateAccount();
    }

    @Step("Login error alert title is <loginErrorAlertTitle>")
    public void isLoginErrorAlertTitleEquals(String loginErrorAlertTitle) throws IOException {
        loginPage.isLoginErrorAlertTitleEquals(loginErrorAlertTitle);
    }

    @Step("Login error alert message is <loginErrorAlertMessage>")
    public void isLoginErrorAlertMessageEquals(String loginErrorAlertMessage) throws IOException {
        loginPage.isLoginErrorAlertMessageEquals(loginErrorAlertMessage);
    }

    @Step("Tap on Ok button in the login error alert")
    public void tapLoginErrorAlertOkButton() throws IOException {
        loginPage.tapLoginErrorAlertOkButton();
    }

    @Step("User lands to the <pageTitle> page")
    public void isLandingPageTitleEquals(String pageTitle) throws IOException {
        loginPage.isLandingPageTitleEquals(pageTitle);
    }


}
