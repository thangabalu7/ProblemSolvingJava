package interviewProgram;

import java.util.Scanner;

public class RemoveExtraCharacterInString {
	
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();

	        // Replace , ' & ? with space
	       s = s.replaceAll("[^a-zA-Z0-9]", "");

	        // Split by one or more spaces (ignores multiple spaces)
	        String[] s1 = s.trim().split("\\s+");

	        // Print number of words
	        System.out.println(s1.length);
	        System.out.println(s);
	       
	        scan.close();
	    }

}
