package interviewProgram;

import java.util.Scanner;

public class UserNameValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String validSyntax = "^[a-zA-Z][a-zA-Z0-9_]{7,100}$";
		                   // "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
		while(scan.hasNext())
		{
			System.out.println("Enter the username : ");
			String name = scan.nextLine();
			if(name.matches(validSyntax))
			{
				System.out.println("Valid user name ");
			}
			else 
			{
				System.out.println(" Invalid user name ");
			}
		}

	}

}
