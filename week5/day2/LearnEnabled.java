package week5.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnEnabled {//cde
	@Ignore
	@Test
	public void createLead() {
		System.out.println("Create");
	}
	@Test(enabled = false)
	public void editLead() {
		System.out.println("Edit");
	}
	@Test
	public void dupicateLead() {
		System.out.println("Duplicate");
	}

}
