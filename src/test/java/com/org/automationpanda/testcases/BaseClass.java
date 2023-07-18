package com.org.automationpanda.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public String baseURL = "https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/";
	public String baseName = "Gowtham";
	public String baseMail 	= "Gowtham@gmail.com";
	public String baseMessage = "Hello Gowtham";
	@Parameters("URL")
	@BeforeSuite
	public void setUp(String url) 
	{
		//System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		//driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	@AfterSuite
	public void tearDown() 
	{
		driver.quit();
	}

}
