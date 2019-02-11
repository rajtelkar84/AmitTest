package cucumberTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TelkarRa\\Desktop\\Eclipse\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		Thread.sleep(5000);
		driver.quit();


	}

}
