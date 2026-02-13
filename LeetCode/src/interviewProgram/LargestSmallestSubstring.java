package interviewProgram;

public class LargestSmallestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSmallestAndLargest("welcometojava", 3));

	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = s.substring(0, k);
		String Largest = s.substring(0, k);

		for (int i = 1; i <= s.length() - k; i++) {
			String sub = s.substring(i, i + k);
			if (sub.compareTo(smallest) < 0) {
				smallest = sub;
			}
			if (sub.compareTo(Largest) > 0) {
				Largest = sub;
			}
		}
		return smallest + "\n" + Largest;
        
	}
}
