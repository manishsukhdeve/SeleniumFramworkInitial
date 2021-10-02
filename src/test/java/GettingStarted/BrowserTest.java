package GettingStarted;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserTest {
	
	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
//		System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
//		System.setProperty("webdriver.edge.driver", "/path/to/msedgedriver");
//		System.setProperty("webdriver.opera.driver", "/path/to/operadriver");
//		System.setProperty("webdriver.ie.driver", "C:/path/to/IEDriverServer.exe");
		
//		Fire fox Browser
		
//		String PropertyPath = System.getProperty("user.dir");
//		System.out.println("Propertypath : " + PropertyPath);
//		System.setProperty("webdriver.gecko.driver", PropertyPath + "\\driver\\FirefoxDriver\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://manishtesting2018.wixsite.com/manishresume");
//		Thread.sleep(2000);
//		driver.close();
//		System.out.println("TestCase-Pass");
//		---------------------------------------------------------------------------------------------------------
		
//		Chrome Browser
		
//		String PropertyURL = System.getProperty("user.dir");
//		System.out.println("PropertyURL : " + PropertyURL);
//		System.setProperty("webdriver.chrome.driver", PropertyURL + "\\driver\\ChromeDriver\\chromedriver.exe");
//		WebDriver driver1 = new ChromeDriver();
//		driver1.get("https://www.google.com");
//		Thread.sleep(2000);
//		driver1.close();
//		System.out.println("TestCase-Pass");
//		---------------------------------------------------------------------------------------------------------
		
//		Internet Explorer Browser
		
//		String iepath = System.getProperty("user.dir");
//		System.out.println("Internet Explorer Path : " + iepath);
//		System.setProperty("webdriver.ie.driver", iepath + "\\driver\\InternetExplorer\\IEDriverServer.exe");
//		InternetExplorerDriver driver2 = new InternetExplorerDriver();
//		driver2.get("https://www.guru99.com");
//		Thread.sleep(2000);
//		driver2.close();
//		System.out.println("TestCase-Pass");
//		---------------------------------------------------------------------------------------------------------
		
//		Edge Browser
		
//		String edgepath = System.getProperty("user.dir");
//		System.out.println(edgepath);
//		System.setProperty("webdriver.edge.driver", edgepath + "\\driver\\EdgeDriver\\msedgedriver.exe");
//		EdgeDriver driver3 = new EdgeDriver();
//		driver3.get("https://www.guru99.com");
//		Thread.sleep(2000);
//		driver3.close();
//		---------------------------------------------------------------------------------------------------------
		
//		Opera Browser
		
		String opra = System.getProperty("user.dir");
		System.out.println(opra);
		System.setProperty("webdriver.opera.driver", opra + "\\driver\\OperaDriver\\operadriver.exe");
		OperaDriver driver4 = new OperaDriver();
		driver4.get("https://www.guru99.com");
		Thread.sleep(2000);
		driver4.close();
//		---------------------------------------------------------------------------------------------------------
		
	}

}
