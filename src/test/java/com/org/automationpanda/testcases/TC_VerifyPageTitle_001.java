package com.org.automationpanda.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.org.automationpanda.pageobjects.AutomationPandaPageObjects;

public class TC_VerifyPageTitle_001 extends BaseClass {
	@Test(priority = 1)

	public void sendMessageTest() throws Exception
	{
		//driver.get(baseURL);
		//Thread.sleep(5000);
		
		AutomationPandaPageObjects AP = new AutomationPandaPageObjects(driver);
		AP.clickContact();
		//Thread.sleep(5000);

		if(driver.getTitle().equals("Contact | Automation Panda"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false,"Value does not matched");
		}		
	}

}
