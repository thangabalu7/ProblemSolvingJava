package interviewProgram;

import java.util.Stack;

public class Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1 = "(a+b) * (c+d)";
	        String s2 = "(a+b))(";
	        String s3 = "((a+b)";

	        System.out.println(s1 + " → " + isBalanced(s1)); // true
	        System.out.println(s2 + " → " + isBalanced(s2)); // false
	        System.out.println(s3 + " → " + isBalanced(s3)); // false

	}

	public static boolean isBalanced(String s1) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack();
		
		for (char ch : s1.toCharArray())
		{
			if(ch == '(') {
				stack.add(ch);
			}
			else if(ch ==')')
			{
				if(stack.empty() || stack.pop()!='(')
				{
					return false ;
				}
			}
		}
		return stack.empty();
	}

}
