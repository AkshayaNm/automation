package premi;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pm57\\Desktop\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("(//div[@id='content']//a)[3]")).click();
		driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		driver.findElement(By.xpath("(//div[@id='content']//a)[3]")).click();
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		driver.findElement(By.xpath("(//div[@id='content']//a)[3]")).click();
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("Total links: "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			VerifyLink(url);
		}
		driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
		
		driver.quit();
	}
	
	public static void VerifyLink(String url) throws IOException
	{
		URL link = new URL(url);
		HttpURLConnection connection = (HttpURLConnection)link.openConnection();
		connection.setConnectTimeout(3000);
		connection.connect();
		
		if(connection.getResponseCode()<400)
		{
			System.out.println(connection.getResponseCode());
			System.out.println(url+" - "+connection.getResponseMessage());
		}
		
		if(connection.getResponseCode()>400)
		{
			System.out.println(url+" - "+connection.getResponseMessage()+"BrokenLink");
		}
	}
}