package webapptesting;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class demowebapptesting extends Capabilities{
	AndroidDriver<AndroidElement> driver;
 
	@BeforeTest
  public void Bt() throws MalformedURLException 
	{
   driver = capabality();
   driver.get("https://www.espncricinfo.com/");
    }
	@Test
	public void AT() throws InterruptedException 
	{    Thread.sleep(5000);
	JavascriptExecutor js=( JavascriptExecutor)driver;
		//driver.findElement(By.className("ci-nav-item ci-nav-text ci-nav-hover ds-cursor-pointer")).click();
	  driver.findElement(By.partialLinkText("Teams")).click();
//		driver.findElement(By.xpath("//*[@id='login']")).sendKeys("AVINASH");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("PASSWORD");
//		driver.findElement(By.xpath("//*[@name='submitAuth']")).click();
//		driver.findElement(By.linkText("Compose")).click();
//		driver.findElement(By.xpath("//*[@class='select2-search__field']")).click();
//		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("kavithauma1792@gmail.com");
//		Thread.sleep(3000);
//		
////		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);
////		driver.findElement(By.xpath("//*[@name='title']")).sendKeys("hooooman");
////		Thread.sleep(3000);
////		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).click();
////		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys(Keys.ENTER);
////		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys("hii");
////		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).click();
////		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys(Keys.ENTER);
////		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys("hiheloo ");
////		//driver.findElement(By.xpath("//*[@dir='ltr ']")).click();
////		//driver.findElement(By.xpath("//*[@dir='ltr ']")).sendKeys("avinash.baradabadi@moolyaed.com");
////		//driver.findElement(By.xpath("//*[@class='section-social-network ']")).sendKeys("avinash.baradabadi@moolyaed.com");
////		//driver.findElement(By.xpath("//*[@class=' btn btn-primary ']")).click();
////		driver.findElement(By.xpath("//*[@name='compose']")).click();
////		driver.findElement(By.linkText("My courses")).click();
////		//driver.findElement(By.xpath("//*[@class='section-mycourses']")).click();
////		driver.findElement(By.linkText("Course catalog")).click();
////		//driver.findElement(By.xpath("//*[@class='dropdown-toggle']")).click();
////		//WebElement dd1=driver.findElement(By.name("AVINASH B"));
////		// Select sele1=new Select(dd1);
////		 //List<WebElement> values=sele1.getOptions();
////		 //sele1.selectByIndex(1);
////		 //sele1.selectByVisibleText("Profile");
////		
////		
////		//driver.findElement(By.linkText(" ")).click();
////		//driver.close();
////		//driver.findElement(By.linkText("My courses")).click();
////		
////		//driver.findElement(By.linkText("Logout")).click();
//		
	}
}
