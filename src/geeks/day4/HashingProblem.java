package geeks.day4;

import java.util.Arrays;
import java.util.HashMap;

public class HashingProblem {

	public static void main(String[] args) {
		int[] arr = { 7, 3, 2, 4, 9, 12, 35 };
		System.out.println(distributeChocolate(arr, 3  ));
	}

	// 2,4,5,6,7 5 output 6
	public static int findNextGreater() {
		return -1;
	}

	// input arr
	public static String findWinningCandidate(String votes[]) {
		char[] arr = votes[0].toCharArray();
		return "";
	}
	
	 private static void testDivisibiityByThree(String binary){
	     char[] arr = binary.toCharArray();
	     int bit, evenCount = 0, oddCount =0;
	     for(int count = 0; count < arr.length; count++){
	         bit = Integer.parseInt("" + arr[count]);
	         if(bit == 1){
	             if(((count+1) % 2) == 0){
	                 ++evenCount;
	             }else{
	                 ++oddCount;
	             }
	         }
	     }
	    if(((oddCount-evenCount) % 3 ) == 0){
            System.out.println("1");	     
	    }else{
            System.out.println("0");	     
	    } 
	 }
	 
	 
	public static int distributeChocolate(int[] arr, int numberOfPeople) {
		Arrays.sort(arr);

		int minDiff = 0;
		for (int i = 0; i < arr.length - numberOfPeople; i++) {
			if (minDiff > arr[i] - arr[i + numberOfPeople - 1])
				minDiff = arr[i] - arr[i + numberOfPeople - 1];
		}
		return minDiff;
	}
}
