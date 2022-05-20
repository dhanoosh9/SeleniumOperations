package easy.website;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DatePickerJQ extends BaseClass {

	@Test
	public void datepickerjq() throws InterruptedException {

		driver.findElement(By.xpath("(//a[contains(.,'Date pickers')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(.,'JQuery Date Picker')])[1]")).click();
		driver.findElement(By.id("from")).click();
		Thread.sleep(3000);
		String month = "Feb";
		String year = "2020";
//		Select select = new Select(driver.findElement(By.cssSelector("select[data-handler='selectMonth']")));
//		select.selectByValue(month);
		driver.findElement(By.cssSelector("select[data-handler='selectMonth']")).click();
		List<WebElement> options = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']//select/option"));

		for(WebElement ele : options) {
			String text = ele.getText();

			//String years = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span")).getText();
				if(text.equalsIgnoreCase(month)) {
					ele.click();
				}
	
			else {
				driver.findElement(By.xpath("//span[contains(.,'Prev')]")).click();
			}
		}

		//*[@id="ui-datepicker-div"]/div/div/span
	}

}


