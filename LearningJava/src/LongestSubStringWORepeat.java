import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWORepeat {

	public static void main(String[] args) {
		String str="ababcbacadefegdehijhklij";
		String Longest ="";
		int length=0;
		
		Map<Character, Integer> map= new HashMap<Character,Integer>();
		char [] arr=str.toCharArray();
		for (int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], i);
			}
			else
			{
				i=map.get(arr[i]);
				map.clear();
			}
			if(map.size()>length)
			{
				length=map.size();
				Longest=map.keySet().toString();
			}
			
		}
		System.out.println(length);
		System.out.println(Longest);
		
		

	}

}
