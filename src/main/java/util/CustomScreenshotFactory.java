package util;

import com.thoughtworks.gauge.screenshot.ICustomScreenshotGrabber;
import common.Base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


/**
 * Created by Osanda on 5/25/2017.
 */


public class CustomScreenshotFactory implements ICustomScreenshotGrabber {

    Base baseObj = new Base();

    // Return a screenshot byte array
    public byte[] takeScreenshot() {
        return ((TakesScreenshot) baseObj.iosDriver()).getScreenshotAs(OutputType.BYTES);
    }


}
