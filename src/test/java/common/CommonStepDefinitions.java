package common;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.testng.Assert;
import util.DriverSetup;
import util.ToastMessage;
import java.io.IOException;
import java.util.List;


/**
 * Created by Osanda on 4/29/2017.
 */


public class CommonStepDefinitions {

    private Base baseObj = new Base();

    @Step("Testing platform information")
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

    @Step("Verify that the toast message is <toastMessage>")
    public void verifyToastMessage(String toastMessage) throws Exception {
        //Assert.assertTrue(ToastMessage.getToastMessage().contains(toastMessage), "Invalid Toast Message");
        Assert.assertEquals(ToastMessage.getToastMessageContent(), toastMessage, "Invalid toast message!");
    }

    @Step("Wait <seconds> seconds")
    public void wait(int seconds) throws Exception {
       Thread.sleep(seconds*1000);
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
        baseObj.scrollTo(text);
    }

    @Step("Navigate back from the device")
    public void navigateBackFromDevice() throws InterruptedException {
        baseObj.navigateBackFromDevice();
    }

    @Step("Verify the webview contains <text>")
    public void isWebViewTextEquals(String text) throws InterruptedException {
        baseObj.isWebViewTextEquals(text);
    }

    @Step("Verify the webview contains the following text <table>")
    public void isWebViewTextEquals(Table table) throws InterruptedException {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        for (TableRow row : rows) {
            baseObj.isWebViewTextEquals(row.getCell(columnNames.get(0)));
        }
    }

    @Step("Tap on <text>")
    public void tapOnVisibleText(String text){
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

    @Step("Quit from the application")
    public void quit() {
        DriverSetup.tearDown();
    }


}
