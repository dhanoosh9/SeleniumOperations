package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Validation {
	
	@Test
	public void test() {
		
		String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		
		String[] exp = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		
		for(int i=0;i<exp.length;i++) {
			Assert.assertTrue(months[i].equals(exp[i]));
			System.out.println("Actual: "+months[i]+"  "+"Expected: "+exp[i]);
//			if(months[i].equals(exp[i])) {
//				System.out.println("Actual: "+months[i]+"  "+"Expected: "+exp[i]);
//			}
//			else
//			{
//				System.out.println("Actual: "+months[i]+" Not matched "+"Expected: "+exp[i]);
//			}
		}
		
	}
	
	
}
