package java1.javaassignments;

import java.util.LinkedHashMap;


public class Java11Smallest2ndOccurence {

	public static void main(String[] args) {
		String name = "abcddab";
		
		System.out.println("Input  : "+ name);
		
		char[] name1 = name.toCharArray();
		
		LinkedHashMap<Character,Integer> occ = new LinkedHashMap<Character,Integer>();
		
		for(int i=0; i<name1.length;i++) {
			if (occ.containsKey(name1[i])) {
				if(occ.get(name1[i]) == 9999)
				occ.put(name1[i], i);
			}
			else
			occ.put(name1[i], 9999);
		}
		
		System.out.println(occ);

		int minValue = 0, count = 1;
		char occKey = ' ';

		for (java.util.Map.Entry<Character, Integer> e : occ.entrySet()) {
			
			int occValue = e.getValue();
			if (count==1)
				minValue = occValue;
			
				count++;

			if (occValue <= minValue) {
				minValue = occValue;
				occKey = e.getKey();
			}

	}
 System.out.println("The Smallest second occurrence character is: " + occKey);

	}

}
