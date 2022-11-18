package week2.assignments.week2;

public class Palindrome {

	public static void main(String[] args) {
		
		String Palin ="madam";
		
	    String revPalin = "";
	    
		for(int i = Palin.length()-1 ; i >=0 ; i--)
		{ 
			
			revPalin = revPalin + String.valueOf(Palin.charAt(i));

		}

		if(Palin.equalsIgnoreCase(revPalin))
			System.out.println(Palin + " is a palindrome");
		else
			System.out.println(Palin + " is not a palindrome");
	}

}
