package web_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenTable {
	
	@Test
	public void maventable() throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://mvnrepository.com/artifact/junit/junit");
		driver.manage().window().maximize();
		
		List<WebElement> tbody = driver.findElements(By.xpath("//*[@id='snippets']/div/div/div/table/tbody"));
		int tbodycount = tbody.size();
		System.out.println(driver.findElement(By.xpath("//*[@id='snippets']/div/div/div/table/tbody[1]/tr[1]/td[6]")).getText());
		for(int i=1;i<=tbodycount;i++) {
			List<WebElement> rows = driver.findElements(By.xpath("//*[@id='snippets']/div/div/div/table/tbody[" +i+ "]/tr"));
			int rowcount = rows.size();
			for(int j=1;j<=rowcount;j++) {
				List<WebElement> columns = driver.findElements(By.xpath("//*[@id='snippets']/div/div/div/table/tbody"
						+ "["+ i +"]/tr["+ j +"]/td"));
				int colcount =columns.size();
				System.out.println("No. of columns: "+ colcount);
				for(int k=1;k<=colcount;k++) {
					System.out.print(driver.findElement(By.xpath("//*[@id='snippets']/div/div/div/table/tbody"
							+ "["+ i +"]/tr["+ j +"]/td["+ k +"]")).getText()+"  ");
					//Thread.sleep(1000);
				}
				System.out.println();
			}
			
		}
		driver.quit();
	}
	
}
