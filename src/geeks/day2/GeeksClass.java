package geeks.day2;

public class GeeksClass {

	public static void main(String[] args) {
		//System.err.println(Solutions.sumPair(60));
	}
}

// Search for 2 pointer approach 
class Solutions {
	public static int[] arr = { 1, 10, 20, 30, 40, 45 };
	
	public static boolean sumPair(int sum, int start, int end) {
		int calcSum = arr[start] + arr[end];
		if(sum == calcSum ) {
			return true;
		}else if(sum > calcSum  ) {
			
		}
		return false;
	}
	
	


}

