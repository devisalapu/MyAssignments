package week3.week3assignments;

import java.util.ArrayList;

import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {
		
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		   //Initializing the Treeset
		   
			Set<Integer> set1= new TreeSet<Integer>();
			 for (int i=0; i<data.length; i++) {
				 set1.add(data[i]);
			 }
			 System.out.println("Sorted input numbers: " + set1.toString().replace("[", "").replace("]", "").replace(",", " "));
			 
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.addAll(set1);
		System.out.println("Second largest number of given input is : " + list1.get(list1.size()-2));
		

	}

	
	}


