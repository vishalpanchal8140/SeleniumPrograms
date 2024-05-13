package SeleniumAssignmentPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationFormValidate {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/automation-practice-form");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("test");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("test123");

		WebElement gender = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
		gender.click();		

		WebElement mbNumber = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mbNumber.sendKeys("1234567890");
		
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[@id='submit']")));
		
		WebElement successMessage = driver.findElement(By.xpath("//div[@id='example-modal-sizes-title-lg']"));
        if (successMessage.isDisplayed()) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed!");
        }
        
        driver.close();
	}

}
