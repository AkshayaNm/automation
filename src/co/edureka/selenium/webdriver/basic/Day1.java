package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import newproject.PG2;



public class Day1 {
WebDriver driver;
public void invokeBrowser(){
try {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://www.edureka.co");
	
} catch (Exception e) {
	
	e.printStackTrace();
}
}
	public static void main(String[] args) {
		//PG2 pg2 = new PG2();
		Day1 myObj = new Day1();
		myObj.invokeBrowser();
	}

}
