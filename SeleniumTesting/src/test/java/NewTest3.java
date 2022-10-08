import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest3 {
	public String baseUrl="https://login.yahoo.com/";
	public String jspUrl="http:loclahost";
	String driverPath="D:\\Testing\\chromedriver_win32\\chromedriver.exe";
	public WebDriver driver;
  @Test
  public void f() {
	  //set the system property for Chrome driver
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  //create driver object for chrome browser
	  driver=new ChromeDriver();
	  driver.get(baseUrl);
	  //fetch all input elements from current web page
	  System.out.println("All Inputs");
	  List<WebElement> allInputElements=driver.findElements(By.tagName("input"));
	  for(WebElement e: allInputElements)
		  System.out.println(e.getAttribute("id"));
	  
	  System.out.println("All Divs");
	  List<WebElement> alldivElements=driver.findElements(By.tagName("div"));
	  for(WebElement e: alldivElements)
		  System.out.println(e.getAttribute("id"));
	  
	  System.out.println("All Class");
	  List<WebElement> allclassElements=driver.findElements(By.tagName("class"));
	  for(WebElement e: allclassElements)
		  System.out.println(e.getAttribute("id"));
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  System.out.println("after test");
  }

}
