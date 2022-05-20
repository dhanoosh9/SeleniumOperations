package easy.website;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DatePicker extends BaseClass {

	@Test
	public void datepicker() throws InterruptedException {
		driver.findElement(By.xpath("(//a[contains(.,'Date pickers')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(.,'Bootstrap Date Picker')])[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"sandbox-container1\"]/div/span/i")).click();

		String expmonth = "February 2019";

		String day = "10";

		while(true) {
			String month =driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[2]")).getText();
			if(month.equalsIgnoreCase(expmonth)) {
				break;
			}
			else {
				driver.findElement(By.xpath("(//th[@class='prev'])[1]")).click();
			}
		}

		driver.findElement(By.xpath("//table/tbody/tr/td[contains(text(),"+day+")]")).click();
		
		Thread.sleep(3000);
	}

}
