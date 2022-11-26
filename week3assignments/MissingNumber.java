package week3.week3assignments;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		
		int num[] = {2,6,8,1,9,10};
		   //Initializing the Treeset
		   
			Set<Integer> set1= new TreeSet<Integer>();
			 for (int i=0; i<num.length; i++) {
				 set1.add(num[i]);
			 }
			 System.out.println("Sorted input numbers: " + set1.toString().replace("[", "").replace("]", "").replace(",", " "));
			 
			 int nbr = 0;
			 String mnbrs = "";
			 
			 for (Iterator<Integer> it1 = set1.iterator(); it1.hasNext();) {
				 
				int nxt = it1.next();
				nbr = nbr + 1;
				
				while (nxt != nbr) {

					mnbrs = mnbrs + nbr + " ";
					nbr = nbr + 1;
				}

			 }
			 
			 if (nbr<10) {
				 for(int j=nbr + 1;j<=10;j++)
					 mnbrs = mnbrs + j + " ";
			 
			 }
		
			 System.out.println("Missing numbers: " + mnbrs);

	}

	}


