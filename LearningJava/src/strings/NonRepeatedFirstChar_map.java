package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class NonRepeatedFirstChar_map {

	public static void main(String[] args) {
		String str= "This is repetead word this is non repeated word chinnu , hTope your, ? are doing good ?chinnu welcome to new company welcome welcomez";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for (char ch: str.toCharArray())
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else
			{
				map.put(ch, map.get(ch)+1);
			}
		}
		System.out.println(map);
		
		for(Entry<Character, Integer> map1:map.entrySet())
		{
			if (map1.getValue()==1)
			{
				System.out.println(map1.getKey());
				break;
			}
		}
		


	}

}
