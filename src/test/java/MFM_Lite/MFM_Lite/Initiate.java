package MFM_Lite.MFM_Lite;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Initiate {

	ExtentReports extent;
	ExtentTest test;
	public static WebDriver browser = BrowserFactory.getBrowser("Browser","url");
	BrowserFactory br = new BrowserFactory();
	Report rpt = new Report();
	WebDriver wb;
		
	
	@BeforeClass
	public void Ini()throws Exception{
		extent = Report.GetExtent();
		
//		System.setProperty("webdriver.gecko.driver", "C:\\CI_CD_CT\\Browser_Executables\\geckodriver.exe");
//		driver = new FirefoxDriver();

		//adding a comment to check INtegration with Jenkins
		
	}
	@SuppressWarnings("static-access")
	@Parameters({"browser","url"})
	@Test
	public void checkHome(String Browser, String Url)throws Exception
	{
		br.getBrowser(Browser, Url);
		//checkSimpleMobile();
		
	}
	
		
		
	
		
	@AfterTest
	public void publishReport()throws Exception
	{
		extent.flush();
		
	}

}
