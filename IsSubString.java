package project1;

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
		// TODO Auto-generated method stub
		String str1 = "XYZ";
		String str2 = "ABXYZC";
		System.out.println(isSubString(str1, str2));
	}

}
