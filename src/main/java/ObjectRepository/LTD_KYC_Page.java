package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LTD_KYC_Page {

	 @FindBy(xpath = "//option[.='Select Type']")private WebElement SelectTypeDropDown;
	 @FindBy(xpath = "//option[.='LTD']")private WebElement LtdOption;
	 @FindBy(xpath = "//input[@formcontrolname='director_nameone']")private WebElement FirstdirectorNameEdt;
	 @FindBy(xpath = "//input[@formcontrolname='director_mobile']")private WebElement DirectorMobileNumEdit;
	 @FindBy(xpath = "//input[@formcontrolname='director_aadharone']")private WebElement DirectorAdharNumEdit;
	 @FindBy(xpath = "//input[@formcontrolname='director_aadhar_front_imageone']")private WebElement AdharFrontImg;
	 @FindBy(xpath = "//input[@formcontrolname='director_aadhar_back_imageone']")private WebElement AdharBackImg;
	 @FindBy(xpath = "//input[@formcontrolname='director_panone']")private WebElement DirectorPanNumEdit;
	 @FindBy(xpath = "//input[@formcontrolname='director_pan_imageone']")private WebElement DirectorPanImg;
	 @FindBy(xpath = "//input[@formcontrolname='director_nametwo']")private WebElement SecondDirectorNameEdit;
	 @FindBy(xpath = "//input[@formcontrolname='director_aadhartwo']")private WebElement SecondDirectorAdharNumEdit;
	 @FindBy(xpath = "//input[@formcontrolname='director_aadhar_front_imagetwo']")private WebElement SeconfDirectorAdharFrontImg;
	 @FindBy(xpath = "//input[@formcontrolname='director_aadhar_back_imagetwo']")private WebElement SeconfDirectorAdharBackImg;
	 @FindBy(xpath = "//input[@formcontrolname='director_pantwo']")private WebElement SecondDirectorPanNumEdit;
	 @FindBy(xpath = "//input[@formcontrolname='director_pan_imagetwo']")private WebElement SecondDirectorPanImg;
	 @FindBy(xpath = "//input[@formcontrolname='director_gst']")private WebElement SecondDirectorGSTNumEdit;
	 @FindBy(xpath = "//input[@formcontrolname='director_gst_image']")private WebElement SecondDirectorGSTImg;
	 @FindBy(xpath = "//input[@formcontrolname='director_cin']")private WebElement SecondDirectorCINNumEdit;
	 @FindBy(xpath = "//input[@formcontrolname='cin_number_image']")private WebElement SecondDirectorCINImg;
	 @FindBy(xpath = "//input[@formcontrolname='bank_name']")private WebElement DirectorBankNameEdit;
	 @FindBy(xpath = "//input[@formcontrolname='account_number']")private WebElement DirectorAccountNumEdit;
	 @FindBy(xpath = "//input[@formcontrolname='ifsc_code']")private WebElement DirectorIFSCCodeEdit;
	 @FindBy(xpath = "//input[@formcontrolname='account_holder_name']")private WebElement AccountHolderNameEdit;
	 @FindBy(xpath = "//button[.='Submit']")private WebElement SubmitBtn;
	 
	 
	 
	 
	 public LTD_KYC_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	 public WebElement getSelectTypeDropDown() {
		return SelectTypeDropDown;
	}
	 public WebElement getLtdOption() {
		return LtdOption;
	}
	 public WebElement getFirstdirectorNameEdt() {
		return FirstdirectorNameEdt;
	}
	 public WebElement getDirectorMobileNumEdit() {
		return DirectorMobileNumEdit;
	}
	 public WebElement getDirectorAdharNumEdit() {
		return DirectorAdharNumEdit;
	}
	 public WebElement getAdharFrontImg() {
		return AdharFrontImg;
	}
	 public WebElement getAdharBackImg() {
		return AdharBackImg;
	}
	 public WebElement getDirectorPanNumEdit() {
		return DirectorPanNumEdit;
	}
	 public WebElement getDirectorPanImg() {
		return DirectorPanImg;
	}
	 public WebElement getSecondDirectorNameEdit() {
		return SecondDirectorNameEdit;
	}
	 public WebElement getSecondDirectorAdharNumEdit() {
		return SecondDirectorAdharNumEdit;
	}
	 public WebElement getSeconfDirectorAdharFrontImg() {
		return SeconfDirectorAdharFrontImg;
	}
	 public WebElement getSeconfDirectorAdharBackImg() {
		return SeconfDirectorAdharBackImg;
	}
	 public WebElement getSecondDirectorPanNumEdit() {
		return SecondDirectorPanNumEdit;
	}
	 public WebElement getSecondDirectorPanImg() {
		return SecondDirectorPanImg;
	}
	 public WebElement getSecondDirectorGSTNumEdit() {
		return SecondDirectorGSTNumEdit;
	}
	 public WebElement getSecondDirectorGSTImg() {
		return SecondDirectorGSTImg;
	}
	 public WebElement getSecondDirectorCINNumEdit() {
		return SecondDirectorCINNumEdit;
	}
	 public WebElement getSecondDirectorCINImg() {
		return SecondDirectorCINImg;
	}
	 public WebElement getDirectorBankNameEdit() {
		return DirectorBankNameEdit;
	}
	 public WebElement getDirectorAccountNumEdit() {
		return DirectorAccountNumEdit;
	}
	 public WebElement getDirectorIFSCCodeEdit() {
		return DirectorIFSCCodeEdit;
	}
	 public WebElement getAccountHolderNameEdit() {
		return AccountHolderNameEdit;
	}
	 public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
	
} 