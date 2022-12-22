package java1.javaassignments;


public class Java10JewelStones {

	public static void main(String[] args) {

		String jewels = "aAbcz";
		String stones = "aAAbbbbZ";
		int count = 0;
			
		char[] jewel = jewels.toCharArray();
		
		for(int i=0; i<jewel.length;i++) {

			if (stones.contains(String.valueOf(jewel[i]))) {
				count++;
			}

	}
		System.out.println(count);
	}

}
