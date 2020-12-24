package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExamples {
	public static void mapingCount(int arr[]) {
		Map<Integer, Integer> temp = Arrays.stream(arr).boxed().collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
		Map<Integer, Integer> temp1 = temp.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors
				.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		Map<Integer, Integer> temp2 = temp1.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(2).collect(Collectors.toMap(
						Map.Entry::getKey, Map.Entry::getValue, (oldvalue, newvalue) -> oldvalue, LinkedHashMap::new));
		System.out.println(temp);
		System.out.println(temp1);
		System.out.println(temp2);
	}

	public static void creatingNewDistinctSetOfElements(int arr[]) {
		Map<Integer, Integer> map = new HashMap<>();
		Map<Integer, List<Integer>> map1 = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			if (map1.get(map.get(arr[i])) == null) {
				map1.put(map.get(arr[i]), new ArrayList<Integer>());

			}
			map1.get(map.get(arr[i])).add(arr[i]);
		}
		System.out.println("creatingNewDistinctSetOfElements :" + map1);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 3, 3, 3, 1, 4 };
		mapingCount(arr);
		creatingNewDistinctSetOfElements(arr);
	}

}

OUTPUT : 
{1=3, 2=2, 3=4, 4=1}
{4=1, 2=2, 1=3, 3=4}
{3=4, 1=3}
creatingNewDistinctSetOfElements :{1=[1, 2, 3, 4], 2=[1, 2, 3], 3=[3, 1], 4=[3]}

