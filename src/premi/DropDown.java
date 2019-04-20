package premi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pm57\\Desktop\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com");
		driver.findElement(By.xpath("(//div[@id='wrapper']//a)[6]")).click();
		Select dropdown = new Select(driver.findElement(By.id("dropdown1")));
		dropdown.selectByIndex(0);
		System.out.println("1");
		Select dropdown1 = new Select(driver.findElement(By.name("dropdown2")));
		dropdown1.selectByVisibleText("Select training program using Text");
		System.out.println("2");
		Select dropdown2 = new Select(driver.findElement(By.id("dropdown3")));
		dropdown2.selectByValue("2");
		System.out.println("3");
		List<WebElement> list = driver.findElements(By.xpath("//select[@class='dropdown']//option"));
		System.out.println("No of dropdown values are: "+list.size());
		System.out.println("Done");
		WebElement element = driver.findElement(By.xpath("(//div[@class='example'])[5]"));
		element.click();
		Thread.sleep(5000);
		element.sendKeys(args);
		System.out.println("5");
		Select dropdown3 = new Select(driver.findElement(By.xpath("((//div[@class='example'])[6])//select")));
		dropdown3.selectByIndex(1);
		System.out.println("6");
		driver.quit();
	}
}
