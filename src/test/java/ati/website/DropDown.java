package ati.website;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import easy.website.BaseClass;

public class DropDown extends BaseClass{
	
	@Test
	public void dropdown() {
		
		Select select = new Select(driver.findElement(By.name("cars")));
		select.selectByValue("fiat");
		
	}
	
}
