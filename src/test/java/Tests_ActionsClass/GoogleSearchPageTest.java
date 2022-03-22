package Tests_ActionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.GoogleSearchPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchPageTest {
	
	WebDriver drive=null;
	public static void main(String[] args) {
		
		googleSearchTest();
	}
	
	public static void googleSearchTest() {
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		GoogleSearchPageObjects obj = new GoogleSearchPageObjects(driver);
		driver.get("https://google.com");
		obj.setTextInSearchBox("abcd");
		
		obj.clickSearchButton();
		
	}
	
}
