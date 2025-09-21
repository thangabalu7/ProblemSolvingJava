package interviewProgram;

import java.util.Scanner;

class Solution{

	//sample input
//	000.12.12.034
//	121.234.12.12
//	23.45.12.56
//	Regex Part	Meaning
//	25[0-5]	Matches 250 to 255
//	2[0-4]\d	Matches 200 to 249
//	1\d\d	Matches 100 to 199
//	0\d\d	Matches 000 to 099
//	\d\d	Matches 10 to 99
//	\d	Matches 0 to 9
//	\\.	A literal dot .
//	^ and $	Anchors for start and end of string
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{
        String pattern = 
        "^(25[0-5]|2[0-4]\\d|1\\d\\d|0\\d\\d|\\d\\d|\\d)\\."
      + "(25[0-5]|2[0-4]\\d|1\\d\\d|0\\d\\d|\\d\\d|\\d)\\."
      + "(25[0-5]|2[0-4]\\d|1\\d\\d|0\\d\\d|\\d\\d|\\d)\\."
      + "(25[0-5]|2[0-4]\\d|1\\d\\d|0\\d\\d|\\d\\d|\\d)$";
}
