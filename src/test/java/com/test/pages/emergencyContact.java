package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.common.baseClass;

public class emergencyContact {
	WebDriver driver;
	By emergencyContact =By.xpath("//a[@href=\"/index.php/pim/viewEmergencyContacts/empNumber/7\"]");
	By addBtn=By.xpath("//p[@id=\"listActions\"]//input[1]");
	By name=By.cssSelector("input.formInputText");
	By relationship=By.xpath("//input[@id='emgcontacts_relationship']");
	By  phoneNumber=By.xpath("//input[@name='emgcontacts[mobilePhone]']");
	By workTelephone=By.cssSelector("input#emgcontacts_workPhone");
	By BtnSave=By.cssSelector("input#btnSaveEContact");



	public emergencyContact(WebDriver driver)
	{
		this.driver=driver;
	}

	public void VerifyEmergencyContact() throws InterruptedException {
		driver.findElement(emergencyContact).click();
		Thread.sleep(3000);
	}
	public void VerifyAddButton() {
		driver.findElement(addBtn).click();
	}
	public void VerifyNameOfPerson() throws InterruptedException {
		driver.findElement(name).sendKeys("Sita");
		Thread.sleep(4000);
	}
	public void VerifyRelation() throws InterruptedException {
		driver.findElement(relationship).sendKeys("Mother");
		Thread.sleep(4000);
	}
	public void VerifyPhoneNumber() throws InterruptedException {
		driver.findElement(phoneNumber).sendKeys("8374637378");
		Thread.sleep(4000);
	}
	public void VerifyWorkTelephone() throws InterruptedException {
		driver.findElement(workTelephone).sendKeys("8783488723");
		Thread.sleep(4000);
	}
	public void VerifybuttonSave() throws InterruptedException {
		driver.findElement(BtnSave);
		Thread.sleep(2000);
	}
}
