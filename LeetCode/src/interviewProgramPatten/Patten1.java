package interviewProgramPatten;

public class Patten1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  // pattens1();
  pattens5();
	//	pattens5();
	}
	static void pattens1()
	{
		int n=5;
		for(int row=1;row<=n;row++)
		{
			for(int col=1 ; col<=row ;col++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattens2()
	{
		int n=5;
		for(int row=0;row<n;row++)
		{
			for(int col=1 ; col<=n-row;col++ )
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	static void pattens3()
	{
		int n=5;
		for(int row=0;row<n;row++)
		{
			for(int col=1 ; col<=n-row;col++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattens4()
	{
		int n=10;
		for(int row=0;row<n;row++)
		{
			
		if(row<5)
		{
			for(int col=0;col<=row;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		else
		{
		for(int col=0 ; col<n-row-1;col++)
		{
			System.out.print("* ");
		}
		System.out.println();
		}
		}
	}
	
	static void pattens5()
	{

		  int n = 5;  // height of half diamond

	        // Upper half
	       for(int row = 1;row<=n;row++)
	       {
	    	   for(int space =1;space<=n-row;space++)
	    	   {
	    		   System.out.print(" ");
	    	   }
	    	   for(int col=1;col<=row;col++)
	    	   {
	    		  System.out.print("* "); 
	    	   }
	    	   System.out.println();
	       }
	       
	       for(int row=n-1;row>=1;row--)
	       {
	    	   for(int space =1;space<=n-row;space++)
	    	   {
	    		   System.out.print(" ");
	    	   }
	    	   for(int col=1;col<=row;col++)
	    	   {
	    		   System.out.print("* ");
	    	   }
	    	   System.out.println();
	       }
	}

}
