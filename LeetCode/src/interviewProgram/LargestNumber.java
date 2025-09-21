package interviewProgram;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int count =0;
		int a[]= {1,5,7,9,3,7,8,9};
		Arrays.sort(a);
		System.out.println(a.length);
		System.out.println("Enter the Number");
		int largestNumber = scan.nextInt();
		System.out.println(Arrays.toString(a));
		for(int i=a.length-1;i>=0;i--) {
			if(i==0)
			{
				System.out.println(a[0]);
			break;
			}
			if(a[i]!=a[i-1])
			{
				if(count<largestNumber)
				{
					System.out.println(a[i]);
					count++;
				}
				if(count==largestNumber)
					break;
			}
		}
	}

	}

