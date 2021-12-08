package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.common.baseClass;

public class contactDetails {
	
	WebDriver driver;
	By contactDetail=By.linkText("Contact Details");
	By editBtn=By.cssSelector("input#btnSave");
	By address1=By.cssSelector("input#contact_street1");
	By cityName=By.xpath("//input[@name='contact[city]']");
	By mobileNumber=By.xpath("//input[@name='contact[emp_mobile]']");
	By mailId=By.xpath("//label[text()='Work Email']//following-sibling::input[1]");
	By saveBtn =By.xpath("//input[@tabindex='2']");
	
	
	
	public contactDetails(WebDriver driver)
	{
		this.driver=driver;
	}
	public void VerifyContactDetails() {
		driver.findElement(contactDetail).click();
	}
	public void VerifyEditButton() {
		driver.findElement(editBtn).click();
	}
	public void VerifyAddres1() {
		driver.findElement(address1).sendKeys("Heaven,goddess,#1111");
	}
	public void VerifyCityName() {
		driver.findElement(cityName).sendKeys("cloudy");
	}
	public void verifyMobileNumber() {
		driver.findElement(mobileNumber).sendKeys("9823458723");
	}
	public void VerifyMailId() {
		driver.findElement(mailId).sendKeys("paul1@osohrm.com");
	}
public void VerifySaveBtn() {
	driver.findElement(saveBtn).click();
}
		
	}
	
	
	
	
	


