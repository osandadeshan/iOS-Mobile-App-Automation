package com.maxsoft.automation.ios.common;

import com.maxsoft.automation.ios.util.Terminal;
import com.thoughtworks.gauge.Step;
import java.io.IOException;

/**
 * Project Name : iOS_Mobile_App_Test_Automation
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/30/2018
 * Time         : 9:26 PM
 * Description  :
 **/


public class TerminalStepDef {

    @Step("Execute command <command>")
    public void executeCommand(String command) throws IOException, InterruptedException {
        Terminal.executeCommand(command);
    }


}
