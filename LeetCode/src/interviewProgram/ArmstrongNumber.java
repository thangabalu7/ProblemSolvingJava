package interviewProgram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153, sum=0,temp = num,temp1=num;  // 1*3 +5*3 + 3*3
		int count =0;
		while(temp>0)
		{
			count++;
			temp = temp/10;
		}
	
		while(temp1!=0)
		{
			int count1=0;
			int variable = temp1%10;
			int sum1 =1;
		    while(count1<count)
		    {
		    	sum1 *= variable;
		    	count1++;
		    }
		    temp1 = temp1/10;
		    sum +=sum1;	
		}
		
		int orgNumber = 153;
		int numbers = orgNumber;
		int result =0;
		int n= String.valueOf(numbers).length();
		
		while(numbers!=0)
		{
			int digit = numbers%10;
			result +=Math.pow(digit, n);
			numbers /=10;
		}
		
		System.out.println(result);

	}

}
