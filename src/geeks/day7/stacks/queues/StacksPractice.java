package geeks.day7.stacks.queues;

import java.util.Stack;

public class StacksPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean balancedParanthesis(String str) {
		Stack<String> stack = new Stack<>();
		char[] arr = str.toCharArray();
		String popedStr= null;

		for (char ch : arr) {
			if (ch == '{' || ch == '(' || ch == '[') {
				stack.push(""+ch);	
			}
			
			if (ch == '}' || ch == ')' || ch == ']') {
				popedStr = stack.pop();	
				
			}
		}

		return false;
	}

}
