package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LineSearch {

	public static void main(String[] args) {
		

		try {
			System.out.println("Enter number of elements in array");
			int n = new Scanner(System.in).nextInt();
			if (n > 0)

			{
				int[] arr = new int[n];
				for (int i = 0; i <=arr.length - 1; i++) {
					System.out.println("Enter element in array:");
					arr[i] = new Scanner(System.in).nextInt();

				}
				System.out.println(Arrays.toString(arr));
				System.out.println("Enter element to search:");
				int num = new Scanner(System.in).nextInt();
				int pos = lin_search(num, arr);
				if (pos >= 0)
					System.out.println("Element " + num + " found at " + pos);
				else
					System.out.println("Element not found ");
			}

			else {
				System.out.println("Enter  number >0");
			}
		} catch (Exception e) {
			System.out.println("Input valid number");
		}

	}

	static int lin_search(int num, int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (num == arr[i]) {
				return i;

			}

		}
		return -1;
	}

}
