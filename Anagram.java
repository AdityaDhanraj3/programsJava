package project2;
/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.
 */
import java.util.Arrays;

public class Anagram {
	public static boolean isAnagram(String str1, String str2) {
		int st1Len = str1.length();
		int st2Len = str2.length();
		/*
		 * if (st1Len != st2Len) return false;
		 */
		char[] chArr = str1.toCharArray();
		Arrays.sort(chArr);
		System.out.println(chArr);
		char[] chArr2 = str2.toCharArray();
		Arrays.sort(chArr2);
		System.out.println(chArr2);
		for (int i = 0; i < st1Len; i++) {
			if (st1Len != st2Len) {
				return false;
			}
		}
		return true;
	} 

	public static void main(String[] args) {

		System.out.println(isAnagram("listen", "silent"));
	}
}

OUTPUT :    eilnst
            eilnst
            true



