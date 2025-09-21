package interviewProgram;

import java.math.BigInteger;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 47;
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) 
		{
//			Half of 47 is 23.5, so num / 2 = 23 (integer division),Any number greater than 23 can't divide 47 except 47 itself.
//
//			So, checking beyond num / 2 is pointless and wastes time.
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(isPrime ? "Prime" : "Not Prime");
		 System.out.println(new BigInteger("17").isProbablePrime(100) ? "prime" : "not prime");

	}

}
