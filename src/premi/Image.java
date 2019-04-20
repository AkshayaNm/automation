package premi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Image {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pm57\\\\Desktop\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com");
		driver.findElement(By.xpath("(//div[@id='wrapper']//a)[5]")).click();
		driver.findElement(By.xpath("(//div[@id='wrapper']//img)[2]")).click();
		driver.findElement(By.xpath("(//div[@id='wrapper']//a)[5]")).click();
		Actions action = new Actions(driver);
		
		WebElement target = driver.findElement(By.xpath("(//div[@id='wrapper']//img)[4]"));
		action.moveToElement(target).click().perform();
		System.out.println("Success");
		driver.quit();
	}
}
