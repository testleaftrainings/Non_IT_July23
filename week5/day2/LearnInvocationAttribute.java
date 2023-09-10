package week5.day2;

import org.testng.annotations.Test;

public class LearnInvocationAttribute {//cde
	@Test(invocationCount = 3,invocationTimeOut = 1000,threadPoolSize = 2)
	public void createLead() {
		System.out.println("Create");
	}
	@Test
	public void editLead() {
		System.out.println("Edit");
	}
	@Test
	public void dupicateLead() {
		System.out.println("Duplicate");
	}

}
