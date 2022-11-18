package week2.assignments.week2;

public class CharOccurance {

	public static void main(String[] args) {
		
		String Occurance ="Welcome to Chennai";
		int counter = 0;
   
		for(int i = 0; i < Occurance.length()-1 ; i++)
		{ 
			
			if(Occurance.charAt(i)=='e')
				counter++;

		}

		System.out.println("Occurance of e in " + Occurance + " is: " + counter);

	}

}
