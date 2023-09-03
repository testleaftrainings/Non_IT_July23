package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement source = driver.findElement(By.id("form:drag_content"));
		WebElement target = driver.findElement(By.xpath("//p[@class='ui-widget-header']"));
		Actions builder =new Actions(driver);
		builder.dragAndDrop(source, target).perform();
		//verify
		String text = target.getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		

	}

}
