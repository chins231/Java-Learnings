package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Chinnu");
		map.put(2, "SRT");
		map.put(3, "Chinnu");
		map.put(4, "SRT");
		Map<Integer, String> map1=map.entrySet().stream().filter(map2->map2.getKey().intValue()>=2).collect(Collectors.toMap(map2->map2.getKey(), map2->map2.getValue()));
		System.out.println(map1);
		
		Map<Integer, String> map3=map.entrySet().stream().
				                  filter(map2->"Chinnu".equals(map2.getValue())).
				                  collect(Collectors.toMap(map2->map2.getKey(), map2->map2.getValue()));
		System.out.println(map3);

	}

}
