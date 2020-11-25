package DataStructures;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int [] arr = {2,10,6,9,16,34};
		int num=16;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int pos=binarySearch(arr,0,arr.length-1,160);
		if(pos>=0)
		{
			System.out.println("Element found at "+pos );
		}
		else
		{
			System.out.println("Element not found");
		}

	}
	public static int binarySearch(int[] arr,int first, int last, int num)
	{
		int beg=first;
		int end=last;
		int mid=(beg+end)/2;
	  while (beg<=end)
	  {
		  
	 
		if (arr[mid]==num)
		{
			return mid; 
		}
		else if(arr[mid]<num)
		{
			beg=mid+1;
			
		}
		else
		{
			end=mid-1;
			
		}
		mid=(beg+end)/2;
	  }
	  
	  return -1;
		
		
	}

}
