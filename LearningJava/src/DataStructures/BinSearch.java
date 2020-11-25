package DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class BinSearch {

	public static void main(String[] args) {
		System.out.println("Enter size of the array:");
		 int arrSize=new Scanner (System.in).nextInt();
		  int []arr= new int[arrSize];
		for (int i=0;i<arrSize;i++)
		{
			System.out.println("Enter Array elements  (INteger Value):");
			arr[i]= new Scanner (System.in).nextInt();
			
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		BinarySearchClass bs= new BinarySearchClass();
		System.out.println("Enter element to search");
		int num=new Scanner (System.in).nextInt();
		
		int index=bs.BinarySearchClass(arr, 0, arr.length-1, num);
		if (index==-1)
		{
			System.out.println("Element not found");
			
		}
		else
		{
			System.out.println("Element found at "+index);
		}

	}

}
