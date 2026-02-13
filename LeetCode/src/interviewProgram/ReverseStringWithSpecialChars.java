package interviewProgram;

public class ReverseStringWithSpecialChars {
	
	public static void main(String[] args) {
	    String s = "h,e,l,lo,hi@";
	    char[] arr = s.toCharArray();
	    String letters =  "";

	    // Step 1: collect only letters/digits
	    for (char ch : arr) {
	        if (Character.isLetterOrDigit(ch)) {
	            letters = ch+letters;
	        }
	    }

	    // Step 2: reverse them
	// System.out.println(letters);

	    // Step 3: rebuild keeping specials in place
	    int idx = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if (Character.isLetterOrDigit(arr[i])) {
	            arr[i] = letters.charAt(idx++);
	        }
	    }

	    System.out.println(new String(arr));
	}


}
