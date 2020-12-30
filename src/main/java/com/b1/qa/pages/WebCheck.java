package com.b1.qa.pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import com.b1.qa.base.TestBase;
import com.b1.qa.util.TestUtility;

public class WebCheck extends TestBase {

	TestUtility testUtil = new TestUtility();
	// WebDriver driver;

	@FindBy(xpath = "(//a[@href='mailto:info@mirketa.com'])[2]")
	WebElement MirketaPage_EmailOnPage;

	@FindBy(xpath = "//a[@href='tel:1-855-6475382']")
	WebElement MirketaPage_PhoneOnPage;

	@FindBy(xpath = "(//p[@class='address-icon'])[1]")
	WebElement MirketaPage_HeadquartersAdd;

	@FindBy(xpath = "(//p[@class='address-icon'])[2]")
	WebElement MirketaPage_Off_ShoreOfficeAdd;

	// MIRKETA URL
	public void VerifyMirketaWebPage() throws InterruptedException {
		driver.get(prop.getProperty("Url"));
		// driver.get("https://www.mirketa.com/");
		Thread.sleep(5000);
		String URl = driver.getCurrentUrl();
		System.out.println(URl);
		Assert.assertEquals(URl, "https://www.mirketa.com/");
		System.out.println("Mirketa WebPage is Loading Successfully");
		System.out.printf("%n");
		// driver.switchTo().frame(1);
		WebElement MirketaPage_logo = driver.findElement(By.xpath("//a/img[@data-srcset='https://www.mirketa.com/wp-content/uploads/2019/11/logo.svg 1x']"));
		MirketaPage_logo.isDisplayed();
		System.out.println("Mirketa Logo is verified successfully on WebPage");

		WebElement MirketaPage_Services_MenuOptions = driver.findElement(By.xpath("(//span[@class='menu-text'][contains(text(),'Services')])[1]"));
		Assert.assertTrue(MirketaPage_Services_MenuOptions.isDisplayed());
		System.out.println("Mirketa Menu Option i.e. Services is verified successfully on WebPage");

		WebElement MirketaPage_Solutions_MenuOptions = driver.findElement(By.xpath("(//span[@class='menu-text'][contains(text(),'Solutions')])[1]"));
		MirketaPage_Solutions_MenuOptions.isDisplayed();
		System.out.println("Mirketa Menu Option i.e. Solutions is verified successfully on WebPage");

		WebElement MirketaPage_Products_MenuOptions = driver.findElement(By.xpath("(//span[@class='menu-text'][contains(text(),'Products')])[1]"));
		MirketaPage_Products_MenuOptions.isDisplayed();
		System.out.println("Mirketa Menu Option i.e. Products is verified successfully on WebPage");

		WebElement MirketaPage_About_MenuOptions = driver.findElement(By.xpath("(//span[@class='menu-text'][contains(text(),'About')])[1]"));
		MirketaPage_About_MenuOptions.isDisplayed();
		System.out.println("Mirketa Menu Option i.e. Services is verified successfully on WebPage");

		WebElement MirketaPage_Resources_MenuOptions = driver.findElement(By.xpath("(//span[@class='menu-text'][contains(text(),'Resources')])[1]"));
		MirketaPage_Resources_MenuOptions.isDisplayed();
		System.out.println("Mirketa Menu Option i.e. Resources is verified successfully on WebPage");

		WebElement MirketaPage_ContactUS_MenuOptions = driver.findElement(By.xpath("(//span[@class='menu-text'][contains(text(),'Contact Us')])[1]"));
		MirketaPage_ContactUS_MenuOptions.isDisplayed();
		System.out.println("Mirketa Menu Option i.e. Contact Us is verified successfully on WebPage");
		System.out.printf("%n");
		WebElement MirketaPage_OurServices = driver.findElement(By.xpath("//h2[contains(text(),'Our Services')]"));
		MirketaPage_OurServices.isDisplayed();
		WebElement MirketaPage_ArchitectureandStrategyfield = driver.findElement(By.xpath("//h3[contains(text(),'Architecture and Strategy')]"));
		MirketaPage_ArchitectureandStrategyfield.isDisplayed();
		WebElement MirketaPage_Implementationfield = driver.findElement(By.xpath("//h3[contains(text(),'Implementation')]"));
		MirketaPage_Implementationfield.isDisplayed();
		WebElement MirketaPage_Integrationfield = driver.findElement(By.xpath("//h3[contains(text(),'Integration')]"));
		MirketaPage_Integrationfield.isDisplayed();
		WebElement MirketaPage_Supportnmanagedservicesfield = driver.findElement(By.xpath("//h3[contains(text(),'Support & managed services')]"));
		MirketaPage_Supportnmanagedservicesfield.isDisplayed();
		WebElement MirketaPage_AISolutionsfield = driver.findElement(By.xpath("//h3[contains(text(),'AI Solutions')]"));
		MirketaPage_AISolutionsfield.isDisplayed();
		WebElement MirketaPage_CloudMigrationfield = driver.findElement(By.xpath("//h3[contains(text(),'Cloud Migration')]"));
		MirketaPage_CloudMigrationfield.isDisplayed();
		WebElement MirketaPage_OurProducts = driver.findElement(By.xpath("//h2[contains(text(),'Our Products')]"));
		MirketaPage_OurProducts.isDisplayed();

		WebElement MirketaPage_ProductImg1 = driver.findElement(By.xpath("//img[@title='finacast']"));
		MirketaPage_ProductImg1.isDisplayed();
		WebElement MirketaPage_ProductImg2 = driver.findElement(By.xpath("//img[@title='ecourier']"));
		MirketaPage_ProductImg2.isDisplayed();
		WebElement MirketaPage_ProductImg3 = driver.findElement(By.xpath("//img[@title='delphi-logo']"));
		MirketaPage_ProductImg3.isDisplayed();
		WebElement MirketaPage_ProductImg4 = driver.findElement(By.xpath("//img[@title='elixir-logo']"));
		MirketaPage_ProductImg4.isDisplayed();
		WebElement MirketaPage_ProductImg5 = driver.findElement(By.xpath("//img[@title='duplicate-search-and-merge']"));
		MirketaPage_ProductImg5.isDisplayed();
		WebElement MirketaPage_ProductImg6 = driver.findElement(By.xpath("//img[starts-with(@title,'rrd')]"));
		MirketaPage_ProductImg6.isDisplayed();
		System.out.println("Product logos are displayed on Home Page");

		WebElement MirketaPage_OurBlog = driver.findElement(By.xpath("//h1[contains(text(),'Our Blog')]"));
		MirketaPage_OurBlog.isDisplayed();
		WebElement MirketaPage_InquiryForm = driver.findElement(By.xpath("//form[@id='signupForm']"));
		MirketaPage_InquiryForm.isDisplayed();
		System.out.println("Our blog & Inquiry form is displayed on Home Page");
		System.out.printf("%n");
		WebElement MirketaPage_EmailOnPage = driver.findElement(By.xpath("(//a[@href='mailto:info@mirketa.com'])[2]"));
		String Email = MirketaPage_EmailOnPage.getText();
		System.out.println("Displayed Email of the Company is = " + Email);
		Assert.assertTrue(Email.contains("info@mirketa.com"));

		WebElement MirketaPage_PhoneOnPage = driver.findElement(By.xpath("//a[@href='tel:1-855-6475382']"));
		String Phone = MirketaPage_PhoneOnPage.getText();
		System.out.println("Displayed Phone Detail of the Company is = " + Phone);
		Assert.assertTrue(Phone.contains("1-855-mirketa"));

		WebElement MirketaPage_HeadquartersAdd = driver.findElement(By.xpath("(//p[@class='address-icon'])[1]"));
		String HeadquartersAdd = MirketaPage_HeadquartersAdd.getText();
		System.out.println("Displayed Headquarters Address of the Company is = " + HeadquartersAdd);

		WebElement MirketaPage_Off_ShoreOfficeAdd = driver.findElement(By.xpath("(//p[@class='address-icon'])[2]"));
		String Off_ShoreOfficeAdd = MirketaPage_Off_ShoreOfficeAdd.getText();
		System.out.println("Displayed Off-ShoreOffice Address of the Company is = " + Off_ShoreOfficeAdd);

		// ++++++++++++++++++++++++++++++++++++TO Verify the Broken Links on Mirketa WebPage++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total links are " + links.size());
		System.out.printf("%n");
		for (int i = 0; i < links.size(); i++) {

			WebElement ele = links.get(i);

			String url = ele.getAttribute("href");

			verifyLinkActive(url);

		}
	}

