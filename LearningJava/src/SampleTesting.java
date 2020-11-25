import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SampleTesting {

	public static void main(String[] args) {
		String s = "ababcbacadefegdehijhklij";
		List <String> list =new ArrayList<String>();
		String[] b = s.split("(?<=(.))(?!\\1)");
		System.out.println(Arrays.toString(b));
		//String regex = "(?<=(.))(?!\\1)";
//		String s="aaaabbbccccaaddddcfggghhhh";
//		String regex="(?<=(.))(?!\\1)";
//		String[] b = s.split("(?<=(.))(?!\\1)");
//		System.out.println(Arrays.toString(b));
//		
//		
//		String   str = "aaaabbbccccaaddddcfggghhhh";
//		String[] out = str.split("(?<=(.))(?!\\1)");
//
//		System.out.println(Arrays.toString(out));
		
//		Map <String, Integer>map =new HashMap<String,Integer> ();
//		for (int i=0;i<s.length();i++)
//		{
//			if(!map.containsKey(s.charAt(i)))
//				map.put((s.charAt(i)),map.get(s.charAt(i)));
//			  
//		}
//		System.out.println(map);
		for (int i=0;i<b.length;i++)
		{
			int j=s.lastIndexOf(b[i]);
			int k=s.indexOf(b[i]);
			if (k<i)
			{
				String s2=s.substring(k, j+1);
				System.out.println(s2);
				for (String s3: list)
				{
					if(s3.contains(s2)) {
						String s4=s.substring(k, j+1);
						System.out.println(s4);
					    list.remove(s3);
					    list.add(s4);
						System.out.println(s3);
				}
			}}
			System.out.println(j);
//			list.add(b[i]);
//			System.out.println(list);
			String s1=s.substring(i, j+1);
			i=j;
			
			
			System.out.println(s1);
			list.add(s1);
			System.out.println(list);
			
			
		}
		
		
		
		
	}

}
	
