package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinSearch {

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
			int pos = bin_search(num, arr);
			if (pos >= 0)
				System.out.println("Element " + num + " found at " + pos);
			else
				System.out.println("Element not found ");
		}

	}

	static int bin_search(int num, int[] arr) {
		System.out.println("Bin Search");
		int min = 0, max = arr.length - 1;
		int mid = (min + max) / 2;
		while (min < max) {

			if (num > arr[mid]) {
				min = mid + 1;
			} else if (num < arr[mid]) {
				max = mid - 1;
			} else {
				return mid;
			}
			mid = (min + max) / 2;
		}
		return -1;
	}
}
