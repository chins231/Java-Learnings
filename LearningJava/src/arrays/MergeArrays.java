package arrays;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		int [] arr1= {1,2,310,9,8};
		int [] arr2= {34,19,3,17,90,10};
		int [] arr3= new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		while (i<arr1.length && j<arr2.length)
		{
			if (arr1[i]>arr2[j])
			{
				arr3[k]=arr2[j];
				j++;k++;
			}
			else
			{
				arr3[k]=arr1[i];
				i++;k++;
			}
		}
		while (i<arr1.length)
		{
			arr3[k]=arr1[i];
			i++;k++;
		}
		while (j<arr2.length)
		{
			arr3[k]=arr2[j];
			j++;k++;
		}
		System.out.println(Arrays.toString(arr3));
	}

}
