package mavenTutorial.com.Sample_mvn_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class SeleniumTest {
	@Test
	public void BrowserAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver_win32 (1)\\\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

}
