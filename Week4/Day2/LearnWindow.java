package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click open
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//get thetitle of open window
		System.out.println(driver.getTitle());
		//current open window
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);//4BF93DDE49E13E0A8EC5DE71AADD7F15
		//206CEC5D9EB4ABB44A64658447721877
		//Multiple window
		Set<String> windowHandles = driver.getWindowHandles();
		//create a list then convert set into
		List<String>lstwindow =new ArrayList<String>(windowHandles);
		//handle the window
		driver.switchTo().window(lstwindow.get(1));
		//get the size of window
		System.out.println(windowHandles.size());
		//print the title
		System.out.println(driver.getTitle());
		//close the current open window
		driver.close();
		
		//switch back to the window
		driver.switchTo().window(lstwindow.get(0));
		
		System.out.println(driver.getTitle());
		//close all open window
		driver.quit();

	}

}
