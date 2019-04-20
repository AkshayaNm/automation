package premi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pm57\\Desktop\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.quora.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.tagName("frame"));
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("(//div[@class='form_column'])[1]")).sendKeys("premivasi@gmail.com");
		driver.findElement(By.name("password")).sendKeys("iwillachieve");
		driver.findElement(By.xpath("(//div[@class='form_column'])[3]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Google");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("((//div[@class='results'])//div)[2]")).click();
	}
}