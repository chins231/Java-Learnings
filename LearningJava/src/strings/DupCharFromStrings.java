package strings;

import java.util.HashSet;
import java.util.Set;

public class DupCharFromStrings {

	public static void main(String[] args) {
		String str=new String("RanganathRanga");
		Set<Character> set=new HashSet<Character>();
		for (char ch: str.toCharArray())
		{
			if(!set.add(ch))
				System.out.println(ch);
				
		}

	}

}
