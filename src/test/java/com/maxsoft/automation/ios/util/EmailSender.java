package com.maxsoft.automation.ios.util;

import com.maxsoft.emailclient.Email;
import com.maxsoft.emailclient.JsonReportReader;

/**
 * Project Name : iOS_Mobile_App_Test_Automation
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/30/2018
 * Time         : 5:16 PM
 * Description  :
 **/


public class EmailSender {

    public static void main(String[] args) {
        Email.send(JsonReportReader.getExecutionResults());
    }


}
