package arrays;

import java.util.HashSet;
import java.util.Set;

public class DupElementHashSet {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 1, 3, 10, 10, 60, 45, 45, 3 };
		
		Set<Integer> set= new HashSet<Integer> ();
		for (int n: arr)
		{
			if (!set.add(n))
				System.out.println(n+" is a duplicate element");
		}
		System.out.println(set);

	}

}
