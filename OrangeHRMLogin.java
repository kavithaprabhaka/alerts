package chiru;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLogin {

        WebDriver driver; 
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		@BeforeTest(enabled = true)
		public void tc1() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();//launch chromedriver
			driver.get(url);//launch url
			driver.manage().window().maximize();//maximuize window
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//wait time
			System.out.println(driver.getTitle());//get current title n print
			System.out.println(driver.getCurrentUrl());//get url n print
			Thread.sleep(5000);
		}
		@Test(enabled = true)
		public void tc2() throws AWTException, InterruptedException 
		{
			WebElement web=driver.findElement(By.name("username"));
			
			Thread.sleep(5000);
			Robot rc=new Robot();
rc.keyPress(KeyEvent.VK_SHIFT);
			rc.keyPress(KeyEvent.VK_A);
rc.keyRelease(KeyEvent.VK_SHIFT);
			rc.keyPress(KeyEvent.VK_D);
			rc.keyPress(KeyEvent.VK_M);
			rc.keyPress(KeyEvent.VK_I);
			rc.keyPress(KeyEvent.VK_N);
			Thread.sleep(5000);
			}
		@Test(enabled=true)
		public void tc3() throws InterruptedException, AWTException {
			WebElement web1=driver.findElement(By.name("password"));
			web1.click();
			Thread.sleep(5000);
			Robot r=new Robot();
			Thread.sleep(5000);

			r.keyPress(KeyEvent.VK_A);
			r.keyPress(KeyEvent.VK_D);
			r.keyPress(KeyEvent.VK_M);
			r.keyPress(KeyEvent.VK_I);
			r.keyPress(KeyEvent.VK_N);
			r.keyPress(KeyEvent.VK_1);
			r.keyPress(KeyEvent.VK_2);
			r.keyPress(KeyEvent.VK_3);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			WebElement web2=driver.findElement(By.className("oxd-userdropdown-icon"));
			web2.click();
			
		}
		}