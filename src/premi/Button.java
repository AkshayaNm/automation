package premi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pm57\\\\Desktop\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("(//div[@id='content']//a)[2]")).click();
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		driver.findElement(By.xpath("(//div[@id='content']//a)[2]")).click();
		WebElement position = driver.findElement(By.id("position"));
		int x = position.getLocation().getX();
		int y = position.getLocation().getY();
		System.out.println("Position of the button is: "+x+ " " +y);
		String color = driver.findElement(By.xpath("//button[text()='What color am I?']")).getCssValue("color");
		 
		System.out.println(color);
		
		WebElement size = driver.findElement(By.id("size"));
		
		System.out.println(size.getText());
		int width = size.getSize().getWidth();
		int height = size.getSize().getHeight();
		System.out.println("Attributes of the button is: "+width+ " " +height);
	}
}