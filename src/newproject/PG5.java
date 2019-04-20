package newproject;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PG5 {

	public static void main(String[] args) {

	    System.setProperty("webdriver.chrome.driver", "C:\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get(" http://demo.guru99.com/test/login.html");
	    //List<WebElement> elements = driver.findElements(By.id("yes"));
	   // System.out.println("Number of elements:" +elements.size());

	   // for (int i=0; i<elements.size();i++){
	     // System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
	   // }
	    WebElement email=driver.findElement(By.id("email"));
	    WebElement password=driver.findElement(By.name("passwd"));
	    email.sendKeys("abcd@gmail.com");		
	    password.sendKeys("abcdefgh");
	    //email.clear();
	   //password.clear();
	    //WebElement email=driver.findElement(By.id("SubmitLogin"));
	  //login.click();
	    
	}
	}
