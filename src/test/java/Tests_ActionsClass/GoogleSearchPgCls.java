package Tests_ActionsClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;
public class GoogleSearchPgCls {
	private static WebDriver driver = null;
	
	@BeforeTest()
	public void SetUp() {
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test()
	public void googleSearch() {
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Abcd");
		GoogleSearchPage.textbox_search(driver).sendKeys(Keys.ENTER);
	}
	
	@AfterTest() 				
	public void TearDown() {
		driver.quit();
		driver.close();
		
	}
}
