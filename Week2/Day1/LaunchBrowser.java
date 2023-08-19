package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//setup the path and Launch the browser
		//EdgeDriver driver =new EdgeDriver();
		ChromeOptions op = new ChromeOptions();
		op.setBinary("C:\\Users\\dell\\Downloads\\chrome-win64 (1)\\chrome-win64");
		ChromeDriver driver =new ChromeDriver(op);
		
		
		

	}

}
