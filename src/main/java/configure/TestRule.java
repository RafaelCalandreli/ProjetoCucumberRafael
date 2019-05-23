package configure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.Before;

public class TestRule {

	private static WebDriver driver;

	@Before
	public void beforeCenario() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver74/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
	
		options.addArguments("user-data-dir=C:/Users/Rafael Calandreli/AppData/Local/Google/Chrome/User Data");
		
		
		// Iniciar o Driver
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate()
				.to("file:///C:/Users/Rafael%20Calandreli/Desktop/WK56/versc3a3o-2/Vers%C3%A3o%202/index.html");
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
