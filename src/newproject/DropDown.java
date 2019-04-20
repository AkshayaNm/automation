package newproject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
public static void main(String[] args) throws InterruptedException {
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.linkText("Drop down")).click();
		//driver.findElement(By.id("dropdown1")).click();
		
		//Actions action=new Actions(driver);
		WebElement dr1 = driver.findElement(By.id("dropdown1"));
		Select select1= new Select(dr1);
		select1.selectByIndex(1);
		
		WebElement dr2 = driver.findElement(By.name("dropdown2"));
		Select select2=new Select(dr2);
		select2.selectByVisibleText("Selenium");
		
		WebElement dr3=driver.findElement(By.id("dropdown3"));
		Select select3= new Select(dr3);
		select3.selectByValue("3");
		
		WebElement dr4=driver.findElement(By.className("dropdown"));
		Select select4= new Select(dr4);
		List<WebElement> options = select4.getOptions();
		System.out.println(options.size());
		
		WebElement dr5=driver.findElement(By.xpath("(//div[@class='example']//select)[5]"));
				dr5.click();
		
		Actions action=new Actions(driver);
		action.moveToElement(dr5).click().sendKeys("UFT/QTP").perform();
		
		WebElement dr6=driver.findElement(By.xpath("(//div[@class='example']//select)[6]"));
		dr6.click();

		//Actions action2=new Actions(driver);
		//action.moveToElement(dr6).;
		Thread.sleep(5000);
		WebElement ele1=driver.findElement(By.xpath("((//div[@class='example']//select)[6]//option)[2]"));
		WebElement ele2=driver.findElement(By.xpath("((//div[@class='example']//select)[6]//option)[4]"));
		WebElement ele3=driver.findElement(By.xpath("((//div[@class='example']//select)[6]//option)[5]"));
		action.keyDown(Keys.CONTROL).click(ele1).click(ele2).click(ele3).build().perform();
		
		/*Select select5= new Select(ele1);
		select5.selectByVisibleText("Selenium");
		Select select6= new Select(ele2);
		select6.selectByVisibleText("UFT/QTP");
		Select select7= new Select(ele3);
		select7.selectByVisibleText("Loadrunner");*/
	
	}
}


}
