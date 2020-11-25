package nov12.basics;

import java.util.HashSet;
import java.util.Set;

import DataStructures.Hashset;

public class ArrayDup {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,1,2,3,10,10,9};
//		for (int i=0;i<arr.length;i++)
//		{
//			for (int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					System.out.println(arr[i]);
//					break;
//				}
//			}
//		}
		
		
		Set<Integer> set=new HashSet<Integer>();
		for (int n: arr)
		{
			if(!set.add(n))
			{
				System.out.println(n);
			}
		}

	}

}
