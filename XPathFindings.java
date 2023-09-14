package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class XPathFindings {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balak\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("balakrishnankanagaraj43@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Kanagaraj@300");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}

	

}

