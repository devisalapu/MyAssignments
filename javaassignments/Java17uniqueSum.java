package java1.javaassignments;

public class Java17uniqueSum {

	public static void main(String[] args) {
		int[] arr1 = new int[]{1,2,3,4,5}; 
		int[] arr2 = arr1;
		int ct=0;
		int max=0;
		for(int i=0;i<arr1.length;i++) {
			ct=0;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					ct=ct+1;
				}
			}
				if(ct==1)
					max=max+arr1[i];
				
						
		}
		
			System.out.println(max);

	}

}
