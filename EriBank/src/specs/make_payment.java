package specs;
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

import pages.home_page;
import pages.login_validations_page;
import pages.makepayment_page;

import common.common;
import configration.Configration;

public class make_payment {
	
	public static void make_paymentM() throws IOException, InterruptedException
	{
		Thread.sleep(1000);
		String[] login_data=common.ReadFile(common.login_data);
		login_validations_page.Login(login_data[0],login_data[1]);
		
		common.TakeScreenShot(Configration.AndroidDriver,common.Login);
		common.WriteResult("H001","Login", "Pass",common.Login);
		
		home_page.getMakePaymentField().click();
		String[] payment_data=common.ReadFile(common.payment_data);
		
		//common.CheckPoints(Configration.AndroidDriver,"C:\\Users\\sfirodiya\\workspace\\EriBank\\src\\make_payment.txt");
		
		makepayment_page.getPhoneField().sendKeys(payment_data[0]);
		makepayment_page.getNameField().sendKeys(payment_data[1]);
		makepayment_page.getAmountField().sendKeys(payment_data[2]);
		//makepayment_page.getCountryField().sendKeys(payment_data[3]);
		makepayment_page.getSelectField().click();
		makepayment_page.getIndiaField().click();
		
		common.TakeScreenShot(Configration.AndroidDriver,common.MakePayment);
		common.WriteResult("H001","Make Payment", "Pass",common.MakePayment);
		common.CheckPoints("C:\\Users\\sfirodiya\\workspace\\EriBank\\checkpoints\\makepayment_page.txt");
		
		makepayment_page.getSend_PaymentField().click();
		makepayment_page.getYesField().click();
		home_page.getLogoutField().click();
	}

}
