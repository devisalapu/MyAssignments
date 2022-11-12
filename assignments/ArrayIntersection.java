package week1.assignments;

import java.util.Arrays;

public class ArrayIntersection {

	public static void main(String[] args) {

		int[] numlist1 = {3,6,1,8,9,3,15,11};
		int[] numlist2 = {2,5,1,7,8,25,8,15,10};
		
		int arrlen1 = numlist1.length;
		int arrlen2 = numlist2.length;
		
		Arrays.sort(numlist1);
		
		for (int i=0;i<arrlen1;i++)
		{
			int num = numlist1[i];

				for (int j=0;j<arrlen2;j++)
					if (num == numlist2[j])
					{
						System.out.println(num);
						break;
					}
		}	
				


	}

}
