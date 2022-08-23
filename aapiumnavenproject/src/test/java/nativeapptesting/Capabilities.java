package nativeapptesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {

	public static AndroidDriver<AndroidElement> capabilities()  throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"oneplus");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
//IF I WANT TO OPENA NATIVE APP THEN I HACVE TO USE APPPACKAGE AND APP ACTIVITY
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"io.appium.android.apis.ApiDemos");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.APPIUM);

	    AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
	    return driver;
	}

}
