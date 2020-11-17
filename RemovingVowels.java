package project1;
/**
 * As usual, you need to think about what you are asked to do and what you are given. You are given a string. You need to remove the vowels from the string.
This problem defines a vowel as : 'a', 'e', 'i', 'o', 'u'.

 */
import java.util.HashSet;
import java.util.Set;

public class RemovingVowels {
	public static String removeVowels(String s) {
		Set<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');

		StringBuilder result = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (!vowels.contains(c)) {
				result.append(c);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String s = "A good fiEld plAcement";
		System.out.println(removeVowels(s));

	}

}
