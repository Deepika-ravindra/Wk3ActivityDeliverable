package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class personalDetails  {
   

	WebDriver driver;
	By infoTab=By.xpath("//b[contains(text(),'My Info')]");
	By editOption=By.cssSelector("input#btnSave");
	By employeeID=By.cssSelector("input#personal_txtEmployeeId");
	By driverLicence=By.cssSelector("input#personal_txtLicenNo");
	By ssnNumber=By.cssSelector("input#personal_txtNICNo");
	By nickName=By.cssSelector("input#personal_txtEmpNickName");
	By save=By.xpath("//input[@id='btnSave']");
	 
		public personalDetails(WebDriver driver)
		{
			this.driver=driver;
		}



	public void  VerifyInfoTab() {
		driver.findElement(infoTab).click();


	}
	public void VerifyEditOption() {
		driver.findElement(editOption).click();

	}
	public void VerifyEmployeeId() throws InterruptedException {
		driver.findElement(employeeID).sendKeys("34154");
		Thread.sleep(4000);
	}


	public void VerifyDriverLicence() {
		driver.findElement(driverLicence).sendKeys("M605");
	}
	public void VerifySsnNumber() {
		driver.findElement(ssnNumber).sendKeys("46565");

	}
	public void VerifyNickName()
	{
		driver.findElement(nickName).sendKeys("SITA");
	}
	public void save() throws InterruptedException {
		driver.findElement(save);
		Thread.sleep(3000);
	}



}
