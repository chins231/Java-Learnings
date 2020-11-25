package DataStructures;

public class SortArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 4, 5, 6, 7, 1, 2, 3, 13 };
		int temp=0;
		for (int i=0;i<arr.length;i++)
		{
			 for (int j = i+1; j < arr.length; j++) {   
				 if (arr[i]>arr[j])  //(arr[i]<arr[j]) for descendingß
				 {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
			
		}
		 System.out.println("Elements of array sorted in descending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }    

	}

}
