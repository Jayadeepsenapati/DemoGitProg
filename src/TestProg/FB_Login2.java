package TestProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login2 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\mindq\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("jayadeep.senapatii@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("jayenj0y");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		driver.close();
	}

}
