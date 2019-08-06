package TestProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\mindq\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.onlinesbi.com/");
		driver.manage().window().maximize();
		String x=driver.findElement(By.xpath("//span[text()='LOGIN']")).getText();
		System.out.println(x);
		if( x.contains("LOGIN"))
		{
			System.out.println("Element is Present");
		}
		else
		{
			System.out.println("Not Present");
		}
		

	}

}
