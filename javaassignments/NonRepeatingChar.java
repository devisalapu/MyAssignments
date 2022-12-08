package java.javaassignments;

import java.util.LinkedHashMap;

public class NonRepeatingChar {

	public static void main(String[] args) {

		String name = "loveleetcode";
		
		System.out.println("Input  : "+ name);
		
		char[] name1 = name.toCharArray();
		
		LinkedHashMap<Character,Integer> occ = new LinkedHashMap<Character,Integer>();
		
		boolean b = false;
		
		for(int i=0; i<name1.length;i++) {
			if (occ.containsKey(name1[i])) {

				occ.put(name1[i], 9999);
			}
			else
			occ.put(name1[i], i);
		}
		
		
		for (java.util.Map.Entry<Character, Integer> e : occ.entrySet()) {
			
			int occValue = e.getValue();
			
			if (occValue != 9999) {
				System.out.println("First non repeating value: " + occValue);
				b = true;
				break;
			}
	}

		if (b==false)
		System.out.println("There are no non repeating values");

	}

}
