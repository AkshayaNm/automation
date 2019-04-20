package newproject;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//@SuppressWarnings("resource")-not sure if shd be added line
		Scanner input =new Scanner(System.in);
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Calendar")).click();
		driver.findElement(By.id("datepicker")).click();
		System.out.println("Enter month ");
		int month =input.nextInt();
		for(int i=1;i<=month-2;i++)
		{
			driver.findElement(By.linkText("Next")).click();	
		}
		//System.out.println("Enter date ");
		//int date =input.nextInt();
		driver.findElement(By.linkText("10")).click();
		//driver.findElement(By.id("datepicker")).click();
		
		
	
	}
}
