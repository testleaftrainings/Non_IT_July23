package week7.day1;

public class Car extends Vehicle {
	String brakeModel="Abs";
	
	
	public Car() {
		super();
		System.out.println("I am from Car Class");
	}
	
	
	
	public void brandname() {
		super.brandName();
		System.out.println("Benz");
		
	}
	
	public void brand() {
   System.out.println(brakeModel);
   System.out.println(super.brakeModel);
	}
	
	
	
	public static void main(String[] args) {
		Car obj =new Car();
		obj.brand();
		obj.brandname();
		
		
	}
}
