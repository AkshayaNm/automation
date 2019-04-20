package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.linkText("Radio Button")).click();
		driver.findElement(By.id("no")).click();
		WebElement ele1 = driver.findElement(By.xpath("(//input[@name='news'])[1]"));
		WebElement ele2 = driver.findElement(By.xpath("(//input[@name='news'])[2]"));
		if(ele1.isSelected())
			System.out.println("Unchecked radio button is selected");
		else if(ele2.isSelected())
		System.out.println("Checked radio button is selected");
		
		WebElement ele3 = driver.findElement(By.xpath("(//input[@name='age'])[1]"));
		WebElement ele4 = driver.findElement(By.xpath("(//input[@name='age'])[2]"));
		WebElement ele5 = driver.findElement(By.xpath("(//input[@name='age'])[3]"));
		if (!ele3.isSelected())
			ele3.click();
		Thread.sleep(2000);
		if (!ele4.isSelected())
			ele4.click();
		Thread.sleep(2000);
		if (!ele5.isSelected())
			ele5.click();
	}

}
