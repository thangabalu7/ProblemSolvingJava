package interviewProgram;

import java.util.stream.Stream;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	//below concept is using Recursive
//	  int m = 10;
//        System.out.print("Fibonacci Series: ");	      
//        for (int i = 0; i < m; i++) {
//	            System.out.print(fibonacci(i) + " "+"--");
//	            
//	        }
		Fibonacci.fasterway();
		//System.out.println("Fibonacci number: " + fibonacci(10));
	  //      stream();
	}
	static int fibonacci(int n) {
		 if (n == 0) return 0;
	        if (n == 1) return 1;

	        return fibonacci(n - 1) + fibonacci(n - 2);
        
    }
	
	//below solving O(n)
	public static void fasterway() {
	int h = 10; // Number of terms
    int[] fib = new int[h];

   fib[0] =0;
   fib[1] =1;
   System.out.print(fib[0]+" "+fib[1]+" ");
   
   for(int i=2 ;i<h;i++)
   {
	   fib[i] = fib[i-1]+fib[i-2];
	   System.out.print(fib[i]+ " ");
   }
	}
	// below concept using stream
	public static void stream() {
        int n = 10;

        System.out.print("Fibonacci Series: ");
        // every time this will create new array 1st time -> [0,1] -> 0, 2nd -> [1,1]->1, 3rd -> [1,2], 4th->[2,3] , 5th ->[3,5]
        Stream.iterate(new int[] {0,1}, s->new int[] {s[1],s[0]+s[1]}).limit(n).map(x->x[0]).forEach(System.out::print);
    }
}
