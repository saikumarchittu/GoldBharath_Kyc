package Performing_Kyc;


import org.testng.annotations.Test;
import ObjectRepository.GoldBharath_After_Login;
import ObjectRepository.ProfilePage;
import ObjectRepository.Pvt_Ltd_Kyc_Page;
import genericUtility.BaseClass_GoldBharath;
import genericUtility.ExcelFileUtility;
import genericUtility.WebDriverUtility;

public class Pvt_Ltd_Kyc extends BaseClass_GoldBharath{

	@Test
	public void KycPage() throws Exception {
	    GoldBharath_After_Login gal=new GoldBharath_After_Login(driver);
		WebDriverUtility wu=new WebDriverUtility();
		ExcelFileUtility eu=new ExcelFileUtility();
		
		String dname=eu.readDataFromExcel("PVT_LTD_KYC", 4, 1);
		
		String MobileNum=eu.readDataFromExcel("PVT_LTD_KYC", 5, 1);
		
		String AdharNum=eu.readDataFromExcel("PVT_LTD_KYC", 6, 1);
		
		String AdharFrontImg=eu.readDataFromExcel("PVT_LTD_KYC", 7, 1);
		
		String AdharBackImg=eu.readDataFromExcel("PVT_LTD_KYC", 8, 1);
		
		String PanNum=eu.readDataFromExcel("PVT_LTD_KYC", 9, 1);
		
		String PanImg=eu.readDataFromExcel("PVT_LTD_KYC", 10, 1);
		
		String SecondDname=eu.readDataFromExcel("PVT_LTD_KYC", 11, 1);
		
		String SecondAdharNum=eu.readDataFromExcel("PVT_LTD_KYC", 12, 1);
		
		String SecondAdharFrontImg=eu.readDataFromExcel("PVT_LTD_KYC", 13, 1);
		
		String SecondAdharBackImg=eu.readDataFromExcel("PVT_LTD_KYC", 14, 1);
		
		String SecondPanNum=eu.readDataFromExcel("PVT_LTD_KYC", 15, 1);
		
		String SecondPanImg=eu.readDataFromExcel("PVT_LTD_KYC", 16, 1);
		
		String GstNum=eu.readDataFromExcel("PVT_LTD_KYC", 17, 1);
		
		String GstImg=eu.readDataFromExcel("PVT_LTD_KYC", 18, 1);
		
		String CinNum=eu.readDataFromExcel("PVT_LTD_KYC", 19, 1);
		
		String CinImg=eu.readDataFromExcel("PVT_LTD_KYC", 20, 1);
		
		String UploadImg=eu.readDataFromExcel("PVT_LTD_KYC", 21, 1);
		
		String BankName=eu.readDataFromExcel("PVT_LTD_KYC", 22, 1);
		
		String AccountNum=eu.readDataFromExcel("PVT_LTD_KYC", 23, 1);
		    
		String IfscCode=eu.readDataFromExcel("PVT_LTD_KYC", 24, 1);
		
		String HolderName=eu.readDataFromExcel("PVT_LTD_KYC", 25, 1);
		
		Thread.sleep(3000);
		
		gal.getProfileBtn().click();
		
		Thread.sleep(2000);
		
		ProfilePage pp=new ProfilePage(driver);
		
		pp.getKycLnk().click();
		
		
		Pvt_Ltd_Kyc_Page pkp=new Pvt_Ltd_Kyc_Page(driver);
		
		pkp.getPvtltdOption().click();
		
		Thread.sleep(2000);
		
		pkp.getDirectorNameEdit().sendKeys(dname);
		
		pkp.getDirectorMobileEdit().sendKeys(MobileNum);
		
		pkp.getDirectorAdharNumEdit().sendKeys(AdharNum);
		
		pkp.getUploadAdharFrontImg().sendKeys(AdharFrontImg);
		
		pkp.getUploadAdharBackImg().sendKeys(AdharBackImg);
		
		Thread.sleep(2000);
		wu.scrolldown(driver);
		Thread.sleep(2000);
		
		pkp.getDirectorPanNumEdit().sendKeys(PanNum);
		
		pkp.getDirectorPanImg().sendKeys(PanImg);
		
		pkp.getSecondDirectorNameEdit().sendKeys(SecondDname);
		
		pkp.getSecondDirectorAdharEdit().sendKeys(SecondAdharNum);
		
		pkp.getSecondDirectorFrontAdharImg().sendKeys(SecondAdharFrontImg);
		
		pkp.getSecondDirectorBackAdharImg().sendKeys(SecondAdharBackImg);
		
		Thread.sleep(2000);
		wu.scrolldown(driver);
		Thread.sleep(2000);
		
		pkp.getSecondDirectorPanNumEdit().sendKeys(SecondPanNum);
		
		pkp.getSecondDirectorPanImg().sendKeys(SecondPanImg);
		
		pkp.getDirectorGSTNumEdit().sendKeys(GstNum);
		
		pkp.getDirectorGSTImg().sendKeys(GstImg);
		
		pkp.getDirectorCINNumEdit().sendKeys(CinNum);
		
		pkp.getDirectorCINImg().sendKeys(CinImg);
		
		Thread.sleep(2000);
		wu.scrolldown(driver);
		Thread.sleep(2000);
		
		pkp.getUploadYourImg().sendKeys(UploadImg);
		
		pkp.getBankNameEdit().sendKeys(BankName);
		
		pkp.getAccountNumEdit().sendKeys(AccountNum);
		
		pkp.getIFSCCodeEdit().sendKeys(IfscCode);
		
		pkp.getAccountHolderNameEdit().sendKeys(HolderName);
		
		Thread.sleep(2000);
		wu.scrolldown(driver);
		Thread.sleep(2000);
		
		pkp.getSubmitBtn().click();
		
		Thread.sleep(2000);
		
		wu.takeScreenShot(driver, "Kyc Created PopUp");
		
		Thread.sleep(3000);
		
	}
	
}
