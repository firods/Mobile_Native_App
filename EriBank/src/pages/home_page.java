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

public class home_page {

public	static AndroidElement MakePayment,Logout;	

	public static AndroidElement getMakePaymentField()
	{
		 MakePayment=(AndroidElement)Configration.AndroidDriver.findElementByXPath("//*[@text='Make Payment']");
		 return MakePayment;
	}
	public static AndroidElement getLogoutField()
	{
		 Logout=(AndroidElement)Configration.AndroidDriver.findElementByXPath("//*[@text='Logout']");
		 return Logout;
	}
	
}
