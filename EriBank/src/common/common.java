package common;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import configration.Configration;

public class common {
	public static int HeaderCnt=0;
	public static String Report="C:\\Users\\sfirodiya\\workspace\\EriBank\\report\\EriBank.html";
	public static String Login="C:\\Users\\sfirodiya\\workspace\\EriBank\\screenshot\\Login.png";
	public static String MakePayment="C:\\Users\\sfirodiya\\workspace\\EriBank\\screenshot\\MakePayment.png";
	public static String login_data="C:\\Users\\sfirodiya\\workspace\\EriBank\\src\\data\\login_validations.dat";
	public static String payment_data="C:\\Users\\sfirodiya\\workspace\\EriBank\\src\\data\\make_payment.dat";
	
	public static void CheckPoints(String FilePath) throws IOException
	{
		// Find all classes.
		List<WebElement> button=Configration.AndroidDriver.findElements(By.className("android.widget.Button"));
		
		//String button111=Configration.AndroidDriver.findElement(By.className("android.widget.Button")).getText();
		
		List<WebElement> editText=Configration.AndroidDriver.findElements(By.className("android.widget.EditText"));
		List<WebElement> textView=Configration.AndroidDriver.findElements(By.className("android.widget.TextView"));
		List<WebElement> frameLayout=Configration.AndroidDriver.findElements(By.className("android.widget.FrameLayout"));
		List<WebElement> view=Configration.AndroidDriver.findElements(By.className("android.view.View"));
		
        // iterate over all classes.
		Iterator<WebElement> button_itr = button.iterator();
		Iterator<WebElement> editText_itr = editText.iterator();
		Iterator<WebElement> textView_itr = textView.iterator();
		Iterator<WebElement> frameLayout_itr = frameLayout.iterator();
		Iterator<WebElement> view_itr = view.iterator();
		
		File file = new File(FilePath);

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}
		else
		{
			file.delete();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		//button
		while(button_itr.hasNext())
		{
			bw.write(button_itr.next().getText());
		}
		
		//edit text
		while(editText_itr.hasNext())
		{
			bw.write(editText_itr.next().getText());
		}
		
		//text view
		while(textView_itr.hasNext())
		{
			bw.write(textView_itr.next().getText());
		}
		
		// frame layout
		while(frameLayout_itr.hasNext())
		{
			bw.write(frameLayout_itr.next().getText());
		}
		
		while(view_itr.hasNext())
		{
			bw.write(view_itr.next().getText());
		}
		bw.close();
	}

	public static String[] ReadFile(String File) throws IOException
	{
		FileReader file = new FileReader(new File(File));
		BufferedReader br = new BufferedReader(file);
		
		String data=br.readLine();
		String[] a=data.split(",");
		
		return a;
	}
	
	public static AndroidDriver TakeScreenShot(AndroidDriver driver,String Path) throws IOException
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(Path));
		return driver;
	}
	
	public static void WriteResult(String TCID,String Desc,String Status,String ScreenShot) throws IOException
    {
		File file = new File(Report);

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);
		
        
		bw.write("<table width='415' border='1'>");
            
            if(HeaderCnt==0)
            {
            	bw.write("<style type='text/css'>");
            	bw.write("<!--");
            	bw.write(".style1 {");
            	bw.write("font-size: x-large;");
            	bw.write("font-weight: bold;}");
            	bw.write("-->");
            	bw.write("</style>");
            	bw.write("<div align='center'><strong><font size='6'>Automation Test Result</font> </strong></div>");
            	bw.write("<p>&nbsp;</p>");
            	bw.write("<tr>");
           
            	bw.write("<td width='72'><strong>TCID</strong></td>");     
            	bw.write("<td width='232'><strong>Description</strong></td>");
            	bw.write("<td width='89'><strong>Status</strong></td>");
            	bw.write("<td width='89'><strong>ScreenShot</strong></td>");
            	bw.write("</tr>");
                HeaderCnt++;
            }

            bw.write("<tr>");
            bw.write("<td>" + TCID + "</td>");
            bw.write("<td>" + Desc + "</td>");

            bw.write("<td>");

            if (Status == "Pass")
            {
            	bw.write("<font color='Green'>Pass</font>");
            }
            else
            {
            	bw.write("<font color='Red'>Fail</font>");
            }
            bw.write("</td>");
            bw.write("<td><a href="+ScreenShot+">"+Desc+"</a></td>");
            bw.write("</tr>");

            bw.write("</table>");
            bw.close();
        }

}
