package interviewProgram;

import java.util.Scanner;

public class SubstringCount {
	
	// Method to count substring occurrences (including overlapping)
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;
        
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
        	//System.out.println(mainStr.indexOf(subStr, index));
        	System.out.println(index);
            count++;
                
            index = index + 1; // Move only one character forward for overlapping
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter main string: ");
        String mainStr = scanner.nextLine();

        System.out.print("Enter substring to search: ");
        String subStr = scanner.nextLine();

        int occurrences = countOccurrences(mainStr, subStr);

        System.out.println("Substring occurs " + occurrences + " times.");
    }

}
