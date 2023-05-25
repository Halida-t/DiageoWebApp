package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import utilities.driver;



public class DiageoWebApplicationLoginPage {
   
	public DiageoWebApplicationLoginPage() {
		PageFactory.initElements(driver.getDriver(), this);
	}


    // Diageo Web Application page elements

	@FindBy (xpath = "//button[@type='button']")
	public WebElement Loginbtn;
	
	@FindBy (xpath = "//input[@name = 'login']")
	public WebElement emailbox;
	
	@FindBy (xpath = "//input[@name = 'password']")
	public WebElement password;
	
	@FindBy (css = ".'v-list-item_title'contains('Dashboard')")
	public WebElement dashboard;
	
	
	
	
			

}


