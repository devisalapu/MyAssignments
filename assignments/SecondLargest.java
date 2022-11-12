package week1.assignments;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] numlist = {3,6,1,8,9,3,15,11};
		
		int arrlen = numlist.length;
		Arrays.sort(numlist);
		System.out.println("Second largest number in the array is: " + numlist[arrlen - 2]);
	}

}
