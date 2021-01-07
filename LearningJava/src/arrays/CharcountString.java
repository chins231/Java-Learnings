package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharcountString {

	public static void main(String[] args) {
		String str= "This is repetead word this is non repeated word chinnu , hope your are doing good ?chinnu welcome to new company welcome welcome";
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for (char ch: str.toCharArray())
		{
			if(!map.containsKey(ch))
			{
				if(ch!=' ')
				 map.put(ch, 1);
			}
			else
			{  
				if(ch!=' ')
				 map.put(ch, map.get(ch)+1);
			}
		}
		System.out.println(map);
		System.out.println(map.entrySet().
				                         stream()
				                         .filter(map1->map1.getValue()>2)
				                                                         .collect(Collectors.toMap(map1->map1.getKey(), map1->map1.getValue())));
	}

}
