package webapptesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {

	public static AndroidDriver<AndroidElement> capabality() throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"oneplus");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,"E:/MOOLYAED/chromedriver_win32/chromedriver.exe");
        cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
        //cap.setCapability(AndroidMobileCapabilityType, cap)
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
	   // driver.get("http://www.google.com");
        return driver;
	}

}
