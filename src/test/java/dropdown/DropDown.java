package dropdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	@Test
	public void dropdown() throws InterruptedException {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@id='bootstrapmenu']")).click();

		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));

				for(WebElement element:options) {
					String value = element.getText();
					System.out.println(value);
					
					if(value.equalsIgnoreCase("contact us")) {
						element.click();
						break;
					}
				}


		driver.quit();
	}
}
