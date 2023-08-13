package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		//Arithmetic operators
		int a=5;
		int b=5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		//Assignment operators
		int c=10;
		c=c+10;
		c+=10;//short hand assignment
		System.out.println(c);
		//Comparison operators
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<b);
		System.out.println(a<=5);
		System.out.println(a>b);
		System.out.println(a>=5);
		
		//Logical operators:
		//AND * 1*1=1 T T T
		System.out.println((a==b) && (a<5));
		
		//OR + 1+1 =t 0+0=F
		
		System.out.println((a==b) || (a<5));
		
		
		//Not !
		
		System.out.println(!(a==b));
		
		boolean flag=false;
		
		System.out.println(!flag);
		
		
		//Increment operator (++)
		System.out.println(a++);//post increment
		System.out.println(a);
		System.out.println(++a);//pre increment
		
		//Decrement operator (--)
		System.out.println(a--);//post decrement
		System.out.println(a);
		System.out.println(--a);
		
		
		
		
	}

}
