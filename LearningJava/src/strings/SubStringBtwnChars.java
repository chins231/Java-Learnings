package strings;

import java.util.Map;
import java.util.TreeMap;


public class SubStringBtwnChars {

	public static void main(String[] args) {
		
		String str="iamrajeshkumar";
		//String str="atest";
		//String str="abca";
		
	
		
		String str1="a";//assuming we will be provided value which has multiple occurances
		
		Map<String,Integer> map=new TreeMap<String,Integer>(); //choosen treemap for sorting purpose
		int index = str.indexOf(str1);//finding first occurance
		while (index >= 0) {
			
		    System.out.println(index);

		    int oldindex=index;
		   
		    index = str.indexOf(str1, index + 1);
		    if(index>=0)//if occurance is true then only we will add to map
		    {
		    
		    map.put(str.substring(oldindex+1, index), str.substring(oldindex, index).length()); //adding to map string as key and its length as value 
		    }
		    
		}
		
		Map.Entry<String, Integer> entry = map.entrySet().iterator().next();//iterating over the map since its TreeMap First one would be max length
		
		String key= entry.getKey();
		Integer value=entry.getValue();
		System.out.println(entry.getKey());//printing out the max length string
		
		}
}
