package SeleniumAssignmentPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestLogin {
	WebDriver driver;
	
	public TestLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addUserName(String un)
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	}

	public void addPassword(String ps)
	{
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
	}
	
	public void clickLogin()
	{
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}
	
	public void showMessage()
	{
		System.out.println(driver.findElement(By.xpath("//h1[@class='post-title']")).getText());
	}
	
	public void logout()
	{
		driver.findElement(By.partialLinkText("Log")).click();
	}
}
