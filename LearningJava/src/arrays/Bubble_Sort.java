package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {
	public static void main(String[] args) {

	System.out.println("Enter number of elements in array");
	int n = new Scanner(System.in).nextInt();
	if (n > 0)

	{
		int[] arr = new int[n];
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter element in array:");
			arr[i] = new Scanner(System.in).nextInt();

		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter element to search:");
		int num = new Scanner(System.in).nextInt();
		int pos[] = bubbl_sort(num, arr);
		System.out.println(Arrays.toString(pos));
}
	}
	
	static int[] bubbl_sort(int num, int [] arr)
	{
		for (int i=0;i<=arr.length-1;i++)
		{
			for (int j=i+1;j<=arr.length-1;j++)
			{
				if (arr[i]>arr[j])
				{
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		return arr;
	}
}
