package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LLP_Kyc_Page {

	@FindBy (xpath = "//option[.='LLP']") private WebElement LlpLnk;
	@FindBy (xpath = "//input[@formcontrolname='director_name']") private WebElement DirectorNameEdt;
	@FindBy (xpath = "//input[@formcontrolname='director_mobile']") private WebElement DirectorMobileNumEdt;
	@FindBy (xpath = "//input[@formcontrolname='director_aadhar']") private WebElement DirectorAdharNumEdt;
	@FindBy (xpath = "//input[@formcontrolname='director_aadhar_front_image']") private WebElement DirectorAdharFrontImgLnk;
	@FindBy (xpath = "//input[@formcontrolname='director_aadhar_back_image']") private WebElement DirectorAdharBackImgLnk;
	@FindBy (xpath = "//input[@formcontrolname='director_pan']") private WebElement DirectorPanEdt;
	@FindBy (xpath = "//input[@formcontrolname='director_pan_image']") private WebElement DirectorPanImg;
	@FindBy (xpath = "//input[@formcontrolname='director_gst']") private WebElement DirectorGstNumEdt;
	@FindBy (xpath = "//input[@formcontrolname='director_gst_image']") private WebElement DirectorGstImg;
	@FindBy (xpath = "//input[@formcontrolname='director_cin']") private WebElement DirectorCinNumEdt;
	@FindBy (xpath = "//input[@formcontrolname='cin_number_image']") private WebElement DirectorCinImg;
	@FindBy (xpath = "//input[@formcontrolname='profile_picture']") private WebElement DirectorImg;
	@FindBy (xpath = "//input[@formcontrolname='bank_name']") private WebElement BankNameEdt;
	@FindBy (xpath = "//input[@formcontrolname='account_number']") private WebElement AccontNumberEdt;
    @FindBy (xpath = "//input[@formcontrolname='ifsc_code']") private WebElement IfscCodeEdt;
    @FindBy (xpath = "//input[@formcontrolname='account_holder_name']") private WebElement AccountHolderNameEdt;
    @FindBy (xpath = "//button[.='Submit']") private WebElement SubmitBtn;
    
    
    public LLP_Kyc_Page(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }


	public WebElement getLlpLnk() {
		return LlpLnk;
	}
	public WebElement getDirectorNameEdt() {
		return DirectorNameEdt;
	}
	public WebElement getDirectorMobileNumEdt() {
		return DirectorMobileNumEdt;
	}
	public WebElement getDirectorAdharNumEdt() {
		return DirectorAdharNumEdt;
	}
	public WebElement getDirectorAdharFrontImgLnk() {
		return DirectorAdharFrontImgLnk;
	}
	public WebElement getDirectorAdharBackImgLnk() {
		return DirectorAdharBackImgLnk;
	}
	public WebElement getDirectorPanEdt() {
		return DirectorPanEdt;
	}
	public WebElement getDirectorPanImg() {
		return DirectorPanImg;
	}
	public WebElement getDirectorGstNumEdt() {
		return DirectorGstNumEdt;
	}
	public WebElement getDirectorGstImg() {
		return DirectorGstImg;
	}
	public WebElement getDirectorCinNumEdt() {
		return DirectorCinNumEdt;
	}
	public WebElement getDirectorCinImg() {
		return DirectorCinImg;
	}
	public WebElement getDirectorImg() {
		return DirectorImg;
	}
	public WebElement getBankNameEdt() {
		return BankNameEdt;
	}
	public WebElement getAccontNumberEdt() {
		return AccontNumberEdt;
	}
	public WebElement getIfscCodeEdt() {
		return IfscCodeEdt;
	}
	public WebElement getAccountHolderNameEdt() {
		return AccountHolderNameEdt;
	}
	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
	
}
