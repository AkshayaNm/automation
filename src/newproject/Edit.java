package newproject;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Edit {
	
	public static void main(String[] args) {
		doMethod();
	}
	
	public static void doMethod(){
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/");
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("email")).sendKeys("rocks.akshaya@gmail.com");
    driver.findElement(By.xpath("(//div[@class='row'])[2]//input")).sendKeys("rockpremivasi");;
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//input[@name='username'])[1]")).sendKeys("SunjayRocks");
	
	WebElement text = driver.findElement(By.xpath("(//input[@name='username'])[1]"));
	System.out.println(text.getAttribute("textContent"));

	driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
	System.out.println(text);
	boolean correct = driver.findElement(By.xpath("(//div[@class='row'])[5]//input")).isEnabled();
	System.out.println(correct);
		
	}
	

}
