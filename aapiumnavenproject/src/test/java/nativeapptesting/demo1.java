package nativeapptesting;

import java.net.MalformedURLException;
import java.sql.Driver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class demo1 extends Capabilities {
	AndroidDriver<AndroidElement>driver;
	
	@BeforeTest
	public void BT() throws MalformedURLException {
		driver = capabilities();
	}
@Test
public void tc1() throws InterruptedException {

	//when everr i want to work or read a string Name ="sunil"
	//here we use \ boxc it reads "" aslso as value so to make it defeentatirte we use \
	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	Thread.sleep(2000);
//==================================to scrool==============================================================
	//js script executor isd only for web application not for native
	//uiscroable is a andriod  method if i want to,use scroallintovoiew i need to use a selector that is "text" here  
//	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();
	Thread.sleep(2000);
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();
	Thread.sleep(2000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Auto Complete\"))").click();
}
}
