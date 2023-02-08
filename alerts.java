package chiru;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {
	WebDriver driver;
	String url="https://www.bput.ac.in/";
	String url1="https://www.google.com/";
	String url2="https://demoqa.com/alerts";
	@Before
	public void test1() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url2);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		}
	
	@Test
	public void test2() throws InterruptedException 
	{
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(5000);
		Alert at=driver.switchTo().alert();
		at.sendKeys("kavitha");
		String st=at.getText();
		System.out.println(st);
		at.accept();
	}
	@Test
		public void test3() throws InterruptedException {
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		Alert at=driver.switchTo().alert();
		String s=at.getText();
		System.out.println(s);
		at.accept();
		driver.findElement(By.id("confirmButton")).click();
		at.dismiss();
		}
	
	}
