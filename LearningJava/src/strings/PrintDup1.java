package strings;

import java.util.HashSet;
import java.util.Set;

import DataStructures.Hashset;

public class PrintDup1 {

	public static void main(String[] args) {
		String str="abcdadsfdfdfdfedfd";
		Set <Character> set=new HashSet<Character>();
		for (int i=0;i<str.length();i++)
		{
			if(!set.add(str.charAt(i)))
					System.out.println(str.charAt(i));
			
		}
		
		
  
	}

}
