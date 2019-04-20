package newproject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;
public class Sortable
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.linkText("Sortable")).click();
		Actions action=new Actions(driver);
		WebElement one = driver.findElement(By.xpath("(//ul[@id='sortable']//li)[1]"));
		WebElement two = driver.findElement(By.xpath("(//ul[@id='sortable']//li)[2]"));
		WebElement three = driver.findElement(By.xpath("(//ul[@id='sortable']//li)[3]"));
		WebElement four = driver.findElement(By.xpath("(//ul[@id='sortable']//li)[4]"));
		WebElement five = driver.findElement(By.xpath("(//ul[@id='sortable']//li)[5]"));
		WebElement six  = driver.findElement(By.xpath("(//ul[@id='sortable']//li)[6]"));
		WebElement seven = driver.findElement(By.xpath("(//ul[@id='sortable']//li)[7]"));
		action.click(seven).clickAndHold().moveToElement(one).release().build().perform();
		action.click(six).clickAndHold().moveToElement(one).release().build().perform();
		action.click(five).clickAndHold().moveToElement(one).release().build().perform();
		action.click(four).clickAndHold().moveToElement(one).release().build().perform();
		action.click(three).clickAndHold().moveToElement(one).release().build().perform();
		action.click(two).clickAndHold().moveToElement(one).release().build().perform();
		action.click(one).clickAndHold().moveToElement(one).release().build().perform();
		
		
		/*int k=6;
		int j=0;
		for(WebElement i: list)
			{
			 		WebElement target=list.get(k);
			 		WebElement dest=i;		 		
			 		action.click(target).clickAndHold().moveToElement(dest).moveByOffset(0,10).release().build().perform();
			 		Thread.sleep(5000);
			 		j++;k--;
			 		//if(j==6)*/
		
			
		
			}
	}


