package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCountOfLinks {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml;jsessionid=node03do7gewcc1gtve7t9woobfvu452093.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
	}

}
