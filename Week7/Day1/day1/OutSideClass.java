package week7.day1;

public class OutSideClass extends LearnStatic {
	static {
		System.out.println("I am static block");
	}

	public static void empDetail() {
		System.out.println(empId);
		System.out.println("Static method");
	}

	public static void main(String[] args) {
		OutSideClass obj =new OutSideClass();
		System.out.println(LearnStatic.empId);
		empDetail();

	}

}
