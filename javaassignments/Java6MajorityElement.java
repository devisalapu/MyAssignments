package java1.javaassignments;

import java.util.HashMap;
import java.util.Map;

public class Java6MajorityElement {

	public static void main(String[] args) {

		int[] nums = {3,2,3,1,1,1,6,6,6,6,6,6,6,6,6,6,6,5,5,5};
		
		Map<Integer,Integer> occ = new HashMap<Integer,Integer>();
		
		int mid = nums.length / 2;
		System.out.println("mid is: " + mid + " of " + nums.length);
		boolean majority = false;
		for(int i=0; i<nums.length;i++) {
			if (occ.containsKey(nums[i])) {
				int value = occ.get(nums[i]);
				if ((value + 1) > mid)
				{
					System.out.println("Majority Number is: " + nums[i]);
					majority = true;
					break;
				}
					
				occ.put(nums[i], value+1);
			}
			else
			occ.put(nums[i], 1);
			
		}
		if (majority == false)
			System.out.println("There is not majority number");
			
	}

}
