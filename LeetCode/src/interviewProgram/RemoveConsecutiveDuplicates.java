package interviewProgram;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import java.util.Stack;

public class RemoveConsecutiveDuplicates {

    public static void removeConsecutive(String s) {
     char [] a= s.toCharArray();
     String unique="";
     
     for(int i=1;i<s.length()-1;i++)
     {
    	 if(a[i]!=a[i-1]&& a[i]!=a[i+1])
    	 {
    		 unique +=a[i];
    		 
    	 }
    	if(i==a.length-2)
    	{
    		if(a[i] != a[a.length-1])
    		{
    			unique += a[a.length-1];
    		}
    	}
    	 
    	 
     }
     System.out.println(unique);

    }

    public static void main(String[] args) {
    	//removeConsecutive("aabbbc");
            removeConsecutive("aabbbc");      // c
            removeConsecutive("abbaca");      // ca
   //     removeConsecutive("aabbbcabcbb"); // cabc
    //   removeConsecutive("azxxzy");      // ay
//        System.out.println(removeConsecutive("aaaa"));        // (empty string)
    }
}