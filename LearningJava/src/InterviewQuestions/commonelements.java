package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class commonelements {

	public static void main(String[] args) {
		System.out.println("Enter size of the array:");
		 int arrSize=new Scanner (System.in).nextInt();
		  int []arr= new int[arrSize];
		for (int i=0;i<arrSize;i++)
		{
			System.out.println("Enter Array elements  (INteger Value):");
			
			arr[i]=new Scanner (System.in).nextInt();
			
		}
		for (int j=0;j<arr.length;j++)
		{
			System.out.println("Array Entered is :"+arr[j]);
		}
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		int[] op=Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(op));

	}

}
