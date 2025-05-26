package esay;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] nums1 = {1,2,3,4,5,6,7};
     int [] nums2 = {1,2,3,4,5,6,7};
     int [] nums3 = {1,2,3,4,5,6,7};
     int k=3;
     int length = nums1.length-1;
     int last=0;
    
     for(int i =0;i<k;i++)
     {
    	last=nums3[length--];
    	
      for(int j=0;j<nums1.length;j++)
      {
    	  if(j<nums1.length-1)
    	  {
    	  int a = nums1[j];
    	  nums2[j+1]=a;
    	  }
    	  
      }
     
         nums2[0]=last;
    	 nums1=nums2.clone();
     }
     System.out.println(Arrays.toString(nums2));
     
	}
	
	
}
