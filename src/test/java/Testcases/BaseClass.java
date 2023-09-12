package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public String baseURL="https://adactinhotelapp.com/index.php";
	public String username="mahesh23456";
	public String password="India@123";
	
	public static  WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		
//		ChromeOptions co=new ChromeOptions();
//		co.setHeadless(true);
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}

}
