package InterviewQuestions.SearchAlgo;

import java.util.Scanner;

public class LinearSearch {

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
		linearSearch(array, searchNum);
	}

	static void linearSearch(int arr[], int searchNum) {
		int pos = -1;
		int beg = 0;
		int len = arr.length;
		int end = len - 1;
		for (beg = 0; beg <= end;) {
			if (arr[beg] == searchNum) {
				pos = beg;
				System.out
						.println("Element found in Array at " + (pos + 1) + " Position with " + (beg + 1) + " Attempt");
				break;
			}

			if (arr[end] == searchNum) {
				pos = end;
				System.out.println(
						"Element found in Array at " + (pos + 1) + " Position with " + (len - end) + " Attempt");
				break;
			}
		
		beg++;
		end--;
		}

	if(pos==-1)System.out.println("Not found in Array with "+end+" Attempt");

}
}
	