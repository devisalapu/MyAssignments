package week1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int rng = 14;
		int stnum = 0;
		int secnum = 1;
		int sum = 0;
		
		for(int i=stnum;i<rng;i++)
		{
			System.out.println(sum);
			sum = stnum + secnum;
			stnum = secnum;
			secnum = sum;
		}
	}

}
