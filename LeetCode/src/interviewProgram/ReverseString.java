package interviewProgram;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str = "hello";
       String rev ="";
       for(int i=0;i<str.length();i++)
       {
    	   rev = str.charAt(i)+rev;
       }
       System.out.println(rev);
	}

}
