package arrays;

import java.util.HashSet;
import java.util.Set;

public class Dupchars {

	public static void main(String[] args) {
		String str= "This is repeeeetead word this is non repeated word chinnu , hope your are doing good ?chinnu welcome to new company welcome welcome";
		Set<Character> strSet=new HashSet<Character>();
		Set<Character> dupSet=new HashSet<Character>();
		for (char ch: str.toCharArray())
		{
			if (!strSet.add(ch))
			{
				dupSet.add(ch);
			}
		}
		System.out.println(strSet);
		System.out.println(dupSet);
	}

}
