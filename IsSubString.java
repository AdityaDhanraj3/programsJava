package project1;
/**
 * Given two strings s and t, return the minimum window in s which will contain all the characters in t. 
 * If there is no such window in s that covers all characters in t, return the empty string "".

Note that If there is such a window, it is guaranteed that there will always be only one unique minimum window in s.
Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BAC"
 * @author adity
 *
 */
public class IsSubString {
	public static int isSubString(String str1, String str2) {
		int m = str1.length();
		int n = str2.length(); // 'n' is greater than 'm'.
		for (int i = 0; i < n - m; i++) {
			int j;
			for (j = 0; j < m; j++) {
				if (str2.charAt(i + j) != str1.charAt(j)) {
					break;
				}
			}
			if (j == m) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String str1 = "XYZ";
		String str2 = "ABXYZC";
		System.out.println(isSubString(str1, str2));
	}

}
