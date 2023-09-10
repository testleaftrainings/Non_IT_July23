package week5.day2;

import org.testng.annotations.Test;
//DependsOnMethod and always run
public class DependsOnMethod {
	
	@Test(dependsOnMethods = "dupicateLead",alwaysRun = true)
	public void createLead() {
		
		System.out.println("Create");
		
	}
	@Test
	public void editLead() {
		System.out.println("Edit");
	}
	@Test//(dependsOnMethods = {"week5.day1.CreateLead.runCreateLead"},alwaysRun = true)
	public void dupicateLead() {
		System.out.println("Duplicate");
		throw new RuntimeException();//just fail my test case
	}

}
