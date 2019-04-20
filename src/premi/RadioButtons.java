package premi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pm57\\Desktop\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com");
		driver.findElement(By.xpath("(//div[@id='content']//a)[6]")).click();
		driver.findElement(By.xpath("//input[@id='no']")).click();
		boolean selected = driver.findElement(By.xpath("(//div[@id='wrapper']//input)[4]")).isSelected();
		if(selected==true)
		{
			System.out.println("Checked box is selected");
		}
		
		else
			System.out.println("Unchecked box is selected");
		
		List<WebElement> ages = driver.findElements(By.xpath("//input[@name='age']"));
		for (WebElement age : ages) {
			
			boolean selected1 = age.isSelected();
			if(selected1==true)
			{
				System.out.println(age.getText());
				System.out.println("Hi");
			}
			
			else
				driver.findElement(By.xpath("(//input[@name='age'])[2]")).click();
			System.out.println("bye");
		}
		
		driver.quit();
	}

}
