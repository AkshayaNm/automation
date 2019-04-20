package newproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Draggable
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Draggable")).click();
		WebElement dragEleFrom = driver.findElement(By.id("draggable"));
		Actions action=new Actions(driver);
		//Move the Drag me around to the right most corner of the div and move it back to its original position
		action.dragAndDropBy(dragEleFrom,300,0).build().perform();
		Thread.sleep(3000);
		action.dragAndDropBy(dragEleFrom,0,130).build().perform();
		Thread.sleep(3000);
		action.dragAndDropBy(dragEleFrom,-300,0).build().perform();
		Thread.sleep(3000);
		action.dragAndDropBy(dragEleFrom,0,-130).build().perform();
		Thread.sleep(3000);
		//) Move the Drag me around element by 100 x and 200 y
		action.dragAndDropBy(dragEleFrom,100,200).build().perform();
		
	}

}
