package newproject;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
//import javax.net.ssl.HttpsURLConnection;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Keyboard;

public class Image {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[4]")).click();
		driver.findElement(By.xpath("(//div[@class='row']//img)[1]")).click();
		driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[4]")).click();
		//List links = driver.findElements(By.tagName("img"));
		List<WebElement> imgs = driver.findElements(By.xpath("//img"));
		for(int i=0;i<imgs.size();i++)
		{
			WebElement ele=imgs.get(i);
			String link = ele.getAttribute("src");
			VerifyImg(link);
				//String link=imgs.get(i).getAttribute("src");
				//Verifyimg(link);
			//String link1=imgs.get(i).getText();
			//System.out.println(link);
			//System.out.println(link1);
		}
		
		//driver.findElement(By.xpath("(//div[@class='row']//img)[3]")).sendKeys(Keys.ENTER);
		Actions action = new Actions(driver);
		
		WebElement target = driver.findElement(By.xpath("(//div[@id='wrapper']//img)[4]"));
		action.moveToElement(target).click().perform();
		System.out.println("Success");
		
	

	}
		public static void VerifyImg(String url) throws IOException
		{
			try{
				URL img=new URL(url);
				HttpURLConnection connection = (HttpURLConnection) img.openConnection();
				//connection.setRequestMethod("GET");
				connection.connect();
				int code=connection.getResponseCode();
				if (code==200)
						System.out.println("valid image "+img);
				else
					System.out.println("invalid image "+img);
			
		} 
		catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		
		}
		}
		
			

