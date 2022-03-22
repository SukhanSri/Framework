package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	WebDriver driver = null;
	By textbox_search = By.name("q");
	By button_searcch = By.name("btnk");
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	public void setTextInSearchBox(String TextSearch) {
		driver.findElement(textbox_search).sendKeys(TextSearch);
		driver.findElement(textbox_search).sendKeys(Keys.RETURN);
	}
	public void clickSearchButton() {
		driver.findElement(button_searcch).sendKeys(Keys.RETURN);
	}
}
