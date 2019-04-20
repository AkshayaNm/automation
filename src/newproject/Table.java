package newproject;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Table {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.linkText("Table")).click();
		 List<WebElement> row2column = driver.findElements(By.xpath("(//tr)[2]//td"));
		 System.out.println("no. of columns is "+ row2column.size());
		 List<WebElement> column1row = driver.findElements(By.xpath("//tr"));
		 System.out.println("no. of rows is "+ column1row.size());
		System.out.println("Learn to interact with Elements"+ driver.findElement(By.xpath("(//tr)[3]//td[2]")).getText());
		
		String text1 = driver.findElement(By.xpath("(//tr)[2]//td[2]")).getText();
		String number1= text1.substring(0,text1.length()-1);
		//Integer result = Integer.valueOf(number);
		int result1 = Integer.parseInt(number1);
		System.out.println(result1);

		
		String text2 = driver.findElement(By.xpath("(//tr)[3]//td[2]")).getText();
		String number2= text2.substring(0,text2.length()-1);
		//Integer result = Integer.valueOf(number);
		int result2 = Integer.parseInt(number2);
		System.out.println(result2);

		
		String text3 = driver.findElement(By.xpath("(//tr)[4]//td[2]")).getText();
		String number3= text3.substring(0,text3.length()-1);
		//Integer result = Integer.valueOf(number);
		int result3 = Integer.parseInt(number3);
		System.out.println(result3);
		
		if((result1<result2) && (result1<result3))
			{System.out.println(result1 +"is least ");
		driver.findElement(By.xpath("(//tr)[2]//td[3]")).click();
			}
		else if((result2<result3) && (result2<result1))
			{System.out.println(result2 +"is least ");
		driver.findElement(By.xpath("(//tr)[3]//td[3]")).click();
			}
		else if((result3<result2) && (result3<result1))
			{System.out.println(result3 +"is least ");
		driver.findElement(By.xpath("(//tr)[4]//td[3]")).click();
			}
}
}
