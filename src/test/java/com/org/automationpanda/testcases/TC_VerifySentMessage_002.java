package com.org.automationpanda.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.org.automationpanda.pageobjects.AutomationPandaPageObjects;

public class TC_VerifySentMessage_002 extends BaseClass
{
	@Test(priority = 2)
	public void sendMessageTest() throws Exception
	{
		driver.get(baseURL);
		//Thread.sleep(3000);
		AutomationPandaPageObjects AP = new AutomationPandaPageObjects(driver);
		AP.clickContact();
		AP.enterName(baseName);
		AP.enterMail(baseMail);
		AP.enterMeassage(baseMessage);
		AP.clickContactmeButton();
		//Thread.sleep(5000);
		WebElement msg = driver.findElement(By.id("contact-form-success-header"));
		String opmsg = msg.getText();
		System.out.println(opmsg);	
		if(opmsg.equals("Your message has been sent"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false,"Value does not matched");
		}
	}
}
