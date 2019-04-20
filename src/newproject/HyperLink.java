package newproject;
import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HyperLink {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.linkText("HyperLink")).click();
		driver.findElement(By.xpath("(//a)[2]")).click();
		driver.findElement(By.linkText("HyperLink")).click();
		WebElement link = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String texts=link.getAttribute("href");
		System.out.println(texts);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(int i=0;i<links.size();i++)
		{
			WebElement ele=links.get(i);
			String url = ele.getAttribute("href");
			VerifyLink(url);
		}
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		driver.findElement(By.linkText("HyperLink")).click();
		System.out.println("no.of links"+links.size());
	}
		public static void VerifyLink(String url)
		{
		try {
			URL x=new URL(url);
			HttpURLConnection connection = (HttpURLConnection)x.openConnection();
			connection.connect();
			
			if(connection.getResponseCode()==200)
			{
				System.out.println(connection.getResponseMessage());
				System.out.println("status-success");
			}
			else if(connection.getResponseCode()==404)
			{
				System.out.println(connection.getResponseMessage());
				System.out.println("status-Broken link");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
}
