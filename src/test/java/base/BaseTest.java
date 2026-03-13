package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTest {
	
	public static WebDriver driver;
	
	public void setup() {
		
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
	}

	public void tearDown() {
		//driver.quit();
	}
}
