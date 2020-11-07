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

	public static void main(String[] args) {
		String[] input = { "apple", "apply", "dog", "cog", "cod", "romi" };
		List<List<String>> res = isomorphic(input);
		System.out.println(res);

	}

}
