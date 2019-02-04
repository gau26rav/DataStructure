package geeks.day4;

import java.util.Arrays;

public class SortingProblems {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 9, 7, 1, 1 };
		System.out.println(findMaxItemsOrdered(10, 6, arr));
	}

	public static int findMaxItemsOrdered(int amt, int len, int arr[]) {
		Arrays.sort(arr);
		int sum = 0, i = 0;
		while (sum <= amt) {
			sum += arr[i++];
		}
		return i - 1;
	}
	
	public static int fractionalKnapSach() {
		return -1;
	}
}
