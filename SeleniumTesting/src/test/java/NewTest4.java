import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest4 {
	WebDriver driver;

	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Testing\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");

	}

	public void searchProduct() throws InterruptedException {

		Thread.sleep(5000);

		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("JBL Speakers");

		driver.findElement(By.cssSelector("#gh-btn")).click();

		Thread.sleep(5000);

		driver.findElement(By.cssSelector("#gh-p-1 > a")).click();

		System.out.println("The title of the page is :" + driver.getTitle());

	}

	public void navigate() throws InterruptedException {

		Thread.sleep(5000);

		driver.navigate().to("https://www.simplilearn.com/");

		Thread.sleep(5000);

		driver.navigate().back();

	}

	public void closeBrowser() {

		driver.quit();

	}
  @Test
  public void f() {
	  NewTest4 obj = new NewTest4();
	  try {
			obj.launchBrowser();

			obj.searchProduct();

			obj.navigate();

			obj.closeBrowser();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
  }
}
