package page;

import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void abriSite() {
		this.driver.get("https://www.apple.com/br/");
		this.driver.manage().window().maximize();

	}

}
