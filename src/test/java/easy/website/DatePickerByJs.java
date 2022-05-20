package easy.website;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DatePickerByJs extends BaseClass{

	@Test
	public void datepickerbyjs() {
		driver.findElement(By.xpath("(//a[contains(.,'Date pickers')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(.,'Bootstrap Date Picker')])[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"sandbox-container1\"]/div/span/i")).click();

		WebElement element=driver.findElement(By.xpath("//*[@id=\"sandbox-container1\"]//input"));
		String dateString="04/08/1996";
		datePcikerByJS(driver, dateString, element);
	}

	public void datePcikerByJS(WebDriver driver, String date,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+date+"')", element);
	}

}


