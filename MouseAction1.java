package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class MouseAction1 {

	private static WebElement txtNext;

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\balak\\\\OneDrive\\\\Desktop\\\\chromedriver-win64\\\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(capabilities);
			ChromeDriver driver = new ChromeDriver(options);
			
			driver.get("https://www.gmail.com/");
			Actions builder = new Actions(driver);
            Actions seriesOfActions = builder;
			
			WebElement txtUsername =driver.findElement(By.xpath("//input[@name='identifier']"));
			//Thread.sleep(3000);
			
			WebElement button =driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']"));
			//Thread.sleep(3000);
			

		               		builder.moveToElement(txtUsername)
		            
		                 .sendKeys("balakrishnankanagaraj43@gmail.com")

		                 .moveToElement(button)
		                 .click()
		                 .build().perform();
			
			WebElement password =driver.findElement(By.xpath("//div[@id='password']/div/div[@class='aXBtI Wic03c']/div[@class='Xb9hP']/input[@class='whsOnd zHQkBf']"));
			//Thread.sleep(3000);
			
			WebElement button2 =driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']"));          

		                
			
		                 
		                builder.moveToElement(password)
		                
		                 .sendKeys("Kanagaraj@300")
		                 .moveToElement(button2).click()
		                 .build()
		                 .perform();
		              
		}

	}

