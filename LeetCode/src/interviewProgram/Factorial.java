package interviewProgram;

public class Factorial {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}
	
	public static int factorial(int n)
	{
		return (n==0 || n==1)?1 : n*factorial(n-1);
		
	}
	
}
