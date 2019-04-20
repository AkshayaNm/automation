package premi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pm57\\\\Desktop\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("(//div[@id='content']//a)[8]")).click();
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id='contentblock']//table//tr"));
		System.out.println("Row Count is: "+rows.size());
		
		List<WebElement> cols = rows.get(0).findElements(By.tagName("th"));
		System.out.println("Column Count is: "+cols.size());
	}

}
