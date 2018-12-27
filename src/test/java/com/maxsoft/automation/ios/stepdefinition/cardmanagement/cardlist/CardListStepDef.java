package com.maxsoft.automation.ios.stepdefinition.cardmanagement.cardlist;

import com.maxsoft.automation.ios.page.cardmanagement.cardlist.CardListPage;
import com.maxsoft.automation.ios.util.driver.DriverSetup;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

/**
 * Project Name : iOS_Mobile_App_Test_Automation
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/28/18
 * Time         : 1:56 PM
 * Description  :
 **/


public class CardListStepDef {

    private CardListPage cardListPage = PageFactory.initElements(DriverSetup.iosDriver, CardListPage.class);

    @Step("Tap on Create Card button")
    public void tapCreateCardButton() throws IOException {
        cardListPage.tapCreateCardButton();
    }

    @Step("Tap on Back button in Card list page")
    public void tapOnBackButton() throws IOException {
        cardListPage.tapOnBackButton();
    }

    @Step("Create card alert title should be visible")
    public void isAlertVisible() throws IOException {
        cardListPage.isAlertVisible();
    }

    @Step("Create card alert title is <alertTitle>")
    public void isAlertTitleEquals(String alertTitle) throws IOException {
        cardListPage.isAlertTitleEquals(alertTitle);
    }

    @Step("Create card alert description is <alertDescription>")
    public void isAlertDescriptionEquals(String alertDescription) throws IOException {
        cardListPage.isAlertDescriptionEquals(alertDescription);
    }

    @Step("Tap on New Card button")
    public void tapNewCardButton() throws IOException {
        cardListPage.tapNewCardButton();
    }

    @Step("Tap on Upload File button")
    public void tapUploadButton() throws IOException {
        cardListPage.tapUploadButton();
    }

    @Step("Tap on Cancel button")
    public void tapCancelButton() throws IOException {
        cardListPage.tapCancelButton();
    }

    @Step("<cardTitle> Card should be visible")
    public void isCardVisible(String cardTitle) throws IOException {
        cardListPage.isCardVisible(cardTitle);
    }

    @Step("<cardTitle> Card should not be visible")
    public void isCardNotVisible(String cardTitle) throws IOException {
        cardListPage.isCardNotVisible(cardTitle);
    }

    @Step("Tap Option button in <cardTitle> card")
    public void tapOptionsButton(String cardTitle) throws IOException {
        cardListPage.tapOptionsButton(cardTitle);
    }

    @Step("Tap on <cardTitle> card")
    public void tapCard(String cardTitle) throws IOException {
        cardListPage.tapCard(cardTitle);
    }


}