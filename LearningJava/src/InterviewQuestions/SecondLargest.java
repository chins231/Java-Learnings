package InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,2,5,4,5,6,7,8,8,9,9,9,9,8,8};
		Set<Integer> set1 = new HashSet<>(); 
		  
        // Iterate through the array 
        for (int t : arr1) { 
            // Add each element into the set 
            set1.add(t); 
        } 
       Arrays.sort(set1.toArray());
       System.out.println((set1.toArray())[1]);
       
       
        

	}

}
