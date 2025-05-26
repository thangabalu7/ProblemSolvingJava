package esay;

import java.util.HashSet;

public class DuplicateCount {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,2,3,4,4,4,5,3};
		//output c = 2,3,4
		HashSet<Integer>setter = new HashSet<Integer>();
		for(int num : a)
		{
			if(!setter.contains(num))
			{
				setter.add(num);
			}
				
		}
		for(int nums : setter)
		{
			int count =0;
			for(int i=0;i<a.length;i++)
			{
			if(nums == a[i])
				count++;
			}
			if(count>=2)
			{
				System.out.println(nums);
			}
		}
		

	}

}
