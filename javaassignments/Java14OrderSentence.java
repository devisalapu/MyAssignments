package java1.javaassignments;

import java.util.ArrayList;
import java.util.List;

public class Java14OrderSentence {

	public static void main(String[] args) {

		String sentence = "Myself2 Me1 I4 and3";
		String sentence2 = "", sentence4 = "";
		char sentence3 = ' ';
		

			String[] s = sentence.split(" ");
			List<String> lst = new ArrayList<String>();
			
			for(int i=0;i<s.length;i++)
			{
					sentence3 = s[i].charAt(s[i].length() - 1);

				System.out.println(	lst.add(sentence3 + s[i].substring(0, s[i].length()-1)));
			
		}
			lst.sort(null);
			for(int i=0;i<lst.size();i++) {
				sentence2 = lst.get(i).substring(1, lst.get(i).length());
				sentence4 = sentence4 + sentence2 + " ";
				lst.remove(i);
				lst.add(i, sentence2);
				
			}
			System.out.println(sentence4);
	}

}
