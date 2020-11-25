package DataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Hashset {

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
		HashSet<String> hset = new HashSet<String>();
		
		
		}

	}

