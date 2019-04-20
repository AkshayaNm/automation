package newproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frame {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/");
	driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[10]")).click();
	//driver.findElement(By.id("Click")).click();
	////WebElement ele1 = driver.findElement(By.xpath("//div[@id='contentblock']//section"));
	driver.switchTo().frame(0);
	driver.switchTo().activeElement();
	driver.findElement(By.id("Click")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().activeElement();
	WebElement frame2 = driver.findElement(By.xpath("//iframe[contains(@src,'nested.html')]"));
	driver.switchTo().frame(frame2);
	driver.findElement(By.id("Click1")).click();
	//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'nested.html']")));
	//driver.findElement(By.id("Click1")).click();
}
}
