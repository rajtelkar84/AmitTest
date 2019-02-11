package seleniumbasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadExample {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TelkarRa\\Desktop\\Eclipse\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		  
		  System.out.println(js.executeScript("return document.readyState"));
		  System.out.println(js.executeScript("return document.domain;"));
		//  js.executeScript("$('ul.menus.menu-secondary.sf-js-enabled.sub-menu li').hover()");
		  driver.close();
		  //Initially bellow given if condition will check ready state of page.
		/*  if (js.executeScript("return document.readyState").toString().equals("complete")){ 
		   System.out.println("Page Is loaded.");
		   return; 
		  } */
	}

}
