package InterviewQuestions.SearchAlgo;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("Enter length of array :");
		int len = new Scanner(System.in).nextInt();
		int[] array = new int[len];
		for (int i = 0; i < len; i++) {
			System.out.println("Enter element at" + i + "  pos of array :");
			array[i] = new Scanner(System.in).nextInt();
		}

		System.out.println("Enter number to search in array:");
		int searchNum = new Scanner(System.in).nextInt();
		binarySearch(array, searchNum);
	}
	static void binarySearch(int[] arr,int num)
	{
		int beg=0;
		int end=arr.length;
		while (beg<=end)
		{
			int mid =  (end - beg) / 2; 
			if(arr[mid]==num)
			{
				System.out.println("Num found at "+mid);
				break;
			}
			if (arr[mid] < num) 
               beg =mid+1;
			else
				System.out.println();
		}
		System.out.println("Num not found");
	}

}

