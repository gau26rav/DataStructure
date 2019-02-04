package geeks.day5;

import java.util.HashSet;
import java.util.StringTokenizer;

public class StringPractice {

	public static void main(String[] args) {
		System.out.println(isValidIP("0.0.0.1"));
	}

	// Tell if the str is a valid IP address(0-255) x.x.x.x
	public static boolean isValidIP(String s) {
		StringTokenizer tokeniser = new StringTokenizer(s, ".");
		Integer num;
		String token;
		StringBuilder strBuild = new StringBuilder();
		if (tokeniser.countTokens() != 4) {
			return false;
		}
		try {
			while (tokeniser.hasMoreTokens()) {
				token = (String) tokeniser.nextElement();
				num = Integer.parseInt(token);
				System.err.println(num);
				if (num < 0 || num > 255 || !token.equals(num.toString())) {
					return false;
				}
				if (tokeniser.hasMoreTokens()) {
					strBuild.append(num.toString() + ".");
				} else {
					strBuild.append(num.toString());
				}
			}
		} catch (Exception e) {
			return false;
		}
		if (!s.equals(strBuild.toString()))
			return false;

		return true;
	}
}
