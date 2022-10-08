import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class WaitTest {
	private WebDriver driver;
	private String baseUrl;
	private WebElement element;
	
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl="https://www.google.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
  @Test
  public void testUntitled() throws Exception {
	  driver.get(baseUrl);
	  element=driver.findElement(By.id("lst-ib"));
	  element.sendKeys("Selenium Webdriver interview question");
	  element.sendKeys(Keys.RETURN);
	  List<WebElement> list = driver.findElements(By.className("_Rm"));
		System.out.println(list.size());
	  
	  
  }
  @AfterMethod
  public void tearDown() throws Exception {
		driver.quit();
	}

}
