package nov12.basics;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,1,2,3,10,10,9,40,50};
		int arr1[]= {100,10,20,40,50,3};
		int arr2[]= {40,50,60,300,3};
		
		Set <Integer> set1=new HashSet<Integer>();
		Set <Integer> set2=new HashSet<Integer>();
		Set <Integer> set3=new HashSet<Integer>();
		
		for(int n:arr)
		{
			set1.add(n);
		}
		System.out.println(set1);
		for(int n:arr1)
		{
			set2.add(n);
		}
		System.out.println(set2);
		for(int n:arr2)
		{
			set3.add(n);
		}
		System.out.println(set3);
		set1.retainAll(set2);
		set1.retainAll(set3);
		System.out.println(set1);
	}

}
