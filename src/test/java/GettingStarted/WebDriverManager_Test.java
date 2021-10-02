package GettingStarted;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromiumDriverManager;

public class WebDriverManager_Test {
	
	public static void main(String[] args) throws InterruptedException {
		
//		WebDriverManager.chromedriver().setup();	Pass
//		WebDriverManager.firefoxdriver().setup();	Pass
//		WebDriverManager.edgedriver().setup();		Pass
//		WebDriverManager.operadriver().setup();		Pass
//		WebDriverManager.chromiumdriver().setup();	Pass
//		WebDriverManager.iedriver().setup();		Pass
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		Thread.sleep(2000);
//		driver.close();
		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver1 = new FirefoxDriver();
//		driver1.get("https://www.google.com");
//		Thread.sleep(2000);
//		driver1.close();
		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver2 = new EdgeDriver();
//		driver2.get("https://www.google.com");
//		Thread.sleep(5000);
//		driver2.close();
		
//		WebDriverManager.operadriver().setup();
//		WebDriver driver3 = new OperaDriver();
//		driver3.get("https://www.google.com");
//		Thread.sleep(5000);
//		driver3.close();
		
//		WebDriverManager.operadriver().setup();
//		WebDriver driver4 = new OperaDriver();
//		driver4.get("https://www.google.com");
//		Thread.sleep(5000);
//		driver4.quit();
		
		WebDriverManager.iedriver().setup();
		WebDriver driver5 = new InternetExplorerDriver();
		driver5.get("https://www.guru99.com");
		Thread.sleep(2000);
		driver5.close();
		
	}

}
