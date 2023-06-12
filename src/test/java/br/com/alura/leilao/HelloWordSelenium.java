package br.com.alura.leilao;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class HelloWordSelenium {

	@Test
	public void hello() {
//		System.setProperty("webdriver.chrome.driver","pathto\\chromedriver.exe");



		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver_win32\\chromedriver.exe"); // diz onde está o driver

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);

		WebDriver browser = new ChromeDriver(this.method());


//		WebDriver driver = new ChromeDriver(options);
//		driver.get(url);

		browser.navigate().to("http://localhost:8080/leiloes"); // faz a navegação
		browser.quit(); //
	}

	public ChromeOptions method() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("--no-sandbox");
		System.setProperty("webdriver.chrome.args", "--disable-logging");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		options.setBinary("/pointing/downloaded/driver/path/in/automationsuite");
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("disable-infobars"); // disabling infobars
		options.addArguments("--disable-extensions"); // disabling extensions
		options.addArguments("--disable-gpu"); // applicable to windows os only
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("window-size=1024,768"); // Bypass OS security model
		options.addArguments("--log-level=3"); // set log level
		options.addArguments("--silent");//
		options.setCapability("chrome.verbose", false); //disable logging

		return options;
	}




}
