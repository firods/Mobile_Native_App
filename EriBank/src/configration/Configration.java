package configration;

import org.apache.commons.io.FileUtils;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import specs.*;

public class Configration {

	public static AndroidDriver AndroidDriver;
	public static void main(String[] args) throws IOException, InterruptedException {
	
		
	//@Parameters
	//("DeviceName")
	//@BeforeTest
	//public void InitialCode(String DeviceName) throws InterruptedException, MalformedURLException
//	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("device", "Android");
		capabilities.setCapability("platformName", "Android");
	    capabilities.setCapability("deviceName","MyDevice");
	    
	    // appium on chrome browser.
	   // capabilities.setCapability("app", "Chrome");
	   // capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
	    
	    capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	    capabilities.setCapability(CapabilityType.HAS_TOUCHSCREEN, "Android");
		capabilities.setCapability(CapabilityType.VERSION, "4.4");
		capabilities.setCapability(CapabilityType.PLATFORM, org.openqa.selenium.Platform.ANDROID);
		capabilities.setCapability("app-package", "com.md.EriBank"); //Replace with your app's package
		capabilities.setCapability("app-activity", "com.md.EriBank.SplashScreenActivity"); //Replace with app's Activity

		AndroidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		Thread.sleep(4000);
		
		
		
		AndroidDriver.findElement(By.id("com.experitest.ExperiBank:id/usernameTextField")).sendKeys("company");
		AndroidDriver.findElement(By.id("com.experitest.ExperiBank:id/passwordTextField")).sendKeys("company");
		AndroidDriver.findElement(By.xpath("//*[@text='Login']")).click();
		AndroidDriver.findElement(By.xpath("//*[@text='Logout']")).click();
		
		Thread.sleep(4000);
	//}
				
		
		
		
		//File scrFile = ((TakesScreenshot)AndroidDriver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scrFile, new File("D:\\Login.png"));
		
		// Appium on chrome browser.
		//AndroidDriver.get("https://accounts.google.com/");
		//Thread.sleep(5000);
		//AndroidElement uname = (AndroidElement) AndroidDriver.findElementByName("Email");
		//uname.sendKeys("Shrikant");

	/*	AndroidElement uname = (AndroidElement) AndroidDriver.findElementByXPath("//*[@text='Username']");
		uname.sendKeys("company");
		
		AndroidElement pwd = (AndroidElement) AndroidDriver.findElementById("com.experitest.ExperiBank:id/passwordTextField");
		pwd.sendKeys("company");
		
		AndroidElement login = (AndroidElement) AndroidDriver.findElementByXPath("//*[@text='Login']");
		login.click();*/
		
		//Thread.sleep(5000);
		
	//	@Test(priority=1)
	//	public void EnterURL1() throws InterruptedException, IOException
	//	{
		  login_validations lv=new login_validations();
		  lv.login_validationsM();
	//	}
	//	@Test(priority=0)
//		public void EnterURL2() throws InterruptedException, IOException
//		{
		  make_payment mp=new make_payment();
		  mp.make_paymentM();
	//	}

	}

}
