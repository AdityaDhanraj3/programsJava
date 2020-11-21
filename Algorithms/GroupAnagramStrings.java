package project1;
/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 typically using all the original letters exactly once.
Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramStrings {
	public static List<List<String>> groupAnagram(String[] strs){
		List<List<String>> result = new ArrayList<>();
		Map<String,List<String>> map = new HashMap<>();
		for(String str : strs) {
			char[] chArr = str.toCharArray();
			Arrays.sort(chArr);
			String key = new String(chArr);
			if(map.containsKey(key)) {
				map.get(key).add(str);
				
			}else {
				List<String> list = new ArrayList<>();
				list.add(str);
				map.put(key, list);
				
				
			}
			}
		result.addAll(map.values());
		return result;
	}
	/**
 * pseudo code: Given two strings to check anagrams
               two strings are said to be anagrams if total no. of characters in each string are same
               and form different words

              check for two given  strings length.if equal proceed,else return false.
              convert the strings to charArrays,then sort both charArrays.
              loop through each character and check whether both are same.
              if any character is not same return false
              return true if all character matches.

	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean anagramCheck(String str1,String str2) {
		char[] charArrayFromStr1 = str1.toCharArray();
		char[] charArrayFromStr2 = str2.toCharArray();
	    	Arrays.sort(charArrayFromStr1);
	    	Arrays.sort(charArrayFromStr2);
	    	return Arrays.equals(charArrayFromStr1, charArrayFromStr2);

	}

	public static void main(String[] args) {
		String[] strs = {"eat","ate","tea","bat","tab","apple"};
		List<List<String>> result = groupAnagram(strs);
		result.forEach(t -> System.out.println(t));
		String str1 = "listen";
		String str2 = "silent";
		System.out.println("both strings are anagrams "+anagramCheck(str1,str2));
		
		
	}

}
