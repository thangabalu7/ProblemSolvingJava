package interviewProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	static boolean isAnagram(String a, String b) {
		   if(a.length()!=b.length())
			   return false;
		   
		  String a1= a.toLowerCase();
		  String b1= b.toLowerCase();
		  char [] a2=a1.toCharArray();
		  char [] b2 = b1.toCharArray();
		  
		  Arrays.sort(a2);
		  Arrays.sort(b2);
		  
		  return (Arrays.equals(a2, b2));
		   
		}

		public static void main(String[] args) {

		    Scanner scan = new Scanner(System.in);
		    String a = scan.next();
		    String b = scan.next();
		    scan.close();
		    boolean ret = isAnagram(a, b);
		    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		}
}
