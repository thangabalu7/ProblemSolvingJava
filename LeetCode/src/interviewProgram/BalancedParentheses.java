package interviewProgram;

import java.util.Stack;

public class BalancedParentheses {

	public static boolean isBalanced(String str) {
		
		Stack<Character> stack = new Stack<>();
		
		for(char ch : str.toCharArray())
		{
			if(ch=='(' || ch =='{' || ch == '[')
			{
				stack.push(ch);
			}
			else if(ch ==')'|| ch=='}'|| ch == ']')
			{
				if (stack.isEmpty())
				{
					return false;
				}
				char top = stack.pop();
				if(!matches(top ,ch))
				{
					return false;
				}
			}
		}
		return stack.isEmpty();
      
    }

    // Helper method to check matching pairs
    private static boolean matches(char open, char close) {
       return (open == '(' && close==')') || (open == '[' && close==']') || (open == '{' && close=='}') ;
    }

    public static void main(String[] args) {
        String s1 = "{[()]}";       // Balanced
        String s2 = "{[(])}";       // Not Balanced
        String s3 = "((a+b) * [c])"; // Balanced
        String s4 = "([)]";         // Not Balanced

        System.out.println(s1 + " → " + isBalanced(s1));
        System.out.println(s2 + " → " + isBalanced(s2));
        System.out.println(s3 + " → " + isBalanced(s3));
        System.out.println(s4 + " → " + isBalanced(s4));
    }
}



