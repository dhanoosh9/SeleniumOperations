package ati.website;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ComboBox extends BaseClass {
	
	@Test
	public void combobox() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"post-body-7988417473080013803\"]/div[1]/center/select[2]")).click();
		List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"post-body-7988417473080013803\"]/div[1]/center/select[2]/option"));
		String data = "html";
		for(WebElement ele : options) {
			String text = ele.getText();
			
			if(text.equalsIgnoreCase(data)) {
				ele.click();
			}
		}
		Thread.sleep(3000);
	}
	
}
