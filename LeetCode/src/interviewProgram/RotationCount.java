package interviewProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class RotationCount {
	public static int findRotationCount(ArrayList<Integer> arr) {
        int min = arr.get(0);
        int index = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
                index = i;
            }
        }
        return index; // This is the number of rotations
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 1, 2, 3));
        int rotations = findRotationCount(arr);
        System.out.println("Number of rotations: " + rotations);
    }
}
