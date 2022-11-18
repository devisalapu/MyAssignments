package week2.assignments.week2;

public class FindTypes {

	public static void main(String[] args) {

		String CharType = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0; int space = 0; int num = 0; int specialChar = 0;
		
   
		for(int i = 0; i < CharType.length(); i++)
		{ 
			
			
			if (Character.isLetter(CharType.charAt(i)))
				letter++;
			
			else if (Character.isSpace(CharType.charAt(i)))
				space++;
			
			else if (Character.isDigit(CharType.charAt(i)))
				num++;
			
			else
				specialChar++;

			}

			System.out.println("letter: " + letter);
			System.out.println("space: " + space);
			System.out.println("number: " + num);
			System.out.println("specialCharcter: " + specialChar); 
		

		}

	}


