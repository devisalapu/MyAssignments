package week3.week3assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueChar {

	public static void main(String[] args) {
	
		String name = "Sreedevi";
	
		char[] chararr = name.toCharArray();
		
		Set<Character> unique = new HashSet<Character>();

		for(int x=0; x < chararr.length;x++) {
			char dup = 'n';					
		for(char y:unique) {
		if(y == chararr[x]) {
			unique.remove(y);
			dup = 'y';
			} 
		}
		if (dup == 'n')
		unique.add(chararr[x]);
		}
		System.out.println(unique); 
		
	}
}
