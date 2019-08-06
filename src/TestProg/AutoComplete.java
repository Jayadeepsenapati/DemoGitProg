package TestProg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoComplete {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\mindq\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.name("q"));
		Actions a=new Actions(driver);
		a.sendKeys(e,"mother").perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for(;;)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String x=e.getAttribute("value");
			if(x.equalsIgnoreCase("mother teresa"))
			{
				break;
			}
		}
		a.sendKeys(Keys.ENTER).perform();
		driver.close();
		

	}

}
