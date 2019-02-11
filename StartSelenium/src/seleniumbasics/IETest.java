package seleniumbasics;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETest {
	
	public static void main(String args[])
	{
		
		String service = "C:\\Users\\TelkarRa\\Desktop\\Eclipse\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", service);
		InternetExplorerDriver  driver = new InternetExplorerDriver();
 
		driver.get("http://yahoo.com");
		System.out.println("HI");
	}

}
