package newproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Droppable 
{
	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.linkText("Droppable")).click();
		WebElement dragFrom = driver.findElement(By.id("draggable"));
		WebElement dropAt = driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(dragFrom, dropAt).build().perform();
		
	
	}
	
}
