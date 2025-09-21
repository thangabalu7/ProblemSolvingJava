package interviewProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 2, 3, 4, 4}; 
		Set<Integer>set = new LinkedHashSet<>();
        for(int num:arr)
        {
        	set.add(num);
        }
        System.out.println(set);
	}

}
