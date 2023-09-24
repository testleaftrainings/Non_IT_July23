package week7.day1;

public class LearnConstructor {
	int empId;

	String empName;

	// syntax Default Constructor
	public LearnConstructor() {
		System.out.println("I am Default Constructor ");
	}

	// parameterized Constructor
	public LearnConstructor(int empId) {
		System.out.println("I am parameterized  Constructor ");
	}

	public static void main(String[] args) {
		LearnConstructor emp = new LearnConstructor();
		LearnConstructor emp1 = new LearnConstructor(1002);
		System.out.println(emp.empId);
		System.out.println(emp.empName);

	}

}
