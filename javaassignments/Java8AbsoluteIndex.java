package java1.javaassignments;

import java.util.HashMap;
import java.util.Map;

public class Java8AbsoluteIndex {

	public static void main(String[] args) {


		int[] nums = {1,2,3,1,2,3};
		int k = 2;
		
		Map<Integer,Integer> occ = new HashMap<Integer,Integer>();
		
		boolean majority = false;
		for(int i=0; i<nums.length;i++) {
			if (occ.containsKey(nums[i])) {
				int value = occ.get(nums[i]);
				if (Math.abs(value - i) <= k)
				{
					System.out.println("True");
					majority = true;
					break;
				}
					
				occ.put(nums[i], value+1);
			}
			else
			occ.put(nums[i], i);
			
		}
		if (majority == false)
			System.out.println("False");

	}

}
