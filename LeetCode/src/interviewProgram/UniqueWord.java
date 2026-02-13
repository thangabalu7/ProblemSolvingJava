package interviewProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UniqueWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String sentence = "Java is easy and Java , 20 is powerful".toLowerCase();
		
		 sentence = sentence.replaceAll("[^"
		 		+ "a-zA-Z,0-9]", " ");
		String[]word= sentence.split(" ");
		Map<String,Integer> maps = new HashMap<>();
		for(String words : word)
		{
			
			maps.put(words, maps.getOrDefault(words,0)+1);
		}
		for(Map.Entry<String, Integer> entrys : maps.entrySet())
		{
			if(entrys.getValue()==1)
			{
				System.out.println(entrys.getKey());
			}
		}
	}

}
