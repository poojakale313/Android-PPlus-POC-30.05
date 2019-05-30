package com.face.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.face.pageFactory.PPlusDailyPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class PPlusDaily {
	// Local variables

	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();

	private PPlusDailyPage objPPlusDailyPage = new PPlusDailyPage();
	
	@Given("^Click On Login button$")
	public void Click_On_Login_button() {
		Assert.assertTrue(objPPlusDailyPage.clickOnNoLoginBtn());
	}

	@Then("^Click on Ok Button$")
	public void clickOnOkButton()  
	{
		Assert.assertTrue(objPPlusDailyPage.clickOkbtn());
	}
	
	@Then("^Enter the User Name (.*)$")
	public void enterUserName(String userName)  
	{
		Assert.assertTrue(objPPlusDailyPage.setUserName(userName));
	}

	@Then("^Enter the Password (.*)$")
	public void enterPassword(String password)  
	{
		Assert.assertTrue(objPPlusDailyPage.setUserPassword(password));
	}
	
	@Then("^Click on Continue Button$")
	public void clickOnContinueButton() throws InterruptedException  
	{
		Assert.assertTrue(objPPlusDailyPage.clickContinueBtn());
	}
	
	@Then("^Click on ok button$")
	public void clickOkButton() throws InterruptedException  
	{
		Assert.assertTrue(objPPlusDailyPage.clickOkBtn());
	}
	
	@Then("^Click on screen$")
	public void ClickOnScreen() throws InterruptedException  
	{
		Assert.assertTrue(objPPlusDailyPage.clickOnMobileScreen());		
	}
	
	@Then("^Verify whether login successful or not$")
	public void verifyLoginSuccessful() throws InterruptedException  
	{
		Assert.assertTrue(objPPlusDailyPage.clickOnMobileScreen());		
	}
}


