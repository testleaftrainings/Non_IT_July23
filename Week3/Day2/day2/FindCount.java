package week3.day2;

public class FindCount {

	public static void main(String[] args) {
		String input="Testleaf";
		int count=0;
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='e') {
				count++;
				
			}
			
		}
		System.out.println(count);

	}

}
