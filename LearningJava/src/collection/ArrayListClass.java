package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {
		int list=0;
		ArrayList<Integer> aList= new ArrayList<Integer>();
		System.out.println("Enter number of elements to enter");
		int num=new Scanner (System.in).nextInt();
		for (int i=0;i<num;i++)
		{
			System.out.println("Enter number at "+i);
			list=new Scanner (System.in).nextInt();
			aList.add(list);
		}
		System.out.println("Array Liost created is :"+aList);
		Collections.sort(aList);   
		System.out.println("Array Liost Sorted is :"+aList);

		Iterator aListItr=aList.iterator();
		while(aListItr.hasNext())
		{
			System.out.println(aListItr.next());
			
		}
		
	}

}
