package Performing_Kyc;

import org.testng.annotations.Test;
import ObjectRepository.GoldBharath_After_Login;
import ObjectRepository.LLP_Kyc_Page;
import ObjectRepository.ProfilePage;
import genericUtility.BaseClass_GoldBharath;
import genericUtility.ExcelFileUtility;
import genericUtility.WebDriverUtility;

public class LLP_KYC extends BaseClass_GoldBharath{

	@Test
	public void kycTest() throws Exception 
	{
		
		GoldBharath_After_Login gal=new GoldBharath_After_Login(driver);
		
		WebDriverUtility wu=new WebDriverUtility();
		
		ExcelFileUtility eu=new ExcelFileUtility();
		
		String Dname=eu.readDataFromExcel("LLP_KYC", 4, 1);
		
		String Dnum=eu.readDataFromExcel("LLP_KYC", 5, 1);
		
		String AdharNum=eu.readDataFromExcel("LLP_KYC", 6, 1);
		
		String Adharfront=eu.readDataFromExcel("LLP_KYC", 7, 1);
		
		String AdharBack=eu.readDataFromExcel("LLP_KYC", 8, 1);
		
		String PanNum=eu.readDataFromExcel("LLP_KYC", 9, 1);
		
		String PanImg=eu.readDataFromExcel("LLP_KYC", 10, 1);
		
		String GstNum=eu.readDataFromExcel("LLP_KYC", 11, 1);
		
		String GstImg=eu.readDataFromExcel("LLP_KYC", 12, 1);
		
		String CinNum=eu.readDataFromExcel("LLP_KYC", 13, 1);
		
		String CinImg=eu.readDataFromExcel("LLP_KYC", 14, 1);
		
		String DImg=eu.readDataFromExcel("LLP_KYC", 15, 1);
		
		String BankName=eu.readDataFromExcel("LLP_KYC", 16, 1);
		
		String AccountNum=eu.readDataFromExcel("LLP_KYC", 17, 1);
		
		String IfscCode=eu.readDataFromExcel("LLP_KYC", 18, 1);
		
		String HolderName=eu.readDataFromExcel("LLP_KYC", 19, 1);
		
		gal.getProfileBtn().click();
		
		Thread.sleep(2000);
		
		ProfilePage pp=new ProfilePage(driver);
		
		pp.getKycLnk().click();
		
		LLP_Kyc_Page lkp=new LLP_Kyc_Page(driver);
		
		Thread.sleep(2000);
		
		lkp.getLlpLnk().click();

		Thread.sleep(2000);
		
		lkp.getDirectorNameEdt().sendKeys(Dname);
		
		lkp.getDirectorMobileNumEdt().sendKeys(Dnum);
		
		lkp.getDirectorAdharNumEdt().sendKeys(AdharNum);
		
		lkp.getDirectorAdharFrontImgLnk().sendKeys(Adharfront);
		
		lkp.getDirectorAdharBackImgLnk().sendKeys(AdharBack);
		
		wu.scrolldown(driver);
		
		lkp.getDirectorPanEdt().sendKeys(PanNum);
		
		lkp.getDirectorPanImg().sendKeys(PanImg);
		
		lkp.getDirectorGstNumEdt().sendKeys(GstNum);
		Thread.sleep(2000);
		
		lkp.getDirectorGstImg().sendKeys(GstImg);
		
		lkp.getDirectorCinNumEdt().sendKeys(CinNum);
		
		lkp.getDirectorCinImg().sendKeys(CinImg);
		
		Thread.sleep(2000);
		wu.scrolldown(driver);
		Thread.sleep(2000);
		
		lkp.getDirectorImg().sendKeys(DImg);
		
		lkp.getBankNameEdt().sendKeys(BankName);
		
		lkp.getAccontNumberEdt().sendKeys(AccountNum);
		
		Thread.sleep(2000);
		wu.scrolldown(driver);
		Thread.sleep(2000);
		
		lkp.getIfscCodeEdt().sendKeys(IfscCode);
		
		lkp.getAccountHolderNameEdt().sendKeys(HolderName);
		
	     Thread.sleep(2000);
	     
	     wu.scrolldown(driver);
	     
	     Thread.sleep(2000);
		
		lkp.getSubmitBtn().click();
		
		Thread.sleep(2000);
		
		wu.takeScreenShot(driver, "KYC Created PopUp");
		
		Thread.sleep(3000);
		
		
	}
}