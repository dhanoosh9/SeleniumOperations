package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	@Test(dataProvider = "testData")
	public void myLoginTest(String username, String password, String email) {

		System.out.println("This is My username " + username + "This is my Password " + password);

	}

	@DataProvider
	public Object[][] testData() {
		Object[][] credentials = { { "admin1", "password1", "test@gmail.com" },
				{ "admin2", "password2", "test@gmail.com" }, { "admin3", "password3","test@gmail.com" } };
		return credentials;
	}

}
