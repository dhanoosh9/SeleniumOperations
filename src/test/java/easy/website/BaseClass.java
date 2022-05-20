package easy.website;

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
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
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
