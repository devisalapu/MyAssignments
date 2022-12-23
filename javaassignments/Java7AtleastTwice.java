package java1.javaassignments;

import java.util.HashMap;
import java.util.Map;

public class Java7AtleastTwice {

	public static void main(String[] args) {


		int[] nums = {3,2,3,1};
		
		Map<Integer,Integer> occ = new HashMap<Integer,Integer>();
		
		boolean majority = false;
		for(int i=0; i<nums.length;i++) {
			if (occ.containsKey(nums[i])) {
					System.out.println("Atleast one number appears twice");
					majority = true;
					break;
				}

			else
			occ.put(nums[i], 1);
			
		}
		if (majority == false)
			System.out.println("No number appears twice");

	}

}
