package interviewProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class Union {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcabc", s2 = "bcdxyz" ; //→ Output: abcdyz
		
		System.out.println(unionCheck(s1,s2));
		

	}
	
	public static StringBuilder unionCheck(String s1 , String s2)
	{
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new LinkedHashSet<>();
		
		for(char a : s1.toCharArray())
		{
			set.add(a);
		}
		for(char a : s2.toCharArray())
		{
			set.add(a);
		}
		
		for(char a : set)
		{
			sb.append(a);
		}
		return sb;
	}

}
