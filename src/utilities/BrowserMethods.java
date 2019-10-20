package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserMethods extends Config {
	String Browser;

	public void setup(String BrowserName) throws IOException, InterruptedException {
		this.Browser = BrowserName;
		switch (Browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\dependency jar\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\dependency jar\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("There is no browser");
			break;
		}

		System.getProperty("user.dir");
		Properties obj = new Properties();
		FileInputStream fin = new FileInputStream(System.getProperty("user.dir") + "\\variablefile.properties");
		obj.load(fin);
	}

	public void get(String url) {
		driver.get(url);
	}

	public void getCurrentUrl() {
		driver.getCurrentUrl();
	}

	public void getPageSource() {
		driver.getPageSource();
	}

	public void close() {
		driver.close();
	}

	public void quit() {
		driver.quit();
	}
}
