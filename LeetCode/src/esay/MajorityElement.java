package esay;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int nums[] = {2,2,1,1,1,2,2,3,3,3,3,3};
		//int nums[] = {6,6,6,7,7};
		//int nums[] = {3, 3, 4};
		System.out.println("final value :"+ majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {
		int  majorityElementCount1= 0;
		int  majorityElementCount= 0;
		int count = 1;
		int count1 = 1;
		Arrays.sort(nums);
		System.out.println("final out put"+Arrays.toString(nums));
		
		if(nums.length<=1)
		{
			if(nums.length==0)
			{
				return majorityElementCount=0;
			}
			else
			{
			return 	majorityElementCount = nums[0]; 
			}
		}
		else
		{
			for(int i=1;i<nums.length;i++)// 
			{
				
				if(nums[i-1]==nums[i])//
				{
					count++;
					majorityElementCount= nums[i-1];
				}
				
				else if(nums[i-1]!=nums[i])
				{
					
					if(count>count1)//2>1
					{
						count1=count;
						count=1;
						majorityElementCount1=nums[i-1];
					}
					count=1;
				}
			}
		}
		if(count1>count)
			return majorityElementCount1;
		
					
		return majorityElementCount;
	}
}
