package com.maxsoft.automation.ios.common;

import com.maxsoft.automation.ios.util.driver.DriverSetup;
import com.maxsoft.automation.ios.util.ToastMessage;
import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.testng.Assert;
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


public class CommonStepDef {

    private Base baseObj = new Base();
    private CommonElementsPage commonElementsPage = new CommonElementsPage();

    public static final String ACTIVE = "Active";
    public static final String DEACTIVE = "Deactive";

    @Step("Get device configurations")
    public void platformInfo(){
        Gauge.writeMessage("Targeted platform is: iOS");
        Gauge.writeMessage("Targeted iOS Version: v" + DriverSetup.IOS_VERSION);
        Gauge.writeMessage("Targeted iOS Device: " + DriverSetup.IOS_DEVICE_NAME);
        Gauge.writeMessage("Targeted iOS App Package Name: " + DriverSetup.BUNDLE_ID);
        Gauge.writeMessage("Targeted Appium Host: " + DriverSetup.APPIUM_HOST);
        Gauge.writeMessage("Targeted Appium Port: " + DriverSetup.APPIUM_PORT);
    }

    @Step("Launch the application")
    public void openApp() throws IOException {
        DriverSetup.setupDriver();
    }

    @Step("Toast message is <toastMessage>")
    public void isToastMessageEquals(String toastMessage) throws Exception {
        //Assert.assertTrue(ToastMessage.getToastMessage().contains(toastMessage), "Invalid Toast Message");
        Assert.assertEquals(ToastMessage.getToastMessageContent(), toastMessage, "Invalid toast message!");
    }

    @Step("Wait <seconds> seconds")
    public void wait(int seconds) throws Exception {
       baseObj.wait(seconds);
    }

    @Step("Swipe the device screen horizontally right to left")
    public void swipeHorizontallyRightToLeft() throws InterruptedException {
        baseObj.swipeRightToLeftHorizontally();
    }

    @Step("Swipe the device screen horizontally left to right")
    public void swipeHorizontallyLeftToRight() throws InterruptedException {
        baseObj.swipeLeftToRightHorizontally();
    }

    @Step("Swipe the device screen vertically top to bottom")
    public void swipeVerticallyTopToBottom() throws InterruptedException {
        baseObj.swipeTopToBottomVertically();
    }

    @Step("Swipe the device screen vertically bottom to top")
    public void swipeVerticallyBottomToTop() throws InterruptedException {
        baseObj.swipeBottomToTopVertically();
    }

    @Step("Scroll down to the bottom of the screen")
    public void scrollDownToBottom() throws InterruptedException {
        baseObj.scrollDown();
    }

    @Step("Scroll to the text of <text>")
    public void scrollTo(String text) throws InterruptedException {
        baseObj.scrollByName(text);
    }

    @Step("Check <text> is not visible on the page")
    public void isTextNotVisible(String text) throws InterruptedException {
        baseObj.scrollByNameNotVisible(text);
    }

    @Step("Check <text> is visible on the page")
    public void isTextVisible(String text) throws InterruptedException {
        baseObj.scrollByName(text);
    }

    @Step("Navigate back from the device")
    public void navigateBackFromDevice() throws InterruptedException {
        baseObj.navigateBackFromDevice();
    }

    @Step("WebView contains <text>")
    public void isWebViewTextEquals(String text) throws InterruptedException {
        baseObj.isWebViewTextEquals(text);
    }

    @Step("Page title is <pageTitle>")
    public void isPageTitle(String pageTitle) throws IOException{
        baseObj.isPageTitleEquals(commonElementsPage.getPageTitleElement(pageTitle) , pageTitle);
    }

    @Step("WebView contains <table>")
    public void isWebViewTextEquals(Table table) throws InterruptedException {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        for (TableRow row : rows) {
            baseObj.isWebViewTextEquals(row.getCell(columnNames.get(0)));
        }
    }

    @Step("Tap on <text>")
    public void tapOnVisibleText(String text) throws IOException {
        baseObj.scrollAndTap(text);
    }

    @Step("Press Enter button on the Keyboard")
    public void pressKeyboardEnter() {
        baseObj.tapMobileKeyboardEnter();
    }

    @Step("Hide keyboard")
    public void hideKeyboard() {
        baseObj.hideKeyboard();
    }

    @Step("Show keyboard")
    public void showKeyboard() {
        baseObj.hideKeyboard();
    }

    @Step("Tap on Toogle")
    public void tapToogle() throws IOException {
        commonElementsPage.tapToggle();
    }

    @Step("Toggle is <status> (Active or Deactive)")
    public void isToggleStatus(String status) throws IOException {
        if(commonElementsPage.getToggleActiveStatus() == 0) {
            if (status.toLowerCase().equals(ACTIVE.toLowerCase())) {
                Assert.fail("Toggle is deactivated");
            }
        }
        else if(commonElementsPage.getToggleActiveStatus() == 1) {
            if (status.toLowerCase().equals(DEACTIVE.toLowerCase())) {
                Assert.fail("Toggle is in active status");
            }
        }
        else {
            Assert.fail("Cannot recognize the toggle status");
        }
    }

    @Step("Tap on <buttonName> button")
    public void tapButton(String buttonName) throws IOException {
        commonElementsPage.tapButton(buttonName);
    }

    @Step("Text is <text>")
    public void isTextEquals(String text) throws IOException {
        commonElementsPage.isTextEquals(text);
    }

    @Step("Alert title is <alertTitle>")
    public void isAlertTitleEquals(String alertTitle) throws IOException {
        commonElementsPage.isTextEquals(alertTitle);
    }

    @Step("Alert description is <alertDescription>")
    public void isAlertDescriptionEquals(String alertDescription) throws IOException {
        commonElementsPage.isTextEquals(alertDescription);
    }

    @Step("Tap on Ok button")
    public void tapOkButton() throws IOException {
        commonElementsPage.tapOkButton();
    }

    @Step("Tap on Cancel button")
    public void tapCancelButton() throws IOException {
        commonElementsPage.tapCancelButton();
    }

    @Step("Tap on Save button")
    public void tapSaveButton() throws IOException {
        commonElementsPage.tapSaveButton();
    }

    @Step("Tap on Back button")
    public void tapBackButton() throws IOException {
        commonElementsPage.tapBackButton();
    }

    @Step("Quit from the application")
    public void quit() {
        DriverSetup.tearDown();
    }


}
