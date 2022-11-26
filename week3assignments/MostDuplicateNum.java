package week3.week3assignments;


import java.util.HashMap;

import java.util.Map;

public class MostDuplicateNum {

	public static void main(String[] args) {
		
		String name = "abbabaadbcafffffffffllllll";
		
		System.out.println("Input  : "+ name);
		
		char[] name1 = name.toCharArray();
		
		Map<Character,Integer> occ = new HashMap<Character,Integer>();
		
		for(int i=0; i<name1.length;i++) {
			if (occ.containsKey(name1[i])) {
				int value = occ.get(name1[i]);
				occ.put(name1[i], value+1);
			}
			else
			occ.put(name1[i], 1);
		}
		
		int maxValue = 0;
		char occKey = ' ';
		
		for (java.util.Map.Entry<Character, Integer> e : occ.entrySet()) {
			
			int occValue = e.getValue();
			if (occValue > maxValue) {
				maxValue = occValue;
				occKey = e.getKey();
			}
	}
		System.out.println("Most duplicate character is: " + occKey);
		System.out.println("It occurred " + maxValue + " number of times");
	}
}
