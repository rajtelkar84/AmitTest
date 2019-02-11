package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	public static WebDriver driver = null;
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TelkarRa\\Desktop\\Eclipse\\gecko\\geckodriver.exe");
	    driver = new FirefoxDriver();
		driver.get("http://cdldevretws01:99/SponsorSecure_Net/");
		Thread.sleep(5000);
	   // throw new PendingException();
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 // Write code here that turns the phrase above into concrete actions
		boolean userNameDis=driver.findElement(By.id("txtUserID")).isDisplayed();
		System.out.println(userNameDis);
	   // throw new PendingException();
	}

	@When("^User User enters UserName Password$")
	public void user_User_enters_UserName_Password() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUserID")).sendKeys("fip1111");
		driver.findElement(By.name("PIN")).sendKeys("adpadp09");
		driver.findElement(By.id("_ctl0_PageContent_Submit1")).click();
	}

	@When("^User Enters \"([^\"]*)\"$")
	public void user_Enters(String planNo) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		driver.findElement(By.id("PlanNum")).sendKeys(planNo);
		driver.findElement(By.id("_ctl0_PageContent_Submit1")).click();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(20000);
	    String planNum=driver.findElement(By.className("CSR-Id-No")).getText();
	    System.out.println(planNum);
	}

	@Then("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
		System.out.println("logoutSUccessfully");
	}

}
