package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
	
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);		
	}
	
	
	@FindBy(id="username")
	WebElement txtusername;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="login")
	WebElement btnLogin;
	
	public void setUsername(String uname) {
		txtusername.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtpassword.sendKeys(pwd);
	}
	
	public void clickLoginbtn() {
		btnLogin.click();
	}

}
