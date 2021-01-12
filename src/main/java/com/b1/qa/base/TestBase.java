package com.b1.qa.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;



//import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;


	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"/var/lib/jenkins/workspace/Mirketa_WebCheck/src/main/java/com/b1/qa/config/Config.properties");
					
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {

		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/var/lib/jenkins/workspace/Mirketa_WebCheck/Documents/chromedriver");
			
			ChromeOptions options = new ChromeOptions();
		
			 
			 options.setBinary("/usr/bin/google-chrome"); 
			  DesiredCapabilities cap = DesiredCapabilities.chrome(); 
			 
			  //options.setCapability("chrome.binary","C:\\Program Files (x86)\\Google\\chrome.exe");
			 // cap.setCapability(ChromeOptions.CAPABILITY, options);
			  options.addArguments("window-size=1360,768"); 
			  //options.addArguments("--no-sandbox");
			//  options.setExperimentalOption("useAutomationExtension", false);
			  
			 // options.setPageLoadStrategy(PageLoadStrategy.NONE);
			 // options.addArguments("start-maximized");
			 // options.addArguments("enable-automation");
			 // options.addArguments("--no-sandbox");
			 // options.addArguments("--disable-infobars");
			  //options.addArguments("--disable-dev-shm-usage");
			  //options.addArguments("--disable-browser-side-navigation");
			 // options.addArguments("--disable-gpu");
			  
			  
			  
			  
			  options.addArguments("--no-sandbox"); // Bypass OS security model, MUST BE THE VERY FIRST OPTION
		        options.addArguments("--headless");
		        options.addArguments("--disable-dev-shm-usage");
		        options.setExperimentalOption("useAutomationExtension", false);
		        options.addArguments("start-maximized"); // open Browser in maximized mode
		        options.addArguments("disable-infobars"); // disabling infobars
		        options.addArguments("--disable-extensions"); // disabling extensions
		        options.addArguments("--disable-gpu"); // applicable to windows os only
		        options.merge(cap);
			 // options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
	        driver = (WebDriver) new ChromeDriver(options);
	}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	}


