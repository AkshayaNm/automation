package newproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;
public class Alert {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.linkText("Alert")).click();
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("aksha");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		Thread.sleep(3000);
		String text = driver.switchTo().alert().getText();
		String[] textSplit = text.split("\n");
		for(int i = 0 ; i< textSplit.length;i++)
		{
			System.out.println(i+1+" "+ textSplit[i]);
		}
		//System.out.println(text.split("/n"));
		
		
		
		
		
		
	}

}
