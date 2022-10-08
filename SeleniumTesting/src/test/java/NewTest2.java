import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest2 {
	String driverPath="D:\\Testing\\chromedriver_win32\\chromedriver.exe";
	public WebDriver driver;
  @Test 
  public void f() throws InterruptedException {
	  driver.get("https://login.yahoo.com/");
	  System.out.println("The title of the page is :"+ driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
