package DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Enter size of the array:");
		 int arrSize=new Scanner (System.in).nextInt();
		  int []arr= new int[arrSize];
		for (int i=0;i<arrSize;i++)
		{
			System.out.println("Enter Array elements  (INteger Value):");
			
			arr[i]=new Scanner (System.in).nextInt();
			
		}
		for (int k=0;k<arr.length;k++)
		{
			System.out.println("Array before sorted is :"+arr[k]);
		}
		
		for (int i=0;i<arr.length-1;i++)
		{
			for (int j=0;j<arr.length-1;j++)
			{
				    
			
			if(arr[j]>arr[j+1])
			{
				arr[j]=arr[j]+arr[j+1];
				arr[j+1]=arr[j]-arr[j+1];
				arr[j]=arr[j]-arr[j+1];
			}
			}
		}
		
			System.out.println("Array after  sorted is :"+Arrays.toString(arr));
		
		
	}
	
	

}
