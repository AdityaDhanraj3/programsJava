package project1;
/**
 * A string S of lowercase English letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.

 

Example 1:

Input: S = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
 */
import java.util.ArrayList;
import java.util.List;

public class PartitionLabel {
	public static List<Integer> partitionLength(String str){
		List<Integer> partitionIndex = new ArrayList<>();
		int lastIndex[] = new int[26];
		for(int i=0;i<str.length();i++) {
			lastIndex[str.charAt(i)-'a']=i;
		}
		int i=0;
		while(i<str.length()) {
			int end = lastIndex[str.charAt(i)-'a'];
			int j=i;
			while(j!=end) {
				end = Math.max(end, lastIndex[str.charAt(j++)-'a']);
				
			}
			partitionIndex.add(j-i+1);
			i=j+1;
		}
		return partitionIndex;
	}

	public static void main(String[] args) {
		String str = "ababcbacadefegdehijhklij";
		List<Integer> list = partitionLength(str);
      System.out.println(list);
	}

}
