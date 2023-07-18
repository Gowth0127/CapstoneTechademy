package com.org.automationpanda.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AutomationPandaPageObjects {
	WebDriver ldriver;
	public AutomationPandaPageObjects (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 60),this);
	}
	@FindBy(xpath = "//*[@id=\"menu-item-10\"]/a")
	WebElement contactbutton;
	@FindBy (id = "g3-name")
	WebElement nameBox ;
	@FindBy (id = "g3-email")
	WebElement emailBox;
	@FindBy (id = "contact-form-comment-g3-message")
	WebElement messageBox;
	@FindBy(xpath = "//*[@id=\"contact-form-3\"]/form/div/div[4]/button")
	WebElement contactmebutton;
	public void clickContact() throws Exception
	{
		contactbutton.click();
		Thread.sleep(3000);
	}
	public void enterName(String uname)
	{
		nameBox.sendKeys(uname);
	}
	public void enterMail(String mail)
	{
		emailBox.sendKeys(mail);
	}
	public void enterMeassage(String message)
	{
		messageBox.sendKeys(message);
	}
	public void clickContactmeButton()
	{
		contactmebutton.click();
	}	

}
