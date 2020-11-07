package project1;

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
