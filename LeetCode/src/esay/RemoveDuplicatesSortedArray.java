package esay;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,3,3,3,3,4,4,4};
		  System.out.println(nums.length);
		  System.out.println(removeDuplicates(nums));
		  System.out.println(Arrays.toString(nums));
	

	}
	
	  public static int removeDuplicates(int[] nums) {
	        int i=0;
	        for(int n:nums)
	        {
	        	if(i<2 || n>nums[i-2])	
	        		nums[i++]=n;
	        }
	      return i;
	    }
}
