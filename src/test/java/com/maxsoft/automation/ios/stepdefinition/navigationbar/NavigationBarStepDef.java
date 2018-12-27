package com.maxsoft.automation.ios.stepdefinition.navigationbar;

import com.maxsoft.automation.ios.page.navigationbar.NavigationBarPage;
import com.maxsoft.automation.ios.util.driver.DriverSetup;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

/**
 * Project Name : iOS_Mobile_App_Test_Automation
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 5/14/17
 * Time         : 12:50 PM
 * Description  :
 **/


public class NavigationBarStepDef {

    private NavigationBarPage navigationBarPage = PageFactory.initElements(DriverSetup.iosDriver, NavigationBarPage.class);

    @Step("On Expert Decks page")
    public void navigateToExpertDeckPage() throws IOException {
        navigationBarPage.navigateToExpertDeckPage();
    }

    @Step("On My Decks page")
    public void navigateToMyDeckPage() throws IOException {
        navigationBarPage.navigateToMyDeckPage();
    }

    @Step("On Browse page")
    public void navigateToBrowsePage() throws IOException {
        navigationBarPage.navigateToBrowsePage();
    }

    @Step("On Archived page")
    public void navigateToArchivedPage() throws IOException {
        navigationBarPage.navigateToArchivedPage();
    }

    @Step("On Settings page")
    public void navigateToSettingsPage() throws IOException {
        navigationBarPage.navigateToSettingsPage();
    }


}
