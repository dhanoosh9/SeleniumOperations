package web_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {


	@Test
	public void dyanmicwebtable() {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='leftcontainer']"));

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		int rowcount = rows.size();
		System.out.println("No. of rows: " + rowcount);

		for(int i=1;i<=rowcount;i++) {
			List<WebElement> columns = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+ i +"]/td"));
			int colcount = columns.size();
			//System.out.println("No. of columns: "+ colcount);
			for(int j=1;j<=colcount;j++) {
				System.out.print(driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+ i +"]/td["+ j +"]"))
						.getText()+"    ");
			}
			System.out.println();
		}

		driver.quit();
	}

}
