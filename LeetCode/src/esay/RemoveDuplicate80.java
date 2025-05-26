package esay;

import java.util.Arrays;

public class RemoveDuplicate80 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int [] nums= {0,0,1,1,1,1,2,3,3};
      System.out.println(removeDuplicates(nums));
	}
	
	public static  int removeDuplicates(int[] nums) {
        int k=0;
        int num = nums.length;
        int count =0;
        for(int i=1;i<nums.length;i++)
        {
        	if(count<2)
        	{
        	if(nums[i-1]==nums[i])
        	{
        	 count++;
        	 k++;
        	}
        	}else if(count>2 && nums[i-1]==nums[i])
        	{
        		count=0;
        		nums[num--]=nums[i];
        		
        	}
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

}
