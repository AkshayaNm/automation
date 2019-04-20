package newproject;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[11]")).click();
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println(parentWindowHandle.toString());
		driver.findElement(By.id("home")).click();
		driver.switchTo().defaultContent();
		/*Set<String> windowHandles1 = driver.getWindowHandles();
		System.out.println(windowHandles1.size());
		for(String window : windowHandles1)
		{
			if(!(window.equals(parentWindowHandle)))
			{
				System.out.println("assistance window met");
				//driver.close();
				driver.switchTo().window(parentWindowHandle);
			
				
			}
			else
				System.out.println("parent window met");
		}*/
		
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		System.out.println("No. of windows(2)  " +windowHandles2.size());
		
		driver.findElement(By.xpath("//button[text()='Do not close me ']")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		System.out.println("No. of windows(3)  " +windowHandles3.size());
		for(String windows: windowHandles3 )
			{
			if(!(windows.equals(parentWindowHandle)))
				driver.switchTo().window(windows).close();
				
			}
		//driver.switchTo().defaultContent();
		Set<String> windowHandles4 = driver.getWindowHandles();
		System.out.println(windowHandles4.size());
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.xpath("//button[text()='Wait for 5 seconds']")).click();
		Thread.sleep(10000);
		Set<String> windowHandles5 = driver.getWindowHandles();
		System.out.println("No. of windows(4)  " +windowHandles5.size());
		/*int expectedNumberOfWindows=3;
		Set<String> windowHandles4 = driver.getWindowHandles();
		for(int i=0;i<5;i++)
		{
			if(windowHandles4.size()==expectedNumberOfWindows)
			{
				System.out.println("No. of windows(4)  "+ windowHandles4.size());
				System.out.println("Time taken in millis "+i*1000);
			}
			else 
				Thread.sleep(1000);
		
		}*/
		
	}
}
