package ati.website;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import easy.website.BaseClass;

public class CheckBox extends BaseClass{
	
	@Test
	public void checkbox() {
		
		
		for(int i=4;i<=7;i++) {
			driver.findElement(By.xpath("//*[@id=\"post-body-7988417473080013803\"]/div[1]/center/input["+ i +"]")).click();
		}
		
	}
	
}
