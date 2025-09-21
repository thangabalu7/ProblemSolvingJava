package interviewProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharacter {

	public static void main(String[] args) {
		String word = "Culture".toLowerCase().trim();
		char[] character = word.toCharArray();
		LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();

		// Count characters
		for (char ch : character) {
			if (Character.isLetter(ch)) {
				charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
			}
		}

		System.out.println("Character counts: " + charCount);

		// Convert to list of entries for sorting
		List<Map.Entry<Character, Integer>> entries = new ArrayList<>(charCount.entrySet());

		System.out.println("Sorted character frequencies:");
		for (Map.Entry<Character, Integer> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("Characters with count = 1:");
		// Now iterate over sorted entries to print chars with count 1
		for (Map.Entry<Character, Integer> entry : entries) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}

}
