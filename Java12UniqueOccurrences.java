package java1.javaassignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Java12UniqueOccurrences {

	public static void main(String[] args) {
		int[]  arr = {1,2,2,1,1,3,1};
		
		System.out.println("Input  : "+ arr);
		
		LinkedHashMap<Integer,Integer> occ = new LinkedHashMap<Integer,Integer>();
		int value = 0;
				
		for(int i=0; i<arr.length;i++) {
			if (occ.containsKey(arr[i])) {
				value = occ.get(arr[i]);
				occ.put(arr[i], value+1);
			}
			else
			occ.put(arr[i], 1);
		}
		
		System.out.println(occ);

		
		boolean b = false;

		List<Integer> lst = new ArrayList<Integer>(occ.values());
		System.out.println(lst);
		
				
		for(int i=0;i<(lst.size()-1);i++) {
			if(lst.get(i) == lst.get(i+1)) {
				System.out.println("False");
				b=true;
			break;
			}
		}
		if (b==false)
			System.out.println("True");
	}
		
}
