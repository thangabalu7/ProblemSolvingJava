package esay;

import java.util.Arrays;

public class fourtheen {
	
	public static void main(String[] args) {
		String [] strs = {"flower","flow","flight"};
		String value =longestCommonPrefix(strs);
		System.out.println("i am executing "+value);
	}
	public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[1];
         System.out.println(prefix);
         
        for (int i = 1; i < strs.length; i++) {
        	System.out.println(strs[i].indexOf(prefix));
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.println(prefix);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

	 

}
