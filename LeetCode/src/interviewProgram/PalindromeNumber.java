package interviewProgram;

public class PalindromeNumber {
	public static void main(String[] args)
	{
	int a =112211;	
	int cpy = a;
	int b=0;
	while(a!=0)
	{
		b = b*10+a%10;
		a=a/10;
	}
	System.out.println(b==cpy?"Palindrome":"Not Palindrome");
	}

}
