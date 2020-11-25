package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Dup_HashMap {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 1, 3, 10, 10, 60, 45, 45, 3 };
		
		Map <Integer, Integer>map=new HashMap<Integer,Integer>();
		for (int i=0;i<arr.length-1;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		
		System.out.println(
				map.entrySet()
				   .stream()
				   .filter(map1->map1.getValue()>=2)
				   .collect(Collectors
				   .toMap(map1->map1.getKey(),map1->map1.getValue()))
				   );;

	}

}
