package interviewProgram;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 // helloworld
		    String S = in.next();
		    int start = in.nextInt();
		    int end = in.nextInt();
		    System.out.println(S.substring(start,end));

	}

}
