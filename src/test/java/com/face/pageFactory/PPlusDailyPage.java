
package com.face.pageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Keyboard;

import com.gargoylesoftware.htmlunit.javascript.host.KeyboardEvent;

import core.generic.StepBase2;
import core.generic.Utilities;
import core.generic.WrapperFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

public class PPlusDailyPage  {
	public static String initialText = "test";
	public static String initialText1 = "test";
	public static String finalText = "test";
	
	protected static AppiumDriver appiumDriver = null;

	static boolean para1 = false;
	static boolean para2 = false;
	static boolean para3 = false;
	static boolean para4 = false;
	static boolean para5 = false;

	// Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private StepBase2 objStepBase2 = new StepBase2();

	
	By clickonloginbtn = By.id("com.hp.pregnancy.lite:id/btn_login");
	By inputusername = By.id("com.hp.pregnancy.lite:id/et_email");
	By inputUserPass = By.id("com.hp.pregnancy.lite:id/et_password");
	By btncontinue = By.id("com.hp.pregnancy.lite:id/btn_login");
	By btnOK = By.id("android:id/button1");
	
	String txtProfile = "com.hp.pregnancy.lite:id/tv_toolbar_title";
	String Expected = "Profile";
	
	By txtToday = By.id("com.hp.pregnancy.lite:id/tv_day_title");
	
	public boolean clickOnNoLoginBtn() {
		return objWrapperFunctions.mobileClick(clickonloginbtn);
	}
	
	public boolean clickOkbtn(){
		try {
			objWrapperFunctions.mobileClick(btnOK);
		} catch (Exception e) {
//			System.out.println(".apk launched on device");
		}
		return true;
	}
	
	public boolean setUserName(String userName){
		objWrapperFunctions.mobileSetText(inputusername, userName);
		objWrapperFunctions.navigateBack();
		return true;
	}
	
	public boolean setUserPassword(String password){
		return objWrapperFunctions.mobileSetText(inputUserPass, password);
	}

	public boolean clickContinueBtn(){
		objWrapperFunctions.mobileClick(btncontinue);
		try {
			objWrapperFunctions.mobileClick(btncontinue);
		}catch(Exception e) {
//			System.out.println("Second continue button not appeared");
		}
		return true;
	}
	
	public boolean clickOkBtn(){
		try {
			objWrapperFunctions.mobileClick(btnOK);
			System.out.println("Login Successful");
		}catch(Exception e) {
			System.out.println("Login Not Successful");
		}
		return true;
	}
	
	public boolean clickOnMobileScreen(){
		return objWrapperFunctions.clickOnMobileScreen();
	}
	
	public boolean verifyLogin(){
		objWrapperFunctions.checkMobileElementDisplayed(txtToday);
		System.out.println("Login successful");
		return true;
	}
}
