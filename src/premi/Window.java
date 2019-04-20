package premi;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("(//div[@id='content']//a)[11]")).click();
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		for (String window : allWindows) {
			if(!window.equals(parentWindow))
			{
				System.out.println("Assistance window met");
				driver.switchTo().window(parentWindow);
			}
			
			else
				System.out.println("Parent Window met");
		}
		driver.quit();
	}

}
