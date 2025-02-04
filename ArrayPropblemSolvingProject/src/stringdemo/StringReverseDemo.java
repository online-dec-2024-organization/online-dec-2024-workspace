package stringdemo;

import java.util.Stack;

public class StringReverseDemo {

	public static String reverse1(String str) {
		String result = "";
		for(int i=str.length()-1;i>=0;i--) {
			result += str.charAt(i);
		}
		return result;
	}
	
	public static String reverse2(String str) {
		StringBuffer sb = new StringBuffer(str);
		String result = new String(sb.reverse());
		return result;
	}
	
	public static String reverse3(String str) {
		
		int mid = str.length() / 2;
		char[] charStr = new char[str.length()];
		int k = 0;
		for(int i=str.length()-1, j=0;i>=mid;i--,j++) {
			charStr[j] = str.charAt(i);
			charStr[i] = str.charAt(j);
		}
		String result = new String(charStr);
		return result;
	}
	
	public static String reverse4(String str) {
		
		char[] reverseStr = new char[str.length()];
		
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<str.length();i++) {
			stack.push(str.charAt(i));
		}
		
		int j = 0;
		while(!stack.isEmpty()) {
			reverseStr[j] = stack.pop();
			j++;
		}
		
		return new String(reverseStr);
	}
	
	public static void main(String[] args) {
		String str = "welcome";
		String output = reverse4(str);
		System.out.println(str);
		System.out.println(output);

	}

}
