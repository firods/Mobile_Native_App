package pages;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import configration.Configration;

public class login_validations_page {

public	static AndroidElement UserName,Password,Login;	

	public static AndroidElement getUnameField()
	{
		 UserName=(AndroidElement)Configration.AndroidDriver.findElementByXPath("//*[@text='Username']");
		 return UserName;
	}
	public static AndroidElement getPasswordField()
	{
		 Password=(AndroidElement)Configration.AndroidDriver.findElementById("com.experitest.ExperiBank:id/passwordTextField");
		 return Password;
	}
	public static AndroidElement getLoginField()
	{
		 Login=(AndroidElement)Configration.AndroidDriver.findElementByXPath("//*[@text='Login']");
		 return Login;
	}
	public static void Login(String uname,String Password)
	{
		 getUnameField().sendKeys(uname);
		 getPasswordField().sendKeys(Password);
		 getLoginField().click();
	}	
}
