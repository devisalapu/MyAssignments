package week2.assignments.week2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "potss";
		if (text1.length()== text2.length())
		{
			char[] text1arr = text1.toCharArray();
			char[] text2arr = text2.toCharArray();
			
			
			Arrays.sort(text1arr);
			Arrays.sort(text2arr);
			
			 System.out.println(text1arr);
			 System.out.println(text2arr);
		
			if (String.valueOf(text1arr).equalsIgnoreCase(String.valueOf(text2arr)))				
				System.out.println(text1 + " and " + text2 +" are Anagrams");
			else
				System.out.println(text1 + " and " + text2 +" are not Anagrams");
		}
		else
		System.out.println(text1 + " and " + text2 +" are not Anagrams");
	}
}
