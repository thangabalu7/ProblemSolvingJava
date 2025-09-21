package interviewProgram;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondHighestFrequency {
	public static void main(String[] args) {
		List<String> colors = Arrays.asList("blue", "blue", "blue", "blue", "red", "red", "red", "green", "yellow",
				"yellow", "yellow", "yellow", "yellow");
		
Map <String , Integer> maps = new HashMap<>();
		
		for(String str : colors)
		{
			maps.put(str,maps.getOrDefault(str,0)+1);
		}
		System.out.println(maps);
		
		List<Map.Entry<String, Integer>> entrys =  new ArrayList<>(maps.entrySet());
		
		Collections.sort(entrys, new Comparator<Map.Entry<String, Integer>>(){
			@Override
			public int compare(Map.Entry<String, Integer> e1 , Map.Entry<String, Integer>e2)
			{
				return e2.getValue().compareTo(e1.getValue());
			}
		});
		
		System.out.println(entrys);
		String second = entrys.get(1).getKey();
		System.out.println(second);

	}

}
