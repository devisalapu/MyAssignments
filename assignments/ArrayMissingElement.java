package week1.assignments;

public class ArrayMissingElement {

	public static void main(String[] args) {

		int[] numlist1 = {1,2,3,4,6,8,9};
		
		int arrlen = numlist1.length;
		int arrindex = 0;
		
		for (int i=0;i<10;i++)
		
			
			if (arrindex < arrlen && (i+1 != numlist1[arrindex]))
			{
				System.out.println(i+1);
			}
			else
				arrindex = arrindex + 1;
			
	}

}
