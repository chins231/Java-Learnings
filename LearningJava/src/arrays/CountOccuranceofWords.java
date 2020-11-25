package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccuranceofWords {

	public static void main(String[] args) {
		String str= "This is repetead word this is non repeated word chinnu , hope your are doing good ?chinnu welcome to new company welcome welcome";
		String[] newStr=str.split(" ");
		Map<String,Integer> map=new HashMap<String,Integer>();
		for (String word: newStr)
		{
			if(!map.containsKey(word))
			{
				map.put(word, 1);
			}
			else
			{
				map.put(word, map.get(word)+1);
			}
		}
		System.out.println(map);
		System.out.println(map.entrySet().stream().filter(map1->map1.getValue()>2).collect(Collectors.toMap(map1->map1.getKey(), map1->map1.getValue())));

	}

}
