package project2;

import java.util.Arrays;

public class Anagram {
	public static boolean isAnagram(String str1, String str2) {
		int st1Len = str1.length();
		int st2Len = str2.length();
		if (st1Len != st2Len)
			return false;
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
