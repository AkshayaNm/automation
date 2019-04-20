package newproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[20]")).click();
		driver.findElement(By.xpath("//a[text()='Download xls']")).click();
	}
	
	}
