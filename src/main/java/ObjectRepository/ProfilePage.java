package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

	@FindBy (xpath = "//p[.='KYC']") private WebElement KycLnk;
	@FindBy (xpath = "//p[.='Orders']") private WebElement OrdersLnk;
	
	public ProfilePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getKycLnk() {
		return KycLnk;
	}
	public WebElement getOrdersLnk() {
		return OrdersLnk;
	}
	
}
