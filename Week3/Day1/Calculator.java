package week3.day1;

public class Calculator {
	
	public void add(int x,int y) {
      System.out.println(x+y);
	}

	public void add(int x,float y) {
		 System.out.println(x+y);
	}

	public void add(int x, int y,int z) {
		 System.out.println(x+y+z);
	}
	public void mul(int x, int y) {
		 System.out.println(x*y);
	}
	public void mul(int x, float y) {
		 System.out.println(x*y);
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(10, 20, 30);
		cal.add(10, 0.2f);
		cal.add(20, 40);
		cal.mul(10, 2);

	}

}
