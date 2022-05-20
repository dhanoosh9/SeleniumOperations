package ati.website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	ReadConfig readconfig = new ReadConfig();
	String browserName = readconfig.getbrowser();
	String baseURL = readconfig.geturl();
	
	
	@BeforeClass
	public void setUp() {
		
		switch(browserName) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
		}
		
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();

		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
