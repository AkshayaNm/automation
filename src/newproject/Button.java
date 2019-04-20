package newproject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Button {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.leafground.com/");
	driver.findElement(By.linkText("Button")).click();
	driver.findElement(By.id("home")).click();
	driver.findElement(By.linkText("Button")).click();
	WebElement pos = driver.findElement(By.id("position"));
	int x= pos.getLocation().getX();
	int y= pos.getLocation().getY();
	System.out.println(x+","+y);
	String colour = driver.findElement(By.id("color")).getCssValue("color");
	System.out.println(colour);
	WebElement size = driver.findElement(By.id("size"));
	int h=size.getSize().getHeight();
	int w=size.getSize().getWidth();
	System.out.println(h+","+w);
	//driver.findElement(By.id("size")).getCssValue("width");
	
	}

}
