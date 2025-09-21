package interviewProgram;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Programming";
		LinkedHashSet set = new LinkedHashSet<>();
		
		for(char strs : str.toCharArray()) {
			set.add(strs);
		}
		System.out.println(set);
		
		StringBuilder builder = new StringBuilder();
		for(Object a : set)
		{
		   builder.append(a);	
		}
		System.out.println(builder);

	}

}
