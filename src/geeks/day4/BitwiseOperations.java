package geeks.day4;

public class BitwiseOperations {

	public static void main(String[] args) {

		/*
		 * System.out.println(findKthBitIsSetOrNot(3, 7));
		 * System.out.println("Even Or not = " + evenOrNot(6)); calculateBinary(8);
		 * convertBinaryToDecimal("10000000000000000000000000000000");
		 * convertBtoD("10000000000000000000000000000000");
		 */
		// System.out.println(findleftMostSetBit(16));
		System.out.println("Whether number is in power of 4 = " + noIsInPowOfFour(8));
		// convertBinaryToDecimal("00000000000000000000000000000000");
		// calculateBinary(0);
		reverseBinary(2147483648L);
	}

	public static void performBitwiseOperations() {
		// 7 = 111 converts to 1110 after left shift which means 7 multiplied by 2^1
		System.out.println("Left Shift Operations = " + (7 << 1));

		// 7 = 111 converts to 011 after right shift which means 7 divided by 2^1
		System.out.println("Left Shift Operations = " + (7 >> 1));
	}

	// Create a mask with only kth bit as set and then check if the and operation
	// gives 0 it means the bit is unset and vice versa
	public static boolean findKthBitIsSetOrNot(int k, int num) {
		int mask = (int) Math.pow(2, k - 1);
		return ((mask & num) == mask);
	}

	// A number can only be odd if 2^0 is set else in every case the number will
	// remain even
	public static boolean evenOrNot(int num) {
		int mask = (int) Math.pow(2, 0);
		return ((num & mask) == 0);
	}

	// n-1 is complement of n (only valid in case of num as 2^k) so it's and
	// operation will return 0
	public static boolean noIsInPowerOftwo(int num) {
		return (num & (num - 1)) == 0;
	}

	public static boolean noIsInPowOfFour(int num) {
		int bitPosition = 0;
		if ((num & num - 1) == 0) {
			while ((num & 1) == 0) {
				num = num >> 1;
				++bitPosition;
			}
			if (bitPosition % 2 == 0)
				return true;
		}
		return false;
	}

	public static void calculateBinary(int num) {
		int rem, que = 0;
		StringBuilder binary = new StringBuilder();
		if (num != 0) {
			while (num > 0) {
				rem = num % 2;
				binary.append(rem);
				num = num / 2;
			}
			binary.reverse();
		} else
			binary.append(0);

		String confirmBinary = String.format("%1$" + 14 + "s", binary.toString()).replace(' ', '0');
		System.out.println("Binary Conversion = " + confirmBinary);
	}

	public static long convertBinaryToDecimal(String num) {
		int bit;
		long number = 0;
		for (int i = num.length() - 1; i >= 0; i--) {
			bit = Integer.parseInt("" + num.charAt(i));
			number += (bit * Math.pow(2, num.length() - 1 - i));
		}

		System.out.println(number);
		return number;
	}

	private static void reverseBinary(long num) {
		StringBuffer binaryStr = new StringBuffer();
		if (num != 0) {
			while (num > 0) {
				binaryStr.append(num % 2);
				num = num / 2;
			}
			binaryStr.reverse();
		} else {
			binaryStr.append(0);
		}

		String binaryString = String.format("%1$" + 32 + "s", binaryStr.toString()).replace(' ', '0');

		long decimalNumber = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			decimalNumber += Integer.parseInt("" + binaryString.charAt(i)) * Math.pow(2, i);
		}
		System.out.println(decimalNumber);

	}

	public static void convertBtoD(String num) {
		long number = 0;
		int bit;
		for (int i = 0; i < num.length(); i++) {
			bit = Integer.parseInt("" + num.charAt(i));
			number += (long) (bit * Math.pow(2, i));
		}
		System.out.println(number);
	}

	public static int findleftMostSetBit(int num) {
		int count = 0;
		while ((num & 1) == 0) {
			num = num >> 1;
			count++;
		}
		return count + 1;
	}

}
