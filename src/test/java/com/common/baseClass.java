package com.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.test.pages.LoginPage;
import com.test.pages.contactDetails;
import com.test.pages.emergencyContact;
import com.test.pages.personalDetails;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {


	@Test
	public void VerifyValidLogin() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		LoginPage login=new LoginPage(driver);
		login.loginToOrangeHRM("Admin", "admin123");
		//PersonalDetails
		personalDetails pd=new personalDetails(driver);
		pd.VerifyInfoTab();
		pd.VerifyEditOption();
		pd.VerifyEmployeeId();
		pd.VerifyDriverLicence();
		pd.VerifyEmployeeId();
		pd.VerifySsnNumber();
		pd.VerifyNickName();
		pd.save();
		//ContactDetails
		contactDetails cd=new contactDetails(driver);
		cd.VerifyContactDetails();
		cd.VerifyEditButton();
		cd.VerifyAddres1();
		cd.VerifyCityName();
		cd.verifyMobileNumber();
		cd.VerifyMailId();
		cd.VerifySaveBtn();
		//Emergency contact
		emergencyContact ec=new emergencyContact(driver);
		ec.VerifyEmergencyContact();
		ec.VerifyAddButton();
		ec.VerifyNameOfPerson();
		ec.VerifyRelation();
		ec.VerifyPhoneNumber();
		ec.VerifyWorkTelephone();
		ec.VerifybuttonSave();
		driver.quit();


	}
}
