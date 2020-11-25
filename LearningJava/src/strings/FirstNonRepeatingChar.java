package strings;

import java.util.LinkedHashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String str = "nonrepeatingchar";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length() - 1; i++) {
			if (map.containsKey(str.charAt(i))) {
				char c = str.charAt(i);
				System.out.println(c);
				map.put(c, map.get(c) + 1);
			} else {
				map.put(str.charAt(i), 1);

			}
		}
		System.out.println(map);
		System.out.println(map.entrySet()
		.stream()
		.filter(map1->map1.getValue()==1)
		.collect(Collectors.toMap(  map1 -> map1.getKey(), map1 -> map1.getValue() )));

	}

}
