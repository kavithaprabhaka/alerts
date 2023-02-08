package chiru;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import javax.swing.event.MenuKeyEvent;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowshandles {
	WebDriver driver;
	String url="https://www.bput.ac.in";
	String url1="http://www.google.com";
	String url2="http://www.demoqa.com/alerts";
	//String url1="https://mvnrepository.com/artifact/org.testng/testng/7.7.1";
	@Before
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url1);
		
	}
	@Test
	public void tc2() throws InterruptedException {
		Thread.sleep(6000);
		WebElement Click=driver.findElement(By.linkText("About Us"));
		WebElement Click1=driver.findElement(By.linkText("Governance"));
		
		Actions act=new Actions(driver);
		//Thread.Sleep(5000);
		act.moveToElement(Click).build().perform();
		
	}
	
	@Test
	public void tc4() throws InterruptedException, AWTException {
		WebElement Click=driver.findElement(By.linkText("Gmail"));
		Actions act=new Actions(driver);
		act.moveToElement(Click).build().perform();
		act.contextClick().build().perform();
		Thread.sleep(5000);
		Robot rc=new Robot();
		rc.keyPress(MenuKeyEvent.VK_DOWN);
		rc.keyPress(MenuKeyEvent.VK_ENTER);
		//Thread sleep(5000);
		rc.keyPress(MenuKeyEvent.VK_CONTROL);
		rc.keyPress(MenuKeyEvent.VK_TAB);
		System.out.println(driver.getTitle());
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String>tabs=driver.getWindowHandles();
		System.out.println(tabs);
		for(String handles:tabs) {
			driver.switchTo().window(handles);
			System.out.println(driver.getTitle());
		}
		driver.switchTo().window(parent);
	driver.get("https://www.jntua.ac.in");
		
		
		
		
		
	}
	@Test
	public void tc5(){
		driver.findElement(By.id("alertbutton")).click();
		Alert act=driver.switchTo().alert();
		String msg=act.getText();
		System.out.println(msg);
		act.accept();
		
	}
	/*@Test
	public void tc6() {
		WebElement we=driver.findElement(By.id("twotabsearchtextbox"));
		Actions at=new Actions(driver);
		at.moveToElement(we).click().KeyDown(Key.shift).Sendkeys("sparks").doubleClick().build.perform();
		
	}
	*/

}
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	


