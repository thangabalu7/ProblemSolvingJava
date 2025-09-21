package interviewProgram;

import java.util.Arrays;

public class CutRope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,1,1,2,3,5};
		int n = a.length;
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			int cut = a[i];
			if(a[i]>0)
			{
				
				System.out.println((n-i)+" ");
				
				for(int j=i;j<n;j++)
				{
					a[j]-= cut;
				}
			}
		}
	}

}
