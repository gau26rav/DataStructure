package geeks.day3;

public class Equilibrium {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 8, 2, 11, 12 };
		System.out.println("Equilibrium Index = " + equilibriumIndex(arr));
	}

	public static int equilibriumIndex(int[] arr) {
		int sum1[] = new int[arr.length];
		int sum2[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			sum1[i] += arr[i];
		}

		for (int i = arr.length - 1; i >= 0; i++) {
			sum2[i] += arr[i];
			if (sum1[i] - sum2[i] == 0)
				return i;
		}
		return -1;
	}

	public static boolean sumInSubArray(int sum) {

		return false;
	}

}
