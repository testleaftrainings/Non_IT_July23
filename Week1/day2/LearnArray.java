package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
        //Using Array Literal 

        int[] nums= {10,40,60,20,70};//len start from 1
       
        //Using Instantiation
        int[] marks =new int[3];//index start from 0
        marks[0]=90;
        marks[1]=100;
        marks[2]=85;
       //  marks[3]=95;

        //length of Array
        int len = nums.length;   //assign local variable
        System.out.println(len);
        System.out.println(nums[2]);
        //Arrange the array in ascending order
        Arrays.sort(nums);//10 20 40  60 70
        System.out.println(nums);
       //using loop to iterate the array
        for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
        //Last value in array
        System.out.println(nums[len-1]);
        //Second largest num in array
        System.out.println(nums[len-2]);
        
       //To reverse the array we can use for loop
        System.out.println("Reverse the order of array:");
        for (int i =nums.length-1; i>=0; i--) {
			
			System.out.println(nums[i]);
		}
        
        
	}

}
