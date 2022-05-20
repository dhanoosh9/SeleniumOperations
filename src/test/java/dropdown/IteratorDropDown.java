package dropdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IteratorDropDown {
	
	@Test
	public void iteratordropdown() throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		//driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("select[name='cars'] > option[value='volvo']")).click();
		List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"post-body-7988417473080013803\"]/div[1]/center/form[3]/select/option"));
		
		Iterator<WebElement> element = options.listIterator();
		
		while(element.hasNext()) {
			String value = element.next().getText();
			if(value.equalsIgnoreCase("Fiat")) {
				element.next().click();
			}
		}
		Thread.sleep(3000);
		
		driver.quit();
	}
	
}
