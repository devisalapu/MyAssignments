package java1.javaassignments;

public class Java1LastWordLen {

	public static void main(String[] args) {

		String word = "Hello Worlds";
		String[] s = word.split(" ");
		System.out.println(s[s.length - 1].length());

	}

}
