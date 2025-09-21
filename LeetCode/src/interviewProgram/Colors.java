package interviewProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str ="blue,blue,blue,blue,red,red,red, green, yellow,yellow,yellow, yellow, yellow".split(",");
		Map <String ,Integer> maps = new HashMap<>();

		
		for(String scr : str)
		{
			maps.put(scr, maps.getOrDefault(scr,0)+1);
		}
		for(Map.Entry<String, Integer> entrys : maps.entrySet())
		{
			if(entrys.getValue()==4)
			{
				System.out.println(entrys.getKey());
				break;
			}
		}
		System.out.println(maps);
		

	}

}
