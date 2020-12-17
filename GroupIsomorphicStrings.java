package project1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupIsomorphicStrings {
	public static List<List<String>> isomorphic(String[] input) {
		HashMap<String, List<String>> map = new HashMap<>();
		List<List<String>> res = new ArrayList<>();
		for (String word : input) {
			String key = getKey(word);
			System.out.println(word + " " + key);
			List group = map.getOrDefault(key, new ArrayList<>());
			group.add(word);
			map.put(key, group);

		}
		for (List<String> list : map.values()) {
			res.add(list);

		}
		return res;
	}

	public static String getKey(String word) {
		int[] m1 = new int[256];
		for (int i = 0; i < word.length(); i++) {
			m1[word.charAt(i)] = i + 1;

		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			sb.append(m1[word.charAt(i)]);
		}
		return sb.toString();
	}
	/**
	 * Given two strings s and t, determine if they are isomorphic.

	Two strings are isomorphic if the characters in s can be replaced to get t.

	All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

	Example 1:

	Input: s = "egg", t = "add"
	Output: true
	Example 2:

	Input: s = "foo", t = "bar"
	Output: false
	 * @author adity
	 *
	 */
	
		public static boolean isIsomorphic(String str1, String str2) {
			int len = str1.length();
			if (len == 0)
				return true;
			int[] recordStr1 = new int[256];
			int[] recordStr2 = new int[256];
			int label = 1;
			for (int i = 0; i < len; i++) {
				int charStr1 = str1.charAt(i);
				int charStr2 = str2.charAt(i);
				if (recordStr1[charStr1] != recordStr2[charStr2]) {
					return false;
				}
				if (recordStr1[charStr1] == 0) {
					recordStr1[charStr1] = label;
					recordStr2[charStr2] = label;
					label++;
				}
			}
			return true;
		}

	

	public static void main(String[] args) {
		String[] input = { "apple", "apply", "dog", "cog", "cod", "romi" };
		List<List<String>> res = isomorphic(input);
		System.out.println(res);
		System.out.println();
		System.out.println( "two strings are isomorphic :"+isIsomorphic("XXZ", "AAC"));

	}

}

OUTPUT:
apply 13345
dog 123
cog 123
cod 123
romi 1234
[[dog, cog, cod], [romi], [apple, apply]]

two strings are isomorphic :true

