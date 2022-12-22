package java1.javaassignments;

public class Java19RepChar {

	public static void main(String[] args) {
		String[] words = {"bella","label","roller"};
		String s1 = "";
		String rs = "";
		boolean found = false;
			char[] chars = words[0].toCharArray();
			for(int m=0;m<chars.length;m++) {
			for(int j=1;j<words.length;j++) {

				s1 = Character.toString(chars[m]);

						if(words[j].contains(s1)) {
							found = true;
						}
							else {
								found=false;
								break;
							}
						}
			if(found==true)
				rs = rs+" "+s1;
					}	
				{
			}

		System.out.println(rs);
		}
	}