	public static void verifyLinkActive(String linkUrl) {
		try {
			URL url = new URL(linkUrl);

			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			httpURLConnect.setConnectTimeout(3000);

			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() == 200) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
			}
			if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "
						+ HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {

		}
	}

	// ELIXIR EHR URL
	public void VerifyElixireHRWebPage() throws InterruptedException {
		driver.get(prop.getProperty("url"));
		Thread.sleep(5000);
		String URl = driver.getCurrentUrl();
		System.out.println(URl);
		Assert.assertEquals(URl, "https://www.elixirehr.com/");
		System.out.println("ElixireHR WebPage is Loading Successfully");
		System.out.printf("%n");
		WebElement Elixirehr_logo = driver.findElement(By.xpath("(//a/img[@src='https://elixirehr.com/wp-content/uploads/2020/08/elixir-logo.png'])[1]"));
		Elixirehr_logo.isDisplayed();
		System.out.println("Elixirehr logo is verified successfully on WebPage");

		WebElement Elixirehr_Home_MenuOptions = driver.findElement(By.xpath("(//span[@class='menu-text'][contains(text(),'Home')])[1]"));
		Assert.assertTrue(Elixirehr_Home_MenuOptions.isDisplayed());
		System.out.println("Elixirehr Menu Option i.e. Home is verified successfully on WebPage");

		WebElement Elixirehr_Elixir_MenuOptions = driver.findElement(By.xpath("(//span[@class='menu-text'][contains(text(),'Elixir')])[1]"));
		Elixirehr_Elixir_MenuOptions.isDisplayed();
		System.out.println("Elixir Menu Option i.e. Elixir is verified successfully on WebPage");

		WebElement Elixirehr_Blog_MenuOptions = driver.findElement(By.xpath("(//span[@class='menu-text'][contains(text(),'Blog')])[1]"));
		Elixirehr_Blog_MenuOptions.isDisplayed();
		System.out.println("Elixir Menu Option i.e. Blog is verified successfully on WebPage");

		WebElement Elixirehr_Career_MenuOptions = driver.findElement(By.xpath("(//span[@class='menu-text'][contains(text(),'Career')])[1]"));
		Elixirehr_Career_MenuOptions.isDisplayed();
		System.out.println("Elixir Menu Option i.e. Career is verified successfully on WebPage");

		WebElement Elixirehr_TTD_MenuOptions = driver.findElement(By.xpath("(//a[contains(text(),'Take A Test Drive')])[1]"));
		Elixirehr_TTD_MenuOptions.isDisplayed();
		System.out.println("Elixir Menu Option i.e. Take A Test Drive is verified successfully on WebPage");
		System.out.printf("%n");
		WebElement Elixirehr_banner = driver.findElement(By.xpath("//div[@class='banner-caption']"));
		Elixirehr_banner.isDisplayed();
		WebElement Elixirehr_ScheduleDemo = driver.findElement(By.xpath("//a[contains(text(),'Schedule A Demo')]"));
		Elixirehr_ScheduleDemo.isDisplayed();
		WebElement Elixirehr_OurProducts = driver.findElement(By.xpath("//h4[contains(text(),'Our Product')]"));
		Elixirehr_OurProducts.isDisplayed();
		WebElement Elixirehr_OurSolutions = driver.findElement(By.xpath("//h4[contains(text(),'Our Solutions')]"));
		Elixirehr_OurSolutions.isDisplayed();

		WebElement Elixirehr_FlipBox1 = driver.findElement(By.xpath("(//div[@class='elementor-flip-box__layer elementor-flip-box__back'])[1]"));
		Elixirehr_FlipBox1.isDisplayed();
		WebElement Elixirehr_FlipBox2 = driver.findElement(By.xpath("(//div[@class='elementor-flip-box__layer elementor-flip-box__back'])[2]"));
		Elixirehr_FlipBox2.isDisplayed();
		WebElement Elixirehr_FlipBox3 = driver.findElement(By.xpath("(//div[@class='elementor-flip-box__layer elementor-flip-box__back'])[3]"));
		Elixirehr_FlipBox3.isDisplayed();
		WebElement Elixirehr_FlipBox4 = driver.findElement(By.xpath("(//div[@class='elementor-flip-box__layer elementor-flip-box__back'])[4]"));
		Elixirehr_FlipBox4.isDisplayed();

		WebElement Elixirehr_Features = driver.findElement(By.xpath("//h4[contains(text(),'Features')]"));
		Elixirehr_Features.isDisplayed();
		WebElement Elixirehr_Capabilities = driver.findElement(By.xpath("//h2[contains(text(),'Elixir Capabilities')]"));
		Elixirehr_Capabilities.isDisplayed();
		WebElement Elixirehr_Businesses = driver.findElement(By.xpath("//h4[contains(text(),'What Businesses Say About Us')]"));
		Elixirehr_Businesses.isDisplayed();

		WebElement Elixirehr_OurBlog = driver.findElement(By.xpath("//h2[contains(text(),'Our Blog')]"));
		Elixirehr_OurBlog.isDisplayed();
		WebElement Elixirehr_InquiryForm = driver.findElement(By.xpath("//a[contains(text(),'Get A Demo')]"));
		Elixirehr_InquiryForm.isDisplayed();
		System.out.println("Our blog & Get A Demo Button is displayed on Home Page");
		System.out.printf("%n");
		WebElement Elixirehr_EmailOnPage = driver.findElement(By.xpath("(//a[@href='mailto:info@elixirehr.com'])[1]"));
		String Email = Elixirehr_EmailOnPage.getText();
		System.out.println("Displayed Email of the Company is = " + Email);
		Assert.assertTrue(Email.contains("info@elixirehr.com"));

		WebElement Elixirehr_PhoneOnPage = driver.findElement(By.xpath("//a[@href='tel:1-855-647-5382']"));
		String Phone = Elixirehr_PhoneOnPage.getText();
		System.out.println("Displayed Phone Detail of the Company is = " + Phone);
		Assert.assertTrue(Phone.contains("1-855-mirketa"));
		System.out.printf("%n");
		WebElement Elixirehr_HeadquartersAdd = driver.findElement(By.xpath("(//p[@class='footer-address'])[1]"));
		String HeadquartersAdd = Elixirehr_HeadquartersAdd.getText();
		System.out.println("Displayed Headquarters Address of the Company is = " + HeadquartersAdd);
		System.out.printf("%n");

		// ++++++++++++++++++++++++++++++++++++TO Verify the Broken Links on ElixirEHR++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total links are " + links.size());
		System.out.printf("%n");
		for (int i = 0; i < links.size(); i++) {

			WebElement ele = links.get(i);

			String url = ele.getAttribute("href");

			verifyLinkActiveOnElixir(url);

		}
	}

	public static void verifyLinkActiveOnElixir(String linkUrl) {
		try {
			URL url = new URL(linkUrl);

			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			httpURLConnect.setConnectTimeout(3000);

			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() == 200) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
			}
			if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "
						+ HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {
		}
	}
	
	

	// RRD URL
	public void VerifyRoundRobinDistributorWebPage() throws InterruptedException {
		driver.get(prop.getProperty("URL"));
		Thread.sleep(7000);
		String URl = driver.getCurrentUrl();
		System.out.println(URl);
		Assert.assertEquals(URl, "https://www.roundrobindistributor.com/");
		System.out.println("Round Robin Distributor WebPage is Loading Successfully");
		System.out.printf("%n");
		WebElement RRD_logo = driver.findElement(By.xpath("(//a/img[@src='https://www.roundrobindistributor.com/wp-content/uploads/2020/08/rrd_svg_newlogo.svg'])[1]"));
		RRD_logo.isDisplayed();
		System.out.println("RRD logo is verified successfully on WebPage");

		WebElement RRD_Home_MenuOptions = driver.findElement(By.xpath("(//a[contains(text(),'Home')])[1]"));
		Assert.assertTrue(RRD_Home_MenuOptions.isDisplayed());
		System.out.println("RRD Menu Option i.e. Home is verified successfully on WebPage");

		WebElement RRD_Features_MenuOptions = driver.findElement(By.xpath("(//a[contains(text(),'Features')])[1]"));
		RRD_Features_MenuOptions.isDisplayed();
		System.out.println("RRD Menu Option i.e. Features is verified successfully on WebPage");

		WebElement RRD_Pricing_MenuOptions = driver.findElement(By.xpath("(//a[contains(text(),'Pricing')])[1]"));
		RRD_Pricing_MenuOptions.isDisplayed();
		System.out.println("RRD Menu Option i.e. Pricing is verified successfully on WebPage");

		WebElement RRD_KB_MenuOptions = driver.findElement(By.xpath("(//a[contains(text(),'Knowlege Base')])[1]"));
		RRD_KB_MenuOptions.isDisplayed();
		System.out.println("RRD Menu Option i.e. Knowlege Base is verified successfully on WebPage");

		WebElement RRD_Contact_MenuOptions = driver.findElement(By.xpath("(//a[contains(text(),'Contact')])[1]"));
		RRD_Contact_MenuOptions.isDisplayed();
		System.out.println("RRD Menu Option i.e. Contact is verified successfully on WebPage");
		System.out.printf("%n");
		WebElement RRD_banner = driver.findElement(By.xpath("//div[@class='header-description gridContainer content-on-left']"));
		RRD_banner.isDisplayed();
		WebElement RRD_banner_Content = driver.findElement(By.xpath("//h1[@class='hero-title']"));
		RRD_banner_Content.isDisplayed();
		
		WebElement RRD_ScheduleDemo = driver.findElement(By.xpath("//a[contains(text(),'SCHEDULE A DEMO')]"));
		RRD_ScheduleDemo.isDisplayed();
		WebElement RRD_Spotlight = driver.findElement(By.xpath("//h2[contains(text(),'RRD in Salesforce Spotlight')]"));
		RRD_Spotlight.isDisplayed();
		
		WebElement RRD_consulting = driver.findElement(By.xpath("//img[@src='https://roundrobindistributor.com//wp-content/uploads/2020/05/consulting.jpg']"));
		RRD_consulting.isDisplayed();
		WebElement RRD_appexchange = driver.findElement(By.xpath("//img[@src='https://roundrobindistributor.com//wp-content/uploads/2020/05/appexchange.jpg']"));
		RRD_appexchange.isDisplayed();
		WebElement RRD_lightlining = driver.findElement(By.xpath("//img[@src='https://roundrobindistributor.com//wp-content/uploads/2020/05/lightlining.jpg']"));
		RRD_lightlining.isDisplayed();


		WebElement RRD_Features = driver.findElement(By.xpath("//h2[contains(text(),'Features')]"));
		RRD_Features.isDisplayed();
		WebElement RRD_Features1 = driver.findElement(By.xpath("//h4[contains(text(),'Complex Salesforce Round Robin')]"));
		RRD_Features1.isDisplayed();
		WebElement RRD_Features2 = driver.findElement(By.xpath("//h4[contains(text(),'Load Balancing & Weighted Allocation')]"));
		RRD_Features2.isDisplayed();
		WebElement RRD_Features3 = driver.findElement(By.xpath("//h4[contains(text(),'Prioritizes Urgent Cases')]"));
		RRD_Features3.isDisplayed();
		WebElement RRD_Features4 = driver.findElement(By.xpath("//h4[contains(text(),'Relationship & Criteria based Routing')]"));
		RRD_Features4.isDisplayed();
		WebElement RRD_Features5 = driver.findElement(By.xpath("//h4[contains(text(),'Reassign Records to Efficient Reps')]"));
		RRD_Features5.isDisplayed();
		WebElement RRD_Features6 = driver.findElement(By.xpath("//h4[contains(text(),'Custom Work Schedules & Calendars')]"));
		RRD_Features6.isDisplayed();
		WebElement RRD_Features7 = driver.findElement(By.xpath("//h4[contains(text(),'Intelligent Reporting & Auditing')]"));
		RRD_Features7.isDisplayed();
		WebElement RRD_Features8 = driver.findElement(By.xpath("//h4[contains(text(),'Bulk Management on Team Level')]"));
		RRD_Features8.isDisplayed();
		WebElement RRD_Features9 = driver.findElement(By.xpath("//h4[contains(text(),'Automated Distribution from Queue')]"));
		RRD_Features9.isDisplayed();
		

		WebElement RRD_AU = driver.findElement(By.xpath("//h2[contains(text(),'About Us')]"));
		RRD_AU.isDisplayed();
		WebElement RRD_OT = driver.findElement(By.xpath("//h2[contains(text(),'Our Team')]"));
		RRD_OT.isDisplayed();
		
		WebElement RRD_Blogs = driver.findElement(By.xpath("//div[starts-with(@id,'latest-news')]"));
		RRD_Blogs.isDisplayed();
		
		WebElement RRD_ContactUS = driver.findElement(By.xpath("//form[starts-with(@action,'https://webto.salesforce.com/servlet/servlet.WebToLead?encoding=UTF-')]"));
		RRD_ContactUS.isDisplayed();
		System.out.printf("%n");
		
		WebElement RRD_MirketaRRD = driver.findElement(By.xpath("//h2[contains(text(),'Mirketa RRD')]"));
		RRD_MirketaRRD.isDisplayed();
		System.out.println("Mirketa RRD link is Displayed");
		System.out.printf("%n");

		// ++++++++++++++++++++++++++++++++++++TO Verify the Broken Links on RRD++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total links are " + links.size());
		System.out.printf("%n");
		for (int i = 0; i < links.size(); i++) {

			WebElement ele = links.get(i);

			String url = ele.getAttribute("href");

			verifyLinkActiveOnRoundRobinDistributor(url);

		}
	}

	public static void verifyLinkActiveOnRoundRobinDistributor(String linkUrl) {
		try {
			URL url = new URL(linkUrl);

			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			httpURLConnect.setConnectTimeout(3000);

			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() == 200) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
			}
			if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {
		}
	}

}
