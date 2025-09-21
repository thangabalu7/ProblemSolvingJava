package interviewProgram;

import java.util.*;




public class CountFrequencyString {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "interview";
		Map <Character,Integer> maps = new LinkedHashMap<>();
		
		for( char c : str.toCharArray())
		{
			maps.put(c, maps.getOrDefault(c,0)+1);
		}
		
		System.out.println(maps);
	}

}
