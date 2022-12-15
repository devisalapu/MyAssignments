package java1.javaassignments;

public class Java18DistinctString {

	public static void main(String[] args) {
		String[] arr1 = {"d","b","c","b","c","a"}; 
		String[] arr2= arr1;
		String[] arr3= new String[arr1.length];
		int num = 2;
		int ct=0;
		int max=0;
		for(int i=0;i<arr1.length;i++) {
			ct=0;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					ct=ct+1;
				}
			}
				if(ct==1) {
					arr3[max]=arr1[i];
				 max++;
				}	
						
		}
		
			System.out.println(arr3[num-1]);
	}

}
