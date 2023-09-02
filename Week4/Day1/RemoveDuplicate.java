package week4.day1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String input ="TesTleaf";
		//output=Testlaf e
		char[] charArray = input.toCharArray();
		
		Set<Character> uniqueSet =new LinkedHashSet<Character>();
		
		for (Character output : charArray) {
		System.out.println(	uniqueSet.add(output));
			
		}
		
		System.out.println(uniqueSet);
		

	}

}
