package geeks.day5;

import java.util.HashMap;

public class StringQuestions {

	public static void main(String[] args) {
		System.out.println(addDigits(123));
		System.out.println(findSum(new int[] { 1, 2, 3 }, 0));
	}

	public static boolean canBePalindrome(String str) {
		HashMap<String, Integer> countMap = new HashMap<String, Integer>();
		Character ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			// countMap.containsKey(;
		}
		return false;
	}

	// Without Sorting
	public static boolean possiblePalinedrome(String input) {
		char[] inputArr = input.toCharArray();
		int oddCount = 0, evenCount = 0;

		for (int i = 0; i < inputArr.length; i++) {
			for (int j = i; j < inputArr.length; j++) {
				if (inputArr[i] == inputArr[j]) {
					evenCount++;
				}
			}
		}
		return false;
	}

	public static int addDigits(int num) {
		if (num == 0)
			return 0;
		return (num % 10) + addDigits(num / 10);
	}

	public static int findOnes(int num, int count) {
		if (num == 0)
			return 0;
		if (num % 10 == 1)
			count++;
		return count + findOnes(num / 10, count);
	}

	public static int findSum(int arr[], int pointer) {
		if (pointer == arr.length)
			return 0;
		return arr[pointer] + findSum(arr, ++pointer);
	}
	
	public static int countNoOfSetBits(int num, int count) {
		return 1;
		
	}
}
