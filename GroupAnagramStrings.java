package project1;

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

	public static void main(String[] args) {
		String[] strs = {"eat","ate","tea","bat","tab","apple"};
		List<List<String>> result = groupAnagram(strs);
		result.forEach(t -> System.out.println(t));
		
		
	}

}
