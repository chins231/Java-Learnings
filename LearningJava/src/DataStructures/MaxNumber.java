package DataStructures;

public class MaxNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 4, 5, 6, 7, 1, 45, 3, 13 };
		int max =arr[0];
		int temp=0;
		for (int i=0;i<arr.length;i++)
		{
			if(max<arr[i]) {
				temp=max;
				max=arr[i];}
			    
						
		}
		System.out.println("Largest Value in this array is :"+max);
		System.out.println("Second largest Value in this array is :"+temp);
		
			

	}

}
