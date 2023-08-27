package week3.day2;

public class LearnString {
	public static void main(String[] args) {
		//Literal
		String s1="Testleaf";
		String s2="TestLeaf";
		//using object
		String str=new String("Testleaf");
		//String value
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		//== compare reference memory
		System.out.println(s1==str);
		//get the char based on index
		char charAt = s1.charAt(6);
		System.out.println(charAt);
		//count my string
		int len = s1.length();   //assign local var
		System.out.println(len);
		//need to check char
		System.out.println(s1.contains("Test"));
		//convert string to CharArray
		char[] ch = s1.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
		String str1="Testleaf is located in chennai";
		//split()
		String[] split = str1.split(" ");
		for (int i = 0; i < split.length; i++) {
			//System.out.println(split[i]);
			if(i%2==0) {
				System.out.println(split[i]);
			}
		}
		
		String replace = str1.replace('e', 'a');
		System.out.println(replace);
		
		String amazon="1-48 of over 70,000 results for";
		String replaceAll = amazon.replaceAll("\\D", " ");
		System.out.println(replaceAll);
		
		String substring = amazon.substring(5);
		System.out.println(substring);
		System.out.println(amazon.substring(13, 18));
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		//connect combine
		
		System.out.println("title of the page:"+" "+s1);
		System.out.println(s1.concat(s2));
		//remove the space before and after the string
		System.out.println(s1.trim());
		
		
		
		
		
		
		
		
		
		
		
	}

}
