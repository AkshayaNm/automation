package newproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class tooltip 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[17]")).click();
		WebElement ele = driver.findElement(By.id("age"));
		String tooltip=ele.getAttribute("title");
		System.out.println(tooltip);
		
		
		
	}
}
