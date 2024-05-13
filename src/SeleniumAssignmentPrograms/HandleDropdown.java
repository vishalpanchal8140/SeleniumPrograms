package SeleniumAssignmentPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		
		WebElement crtact = driver.findElement(By.linkText("Create Account"));
		crtact.click();
		
		WebElement drpList = driver.findElement(By.id("country"));
		Select countries = new Select(drpList);
		
		System.out.println("Selected Country Before :" + countries.getFirstSelectedOption().getText());
		
		countries.selectByVisibleText("Canada");
		System.out.println("Selected Country After :" + countries.getFirstSelectedOption().getText());
		
//		driver.close();
	}

}
