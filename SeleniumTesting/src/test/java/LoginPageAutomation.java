import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageAutomation {
  @Test
  public void login() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
		driver.get("https://leetcode.com/accounts/login/");
		
		WebElement username = driver.findElement(By.id("id_login"));
		WebElement password = driver.findElement(By.id("id_password"));
		WebElement login = driver.findElement(By.name("signin_btn"));
		
		username.clear();
		username.click();
		username.sendKeys("anandkumarjha318@gmail.com");
		
		password.clear();
		password.click();
		password.sendKeys("Babu9534178995");
		//driver.switchTo().alert().dismiss();
		login.click();
		
		String actualUrl = "https://leetcode.com/";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);

  }
}
