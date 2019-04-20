package newproject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
public class Selectable 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[15]")).click();
		//WebElement selectlist = driver.findElement(By.xpath("(//ol[@class='ui-selectable'])"));
		//Select select=new Select(selectlist);
		//select.selectByIndex(0);
		//select.selectByIndex(2);
		//select.selectByIndex(4);
		//select.selectByVisibleText("Item 4");
		//select.selectByVisibleText("Item 6");
		//select.selectByVisibleText("Item 5");
		WebElement first_WebElement=driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement second_WebElement=driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement third_WebElement=driver.findElement(By.xpath("//li[text()='Item 3']"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.LEFT_CONTROL)
		    .click(first_WebElement)
		    .click(second_WebElement)
		    .click(third_WebElement)
		    .keyUp(Keys.LEFT_CONTROL)
		    .build()
		    .perform();
		Thread.sleep(2000);
		WebElement five_WebElement=driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement seven_WebElement=driver.findElement(By.xpath("//li[text()='Item 7']"));
		actions.keyDown(Keys.LEFT_CONTROL)
	    .click(second_WebElement)
	    .click(five_WebElement)
	    .click(seven_WebElement)
	    .keyUp(Keys.LEFT_CONTROL)
	    .build()
	    .perform();
	}

}
