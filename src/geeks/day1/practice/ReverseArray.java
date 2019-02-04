package geeks.day1.practice;

public class ReverseArray {

	static int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static void main(String[] args) {
		reverseArrar(3);

		for (int elem : arr) {
			System.out.print(elem + "  ");
		}
	}

	public static int[] reverseArrar(int subArrSize) {
		int len = arr.length;
		int count = 1, end = 0, temp, endPointer = 0, start = 0;
		for (int i = 0; i < len; i++) {
			if (count == 1) {
				end = Math.min(((count++) * subArrSize), len - 1) - 1;
				endPointer = end;
				start = 0;
			}

			temp = arr[i];
			arr[i] = arr[endPointer];
			arr[endPointer] = temp;
			if (i == end - ((end - start) / 2)) {
				start = end + 1;
				i = end;
				end = Math.min((count++ * (subArrSize)), len) - 1;
				endPointer = end;
				continue;
			}
			endPointer--;

		}
		return arr;
	}
}
