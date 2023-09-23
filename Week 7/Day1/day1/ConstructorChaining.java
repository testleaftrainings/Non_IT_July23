package week7.day1;



public class ConstructorChaining {
  
	
	public  ConstructorChaining() {
		this(1002);
		System.out.println("No input");
	}
	
	public  ConstructorChaining(int empId) {
		this(1003,"Testleaf");
		System.out.println("One input");
	}
	
	public  ConstructorChaining(int empId,String name) {
		
		System.out.println("two input");
	}	
	
	
	public static void main(String[] args) {
		ConstructorChaining obj =new ConstructorChaining();

	}

}
