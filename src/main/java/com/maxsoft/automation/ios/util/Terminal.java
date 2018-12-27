package com.maxsoft.automation.ios.util;

import com.maxsoft.automation.ios.common.Base;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Project Name : iOS_Mobile_App_Test_Automation
 * Developer    : Osanda Deshan
 * Version      : 1.0.0
 * Date         : 8/30/2018
 * Time         : 9:23 PM
 * Description  :
 **/


public class Terminal {

    private static Base baseObj = new Base();
    private static final String OS_NAME = System.getProperty("os.name");

    public static void executeCommand(String command) throws IOException, InterruptedException {
        final Process process;
        if (OS_NAME.toLowerCase().contains("windows")) {
            process = Runtime.getRuntime().exec("cmd /c " + command);
        } else {
            process = Runtime.getRuntime().exec(command);
        }
        new Thread(new Runnable() {
            public void run() {
                BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line = null;
                try {
                    while ((line = input.readLine()) != null)
                        baseObj.print(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        process.waitFor();
    }


}
