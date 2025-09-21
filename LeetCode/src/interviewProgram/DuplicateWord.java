package interviewProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class DuplicateWord {

	 public static void main(String[] args) {
	        String words = "Bye Goodbye bye Bye world world world";
	        
	        String [] words1= words.split(" ");
	        
	        Set <String> seen = new LinkedHashSet<>();
	        List <String> result = new ArrayList<>();
	        
	        for(String str : words1)
	        {
	        	String lower = str.toLowerCase();
	        	if(!seen.contains(lower))
	        	{
	        		seen.add(lower);
	        		result.add(str);
	        	}
	        }
	        
	        System.out.println(String.join(" ", result));
	    }
}
