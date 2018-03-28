package MFM_Lite.MFM_Lite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;


public class CommonUtils {

	// private final static Logger logger = Logger.getLogger(CommonUtils.class);
	private static final String CONFIG_PROPERTY_FILE_PATH = "C:\\Automation\\config.properties";
	//private static final String CONFIG_PROPERTY_FILE_PATH = ".src/config.properties";

	
	public static String currentDateFileName(String prefix) {
		DateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy-hh_mm_ss");
		String formattedTime = formatter.format(new Date());
		return (StringUtils.isEmpty(prefix) ? formattedTime : prefix
				+ formattedTime);
	}

	
	public static String readFromConfig(String input)
			throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(CONFIG_PROPERTY_FILE_PATH));
		String returnVal = properties.getProperty(input);
		return returnVal;
	}

	
	public static String getHostOperatingSystem() {
		String osName = System.getProperty("os.name");
		// logger.info("Current Host Operating System is identified as " +
		// osName);
		return osName;
	}
	
	//This Function is used to generate random characters(size 3) to pass as random string value can be appended to any email id etc...
	//Mahesh NVS
	//23/11/2017
	public static String getRandomChar()
	{
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 3; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		String output = sb.toString();
		System.out.println(output);
		return output;
	}
	
	public static String getUserName() {
		  String uName = System.getProperty("user.name");
		  return uName;
		 }
}
