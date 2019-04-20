package newproject;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG2 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.facebook.com";
        String tagName = "";
        
        driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getTagName();
        WebElement text = driver.findElement(By.xpath("//input[@value='Log In']"));
        System.out.println(text.getText());
        System.out.println(tagName);
        //WebElement myElement= driver.findElement(By.id("First name"));
        //myElement.sendKeys("tutorial");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.findElement(By.name("Log In")).click();
        
        //driver.close();
       // System.exit(0);
}
}