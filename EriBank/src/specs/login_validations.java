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
import common.common;
import configration.Configration;

public class login_validations {
	
	public static void login_validationsM() throws IOException, InterruptedException
	{
		Thread.sleep(1000);
	   //HashMap hm=new HashMap();
	   String[] data=common.ReadFile("C:\\Users\\sfirodiya\\workspace\\EriBank\\src\\data\\login_validations.dat");
	
		//hm.put("Uname",data[0]);
		//hm.put("Password",data[1]);
		
		login_validations_page.getUnameField().sendKeys(data[0]);
		login_validations_page.getPasswordField().sendKeys(data[1]);
		data=null;
		
		common.CheckPoints("C:\\Users\\sfirodiya\\workspace\\EriBank\\checkpoints\\login_page.txt");
		login_validations_page.getLoginField().click();
		
		Thread.sleep(1000);
		common.CheckPoints("C:\\Users\\sfirodiya\\workspace\\EriBank\\checkpoints\\home_page.txt");
		
		home_page.getLogoutField().click();
		Thread.sleep(1000);
	}

}
