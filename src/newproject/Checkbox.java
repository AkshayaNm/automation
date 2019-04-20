package newproject;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.linkText("Checkbox")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[3]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[4]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[5]")).click();
		WebElement check1 = driver.findElement(By.xpath("(//div[@class='example']//input)[6]"));
		if (check1.isSelected())
			System.out.println("selenium checkbox is selected");
		else
			System.out.println("selenium checkbox is not selected");
		WebElement check2 = driver.findElement(By.xpath("(//div[@class='example']//input)[7]"));
		if (check2.isSelected())
			check2.click();
		WebElement check3 = driver.findElement(By.xpath("(//div[@class='example']//input)[8]"));
		if (check3.isSelected())
			check3.click();
		
		List<WebElement> checkboxes =driver.findElements(By.xpath("(//div[@class='example'])[4]//input"));
	for (WebElement checkbox : checkboxes) 
	{
		if(!checkbox.isSelected())
			checkbox.click();
	}
		
}
}
