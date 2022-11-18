package week2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String InputWord = "I am a software tester";
		
		String[] wordArray = InputWord.split(" ");
		String OutputWord = "";
		
		for (int i = 0; i < wordArray.length; i++) {
			
			if(i % 2 == 1)
			{ 	
				String revWord = "";
				for(int j = wordArray[i].length() - 1 ; j >=0 ; j--)			
					revWord = revWord + String.valueOf(wordArray[i].charAt(j));

				OutputWord = OutputWord + revWord + " ";
				}
			else
				OutputWord = OutputWord + String.valueOf(wordArray[i]) + " ";
		
		}
		
		System.out.println(OutputWord.trim());
		
	}

}
