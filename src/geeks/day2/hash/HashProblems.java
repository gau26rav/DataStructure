package geeks.day2.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashProblems {

	static int[] arr = { 10, 20, 10, 20, 40 };
	static int[] unsortedArr = { 10, 20, 10, 20, 40, 50, 60, 15, 15 };

	public static void main(String[] args) {
		/*
		 * System.out.println("Number of distinct elements are " +
		 * calculateNoOfDistinictElement());
		 * 
		 * System.out.println("Occurence in the order "); Set<Integer> set =
		 * distinctInSameOrder(); for (int elem : set) System.out.print(elem + " ");
		 */

		System.err.println("\n");
		recursion(5, 1);
	}

	public static Set<Integer> distinctInSameOrder() {
		Set<Integer> set = new LinkedHashSet<>();
		for (int elem : arr)
			set.add(elem);
		return set;
	}

	public static int calculateNoOfDistinictElement() {
		Set<Integer> set = new HashSet<Integer>();
		for (int elem : arr)
			set.add(elem);

		for (int elem : set)
			System.out.print(elem + " ");

		return set.size();
	}

	public static HashMap<Integer, Integer> calcFrequency() {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		return hashMap;
	}

	public static boolean pairInUnSortedArray(int sum) {
		Set<Integer> set = new HashSet<>();
		for (int elem : arr) {
			if (set.contains(sum - elem)) {
				return true;
			} else {
				set.add(elem);
			}
		}
		return false;
	}

	public static boolean pairInSortedArr() {

		return false;
	}

	public static boolean tripeletInUnsortedArray(int sum) {
		Arrays.sort(unsortedArr);

		for (int elem : unsortedArr) {
			if (pairInUnSortedArray(sum - elem)) {
				return true;
			}
		}
		return false;
	}

	public static void recursion(int n, int counter) {
		if (counter <= n) {
			System.out.print(counter + " ");
			recursion(n, ++counter);
		} 
	}
	
	
	//check whether the array has a subset with the given sum
	public static void sumInSubset(int sum) {
		
	}
}
