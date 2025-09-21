package interviewProgram;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SyntexChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		sample input 
//		3
//		([A-Z])(.+)
//		[AZ[a-z](a-z)
//		batcatpat(nat
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases-->0){
			String pattern = in.nextLine();
                      try{
                             Pattern.compile(pattern);
                             System.out.println("Valid");       
                        }
                        catch(PatternSyntaxException e)
                        {
                                System.out.println("Invalid");
                        }
          	//Write your code
		}
                 in.close();

	}

}
