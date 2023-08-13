package week1.day1;

public class LearnDataTypes {
	int noOfWheels = 4;//Global variable
	boolean isPuncture = true;
	long regNumber = 123243424l;
	
	public int add(int a, int b) {
		int result=a+b;
		System.out.println(result);
		return result;
	}
	private void soundHorn() {
		System.out.println("Sound");
	}
	
	void colourCar() {
		 System.out.println("black");
	 }
	
	
	public static void main(String[] args) {
		// dataType variable name = value;

		String colour = "white";
		int noOfWheels = 4;//with in method or main method
		boolean isPuncture = true;
		long regNumber = 123243424l;
		char logo = 'k';
		float mileage = 23.3435f;
		double capacity = 234.3435d;

		System.out.println("colour of the car:" + colour);
		System.out.println(capacity);
		
		//create object to call members of the class(variable and method)
		LearnDataTypes data =new LearnDataTypes();
		
		data.soundHorn();
		data.add(20, 20);
		data.colourCar();
		System.out.println(data.isPuncture);
		System.out.println(data.noOfWheels);
		System.out.println(data.regNumber);
	

	}
	

}
