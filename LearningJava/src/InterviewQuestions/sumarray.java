package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sumarray {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		int[] arr1=new int[] {2,3,4,5,2};
		int sum =7;
		System.out.println(arr.length);
		System.out.println(Arrays.toString(getSum( arr1,sum)));
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<=arr.length-1;j++)
			{
				if (arr[i]+arr [j]==sum)
				
				{
					System.out.println(arr[i]+arr [j]);System.out.println(arr[i]);System.out.println(arr[j]);
					System.out.println("found at:"+i +(j) );
				}
			}
		}
		}
		public static int[] getSum(int[] arrays, int target){
			Map<Integer, Integer> visitedArray=new HashMap<Integer,Integer> ();
			for (int i=0;i<arrays.length;i++)
			{
				
			int delta =target-arrays[i];
			System.out.println(delta);
			if(visitedArray.containsKey(delta)) {
				return new int[] {i,visitedArray.get(delta)};
			}
			visitedArray.put(arrays[i],i);
			
			
		   }
			return new int[] {-1,-1};
		

	}

}
