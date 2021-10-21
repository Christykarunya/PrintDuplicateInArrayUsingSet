package week3.day2;


import java.util.LinkedHashSet;
import java.util.Set;


public class PrintDuplicatesInArrayUsingSet {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,15,19,18,17,20};
		Set<Integer> dup = new LinkedHashSet<Integer>(); //to store in ascending order
		for (int i = 0; i < arr.length; i++) {
			if(!dup.add(arr[i])) {
				System.out.println(arr[i]); //print duplicate values
			}
		}
		System.out.println(dup); //print only unique values stored in Set
		

	}

}
