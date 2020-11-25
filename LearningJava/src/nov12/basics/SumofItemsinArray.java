package nov12.basics;

public class SumofItemsinArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,1,2,3,10,10,9};
		int arr1[]= {1,2,3,4,1,2,3,10,10,9};
		int num=10;
		
		for (int i=0;i<arr.length;i++)
		{
			if(num-arr[i]>0)
			{
				for (int j=0;j<arr1.length;j++)
				{
					if((num-arr[i])==arr1[j])
					{
						System.out.println(arr[i]+" "+arr[j]);
						break;
					}
				}
			}
		}
		
	}

}
