package InterviewQuestions;

import java.util.HashMap;
import java.util.stream.Collectors;

public class HashMapDuplicateelements {

	public static void main(String[] args) {
		int[] arr1= {1,2,2,5,4,5,6,7,8,8,9,9,9,9,8,8};
		HashMap<Integer,Integer> hm=new HashMap<>();
		for (int i=0;i<arr1.length;i++)
		{
			if (hm.containsKey(arr1[i]))
			{
				hm.put(arr1[i], hm.get(arr1[i])+1);
			}
			else
			{
				hm.put(arr1[i], 1);
			}
		}
			System.out.println(hm);
			System.out.println(hm.entrySet().stream().filter(map1->map1.getValue()>2).collect(Collectors.toMap(map1->map1.getKey(), map1->map1.getValue())));
			System.out.println(hm.entrySet().stream().filter(map->map.getValue()>1).collect(Collectors.toMap(map2->map2.getKey(),map2->map2.getValue())));

	}

}
