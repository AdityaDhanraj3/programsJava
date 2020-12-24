package project1;

public class IsomorphicString {
	public static boolean isIsomorphic(String str1,String str2) {
		int len = str1.length();
		if(len == 0)
			return true;
		int[] recordStr1 = new int[256];
		int[] recordStr2 = new int[256];
		int label = 1;
		for(int i=0;i<len;i++) {
			int charStr1 = str1.charAt(i);
			int charStr2 = str2.charAt(i);
if(recordStr1[charStr1]!=recordStr2[charStr2]) {
	return false;
}
if(recordStr1[charStr1] == 0) {
	recordStr1[charStr1] = label;
	recordStr2[charStr2] = label;
	label++;
}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isIsomorphic("XXZ","AAC"));
	}

}

OUTPUT:
true
