package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Page {

	
	 @FindBy (xpath = "//input[@formcontrolname='businessName']")private WebElement BuisnessNameEdt;
	 
	 @FindBy (xpath = "//input[@formcontrolname='personName']")private WebElement PersonFullNameEdt;
	 
	 @FindBy (xpath = "//input[@formcontrolname='email']")private WebElement EmailEdt;
	 
	 @FindBy (xpath = "//input[@formcontrolname='phone']")private WebElement PhoneNumberEdt;
	 
	 @FindBy (xpath = "//input[@formcontrolname='establishedDate']")private WebElement ShopEstablishDate;
	 
	 @FindBy (xpath = "//input[@formcontrolname='pincode']")private WebElement PincodeEdt;
	 
	 @FindBy (xpath = "(//input[@formcontrolname='circle'])[1]")private WebElement CircleCheckBox;
	 
	 @FindBy (xpath = "//textarea[@formcontrolname='businessAddress']")private WebElement BuisinessAddressEdt;
	 
	 @FindBy (xpath = "//button[.=' Register ']")private WebElement RegisterBtn;
	 
	 
	 public Registration_Page(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	 }


	public WebElement getBuisnessNameEdt() {
		return BuisnessNameEdt;
	}
	public WebElement getPersonFullNameEdt() {
		return PersonFullNameEdt;
	}
	public WebElement getEmailEdt() {
		return EmailEdt;
	}
	public WebElement getPhoneNumberEdt() {
		return PhoneNumberEdt;
	}
	public WebElement getShopEstablishDate() {
		return ShopEstablishDate;
	}
	public WebElement getPincodeEdt() {
		return PincodeEdt;
	}
	public WebElement getCircleCheckBox() {
		return CircleCheckBox;
	}
	public WebElement getBuisinessAddressEdt() {
		return BuisinessAddressEdt;
	}
	public WebElement getRegisterBtn() {
		return RegisterBtn;
		
		
	}
		
}
