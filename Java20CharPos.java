package java1.javaassignments;

import java.util.ArrayList;
import java.util.List;

public class Java20CharPos {

	public static void main(String[] args) {

		String word = "aaab";
		String s1 = "b";

		char[] chars = word.toCharArray();
		List <Integer> result = new ArrayList<Integer>();
		int pos = word.indexOf(s1);

		for(int i=0;i<chars.length;i++) {
			result.add(Math.abs(pos - i));
		}
		
		System.out.println(result);

	}
}
