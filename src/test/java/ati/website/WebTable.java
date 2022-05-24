package ati.website;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class WebTable extends BaseClass{
	
	@Test
	public void webtable() {
		
		driver.findElement(By.xpath("//*[@id=\"post-body-7988417473080013803\"]/div[1]/center/table"));

		List<WebElement> rowcount = driver.findElements(By.xpath("//*[@id=\"post-body-7988417473080013803\"]/div[1]/center/table/tbody/tr"));
		System.out.println(rowcount.size());

		int rowsize = rowcount.size();

		List<WebElement> colcount = driver.findElements(By.xpath("//*[@id=\"post-body-7988417473080013803\"]/div[1]/center/table/tbody/tr/th"));
		System.out.println(colcount.size());

		int colsize = colcount.size();

		for(int i=2;i<=rowsize;i++) {
			for(int j=1;j<=colsize;j++) {
				System.out.print(driver.findElement(By.xpath("//*[@id=\"post-body-7988417473080013803\"]/div[1]/center/table/tbody/tr["+ i +"]/td["+ j +"]"))
						.getText()+" ");
			}
			System.out.println();
		}
		
	}
	
}
