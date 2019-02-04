package geeks.day1;

public class BinarySearch {
	static int firstOccurence = 0;
	static int lastOccurence;

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 6, 7, 8, 9 };
		int multipleOccurencearr[] = { 2, 5, 5, 5, 5, 5, 5, 6, 8, 9 };

		int[] trappingArr = {3, 0, 0, 2, 0, 4};
		System.out.println(trapWater(trappingArr));
		/*
		 * System.out.println("Index of the searched element " + binarySearch(arr, 0,
		 * arr.length - 1, 10));
		 * System.out.println("Index of the first searched element " +
		 * firstOccurenceBinaySearch(multipleOccurencearr, 0,
		 * multipleOccurencearr.length - 1, 5));
		 * System.out.println("Total Count of occurence" +
		 * firstOccurenceBinaySearch(multipleOccurencearr, 0,
		 * multipleOccurencearr.length - 1, 5));
		 */
		//System.out.println(calcSqrt(9, 0, 9));
	}

	// Simple Binary Search
	public static int binarySearch(int[] arr, int start, int end, int value) {
		int mid = (start + (end - start) / 2);

		if (arr[mid] == value) {
			return mid;
		} else if (end == start) {
			return -1;
		} else if (arr[mid] > value) {
			return binarySearch(arr, start, mid - 1, value);
		} else {
			return binarySearch(arr, mid + 1, end, value);
		}
	}

	// MultiOccurence
	public static int firstOccurenceBinaySearch(int[] arr, int start, int end, int value) {
		int mid = (start + (end - start) / 2);

		if (arr[mid] == value) {
			if (arr[mid - 1] == value) {
				return firstOccurenceBinaySearch(arr, start, mid - 1, value);
			}
			return mid;
		} else if (end == start) {
			return -1;
		} else if (arr[mid] > value) {
			return firstOccurenceBinaySearch(arr, start, mid - 1, value);
		} else {
			return firstOccurenceBinaySearch(arr, mid + 1, end, value);
		}
	}

	public static int lastOccurenceBinaySearch(int[] arr, int start, int end, int value) {
		int mid = (start + (end - start) / 2);

		if (arr[mid] == value) {
			if (arr[mid + 1] == value) {
				return lastOccurenceBinaySearch(arr, start, mid + 1, value);
			}
			return mid;
		} else if (end == start) {
			return -1;
		} else if (arr[mid] > value) {
			return lastOccurenceBinaySearch(arr, start, mid - 1, value);
		} else {
			return lastOccurenceBinaySearch(arr, mid + 1, end, value);
		}
	}

	// Find the count of total number of Occurrences
	public static int countNumberOfOccurence(int[] arr, int start, int end, int value) {
		int mid = (start + (end - start) / 2);

		if (arr[mid] == value) {
			if (arr[mid + 1] == value) {
				return countNumberOfOccurence(arr, start, mid + 1, value);
			}
			firstOccurence = mid;
		} else if (end == start) {
			return -1;
		} else if (arr[mid] > value) {
			return countNumberOfOccurence(arr, start, mid - 1, value);
		} else {
			return countNumberOfOccurence(arr, mid + 1, end, value);
		}

		mid = (start + (end - start) / 2);
		if (arr[mid] == value) {
			if (arr[mid + 1] == value) {
				return countNumberOfOccurence(arr, start, mid + 1, value);
			}
			lastOccurence = mid;
		} else if (end == start) {
			return -1;
		} else if (arr[mid] > value) {
			return countNumberOfOccurence(arr, start, mid - 1, value);
		} else {
			return countNumberOfOccurence(arr, mid + 1, end, value);
		}
		return firstOccurence + lastOccurence;
	}

	// Calculate the Square root
	public static int calcSqrt(int queryStr, int start, int end) {
		int mid = (start + end) / 2;

		if (mid * mid == queryStr || (mid * mid < queryStr && (mid + 1) * (mid + 1) > queryStr)) {
			return mid;
		} else if (mid * mid > queryStr) {
			return calcSqrt(queryStr, 1, mid - 1);
		} else {
			return calcSqrt(queryStr, mid + 1, queryStr);
		}
	}

	public static int guessNumber(int num) {
		if (num > 50) {
			return +1;
		} else if (num < 50) {
			return -1;
		}
		return 0;
	}

	public static String tryNumber(int userNumber, int tryNum) {
		int guess = guessNumber(tryNum); // tryNum / 2;
		if (guess == 0) {
			return "Number Guessed properly" + tryNum;
		} else if (guess == -1) {

		} else {

		}

		return null;
	}

	// Trapping Water
	public static int trapWater(int[] arr) {
		int totalWaterUnits = 0;
		int[] leftMax = calcLeftMax(arr);
		int[] rightMax = calcRightMax(arr);

		for (int i = 0; i < arr.length; i++) {
			totalWaterUnits += Math.min(leftMax[i], rightMax[i]) - arr[i];
		}
		
		return totalWaterUnits; 
		// min(leftMax,rightMax) - currentLength
	}

	public static int[] calcRightMax(int[] arr) {
		int[] rightMaxArr = new int[arr.length];
		
		for (int i = 1; i < arr.length; i++) 
			rightMaxArr[i] = Math.max(rightMaxArr[i+1], arr[i]);
	           
		rightMaxArr[arr.length -1] = arr[arr.length-1];
		return rightMaxArr;
	}

	public static int[] calcLeftMax(int[] arr) {
		int[] leftMaxArr = new int[arr.length];

		leftMaxArr[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			leftMaxArr[i] = Math.max(arr[i - 1], arr[i]);
		}
		return leftMaxArr;
	}
	/**
	 * 
	 * 
	 * lftMax[] = {} for(){ leftMax[i] = max(leftMax[i-1], arr[i]) } rightMax[] = {}
	 */

	// Boolean matrix Problem

}
