package easy.website;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties prop;
	public ReadConfig() {
		try {
			FileInputStream input = new FileInputStream("C:\\Users\\dhano\\Desktop\\eclipse-workspace\\SeleniumOperations\\Configuration\\config.properties");
			prop = new Properties();
			prop.load(input);
		} catch(Exception e) {
			System.out.println("File not found");
		}
	}
	
	public String getbrowser() {
		String browser = prop.getProperty("browser");
		return browser;
	}
	
	public String geturl() {
		String url = prop.getProperty("baseURL1");
		return url;
	}
	public static void main(String[] args) {
		ReadConfig readconfig = new ReadConfig();
		System.out.println(readconfig.getbrowser());
		System.out.println(readconfig.geturl());
	}
}
