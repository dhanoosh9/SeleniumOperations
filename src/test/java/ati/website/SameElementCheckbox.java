package ati.website;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SameElementCheckbox extends BaseClass {
	
	@Test
	public void samelementcheckbox() {
		
		List<WebElement> all = driver.findElements(By.xpath("//input[@name='chk']"));
		
		for(WebElement ele : all) {
			ele.click();
		}
		
	}
	
}
