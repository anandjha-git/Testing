package loginSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
			
			driver.manage().window().maximize();
			driver.get("https://leetcode.com/accounts/login/");
			
			WebElement username = driver.findElement(By.id("id_login"));
			WebElement password = driver.findElement(By.id("id_password"));
			WebElement login = driver.findElement(By.id("signin_btn"));
			//Entering credentials
			System.out.println("Login Automation Started....");
			username.clear();//clear id_login field if any filled
			username.click();
			username.sendKeys("anandalfa@gmail.com");//use your email id
			System.out.println("Username is Entered.");
			
			password.clear();//clear id_password field if any filled
			password.click();
			password.sendKeys("Alfa@1234");// use your password
			System.out.println("Password is Entered");
			login.click();
			System.out.println("Clicked On Login Button");
			


	}

}
