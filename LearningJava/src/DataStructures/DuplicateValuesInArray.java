package DataStructures;

public class DuplicateValuesInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 4, 5, 6, 7, 1, 2, 3, 4 };
	
		for (int i : arr) {
			     //System.out.println(i);
				for (int j=1;j<arr.length;j++)
				{
					//System.out.println(arr[j]);
					if (i==arr[j])
					{
						
						System.out.println("Matching Element"+i);
					    break;
					}
					
				}
				
			}
		}

	}


