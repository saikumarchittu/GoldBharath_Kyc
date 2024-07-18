package Performing_Kyc;

import org.testng.annotations.Test;
import ObjectRepository.GoldBharath_After_Login;
import ObjectRepository.LTD_KYC_Page;
import ObjectRepository.ProfilePage;
import genericUtility.BaseClass_GoldBharath;
import genericUtility.ExcelFileUtility;
import genericUtility.WebDriverUtility;

public class LTD_KYC extends BaseClass_GoldBharath{

	@Test
	public void ltdKycTest() throws Exception 
	{
		WebDriverUtility wu=new WebDriverUtility();
		
		GoldBharath_After_Login gal=new GoldBharath_After_Login(driver);
		gal.getProfileBtn().click();
		ExcelFileUtility eu=new ExcelFileUtility();
		
		String Directorname=eu.readDataFromExcel("LTD_KYC", 4, 1);
		
		String Directornum=eu.readDataFromExcel("LTD_KYC", 5, 1);
		
		String AdharNum=eu.readDataFromExcel("LTD_KYC", 6, 1);
		
		String AdharFrontImg=eu.readDataFromExcel("LTD_KYC", 7, 1);
		
		String AdharBackImg=eu.readDataFromExcel("LTD_KYC", 8, 1);
		
		String PanNum=eu.readDataFromExcel("LTD_KYC", 9, 1);
		
		String PanImg=eu.readDataFromExcel("LTD_KYC", 10, 1);
		
		String SecondDirectorName=eu.readDataFromExcel("LTD_KYC", 11, 1);
		
		String SecondDirectorAdharNum=eu.readDataFromExcel("LTD_KYC", 12, 1);
		
		String SecondDirectorAdharFrontImg=eu.readDataFromExcel("LTD_KYC", 13, 1);
		
		String SecondDirectorAdharBackImg=eu.readDataFromExcel("LTD_KYC", 14, 1);
		
		String SecondDirectorPanNum=eu.readDataFromExcel("LTD_KYC", 15, 1);
		
		String SecondDirectorPanImg=eu.readDataFromExcel("LTD_KYC", 16, 1);
		
		String GstNum=eu.readDataFromExcel("LTD_KYC", 17, 1);
		
		String GstImg=eu.readDataFromExcel("LTD_KYC", 18, 1);
		
		String CinNum=eu.readDataFromExcel("LTD_KYC", 19, 1);
		
		String CinImg=eu.readDataFromExcel("LTD_KYC", 20, 1);
		
		String DirectorImg=eu.readDataFromExcel("LTD_KYC", 21, 1);
		
		String BankName=eu.readDataFromExcel("LTD_KYC", 22, 1);
		
		String AccountNum=eu.readDataFromExcel("LTD_KYC", 23, 1);
		
		String IFSCCode=eu.readDataFromExcel("LTD_KYC", 24, 1);
		
		String AccountHolderName=eu.readDataFromExcel("LTD_KYC", 25, 1);
		
		
		ProfilePage pp=new ProfilePage(driver);
		LTD_KYC_Page lkp=new LTD_KYC_Page(driver);
		Thread.sleep(3000);
		
		pp.getKycLnk().click();
		
		Thread.sleep(2000);
		
		lkp.getLtdOption().click();
		Thread.sleep(2000);
		
		lkp.getFirstdirectorNameEdt().sendKeys(Directorname);
		
		lkp.getDirectorMobileNumEdit().sendKeys(Directornum);
		
		lkp.getDirectorAdharNumEdit().sendKeys(AdharNum);
		
		lkp.getAdharFrontImg().sendKeys(AdharFrontImg);
		
		lkp.getAdharBackImg().sendKeys(AdharBackImg);
		
		Thread.sleep(2000);	
		wu.scrolldown(driver);
		Thread.sleep(2000);
		
		lkp.getDirectorPanNumEdit().sendKeys(PanNum);
		
		lkp.getDirectorPanImg().sendKeys(PanImg);
		
		lkp.getSecondDirectorNameEdit().sendKeys(SecondDirectorName);
		
		lkp.getSecondDirectorAdharNumEdit().sendKeys(SecondDirectorAdharNum);
		
		Thread.sleep(2000);
		wu.scrolldown(driver);
		Thread.sleep(2000);
		
		lkp.getSecondDirectorAdharFrontImg().sendKeys(SecondDirectorAdharFrontImg);
		
		lkp.getSecondDirectorAdharBackImg().sendKeys(SecondDirectorAdharBackImg);
		
		lkp.getSecondDirectorPanNumEdit().sendKeys(SecondDirectorPanNum);
		
		lkp.getSecondDirectorPanImg().sendKeys(SecondDirectorPanImg);
		
		lkp.getSecondDirectorGSTNumEdit().sendKeys(GstNum);
		
		Thread.sleep(2000);
		wu.scrolldown(driver);
		Thread.sleep(2000);
		
		lkp.getSecondDirectorGSTImg().sendKeys(GstImg);
		
		lkp.getSecondDirectorCINNumEdit().sendKeys(CinNum);
		
		lkp.getSecondDirectorCINImg().sendKeys(CinImg);
		
		lkp.getDirectorImg().sendKeys(DirectorImg);
		
		Thread.sleep(2000);
		wu.scrolldown(driver);
		Thread.sleep(2000);
		
		lkp.getDirectorBankNameEdit().sendKeys(BankName);
		
		lkp.getDirectorAccountNumEdit().sendKeys(AccountNum);
		
		lkp.getDirectorIFSCCodeEdit().sendKeys(IFSCCode);
		
		Thread.sleep(2000);
		wu.scrolldown(driver);
		Thread.sleep(2000);
		
		lkp.getAccountHolderNameEdit().sendKeys(AccountHolderName);
		
		lkp.getSubmitBtn().click();
		
		Thread.sleep(2000);
		wu.takeScreenShot(driver, "LTD Kyc Created PopUp");
		
		Thread.sleep(3000);
		
		
		
	}
	
}
