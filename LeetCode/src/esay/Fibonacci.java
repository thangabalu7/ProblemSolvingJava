package esay;

public class Fibonacci {

	public static void main(String[] args) {
		
		
    int num1=0,num2=1,num3=0,length=8;
    
    //num1=0,
    //num2=1,
    //num3=0,1
    for(int i=0;i<=length;i++)
    {
    	System.out.println(num1);
    	num3=num1+num2;
    	num1=num2;
    	num2=num3;
    	
    }
		
		

	}

}
