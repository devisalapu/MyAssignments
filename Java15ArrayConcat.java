package java1.javaassignments;

public class Java15ArrayConcat {

	public static void main(String[] args) {
		
		String[] word1 = {"a","cb"};
		String[] word2 = {"ab", "c"};
		String str1 = " ";
		String str2 = " ";
		
		
		for(int i = 0; i<word1.length;i++) {
		str1 = str1.concat(word1[i]);
		}
		System.out.println(str1);
		for(int j = 0; j<word2.length;j++) {
			str2 = str2.concat(word2[j]);
			}
			System.out.println(str2);
			
			if (str1.equals(str2))
			    System.out.println("True");
			else
				System.out.println("False");
			
	}

}
