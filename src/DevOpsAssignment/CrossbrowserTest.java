package DevOpsAssignment;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;

public class CrossbrowserTest {
	/**
	 * @param bname
	 * @throws MalformedURLException
	 */
	public WebDriver driver;
	@Parameters({"bname"})
	@Test
	public void browerTest(String bname) throws MalformedURLException, InterruptedException {
		if (bname.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			Reporter.log("Test Execution on Chrome!", true);

			driver = new RemoteWebDriver(new URL(""), options);
			Reporter.log("Driver session established with server!", true);
		} else if (bname.equalsIgnoreCase("edge")) {
			EdgeOptions options = new EdgeOptions();
			Reporter.log("Test Execution on Edge!", true);

			driver = new RemoteWebDriver(new URL(""), options);
			Reporter.log("Driver session established with server!", true);
		}
		
		Thread.sleep(5000);
		driver.get("https://www.amazon.in/");
		System.out.println("Title is :" + driver.getTitle());
		Thread.sleep(10000);
		Reporter.log("Test Execution for Amazon Application!", true);
		
		driver.close();
		Reporter.log("Test Execution for Amazon Completed!", true);
	}
}
