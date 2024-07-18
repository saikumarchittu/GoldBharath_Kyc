package Performing_Kyc;

import org.testng.annotations.Test;

import ObjectRepository.GoldBharath_Before_Login;
import ObjectRepository.Registration_Page;
import genericUtility.BaseClass_GoldBharath;
import genericUtility.ExcelFileUtility;
import genericUtility.WebDriverUtility;

public class Register extends BaseClass_GoldBharath{

	@Test
	public void register_user() throws Exception 
	{
		WebDriverUtility wu=new WebDriverUtility();
		ExcelFileUtility eu=new ExcelFileUtility();
		
		String BusinessName=eu.readDataFromExcel("Registration", 3, 1);
		String PersonName=eu.readDataFromExcel("Registration", 4, 1);
		String EmailId=eu.readDataFromExcel("Registration", 5, 1);
		String PhoneNum=eu.readDataFromExcel("Registration", 6, 1);
		String EstablishDate=eu.readDataFromExcel("Registration", 7, 1);
		String Pincode=eu.readDataFromExcel("Registration", 8, 1);
		String BusinessAddress=eu.readDataFromExcel("Registration", 9, 1);
		
	GoldBharath_Before_Login gbl=new GoldBharath_Before_Login(driver);
	
	gbl.getRegisterBtn().click();
	
	Registration_Page rp=new Registration_Page(driver);
	
	rp.getBuisnessNameEdt().sendKeys(BusinessName);
	
	rp.getPersonFullNameEdt().sendKeys(PersonName);
	
	rp.getEmailEdt().sendKeys(EmailId);
	
	rp.getPhoneNumberEdt().sendKeys(PhoneNum);
	
	Thread.sleep(2000);
	wu.scrolldown(driver);
	Thread.sleep(2000);
	
	rp.getShopEstablishDate().sendKeys(EstablishDate);
	
	rp.getPincodeEdt().sendKeys(Pincode);
	
	Thread.sleep(3000);
	wu.scrolldown(driver);
	Thread.sleep(3000);
	
	rp.getCircleCheckBox().click();
	
	Thread.sleep(2000);
	wu.scrolldown(driver);
	Thread.sleep(2000);
	
	rp.getBuisinessAddressEdt().sendKeys(BusinessAddress);
	
	Thread.sleep(2000);
	
	rp.getRegisterBtn().click();
	
	Thread.sleep(2000);
	
	wu.takeScreenShot(driver, "Registration successfully PopUp Page");
		
	}
}
