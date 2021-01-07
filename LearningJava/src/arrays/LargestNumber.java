package arrays;

public class LargestNumber {

	public static void main(String[] args) {
		int [] arr= {1000,10,1020,5,30,55,1,55};
		int smallest;
		int largest=smallest =arr[0];
		
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]>largest)
			{
				largest =arr[i];
			}
			else if  (arr[i]<smallest)
			{
				smallest =arr[i];
			}
			else
			{
				System.out.println("Identical number");
			}
		}
		System.out.println(largest);
		System.out.println(smallest);

	}

}
