package InterviewQuestions.SearchAlgo;

import java.util.Scanner;

public class LinearSearch2 {

	public static void main(String[] args) {
		System.out.println("Enter length of array :");
		 int  len=new Scanner(System.in).nextInt();
		 int[] array= new int[len];
		 for(int i=0;i<len;i++)
		 {
			 System.out.println("Enter element at"+ i+"  pos of array :");
			 array[i]=new Scanner(System.in).nextInt();
		 }
		 
		 System.out.println("Enter number to search in array:");
		 int  searchNum=new Scanner(System.in).nextInt();
		   linearSearch(array,searchNum);
	}
	static void linearSearch(int arr[],int searchNum)
	{
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]==searchNum)
			{
				System.out.println("Search number found at "+i+" position ");
				break;
			}
			
		}
		System.out.println("Search number not found... ");
	}
	
	

}
