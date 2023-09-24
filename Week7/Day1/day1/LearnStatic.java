package week7.day1;

public class LearnStatic {
	
	static int empId;
	
	String name;	
	public static void empDetail() {
		System.out.println(empId);
		System.out.println("Static method");
	}
	public static void empDescription() {
		System.out.println("Non static method");
	}

	public static void main(String[] args) {
		LearnStatic obj =new LearnStatic();
		System.out.println(obj.name);
		
		System.out.println(empId);
		
		empDetail();
		
		obj.empDescription();

	}

}
