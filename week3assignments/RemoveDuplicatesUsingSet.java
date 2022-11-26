package week3.week3assignments;


import java.util.LinkedHashSet;


public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		
		String word = "We learn java basics as part of java sessions in java week1";
		
		String[] wordArray = word.split(" ");

		LinkedHashSet<String> dup = new LinkedHashSet<String>();
		
		for (int i=0;i<wordArray.length;i++) {
			dup.add(wordArray[i]);
			
			}
		
		System.out.println(dup.toString().replace("[", "").replace("]", "").replace(",", ""));
		
	}

}
