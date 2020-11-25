package strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class NoOfWords_HM {

	public static void main(String[] args) {
		System.out.println("Enter a String  :");
		 String str=new Scanner(System.in).nextLine();
		 String [] split=str.split("");
		 Map <String,Integer> map =new HashMap<String, Integer> ();
		for (int i=0;i<split.length;i++)
		 {
			 if (map.containsKey(split[i]))
			 {
				 
				 int mapCount=map.get(split[i]);
				 map.put(split[i],mapCount+1);
			 }
			 else
			 {
				 map.put(split[i],1);
			 }
		 }
		System.out.println(map);
		
		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext())
		{
			Map.Entry me = (Map.Entry) itr.next();
			
			System.out.println("Key is " + me.getKey() + " Value is " + me.getValue());
		}
		 

	}

}
