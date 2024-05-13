package SeleniumAssignmentPrograms;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class POMLoginClient {
	WebDriver driver;
	TestLogin tl;
	
	@Test
	public void login() {
		tl.addUserName("student");
		tl.addPassword("Password123");
		tl.clickLogin();
		tl.showMessage();
	}
	
	@AfterMethod
	public void afterMethod() {
		tl.logout();
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		tl = new TestLogin(driver);
		
	}
}
