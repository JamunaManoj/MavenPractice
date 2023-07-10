package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipKartTest 
{
	@Test(groups = "smokTest")
	public void mavenFlipKartTEst() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.quit();
	}
}


