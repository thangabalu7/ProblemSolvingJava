package interviewProgram;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLXML {
public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your HTML /  XML string : ");
		String line = in.nextLine();
		Pattern pattern = Pattern.compile("<(.+?)>([^<]+)</\\1>");

		Matcher match=pattern.matcher(line);
		boolean found =false;
		while(match.find())
		{
			System.out.println(match.group(2));
			found =true;
			
		}
		if(!found)
		{
			System.out.println("None");
		}	
	}
//4
//<h1>Nayeem loves counseling</h1>
//<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
//<Amee>safat codes like a ninja</amee>
//<SA premium>Imtiaz has a secret crush</SA premium>
//Sample Output
//
//Nayeem loves counseling
//Sanjay has no watch
//So wait for a while
//None
//Imtiaz has a secret crush

}
