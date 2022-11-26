package week3.week3assignments;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupChar {

	public static void main(String[] args) {
		
		String name = "PayPal India";
		String name1 = name.toLowerCase();
		System.out.println(name);
		char[] chararr = name1.toCharArray();
		Set<Character> charset = new HashSet<Character>();
		Set<Character> dupcharset = new HashSet<Character>();
		for(int x=0;x<chararr.length;x++)
		{
			for(char y:charset) {
				if(y == chararr[x])
					dupcharset.add(y);
			}
			if(chararr[x] != ' ')
			charset.add(chararr[x]);
			
			
		}
	
		System.out.println("Charset values :" + charset);
	System.out.println("Dupcharset values : " + dupcharset);
	for(char z:dupcharset) {
		charset.remove(z);
		
	}
	System.out.println("Result set :"  + charset);
	}
	

}
