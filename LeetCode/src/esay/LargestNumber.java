package esay;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
    int [] a = {10,20,50,70,50,30};
		
    do {
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the N th largest number you need : ");
		int num=scan.nextInt();
		
		int largestNumber=0;
		int count=0;
		for(int i=a.length-1;i>=0;i--)
		{
			if(count==num)
				break;
			
			if(a[i]!=a[i-1])
				count++;
				largestNumber=a[i];
				
			
		}
		System.out.println(largestNumber);
	}while(true);
	}

}
