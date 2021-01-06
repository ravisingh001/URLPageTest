package com.b1.qa.testcases;

import java.io.FileNotFoundException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.b1.qa.base.TestBase;
import com.b1.qa.pages.WebCheck;
import com.b1.qa.util.TestUtility;

public class WebCheckTestPage extends TestBase {

	TestUtility testUtil;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebCheck webCheck;

	public WebCheckTestPage() {
		super();
	}

	@BeforeMethod
	public void setUp() throws FileNotFoundException, InterruptedException {
		initialization();
		webCheck = new WebCheck();
	}

	@Test(priority = 1)
	public void VerifyMirketaWebPageAnd_BrokenLinks() throws Exception {
		Thread.sleep(2000);
		webCheck.VerifyMirketaWebPage();
		driver.close();
		System.out.println("Mirketa WebPage is Closed successfully");
	}

	@Test(priority = 2)
	public void VerifyElixireHRWebPageAnd_BrokenLinks() throws Exception {
		Thread.sleep(3000);
		webCheck.VerifyElixireHRWebPage();
		driver.close();
		System.out.println("ElixireHR WebPage is Closed successfully");
	}

	@Test(priority = 3)
	public void VerifyRoundRobinDistributorWebPageAnd_BrokenLinks() throws Exception {
		Thread.sleep(3000);
		webCheck.VerifyRoundRobinDistributorWebPage();
		System.out.println("Round Robin Distributor WebPage is Closed successfully");
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
}
