package Testcases;

import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class TC_Login_001 extends BaseClass {
	
	@Test
	public void logintest() {
		
		driver.get(baseURL);
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickLoginbtn();
		
		
	}

}
