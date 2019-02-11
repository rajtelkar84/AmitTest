package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GeckoTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TelkarRa\\Desktop\\Eclipse\\gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("https:facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("rajtelkar84@gmail.com");
 
		Thread.sleep(5000);
		driver.quit();
       
		System.out.println("Hi");
	}

}
