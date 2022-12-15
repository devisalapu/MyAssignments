package java1.javaassignments;

public class MaxWords {

	public static void main(String[] args) {

		String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		int len = 0;
		for(int i=0;i<sentences.length;i++) {
			String s = sentences[i];
			String[] s1 = s.split(" ");
			if(i==0)
				len = s1.length;
				
			if(s1.length > len)	
				len = s1.length;
			
		}
		System.out.println("Maximum word sentence has " + len + " words");
	}
}
