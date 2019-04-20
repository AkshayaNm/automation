package premi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pm57\\Desktop\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
	    driver.findElement(By.xpath("(//div[@id='content']//a)[1]")).click();
	    driver.findElement(By.id("email")).sendKeys("premivasi.m@gmail.com");
	    driver.findElement(By.xpath("(//div[contains(text(),append)]/input)[2]")).sendKeys("appending");
	    String text = driver.findElement(By.xpath("//input[@name='username']")).getText();
	    System.out.println(text);
	    driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
	    boolean enabled = driver.findElement(By.xpath("(//div[@class='example']//input)[5]")).isEnabled();
	    if(enabled == true)
	    {
	    	System.out.println("Editfield is enabled");
	    }
	    
	    else
	    	System.out.println("Editfield is disabled");
	    
	    driver.quit();
	}
}