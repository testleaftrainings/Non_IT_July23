package week1.day2;

public class LearnIf {

	public static void main(String[] args) {
		int num=-10;
		
		if(num>0) {
			System.out.println("Number is positive");
		}
		else if(num<0) {
			System.out.println("Number is Negative");
		}
		else {
			System.out.println("Number is zero");
		}
		
		
		String report="pass";
		int mark =40;
		
		if(mark<=34) {
			System.out.println("fail");
		}
		else if(mark==35) {
			System.out.println("Grade E");
		}
		else if((mark==40) || (mark==50)) {
			System.out.println("Grade c");
		}
		else {
			System.out.println("Enter the mark");
		}
		
		
		
		
		
		
		
		

	}

}
