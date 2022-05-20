package ati.website;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MultipleWindows extends BaseClass {
	
	@Test
	public void multiplewindow() throws InterruptedException {
		String parent = driver.getWindowHandle();
		driver.findElement(By.id("windowhandling1")).click();

		Set<String>s=driver.getWindowHandles();

		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());
		Thread.sleep(3000);
		driver.close();
		}

		}
		driver.switchTo().window(parent);
		
		
	}
	
}
