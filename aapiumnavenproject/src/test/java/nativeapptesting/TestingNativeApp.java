package nativeapptesting;

import java.net.MalformedURLException;
import java.security.PublicKey;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TestingNativeApp extends Capabilities {
	AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	  public void Bt() throws MalformedURLException 
		{
		driver = capabilities();
		}
	
		@Test (enabled = false )
		public void AT () throws InterruptedException {
			
			Thread.sleep(2000);
				driver.findElement(MobileBy.AccessibilityId("Preference")).click();
				Thread.sleep(2000);
				driver.findElement(MobileBy.AccessibilityId("3. Preference dependencies")).click();
				Thread.sleep(2000);		
				driver.findElement(By.id("android:id/checkbox")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@text='WiFi settings']")).click();

				//driver.findElement(By.xpath("//*[@class='android.widget.RelativeLayout']")).click();
				Thread.sleep(2000);
				driver.findElement(By.className("android.widget.EditText")).sendKeys("AVINASH");
				Thread.sleep(2000);
				driver.hideKeyboard();
				Thread.sleep(2000);
				driver.findElements(By.className("android.widget.Button")).get(0).click();
//				driver.navigate().baCK ///=====IS FOR WEB NOT FOR NAYTIVE APP+++===
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
		  }
		@Test 
		public void test2() throws InterruptedException 
		{
			Thread.sleep(2000);
			driver.openNotifications();
			//contest -desc  
			Thread.sleep(2000);
			driver.findElement(MobileBy.AccessibilityId("Battery Saver")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("android.widget.ImageView")).click();
		}
}
