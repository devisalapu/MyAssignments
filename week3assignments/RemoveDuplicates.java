package week3.week3assignments;



public class RemoveDuplicates {

	public static void main(String[] args) {

		
		String word = "We learn java basics as part of java sessions in java week1";
		
		String[] wordArray = word.split(" ");
		
		String distinctwrd = "";
		

			for (int i=0;i<wordArray.length;i++) {
				String wrd = wordArray[i];
			
				int dupcnt = 0;
			for (int j=i+1;j<wordArray.length;j++) {
				
				if (wordArray[j].equals(wrd)) {
					
					dupcnt = dupcnt + 1;
					break;
				}
			}
			
			if(dupcnt == 0) {
				distinctwrd = distinctwrd + wrd + " ";
			}

			}
			System.out.println(distinctwrd);
	}

}
