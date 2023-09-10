package week5.day2;

import org.testng.annotations.Test;

public class LearnPriority {//cde
	@Test(priority = 1)
	public void createLead() {
		System.out.println("Create");
	}
	@Test(priority = -1)
	public void editLead() {
		System.out.println("Edit");
	}
	@Test
	public void dupicateLead() {
		System.out.println("Duplicate");
	}

}
