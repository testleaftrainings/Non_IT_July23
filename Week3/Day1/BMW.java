package week3.day1;

public class BMW extends Car{
	
	public void absBreak() {
		System.out.println("BMW class applyBreak");
	}
	public void applyBrake() {
		System.out.println("abs brake system");
	}
	
	public static void main(String[] args) {
		BMW obj =new BMW();
		obj.absBreak();
		obj.applyBrake();
		obj.soundHorn();
	}

}
