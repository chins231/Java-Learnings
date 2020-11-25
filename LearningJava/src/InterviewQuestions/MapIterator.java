package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class MapIterator {

	public static void main(String[] args) {
		Map<Integer,String> map =new HashMap<Integer,String> ();
		map.put(1, "SRT");
		map.put(2, "Chinnu");
		map.put(3, "Ranga");
		map.put(4, "Sri");
		map.put(5, "Chins231");
		System.out.println(map);
		for(Map.Entry<Integer, String>entry : map.entrySet())
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		map.forEach((k,v)->System.out.println("Key = "+k+" Value= "+v));
		

	}

}
