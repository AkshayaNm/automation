package newproject;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class AutoComplete
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[18]")).click();
		WebElement course = driver.findElement(By.id("tags"));
		course.sendKeys("ap");
		String textToSelect="SOAP";
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		List<WebElement> optionsToSelect= driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		//List<WebElement> optionsToSelect= driver.findElements(By.id("ui-id-1"));
		System.out.println(optionsToSelect.size());
		for(WebElement options: optionsToSelect)
			{
			System.out.println(options);
			if(options.getText().equals(textToSelect))
			{
				System.out.println("trying to select "+textToSelect);
				options.click();
				break;
			}
			}				
		//Select select=new Select(course);
		//select.selectByValue("Appium");
	}
}
