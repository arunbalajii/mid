package MFM_Lite.MFM_Lite;

import java.util.Scanner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import MFM_Lite.MFM_Lite.CommonUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class MFM_Lite {
	
	ExtentReports extent;
	ExtentTest test;
	Report rpt = new Report();
	
		
	@BeforeTest
	public void getDDBData()throws Exception
	{	
		extent = Report.GetExtent();
		
	}
	
	
	@SuppressWarnings("static-access")
	@Parameters({"browser","url"})
	@Test
	public void chkGoSmart_Pin(String browser,String url)throws Exception
	{	
		Scanner input = new Scanner(System.in);
		Db_Conn db = new Db_Conn();
		db.setUp("MFM_Lite");
		String SIM = db.getSim();
		String ESN = db.getEsn();
		String Pin1 = db.getPin();
		CommonUtils email = new CommonUtils();
		String UserEmail = email.getRandomChar()+"@test.com";
		String Security_Pin = "1234";
		String zip = "33179";
		String Password = "tracfone";
		String cnfmPwd = "tracfone";
		String DOB = "07/05/1991";
		String PIN = "1234";
		
		BrowserFactory br = new BrowserFactory();
		br.getBrowser(browser, url);
		Browser br1 = new Browser();
	    br1.go(url);
	    Thread.sleep(10000);
	    
	    
	    
	    //click on activate button
//	    br1.sendKeys("id=j_username", "admin@aol.com");
	    if(br1.findTheElement("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/ng-include/div/div/div/div/div[2]/div/div[1]/a").isDisplayed())
		 {
	         rpt.createTest("MFM_Lite-Field Validation", "Enter UserName for MFM_Lite - For Field Validation");
	         rpt.Pass("Activate Button for MFM_Lite - For Field Validation");
	         rpt.Category("MFM_Lite_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	
	         rpt.chkBugs(CommonUtils.getUserName());
	         //rpt.chkdebug("CC_GoSmart_Validation Fields");
	         br1.click("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/ng-include/div/div/div/div/div[2]/div/div[1]/a");
		 }
		 else
		 {
			 rpt.createTest("MFM_Lite-Field Validation", "Enter UserName for MFM_Lite  - For Field Validation");
	         rpt.Fail("Activate Button for MFM_Lite - For Field Validation");
	         rpt.Category("MFM_Lite_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
	         //rpt.chkdebug("Total Wireless_Validation Fields");
	  
		 }
	    
	    //click on COntinue Button
	    if(br1.findTheElement("xpath=.//*[@id='btn_continuetracfonephone']").isDisplayed())
		 {
	         rpt.createTest("MFM_Lite-Field Validation", "Enter UserName for MFM_Lite - For Field Validation");
	         rpt.Pass("Continue Button for MFM_Lite - For Field Validation");
	         rpt.Category("MFM_Lite_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	
	         rpt.chkBugs(CommonUtils.getUserName());
	         //rpt.chkdebug("CC_GoSmart_Validation Fields");
	         br1.click("xpath=.//*[@id='btn_continuetracfonephone']");
		 }
		 else
		 {
			 rpt.createTest("MFM_Lite-Field Validation", "Enter UserName for MFM_Lite  - For Field Validation");
	         rpt.Fail("Continue Button for MFM_Lite - For Field Validation");
	         rpt.Category("MFM_Lite_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
	         //rpt.chkdebug("Total Wireless_Validation Fields");
	  
		 }
	  //Enter SIM Number
	    Thread.sleep(5000);
	    if(br1.findTheElement("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div[3]/form/div/div[2]/div[2]/div/div[2]").isDisplayed())
		 {
	         rpt.createTest("MFM_Lite-Field Validation", "Enter SIM Number for MFM_Lite - For Field Validation");
	         rpt.Pass("SIM Number for MFM_Lite - For Field Validation");
	         rpt.Category("MFM_Lite_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	
	         rpt.chkBugs(CommonUtils.getUserName());
	         //rpt.chkdebug("CC_GoSmart_Validation Fields");
	         br1.click("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div[3]/form/div/div[2]/div[2]/div/div[2]/tf-textbox/div/div[1]/input");
	         br1.sendKeys("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div[3]/form/div/div[2]/div[2]/div/div[2]/tf-textbox/div/div[1]/input", SIM);
		 }
		 else
		 {
			 rpt.createTest("MFM_Lite-Field Validation", "Enter SIM Number for MFM_Lite  - For Field Validation");
	         rpt.Fail("SIM Number for MFM_Lite - For Field Validation");
	         rpt.Category("MFM_Lite_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
	         //rpt.chkdebug("Total Wireless_Validation Fields");
	  
		 }
	    
	  //Click check box
	    if(br1.findTheElement("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div[3]/form/div/div[2]/div[3]/div/div[2]/div").isDisplayed())
		 {
	         rpt.createTest("MFM_Lite-Field Validation", "Click COnfirmation check box for MFM_Lite - For Field Validation");
	         rpt.Pass("Click COnfirmation check box for MFM_Lite - For Field Validation");
	         rpt.Category("MFM_Lite_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	
	         rpt.chkBugs(CommonUtils.getUserName());
	         //rpt.chkdebug("CC_GoSmart_Validation Fields");
	         br1.click("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div[3]/form/div/div[2]/div[3]/div/div[2]/div");
	        
		 }
		 else
		 {
			 rpt.createTest("MFM_Lite-Field Validation", "Click COnfirmation check box for MFM_Lite  - For Field Validation");
	         rpt.Fail("Click COnfirmation check box for MFM_Lite - For Field Validation");
	         rpt.Category("MFM_Lite_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
	         //rpt.chkdebug("Total Wireless_Validation Fields");
	  
		 }
	    //click on Continue Button
	    if(br1.findTheElement("xpath=.//*[@id='btn_imeicontinue']").isDisplayed())
		 {
	         rpt.createTest("MY Family Mobile - Field Validation", "Display Continue Button - For Field Validation");
	         rpt.Pass("Continue Button displayed - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("CC_My Family Mobile_Validation Fields");
	         br1.click("xpath=.//*[@id='btn_imeicontinue']");//clicking on continue button after entering SIM number
		 }
		 else
		 {
	         rpt.createTest("MY Family Mobile", "Display Continue Button - For Field Validation");
	         rpt.Fail("Continue Button not displayed - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);         
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("MY Family Mobile_Validation Fields");
	  
		 }	
	    

	  	   Thread.sleep(8000);
	  	   
	  	   
	  	 if(br1.findTheElement("xpath=html/body/div[1]/div/div/modal-popup/div[2]/div[2]/form/div[1]/tf-textbox/div/div/input").isDisplayed())
		 {
	         rpt.createTest("MY Family Mobile - Field Validation", "Display PIN code textbox - For Field Validation");
	         rpt.Pass("PIN code textbox displayed - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("CC_My Family Mobile_Validation Fields");
	         br1.click("xpath=html/body/div[1]/div/div/modal-popup/div[2]/div[2]/form/div[1]/tf-textbox/div/div/input");
		 }
		 else
		 {
	         rpt.createTest("MY Family Mobile", "Display PIN code textbox - For Field Validation");
	         rpt.Fail("PIN code textbox not displayed - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	         
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("MY Family Mobile_Validation Fields");	  
		 }	        
	  	   
	  	   
	  	   
	  	 if(br1.findTheElement("xpath=html/body/div[1]/div/div/modal-popup/div[2]/div[2]/form/div[1]/tf-textbox/div/div/input").isDisplayed())
		 {
	  		 br1.sendKeys("xpath=html/body/div[1]/div/div/modal-popup/div[2]/div[2]/form/div[1]/tf-textbox/div/div/input", PIN);
	         rpt.createTest("MY Family Mobile - Field Validation", "Enter PIN code - For Field Validation");
	         rpt.Pass("PIN code Entered - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         //String path = rpt.CaptureScreen(wb, "ValidMessage");
	         //rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("CC_My Family Mobile_Validation Fields");
		 }
		 else
		 {
	         rpt.createTest("MY Family Mobile", "Enter PIN code - For Field Validation");
	         rpt.Fail("PIN code not entered - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	         
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("MY Family Mobile_Validation Fields");	  
		 }	
	  	 //click on continue button after entering PIN
	  	if(br1.findTheElement("xpath=html/body/div[1]/div/div/modal-popup/div[2]/div[2]/form/div[2]/wfm-button-primary/span[1]/button").isDisplayed())
		 {
	         rpt.createTest("MY Family Mobile - Field Validation", "Display Continue Button - For Field Validation");
	         rpt.Pass("Continue Button displayed - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("CC_My Family Mobile_Validation Fields");
	         br1.click("xpath=html/body/div[1]/div/div/modal-popup/div[2]/div[2]/form/div[2]/wfm-button-primary/span[1]/button");
		 }
		 else
		 {
	         rpt.createTest("MY Family Mobile", "Display Continue Button - For Field Validation");
	         rpt.Fail("Continue Button not displayed - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	         
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("MY Family Mobile_Validation Fields");	  
		 }	        
	  	   
	  	//Enter ZIp code for New Mobile Phone and click continue
	  	Thread.sleep(10000);
	  	   //Enter Zip code to get new phone number
	  	   
	  	 if(br1.findTheElement("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div[3]/tf-split-vertical-or/div/div[3]/div/tf-split-vertical-or-right/form/tf-icon-widget/div/div[1]/div/div/div[5]/tf-textbox/div/div/input").isDisplayed())
		 {
	  		br1.sendKeys("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div[3]/tf-split-vertical-or/div/div[3]/div/tf-split-vertical-or-right/form/tf-icon-widget/div/div[1]/div/div/div[5]/tf-textbox/div/div/input", zip);
	         rpt.createTest("MY Family Mobile - Field Validation", "Enter Zip code to get new phone number - For Field Validation");
	         rpt.Pass("Zip code to get new phone number entered- For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("CC_My Family Mobile_Validation Fields");
		 }
		 else
		 {
	         rpt.createTest("MY Family Mobile", "Enter Zip code to get new phone number - For Field Validation");
	         rpt.Fail("Zip code to get new phone number not entered - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	         
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("MY Family Mobile_Validation Fields");	  
		 }	        
	  	   
	  	   
	  	 if(br1.findTheElement("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div[3]/tf-split-vertical-or/div/div[3]/div/tf-split-vertical-or-right/form/tf-icon-widget/div/div[2]/div/div[2]/tf-button-primary/span[1]/button").isDisplayed())
		 {
	         rpt.createTest("MY Family Mobile - Field Validation", "Display Continue button - For Field Validation");
	         rpt.Pass("Continue button displayed- For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("CC_My Family Mobile_Validation Fields");
	         br1.click("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div[3]/tf-split-vertical-or/div/div[3]/div/tf-split-vertical-or-right/form/tf-icon-widget/div/div[2]/div/div[2]/tf-button-primary/span[1]/button");
		 }
		 else
		 {
	         rpt.createTest("MY Family Mobile", "Display Continue button - For Field Validation");
	         rpt.Fail("Continue button not displayed - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);         
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("MY Family Mobile_Validation Fields");	  
		 }	 
	  	
	    //Enter PIN and Continue
	  	Thread.sleep(10000);
	  	   //Enter PIN and continue
	  	   
	  	 if(br1.findTheElement("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/tf-split-vertical-or/div/div/div/tf-split-vertical-or-left/form/tf-icon-widget/div/div[1]/div/div/div[5]/tf-textbox/div/div[1]/input").isDisplayed())
		 {
	  		 br1.sendKeys("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/tf-split-vertical-or/div/div/div/tf-split-vertical-or-left/form/tf-icon-widget/div/div[1]/div/div/div[5]/tf-textbox/div/div[1]/input", Pin1);
	         rpt.createTest("MY Family Mobile - Field Validation", "Enter PIN - For Field Validation");
	         rpt.Pass("PIN entered- For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("CC_My Family Mobile_Validation Fields");
		 }
		 else
		 {
	         rpt.createTest("MY Family Mobile", "Enter PIN - For Field Validation");
	         rpt.Fail("PIN not entered - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	         
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("MY Family Mobile_Validation Fields");	  
		 }	        
	  	   
	  	 
	  	 
	  	 
	  	 
	  	 
	  	 
	  	 
	  	 
	  	 //continue 
	  	 
	  	   
	  	 if(br1.findTheElement("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/tf-split-vertical-or/div/div/div/tf-split-vertical-or-left/form/tf-icon-widget/div/div[2]/div/div[2]/tf-button-primary/span[1]/button").isDisplayed())
		 {
	         rpt.createTest("MY Family Mobile - Field Validation", "Display Continue Button - For Field Validation");
	         rpt.Pass("Continue Button displayed- For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("CC_My Family Mobile_Validation Fields");
	         br1.click("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/tf-split-vertical-or/div/div/div/tf-split-vertical-or-left/form/tf-icon-widget/div/div[2]/div/div[2]/tf-button-primary/span[1]/button");
		 }
		 else
		 {
	         rpt.createTest("MY Family Mobile", "Display Continue Button - For Field Validation");
	         rpt.Fail("Continue Button not displayed - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	         
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("MY Family Mobile_Validation Fields");	  
		 }	
	  	 
	  	 
	  	 //create acc html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/tf-icon-widget/div/div[2]/div/div[2]/tf-button-primary/span[2]/button
	   
	  	 if(br1.findTheElement("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/tf-icon-widget/div/div[2]/div/div[2]/tf-button-primary/span[2]/button").isDisplayed())
		 {
	         rpt.createTest("MY Family Mobile - Field Validation", "Display Create Account - For Field Validation");
	         rpt.Pass("Create Account displayed- For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("CC_My Family Mobile_Validation Fields");
	         br1.click("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/tf-icon-widget/div/div[2]/div/div[2]/tf-button-primary/span[2]/button");
		 }
		 else
		 {
	         rpt.createTest("MY Family Mobile", "Display Create Account - For Field Validation");
	         rpt.Fail("Create Account not displayed - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	         
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("MY Family Mobile_Validation Fields");	  
		 }	
	  	 
	  //enter Email 
	  	 
	  	 if(br1.findTheElement("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[4]/div/div/div/form/div[1]/div[2]/div[1]/div[1]/tf-textbox/div/div/input").isDisplayed())
		 {
	         rpt.createTest("MY Family Mobile - Field Validation", "Display Email - For Field Validation");
	         rpt.Pass("Email displayed- For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("CC_My Family Mobile_Validation Fields");
	         br1.sendKeys("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[4]/div/div/div/form/div[1]/div[2]/div[1]/div[1]/tf-textbox/div/div/input",UserEmail);
		 }
		 else
		 {
	         rpt.createTest("MY Family Mobile", "Display Email - For Field Validation");
	         rpt.Fail("Email not displayed - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	         
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("MY Family Mobile_Validation Fields");	  
		 }	
	  	 
	  	 // enter DOB
	  	 if(br1.findTheElement("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[4]/div/div/div/form/div[1]/div[2]/div[1]/div[2]/div/tf-date/div/div/input").isDisplayed())
		 {
	         rpt.createTest("MY Family Mobile - Field Validation", "Display DOB - For Field Validation");
	         rpt.Pass("DOB displayed- For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("CC_My Family Mobile_Validation Fields");
	         br1.sendKeys("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[4]/div/div/div/form/div[1]/div[2]/div[1]/div[2]/div/tf-date/div/div/input",DOB);
		 }
		 else
		 {
	         rpt.createTest("MY Family Mobile", "Display DOB - For Field Validation");
	         rpt.Fail("DOB not displayed - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	         
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("MY Family Mobile_Validation Fields");	  
		 }	
	  	 
	  	 //enter password
	  	if(br1.findTheElement("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[4]/div/div/div/form/div[1]/div[2]/div[2]/div[1]/tf-textbox/div/div/input").isDisplayed())
		 {
	         rpt.createTest("MY Family Mobile - Field Validation", "Display Password - For Field Validation");
	         rpt.Pass("Password displayed- For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("CC_My Family Mobile_Validation Fields");
	         br1.sendKeys("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[4]/div/div/div/form/div[1]/div[2]/div[2]/div[1]/tf-textbox/div/div/input",Password);
		 }
		 else
		 {
	         rpt.createTest("MY Family Mobile", "Display Password - For Field Validation");
	         rpt.Fail("Password not displayed - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	         
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("MY Family Mobile_Validation Fields");	  
		 }	
	    
	  	//enter cpwd
		if(br1.findTheElement("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[4]/div/div/div/form/div[1]/div[2]/div[3]/div[1]/tf-textbox/div/div/input").isDisplayed())
		 {
	         rpt.createTest("MY Family Mobile - Field Validation", "Display Confirm Password - For Field Validation");
	         rpt.Pass("Confirm Password displayed- For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("CC_My Family Mobile_Validation Fields");
	         br1.sendKeys("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[4]/div/div/div/form/div[1]/div[2]/div[3]/div[1]/tf-textbox/div/div/input",cnfmPwd);
		 }
		 else
		 {
	         rpt.createTest("MY Family Mobile", "Display Confirm Password - For Field Validation");
	         rpt.Fail("Confirm Password not displayed - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	         
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("MY Family Mobile_Validation Fields");	  
		 }	
		
		//security pin
		if(br1.findTheElement("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[4]/div/div/div/form/div[1]/div[2]/div[2]/div[2]/tf-textbox/div/div/input").isDisplayed())
		 {
	         rpt.createTest("MY Family Mobile - Field Validation", "Display Security PIN - For Field Validation");
	         rpt.Pass("Security PIN displayed- For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("CC_My Family Mobile_Validation Fields");
	         br1.sendKeys("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[4]/div/div/div/form/div[1]/div[2]/div[2]/div[2]/tf-textbox/div/div/input",Security_Pin);
		 }
		 else
		 {
	         rpt.createTest("MY Family Mobile", "Display Security PIN - For Field Validation");
	         rpt.Fail("Security PIN not displayed - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	         
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("MY Family Mobile_Validation Fields");	  
		 }	
		
		//create acc
		if(br1.findTheElement("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[4]/div/div/div/form/div[2]/div[2]/div/tf-split-horizontal-or/div/div/div/tf-split-horizontal-or-top/div/wfm-button-primary/span[1]/button").isDisplayed())
		 {
	         rpt.createTest("MY Family Mobile - Field Validation", "Display Create Account - For Field Validation");
	         rpt.Pass("Create Account displayed- For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("CC_My Family Mobile_Validation Fields");
	         br1.click("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[4]/div/div/div/form/div[2]/div[2]/div/tf-split-horizontal-or/div/div/div/tf-split-horizontal-or-top/div/wfm-button-primary/span[1]/button");
		 }
		 else
		 {
	         rpt.createTest("MY Family Mobile", "Display Create Account - For Field Validation");
	         rpt.Fail("Create Account not displayed - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	         
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("MY Family Mobile_Validation Fields");	  
		 }
		
		//continue
		if(br1.findTheElement("xpath=html/body/div[1]/div/div/div/modal-popup/div[2]/div[2]/form/div/div[2]/div[2]/tf-button-primary/span[2]/button").isDisplayed())
		 {
	         rpt.createTest("MY Family Mobile - Field Validation", "Display Continue - For Field Validation");
	         rpt.Pass("Continue displayed- For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("CC_My Family Mobile_Validation Fields");
	         br1.click("xpath=html/body/div[1]/div/div/div/modal-popup/div[2]/div[2]/form/div/div[2]/div[2]/tf-button-primary/span[2]/button");
		 }
		 else
		 {
	         rpt.createTest("MY Family Mobile", "Display Continue - For Field Validation");
	         rpt.Fail("Continue not displayed - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	         
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("MY Family Mobile_Validation Fields");	  
		 }
		Thread.sleep(8000);
		//continue for acc activation
		if(br1.findTheElement("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div[2]/tf-button-primary/span[2]/button").isDisplayed())
		 {
	         rpt.createTest("MY Family Mobile - Field Validation", "Display Continue for Account Activation - For Field Validation");
	         rpt.Pass("Continue for Account Activation  displayed- For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("CC_My Family Mobile_Validation Fields");
	         br1.click("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div[2]/tf-button-primary/span[2]/button");
		 }
		 else
		 {
	         rpt.createTest("MY Family Mobile", "Display Continue for Account Activation  - For Field Validation");
	         rpt.Fail("Continue for Account Activation not displayed - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	         
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("MY Family Mobile_Validation Fields");	  
		 }
		
		String message = "Success! Thank you for your business! "; 
	    String msg_cnfrm = br1.getText("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/h1");
	    if(message.contains(msg_cnfrm))
	    {
	    	System.out.println("Message Account summary Displayed");
	    	rpt.createTest("MY Family Mobile - Field Validation", "My Account Summary Page got navigated successfully and Product got activated - For Field Validation");
	         rpt.Pass("Continue for Account Activation  displayed- For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("CC_My Family Mobile_Validation Fields");
	         br1.click("xpath=html/body/tf-update-lang/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/h1");
	    }   
	    else
		 {
	    	rpt.createTest("MY Family Mobile", "My Account Summary Page NOT navigated successfully and Product NOT activated  - For Field Validation");
	         rpt.Fail("Continue for Account Activation not displayed - For Field Validation");
	         rpt.Category("MY Family Mobile_Validation Fields");
	         String path = rpt.CaptureScreen(br1.browser, "ValidMessage");
	         rpt.imgPathPass(path);	         
	         rpt.chkBugs(CommonUtils.getUserName());
//	         rpt.chkdebug("MY Family Mobile_Validation Fields");
	         //rpt.chkdebug("Total Wireless_Validation Fields");
		 }
	    
	}
	@AfterTest
	public void publishReport()throws Exception
	{
		extent.flush();
		
	}

}
