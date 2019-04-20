/**
 * 
 */
/**
 * @author akshaya.nm
 *
 */
package premi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\pm57\\\\\\\\Desktop\\\\\\\\Selenium\\\\\\\\Driver\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		String text = driver.switchTo().alert().getText();
	    System.out.println(text);
		
	}
}
