package strings;

import java.util.HashSet;
import java.util.Set;

public class Anagrams2 {

	public static void main(String[] args) {
		String Str="atesta";
		String str1="testae";
		int count=0;
		
		Set<Character>set=new HashSet<Character>();
		for (char ch: Str.toCharArray())
		{
			set.add(ch);
			
		}
		for (char ch: str1.toCharArray())
		{
			if (set.add(ch))
				count++;
		}
		if(count>0)
			System.out.println("Not Anagrams");
		else
			System.out.println("Anagrams");
		

	}

}
