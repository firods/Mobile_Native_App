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

public class makepayment_page {

public	static AndroidElement Phone,Name,Amount,Country,Send_Payment,Select,India,Yes;

	public static AndroidElement getPhoneField()
	{
		 Phone=(AndroidElement)Configration.AndroidDriver.findElementByXPath("//*[@text='Phone']");
		 return Phone;
	}
	public static AndroidElement getNameField()
	{
		 Name=(AndroidElement)Configration.AndroidDriver.findElementByXPath("//*[@text='Name']");
		 return Name;
	}
	public static AndroidElement getAmountField()
	{
		 Amount=(AndroidElement)Configration.AndroidDriver.findElementByXPath("//*[@text='Amount']");
		 return Amount;
	}
	public static AndroidElement getCountryField()
	{
		 Country=(AndroidElement)Configration.AndroidDriver.findElementByXPath("//*[@text='Country']");
		 return Country;
	}
	public static AndroidElement getSend_PaymentField()
	{
		 Send_Payment=(AndroidElement)Configration.AndroidDriver.findElementByXPath("//*[@text='Send Payment']");
		 return Send_Payment;
	}
	public static AndroidElement getSelectField()
	{
		 Select=(AndroidElement)Configration.AndroidDriver.findElementByXPath("//*[@text='Select']");
		 return Select;
	}
	public static AndroidElement getIndiaField()
	{
	     India=(AndroidElement)Configration.AndroidDriver.findElementByXPath("//*[@text='India']");
		 return India;
	}
	public static AndroidElement getYesField()
	{
	     Yes=(AndroidElement)Configration.AndroidDriver.findElementByXPath("//*[@text='Yes']");
		 return Yes;
	}
}
