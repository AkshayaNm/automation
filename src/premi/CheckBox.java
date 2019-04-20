package premi;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pm57\\\\Desktop\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com");
		driver.findElement(By.xpath("(//div[@id='content']//a)[7]")).click();
		driver.findElement(By.xpath("//div[@class='example']//input")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[5]")).click();
		boolean selected = driver.findElement(By.xpath("(//div[@class='example']//label)[2]")).isSelected();
		if(selected==true)
		{
			System.out.println("Selenium is checked");
		}
		
		else
			System.out.println("Selenium is not checked");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> options = driver.findElements(By.xpath("(//div[@class='example'])[4]//input"));
		for (WebElement option : options) {
			option.click();
		}
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.quit();
	}
}
