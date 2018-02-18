package com.pearson.smartflashcards.ios.util;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import com.thoughtworks.gauge.Gauge;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.io.IOException;
import java.net.URL;


/**
 * Created by Osanda on 4/26/2017.
 */


public class DriverSetup {

    public static final String APPIUM_HOST = System.getenv("appium_host");
    public static final String APPIUM_PORT = System.getenv("appium_port");
    public static final String APPIUM_VERSION = System.getenv("appium_version");
    public static final String AUTOMATION_NAME = System.getenv("automation_name");
    public static final String PLATFORM = System.getenv("testing_platform");
    public static final String PROJECT_ROOT = System.getProperty("user.dir");
    private static final String APP_NAME = System.getenv("app_name");
    public static final String SAUCE_LABS_USERNAME = System.getenv("sauce_labs_username");
    public static final String SAUCE_LABS_ACCESS_KEY = System.getenv("sauce_labs_access_key");
    private static final String SAUCE_LABS_HOST = System.getenv("sauce_labs_host");
    private static final String SAUCE_LABS_CONNECTION_STRING = "http://" + SAUCE_LABS_USERNAME + ":" + SAUCE_LABS_ACCESS_KEY + "@" + SAUCE_LABS_HOST;
    private static final String APP_HOSTED_URL = System.getenv("app_hosted_url");
    public static final String APPIUM_SERVER_URL = "http://" + APPIUM_HOST + ":" + APPIUM_PORT + "/wd/hub";

    // iOS properties
    public static IOSDriver iosDriver;
    public static final String IOS = "iOS";
    public static final String BUNDLE_ID = System.getenv("bundle_id");
    public static final String IOS_APP_PATH = System.getenv("ios_app_path");
    public static final String IOS_VERSION = System.getenv("ios_version");
    public static final String IOS_DEVICE_NAME = System.getenv("ios_device_name");

    @BeforeSuite
    public static void setupDriver() throws IOException {
        prepareIOSForAppium();
    }

    public static IOSDriver prepareIOSForAppium() throws IOException {
        // Set APP file path
        File app = new File(PROJECT_ROOT + IOS_APP_PATH);
        System.out.println("Installing APP file from the path " + PROJECT_ROOT + IOS_APP_PATH);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        // Mandatory capabilities
        capabilities.setCapability("deviceName", IOS_DEVICE_NAME);
        capabilities.setCapability("platformName", IOS);
        // Install IPA file from the above path
        try {
            capabilities.setCapability("app", app.getAbsolutePath());
            System.out.println("Successfully installed " + APP_NAME + " in the device!");
        } catch (Exception ex) {
            System.out.println("Installing " + APP_NAME + " failed!\n" + ex.getMessage());
        }
        // Set iOS version desired capability. Set your mobile device's OS version.
        capabilities.setCapability(CapabilityType.VERSION, IOS_VERSION);
        capabilities.setCapability("appiumversion", APPIUM_VERSION);
        capabilities.setCapability("showXcodeLog", true);
        capabilities.setCapability("noReset", true);
        // Set iOS appPackage desired capability.
        // capabilities.setCapability("appPackage", IOS_APP_PACKAGE);
        // Other caps
        capabilities.setCapability("automationName", AUTOMATION_NAME);
        iosDriver =  new IOSDriver(new URL(APPIUM_SERVER_URL), capabilities);
        return iosDriver;
    }

    @AfterSuite
    public static void tearDown() {
        Boolean hasQuit;
            iosDriver.quit();
                hasQuit = iosDriver.toString().contains("(null)");
                if (hasQuit == Boolean.TRUE){
                    System.out.println("iOS Driver has stopped successfully!");
                    Gauge.writeMessage("iOS Driver has stopped successfully!");
                }
                else {
                    System.out.println(hasQuit);
                    System.out.println("An error occurred while stopping the iOS Driver!");
                    Gauge.writeMessage("An error occurred while stopping the iOS Driver!");
                }
    }


}
