package testproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\java\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Select s1 = new Select(driver.findElement(By.xpath("//select[@name='e']")));
		
		List<WebElement> muloptions = s1.getOptions(); //to print all options !!
		
		for(WebElement Singleopt:muloptions) 
		{
			System.out.println(Singleopt.getText());
		}
		
		
		driver.close();
		
		
		
		
		
		
	}
}
