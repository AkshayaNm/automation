package premi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\pm57\\\\\\\\Desktop\\\\\\\\Selenium\\\\\\\\Driver\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("(//div[@id='content']//a)[10]")).click();
		int frames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("No of frames are: "+frames);
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		System.out.println("Clicked1");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='frame2']")));
		///driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		System.out.println("Clicked2");
		driver.quit(); 
	}

}

