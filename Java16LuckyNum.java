package java1.javaassignments;

public class Java16LuckyNum {

	public static void main(String[] args) {
		int[] arr1 = new int[]{1,2,2,3,3,3}; 
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
				//System.out.println(arr1[i]+" " +ct);
				if((arr1[i]==ct)&&(max<ct))
					max=ct;
				
						
		}
		if (max==0)
			System.out.println("-1");
		else
			System.out.println(max);

	}

}
