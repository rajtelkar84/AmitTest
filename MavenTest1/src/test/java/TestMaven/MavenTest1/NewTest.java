package TestMaven.MavenTest1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println("hi");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("ee");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("nan");
  }

}
