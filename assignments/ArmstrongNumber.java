package week1.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
			int i = 153;
		    String s = String.valueOf(i);
			
			int stLen = s.length();
			int sum = 0;
			for (int j=0;j<stLen;j++)
			{
				String subst = s.substring(j, j+1);
				int subint = Integer.valueOf(subst);
				int subint1 = subint;
				
				
				for (int m=0;m<stLen-1;m++)
				{
						subint = subint1 * subint;
				}
				sum = sum + subint;	
				
			}
			
			if (sum == i)
				System.out.println(i  + " is an Armstrong number");
			else
				System.out.println(i  + " is not an Armstrong number");
	}

}
